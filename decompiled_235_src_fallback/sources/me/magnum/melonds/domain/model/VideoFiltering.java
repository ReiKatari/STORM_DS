package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum VideoFiltering extends java.lang.Enum<me.magnum.melonds.domain.model.VideoFiltering> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.VideoFiltering[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering AI_UPSCALE = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering HQ2X = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering HQ4X = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering LCD = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering LINEAR = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering NONE = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering QUILEZ = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering RETROARCH = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering SCANLINES = null;
    public static final me.magnum.melonds.domain.model.VideoFiltering XBR2 = null;

    private static final /* synthetic */ me.magnum.melonds.domain.model.VideoFiltering[] $values() {
            me.magnum.melonds.domain.model.VideoFiltering r0 = me.magnum.melonds.domain.model.VideoFiltering.NONE
            me.magnum.melonds.domain.model.VideoFiltering r1 = me.magnum.melonds.domain.model.VideoFiltering.LINEAR
            me.magnum.melonds.domain.model.VideoFiltering r2 = me.magnum.melonds.domain.model.VideoFiltering.XBR2
            me.magnum.melonds.domain.model.VideoFiltering r3 = me.magnum.melonds.domain.model.VideoFiltering.HQ2X
            me.magnum.melonds.domain.model.VideoFiltering r4 = me.magnum.melonds.domain.model.VideoFiltering.HQ4X
            me.magnum.melonds.domain.model.VideoFiltering r5 = me.magnum.melonds.domain.model.VideoFiltering.QUILEZ
            me.magnum.melonds.domain.model.VideoFiltering r6 = me.magnum.melonds.domain.model.VideoFiltering.LCD
            me.magnum.melonds.domain.model.VideoFiltering r7 = me.magnum.melonds.domain.model.VideoFiltering.SCANLINES
            me.magnum.melonds.domain.model.VideoFiltering r8 = me.magnum.melonds.domain.model.VideoFiltering.AI_UPSCALE
            me.magnum.melonds.domain.model.VideoFiltering r9 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            me.magnum.melonds.domain.model.VideoFiltering[] r0 = new me.magnum.melonds.domain.model.VideoFiltering[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.NONE = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "LINEAR"
            r2 = 1
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.LINEAR = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "XBR2"
            r2 = 2
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.XBR2 = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "HQ2X"
            r2 = 3
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.HQ2X = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "HQ4X"
            r2 = 4
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.HQ4X = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "QUILEZ"
            r2 = 5
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.QUILEZ = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "LCD"
            r2 = 6
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.LCD = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "SCANLINES"
            r2 = 7
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.SCANLINES = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "AI_UPSCALE"
            r2 = 8
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.AI_UPSCALE = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = new me.magnum.melonds.domain.model.VideoFiltering
            java.lang.String r1 = "RETROARCH"
            r2 = 9
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.VideoFiltering.RETROARCH = r0
            me.magnum.melonds.domain.model.VideoFiltering[] r0 = $values()
            me.magnum.melonds.domain.model.VideoFiltering.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.VideoFiltering.$ENTRIES = r0
            return
    }

    VideoFiltering(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.VideoFiltering.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.VideoFiltering valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.VideoFiltering> r0 = me.magnum.melonds.domain.model.VideoFiltering.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.VideoFiltering r1 = (me.magnum.melonds.domain.model.VideoFiltering) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.VideoFiltering[] values() {
            me.magnum.melonds.domain.model.VideoFiltering[] r0 = me.magnum.melonds.domain.model.VideoFiltering.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.VideoFiltering[] r0 = (me.magnum.melonds.domain.model.VideoFiltering[]) r0
            return r0
    }

    public final boolean isSupportedByOpenGlSurface() {
            r1 = this;
            me.magnum.melonds.domain.model.VideoFiltering r0 = me.magnum.melonds.domain.model.VideoFiltering.SCANLINES
            if (r1 == r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public final boolean isSupportedByRenderer(me.magnum.melonds.domain.model.VideoRenderer r2) {
            r1 = this;
            r2.getClass()
            int[] r0 = defpackage.nm7.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 == r0) goto L16
            boolean r1 = r1.isSupportedByOpenGlSurface()
            return r1
        L16:
            boolean r1 = r1.isSupportedByVulkan()
            return r1
        L1b:
            me.magnum.melonds.domain.model.VideoFiltering r2 = me.magnum.melonds.domain.model.VideoFiltering.AI_UPSCALE
            if (r1 == r2) goto L28
            me.magnum.melonds.domain.model.VideoFiltering r2 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            if (r1 == r2) goto L28
            me.magnum.melonds.domain.model.VideoFiltering r2 = me.magnum.melonds.domain.model.VideoFiltering.SCANLINES
            if (r1 == r2) goto L28
            return r0
        L28:
            r1 = 0
            return r1
    }

    public final boolean isSupportedByVulkan() {
            r0 = this;
            r0 = 1
            return r0
    }
}
