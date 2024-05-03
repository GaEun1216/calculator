import java.awt.datatransfer.FlavorListener;

public class AddOperation<T extends Number> implements AbstractOperation<T>{
    //덧셈 기능
    // 클래스 타입들의 클래스...? 어려워요 : 클래스의 정보가 담긴 클래스
    public final Class<T> type;

    public AddOperation(Class<T> type){this.type=type;}
    @Override
    public T operate(T  first, T  second) {

        double result = first.doubleValue() + second.doubleValue();

        return NumberConversionUtils.convertNumberToType(result, type);
    }

}
