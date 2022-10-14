public class Mymain {


    public static void main(String[] args) {

        Animals monkey = new Animals("Lisa",Gender.WOMEN,1);
        Animals elephant = new Animals("Stas",Gender.MALE,3);
        Animals crocodile = new Animals("Sasha",Gender.MALE,3);
        Animals leon=new Animals("Lewa",Gender.MALE,3);
        Animals zebra=new Animals("Rita",Gender.WOMEN,10);


        System.out.println("Animal:" + monkey.name + "," + elephant.name + "," + crocodile.name+","+leon.name+","+zebra.name);
        System.out.println("Gender:" + monkey.gender + "," + elephant.gender + "," + crocodile.gender+ ","+leon.gender + "," + zebra.gender);
        System.out.println("Age:" + monkey.age + "," + elephant.age + "," + crocodile.age+"," + leon.age + "," + zebra.age);
    }





}
