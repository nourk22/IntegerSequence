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
  }


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
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
  }
}
