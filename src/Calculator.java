import java.util.*;

public class Calculator<T extends Number> {
    /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
    // 이 안에서 que를 생성한 이유는 Calculator의 자식 클래스가 사칙연산, 원의 넓이를 계산하는 클래스 2개인데
    // 각각 값을 담아주는 que를 분리해주기 위해 부모 클래스 안에 큐 구현
    protected Queue<T> que;

    public Calculator(){
        // 컬랙션 초기화
        que = new LinkedList<T>();
    }

    public T cal(){return null;}

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