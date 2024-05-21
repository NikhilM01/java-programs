
class Sports {
    public void play() {
        System.out.println("Playing some sport.");
    }
}

class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football. Kick the ball!");
    }
}

class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball. Dribble and shoot!");
    }
}

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby. Tackle and pass the ball!");
    }
}


public class SportsDemo {
    public static void main(String[] args) {
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        // Call the play() method on each instance
        football.play();
        basketball.play();
        rugby.play();
    }
}
