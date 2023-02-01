package EncapsulationChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-19 19:33
 * @Description: The printer class in encapsulation challenge
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            throw new RuntimeException("Invalid Toner Level");
        }
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    private int addToners(int tonerAmount) {
        if (tonerAmount < 0) {
            throw new RuntimeException("Invalid Toner Amount");
        } else {
            int tonerNumber = getTonerLevel() + tonerAmount;
            setTonerLevel(tonerNumber);
            return tonerNumber;
        }
    }

    private int printPages(int pages) {
        pages = isDuplex() ? pages / 2 + pages % 2: pages;
        setPagesPrinted(getPagesPrinted() + pages);
        return pages;
    }
}