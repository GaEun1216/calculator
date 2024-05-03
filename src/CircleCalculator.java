import java.util.Queue;

public class CircleCalculator extends Calculator{
    // 원주율은 바뀌지 않는 값이므로 static final 로 저장
    static final double PI = 3.141592;

    public double cal(int radius){
        double result = radius*radius*PI;
        que.add(result);
        return result;
    }

}
