package net.minecraft.server;

public final class BiomeMegaTaigaHills extends BiomeBase {

    public BiomeMegaTaigaHills() {
        super((new BiomeBase.a()).a(WorldGenSurface.K, WorldGenSurface.v).a(BiomeBase.Precipitation.RAIN).a(BiomeBase.Geography.TAIGA).a(0.45F).b(0.3F).c(0.3F).d(0.8F).a(4159204).b(329011).a((String) null));
        this.a(WorldGenerator.MINESHAFT, (WorldGenFeatureConfiguration) (new WorldGenMineshaftConfiguration(0.004D, WorldGenMineshaft.Type.NORMAL)));
        this.a(WorldGenerator.STRONGHOLD, (WorldGenFeatureConfiguration) WorldGenFeatureConfiguration.e);
        BiomeDecoratorGroups.a(this);
        BiomeDecoratorGroups.c(this);
        BiomeDecoratorGroups.d(this);
        BiomeDecoratorGroups.f(this);
        BiomeDecoratorGroups.n(this);
        BiomeDecoratorGroups.o(this);
        BiomeDecoratorGroups.g(this);
        BiomeDecoratorGroups.h(this);
        BiomeDecoratorGroups.l(this);
        BiomeDecoratorGroups.H(this);
        BiomeDecoratorGroups.U(this);
        BiomeDecoratorGroups.T(this);
        BiomeDecoratorGroups.Z(this);
        BiomeDecoratorGroups.aa(this);
        BiomeDecoratorGroups.am(this);
        BiomeDecoratorGroups.ap(this);
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.SHEEP, 12, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.PIG, 10, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.CHICKEN, 10, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.COW, 8, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.WOLF, 8, 4, 4));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.RABBIT, 4, 2, 3));
        this.a(EnumCreatureType.CREATURE, new BiomeBase.BiomeMeta(EntityTypes.FOX, 8, 2, 4));
        this.a(EnumCreatureType.AMBIENT, new BiomeBase.BiomeMeta(EntityTypes.BAT, 10, 8, 8));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.SPIDER, 100, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.ZOMBIE, 100, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.SKELETON, 100, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.ZOMBIE_VILLAGER, 25, 1, 1));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.CREEPER, 100, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.SLIME, 100, 4, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.ENDERMAN, 10, 1, 4));
        this.a(EnumCreatureType.MONSTER, new BiomeBase.BiomeMeta(EntityTypes.WITCH, 5, 1, 1));
    }
}
