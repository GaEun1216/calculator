import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator<T extends Number> extends Calculator{
    /* 연산 메서드의 책임을 분리 해봅니다. (SRP)
    처음 포함 관계를 상속과 헷갈렸는데,
    클래스의 멤버로 다른 클래스 자료형의 참조 변수를 선언하는 것을 의미하므로
    해당 사칙 연산 클래스를 불러와 연산시 클래스 내에서 처리하면 된다.
     */
    // 인터페이스 abs를 선언하고 switch문을 이용하여 원하는 기능을 가져온다.
    private AbstractOperation abs;
    OperatorType operate;
    public final Class<T> type;

    public ArithmeticCalculator(Class<T> type){
        this.type = type;
    }


    public T calculate(T a, T b,char tool) throws CalException{
        T result = null;
        operate = OperatorType.createOperate(tool);
        // 기존 switch 인자는  tool 인데 operate로 변환
        switch (operate) { // 각 사칙연산에 해당하는 작업 수행
            case Add -> abs = new AddOperation(type);
            case Subtract -> abs = new SubstractOperation(type);
            case Divide -> abs = new DivideOperation(type);
            case Multiply -> abs = new MultiplyOperation(type);
            case Mod -> abs =  new ModOperator(type); //추가
        }
        // 분모가 0일 경우 오류 발생 메시지 출력

        try { // 예제에서는 해당 부분 쪼개서 함수로 구현했는데 제 코드에서는 cal 하나로 구혀
            result = (T) abs.operate(a, b);
            que.add(result);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
        /*  3-3. 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과 값 들을 출력하고 싶습니다.
    - ArithmeticCalculator 클래스에 위 요구사항을 만족하는 조회 메서드를 구현합니다.
            - 단, 해당 메서드를 구현할 때 Lambda & Stream을 활용하여 구현합니다.
        - Java 강의에서 람다 & 스트림을 학습 및 복습 하시고 적용 해보세요!
            - 추가) 람다 & 스트림 학습을 위해 여러 가지 조회 조건들을 추가하여 구현 해보시면 학습에 많은 도움이 되실 수 있습니다.
    */
    public void bigRequiry(double num){
        //que.stream().filter(q-> (double) q > num)
        //        .forEach(q-> System.out.println(q));

    }
}

