import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = new int[other.length];
    for (int i=0; i<other.length; i++){
      data[i]=other[i];
    }
    currentIndex=0;
  }

  //second constructor

  //Postcondition: The otherseq will be reset.
  //This constructor will copy ALL values of the `otherseq` into the data array.
  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    for (int i=0; i<otherseq.length(); i++){
      data[i]=otherseq.next();
    }
    otherseq.reset();
  }


  //methods
  public boolean hasNext(){
    return (currentIndex < data.length);
  }

  public int next(){
    if (! hasNext()){
      throw new NoSuchElementException("" + currentIndex + " out of bounds");
    }
    currentIndex++;
    return data[currentIndex-1];
  }

  public int length(){
    return data.length;
  }

  public void reset(){
    currentIndex=0;
  }

  public static void main (String[] args){
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
  }
}
