package nl.tudelft.jpacman.level;
import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.points.PointCalculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class addPointsTest {
    private static final PacManSprites SPRITES = new PacManSprites();
    private PlayerFactory playerFactory = new PlayerFactory(SPRITES);
    private Player player = playerFactory.createPacMan();
    private PointCalculator points = new DefaultPointCalculator();

    @Test
    void testAddPoints(){
        final int NEW_POINTS = 5;
        player.addPoints(NEW_POINTS);
        int newScore = player.getScore();
        assertThat(newScore == NEW_POINTS);
    }
}
