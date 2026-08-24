package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o03  reason: default package */
/* loaded from: classes.dex */
public enum o03 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.o03[] $VALUES = null;
    public static final defpackage.o03 DYNAMIC_CODES = null;
    public static final defpackage.o03 FIXED_CODES = null;
    public static final defpackage.o03 INITIAL = null;
    public static final defpackage.o03 STORED = null;

    private static /* synthetic */ defpackage.o03[] $values() {
            o03 r0 = defpackage.o03.INITIAL
            o03 r1 = defpackage.o03.STORED
            o03 r2 = defpackage.o03.DYNAMIC_CODES
            o03 r3 = defpackage.o03.FIXED_CODES
            o03[] r0 = new defpackage.o03[]{r0, r1, r2, r3}
            return r0
    }

    static {
            o03 r0 = new o03
            java.lang.String r1 = "INITIAL"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.o03.INITIAL = r0
            o03 r0 = new o03
            java.lang.String r1 = "STORED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.o03.STORED = r0
            o03 r0 = new o03
            java.lang.String r1 = "DYNAMIC_CODES"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.o03.DYNAMIC_CODES = r0
            o03 r0 = new o03
            java.lang.String r1 = "FIXED_CODES"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.o03.FIXED_CODES = r0
            o03[] r0 = $values()
            defpackage.o03.$VALUES = r0
            return
    }

    o03(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.o03 valueOf(java.lang.String r1) {
            java.lang.Class<o03> r0 = defpackage.o03.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            o03 r1 = (defpackage.o03) r1
            return r1
    }

    public static defpackage.o03[] values() {
            o03[] r0 = defpackage.o03.$VALUES
            java.lang.Object r0 = r0.clone()
            o03[] r0 = (defpackage.o03[]) r0
            return r0
    }
}
