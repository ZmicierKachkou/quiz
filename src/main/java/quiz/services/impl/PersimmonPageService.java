package quiz.services.impl;

import quiz.dto.Answers;
import quiz.enums.Answer;
import quiz.enums.Command;
import quiz.services.PageService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * Created by 1 on 13.04.2015.
 */
public class PersimmonPageService implements PageService {
    private static final String PAGEDIR = "pages/";

    @Override
    public String processRequest(HttpServletRequest req, HttpServletResponse resp) {
        String param = req.getParameter("command");
        String redirect = PAGEDIR;
        Command command = Command.valueOf(param.toUpperCase());
        if(command == Command.FIRST) {
            processFirstStep(req);
            redirect += "first";
        }
        else if(command == Command.SECOND) {
            processQuizStep(req, 0);
            redirect += "second";
        }
        else if(command == Command.THIRD) {
            processQuizStep(req, 1);
            redirect += "third";
        }
        else if(command == Command.FOURTH) {
            processQuizStep(req, 2);
            redirect += "fourth";
        }
        else if(command == Command.RESULTS) {
            HttpSession session = req.getSession();
            Answers answers = (Answers)session.getAttribute("answers");
            if(req.getParameter("check") == null) {
                Answer answer = Answer.valueOf(req.getParameter("rd").toUpperCase());
                answers.setAnswer(answer, 3);
                session.setAttribute("answers", answers);
            }
            redirect += "results";
        }
        return redirect+".jsp";
    }

    private void processFirstStep(HttpServletRequest req) {
        HttpSession session = req.getSession();
        Answers answers = new Answers();
        session.setAttribute("answers", answers);
    }

    private void processQuizStep(HttpServletRequest req, int step) {
        HttpSession session = req.getSession();
        Answers answers = (Answers)session.getAttribute("answers");
        if(req.getParameter("check") != null) return;
        Answer answer = Answer.valueOf(req.getParameter("rd").toUpperCase());
        answers.setAnswer(answer, step);
        session.setAttribute("answers", answers);
    }

    @Override
    public String processGetRequest(HttpServletRequest req) {
        String[] relativeWebPath = req.getRequestURI().split("/");
        return relativeWebPath[relativeWebPath.length - 1] + ".jsp";
    }
}
