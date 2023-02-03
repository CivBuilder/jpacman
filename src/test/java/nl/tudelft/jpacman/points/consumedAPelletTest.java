package nl.tudelft.jpacman.points;

import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.level.PlayerFactory;
import nl.tudelft.jpacman.sprite.EmptySprite;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class consumedAPelletTest {
    private static final PacManSprites SPRITES = new PacManSprites();
    private PlayerFactory playerFactory = new PlayerFactory(SPRITES);
    private Player player = playerFactory.createPacMan();
    private PointCalculator points = new DefaultPointCalculator();
    private EmptySprite sprite = new EmptySprite();
    Pellet pellet = new Pellet(500, sprite);

    @Test
    void testConsumedAPellet() {
        int startScore = player.getScore();
        points.consumedAPellet(player, pellet);
        int newScore = player.getScore();
        assertThat(newScore > startScore);
        assertThat(newScore).isEqualTo(500);
    }
}
