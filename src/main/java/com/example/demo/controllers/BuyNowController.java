package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuyNowController {

    private final ProductService productService;

    public BuyNowController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID")int id){
        Product theProduct = productService.findById(id);

       int count = theProduct.getInv();
       if(count == 0) {
       return "redirect:/error";
       }

       count = count - 1;

       theProduct.setInv(count);

       productService.save(theProduct);

       return "buyProduct";
    }
}
