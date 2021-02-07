package com.project.emarket.web.controller;

import com.project.emarket.domain.dto.PurchaseDTO;
import com.project.emarket.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public ResponseEntity<List<PurchaseDTO>> getAll(){
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<PurchaseDTO>> getByCustomer(@PathVariable("customerId") String customerId){
        return purchaseService.getByCustomer(customerId)
                .map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody PurchaseDTO purchaseDTO){
        return new ResponseEntity<>(purchaseService.save(purchaseDTO), HttpStatus.CREATED);
    }
}
