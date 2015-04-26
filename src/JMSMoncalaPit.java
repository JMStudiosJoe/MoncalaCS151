import javax.swing.*;

/**
 * Created by josephrichardson on 4/25/15.
 */
public class JMSMoncalaPit extends JComponent
{
	public int indexOfPit;
	private int prevNumberBeads = 0;
	private int beads = 0;
	public JMSMoncalaPit(int index)
	{
		indexOfPit = index;
		if(index == 0 || index == 11)
		{
			beads = 0;
		}
		else
		{
			beads = 5;
		}
	}
	public int getNumberOfBeadsInPit()
	{

		prevNumberBeads = beads;
		beads = 0;
		return prevNumberBeads;
	}
	public void addBeadToPit()
	{
		prevNumberBeads = beads;
		beads++;
	}
	@Override
	public String toString()
	{
		return "\nIndex: " + indexOfPit + "\tBeads: " + beads;
	}

}
