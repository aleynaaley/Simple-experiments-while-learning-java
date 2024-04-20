import java.util.NoSuchElementException;

public class LinkedList<T> {

  private LLNode<T> firstNode;

  public LinkedList() {
    firstNode = null;
  }

  protected LLNode<T> getFirstNode() {
    return firstNode;
  }

  protected void setFirstNode(LLNode<T> node) {
    this.firstNode = node;
  }

  public void addToFront(T element) {
    setFirstNode(new LLNode<T>(element, getFirstNode()));
  }

  public boolean isEmpty() {
    return (getFirstNode() == null);
  }

  public int length() {
    int lengthSoFar = 0;
    LLNode<T> nodeptr = getFirstNode();
    while (nodeptr != null) {
      lengthSoFar++;
      nodeptr = nodeptr.getNext();
    }
    return lengthSoFar;
  }

  public String toString() {
    return null;
  }

  public boolean contains(T element) {
    return false;
  }

  public void remove(T element) throws NoSuchElementException
  {
    if(isEmpty())
    {
      throw new NoSuchElementException("list is empty")
    }
    
    LLNode<T> current = firstNode; 
    LLNode<T> prev = null;

    while(current != null && !current.getElement().equals(element)) 
    {
      prev = current; 
      current = current.getNext(); 
    }
    if(current != null)
    {
      
      if(prev == null)
      {
        firstNode = current.getNext();
      }

      else
      {
        prev.setNext(current.getNext());
      }
    }
  }

  public void deleteFirst() throws NoSuchElementException {
    if (isEmpty()) {
      throw new NoSuchElementException("list is empty");
    }
    firstNode = firstNode.getNext();
  }

  public void deleteLast() {
    if (!isEmpty()) {
      throw new NoSuchElementException("list is empty");
    }
    LLNode<T> current = firstNode;
    LLNode<T> prev = null;

    while (current.getNext() != null) {
      prev = current;
      current = current.getNext();
    }
    if (prev == null) {
      firstNode = null;
    } else {
      prev.setNext(null);
    }
  }
}
