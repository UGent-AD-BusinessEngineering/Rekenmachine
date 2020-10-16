
public class DivideByZeroException extends Exception {
  public DivideByZeroException()
  {
    super ("Dividing by Zero!");
  }

  public DivideByZeroException(String message)
  {
    super ("Dividing by Zero!:" + message);
  }
}
