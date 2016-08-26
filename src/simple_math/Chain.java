package simple_math;

public interface Chain {

    void setNextChain(Chain nextChain);

    void calculate(Numbers request);
}
