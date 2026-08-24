package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d63  reason: default package */
/* loaded from: classes.dex */
public enum d63 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.d63[] $VALUES = null;
    public static final defpackage.d63 NEGATIVE = null;
    public static final defpackage.d63 POSITIVE = null;

    private static final /* synthetic */ defpackage.d63[] $values() {
            d63 r0 = defpackage.d63.POSITIVE
            d63 r1 = defpackage.d63.NEGATIVE
            d63[] r0 = new defpackage.d63[]{r0, r1}
            return r0
    }

    static {
            d63 r0 = new d63
            java.lang.String r1 = "POSITIVE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.d63.POSITIVE = r0
            d63 r0 = new d63
            java.lang.String r1 = "NEGATIVE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.d63.NEGATIVE = r0
            d63[] r0 = $values()
            defpackage.d63.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.d63.$ENTRIES = r0
            return
    }

    d63(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.d63.$ENTRIES
            return r0
    }

    public static defpackage.d63 valueOf(java.lang.String r1) {
            java.lang.Class<d63> r0 = defpackage.d63.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            d63 r1 = (defpackage.d63) r1
            return r1
    }

    public static defpackage.d63[] values() {
            d63[] r0 = defpackage.d63.$VALUES
            java.lang.Object r0 = r0.clone()
            d63[] r0 = (defpackage.d63[]) r0
            return r0
    }
}
