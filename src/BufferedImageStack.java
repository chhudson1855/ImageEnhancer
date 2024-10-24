import java.awt.image.*;
import java.util.*;

public class BufferedImageStack {
	
	BufferedImage[] FakeStack;
	
	public void push(BufferedImage someBufferedImage)
	{
		int CountOfNull = (int) Arrays.stream(FakeStack).filter(i -> i == null).count(); //number of null items
		
		if (CountOfNull == 0) //if there are no more null items
			FakeStack = Arrays.copyOf(FakeStack, FakeStack.length * 2);//makes a copy with the same values with double the length
		
		int nullindex = 0;
		for (int i = 0; i < FakeStack.length; i++) // finds nullindex to slot pushed BuffferedImage into
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
			if( a != null ) return false; } //if there is any value that isn't null, then it isn't empty
		return true;
	}
	
	public BufferedImage get(int index)
	{
		return FakeStack[index];
	}
	
	public int getSize()
	{
		return FakeStack.length - ((int)Arrays.stream(FakeStack).filter(i -> i == null).count());//returns the amount of non-null values
	}
	
	public int getArraySize()
	{
		return FakeStack.length;
	}
	
	public BufferedImage pop()
	{
		if (FakeStack[0] == null)
			throw new java.util.EmptyStackException();
		
		//to pop the last non-null item in FakeStack
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
