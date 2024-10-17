import java.awt.image.*;
import java.util.*;

public class BufferedImageStack {
	
	int[] FakeStack;
	
	public void push(BufferedImage someBufferedImage)
	{
		
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
		FakeStack = new int[2];
	}
}
