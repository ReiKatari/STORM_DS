package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n51  reason: default package */
/* loaded from: classes.dex */
public enum n51 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.n51[] $VALUES = null;
    public static final defpackage.n51 BULLET = null;
    public static final defpackage.n51 ORDERED = null;

    static {
            n51 r0 = new n51
            java.lang.String r1 = "BULLET"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.n51.BULLET = r0
            n51 r1 = new n51
            java.lang.String r2 = "ORDERED"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.n51.ORDERED = r1
            n51[] r0 = new defpackage.n51[]{r0, r1}
            defpackage.n51.$VALUES = r0
            return
    }

    n51(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.n51 valueOf(java.lang.String r1) {
            java.lang.Class<n51> r0 = defpackage.n51.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            n51 r1 = (defpackage.n51) r1
            return r1
    }

    public static defpackage.n51[] values() {
            n51[] r0 = defpackage.n51.$VALUES
            java.lang.Object r0 = r0.clone()
            n51[] r0 = (defpackage.n51[]) r0
            return r0
    }
}
