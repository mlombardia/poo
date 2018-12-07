package game.backend;

import game.backend.cell.Cell;
import game.backend.element.Element;
import game.backend.level.Level;
import game.backend.level.Level1;

public class CandyGame implements GameListener {
    private Level level;
    private Grid grid;
    private GameState state;

    public CandyGame(Level level) {
        this.level = level;
    }

    public void initGame() {
        try {
            grid = (Grid)Level1.newInstance();
        } catch(IllegalAccessException | InstantiationException e) {
            System.out.println("ERROR AL INICIAR");
        }
        state = grid.createState();
        grid.initialize();
        addGameListener(this);
    }

    public int getSize() {
        return Grid.SIZE;
    }

    public boolean tryMove(int i1, int j1, int i2, int j2){
        return grid.tryMove(i1, j1, i2, j2);
    }

    public Cell get(int i, int j){
        return grid.getCell(i, j);
    }

    public void addGameListener(GameListener listener) {
        grid.addListener(listener);
    }

    public long getScore() {
        return state.getScore();
    }

    public boolean isFinished() {
        return state.gameOver();
    }

    public boolean playerWon() {
        return state.playerWon();
    }

    @Override
    public void cellExplosion(Element e) {
        state.addScore(e.getScore());
    }

    @Override
    public void gridUpdated() {
        //
    }

    public int getMoves(){
        return state.getMoves();
    }
}
