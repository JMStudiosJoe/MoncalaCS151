import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by josephrichardson on 4/25/15.
 */
public class JMSMoncalaBoard
{
	public ArrayList<JMSMoncalaPit> boardPits;

	public Iterator<JMSMoncalaPit> playerOne;
	public Iterator<JMSMoncalaPit> playerTwo;


	public JMSMoncalaBoard()
	{
		boardPits = new ArrayList<JMSMoncalaPit>();

		playerOne = playerOneIterator();
		playerTwo = playerTwoIterator();
		

	}
	public Iterator<JMSMoncalaPit> playerOneIterator()
	{
		return new Iterator<JMSMoncalaPit>()
			{
				private int current = 0;
				public boolean hasNext()
				{
					return current < boardPits.size();
				}

				public JMSMoncalaPit next()
				{
					return boardPits.get(current++);
				}

				public void remove()
				{
					throw new UnsupportedOperationException();
				}
			};
	}
	public Iterator<JMSMoncalaPit> playerTwoIterator()
	{
		return new Iterator<JMSMoncalaPit>()
		{
			private int current = 0;
			public boolean hasNext()
			{
				return current < boardPits.size();
			}

			public JMSMoncalaPit next()
			{
				return boardPits.get(current++);
			}

			public void remove()
			{
				throw new UnsupportedOperationException();
			}
		};
	}
}
