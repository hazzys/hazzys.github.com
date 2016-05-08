import java.util.Scanner;
public class BlackJack{
  public static void main(String[] args){       
    Scanner A = new Scanner(System.in);
    System.out.println("What is your name?");
    String B = A.nextLine();
    Player p1 = new Player(B);
    p1.money=10;
    while(0<1){
      p1.bet = bet(p1);
      p1.total = play_human(p1);
      int computer_total = play_computer();
      calculate_winner(p1,computer_total);
      Scanner C = new Scanner(System.in);
      System.out.println("Play again?");
        String D = C.nextLine();
        if(D.equals("Y")){
          continue;}
        break;
      }
  }

    public static int play_human(Player x){
      int human_card1 = (int)(Math.random()*11)+1;
      int human_card2 = (int)(Math.random()*11)+1;
      System.out.println(x.name+" player got");
      System.out.println(human_card1+" and "+human_card2);
      int human_total = human_card1 + human_card2;
      while(0<1){
        if(human_total<21){
          Scanner G = new Scanner(System.in);
          System.out.println("Do you want another card (Y/N)");
          String H = G.nextLine();
          if(H.equals("Y")){
            int human_card3 = (int)(Math.random()*11)+1;
            human_total=human_total+human_card3;
            System.out.println("new human_total "+ human_total);}
          else if(H.equals("N")){
            System.out.println(human_total);
            break;
          }
          else{
            continue;}}
        else{
          break;}
        } 
      return human_total;
      }
    public static int play_computer(){
      int computer_card1 = (int)(Math.random()*11)+1;
      int computer_card2 = (int)(Math.random()*11)+1;
      int computer_total = computer_card1 + computer_card2;
      System.out.println("Computer player got");
      System.out.println(computer_card1+" and "+computer_card2);
      return computer_total;
    }
    
        public static int bet(Player x){
      
      System.out.println(x.name+" has "+x.money+"$");
      Scanner E = new Scanner(System.in);
      System.out.println("How much will you bet?");
      int F = E.nextInt();
      if(F<=10 && F>=0){
        x.money = x.money - F;
      }
      else{
        System.out.println("Not Betting");
        System.out.println(x.name+" betting = 0");
        F=0;
        
      }
      return F;}

    
    public static void calculate_winner(Player p1,int computer_total){
      int computer_money=10;
      if(p1.total<=21 && computer_total<p1.total){
        System.out.println(p1.name+" Wins");
        System.out.println("Computer Loses $"+(p1.bet));
        System.out.println(p1.name+" has $"+p1.money+(p1.bet*2));
        System.out.println("Computer has $"+ (computer_money-p1.bet));
      }
      else{
        System.out.println("Computer Wins");
        System.out.println(p1.name+" Loses$"+(p1.bet));
        System.out.println(p1.name+" has&"+(p1.money));
        System.out.println("Computer has$"+(computer_money+p1.bet));
        
        
      }
    }
    }
    