import java.awt.*;
import java.awt.event.*;

class Test
{
	JFrame fr;
	JLabel jl,jl2;

	ImageIcon arr;
	public Test()
	{
		fr = new JFrame("TEST");
		arr = new ImageIcon("baloonx.jpg");
		jl = new JLabel(arr);
		jl2 = new JLabel(" ");
		fr.add(jl);
		fr.add(jl2);
		int a = jl.getX();
		jl2=String.valueOf(a);
	}
}

