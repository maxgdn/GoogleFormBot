import java.awt.*;
import java.awt.event.InputEvent;
import java.time.LocalDateTime;

public class Main {

        public static Robot robot;
        public static int mouseX;
        public static int mouseY;
        public static int totalForms;


    public static void main(String[] args) throws AWTException {
        System.out.println("Robot Started");
        robot = new Robot();

        LocalDateTime.now().getHour();
        int myMinute = LocalDateTime.now().getMinute() + 1;
        int myLastMinute = LocalDateTime.now().getMinute();
        System.out.println();

        while(myMinute != myLastMinute){
            mainSpam();
            myLastMinute = LocalDateTime.now().getMinute();
            totalForms++;
        }


            System.out.println("Total:" + totalForms);
    }

    private static void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    private static void moveBot(int x, int y){
        robot.mouseMove(x,y);
    }
    //returns mouse POS
    private static void getMousePos(){
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
         mouseX = (int) b.getX();
         mouseY = (int) b.getY();
        System.out.println(mouseX + " " +mouseY);
    }

    private static void mainSpam(){
        moveBot(551, 548); //Ferris
        //moveBot(554,423); //Tin Tin
        leftClick();
        robot.delay(100);
        moveBot(591, 916);
        leftClick();
        robot.delay(500);
        moveBot(582,394);
        leftClick();
        robot.delay(500);
    }
    private static void stopProgram(){
        System.exit(0);
    }
}
