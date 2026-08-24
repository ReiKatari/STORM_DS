package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c11  reason: default package */
/* loaded from: classes.dex */
public enum c11 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.c11[] $VALUES = null;
    public static final defpackage.c11 CRIMSON_RED = null;
    public static final defpackage.c11 DSI_XL_BLUE = null;
    public static final defpackage.c11 DS_LITE_BLACK = null;
    public static final defpackage.c11 DS_LITE_WHITE = null;
    public static final defpackage.c11 N3DS_AQUA = null;
    public static final defpackage.c11 N3DS_BLACK = null;

    private static final /* synthetic */ defpackage.c11[] $values() {
            c11 r0 = defpackage.c11.DS_LITE_BLACK
            c11 r1 = defpackage.c11.DS_LITE_WHITE
            c11 r2 = defpackage.c11.DSI_XL_BLUE
            c11 r3 = defpackage.c11.CRIMSON_RED
            c11 r4 = defpackage.c11.N3DS_AQUA
            c11 r5 = defpackage.c11.N3DS_BLACK
            c11[] r0 = new defpackage.c11[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            c11 r0 = new c11
            java.lang.String r1 = "DS_LITE_BLACK"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.c11.DS_LITE_BLACK = r0
            c11 r0 = new c11
            java.lang.String r1 = "DS_LITE_WHITE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.c11.DS_LITE_WHITE = r0
            c11 r0 = new c11
            java.lang.String r1 = "DSI_XL_BLUE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.c11.DSI_XL_BLUE = r0
            c11 r0 = new c11
            java.lang.String r1 = "CRIMSON_RED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.c11.CRIMSON_RED = r0
            c11 r0 = new c11
            java.lang.String r1 = "N3DS_AQUA"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.c11.N3DS_AQUA = r0
            c11 r0 = new c11
            java.lang.String r1 = "N3DS_BLACK"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.c11.N3DS_BLACK = r0
            c11[] r0 = $values()
            defpackage.c11.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.c11.$ENTRIES = r0
            return
    }

    c11(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.c11.$ENTRIES
            return r0
    }

    public static defpackage.c11 valueOf(java.lang.String r1) {
            java.lang.Class<c11> r0 = defpackage.c11.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            c11 r1 = (defpackage.c11) r1
            return r1
    }

    public static defpackage.c11[] values() {
            c11[] r0 = defpackage.c11.$VALUES
            java.lang.Object r0 = r0.clone()
            c11[] r0 = (defpackage.c11[]) r0
            return r0
    }
}
