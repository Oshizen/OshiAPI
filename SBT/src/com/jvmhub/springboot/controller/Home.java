package com.jvmhub.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/testFixedLayout")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/testFluidLayout")
	public String test2() {
		return "test2";
	}
	
	@RequestMapping("/testResponsiveLayout")
	public String test3() {
		return "test3";
	}

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String list(Model model){
        //model.addAttribute("products", productService.listAllProducts());
        System.out.println("Returning rpoducts:");
        return "products";
    }

    @RequestMapping("product/new")
    public String newProduct(Model model){
        //model.addAttribute("product", new Product());
        return "productform";
    }
}
