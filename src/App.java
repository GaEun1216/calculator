import java.sql.SQLOutput;
import java.util.*;

public class App {
    public static void main(String[] args) throws CalException {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        String[] ans = new String[3];
        int key;

        while(true) { // break 걸리기 전까지 반복
            System.out.print("사칙 연산 => 1 , 원의 넓이 계산 => 2 \n입력 : ");
            key = sc.nextInt();
            if(key ==1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int a = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int b = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                // 문자열이 아닌 문자 입력받기
                char tool = sc.next().charAt(0);

                System.out.println("결과: " + cal.calculate(a, b, tool));

                // 1. remove 로 첫번째 값 지우기
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                ans[0] = sc.next();

                if (ans[0].equals("remove")) cal.removeResult();

                // 2. 지금까지 연산 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                ans[1] = sc.next();
                if (ans[1].equals("inquiry")) cal.inquiryResults();
            }
            else if(key == 2){
                System.out.print("넓이를 구할 원의 반지름을 입력하세요 : ");
                int a = sc.nextInt();
                System.out.println("원의 넓이 : "+cal.calradius(a));
                // 연산 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                ans[1] = sc.next();
                if (ans[1].equals("inquiry")) cal.inquiryResults2();
            }
            // 3. while문 빠져 나가기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ans[2] = sc.next();
            if (ans[2].equals("exit")) break;

        }
    }
}