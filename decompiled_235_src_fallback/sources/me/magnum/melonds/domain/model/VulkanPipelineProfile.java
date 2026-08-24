package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum VulkanPipelineProfile extends java.lang.Enum<me.magnum.melonds.domain.model.VulkanPipelineProfile> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.VulkanPipelineProfile[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.VulkanPipelineProfile COMPATIBILITY = null;
    public static final defpackage.yr7 Companion = null;
    public static final me.magnum.melonds.domain.model.VulkanPipelineProfile FASTPATH = null;

    private static final /* synthetic */ me.magnum.melonds.domain.model.VulkanPipelineProfile[] $values() {
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = me.magnum.melonds.domain.model.VulkanPipelineProfile.COMPATIBILITY
            me.magnum.melonds.domain.model.VulkanPipelineProfile r1 = me.magnum.melonds.domain.model.VulkanPipelineProfile.FASTPATH
            me.magnum.melonds.domain.model.VulkanPipelineProfile[] r0 = new me.magnum.melonds.domain.model.VulkanPipelineProfile[]{r0, r1}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = new me.magnum.melonds.domain.model.VulkanPipelineProfile
            java.lang.String r1 = "COMPATIBILITY"
            r2 = 0
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VulkanPipelineProfile.COMPATIBILITY = r0
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = new me.magnum.melonds.domain.model.VulkanPipelineProfile
            java.lang.String r1 = "FASTPATH"
            r2 = 1
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VulkanPipelineProfile.FASTPATH = r0
            me.magnum.melonds.domain.model.VulkanPipelineProfile[] r0 = $values()
            me.magnum.melonds.domain.model.VulkanPipelineProfile.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.VulkanPipelineProfile.$ENTRIES = r0
            yr7 r0 = new yr7
            r0.<init>()
            me.magnum.melonds.domain.model.VulkanPipelineProfile.Companion = r0
            return
    }

    VulkanPipelineProfile(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.VulkanPipelineProfile.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.VulkanPipelineProfile valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.VulkanPipelineProfile> r0 = me.magnum.melonds.domain.model.VulkanPipelineProfile.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.VulkanPipelineProfile r1 = (me.magnum.melonds.domain.model.VulkanPipelineProfile) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.VulkanPipelineProfile[] values() {
            me.magnum.melonds.domain.model.VulkanPipelineProfile[] r0 = me.magnum.melonds.domain.model.VulkanPipelineProfile.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.VulkanPipelineProfile[] r0 = (me.magnum.melonds.domain.model.VulkanPipelineProfile[]) r0
            return r0
    }

    public final boolean getUsesFastPath() {
            r1 = this;
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = me.magnum.melonds.domain.model.VulkanPipelineProfile.FASTPATH
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }
}
