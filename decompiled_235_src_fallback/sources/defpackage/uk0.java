package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk0  reason: default package */
/* loaded from: classes.dex */
public enum uk0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.uk0[] $VALUES = null;
    public static final defpackage.uk0 CLOSED = null;
    public static final defpackage.uk0 CLOSING = null;
    public static final defpackage.uk0 CREATED = null;
    public static final defpackage.uk0 CREATING = null;
    public static final defpackage.uk0 PENDING = null;

    private static final /* synthetic */ defpackage.uk0[] $values() {
            uk0 r0 = defpackage.uk0.PENDING
            uk0 r1 = defpackage.uk0.CREATING
            uk0 r2 = defpackage.uk0.CREATED
            uk0 r3 = defpackage.uk0.CLOSING
            uk0 r4 = defpackage.uk0.CLOSED
            uk0[] r0 = new defpackage.uk0[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            uk0 r0 = new uk0
            java.lang.String r1 = "PENDING"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.uk0.PENDING = r0
            uk0 r0 = new uk0
            java.lang.String r1 = "CREATING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.uk0.CREATING = r0
            uk0 r0 = new uk0
            java.lang.String r1 = "CREATED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.uk0.CREATED = r0
            uk0 r0 = new uk0
            java.lang.String r1 = "CLOSING"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.uk0.CLOSING = r0
            uk0 r0 = new uk0
            java.lang.String r1 = "CLOSED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.uk0.CLOSED = r0
            uk0[] r0 = $values()
            defpackage.uk0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.uk0.$ENTRIES = r0
            return
    }

    uk0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.uk0.$ENTRIES
            return r0
    }

    public static defpackage.uk0 valueOf(java.lang.String r1) {
            java.lang.Class<uk0> r0 = defpackage.uk0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            uk0 r1 = (defpackage.uk0) r1
            return r1
    }

    public static defpackage.uk0[] values() {
            uk0[] r0 = defpackage.uk0.$VALUES
            java.lang.Object r0 = r0.clone()
            uk0[] r0 = (defpackage.uk0[]) r0
            return r0
    }
}
