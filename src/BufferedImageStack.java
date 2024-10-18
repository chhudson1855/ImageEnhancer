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
		for(int i = 0; i < FakeStack.length; i++) {
			if(FakeStack[i] == null)
				return i+1;
		}
		return FakeStack.length;
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
		BufferedImage t = FakeStack[FakeStack.length - 1];
		FakeStack[FakeStack.length - 1] = null;
		return t;
	}
	
	public BufferedImageStack()
	{
		FakeStack = new BufferedImage[2];
	}
}
