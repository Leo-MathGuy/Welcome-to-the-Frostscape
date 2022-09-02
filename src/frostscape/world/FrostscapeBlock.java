package frostscape.world;

import arc.func.Prov;
import arc.struct.Seq;
import frostscape.type.upgrade.Upgrade;
import mindustry.gen.Building;
import mindustry.world.Block;

public class FrostscapeBlock extends Block {
    public FrostscapeBlock(String name) {
        super(name);
        this.update = true;
        this.solid = true;
        this.hasLiquids = true;
        this.liquidCapacity = 5.0F;
        this.hasItems = true;
    }

    //Aplicable upgrades
    public Seq<Upgrade> upgrades = new Seq<>();

    @Override
    public boolean isVisible() {
        return super.isVisible();
    }
}