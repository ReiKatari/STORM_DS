package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a46  reason: default package */
/* loaded from: classes.dex */
public enum a46 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.a46[] $VALUES = null;
    public static final defpackage.a46 INTERNAL_DIR = null;
    public static final defpackage.a46 ROM_DIR = null;
    public static final defpackage.a46 SAVE_DIR = null;

    private static final /* synthetic */ defpackage.a46[] $values() {
            a46 r0 = defpackage.a46.SAVE_DIR
            a46 r1 = defpackage.a46.ROM_DIR
            a46 r2 = defpackage.a46.INTERNAL_DIR
            a46[] r0 = new defpackage.a46[]{r0, r1, r2}
            return r0
    }

    static {
            a46 r0 = new a46
            java.lang.String r1 = "SAVE_DIR"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.a46.SAVE_DIR = r0
            a46 r0 = new a46
            java.lang.String r1 = "ROM_DIR"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.a46.ROM_DIR = r0
            a46 r0 = new a46
            java.lang.String r1 = "INTERNAL_DIR"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.a46.INTERNAL_DIR = r0
            a46[] r0 = $values()
            defpackage.a46.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.a46.$ENTRIES = r0
            return
    }

    a46(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.a46.$ENTRIES
            return r0
    }

    public static defpackage.a46 valueOf(java.lang.String r1) {
            java.lang.Class<a46> r0 = defpackage.a46.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a46 r1 = (defpackage.a46) r1
            return r1
    }

    public static defpackage.a46[] values() {
            a46[] r0 = defpackage.a46.$VALUES
            java.lang.Object r0 = r0.clone()
            a46[] r0 = (defpackage.a46[]) r0
            return r0
    }
}
