package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hh5  reason: default package */
/* loaded from: classes.dex */
public enum hh5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.hh5[] $VALUES = null;
    public static final defpackage.hh5 ALLOW = null;
    public static final defpackage.hh5 BLOCK_ALL = null;
    public static final defpackage.hh5 BLOCK_INACCESSIBLE = null;
    public static final defpackage.hh5 INDECISIVE = null;

    private static /* synthetic */ defpackage.hh5[] $values() {
            hh5 r0 = defpackage.hh5.ALLOW
            hh5 r1 = defpackage.hh5.INDECISIVE
            hh5 r2 = defpackage.hh5.BLOCK_INACCESSIBLE
            hh5 r3 = defpackage.hh5.BLOCK_ALL
            hh5[] r0 = new defpackage.hh5[]{r0, r1, r2, r3}
            return r0
    }

    static {
            hh5 r0 = new hh5
            java.lang.String r1 = "ALLOW"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.hh5.ALLOW = r0
            hh5 r0 = new hh5
            java.lang.String r1 = "INDECISIVE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.hh5.INDECISIVE = r0
            hh5 r0 = new hh5
            java.lang.String r1 = "BLOCK_INACCESSIBLE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.hh5.BLOCK_INACCESSIBLE = r0
            hh5 r0 = new hh5
            java.lang.String r1 = "BLOCK_ALL"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.hh5.BLOCK_ALL = r0
            hh5[] r0 = $values()
            defpackage.hh5.$VALUES = r0
            return
    }

    hh5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.hh5 valueOf(java.lang.String r1) {
            java.lang.Class<hh5> r0 = defpackage.hh5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hh5 r1 = (defpackage.hh5) r1
            return r1
    }

    public static defpackage.hh5[] values() {
            hh5[] r0 = defpackage.hh5.$VALUES
            java.lang.Object r0 = r0.clone()
            hh5[] r0 = (defpackage.hh5[]) r0
            return r0
    }
}
