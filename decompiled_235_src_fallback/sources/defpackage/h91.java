package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h91  reason: default package */
/* loaded from: classes.dex */
public enum h91 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.h91[] $VALUES = null;
    public static final defpackage.h91 BLACK_SCREEN = null;
    public static final defpackage.h91 PHYSICAL_CAMERAS = null;
    public static final defpackage.h91 STATIC_IMAGE = null;

    private static final /* synthetic */ defpackage.h91[] $values() {
            h91 r0 = defpackage.h91.BLACK_SCREEN
            h91 r1 = defpackage.h91.PHYSICAL_CAMERAS
            h91 r2 = defpackage.h91.STATIC_IMAGE
            h91[] r0 = new defpackage.h91[]{r0, r1, r2}
            return r0
    }

    static {
            h91 r0 = new h91
            java.lang.String r1 = "BLACK_SCREEN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.h91.BLACK_SCREEN = r0
            h91 r0 = new h91
            java.lang.String r1 = "PHYSICAL_CAMERAS"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.h91.PHYSICAL_CAMERAS = r0
            h91 r0 = new h91
            java.lang.String r1 = "STATIC_IMAGE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.h91.STATIC_IMAGE = r0
            h91[] r0 = $values()
            defpackage.h91.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.h91.$ENTRIES = r0
            return
    }

    h91(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.h91.$ENTRIES
            return r0
    }

    public static defpackage.h91 valueOf(java.lang.String r1) {
            java.lang.Class<h91> r0 = defpackage.h91.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            h91 r1 = (defpackage.h91) r1
            return r1
    }

    public static defpackage.h91[] values() {
            h91[] r0 = defpackage.h91.$VALUES
            java.lang.Object r0 = r0.clone()
            h91[] r0 = (defpackage.h91[]) r0
            return r0
    }
}
