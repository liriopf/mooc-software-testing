package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    private Mirror mirror;
    @BeforeEach
    public void createMirror(){
        mirror = new Mirror();
    }

    @Test
    public void areMirrorWithMoreOneCharacter(){

        Assertions.assertEquals(mirror.mirrorEnds("abXYZba"), "ab");
    }
    @Test
    public void areMirrorWithTwoCharacters(){

        Assertions.assertEquals(mirror.mirrorEnds("aaa"), "a");
    }

    @Test
    public void areMirrorWithTreeCharacters(){

        Assertions.assertEquals(mirror.mirrorEnds("abca"), "a");
    }

    @Test
    public void areMirrorOnlyOneCharacter(){

        Assertions.assertEquals(mirror.mirrorEnds("aba"), "a");
    }

}
