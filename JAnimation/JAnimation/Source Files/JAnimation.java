import java.awt.*;
import java.applet.*;

public class JAnimation extends Applet implements Runnable
{
	Thread Run;
	int X = 800;
	int Y = 0;

	Image scrnBuf;
    Graphics scrnG;

	public void init()
	{
		scrnBuf = createImage(1024,1280);
        scrnG = scrnBuf.getGraphics();
	}

	public void start()
	{
		if(Run == null)
		{
			Run = new Thread(this);
			Run.start();
		}
	}
	public void stop()
	{
		if(Run != null)
		{
			Run = null;
		}
	}
	public void run()
	{
		while(true)
		{
			repaint();
			try
			{
				Thread.sleep(30);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}

		}
	}
	public void paint(Graphics Sketch)
	{
		scrnG.setColor(Color.white);
		scrnG.fillRect(0,0,600,50);
		scrnG.setColor(Color.red);

		scrnG.drawString("Woosh",X,Y);
		X-=16;
		Y+=16;
		if (X < 0)
	    {
		    X = 800;
	    }
	    if (Y > 600)
	    {
		    Y = 0;
	    }
        Sketch.drawImage(scrnBuf, 0 , 0 , this);
	}

}