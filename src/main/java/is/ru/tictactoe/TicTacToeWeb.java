package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import org.json.simple.JSONObject;

public class TicTacToeWeb implements SparkApplication 
{

  boolean lockedBoard = false;
  public static void main(String[] args) 
  {
    staticFileLocation("/public");

    SparkApplication web = new TicTacToeWeb();

    String port = System.getenv("PORT");
    if (port != null) 
    {
       port(Integer.valueOf(port));
    }

    web.init();
  }

  @Override
  public void init() 
  {
    final TicTacToe t = new TicTacToe();

    post("/index", (req, res) -> {
        JSONObject j = new JSONObject();
        String tileNoS = req.queryParams("tileNumber");
        int tileNo = (Integer.parseInt(tileNoS));
        t.playerMove(tileNo, t.getCurrPlayer());
        String play = t.getCurrPlayer() + "";
        if(t.getCurrPlayer() == 'X') {
            play = "/img/rick.png";
        } 
        else {
            play = "/img/morty.png";
        }

        j.put("play", play);
        //winner
        String endMessage = "";

        if(t.isWinner())
        {
            endMessage = "";
            if(t.getCurrPlayer() == 'X') {
                endMessage = "Rick is the winner!";
            }
            else {
                endMessage = "Morty is the winner!";
            }
            t.newGame();
            lockedBoard = true; 
            j.put("isOver", endMessage);
            return j; 
        }
        //check draw
        if(t.isDraw())
        {
            endMessage = "Draw!";
            t.newGame();
            lockedBoard = true; 
            j.put("isOver", endMessage);
            return j;
        }
        
        j.put("isOver", endMessage);

        t.changePlayer(t.getCurrPlayer());
        String nextPlayer = "";
        if(t.getCurrPlayer() == 'X') {
            nextPlayer = "Rick make a move";
        }
        else {
            nextPlayer = "Morty make a move";
        }
        j.put("currPlayer", nextPlayer);
        if(lockedBoard == false) {
            return j;
        }
        else {
            return null;
        }
    });
    
    //new game
    post("/newGame", (req, res) -> {
        JSONObject o = new JSONObject();
        lockedBoard = false;
        o.put("empty","");
        t.newGame();
        return o;
    });
  }
}
