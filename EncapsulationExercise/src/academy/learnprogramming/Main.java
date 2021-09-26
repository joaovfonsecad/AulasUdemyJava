package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagessPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagessPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagessPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagessPrinted + " new total print count for printer = " + printer.getPagesPrinted());


    }
}
