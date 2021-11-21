package example.content;

import mindustry.ctype.*;
import mindustry.type.*;

import static example.content.*;
public class FDSectors implements ContentList{
    public static SectorPreset gluonFields;
      @Override
    public void load(){
        //region Gluon

        gluonFields = new SectorPreset("gluonFields", FDPlanets.gluon, 15){{
            alwaysUnlocked = true;
            addStartingItems = true;
            captureWave = 10;
            difficulty = 1;
            startWaveTimeMultiplier = 3f;
        }};
    }
}
