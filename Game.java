public class Game {
  Player p1;
  Player p2;
  Dice d1;
  Dice d2;

  Game(){
    p1 = new Player();
    p2 = new Player();
    d1 = new Dice();
    d2 = new Dice();
  }

  void start(){
    p1.turn(d1);
    p2.turn(d2);
    judge();
  }
  void judge(){
    if (d1.me > d2.me){
      System.out.println("p1の勝ち");
    }else if (d1.me == d2.me){
      System.out.println("あいこ");
    }else{
      System.out.println("p2の勝ち");
    }
  }
}