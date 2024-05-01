import java.awt.datatransfer.FlavorListener;

public class SubstractOperation implements AbstractOperation{
    //뺄셈 기능

    @Override
    public <T extends Number> T operate(T f, T s) throws IllegalAccessException {
        if (f instanceof Integer) return (T)Integer.valueOf(f.intValue()-s.intValue());
        else if (f instanceof Double) return (T)Double.valueOf(f.doubleValue()-s.doubleValue());
        else if (f instanceof Float) return (T)Float.valueOf(f.floatValue()-s.floatValue());
        else throw new IllegalAccessException("지원하지 않는 타입입니다.");
    }
}
