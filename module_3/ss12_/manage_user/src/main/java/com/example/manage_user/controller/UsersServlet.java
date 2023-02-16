package com.example.manage_user.controller;

import com.example.manage_user.model.User;
import com.example.manage_user.service.IUserService;
import com.example.manage_user.service.impl.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UsersServlet", value = "/users")
public class UsersServlet extends HttpServlet {
    private IUserService iUserService = new UserService();

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
            case "edit":
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }
        switch (actionUser) {
            case "create":

                try {
                    performAdd(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

                break;
            case "edit":
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
    private void performDelete(HttpServletRequest request, HttpServletResponse response) throws SQLException {
   int  id = Integer.parseInt(request.getParameter("id"));
   iUserService.delete(id);
        try {
            response.sendRedirect("/users");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/view/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {

        List<User> userList = iUserService.selectAll();
        request.setAttribute("userList", userList);
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



    private void performUpdate(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        int id = Integer.parseInt(request.getParameter("id"));

        User user = iUserService.select(id);
        user.setName(name);
        user.setEmail(email);
        user.setCountry(country);
        iUserService.update(user);
        try {
            response.sendRedirect("/users");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void performAdd(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        iUserService.insert(user);
        try {
            response.sendRedirect("/users");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
