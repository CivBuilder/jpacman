package nl.tudelft.jpacman.level;

import static org.assertj.core.api.Assertions.assertThat;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;
public class PlayerTest {
    private static final PacManSprites SPRITES = new PacManSprites();
    private PlayerFactory playerFactory = new PlayerFactory(SPRITES);
    private Player player = playerFactory.createPacMan();

    @Test
    void testAlive(){
        assertThat(player.isAlive()).isEqualTo(true);
    }

}
