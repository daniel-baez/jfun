package cl.daplay.jfun;

@FunctionalInterface
public interface ThrowingFunction<T, K> {

    K apply(T t) throws Exception;

}