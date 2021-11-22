package example.content;

import mindustry.ctype.*;
import mindustry.type.*;

//import static example.content.*;
public class FDSectors implements ContentList{
    public static SectorPreset coast;
      @Override
    public void load(){
        //region Gluon

        coast = new SectorPreset("coast", FDPlanets.gluon, 15){{
            alwaysUnlocked = true;
            addStartingItems = true;
            captureWave = 10;
            difficulty = 1;
            startWaveTimeMultiplier = 3f;
        }};
    }
}
