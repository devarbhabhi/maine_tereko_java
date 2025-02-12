import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
<html>
<applet code="BouncingBall.class" height=400 width=400>
</applet>
</html>
*/
class Ball
{
int x,y,radius,dx,dy;
Color BallColor;
public Ball(int x,int y,int radius,int dx,int dy,Color bColor)
{
this.x=x;
this.y=y;
this.radius=radius;
this.dx=dx;
this.dy=dy;
BallColor=bColor;
}
}
public class BouncingBall extends Applet implements Runnable
{
Ball redBall,blackBall,greenBall,blueBall,pinkBall;
public void init()
{
redBall=new Ball(200,200,20,2,10,Color.red);
blackBall=new Ball(160,190,20,4,8,Color.black);
greenBall=new Ball(120,180,20,6,6,Color.green);
blueBall=new Ball(80,170,20,8,4,Color.blue);
pinkBall=new Ball(40,160,20,10,2,Color.pink);
Thread t=new Thread(this);
t.start();
}
public void paint(Graphics g)
{
g.setColor(redBall.BallColor);
g.fillOval(redBall.x,redBall.y,redBall.radius,redBall.radius);
g.setColor(blackBall.BallColor);
g.fillOval(blackBall.x,blackBall.y,blackBall.radius,blackBall.radius);
g.setColor(greenBall.BallColor);
g.fillOval(greenBall.x,greenBall.y,greenBall.radius,greenBall.radius);
g.setColor(blueBall.BallColor);
g.fillOval(blueBall.x,blueBall.y,blueBall.radius,blueBall.radius);
g.setColor(pinkBall.BallColor);
g.fillOval(pinkBall.x,pinkBall.y,pinkBall.radius,pinkBall.radius);
}
public void run()
{
while(true)
{
try
{
displacementOperation(redBall);
displacementOperation(blackBall);
displacementOperation(greenBall);
displacementOperation(blueBall);
displacementOperation(pinkBall);
Thread.sleep(20);
repaint();
}
catch(Exception e){}
}
}
public void displacementOperation(Ball ball)
{
if(ball.y>=400||ball.y<=0)
{
ball.dy=-ball.dy;
}
if(ball.x>=400||ball.x<=0)
{
ball.dx=-ball.dx;
}
ball.y=ball.y-ball.dy;
ball.x=ball.x-ball.dx;
}
}

