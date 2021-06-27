package com.swufe.javaee.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "SignInServlet", value = "/sign-in")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("sign-in.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("inputName");
        String password = req.getParameter("inputPassword");
        Map<String, String> map = new HashMap<>();
        map.put("Henry", "Shi760118");
        map.put("John", "020304");
        if (map.containsKey(name)) {
            String pwd = map.get(name);
            if (pwd.equals(password)) {
                req.getSession().setAttribute("user", name);
                resp.sendRedirect("index");
            }
            else {
                resp.sendRedirect("wrong.html");
            }
        }
        else {
            resp.sendRedirect("wrong.html");
        }

    }
}