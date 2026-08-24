package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g55  reason: default package */
/* loaded from: classes.dex */
public enum g55 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.g55[] $VALUES = null;
    public static final defpackage.g55 ACCEPTABLE = null;
    public static final defpackage.g55 COLLECTION = null;
    public static final defpackage.g55 LIST_ELEMENT = null;
    public static final defpackage.g55 NOT_NULL = null;
    public static final defpackage.g55 OPTIONAL = null;

    private static final /* synthetic */ defpackage.g55[] $values() {
            g55 r0 = defpackage.g55.ACCEPTABLE
            g55 r1 = defpackage.g55.OPTIONAL
            g55 r2 = defpackage.g55.COLLECTION
            g55 r3 = defpackage.g55.LIST_ELEMENT
            g55 r4 = defpackage.g55.NOT_NULL
            g55[] r0 = new defpackage.g55[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            g55 r0 = new g55
            java.lang.String r1 = "ACCEPTABLE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.g55.ACCEPTABLE = r0
            g55 r0 = new g55
            java.lang.String r1 = "OPTIONAL"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.g55.OPTIONAL = r0
            g55 r0 = new g55
            java.lang.String r1 = "COLLECTION"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.g55.COLLECTION = r0
            g55 r0 = new g55
            java.lang.String r1 = "LIST_ELEMENT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.g55.LIST_ELEMENT = r0
            g55 r0 = new g55
            java.lang.String r1 = "NOT_NULL"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.g55.NOT_NULL = r0
            g55[] r0 = $values()
            defpackage.g55.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.g55.$ENTRIES = r0
            return
    }

    g55(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.g55.$ENTRIES
            return r0
    }

    public static defpackage.g55 valueOf(java.lang.String r1) {
            java.lang.Class<g55> r0 = defpackage.g55.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            g55 r1 = (defpackage.g55) r1
            return r1
    }

    public static defpackage.g55[] values() {
            g55[] r0 = defpackage.g55.$VALUES
            java.lang.Object r0 = r0.clone()
            g55[] r0 = (defpackage.g55[]) r0
            return r0
    }
}
