package com.example.kodillabytebuddy.byteBuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

//public class BuddyApp {
//
//    public static void main(String[] args) throws Exception {
//        Class<?> dynamicBookClass = new ByteBuddy()
//                .subclass(Book.class)
//                .method(ElementMatchers.named("toString"))
//                .intercept(FixedValue.value("Hello my Buddy!"))
//                .make()
//                .load(Book.class.getClassLoader(), Default.WRAPPER)
//                .getLoaded();
//
//        Class[] parameterTypes = { String.class, String.class, int.class };
//
//        System.out.println(dynamicBookClass.getDeclaredConstructor(parameterTypes)
//                .newInstance("title", "author", 2010));
//
//    }
//
//}

import java.util.List;

public class BuddyApp {

    public static void main(String[] args) {
        List<Book> books = BooksGenerator.generate(100);
        BooksFilter booksFilter = new BooksFilter(books);
        List<Book> filteredBooks = booksFilter.onlyBooksOlderThan(20);
        System.out.println(filteredBooks.size());

    }

}
