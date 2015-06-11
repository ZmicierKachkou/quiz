package quiz.services.impl;

import quiz.services.PictureLoader;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 1 on 18.04.2015.
 */
public class PersimmonPictureLoader implements PictureLoader {
    private static String imgdir = "images/";
    @Override
    public void loadPicture(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("image/jpg");
        ServletOutputStream out;
        out = resp.getOutputStream();
        ServletContext servletContext = req.getSession().getServletContext();
        String[] relativeWebPath = req.getRequestURI().split("/");

        String absoluteDiskPath = servletContext.getRealPath(imgdir + relativeWebPath[relativeWebPath.length - 1]);
        FileInputStream fin = new FileInputStream(absoluteDiskPath);

        BufferedInputStream bin = new BufferedInputStream(fin);
        BufferedOutputStream bout = new BufferedOutputStream(out);
        int ch = 0;
        while((ch=bin.read())!=-1)
        {
            bout.write(ch);
        }
        bin.close();
        fin.close();
        bout.close();
        out.close();
    }
}
