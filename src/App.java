import java.util.*;

public class App {
    public static void main(String[] args) throws CalException {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        String[] ans = new String[3];
        int result;
        while(true) { // break 걸리기 전까지 반복
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 문자열이 아닌 문자 입력받기
            char tool = sc.next().charAt(0);
            result = cal.calculate(a,b,tool);

            // 3. while문 빠져 나가기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ans[2] = sc.next();
            if (ans[2].equals("exit")) break;

        }
    }
}