package Seminar_2.lesson4.methodgenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // A <- B <- C <- D <- E
        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<C> cList = new ArrayList<>();
        List<D> dList = new ArrayList<>();
        List<E> eList = new ArrayList<>();


//      <T extends B, S extends T, R extends S> List<S> foo(List<B> list)
//        List<A> abList = foo(bList);
        List<B> bbList = foo(bList);
//        List<C> cbList = foo(bList);
//        List<D> dbList = foo(bList);
//        List<E> ebList = foo(bList);


//      <T extends B, S extends T, R extends S> List<S> foo(List<C> list)
//        List<A> acList = foo(cList);
//        List<B> bcList = foo(cList);
//        List<C> ccList = foo(cList);
//        List<D> dcList = foo(cList);
//        List<E> ecList = foo(cList);

        foo(dList);
        foo(eList);



    }

    // PECS
    public static <T extends B, S extends T, R extends S> List<S> foo(List<R> list) {
        throw new IllegalStateException();
    }

    // PECS Producer - Extends, Consumer - Super


    class A {

    }

    class B extends A {

    }

    class C extends  B {

    }

    class D extends C {

    }

    class E extends D {

    }

}
