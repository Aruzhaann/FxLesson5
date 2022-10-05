//Task1
//
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//    }
//}


//Task2
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }
//    }
//}

//Task3
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (String i : cars) {
//            System.out.println(i);
//        }
//    }
//}

//Task4
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(25);
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//    }
//}

//Task5
//import java.util.ArrayList;
//import java.util.Collections; //Import the Collection class
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        Collections.sort(cars); //Sort cars
//        for (String i : cars) {
//            System.out.println(i);
//        }
//    }
//}

//Task6
//import java.util.ArrayList;
//import java.util.Collections; //Import the Collections class
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//
//        Collections.sort(myNumbers); //Sort myNumbers
//
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//    }
//}
//

//Task7

//import javax.sql.rowset.spi.SyncResolver;
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//
//        String car = cars.get(0);
//        System.out.println("get method:" + car);
//
//        cars.set(0, "Opel");
//        System.out.println("get method:" + cars);
//
//        cars.remove(0);
//        System.out.println("remove method:" + cars );
//
//        cars.clear();
//        System.out.println("clear method:" + cars);
//
//        int s = cars.size();
//        System.out.println("list size" +s);
//    }
//}


//Problem1
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Black");
//        colors.add("Grey");
//        colors.add("Yellow");
//        colors.add("Pink");
//        System.out.println(colors);
//    }
//}

//Problem2
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<String>();
//        fruits.add("Apple");
//        fruits.add("Coconut");
//        fruits.add("Plum");
//        fruits.add("Lemon");
//
//        fruits.add(0, "Kiwi");
//        System.out.println(fruits);
//
//    }
//}

//Problem3
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<String>();
//        fruits.add("Strawberry");
//        fruits.add("Plum");
//        fruits.add("Apple");
//        fruits.add("Pear");
//        fruits.add("Lemon");
//        System.out.println(fruits);
//
//        String element = fruits.get(0);
//        System.out.println("First element: " + element);
//        element = fruits.get(2);
//
//        System.out.println("Second element: " + element);
//
//    }
//}

//Problem4
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<String>();
//        fruits.add("Pear");
//        fruits.add("Coconut");
//        fruits.add("Avocado");
//        fruits.add("Apricot");
//        fruits.add("Kiwi");
//        System.out.println(fruits);
//
//        fruits.set(2, "Grape");
//
//        System.out.println(fruits);
//    }
//}

//Problem5
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<String>();
//        fruits.add("Coconut");
//        fruits.add("Plum");
//        fruits.add("Apple");
//        fruits.add("Kiwi");
//        fruits.add("Fig");
//        System.out.println(fruits);
//
//        fruits.remove(3);
//
//        System.out.println("After removing third element from the list:\n" + fruits);
//    }
//}

//Problem6
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<String>();
//        fruits.add("Apple");
//        fruits.add("Coconut");
//        fruits.add("Grape");
//        fruits.add("Avocado");
//
//        if(fruits.contains("Coconut")) {
//            System.out.println("Element found");
//        }else{
//            System.out.println("There isn't element");
//        }
//    }
//}

//Problem7
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> numbers = new ArrayList<String>();
//        numbers.add("1");
//        numbers.add("2");
//        numbers.add("3");
//        numbers.add("4");
//        System.out.println("numbers: " + numbers);
//        List<String> name = new ArrayList<String>();
//    name.add("Aru");
//    name.add("Asylym");
//    name.add("Merey");
//    name.add("Alina");
//    System.out.println("name: " + name);
//
//        Collections.copy(numbers,name);
//        System.out.println("Copy numbers to names\nCopied:");
//        System.out.println("numbers: " + numbers);
//        System.out.println("name: " + name);
//    }
//}


//Problem8
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Aru");
//        names.add("Bekzhan");
//        names.add("Aisulu");
//        names.add("Dana");
//        names.add("Merey");
//        System.out.println("names before shuffling: " + names);
//        Collections.shuffle(names);
//        System.out.println("names after shuffling: " + names);
//    }
//}

//Problem9
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Aqshuaq");
//        names.add("Merey");
//        names.add("Ulnosh");
//        names.add("Dana");
//        names.add("Aru");
//        System.out.println("names before reserving: " + names);
//        Collections.reverse(names);
//        System.out.println("names after reserving: " + names);
//    }
//}