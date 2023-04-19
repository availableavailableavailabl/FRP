package com.idtech.world;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class OrePlaceMent {
    public static List<PlacementModifier> orePlacement(PlacementModifier placementModifier, PlacementModifier placementModifier1) {
        return List.of(placementModifier, InSquarePlacement.spread(), placementModifier1, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int i, PlacementModifier modifier) {
        return orePlacement(CountPlacement.of(i), modifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int onAverageOnceEvery, PlacementModifier list) {
        return orePlacement(RarityFilter.onAverageOnceEvery(onAverageOnceEvery), list);
    }
}
