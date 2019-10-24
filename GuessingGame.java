class GuessingGame{
  public static void main (String[] args){
    int low = 0;
    int high = 0;
    try{
      low = Integer.parseInt(args[0]);
  }
    catch(NumberFormatException e){
      System.out.println("Bad input. Both arguments must be integers");
    }
    try{
      high = Integer.parseInt(args[1]);
  }
    catch(NumberFormatException e){
      System.out.println("Bad input. Both arguments must be integers");
    }
    Guesser gissare = new Guesser(low, high);
    gissare.start();

  }


}
