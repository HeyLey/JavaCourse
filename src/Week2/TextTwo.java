package Week2;


/**
 * Created by leyla on 03/10/15.
 */
public class TextTwo {
    static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder[] array = new StringBuilder[roles.length];

        for (int i = 0; i < roles.length; i++) {
            String role = roles[i];
            array[i] = new StringBuilder(role + ":\n");
        }

        for (int i = 0; i < textLines.length; i++) {
            String s = textLines[i];
            for (int j = 0; j < roles.length; j++) {
                String person = roles[j];
                if (s.startsWith(person + ":")) {
                    array[j].append(i + 1).append(") ").append(s.substring(person.length() + 2)).append("\n");
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < array.length; k++) {
            sb.append(array[k]).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String[] roles = { "Городничий",
                           "Аммос Федорович",
                           "Артемий Филиппович",
                           "Лука Лукич"
        };

        String[] textLines = { "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                               "Аммос Федорович: Как ревизор?",
                               "Артемий Филиппович: Как ревизор?",
                               "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                               "Аммос Федорович: Вот те на!",
                               "Артемий Филиппович: Вот не было заботы, так подай!",
                               "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        System.out.println(printTextPerRole (roles, textLines));
    }
}
