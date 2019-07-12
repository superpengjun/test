package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView  md = new ModelAndView();

        List<Product> products = productService.findAll();
        md.addObject("productList",products);
        md.setViewName("product_list");
		
		system.out.println("my name is xiaoming.");
		system.out.println("my name is xiaogou.");
		system.out.println("my name is xiaogou.");
		
		
		
        return md;
    }
}
