package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl7  reason: default package */
/* loaded from: classes.dex */
public enum wl7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.wl7[] $VALUES = null;
    public static final defpackage.wl7 ALPHA = null;
    public static final defpackage.wl7 BETA = null;
    public static final defpackage.wl7 FINAL = null;
    public static final defpackage.wl7 NIGHTLY = null;
    public static final defpackage.wl7 RC = null;

    private static final /* synthetic */ defpackage.wl7[] $values() {
            wl7 r0 = defpackage.wl7.ALPHA
            wl7 r1 = defpackage.wl7.BETA
            wl7 r2 = defpackage.wl7.RC
            wl7 r3 = defpackage.wl7.FINAL
            wl7 r4 = defpackage.wl7.NIGHTLY
            wl7[] r0 = new defpackage.wl7[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            wl7 r0 = new wl7
            java.lang.String r1 = "ALPHA"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.wl7.ALPHA = r0
            wl7 r0 = new wl7
            java.lang.String r1 = "BETA"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.wl7.BETA = r0
            wl7 r0 = new wl7
            java.lang.String r1 = "RC"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.wl7.RC = r0
            wl7 r0 = new wl7
            java.lang.String r1 = "FINAL"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.wl7.FINAL = r0
            wl7 r0 = new wl7
            java.lang.String r1 = "NIGHTLY"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.wl7.NIGHTLY = r0
            wl7[] r0 = $values()
            defpackage.wl7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.wl7.$ENTRIES = r0
            return
    }

    wl7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.wl7.$ENTRIES
            return r0
    }

    public static defpackage.wl7 valueOf(java.lang.String r1) {
            java.lang.Class<wl7> r0 = defpackage.wl7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            wl7 r1 = (defpackage.wl7) r1
            return r1
    }

    public static defpackage.wl7[] values() {
            wl7[] r0 = defpackage.wl7.$VALUES
            java.lang.Object r0 = r0.clone()
            wl7[] r0 = (defpackage.wl7[]) r0
            return r0
    }
}
