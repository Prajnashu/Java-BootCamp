package day2;

import java.lang.reflect.InvocationTargetException;

// class MyDynamicClass {
//     int num;
//     public MyDynamicClass() {
        
//     }

//     public void hello() {
//         System.out.println("Hello from dynamically loaded class");
//     }
// }

public class LoadClassDynamically {

    public static void main(String[] args) {
        try {
            // Load the class dynamically
            Class<?> dynamicClass = Class.forName("MyDynamicClass");

            // Instantiate the class
            Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();

            // Invoke a method on the class
            dynamicClass.getDeclaredMethod("hello").invoke(dynamicObject);

        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}



