package nl.tudelft.jpacman.level;
import static org.assertj.core.api.Assertions.assertThat;

import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.points.PointCalculator;
import org.junit.jupiter.api.Test;
public class playerVersusGhostTest {
    private static final PacManSprites SPRITES = new PacManSprites();
    private PlayerFactory playerFactory = new PlayerFactory(SPRITES);
    private Player player = playerFactory.createPacMan();
    private GhostFactory ghostFactory = new GhostFactory(SPRITES);
    private Ghost blinky = ghostFactory.createBlinky();
    private PointCalculator points = new DefaultPointCalculator();
    PlayerCollisions collisionPoints = new PlayerCollisions(points);


    @Test
    void testPlayerVersusGhost(){
        int startScore = player.getScore();
        collisionPoints.playerVersusGhost(player, blinky);
        assertThat(player.isAlive()).isEqualTo(false);
        assertThat(player.getKiller()).isEqualTo(blinky);
        assertThat(player.getScore() == startScore);
    }
}
