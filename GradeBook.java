import java.util.ArrayList;

public class GradeBook
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a gradebook with no scores and a given capacity.
      @capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }
   	//   Task1
   
   public int getScoreSize() {
	    // Use the 'this' keyword to refer to the instance variable 'scoresSize'.
	    return this.scoresSize;
	}

	// Override the default toString() method to return a string representation of the scores array.
	@Override
	public String toString() {
	    // Define a local variable to store the string representation of the scores array.
	    String scoreString = "";
	    // Use a for loop to iterate through the scores array.
	    for (int i = 0; i < scoresSize; i++) {
	        // Convert each score to a string and append it to the scoreString variable.
	        scoreString += Double.toString(scores[i]) + " ";
	    }
	    // Return the final string representation of the scores array.
	    return scoreString;
	}
   
   
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      if (scoresSize == 0) return 0;
      double smallest = scores[0];
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < smallest)
         {
            smallest = scores[i];
         }
      }
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
}

