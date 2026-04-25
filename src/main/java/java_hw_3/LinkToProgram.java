//Використовуючи оператор switch(or if else) написати програму, яка виводить на консоль посилання
//для завантаження програми. З вибору програм взяти: IntelliJIDEA, Git, Java. З вибору ОС взяти:
//Linux, MacOS, Windows. Програма повинна запитати користувача, яка програма йому цікава, також
//запитати яку ОС він використовує, а післявивести в консоль необхідне посилання. Якщо програма з
//такою назвою не іcнує виводить повідомлення в консоль, про те, що такої програми не існує. Якщо
//зазначеної користувачем ОС немає, виводиться повідомлення в консоль, що такої ОС немає.

package java_hw_3;

import java.util.Scanner;

public class LinkToProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the program: ");
        String a = scanner.nextLine();
        if (!a.equals("IntelliJIDEA") && !a.equals("Git") && !a.equals("Java")) {
            System.out.println("This program does not exist");
            return;
        }

        System.out.print("Enter the OS: ");
        String b = scanner.nextLine();
        Program(a, b);

    }

    public static void Program(String a, String b) {

        if (a.equals("IntelliJIDEA")) {
            if (b.equals("Linux")) {
                System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
            } else if (b.equals("MacOS")) {
                System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
            } else if (b.equals("Windows")) {
                System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
            } else {
                System.out.println("Incorrect program");

            }
        } else if (a.equals("Git")) {
            if (b.equals("Linux")) {
                System.out.println("https://git-scm.com/install/linux");
            } else if (b.equals("MacOS")) {
                System.out.println("https://git-scm.com/install/mac");
            } else if (b.equals("Windows")) {
                System.out.println("https://git-scm.com/install/windows");
            } 

        } else if (a.equals("Java")) {
            if (b.equals("Linux")) {
                System.out.println("https://javadl.oracle.com/webapps/download/AutoDL?BundleId=252895_0d06828d282343ea81775b28020a7cd3");
            } else if (b.equals("MacOS")) {
                System.out.println("https://javadl.oracle.com/webapps/download/AutoDL?BundleId=252900_0d06828d282343ea81775b28020a7cd3");
            } else if (b.equals("Windows")) {
                System.out.println("https://javadl.oracle.com/webapps/download/AutoDL?BundleId=252905_0d06828d282343ea81775b28020a7cd3");
            }
        } else {
            System.out.println("This program does not exist");
        }
    }
}
