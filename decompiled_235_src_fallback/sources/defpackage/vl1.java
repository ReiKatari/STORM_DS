package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl1  reason: default package */
/* loaded from: classes.dex */
public enum vl1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.vl1[] $VALUES = null;
    public static final defpackage.vl1 DOCUMENT = null;
    public static final defpackage.vl1 LOCAL = null;

    private static final /* synthetic */ defpackage.vl1[] $values() {
            vl1 r0 = defpackage.vl1.LOCAL
            vl1 r1 = defpackage.vl1.DOCUMENT
            vl1[] r0 = new defpackage.vl1[]{r0, r1}
            return r0
    }

    static {
            vl1 r0 = new vl1
            java.lang.String r1 = "LOCAL"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.vl1.LOCAL = r0
            vl1 r0 = new vl1
            java.lang.String r1 = "DOCUMENT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.vl1.DOCUMENT = r0
            vl1[] r0 = $values()
            defpackage.vl1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.vl1.$ENTRIES = r0
            return
    }

    vl1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.vl1.$ENTRIES
            return r0
    }

    public static defpackage.vl1 valueOf(java.lang.String r1) {
            java.lang.Class<vl1> r0 = defpackage.vl1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            vl1 r1 = (defpackage.vl1) r1
            return r1
    }

    public static defpackage.vl1[] values() {
            vl1[] r0 = defpackage.vl1.$VALUES
            java.lang.Object r0 = r0.clone()
            vl1[] r0 = (defpackage.vl1[]) r0
            return r0
    }
}
