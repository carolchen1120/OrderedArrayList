import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  OrderedArrayList() {
    super();
  }

  OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public int findIndex(T value) {
    int length = super.size();
    if (value == null) {
      throw new IllegalArgumentException("There was a Null value.");
    }
    for (int i = 0; i < length; i++) {
      if (value.compareTo(super.get(i)) < 0) {
        return i;
      }
    }
    return length;
  }

  public boolean add(T value) {
    int place = 0;
    if (value == null) {
      throw new IllegalArgumentException("There was a Null value.");
    } else {
      place = findIndex(value);
      super.add(place, value);
      return true;
    }
  }

  public void add(int index, T value) {
    int place = 0;
    if (value == null) {
      throw new IllegalArgumentException("There was a Null value.");
    } else {
      place = findIndex(value);
      super.add(place, value);
    }
  }

  public T set(int index, T value) {
    T ans = super.get(index);
    if (value == null) {
      throw new IllegalArgumentException("There was a Null value.");
    } else {
      super.remove(index);
      add(value);
      return ans;
    }
  }
}
