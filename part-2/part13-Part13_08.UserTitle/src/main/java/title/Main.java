package title;

import java.util.Scanner;
import title.UserTitle;

import javafx.application.Application;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello world!");

        String title = null;

        while (title == null) {
            System.out.println("Write a title and press enter: ");
            title = scan.nextLine();
        }
//        UserTitle metitle = new UserTitle(title);
//        metitle.
        if (title != null) {
            Application.launch(UserTitle.class,
                    "--title"+ title);
        }
    }

}
