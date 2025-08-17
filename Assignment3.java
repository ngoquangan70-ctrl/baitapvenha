import java.util.Scanner;

class SimpleOutput {
    public static void main(String[] args) {
        int apples = 10;
        System.out.println("I have " + apples + " apples.");
    }
}

class ConsoleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
       int age = sc.nextInt();
       System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}

class SumIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
       int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }
}

class AverageDoubles {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter second number: ");
        double y = sc.nextDouble();
        System.out.println("Average = " + (x + y) / 2);
    }
}

class ReadBoolean {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a boolean (true/false): ");
       boolean value = sc.nextBoolean();
       System.out.println("You entered: " + value);
    }
}

class FullName {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter your full name: ");
       String name = sc.nextLine();
        System.out.println("Your name is: " + name);
    }
}

class ReadSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
       System.out.println("You entered: " + sentence);
    }
}

class MultipleWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter words (type 'end' to stop):");
        while (sc.hasNext()) {
          String word = sc.next();
            if (word.equals("end")) break;
           System.out.println(word);
        }
    }
}

class FixNextIntAndNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int number = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter a sentence: ");
       String sentence = sc.nextLine();
        System.out.println("Number: " + number);
       System.out.println("Sentence: " + sentence);
    }
}

class ChangeDelimiter {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       sc.useDelimiter("##|\\n");
       System.out.println("Enter words separated by '##': ");
          while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }
}


       
 





        
    
    

