package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb3  reason: default package */
/* loaded from: classes.dex */
public enum fb3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.fb3[] $VALUES = null;
    public static final defpackage.fb3 Max = null;
    public static final defpackage.fb3 Min = null;

    private static final /* synthetic */ defpackage.fb3[] $values() {
            fb3 r0 = defpackage.fb3.Min
            fb3 r1 = defpackage.fb3.Max
            fb3[] r0 = new defpackage.fb3[]{r0, r1}
            return r0
    }

    static {
            fb3 r0 = new fb3
            java.lang.String r1 = "Min"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.fb3.Min = r0
            fb3 r0 = new fb3
            java.lang.String r1 = "Max"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.fb3.Max = r0
            fb3[] r0 = $values()
            defpackage.fb3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.fb3.$ENTRIES = r0
            return
    }

    fb3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.fb3.$ENTRIES
            return r0
    }

    public static defpackage.fb3 valueOf(java.lang.String r1) {
            java.lang.Class<fb3> r0 = defpackage.fb3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fb3 r1 = (defpackage.fb3) r1
            return r1
    }

    public static defpackage.fb3[] values() {
            fb3[] r0 = defpackage.fb3.$VALUES
            java.lang.Object r0 = r0.clone()
            fb3[] r0 = (defpackage.fb3[]) r0
            return r0
    }
}
