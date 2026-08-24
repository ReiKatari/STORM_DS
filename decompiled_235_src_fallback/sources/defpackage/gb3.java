package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb3  reason: default package */
/* loaded from: classes.dex */
public enum gb3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.gb3[] $VALUES = null;
    public static final defpackage.gb3 Max = null;
    public static final defpackage.gb3 Min = null;

    private static final /* synthetic */ defpackage.gb3[] $values() {
            gb3 r0 = defpackage.gb3.Min
            gb3 r1 = defpackage.gb3.Max
            gb3[] r0 = new defpackage.gb3[]{r0, r1}
            return r0
    }

    static {
            gb3 r0 = new gb3
            java.lang.String r1 = "Min"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.gb3.Min = r0
            gb3 r0 = new gb3
            java.lang.String r1 = "Max"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.gb3.Max = r0
            gb3[] r0 = $values()
            defpackage.gb3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.gb3.$ENTRIES = r0
            return
    }

    gb3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.gb3.$ENTRIES
            return r0
    }

    public static defpackage.gb3 valueOf(java.lang.String r1) {
            java.lang.Class<gb3> r0 = defpackage.gb3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            gb3 r1 = (defpackage.gb3) r1
            return r1
    }

    public static defpackage.gb3[] values() {
            gb3[] r0 = defpackage.gb3.$VALUES
            java.lang.Object r0 = r0.clone()
            gb3[] r0 = (defpackage.gb3[]) r0
            return r0
    }
}
