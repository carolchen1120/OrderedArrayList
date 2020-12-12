import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T value) {
    if (OrderedArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.remove(index);
      super.add(index, value);
      return value;
    }
  }

  public boolean add() {
    if (OrderedArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.add();
      return true;
    }
  }

  public boolean add(int index) {
    if (OrderedArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.add(index);
      return true;
    }
  }
}
