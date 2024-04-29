import java.util.*;

public class Calculator {
    /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */

    protected Queue<Double> que;

    public Calculator(){
        // 컬랙션 초기화
        que = new LinkedList<Double>();
    }

    public double cal(){return 0;}



    public Queue getque(){
        return que;
    }

    public void setque(Queue que){
        this.que = que;
    }


    public void removeResult(){
        que.remove();
    }
    public void inquiryResults() {
        que.forEach(data -> System.out.println(data));
    }


}