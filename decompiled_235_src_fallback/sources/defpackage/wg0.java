package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg0  reason: default package */
/* loaded from: classes.dex */
public enum wg0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.wg0[] $VALUES = null;
    public static final defpackage.wg0 CAMERA = null;
    public static final defpackage.wg0 SCOPE = null;
    public static final defpackage.wg0 THREAD = null;

    private static final /* synthetic */ defpackage.wg0[] $values() {
            wg0 r0 = defpackage.wg0.CAMERA
            wg0 r1 = defpackage.wg0.SCOPE
            wg0 r2 = defpackage.wg0.THREAD
            wg0[] r0 = new defpackage.wg0[]{r0, r1, r2}
            return r0
    }

    static {
            wg0 r0 = new wg0
            java.lang.String r1 = "CAMERA"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.wg0.CAMERA = r0
            wg0 r0 = new wg0
            java.lang.String r1 = "SCOPE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.wg0.SCOPE = r0
            wg0 r0 = new wg0
            java.lang.String r1 = "THREAD"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.wg0.THREAD = r0
            wg0[] r0 = $values()
            defpackage.wg0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.wg0.$ENTRIES = r0
            return
    }

    wg0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.wg0.$ENTRIES
            return r0
    }

    public static defpackage.wg0 valueOf(java.lang.String r1) {
            java.lang.Class<wg0> r0 = defpackage.wg0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            wg0 r1 = (defpackage.wg0) r1
            return r1
    }

    public static defpackage.wg0[] values() {
            wg0[] r0 = defpackage.wg0.$VALUES
            java.lang.Object r0 = r0.clone()
            wg0[] r0 = (defpackage.wg0[]) r0
            return r0
    }
}
