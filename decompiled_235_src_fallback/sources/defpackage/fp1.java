package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp1  reason: default package */
/* loaded from: classes.dex */
public enum fp1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.fp1[] $VALUES = null;
    public static final defpackage.fp1 Closed = null;
    public static final defpackage.fp1 Open = null;

    private static final /* synthetic */ defpackage.fp1[] $values() {
            fp1 r0 = defpackage.fp1.Closed
            fp1 r1 = defpackage.fp1.Open
            fp1[] r0 = new defpackage.fp1[]{r0, r1}
            return r0
    }

    static {
            fp1 r0 = new fp1
            java.lang.String r1 = "Closed"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.fp1.Closed = r0
            fp1 r0 = new fp1
            java.lang.String r1 = "Open"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.fp1.Open = r0
            fp1[] r0 = $values()
            defpackage.fp1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.fp1.$ENTRIES = r0
            return
    }

    fp1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.fp1.$ENTRIES
            return r0
    }

    public static defpackage.fp1 valueOf(java.lang.String r1) {
            java.lang.Class<fp1> r0 = defpackage.fp1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fp1 r1 = (defpackage.fp1) r1
            return r1
    }

    public static defpackage.fp1[] values() {
            fp1[] r0 = defpackage.fp1.$VALUES
            java.lang.Object r0 = r0.clone()
            fp1[] r0 = (defpackage.fp1[]) r0
            return r0
    }
}
