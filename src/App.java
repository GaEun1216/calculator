import java.sql.SQLOutput;
import java.util.*;

public class App {
    public static void main(String[] args) throws CalException {
        // 계산에 필요한 사칙연산 + mod 클래스와 원의 넓이를 구하는 객체 생성 후 초기화
        ArithmeticCalculator ar = new ArithmeticCalculator();
        CircleCalculator cir = new CircleCalculator();
        Scanner sc = new Scanner(System.in);
        // 부가기능 사용 유무를 담을 answer 배열
        String[] ans = new String[3];
        int key; // 사칙연산, 원의 넓이를 선택하는 값
        double result; // 결과값

        while(true) { // break 걸리기 전까지 반복
            System.out.print("사칙 연산 => 1 , 원의 넓이 계산 => 2 \n입력 : ");
            key = sc.nextInt();
            if(key ==1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double a = sc.nextDouble();
                System.out.print("두 번째 숫자를 입력하세요: ");
                double b = sc.nextDouble();
                System.out.print("사칙연산 기호를 입력하세요: ");
                // 문자열이 아닌 문자 입력받기
                char tool = sc.next().charAt(0);
                // ArithmeticCalculator 클래스에서 tool을 이용해 연산 수행
                if ( a == (int)a && b ==(int)b) {
                    int a1 = (int)a;
                    int b1 = (int)b;
                    result = ar.cal(a1,b1,tool);

                }
                else result = ar.cal(a,b,tool);

                // cal 함수는 원의 넓이와 함께 사용되기 때문에
                // result는 double로 생성함
                // 하지만 inquiry를 통해 정수를 조회하면
                // 정수로 담겨있는 것을 확인할 수 있다.
                System.out.println("결과: " + result);

                // 1. remove 로 첫번째 값 지우기
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                ans[0] = sc.next();

                if (ans[0].equals("remove")) ar.removeResult();

                // 2. 지금까지 연산 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                ans[1] = sc.next();
                if (ans[1].equals("inquiry")) ar.inquiryResults();
            }
            else if(key == 2){ // 원의 넓이 구하기
                System.out.print("넓이를 구할 원의 반지름을 입력하세요 : ");
                int a = sc.nextInt();
                result = cir.cal(a);
                System.out.println("원의 넓이 : "+result);
                // 연산 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                ans[1] = sc.next();
                if (ans[1].equals("inquiry")) cir.inquiryResults();
            }
            // 3. while문 빠져 나가기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ans[2] = sc.next();
            if (ans[2].equals("exit")) break;

        }
    }
}