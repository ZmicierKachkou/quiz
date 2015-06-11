package quiz.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 1 on 18.04.2015.
 */
public interface PageService {
    public String processRequest(HttpServletRequest req, HttpServletResponse resp);

    public String processGetRequest(HttpServletRequest req);
}
