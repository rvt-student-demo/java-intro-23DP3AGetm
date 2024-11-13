package lv.rvt;

public class Person {
    private String initialName;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName){
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.initialName = initialName;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.height = newWeight;
    }

    public String getName(){
       return initialName;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
}
