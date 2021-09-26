package academy.learnprogramming;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            }
            else {
                return tonerLevel += tonerAmount;
            }
        }
        return -1;
    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        //  How many pages are necessary to print double sided?
        if (duplex) {
              System.out.println("Printing in duplex mode");
              pagesToPrint = (pages / 2) + (pages % 2);
//            System.out.println(pagesToPrint);
//            pagesToPrint = (Math.round((float) pages / 2)) ;
//            pagesToPrint = (int) (Math.round((double) pages / 2));
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
