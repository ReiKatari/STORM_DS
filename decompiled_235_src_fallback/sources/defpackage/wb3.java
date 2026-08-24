package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wb3  reason: default package */
/* loaded from: classes.dex */
public enum wb3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.wb3[] $VALUES = null;
    public static final defpackage.wb3 LookaheadMeasurement = null;
    public static final defpackage.wb3 LookaheadPlacement = null;
    public static final defpackage.wb3 Measurement = null;
    public static final defpackage.wb3 Placement = null;

    private static final /* synthetic */ defpackage.wb3[] $values() {
            wb3 r0 = defpackage.wb3.LookaheadMeasurement
            wb3 r1 = defpackage.wb3.LookaheadPlacement
            wb3 r2 = defpackage.wb3.Measurement
            wb3 r3 = defpackage.wb3.Placement
            wb3[] r0 = new defpackage.wb3[]{r0, r1, r2, r3}
            return r0
    }

    static {
            wb3 r0 = new wb3
            java.lang.String r1 = "LookaheadMeasurement"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.wb3.LookaheadMeasurement = r0
            wb3 r0 = new wb3
            java.lang.String r1 = "LookaheadPlacement"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.wb3.LookaheadPlacement = r0
            wb3 r0 = new wb3
            java.lang.String r1 = "Measurement"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.wb3.Measurement = r0
            wb3 r0 = new wb3
            java.lang.String r1 = "Placement"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.wb3.Placement = r0
            wb3[] r0 = $values()
            defpackage.wb3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.wb3.$ENTRIES = r0
            return
    }

    wb3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.wb3.$ENTRIES
            return r0
    }

    public static defpackage.wb3 valueOf(java.lang.String r1) {
            java.lang.Class<wb3> r0 = defpackage.wb3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            wb3 r1 = (defpackage.wb3) r1
            return r1
    }

    public static defpackage.wb3[] values() {
            wb3[] r0 = defpackage.wb3.$VALUES
            java.lang.Object r0 = r0.clone()
            wb3[] r0 = (defpackage.wb3[]) r0
            return r0
    }
}
