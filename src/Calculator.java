import java.util.*;

public class Calculator {
    /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
    private Queue<Integer> que = new LinkedList<Integer>();
    public int calculate(){return 0;}
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

    public Queue getque(){
        return que;
    }

    public void setque(Queue q){
        que = q;
    }


}