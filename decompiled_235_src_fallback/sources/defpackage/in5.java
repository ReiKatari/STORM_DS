package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: in5  reason: default package */
/* loaded from: classes.dex */
public enum in5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.in5[] $VALUES = null;
    public static final defpackage.in5 FETCHING_LATEST_DATA = null;

    private static final /* synthetic */ defpackage.in5[] $values() {
            in5 r0 = defpackage.in5.FETCHING_LATEST_DATA
            in5[] r0 = new defpackage.in5[]{r0}
            return r0
    }

    static {
            in5 r0 = new in5
            java.lang.String r1 = "FETCHING_LATEST_DATA"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.in5.FETCHING_LATEST_DATA = r0
            in5[] r0 = $values()
            defpackage.in5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.in5.$ENTRIES = r0
            return
    }

    in5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.in5.$ENTRIES
            return r0
    }

    public static defpackage.in5 valueOf(java.lang.String r1) {
            java.lang.Class<in5> r0 = defpackage.in5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            in5 r1 = (defpackage.in5) r1
            return r1
    }

    public static defpackage.in5[] values() {
            in5[] r0 = defpackage.in5.$VALUES
            java.lang.Object r0 = r0.clone()
            in5[] r0 = (defpackage.in5[]) r0
            return r0
    }
}
