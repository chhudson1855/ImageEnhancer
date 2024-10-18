import java.awt.image.*;
import java.util.*;

public class BufferedImageStack {
	
	private BufferedImage[] FakeStack;
	
	public void push(BufferedImage someBufferedImage)
	{
		
	}
	
	public boolean isEmpty()
	{
		for(BufferedImage a : FakeStack ) {
			if( a == null ) return false; }
		return true;
	}
	
	public BufferedImage get(int index)
	{
		return FakeStack[index];
	}
	
	public int getSize()
	{
		return FakeStack.length - ((int)Arrays.stream(FakeStack).filter(i -> i == null).count()); //subtracts array length from the count of "null" BufferedImages
	}
	
	public int getArraySize()
	{
		return FakeStack.length;
	}
	
	public BufferedImage pull()
	{
		return null;
	}
	
	public BufferedImage pop()
	{
		BufferedImage t = FakeStack[FakeStack.length - 1]; //to return the popped value
		FakeStack[FakeStack.length - 1] = null; //"pops" valueS
		return t;
	}
	
	public BufferedImageStack()
	{
		FakeStack = new BufferedImage[2];
	}
}

