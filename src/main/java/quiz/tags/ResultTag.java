package quiz.tags;

import quiz.dto.Answers;
import quiz.enums.Answer;
import quiz.tags.constants.ResultTagConstants;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by 1 on 19.04.2015.
 */
public class ResultTag extends BodyTagSupport {
    private static final long serialVersionUID = 1L;

    private Answers answers;

    public void setAnswers(Answers answers) {
        this.answers = answers;
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            pageContext.getOut().print(ResultTagConstants.HEADER);
            pageContext.getOut().print("<p>"+getBodyContent().getString()+"</p>");
            printLine(pageContext.getOut(), "Первый", Answer.FIRST);
            printLine(pageContext.getOut(), "Второй", Answer.SECOND);
            printLine(pageContext.getOut(), "Третий", Answer.THIRD);
            pageContext.getOut().print(ResultTagConstants.END_TABLE);
            printResult(pageContext.getOut());
        } catch (IOException ioException) {
            throw new JspException("Error: " + ioException.getMessage());
        }
        return SKIP_BODY;
    }

    private void printLine(JspWriter out, String headLine, Answer answer) throws IOException {
        out.print(ResultTagConstants.newLine(headLine));
        for(int i=0; i<4; i++) {
            if(answers.getAnswer(i)== answer) out.print(ResultTagConstants.POSITIVE);
            else out.print(ResultTagConstants.NEGATIVE);
        }
        out.print(ResultTagConstants.END_LINE);
    }

    private void printResult(JspWriter out) throws IOException {
        Answer result = answers.getResult();
        if(result == Answer.FIRST) out.print(ResultTagConstants.FIRST_RESULT);
        else if(result == Answer.SECOND) out.print(ResultTagConstants.SECOND_RESULT);
        else if(result == Answer.THIRD) out.print(ResultTagConstants.THIRD_RESULT);
    }
}
