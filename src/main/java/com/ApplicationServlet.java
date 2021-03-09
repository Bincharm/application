package com;

import com.db.DataBase;
import com.model.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/application")
public class ApplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("application.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Application app = new Application();
        app.setFullName(req.getParameter("fullName"));
        app.setCourse(req.getParameter("course"));
        app.setEmail(req.getParameter("email"));
        app.setIsOnline("true".equals(req.getParameter("isOnline")));

        boolean res = DataBase.addApplication(app);

        req.setAttribute("result", res ? "Application was created successfully for " : "Application creation failed");
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
