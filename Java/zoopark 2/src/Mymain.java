public class Mymain {


    public static void main(String[] args) {
        Animals monkey = new Animals();
        Animals elephant = new Animals();
        Animals crocodile = new Animals();
        monkey.name = "Lisa";
        monkey.city = "Barcelona";
        monkey.amount = 100;
        monkey.gender = Gender.WOMEN;
        monkey.cage = 1;
        elephant.name = "Stas";
        elephant.city = "London";
        elephant.amount = 10;
        elephant.gender = Gender.MALE;
        elephant.cage = 2;
        crocodile.name = "Sasha";
        crocodile.city = "Minsk";
        crocodile.amount = 1;
        crocodile.gender = Gender.MALE;
        crocodile.cage = 3;

        System.out.println("Animal:" + monkey.name + "," + elephant.name + "," + crocodile.name);
        System.out.println("City:" + monkey.city + "," + elephant.city + "," + crocodile.city);
        System.out.println("Amount:" + monkey.amount + "," + elephant.amount + "," + crocodile.amount);
        System.out.println("Gender:" + monkey.gender + "," + elephant.gender + "," + crocodile.gender);
        System.out.println("Cage:" + monkey.cage + "," + elephant.cage + "," + crocodile.cage);
    }





}
