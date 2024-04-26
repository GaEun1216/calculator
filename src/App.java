import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        Queue<Integer> que = new LinkedList<Integer>();
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
        int index = 0;
        String[] ans = new String[3];
        while(true) { // break 걸리기 전까지 반복
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 문자열이 아닌 문자 입력받기
            char tool = sc.next().charAt(0);
            int result = 0;
            switch (tool) { // 각 사칙연산에 해당하는 작업 수행
                case '+' -> result = a + b;
                case '-' -> result = a - b;
                case '/' -> result = a / b;
                case '*' -> result = a * b;
            }
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            System.out.println("결과: " + result);
            que.add(result);
            // 1. remove 로 첫번째 값 지우기
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            ans[0] = sc.next();
            if (ans[0].equals("remove")) que.poll();
            // 2. 지금까지 연산 조회
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            ans[1] = sc.next();
            if (ans[1].equals("inquiry")) que.forEach(data -> System.out.println(data));
            // 3. while문 빠져 나가기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ans[2] = sc.next();
            if (ans[2].equals("exit")) break;

        }
    }
}