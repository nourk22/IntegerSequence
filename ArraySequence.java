import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){  }


  public boolean hasNext(){
    return true;
  }

  public int next(){
    return 0;
  }

  public int length(){
    return 0;
  }

  public void reset(){
    
  }

  public static void main (String[] args){

  }
}
