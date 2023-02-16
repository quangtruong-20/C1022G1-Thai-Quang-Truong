package com.example.casestudy.controller;

import com.example.casestudy.model.Product;
import com.example.casestudy.service.IProductService;
import com.example.casestudy.service.impl.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private  IProductService iProductService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "create":
                showAddForm(request, response);
                break;
            case "update":
                showEditForm(request, response);
                break;
            case "delete":
                try {
                    performDelete(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/view/update.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void performDelete(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int id_sp = Integer.parseInt(request.getParameter("id_sp"));
        iProductService.delete(id_sp);
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = iProductService.findAll();
        request.setAttribute("productList", productList);

        try {
            request.getRequestDispatcher("/view/list.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showAddForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/view/create.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "create":
                performAdd(request, response);
                break;
            case "update":
                try {
                    performUpdate(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                break;
        }
    }

    private void performUpdate(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String ten_sp = request.getParameter("ten_sp");
        String don_gia = request.getParameter("don_gia");
        int id_sp = Integer.parseInt(request.getParameter("id_sp"));

        Product product = iProductService.findById(id_sp);
        product.setTen_sp(ten_sp);
        product.setDon_gia(don_gia);

        iProductService.update(product);
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void performAdd(HttpServletRequest request, HttpServletResponse response) {
        String ten_sp = request.getParameter("ten_sp");
        String don_gia = request.getParameter("don_gia");
        Product product = new Product(ten_sp, don_gia);
        iProductService.insert(product);
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
