import javax.swing.*;
import java.awt.*;

class Ball {
    int x, y, radius, dx, dy;
    Color ballColor;

    public Ball(int x, int y, int radius, int dx, int dy, Color ballColor) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.dx = dx;
        this.dy = dy;
        this.ballColor = ballColor;
    }

    public void move(int width, int height) {
        if (y >= height - radius || y <= 0) {
            dy = -dy;
        }
        if (x >= width - radius || x <= 0) {
            dx = -dx;
        }
        x += dx;
        y += dy;
    }
}

public class BouncingBall extends JPanel {
    private final Ball[] balls;

    public BouncingBall() {
        balls = new Ball[]{
                new Ball(200, 200, 20, 2, 10, Color.RED),
                new Ball(160, 190, 20, 4, 8, Color.BLACK),
                new Ball(120, 180, 20, 6, 6, Color.GREEN),
                new Ball(80, 170, 20, 8, 4, Color.BLUE),
                new Ball(40, 160, 20, 10, 2, Color.PINK)
        };

        Timer timer = new Timer(20, e -> {
            for (Ball ball : balls) {
                ball.move(getWidth(), getHeight());
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball ball : balls) {
            g.setColor(ball.ballColor);
            g.fillOval(ball.x, ball.y, ball.radius, ball.radius);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball Simulation");
        BouncingBall panel = new BouncingBall();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
