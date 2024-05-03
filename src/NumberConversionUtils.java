public class NumberConversionUtils {
    // 한번에 형 변환을 할 수 있는 클래스
    @SuppressWarnings("unchecked")
    public static <T extends Number> T convertNumberToType(Number result, Class<T> type) {
        if (type == Integer.class) {
            return (T) Integer.valueOf(result.intValue());
        } else if (type == Double.class) {
            return (T) Double.valueOf(result.doubleValue());
        } else if (type == Long.class) {
            return (T) Long.valueOf(result.longValue());
        } else {
            throw new IllegalArgumentException("지원하지 않는 타입입니다. " + type);
        }
    }
}
