package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c26  reason: default package */
/* loaded from: classes.dex */
public enum c26 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.c26[] $VALUES = null;
    public static final defpackage.c26 PATH = null;
    public static final defpackage.c26 QUERY = null;

    private static final /* synthetic */ defpackage.c26[] $values() {
            c26 r0 = defpackage.c26.PATH
            c26 r1 = defpackage.c26.QUERY
            c26[] r0 = new defpackage.c26[]{r0, r1}
            return r0
    }

    static {
            c26 r0 = new c26
            java.lang.String r1 = "PATH"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.c26.PATH = r0
            c26 r0 = new c26
            java.lang.String r1 = "QUERY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.c26.QUERY = r0
            c26[] r0 = $values()
            defpackage.c26.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.c26.$ENTRIES = r0
            return
    }

    c26(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.c26.$ENTRIES
            return r0
    }

    public static defpackage.c26 valueOf(java.lang.String r1) {
            java.lang.Class<c26> r0 = defpackage.c26.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            c26 r1 = (defpackage.c26) r1
            return r1
    }

    public static defpackage.c26[] values() {
            c26[] r0 = defpackage.c26.$VALUES
            java.lang.Object r0 = r0.clone()
            c26[] r0 = (defpackage.c26[]) r0
            return r0
    }
}
