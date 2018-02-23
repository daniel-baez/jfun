package cl.daplay.jfun;

@FunctionalInterface
public interface ThrowingSupplier<T> {

    T get() throws Exception;

}