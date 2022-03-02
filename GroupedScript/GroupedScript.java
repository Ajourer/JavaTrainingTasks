import java.lang.StringBuilder;
import java.lang.String;

public class GroupedScript {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. и еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            res.append(roles[i])
                    .append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    res.append(j + 1)
                            .append(")")
                            .append(textLines[j].substring(roles[i].length() + 1))
                            .append("\n");
                }
            }
            res.append("\n");
        }
        return res.toString();
    }
}