import processing.core.PApplet ;

public class four_balls_oop extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int arr[] = {0 ,0 ,0 ,0};
    public static void main(String[] args) {
        PApplet.main("four_balls_oop" ,args);
    }
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        draw_four_ellipse();

    }
    void draw_four_ellipse()
    {
        for(int i = 1;i<=4;i++)
        {
            draw_ellipse(i ,i) ;
        }
    }
    void draw_ellipse(int x_value ,int increment)
    {
      ellipse(arr[x_value-1] , x_value*HEIGHT/5 ,10 ,10);
      arr[x_value-1]+= increment;
    }
}
