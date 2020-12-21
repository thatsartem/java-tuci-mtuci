import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fourth {

    public static void main(String[] args) {
        System.out.println(bessy(10,7,"hello my name is Bessie and this is my essay"));
        System.out.println(split("((()))(())()()(()())"));
        System.out.println();
        System.out.println(toCamelCase("hello_edabit" ));
        System.out.println();
        System.out.println(toSnakeCase("helloEdabit"));
        System.out.println();
        System.out.println(overTime(new double[]{9, 17, 30, 1.5} ));
        System.out.println();
        System.out.println(BMI("205 pounds", "73 inches") );
        System.out.println();
        System.out.println(bugger(999));
        System.out.println();
        System.out.println(toStarShorthand("abbccc"));
        System.out.println();
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println();
        System.out.println(trouble(451999277, 411722899));
        System.out.println();
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));

        System.out.println();

    }

    public static String bessy(int n, int k, String str) {
        String[] text = str.split(" ");
        String line = "";
        String result = "";

        for (int i = 0; i < n; i++) {
            if (line.length() + text[i].length() > k) {
                result = result.trim() + "\r\n" + text[i] + " ";
                line = text[i];
            } else {
                result += text[i] + " ";
                line += text[i];
            }
        }

        return result.trim();
    }

    public static String[] split(String str) {
        List<String> list = new ArrayList<>();
        int f = 0;
        int i = 0;
        String string = str;

        while (string.length() > 0) {
            if (string.charAt(i) == '(') f++;
            else f--;

            if (f == 0) {
                list.add(string.substring(0, i + 1));
                string = string.substring(i + 1);
                i = 0;
                continue;
            }

            i++;
        }

        return list.toArray(new String[list.size()]);
    }

    public static String toCamelCase(String str) {
        String[] words = str.split("_");

        for (int i = 1; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }

        return String.join("", words);
    }

    public static String toSnakeCase(String str) {
        return str.replaceAll("([A-Z])", "_$0").toLowerCase();
    }

    public static String overTime(double[] work) {
        double sum;

        if (work[1] <= 17) {
            sum = (work[1] - work[0]) * work[2];
        } else {
            sum = (17 - work[0]) * work[2] + (work[1] - 17) * work[2] * work[3];
        }

        return ('$' + String.valueOf(sum));
    }

    public static String BMI(String weight, String height) {
        double amountOfWeight = Double.parseDouble(weight.split(" ")[0]);
        double amountOfHeight = Double.parseDouble(height.split(" ")[0]);
        String out = " ";

        if (weight.contains("pounds"))
            amountOfWeight *= 0.45;

        if (height.contains("inches"))
            amountOfHeight *= 0.0254;

        double BMI = Math.round((amountOfWeight / (amountOfHeight * amountOfHeight)) * 10.0) / 10.0;

        if (BMI < 18.5)
            out = BMI + " Underweight";

        if (BMI >= 18.5 && BMI <= 24.9)
            out = BMI + " Normal weight";

        if (BMI > 25)
            out = BMI + " Overweight";

        return out;
    }

    public static int bugger(int num) {
        int count = 0;
        int number = num;

        while (number > 9) {
            int chnum = 1;

            while (number > 0) {
                chnum *= number % 10;
                number /= 10;
            }

            number = chnum;
            count++;
        }

        return count;
    }

    public static String toStarShorthand(String str) {
        int count = 1;
        char let = str.charAt(0);
        String newStr = "";

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != let) {
                if (count != 1)
                    newStr += let + "*" + count;
                else
                    newStr += let;
                let = str.charAt(i);
                count = 1;
            } else
                count++;
        }

        if (count != 1)
            newStr += let + "*" + count;
        else
            newStr += let;

        return newStr;
    }

    public static boolean doesRhyme(String str1, String str2) {
        str1 = str1.substring(str1.lastIndexOf(" ") + 1);
        str2 = str2.substring(str2.lastIndexOf(" ") + 1);
        String let = "aeiouyAEIOUY";
        String res1 = "", res2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if (let.indexOf(str1.charAt(i)) != -1)
                res1 += str1.charAt(i);
        }

        for (int i = 0; i < str2.length(); i++) {
            if (let.indexOf(str2.charAt(i)) != -1)
                res2 += str2.charAt(i);
        }
        res1.toLowerCase();
        res2.toLowerCase();

        return res1.equals(res2);
    }

    public static boolean trouble(long a, long b) {
        String aa = Long.toString(a);
        String bb = Long.toString(b);
        int num = 0;

        for (int i = 2; i < aa.length(); i++) {
            if (aa.charAt(i) == aa.charAt(i - 1) && aa.charAt(i) == aa.charAt(i - 2))
                num = aa.charAt(i);
        }

        for (int i = 0; i < bb.length(); i++) {
            if (bb.charAt(i) == num && bb.charAt(i + 1) == num)
                return true;
        }

        return false;
    }

    public static int countUniqueBooks(String str, char c)  {
        Map<Character, Integer> values = new HashMap<>();
        boolean start = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c && start) {
                i++;

                while (str.charAt(i) != c) {
                    Integer n = values.get(str.charAt(i));

                    if (n == null) values.put(str.charAt(i), 1);

                    i++;
                }

                start = false;
            }

            if (str.charAt(i) == c)
                start = true;
        }

        return values.size();
    }
}
