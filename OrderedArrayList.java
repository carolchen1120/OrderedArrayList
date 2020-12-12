import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  OrderedArrayList() {
    super();
  }

  OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public set(int index, T value) {
    if (OrderedArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.remove(index);
      super.add(index, value);
    }
  }

  public add() {
    if (OrderedArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.add();
    }
  }

  public add(int index) {
    if (OrderedArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.add(index);
    }
  }
}
