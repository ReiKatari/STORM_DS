package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xj1  reason: default package */
/* loaded from: classes.dex */
public enum xj1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.xj1[] $VALUES = null;
    public static final defpackage.xj1 NOT_FOUND = null;
    public static final defpackage.xj1 OK = null;
    public static final defpackage.xj1 READ_ONLY = null;

    private static final /* synthetic */ defpackage.xj1[] $values() {
            xj1 r0 = defpackage.xj1.OK
            xj1 r1 = defpackage.xj1.READ_ONLY
            xj1 r2 = defpackage.xj1.NOT_FOUND
            xj1[] r0 = new defpackage.xj1[]{r0, r1, r2}
            return r0
    }

    static {
            xj1 r0 = new xj1
            java.lang.String r1 = "OK"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xj1.OK = r0
            xj1 r0 = new xj1
            java.lang.String r1 = "READ_ONLY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.xj1.READ_ONLY = r0
            xj1 r0 = new xj1
            java.lang.String r1 = "NOT_FOUND"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.xj1.NOT_FOUND = r0
            xj1[] r0 = $values()
            defpackage.xj1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.xj1.$ENTRIES = r0
            return
    }

    xj1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.xj1.$ENTRIES
            return r0
    }

    public static defpackage.xj1 valueOf(java.lang.String r1) {
            java.lang.Class<xj1> r0 = defpackage.xj1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xj1 r1 = (defpackage.xj1) r1
            return r1
    }

    public static defpackage.xj1[] values() {
            xj1[] r0 = defpackage.xj1.$VALUES
            java.lang.Object r0 = r0.clone()
            xj1[] r0 = (defpackage.xj1[]) r0
            return r0
    }
}
