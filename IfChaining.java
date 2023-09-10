import java.util.Scanner;

public class IfChaining {
    boolean smart;
    boolean funny;
    boolean blonde;

    public static void main(String[] args) {
        new IfChaining().run();
    }
    public void run() {
    printWelcomeMessage();
    askAboutAgreementToQuestions();
    showChaining();
    showNestingDemo();
    }
    public void printWelcomeMessage() {
        System.out.println("Salam aleykum habibi, welcome to chaining demo!");
    }
    public void askAboutAgreementToQuestions() {
        Scanner input = new Scanner(System.in);

        System.out.println("You are smart: ");
        smart = input.nextBoolean();
        input.nextLine(); // Scanner bug
        System.out.println("You are funny: ");
        funny = input.nextBoolean();
        input.nextLine(); // Scanner bug
        System.out.println("You are blond: ");
        blonde = input.nextBoolean();
        input.nextLine(); // Scanner Bug
        System.out.println("");
    }
    public void showChaining() {

        System.out.println("\nChaining Demo");
     if (smart == true) {
         System.out.println("You are smart!");
     }
     if (funny == true) {
         System.out.println("You are funny!");
     }
     if (blonde == true) {
         System.out.println("You are blonde!");
     }
        System.out.println("\nEnd of Chaining Demo");
    }
    public void showNestingDemo() {
        System.out.println("\nNesting Demo");
        if (smart == true) {
            System.out.println("You are super smart");
            if (funny == true) {
                System.out.println("You are super funny!");
                if (blonde == true) {
                    System.out.println("Habibi, mashallah you are blond");
                }
            }
        }
        System.out.println("\nEnd of Nesting Demo");
    }
}
