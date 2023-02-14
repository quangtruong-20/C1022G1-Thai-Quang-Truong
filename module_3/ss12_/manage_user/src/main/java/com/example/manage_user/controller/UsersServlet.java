package com.example.manage_user.controller;

import com.example.manage_user.service.IUserService;
import com.example.manage_user.service.impl.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UsersServlet", value = "/users")
public class UsersServlet extends HttpServlet {
    private IUserService iUserService = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null){
            actionUser = "";
        }
        switch (actionUser){
            case "create":
                request.getRequestDispatcher("/view/create.jsp").forward(request,response);
                break;
            case "edit":
                request.getRequestDispatcher("/edit.jsp").forward(request,response);
            case "delete":
                request.getRequestDispatcher("/view/delete.jsp").forward(request,response);
            default:
                request.setAttribute("userList",iUserService.selectAllUsers());
                request.getRequestDispatcher("/view/list.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null){
            actionUser = "";
        }
        switch (actionUser){
            case "create":
                request.getRequestDispatcher("/view/create.jsp").forward(request,response);
                break;
            case "edit":
                request.getRequestDispatcher("/edit.jsp").forward(request,response);
            case "delete":
                request.getRequestDispatcher("/view/delete.jsp").forward(request,response);
            default:
                request.setAttribute("userList",iUserService.selectAllUsers());
                request.getRequestDispatcher("/view/list.jsp").forward(request,response);
        }
    }
}
