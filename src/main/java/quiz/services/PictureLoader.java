package quiz.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 1 on 18.04.2015.
 */
public interface PictureLoader {
    public void loadPicture(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
