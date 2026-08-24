package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nl4  reason: default package */
/* loaded from: classes.dex */
public enum nl4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.nl4[] $VALUES = null;
    public static final defpackage.nl4 SKIP = null;
    public static final defpackage.nl4 TERMINATE = null;

    private static final /* synthetic */ defpackage.nl4[] $values() {
            nl4 r0 = defpackage.nl4.SKIP
            nl4 r1 = defpackage.nl4.TERMINATE
            nl4[] r0 = new defpackage.nl4[]{r0, r1}
            return r0
    }

    static {
            nl4 r0 = new nl4
            java.lang.String r1 = "SKIP"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.nl4.SKIP = r0
            nl4 r0 = new nl4
            java.lang.String r1 = "TERMINATE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.nl4.TERMINATE = r0
            nl4[] r0 = $values()
            defpackage.nl4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.nl4.$ENTRIES = r0
            return
    }

    nl4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.nl4.$ENTRIES
            return r0
    }

    public static defpackage.nl4 valueOf(java.lang.String r1) {
            java.lang.Class<nl4> r0 = defpackage.nl4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            nl4 r1 = (defpackage.nl4) r1
            return r1
    }

    public static defpackage.nl4[] values() {
            nl4[] r0 = defpackage.nl4.$VALUES
            java.lang.Object r0 = r0.clone()
            nl4[] r0 = (defpackage.nl4[]) r0
            return r0
    }
}
