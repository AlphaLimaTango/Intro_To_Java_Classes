public class Printer {
    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetStock() {
        return sheetsLeft;
    }

    public void print(int pages, int copies) {
        tonerVolume -= (pages * copies);
        sheetsLeft -= (pages * copies);
    }

    public int triesToPrintIfItHasEnoughPaper(int pages, int copies) {
      if ((pages * copies) <= sheetsLeft){
          this.print(pages, copies);
      }
      return sheetsLeft;
    }

    public void refill(int i) {
        sheetsLeft += i;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
