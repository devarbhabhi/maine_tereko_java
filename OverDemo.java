class Base {
    void show() {
        System.out.println("Base class show() method invoked");
    }
}

class Derived extends Base {
    
    void show() {
        System.out.println("Derived class show() method invoked");
    }
}

public class OverDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.show(); 
    }
}
