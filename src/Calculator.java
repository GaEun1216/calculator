import java.util.*;

public class Calculator {
    /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
    Queue<Integer> que = new LinkedList<Integer>();
    public int calculate(){return 0;}
    public int calculate(int a,int b,char tool) throws CalException {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        switch (tool) { // 각 사칙연산에 해당하는 작업 수행
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '/' -> {
                if(b==0) throw new CalException();
                else result = a / b;
            }
            case '*' -> result = a * b;
        }
        que.add(result);
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        System.out.println("결과: " + result);
        // 1. remove 로 첫번째 값 지우기
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        if (sc.next().equals("remove")) que.poll();
        // 2. 지금까지 연산 조회
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        if (sc.next().equals("inquiry")) que.forEach(data -> System.out.println(data));
        return result;
    }
}