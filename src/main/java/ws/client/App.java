package ws.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {

    public static void main(String[] args) {
        GetRest getRest = new GetRest();
        List<State> states = Arrays.asList(getRest.getStatesFromWeb());
        states.forEach(System.out::println);

      /*GoogleTranslate googleTranslate = new GoogleTranslate("AIzaSyA7zvKKRjn4OHEToBGzcXE3w7_CD2PQjUQ");
        System.out.println(googleTranslate.translationFor("CAR"));*/
    }
}
