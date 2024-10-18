import java.awt.image.*;
import java.util.*;

public class BufferedImageStack {
	
	BufferedImage[] FakeStack;
	
	public void push(BufferedImage someBufferedImage)
	{
		int CountOfNull = (int) Arrays.stream(FakeStack).filter(i -> i == null).count();
		
		if (CountOfNull == 0)
			FakeStack = Arrays.copyOf(FakeStack, FakeStack.length * 2);
		
		int nullindex = 0;
		for (int i = 0; i < FakeStack.length; i++)
		{
			if (FakeStack[i] == null)
				nullindex = i;
				break;
		}
		
		FakeStack[nullindex] = someBufferedImage;	
	}
	
	public boolean isEmpty()
	{
		return false;
	}
	
	public BufferedImage get()
	{
		return null;
	}
	
	public int getSize()
	{
		return 0;
	}
	
	public int getArraySize()
	{
		return 0;
	}
	
	public BufferedImage pull()
	{
		return null;
	}
	
	public void pop()
	{
		
	}
	
	public BufferedImageStack()
	{
		FakeStack = new BufferedImage[2];
	}
}
