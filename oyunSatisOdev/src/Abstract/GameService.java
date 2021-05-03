package Abstract;

import Entities.Game;
import Entities.User;

public interface GameService {
	void buy(User user,Game game);
	void showGame(Game game);
}
