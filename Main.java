class Main {

  public static void main(String[] args){
  Calculator clerk = new Calculator();
    try
    {
      System.out.println ("Calculator is on.");
      System.out.print ("Format of each line: ");
      System.out.println ("operator space number");
      System.out.println ("For example: + 3");
      System.out.println ("To end, enter the letter e.");
      clerk.doCalculation ();
    }
    catch (UnknownOpException e)
    {
      clerk.handleUnknownOpException (e);
    }
    catch (DivideByZeroException e)
    {
      clerk.handleDivideByZeroException (e);
    }
    System.out.println ("The final result is " +
    clerk.getResult());
    System.out.println ("Calculator program ending.");
  }
}