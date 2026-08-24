package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y56  reason: default package */
/* loaded from: classes.dex */
public enum y56 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.y56[] $VALUES = null;
    public static final defpackage.y56 FILL = null;
    public static final defpackage.y56 FIT = null;

    private static final /* synthetic */ defpackage.y56[] $values() {
            y56 r0 = defpackage.y56.FILL
            y56 r1 = defpackage.y56.FIT
            y56[] r0 = new defpackage.y56[]{r0, r1}
            return r0
    }

    static {
            y56 r0 = new y56
            java.lang.String r1 = "FILL"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.y56.FILL = r0
            y56 r0 = new y56
            java.lang.String r1 = "FIT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.y56.FIT = r0
            y56[] r0 = $values()
            defpackage.y56.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.y56.$ENTRIES = r0
            return
    }

    y56(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.y56.$ENTRIES
            return r0
    }

    public static defpackage.y56 valueOf(java.lang.String r1) {
            java.lang.Class<y56> r0 = defpackage.y56.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            y56 r1 = (defpackage.y56) r1
            return r1
    }

    public static defpackage.y56[] values() {
            y56[] r0 = defpackage.y56.$VALUES
            java.lang.Object r0 = r0.clone()
            y56[] r0 = (defpackage.y56[]) r0
            return r0
    }
}
