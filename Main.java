class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int intTotal = 55*10;
    double dblBlue = intTotal*.24;
    double dblBrown = intTotal*.13;
    double dblGreen = intTotal*.16;
    double dblOrange = intTotal*.20; 
    double dblRed = intTotal*.13;
    double dblYellow = intTotal*.14;
    double dblSumOfColors = dblBlue + dblBrown + dblGreen + dblOrange + dblRed + dblYellow;

    System.out.println("blue: " + dblBlue);
    System.out.println("brown: " + dblBrown);
    System.out.println("green: " + dblGreen);
    System.out.println("orange: " + dblOrange);
    System.out.println("red: " + dblRed);
    System.out.println("yellow: " + dblYellow);
    System.out.println("Sum: " + dblSumOfColors);

    if(dblBlue > dblBrown && dblGreen > dblOrange){
        System.out.println("Blue over Brown and Green over Orange");
    }

    if(dblBrown <= dblRed){
        System.out.println("Brown is less than or equal to Red");
    }
    
    if(dblSumOfColors == intTotal){
        System.out.println("Numbers Match!");
    }

  }
}