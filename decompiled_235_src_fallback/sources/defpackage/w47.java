package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w47  reason: default package */
/* loaded from: classes.dex */
public enum w47 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.w47[] $VALUES = null;
    public static final defpackage.w47 Hidden = null;
    public static final defpackage.w47 Shown = null;

    private static final /* synthetic */ defpackage.w47[] $values() {
            w47 r0 = defpackage.w47.Shown
            w47 r1 = defpackage.w47.Hidden
            w47[] r0 = new defpackage.w47[]{r0, r1}
            return r0
    }

    static {
            w47 r0 = new w47
            java.lang.String r1 = "Shown"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.w47.Shown = r0
            w47 r0 = new w47
            java.lang.String r1 = "Hidden"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.w47.Hidden = r0
            w47[] r0 = $values()
            defpackage.w47.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.w47.$ENTRIES = r0
            return
    }

    w47(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.w47.$ENTRIES
            return r0
    }

    public static defpackage.w47 valueOf(java.lang.String r1) {
            java.lang.Class<w47> r0 = defpackage.w47.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            w47 r1 = (defpackage.w47) r1
            return r1
    }

    public static defpackage.w47[] values() {
            w47[] r0 = defpackage.w47.$VALUES
            java.lang.Object r0 = r0.clone()
            w47[] r0 = (defpackage.w47[]) r0
            return r0
    }
}
