import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  NoNullArrayList() {
    super();
  }

  NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public set() {
    if (NoNullArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.set();
    }
  }

  public add() {

  }
}
