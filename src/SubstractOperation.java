import java.awt.datatransfer.FlavorListener;

public class SubstractOperation<T extends Number> implements AbstractOperation<T>{
    //뺄셈 기능

    public final Class<T> type;

    public SubstractOperation(Class<T> type){this.type=type;}
    @Override
    public T operate(T  first, T  second) {

        double result = first.doubleValue() - second.doubleValue();

        return NumberConversionUtils.convertNumberToType(result, type);
    }
}
