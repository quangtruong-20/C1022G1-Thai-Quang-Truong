package com.example.customer_manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public void init()  {
        customers.add(new Customer("Thai Quang Truong","22-2-2000","QB","https://www.dungplus.com/wp-content/uploads/2019/12/girl-xinh-1-480x600.jpg"));
        customers.add(new Customer("Thai Quang Dong","22-2-1996","QT","https://www.dungplus.com/wp-content/uploads/2019/12/girl-xinh-1-480x600.jpg"));
        customers.add(new Customer("Thai Quang Khai","22-2-1999","QB","https://www.dungplus.com/wp-content/uploads/2019/12/girl-xinh-1-480x600.jpg"));
        customers.add(new Customer("Thai Quang Dat","22-2-1993","Hue","https://www.dungplus.com/wp-content/uploads/2019/12/girl-xinh-1-480x600.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customers",customers);
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
