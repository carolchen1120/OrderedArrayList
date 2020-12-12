import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  NoNullArrayList() {
    super();
  }

  NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public set(int index; T value) {
    if (NoNullArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.set(index, value);
    }
  }

  public add() {
    if (NoNullArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.add();
    }
  }

  public add(int index) {
    if (NoNullArrayList() == null) {
      throw new IllegalArgumentException();
    } else {
      super.add(index);
    }
  }
}
