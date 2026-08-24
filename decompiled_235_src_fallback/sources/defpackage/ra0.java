package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ra0  reason: default package */
/* loaded from: classes.dex */
public enum ra0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ra0[] $VALUES = null;
    public static final defpackage.ra0 DISABLED = null;
    public static final defpackage.ra0 ENABLED = null;
    public static final defpackage.ra0 READ_ONLY = null;
    public static final defpackage.ra0 WRITE_ONLY = null;
    private final boolean readEnabled;
    private final boolean writeEnabled;

    private static final /* synthetic */ defpackage.ra0[] $values() {
            ra0 r0 = defpackage.ra0.ENABLED
            ra0 r1 = defpackage.ra0.READ_ONLY
            ra0 r2 = defpackage.ra0.WRITE_ONLY
            ra0 r3 = defpackage.ra0.DISABLED
            ra0[] r0 = new defpackage.ra0[]{r0, r1, r2, r3}
            return r0
    }

    static {
            ra0 r0 = new ra0
            java.lang.String r1 = "ENABLED"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3, r3)
            defpackage.ra0.ENABLED = r0
            ra0 r0 = new ra0
            java.lang.String r1 = "READ_ONLY"
            r0.<init>(r1, r3, r3, r2)
            defpackage.ra0.READ_ONLY = r0
            ra0 r0 = new ra0
            java.lang.String r1 = "WRITE_ONLY"
            r4 = 2
            r0.<init>(r1, r4, r2, r3)
            defpackage.ra0.WRITE_ONLY = r0
            ra0 r0 = new ra0
            java.lang.String r1 = "DISABLED"
            r3 = 3
            r0.<init>(r1, r3, r2, r2)
            defpackage.ra0.DISABLED = r0
            ra0[] r0 = $values()
            defpackage.ra0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ra0.$ENTRIES = r0
            return
    }

    ra0(java.lang.String r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.readEnabled = r3
            r0.writeEnabled = r4
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ra0.$ENTRIES
            return r0
    }

    public static defpackage.ra0 valueOf(java.lang.String r1) {
            java.lang.Class<ra0> r0 = defpackage.ra0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ra0 r1 = (defpackage.ra0) r1
            return r1
    }

    public static defpackage.ra0[] values() {
            ra0[] r0 = defpackage.ra0.$VALUES
            java.lang.Object r0 = r0.clone()
            ra0[] r0 = (defpackage.ra0[]) r0
            return r0
    }

    public final boolean getReadEnabled() {
            r0 = this;
            boolean r0 = r0.readEnabled
            return r0
    }

    public final boolean getWriteEnabled() {
            r0 = this;
            boolean r0 = r0.writeEnabled
            return r0
    }
}
