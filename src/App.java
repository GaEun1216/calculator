import java.sql.SQLOutput;
import java.util.*;

public class App {
    public static void main(String[] args) throws CalException {
        // 계산에 필요한 사칙연산 + mod 클래스와 원의 넓이를 구하는 객체 생성 후 초기화

        // Double형 class를 사용하기 위해 형태가 바뀌었다... 아직 어렵다
        ArithmeticCalculator<Double> ar = new ArithmeticCalculator<>(Double.class);
        CircleCalculator cir = new CircleCalculator();
        Scanner sc = new Scanner(System.in);
        // 기존 ans[3] 배열로 remove,inquiry등을 보관하였는데 입력받고 바로 작업에 들어가도록 수정하여 변수 필요 X
        int key; // 사칙연산, 원의 넓이를 선택하는 값
        Number result; // 결과값


        do { // 기존 while문에서 do-while로 변경
            System.out.print("사칙 연산 => 1 , 원의 넓이 계산 => 2 \n입력 : ");
            key = sc.nextInt();
            // 사칙 연산
            if(key ==1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double a = sc.nextDouble();
                System.out.print("두 번째 숫자를 입력하세요: ");
                double b = sc.nextDouble();
                System.out.print("사칙연산 기호를 입력하세요: ");
                // 문자열이 아닌 문자 입력받기
                char tool = sc.next().charAt(0);
                // ArithmeticCalculator 클래스에서 tool을 이용해 연산 수행

                result = ar.calculate(a,b,tool);
                // 계산과 큐에 add 하는 구간 분리
                ar.getque().add(result);

                System.out.println("결과: " + result);

                // 1. remove 로 첫번째 값 지우기
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if (sc.next().equals("remove")) ar.removeResult();

                // 2. 지금까지 연산 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (sc.next().equals("inquiry")) ar.inquiryResults();

                // 3-3 : steam이랑 lamda 사용해서 필터링 하기
                System.out.print("해당 수보다 큰 값을 출력합니다.");
                System.out.print("기준 값을 입력하세요 : ");
                ar.bigRequiry(sc.nextDouble());
            }
            // 원의 넓이 구하기
            else if(key == 2){
                System.out.print("넓이를 구할 원의 반지름을 입력하세요 : ");
                int a = sc.nextInt();
                result = cir.cal(a);
                System.out.println("원의 넓이 : "+result);
                // 연산 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (sc.next().equals("inquiry")) cir.inquiryResults();
            }
            // 3. do - while문 빠져 나가기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        }while(!sc.next().equals("exit"));
    }
}