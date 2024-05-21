package JavaBasics;


class Football extends Sport {
	
	
    void play() {
        System.out.println("Playing Football");
    }
}

class Cricket extends Sport {
    void play() {
        System.out.println("Playing Cricket");
    }
}

class Hockey extends Sport {
    void play() {
        System.out.println("Playing Hockey");
    }
}

public class Sport {
   void play() {
         System.out.println("Playing generic sport");
    }

    public static void main(String[] args) {
        Sport sport;

        // Create instances of the child classes
        Football football = new Football();
        Cricket cricket = new Cricket();
        Hockey hockey = new Hockey();

        // Call specific play methods using super keyword and casting
        sport = football;
        ((Football) sport).play();

        sport = cricket;
        ((Cricket) sport).play();

        sport = hockey;
        ((Hockey) sport).play();
    }
}
