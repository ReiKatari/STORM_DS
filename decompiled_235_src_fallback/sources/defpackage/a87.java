package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a87  reason: default package */
/* loaded from: classes.dex */
public enum a87 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.a87[] $VALUES = null;
    public static final defpackage.a87 Indeterminate = null;
    public static final defpackage.a87 Off = null;
    public static final defpackage.a87 On = null;

    private static final /* synthetic */ defpackage.a87[] $values() {
            a87 r0 = defpackage.a87.On
            a87 r1 = defpackage.a87.Off
            a87 r2 = defpackage.a87.Indeterminate
            a87[] r0 = new defpackage.a87[]{r0, r1, r2}
            return r0
    }

    static {
            a87 r0 = new a87
            java.lang.String r1 = "On"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.a87.On = r0
            a87 r0 = new a87
            java.lang.String r1 = "Off"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.a87.Off = r0
            a87 r0 = new a87
            java.lang.String r1 = "Indeterminate"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.a87.Indeterminate = r0
            a87[] r0 = $values()
            defpackage.a87.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.a87.$ENTRIES = r0
            return
    }

    a87(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.a87.$ENTRIES
            return r0
    }

    public static defpackage.a87 valueOf(java.lang.String r1) {
            java.lang.Class<a87> r0 = defpackage.a87.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a87 r1 = (defpackage.a87) r1
            return r1
    }

    public static defpackage.a87[] values() {
            a87[] r0 = defpackage.a87.$VALUES
            java.lang.Object r0 = r0.clone()
            a87[] r0 = (defpackage.a87[]) r0
            return r0
    }
}
