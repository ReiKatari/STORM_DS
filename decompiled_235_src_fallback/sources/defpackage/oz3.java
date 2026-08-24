package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oz3  reason: default package */
/* loaded from: classes.dex */
public enum oz3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.oz3[] $VALUES = null;
    public static final defpackage.oz3 IsNotPlaced = null;
    public static final defpackage.oz3 IsPlacedInApproach = null;
    public static final defpackage.oz3 IsPlacedInLookahead = null;

    private static final /* synthetic */ defpackage.oz3[] $values() {
            oz3 r0 = defpackage.oz3.IsPlacedInLookahead
            oz3 r1 = defpackage.oz3.IsPlacedInApproach
            oz3 r2 = defpackage.oz3.IsNotPlaced
            oz3[] r0 = new defpackage.oz3[]{r0, r1, r2}
            return r0
    }

    static {
            oz3 r0 = new oz3
            java.lang.String r1 = "IsPlacedInLookahead"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.oz3.IsPlacedInLookahead = r0
            oz3 r0 = new oz3
            java.lang.String r1 = "IsPlacedInApproach"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.oz3.IsPlacedInApproach = r0
            oz3 r0 = new oz3
            java.lang.String r1 = "IsNotPlaced"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.oz3.IsNotPlaced = r0
            oz3[] r0 = $values()
            defpackage.oz3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.oz3.$ENTRIES = r0
            return
    }

    oz3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.oz3.$ENTRIES
            return r0
    }

    public static defpackage.oz3 valueOf(java.lang.String r1) {
            java.lang.Class<oz3> r0 = defpackage.oz3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            oz3 r1 = (defpackage.oz3) r1
            return r1
    }

    public static defpackage.oz3[] values() {
            oz3[] r0 = defpackage.oz3.$VALUES
            java.lang.Object r0 = r0.clone()
            oz3[] r0 = (defpackage.oz3[]) r0
            return r0
    }
}
