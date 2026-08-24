package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da2  reason: default package */
/* loaded from: classes.dex */
public enum da2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.da2[] $VALUES = null;
    public static final defpackage.da2 DYNAMIC_RANGE = null;
    public static final defpackage.da2 FPS_RANGE = null;
    public static final defpackage.da2 IMAGE_FORMAT = null;
    public static final defpackage.da2 RECORDING_QUALITY = null;
    public static final defpackage.da2 VIDEO_STABILIZATION = null;

    private static final /* synthetic */ defpackage.da2[] $values() {
            da2 r0 = defpackage.da2.DYNAMIC_RANGE
            da2 r1 = defpackage.da2.FPS_RANGE
            da2 r2 = defpackage.da2.VIDEO_STABILIZATION
            da2 r3 = defpackage.da2.IMAGE_FORMAT
            da2 r4 = defpackage.da2.RECORDING_QUALITY
            da2[] r0 = new defpackage.da2[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            da2 r0 = new da2
            java.lang.String r1 = "DYNAMIC_RANGE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.da2.DYNAMIC_RANGE = r0
            da2 r0 = new da2
            java.lang.String r1 = "FPS_RANGE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.da2.FPS_RANGE = r0
            da2 r0 = new da2
            java.lang.String r1 = "VIDEO_STABILIZATION"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.da2.VIDEO_STABILIZATION = r0
            da2 r0 = new da2
            java.lang.String r1 = "IMAGE_FORMAT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.da2.IMAGE_FORMAT = r0
            da2 r0 = new da2
            java.lang.String r1 = "RECORDING_QUALITY"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.da2.RECORDING_QUALITY = r0
            da2[] r0 = $values()
            defpackage.da2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.da2.$ENTRIES = r0
            return
    }

    da2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.da2.$ENTRIES
            return r0
    }

    public static defpackage.da2 valueOf(java.lang.String r1) {
            java.lang.Class<da2> r0 = defpackage.da2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            da2 r1 = (defpackage.da2) r1
            return r1
    }

    public static defpackage.da2[] values() {
            da2[] r0 = defpackage.da2.$VALUES
            java.lang.Object r0 = r0.clone()
            da2[] r0 = (defpackage.da2[]) r0
            return r0
    }
}
