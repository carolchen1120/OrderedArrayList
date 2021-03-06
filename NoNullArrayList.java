import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  NoNullArrayList() {
    super();
  }

  NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("There was a Null value.");
    } else {
      super.set(index, value);
      return value;
    }
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("There was a Null value.");
    } else {
      super.add(value);
      return true;
    }
  }

  public void add(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("There was a Null value.");
    } else {
      super.add(index, value);
    }
  }
}
