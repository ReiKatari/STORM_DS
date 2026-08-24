package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pl7  reason: default package */
/* loaded from: classes.dex */
public enum pl7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.pl7[] $VALUES = null;
    public static final defpackage.pl7 Impulse = null;
    public static final defpackage.pl7 Lsq2 = null;

    private static final /* synthetic */ defpackage.pl7[] $values() {
            pl7 r0 = defpackage.pl7.Lsq2
            pl7 r1 = defpackage.pl7.Impulse
            pl7[] r0 = new defpackage.pl7[]{r0, r1}
            return r0
    }

    static {
            pl7 r0 = new pl7
            java.lang.String r1 = "Lsq2"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.pl7.Lsq2 = r0
            pl7 r0 = new pl7
            java.lang.String r1 = "Impulse"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.pl7.Impulse = r0
            pl7[] r0 = $values()
            defpackage.pl7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.pl7.$ENTRIES = r0
            return
    }

    pl7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.pl7.$ENTRIES
            return r0
    }

    public static defpackage.pl7 valueOf(java.lang.String r1) {
            java.lang.Class<pl7> r0 = defpackage.pl7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            pl7 r1 = (defpackage.pl7) r1
            return r1
    }

    public static defpackage.pl7[] values() {
            pl7[] r0 = defpackage.pl7.$VALUES
            java.lang.Object r0 = r0.clone()
            pl7[] r0 = (defpackage.pl7[]) r0
            return r0
    }
}
