public class Main {
    public static void main(String[] args) {
        int cash = 300;
        int amount = 3000;
        int bonus = amount / 100;

        if (amount > 1000) {
            System.out.println("Баланс:");
            System.out.println(cash + amount + bonus);
            System.out.println("Бонус:" + bonus);
        } else {
            System.out.println("Баланс:");
            System.out.println(cash + amount);
            System.out.println("Бонус:" + bonus);
        }
    }

}