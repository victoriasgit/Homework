public class Function implements FunctionAware {
    @Override
    public float calculate(float x) {
        return x * (float) Math.sin(x);
    }
}