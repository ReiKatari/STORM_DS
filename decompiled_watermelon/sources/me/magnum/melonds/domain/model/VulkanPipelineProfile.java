package me.magnum.melonds.domain.model;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class VulkanPipelineProfile {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ VulkanPipelineProfile[] $VALUES;
    public static final ed7 Companion;
    public static final VulkanPipelineProfile COMPATIBILITY = new VulkanPipelineProfile("COMPATIBILITY", 0);
    public static final VulkanPipelineProfile FASTPATH = new VulkanPipelineProfile("FASTPATH", 1);

    private static final /* synthetic */ VulkanPipelineProfile[] $values() {
        return new VulkanPipelineProfile[]{COMPATIBILITY, FASTPATH};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ed7, java.lang.Object] */
    static {
        VulkanPipelineProfile[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private VulkanPipelineProfile(String str, int i) {
    }

    public static e12 getEntries() {
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
