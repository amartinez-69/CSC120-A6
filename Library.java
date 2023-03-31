import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable<String, Boolean> collection;


    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
    }

    public void addTitle(String title){
      if (this.collection.contains(title)) {
        //   if so: throw and exception
        throw new RuntimeException(title + " is already in the collection");
      }
      this.collection.put(title, true);
    }

    public String removeTitle(String title){
      if (!this.collection.contains(title)) {
        //   if so: throw and exception
        throw new RuntimeException(title + " is not in the collection");
      }
      this.collection.remove(title);
      return title;
    }

    public void checkOut(String title){
      this.collection.replace(title, true, false);
    }

    public void returnBook(String title){
      this.collection.replace(title, false, true);
    }

    public boolean containsTitle(String title){
      if (this.collection.contains(title)){
        return true; 
      }
      else {return false;}
    }

    public boolean isAvailable(String title){
      if (this.collection.get(title).equals(true)){
        return true;
      }
      else {return false;}
    }

    //public void printCollection(){

    //}
  
    //public static void main(String[] args) {
      //new Library();
    //}
  
  }