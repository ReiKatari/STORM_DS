package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sv4  reason: default package */
/* loaded from: classes.dex */
public enum sv4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.sv4[] $VALUES = null;
    public static final defpackage.sv4 READ = null;
    public static final defpackage.sv4 READ_WRITE = null;
    public static final defpackage.sv4 WRITE = null;

    private static final /* synthetic */ defpackage.sv4[] $values() {
            sv4 r0 = defpackage.sv4.READ
            sv4 r1 = defpackage.sv4.WRITE
            sv4 r2 = defpackage.sv4.READ_WRITE
            sv4[] r0 = new defpackage.sv4[]{r0, r1, r2}
            return r0
    }

    static {
            sv4 r0 = new sv4
            java.lang.String r1 = "READ"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.sv4.READ = r0
            sv4 r0 = new sv4
            java.lang.String r1 = "WRITE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.sv4.WRITE = r0
            sv4 r0 = new sv4
            java.lang.String r1 = "READ_WRITE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.sv4.READ_WRITE = r0
            sv4[] r0 = $values()
            defpackage.sv4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.sv4.$ENTRIES = r0
            return
    }

    sv4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.sv4.$ENTRIES
            return r0
    }

    public static defpackage.sv4 valueOf(java.lang.String r1) {
            java.lang.Class<sv4> r0 = defpackage.sv4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sv4 r1 = (defpackage.sv4) r1
            return r1
    }

    public static defpackage.sv4[] values() {
            sv4[] r0 = defpackage.sv4.$VALUES
            java.lang.Object r0 = r0.clone()
            sv4[] r0 = (defpackage.sv4[]) r0
            return r0
    }

    public final int toFlags() {
            r1 = this;
            int[] r0 = defpackage.rv4.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L17
            r0 = 2
            if (r1 == r0) goto L17
            r0 = 3
            if (r1 != r0) goto L12
            return r0
        L12:
            defpackage.i.d()
            r1 = 0
            return r1
        L17:
            return r0
    }
}
