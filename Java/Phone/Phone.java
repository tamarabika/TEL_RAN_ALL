public class Phone {
    int number;
    String model;
    double weight;
    String name;



    @Override
    public String toString() {
        return
                "Звонит: " + number +
                        " model: " + model +
                        " weight: " + weight +
                        " name: " + name;

    }

    public Phone (int number, String model, double weight, String name){
        this.number = number;
        this.model = model;
        this.weight =weight;
        this.name = name;
    }
    public Phone receiveCall(int number, String name){
        return receiveCall(number, name);

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone(){


    }
}