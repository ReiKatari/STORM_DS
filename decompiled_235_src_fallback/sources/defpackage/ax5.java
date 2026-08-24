package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax5  reason: default package */
/* loaded from: classes.dex */
public enum ax5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ax5[] $VALUES = null;
    public static final defpackage.ax5 AnalogInput = null;
    public static final defpackage.ax5 GbaRom = null;
    public static final defpackage.ax5 MemoryExpansion = null;
    public static final defpackage.ax5 None = null;
    public static final defpackage.ax5 RumblePak = null;

    private static final /* synthetic */ defpackage.ax5[] $values() {
            ax5 r0 = defpackage.ax5.None
            ax5 r1 = defpackage.ax5.GbaRom
            ax5 r2 = defpackage.ax5.RumblePak
            ax5 r3 = defpackage.ax5.MemoryExpansion
            ax5 r4 = defpackage.ax5.AnalogInput
            ax5[] r0 = new defpackage.ax5[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            ax5 r0 = new ax5
            java.lang.String r1 = "None"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ax5.None = r0
            ax5 r0 = new ax5
            java.lang.String r1 = "GbaRom"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ax5.GbaRom = r0
            ax5 r0 = new ax5
            java.lang.String r1 = "RumblePak"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ax5.RumblePak = r0
            ax5 r0 = new ax5
            java.lang.String r1 = "MemoryExpansion"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ax5.MemoryExpansion = r0
            ax5 r0 = new ax5
            java.lang.String r1 = "AnalogInput"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.ax5.AnalogInput = r0
            ax5[] r0 = $values()
            defpackage.ax5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ax5.$ENTRIES = r0
            return
    }

    ax5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ax5.$ENTRIES
            return r0
    }

    public static defpackage.ax5 valueOf(java.lang.String r1) {
            java.lang.Class<ax5> r0 = defpackage.ax5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ax5 r1 = (defpackage.ax5) r1
            return r1
    }

    public static defpackage.ax5[] values() {
            ax5[] r0 = defpackage.ax5.$VALUES
            java.lang.Object r0 = r0.clone()
            ax5[] r0 = (defpackage.ax5[]) r0
            return r0
    }
}
