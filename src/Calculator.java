import java.util.*;

public class Calculator {
    /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */

    // 원주율은 바뀌지 않는 값이므로 static final 로 저장
    static final double PI = 3.141592;
    private Queue<Integer> que;
    private Queue<Double> que2;
    public Calculator(){
        // 컬랙션 초기화
        que = new LinkedList<Integer>();
        que2 = new LinkedList<Double>();
    }
    public int calculate(int a,int b,char tool) throws CalException {
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
        return result;
    }

    public double calradius(int r){
        double result = r*r*PI;
        que2.add(result);
        return result;
    }


    public Queue getque(){
        return que;
    }

    public void setque(Queue q){
        que = q;
    }

    public Queue getque2(){
        return que2;
    }

    public void setque2(Queue q){
        que2 = q;
    }

    public void removeResult(){
        que.remove();
    }
    public void inquiryResults() {
        que.forEach(data -> System.out.println(data));
    }

    public void inquiryResults2() {
        que2.forEach(data -> System.out.println(data));
    }


}