import java.util.*;

public class Calculator<T> {
    /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
    // 이 안에서 que를 생성한 이유는 Calculator의 자식 클래스가 사칙연산, 원의 넓이를 계산하는 클래스 2개인데
    // 각각 값을 담아주는 que를 분리해주기 위해 부모 클래스 안에 큐 구현
    protected Queue<Double> que;

    public Calculator(){
        // 컬랙션 초기화
        que = new LinkedList<Double>();
    }

    // 기존에는 자식 클래스인 사칙연산, 원의 넓이 모두 오버라이딩 했지만
    // 제네릭 구현 문제로 원의 넓이 클래스만 오버라이딩
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