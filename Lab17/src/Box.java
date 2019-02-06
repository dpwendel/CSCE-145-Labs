/*
 * DOuglas Wendel
 * Partner: Tanner Seamster
 * CSCE 145 SL1
 * Lab 17
 */
public class Box {

	private String Label;
	private double Length;
	private double Width;
	private double Height;
	
	
	public Box()
	{
		this.Label = "None";
		this.Length = 0;
		this.Width = 0;
		this.Height = 0;
		
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//          Parameterized Constructors           //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public Box(String xLabel, double xLength, double xWidth, double xHeight)
	{
		this.setLabel(xLabel);
		this.setLength(xLength);
		this.setWidth(xWidth);
		this.setHeight(xHeight);
	}
	
	public String getLabel()
	{
		return this.Label;
	}
	
	public double getLength()
	{
		return this.Length;
	}
	public double getWidth()
	{
		return this.Width;
	}
	public double getHeight()
	{
		return this.Height;
	}
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//              Accessors & Mutators             //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public void setLabel(String xLabel)
	{
		this.Label = (xLabel);
	}
	
	public void setLength(double xLength)
	{
		if(xLength > 0)
		{
			this.Length = (xLength);
		}
	}
	
	public void setWidth(double xWidth)
	{
		if(xWidth > 0)
		{
			this.Width = (xWidth);
		}

	}
	
	public void setHeight(double xHeight)
	{
		if(xHeight > 0)
		{
			this.Height = (xHeight);
		}

	}
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//                  METHODS				         //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	public double Volume()
	{
		return Length*Height*Width;
	}
	
	public String toString()
	{
		return "Box Label: " +Label+ "\tVolume: " +Volume()+"\n";
	}
	
}
