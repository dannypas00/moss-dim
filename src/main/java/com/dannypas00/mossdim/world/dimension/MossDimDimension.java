package com.dannypas00.mossdim.world.dimension;

import com.dannypas00.mossdim.MossDim;
import com.mojang.logging.LogUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import org.slf4j.Logger;

public class MossDimDimension {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final ResourceKey<Level> MOSSDIM_KEY = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(MossDim.MODID, "mossdim"));
    public static final ResourceKey<DimensionType> MOSSDIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, MOSSDIM_KEY.location());

    public static void register () {
        LOGGER.info("Registering MossDimDimension: {}", MOSSDIM_KEY.location());
    }
}
