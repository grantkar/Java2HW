package lesson1HW1;

public class Man implements Obstaclable{
    private String name;
    private int run;
    private int heightWall;

    private final int MAX_RUN = 3000;
    private final int MAX_HEIGHT_WALL = 3;


    public Man(String name, int run, int heightWall) {
        this.name = name;
        this.run = run;
        this.heightWall = heightWall;
    }




    @Override
    public void obstacle(int run, int heightWall) {
        if (this.run < MAX_RUN && this.run > run) {
                       System.out.println(name + " пробежал " + run + " м");
                   } else {
                       System.out.println(name + " не смог пробежать");
                      return;
                  }
        if (this.heightWall < MAX_HEIGHT_WALL && this.heightWall > heightWall){
                      System.out.println(name +" взабрался на " + heightWall +" стену");
                  } else {
                      System.out.println(name + " не смог взобраться на такую высоту");
                      return;

        }
     }

}
