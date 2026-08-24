package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu4  reason: default package */
/* loaded from: classes.dex */
public enum vu4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.vu4[] $VALUES = null;
    public static final defpackage.vu4 Applied = null;
    public static final defpackage.vu4 ApplyPending = null;
    public static final defpackage.vu4 Cancelled = null;
    public static final defpackage.vu4 InitialPending = null;
    public static final defpackage.vu4 Invalid = null;
    public static final defpackage.vu4 RecomposePending = null;
    public static final defpackage.vu4 Recomposing = null;

    private static final /* synthetic */ defpackage.vu4[] $values() {
            vu4 r0 = defpackage.vu4.Invalid
            vu4 r1 = defpackage.vu4.Cancelled
            vu4 r2 = defpackage.vu4.InitialPending
            vu4 r3 = defpackage.vu4.RecomposePending
            vu4 r4 = defpackage.vu4.Recomposing
            vu4 r5 = defpackage.vu4.ApplyPending
            vu4 r6 = defpackage.vu4.Applied
            vu4[] r0 = new defpackage.vu4[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            vu4 r0 = new vu4
            java.lang.String r1 = "Invalid"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.vu4.Invalid = r0
            vu4 r0 = new vu4
            java.lang.String r1 = "Cancelled"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.vu4.Cancelled = r0
            vu4 r0 = new vu4
            java.lang.String r1 = "InitialPending"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.vu4.InitialPending = r0
            vu4 r0 = new vu4
            java.lang.String r1 = "RecomposePending"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.vu4.RecomposePending = r0
            vu4 r0 = new vu4
            java.lang.String r1 = "Recomposing"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.vu4.Recomposing = r0
            vu4 r0 = new vu4
            java.lang.String r1 = "ApplyPending"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.vu4.ApplyPending = r0
            vu4 r0 = new vu4
            java.lang.String r1 = "Applied"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.vu4.Applied = r0
            vu4[] r0 = $values()
            defpackage.vu4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.vu4.$ENTRIES = r0
            return
    }

    vu4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.vu4.$ENTRIES
            return r0
    }

    public static defpackage.vu4 valueOf(java.lang.String r1) {
            java.lang.Class<vu4> r0 = defpackage.vu4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            vu4 r1 = (defpackage.vu4) r1
            return r1
    }

    public static defpackage.vu4[] values() {
            vu4[] r0 = defpackage.vu4.$VALUES
            java.lang.Object r0 = r0.clone()
            vu4[] r0 = (defpackage.vu4[]) r0
            return r0
    }
}
