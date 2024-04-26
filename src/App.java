import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = sc.nextInt();
        System.out.print("사칙연산 기호를 입력하세요: ");
        // 문자열이 아닌 문자 입력받기
        char c = sc.next().charAt(0);
    }
}