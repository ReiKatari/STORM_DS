package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wn0  reason: default package */
/* loaded from: classes.dex */
public enum wn0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.wn0[] $VALUES = null;
    public static final defpackage.wn0 CANNOT_BE_EMPTY = null;
    public static final defpackage.wn0 INVALID_FORMAT = null;

    private static final /* synthetic */ defpackage.wn0[] $values() {
            wn0 r0 = defpackage.wn0.CANNOT_BE_EMPTY
            wn0 r1 = defpackage.wn0.INVALID_FORMAT
            wn0[] r0 = new defpackage.wn0[]{r0, r1}
            return r0
    }

    static {
            wn0 r0 = new wn0
            java.lang.String r1 = "CANNOT_BE_EMPTY"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.wn0.CANNOT_BE_EMPTY = r0
            wn0 r0 = new wn0
            java.lang.String r1 = "INVALID_FORMAT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.wn0.INVALID_FORMAT = r0
            wn0[] r0 = $values()
            defpackage.wn0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.wn0.$ENTRIES = r0
            return
    }

    wn0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.wn0.$ENTRIES
            return r0
    }

    public static defpackage.wn0 valueOf(java.lang.String r1) {
            java.lang.Class<wn0> r0 = defpackage.wn0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            wn0 r1 = (defpackage.wn0) r1
            return r1
    }

    public static defpackage.wn0[] values() {
            wn0[] r0 = defpackage.wn0.$VALUES
            java.lang.Object r0 = r0.clone()
            wn0[] r0 = (defpackage.wn0[]) r0
            return r0
    }
}
