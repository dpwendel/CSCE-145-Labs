/*
 * Douglas Wendel 
 * CSCE 145 SL1
 * Lab 18
 * Partner: Tanner Seamster
 */
public class Diamond extends ShapeBasics implements DiamondInterface {

	//establishes width variable
	private int width;
	
	public Diamond()
	{
		super();
		this.width = 0; //default constructor
		
	}
	
	public Diamond( int xWidth, int xOffset) //parameterized constructor
	{
		super(xOffset);
		this.setWidth(xWidth);	
		}
	
	//Accessors and Mutators
	public int getWidth()
	{
		return this.width;
	}
	
	public void setWidth(int xWidth)
	{
		if(xWidth % 2 > 0)
		{
			this.width = xWidth;
		}
	}
	
	//methods 
	
	public void drawHere()
	{
		drawTopV();
		drawBottomV();
	}
	private void drawTopV()
	{
	int topv = (this.getOffset() + width) / 2;//this adds the offset by the width and divides it by two
	skipSpaces(topv);
	System.out.println("*");
	int count = width/2; //this divides width by two
	
	int innerWidth = 1; //sets default value of innerwidth to one
		
	for(int i = 0; i < count; i++)
	{
		topv--; //decrements topv
		skipSpaces(topv);
		System.out.print("*");//prints an asterics 
		skipSpaces(innerWidth);
		System.out.println("*"); //prints an asterics
		innerWidth+=2;
	}
	}
	private void drawBottomV()
	{
		int bottomv = this.getOffset();
		skipSpaces(bottomv);
		System.out.println("*"); //prints an asterics
		int count = width/2; //devides the width by two and establishes it as the count variable
		
		int innerWidth = 2;//innerwidth equals 2
		
		for (int i = 0; i < count; i++)
		{
			bottomv++;
			skipSpaces(bottomv);
			System.out.print("*");
			skipSpaces(innerWidth);
			System.out.println("*");
			innerWidth-=2;
		}
	}
	private void skipSpaces(int spaces)
	{
		for(int i = 0; i < spaces; i++)
		{
			System.out.print(" ");//adds a blank between spaces
		}
	}

}
