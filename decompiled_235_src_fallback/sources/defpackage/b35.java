package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b35  reason: default package */
/* loaded from: classes.dex */
public enum b35 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.b35[] $VALUES = null;
    public static final defpackage.b35 DEFAULT = null;
    public static final defpackage.b35 HIGHEST = null;
    public static final defpackage.b35 VERY_LOW = null;

    static {
            b35 r0 = new b35
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.b35.DEFAULT = r0
            b35 r1 = new b35
            java.lang.String r2 = "VERY_LOW"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.b35.VERY_LOW = r1
            b35 r2 = new b35
            java.lang.String r3 = "HIGHEST"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.b35.HIGHEST = r2
            b35[] r0 = new defpackage.b35[]{r0, r1, r2}
            defpackage.b35.$VALUES = r0
            return
    }

    b35(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.b35 valueOf(java.lang.String r1) {
            java.lang.Class<b35> r0 = defpackage.b35.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            b35 r1 = (defpackage.b35) r1
            return r1
    }

    public static defpackage.b35[] values() {
            b35[] r0 = defpackage.b35.$VALUES
            java.lang.Object r0 = r0.clone()
            b35[] r0 = (defpackage.b35[]) r0
            return r0
    }
}
