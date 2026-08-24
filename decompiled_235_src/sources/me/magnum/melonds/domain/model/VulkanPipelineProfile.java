package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class VulkanPipelineProfile {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ VulkanPipelineProfile[] $VALUES;
    public static final yr7 Companion;
    public static final VulkanPipelineProfile COMPATIBILITY = new VulkanPipelineProfile("COMPATIBILITY", 0);
    public static final VulkanPipelineProfile FASTPATH = new VulkanPipelineProfile("FASTPATH", 1);

    private static final /* synthetic */ VulkanPipelineProfile[] $values() {
        return new VulkanPipelineProfile[]{COMPATIBILITY, FASTPATH};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yr7] */
    static {
        VulkanPipelineProfile[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private VulkanPipelineProfile(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static VulkanPipelineProfile valueOf(String str) {
        return (VulkanPipelineProfile) Enum.valueOf(VulkanPipelineProfile.class, str);
    }

    public static VulkanPipelineProfile[] values() {
        return (VulkanPipelineProfile[]) $VALUES.clone();
    }

    public final boolean getUsesFastPath() {
        if (this == FASTPATH) {
            return true;
        }
        return false;
    }
}
