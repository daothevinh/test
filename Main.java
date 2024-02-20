
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Main {
    public static void checkListStringInput(String str) {

        List<String> list = new ArrayList<>();
        String regex = "(aw|aa|dd|ee|oo|ow|w)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            list.add(matcher.group());
        }
        System.out.println("Output: " + list.size()+ list);

    }

    public  static  void inputString(BufferedReader reader, StringBuilder stringBuilder){
        System.out.println("Input:");

        try {
            int character;
            while ((character = reader.read()) != '\n') {
                stringBuilder.append((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        inputString(reader,stringBuilder);

        String userInput = stringBuilder.toString();
        checkListStringInput(userInput);

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
