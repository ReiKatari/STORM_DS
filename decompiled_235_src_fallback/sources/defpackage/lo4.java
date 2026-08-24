package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lo4  reason: default package */
/* loaded from: classes.dex */
public enum lo4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.lo4[] $VALUES = null;
    public static final defpackage.lo4 Horizontal = null;
    public static final defpackage.lo4 Vertical = null;

    private static final /* synthetic */ defpackage.lo4[] $values() {
            lo4 r0 = defpackage.lo4.Vertical
            lo4 r1 = defpackage.lo4.Horizontal
            lo4[] r0 = new defpackage.lo4[]{r0, r1}
            return r0
    }

    static {
            lo4 r0 = new lo4
            java.lang.String r1 = "Vertical"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.lo4.Vertical = r0
            lo4 r0 = new lo4
            java.lang.String r1 = "Horizontal"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.lo4.Horizontal = r0
            lo4[] r0 = $values()
            defpackage.lo4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.lo4.$ENTRIES = r0
            return
    }

    lo4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.lo4.$ENTRIES
            return r0
    }

    public static defpackage.lo4 valueOf(java.lang.String r1) {
            java.lang.Class<lo4> r0 = defpackage.lo4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            lo4 r1 = (defpackage.lo4) r1
            return r1
    }

    public static defpackage.lo4[] values() {
            lo4[] r0 = defpackage.lo4.$VALUES
            java.lang.Object r0 = r0.clone()
            lo4[] r0 = (defpackage.lo4[]) r0
            return r0
    }
}
