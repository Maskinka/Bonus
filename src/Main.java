public class Main {
    public static void main(String[] args) {
        int balans = 50;
        int replenshBalans = 1000;
        int bonus = replenshBalans / 100;


        if (replenshBalans >= 1000) {
            System.out.println("Итоговый счет: " + (balans + replenshBalans + bonus));
            System.out.println("Количество бонусных рублей: " + bonus);
        } else {
            System.out.println("Итоговый счет: " + (balans + replenshBalans));
            System.out.println("Количество бонусных рублей: 0");
        }


    }
}
