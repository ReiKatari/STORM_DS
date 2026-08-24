package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om3  reason: default package */
/* loaded from: classes.dex */
public enum om3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.om3[] $VALUES = null;
    public static final defpackage.om3 Idle = null;
    public static final defpackage.om3 LayingOut = null;
    public static final defpackage.om3 LookaheadLayingOut = null;
    public static final defpackage.om3 LookaheadMeasuring = null;
    public static final defpackage.om3 Measuring = null;

    private static final /* synthetic */ defpackage.om3[] $values() {
            om3 r0 = defpackage.om3.Measuring
            om3 r1 = defpackage.om3.LookaheadMeasuring
            om3 r2 = defpackage.om3.LayingOut
            om3 r3 = defpackage.om3.LookaheadLayingOut
            om3 r4 = defpackage.om3.Idle
            om3[] r0 = new defpackage.om3[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            om3 r0 = new om3
            java.lang.String r1 = "Measuring"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.om3.Measuring = r0
            om3 r0 = new om3
            java.lang.String r1 = "LookaheadMeasuring"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.om3.LookaheadMeasuring = r0
            om3 r0 = new om3
            java.lang.String r1 = "LayingOut"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.om3.LayingOut = r0
            om3 r0 = new om3
            java.lang.String r1 = "LookaheadLayingOut"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.om3.LookaheadLayingOut = r0
            om3 r0 = new om3
            java.lang.String r1 = "Idle"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.om3.Idle = r0
            om3[] r0 = $values()
            defpackage.om3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.om3.$ENTRIES = r0
            return
    }

    om3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.om3.$ENTRIES
            return r0
    }

    public static defpackage.om3 valueOf(java.lang.String r1) {
            java.lang.Class<om3> r0 = defpackage.om3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            om3 r1 = (defpackage.om3) r1
            return r1
    }

    public static defpackage.om3[] values() {
            om3[] r0 = defpackage.om3.$VALUES
            java.lang.Object r0 = r0.clone()
            om3[] r0 = (defpackage.om3[]) r0
            return r0
    }
}
