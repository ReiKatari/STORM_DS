package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum VideoRenderer extends java.lang.Enum<me.magnum.melonds.domain.model.VideoRenderer> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.VideoRenderer[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.VideoRenderer COMPUTE = null;
    public static final me.magnum.melonds.domain.model.VideoRenderer OPENGL = null;
    public static final me.magnum.melonds.domain.model.VideoRenderer SOFTWARE = null;
    public static final me.magnum.melonds.domain.model.VideoRenderer VULKAN = null;
    private final int renderer;

    private static final /* synthetic */ me.magnum.melonds.domain.model.VideoRenderer[] $values() {
            me.magnum.melonds.domain.model.VideoRenderer r0 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE
            me.magnum.melonds.domain.model.VideoRenderer r1 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL
            me.magnum.melonds.domain.model.VideoRenderer r2 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            me.magnum.melonds.domain.model.VideoRenderer r3 = me.magnum.melonds.domain.model.VideoRenderer.COMPUTE
            me.magnum.melonds.domain.model.VideoRenderer[] r0 = new me.magnum.melonds.domain.model.VideoRenderer[]{r0, r1, r2, r3}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.VideoRenderer r0 = new me.magnum.melonds.domain.model.VideoRenderer
            java.lang.String r1 = "SOFTWARE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE = r0
            me.magnum.melonds.domain.model.VideoRenderer r0 = new me.magnum.melonds.domain.model.VideoRenderer
            java.lang.String r1 = "OPENGL"
            r2 = 1
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.VideoRenderer.OPENGL = r0
            me.magnum.melonds.domain.model.VideoRenderer r0 = new me.magnum.melonds.domain.model.VideoRenderer
            java.lang.String r1 = "VULKAN"
            r2 = 2
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.VideoRenderer.VULKAN = r0
            me.magnum.melonds.domain.model.VideoRenderer r0 = new me.magnum.melonds.domain.model.VideoRenderer
            java.lang.String r1 = "COMPUTE"
            r2 = 3
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.VideoRenderer.COMPUTE = r0
            me.magnum.melonds.domain.model.VideoRenderer[] r0 = $values()
            me.magnum.melonds.domain.model.VideoRenderer.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.VideoRenderer.$ENTRIES = r0
            return
    }

    VideoRenderer(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.renderer = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.VideoRenderer.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.VideoRenderer valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.VideoRenderer> r0 = me.magnum.melonds.domain.model.VideoRenderer.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.VideoRenderer r1 = (me.magnum.melonds.domain.model.VideoRenderer) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.VideoRenderer[] values() {
            me.magnum.melonds.domain.model.VideoRenderer[] r0 = me.magnum.melonds.domain.model.VideoRenderer.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.VideoRenderer[] r0 = (me.magnum.melonds.domain.model.VideoRenderer[]) r0
            return r0
    }

    public final int getRenderer() {
            r0 = this;
            int r0 = r0.renderer
            return r0
    }
}
