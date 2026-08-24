package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn6  reason: default package */
/* loaded from: classes.dex */
public enum xn6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.xn6[] $VALUES = null;
    public static final defpackage.xn6 ADDING = null;
    public static final defpackage.xn6 NONE = null;
    public static final defpackage.xn6 REMOVING = null;

    private static final /* synthetic */ defpackage.xn6[] $values() {
            xn6 r0 = defpackage.xn6.NONE
            xn6 r1 = defpackage.xn6.ADDING
            xn6 r2 = defpackage.xn6.REMOVING
            xn6[] r0 = new defpackage.xn6[]{r0, r1, r2}
            return r0
    }

    static {
            xn6 r0 = new xn6
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xn6.NONE = r0
            xn6 r0 = new xn6
            java.lang.String r1 = "ADDING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.xn6.ADDING = r0
            xn6 r0 = new xn6
            java.lang.String r1 = "REMOVING"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.xn6.REMOVING = r0
            xn6[] r0 = $values()
            defpackage.xn6.$VALUES = r0
            return
    }

    xn6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.xn6 valueOf(java.lang.String r1) {
            java.lang.Class<xn6> r0 = defpackage.xn6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xn6 r1 = (defpackage.xn6) r1
            return r1
    }

    public static defpackage.xn6[] values() {
            xn6[] r0 = defpackage.xn6.$VALUES
            java.lang.Object r0 = r0.clone()
            xn6[] r0 = (defpackage.xn6[]) r0
            return r0
    }
}
