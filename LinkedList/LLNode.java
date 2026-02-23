
public class LLNode<T> {

  private T element;

  private LLNode<T> next;

  public LLNode(T element, LLNode<T> next) {
    this.element = element;
    this.next = next;
  }

  public T getElement() {
    return element;
  }

  public LLNode<T> getNext() {
    return next;
  }

  public void setNext(LLNode<T> next) {
    this.next = next;
  }

  public int lengthFromHere() {
    if (getNext() == null)
      return 0;
    else
      return 1 + getNext().lengthFromHere();
  }

  public void insertAfter(T element) {
  }

  public void deleteNext() {
  }

}
