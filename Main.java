import java.util.Scanner;

public class Main extends Thread {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("占いを開始します。");
        System.out.println("名前を入力してください。");
        String name = scanner.nextLine();
        System.out.println("年齢を入力してください。");
        int age = scanner.nextInt();
        int rand = new java.util.Random().nextInt(5);

        switch (rand) {
            case 1:
                System.out.println("今日の運勢は大吉です。");
                break;
            case 2:
                System.out.println("今日の運勢は中吉です。");
                break;
            case 3:
                System.out.println("今日の運勢は小吉です。");
                break;
            case 4:
                System.out.println("今日がお前の命日だよ");
                Thread.sleep(3000);
                System.out.println("アソブ?");
                break;
            default:
                System.out.println("今日の運勢は吉です。");
                break;
        }
        if (rand == 4) {
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(2000);
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(2000);
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(2000);
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(2000);
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(2000);
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(2000);
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(2000);
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(2000);
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(2000);
            System.out.println("アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?アソブ!アソブ?");
            Thread.sleep(5000);
            System.out.println("\u001b[00;31m" + "う・し・ろ" + " \u001b[00m");
        }
    }
}