
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by josephrichardson on 4/25/15.
 */
public class JMSMoncalaIterator implements Iterator<JMSMoncalaPit>
{
	private ArrayList<JMSMoncalaPit> moncalaBoard;
	private int MAX_SIZE = 12;
	public int currentIndex = 0;
	public boolean isPlayerOne;
	public JMSMoncalaBoard playerBoard;

	public JMSMoncalaIterator(ArrayList<JMSMoncalaPit> board)
	{
		moncalaBoard = board;

	}

	public void setPlayer(boolean player)
	{
		isPlayerOne = player;
	}
	public boolean getPlayer()
	{
		return isPlayerOne;
	}
	@Override
	public boolean hasNext()
	{
		//
		if(isPlayerOne)
		{
			//goin the ++ direction of the arraylist so if current index is 10, since 11 is score, then needs to go to the 1 index since 0 is score
			return currentIndex < MAX_SIZE && moncalaBoard.get(currentIndex) != null;
		}
		else
		{
			return currentIndex < MAX_SIZE && moncalaBoard.get(currentIndex) != null;
		}

	}

	@Override
	public JMSMoncalaPit next() {
		return moncalaBoard.get(currentIndex++);
	}

	@Override
	public void remove() 
	{
		throw new UnsupportedOperationException();
	}

}
