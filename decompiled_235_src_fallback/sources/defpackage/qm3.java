package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm3  reason: default package */
/* loaded from: classes.dex */
public enum qm3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.qm3[] $VALUES = null;
    public static final defpackage.qm3 InLayoutBlock = null;
    public static final defpackage.qm3 InMeasureBlock = null;
    public static final defpackage.qm3 NotUsed = null;

    private static final /* synthetic */ defpackage.qm3[] $values() {
            qm3 r0 = defpackage.qm3.InMeasureBlock
            qm3 r1 = defpackage.qm3.InLayoutBlock
            qm3 r2 = defpackage.qm3.NotUsed
            qm3[] r0 = new defpackage.qm3[]{r0, r1, r2}
            return r0
    }

    static {
            qm3 r0 = new qm3
            java.lang.String r1 = "InMeasureBlock"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.qm3.InMeasureBlock = r0
            qm3 r0 = new qm3
            java.lang.String r1 = "InLayoutBlock"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.qm3.InLayoutBlock = r0
            qm3 r0 = new qm3
            java.lang.String r1 = "NotUsed"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.qm3.NotUsed = r0
            qm3[] r0 = $values()
            defpackage.qm3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.qm3.$ENTRIES = r0
            return
    }

    qm3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.qm3.$ENTRIES
            return r0
    }

    public static defpackage.qm3 valueOf(java.lang.String r1) {
            java.lang.Class<qm3> r0 = defpackage.qm3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            qm3 r1 = (defpackage.qm3) r1
            return r1
    }

    public static defpackage.qm3[] values() {
            qm3[] r0 = defpackage.qm3.$VALUES
            java.lang.Object r0 = r0.clone()
            qm3[] r0 = (defpackage.qm3[]) r0
            return r0
    }
}
