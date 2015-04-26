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

	/**
	 *

	 				p1
	 {  }[ 1 ][ 2 ][ 3 ][ 4 ][ 5 ] {    }			p1S   p1   p1   p1   p1  p1   p2   p2   p2   p2    p2   p2s
	 | 0 |					       | 11 |   ||      { 0 }[ 1 ][ 2 ][ 3 ][ 4 ][ 5 ][ 6 ][ 7 ][ 8 ][ 9 ][ 10 ]{ 11 }
	 {  }[ 10 ][ 9 ][ 8 ][ 7 ][ 6 ]{    }
	              p2


	 */

	public JMSMoncalaBoard()
	{
		boardPits = new ArrayList<JMSMoncalaPit>(12);

		for (int i = 0; i < 12; i++)
		{
			//add the mouse listening to the moncala pit
			JMSMoncalaPit pit =  new JMSMoncalaPit(i);
			boardPits.add(i, pit);//creats the board with initialised beads

		}
		playerOne = playerOneIterator();
		playerTwo = playerTwoIterator();


	}
	public Iterator<JMSMoncalaPit> playerOneIterator()//direction ++ to go counter clockwise
	{
		return new Iterator<JMSMoncalaPit>()
			{
				private int currentIndex = 0;

				public void getPitBeads(int index)
				{
					JMSMoncalaPit pitSelected = boardPits.get(index);

					//get number of pits then iterate to next pits based on # of pitSelected and increment those pits you pass over

				}
				public boolean hasNext()
				{
					return currentIndex < boardPits.size();
				}

				public JMSMoncalaPit next()
				{
					return boardPits.get(currentIndex++);
				}

				public void remove()
				{
					throw new UnsupportedOperationException();
				}
			};
	}
	public Iterator<JMSMoncalaPit> playerTwoIterator()//direction -- to go clockwise
	{
		return new Iterator<JMSMoncalaPit>()
		{
			private int currentIndex = 0;
			public boolean hasNext()
			{
				return currentIndex < boardPits.size();
			}

			public JMSMoncalaPit next()
			{
				return boardPits.get(currentIndex++);
			}

			public void remove()
			{
				throw new UnsupportedOperationException();
			}
		};
	}
	public void printBoardState()//this is probably where the jPanel should be passed in and mutated to display back to the user
	{
		for(int i = 0; i < 12 ; i++)
		{
			System.out.print(boardPits.get(i) + "\t");
		}

	}
}
