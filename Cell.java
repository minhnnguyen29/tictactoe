public class Cell {
    private Seed stype;
    private int cRow, cCol;
    public Cell (int boardSize){
        stype = Seed.EMPTY;
        cRow = -1;
        cCol = -1;
    }
    public Cell (Seed stype, int cRow, int cCol){
        this.stype = stype;
        this.cRow = cRow;
        this.cCol = cCol;
    }
    public boolean isClear() {
        if(stype == Seed.EMPTY)
            return true;//if type is still EMPTY, system returns true
        return false; //if not, it system returns false
    }
    public void clearCell() {
        stype = Seed.EMPTY;//set cell to nothing
    }

    public void paintCell() {//print
        switch(stype) {
            case EMPTY: System.out.print("   ");
            break;
            case X: System.out.print(" X ");
            break;
            case O: System.out.print(" O ");
            break;
            default: System.out.print("   ");
        }
    }
}