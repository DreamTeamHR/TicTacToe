package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWeb implements SparkApplication 
{
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
    final TicTacToe game = new TicTacToe();
    
    post("/index", (req, res) -> 
    {
        int input = Integer.parseInt(req.queryParams("input"));
        return res;
    });
    
  }
}
