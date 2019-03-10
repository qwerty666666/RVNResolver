package operators;

public abstract class MultiplyOperator<T> implements Operator<T> {
    @Override
    public int getPrecedence() {
        return 3;
    }

    @Override
    public OperatorAssociativity getAssociativity() {
        return OperatorAssociativity.LEFT_ASSOCIATIVE;
    }
}