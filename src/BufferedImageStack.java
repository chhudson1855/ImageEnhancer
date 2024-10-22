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
			{
				nullindex = i;
				break;
			}
				
		}
		
		FakeStack[nullindex] = someBufferedImage;	
	}
	
	public boolean isEmpty()
	{
		for(BufferedImage a : FakeStack ) {
			if( a != null ) return false; }
		return true;
	}
	
	public BufferedImage get(int index)
	{
		return FakeStack[index];
	}
	
	public int getSize()
	{
		return FakeStack.length - ((int)Arrays.stream(FakeStack).filter(i -> i == null).count());
	}
	
	public int getArraySize()
	{
		return FakeStack.length;
	}
	
	public BufferedImage pop()
	{
		if (FakeStack[0] == null)
			throw new java.util.EmptyStackException();
		
		int nullindex = 0;
		for (int i = 0; i < FakeStack.length; i++)
			if (FakeStack[i] == null)
			{
				nullindex = i;
				break;
			}
		
		BufferedImage t;
		
		if (nullindex > 0)
		{
			t = FakeStack[nullindex - 1]; //to return the popped value
			FakeStack[nullindex - 1] = null; //"pops" valueS
		}
		else
		{
			t = FakeStack[FakeStack.length - 1]; //to return the popped value
			FakeStack[FakeStack.length - 1] = null; //"pops" valueS
		}
		
		return t;
	}
	
	public BufferedImageStack()
	{
		FakeStack = new BufferedImage[2];
	}
}
