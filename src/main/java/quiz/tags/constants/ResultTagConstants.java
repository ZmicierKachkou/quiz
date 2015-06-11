package quiz.tags.constants;

/**
 * Created by 1 on 19.04.2015.
 */
public class ResultTagConstants {
    public static final String HEADER = "<table class=\"persimmonTable\">\n" +
            "        <tr>\n" +
            "            <th>Ответы/Вопросы</th>\n" +
            "            <th>№1</th>\n" +
            "            <th>№2</th>\n" +
            "            <th>№3</th>\n" +
            "            <th>№4</th>\n";
    public static final String END_LINE = "</tr>\n";
    public static final String END_TABLE = "</table>";
    public static final String POSITIVE = "<td class=\"yes\">\u2713</td>\n";
    public static final String NEGATIVE = "<td>—</td>\n";

    private static final String RESULT = "<p>Вердикт: ";
    public static final String FIRST_RESULT = RESULT + "Вы независимы, мнение других о хурме для вас ничего не значит.</p>";
    public static final String SECOND_RESULT = RESULT + "В непривычной ситуации вы можете растеряться и смешно побежать, размахивая руками.</p>";
    public static final String THIRD_RESULT = RESULT + "Вы сангвиник, что бы это не значило.</p>";

    public static String newLine(String lineHeader) {
        StringBuffer buffer = new StringBuffer("<tr>\n" +
                "            <th>");
        buffer.append(lineHeader);
        buffer.append("</th>\n");
        return buffer.toString();
    }
}
