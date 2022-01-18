package example.world.blocks.logic;

import arc.graphics.*;
import arc.math.*;
import arc.util.*;
import arc.util.*;
import mindustry.gen.*;
import mindustry.*;
import mindustry.world.blocks.logic.*;

//Creates an type that makes info about wave

public class WaveInfoMessage extends MessageBlock {
    public WaveInfoMessage(String name) {
        super(name);
        update = true;
    }
    public class WaveInfoMessageBiuld extends MessageBuild {
              @Override
        public void updateTile() {
           message.append("You are currently in wave: [stat]"+Vars.state.wave+"[white].");
           message.setLength(0);
        }
    }
}
