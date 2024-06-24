package com.example.chapter8exercise3.controller;

import com.example.chapter8exercise3.model.Product;
import com.example.chapter8exercise3.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    @PostMapping(path = "/products")
    public String addProcuct(Product p,
                             Model model) {
        productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
}
