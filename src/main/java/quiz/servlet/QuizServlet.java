package quiz.servlet;

import quiz.dto.Answers;
import quiz.services.PageService;
import quiz.services.PictureLoader;
import quiz.services.impl.PersimmonPageService;
import quiz.services.impl.PersimmonPictureLoader;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 1 on 12.04.2015.
 */
public class QuizServlet extends HttpServlet {

    PageService pageService = new PersimmonPageService();
    PictureLoader pictureLoader = new PersimmonPictureLoader();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        if(req.getRequestURI().contains("pics")) {
            pictureLoader.loadPicture(req, resp);
        }
        else if(req.getRequestURI().contains("pages")) {
            String url = pageService.processGetRequest(req);
            System.out.println();
            req.getRequestDispatcher(url).forward(req, resp);
        }
        else {
            req.getRequestDispatcher("pages/start.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        String url = pageService.processRequest(req, resp);
        if(url != null) req.getRequestDispatcher(url).forward(req, resp);
        else super.doPost(req, resp);
    }
}
