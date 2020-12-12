import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T value) {
    if (NoNullArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.set(index, value);
      return value;
    }
  }

  public boolean add() {
    if (NoNullArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.add();
      return true;
    }
  }

  public boolean add(int index) {
    if (NoNullArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.add(index);
      return true;
    }
  }
}
