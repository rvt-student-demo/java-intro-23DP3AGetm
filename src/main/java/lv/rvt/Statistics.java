package lv.rvt;
public class Statistics {
    private int sum;

    public Statistics(){
        this.sum = 0;
    }
    
    public void addNumber(int number){
        this.sum += number;
    }

    public int sum(){
        return this.sum;
    }
}
