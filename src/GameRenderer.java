public class GameRenderer {

    private Map map;
    private Ghost ghost;
    private Pacman pacman;

    public GameRenderer(Map map, Ghost ghost, Pacman pacman) {
        this.map = map;
        this.ghost = ghost;
        this.pacman = pacman;
    }

    public void renderMap() {
        for (int i=0; i<map.getHeight(); i++) {
            for (int j=0; j<map.getWidth(); j++)  {
                if (map.isWall(i, j))
                    System.out.print("#");
                if (i == pacman.getX() && j == pacman.getY())
                    System.out.print("C");
                if (i == ghost.getX() && j == ghost.getY())
                    System.out.print("G");

                else if (map.model[i][j] == 0)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
