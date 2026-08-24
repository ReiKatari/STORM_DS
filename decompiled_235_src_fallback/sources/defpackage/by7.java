package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by7  reason: default package */
/* loaded from: classes.dex */
public enum by7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.by7[] $VALUES = null;
    public static final defpackage.by7 LIST = null;
    public static final defpackage.by7 MAP = null;
    public static final defpackage.by7 OBJ = null;
    public static final defpackage.by7 POLY_OBJ = null;
    public final char begin;
    public final char end;

    private static final /* synthetic */ defpackage.by7[] $values() {
            by7 r0 = defpackage.by7.OBJ
            by7 r1 = defpackage.by7.LIST
            by7 r2 = defpackage.by7.MAP
            by7 r3 = defpackage.by7.POLY_OBJ
            by7[] r0 = new defpackage.by7[]{r0, r1, r2, r3}
            return r0
    }

    static {
            by7 r0 = new by7
            java.lang.String r1 = "OBJ"
            r2 = 0
            r3 = 123(0x7b, float:1.72E-43)
            r4 = 125(0x7d, float:1.75E-43)
            r0.<init>(r1, r2, r3, r4)
            defpackage.by7.OBJ = r0
            by7 r0 = new by7
            java.lang.String r1 = "LIST"
            r2 = 1
            r5 = 91
            r6 = 93
            r0.<init>(r1, r2, r5, r6)
            defpackage.by7.LIST = r0
            by7 r0 = new by7
            java.lang.String r1 = "MAP"
            r2 = 2
            r0.<init>(r1, r2, r3, r4)
            defpackage.by7.MAP = r0
            by7 r0 = new by7
            java.lang.String r1 = "POLY_OBJ"
            r2 = 3
            r0.<init>(r1, r2, r5, r6)
            defpackage.by7.POLY_OBJ = r0
            by7[] r0 = $values()
            defpackage.by7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.by7.$ENTRIES = r0
            return
    }

    by7(java.lang.String r1, int r2, char r3, char r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.begin = r3
            r0.end = r4
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.by7.$ENTRIES
            return r0
    }

    public static defpackage.by7 valueOf(java.lang.String r1) {
            java.lang.Class<by7> r0 = defpackage.by7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            by7 r1 = (defpackage.by7) r1
            return r1
    }

    public static defpackage.by7[] values() {
            by7[] r0 = defpackage.by7.$VALUES
            java.lang.Object r0 = r0.clone()
            by7[] r0 = (defpackage.by7[]) r0
            return r0
    }
}
