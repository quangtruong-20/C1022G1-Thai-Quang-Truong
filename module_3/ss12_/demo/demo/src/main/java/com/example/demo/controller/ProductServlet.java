package com.example.demo.controller;


import com.example.demo.model.Product;
import com.example.demo.service.IProductService;
import com.example.demo.service.impl.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private final IProductService productService = new ProductService();
//get
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "findByName":
                break;
            case "view":
                break;
            default:
                listProducts(request, response);
                break;
        }

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void listProducts(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.productService.findAll();
        request.setAttribute("products", products);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
//post
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "findByName":
                break;
            default:
                break;
        }

    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {

        int id = (int) (Math.random() * 10000);
        String name = request.getParameter("name");
        String price= request.getParameter("price");
        String detail= request.getParameter("detail");
        String nsx= request.getParameter("nsx");
    Product product = new Product(id,name,price,detail,nsx);
    this.productService.save(product);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/create.jsp");
    request.setAttribute("message","New customer was created");
    try {
        dispatcher.forward(request,response);
    } catch (ServletException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

}
