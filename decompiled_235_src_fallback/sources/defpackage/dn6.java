package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dn6  reason: default package */
/* loaded from: classes.dex */
public enum dn6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.dn6[] $VALUES = null;
    public static final defpackage.dn6 CONSTANT = null;
    public static final defpackage.dn6 ERROR = null;
    public static final defpackage.dn6 SLACK = null;
    public static final defpackage.dn6 UNKNOWN = null;
    public static final defpackage.dn6 UNRESTRICTED = null;

    private static /* synthetic */ defpackage.dn6[] $values() {
            dn6 r0 = defpackage.dn6.UNRESTRICTED
            dn6 r1 = defpackage.dn6.CONSTANT
            dn6 r2 = defpackage.dn6.SLACK
            dn6 r3 = defpackage.dn6.ERROR
            dn6 r4 = defpackage.dn6.UNKNOWN
            dn6[] r0 = new defpackage.dn6[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            dn6 r0 = new dn6
            java.lang.String r1 = "UNRESTRICTED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.dn6.UNRESTRICTED = r0
            dn6 r0 = new dn6
            java.lang.String r1 = "CONSTANT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.dn6.CONSTANT = r0
            dn6 r0 = new dn6
            java.lang.String r1 = "SLACK"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.dn6.SLACK = r0
            dn6 r0 = new dn6
            java.lang.String r1 = "ERROR"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.dn6.ERROR = r0
            dn6 r0 = new dn6
            java.lang.String r1 = "UNKNOWN"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.dn6.UNKNOWN = r0
            dn6[] r0 = $values()
            defpackage.dn6.$VALUES = r0
            return
    }

    dn6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.dn6 valueOf(java.lang.String r1) {
            java.lang.Class<dn6> r0 = defpackage.dn6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            dn6 r1 = (defpackage.dn6) r1
            return r1
    }

    public static defpackage.dn6[] values() {
            dn6[] r0 = defpackage.dn6.$VALUES
            java.lang.Object r0 = r0.clone()
            dn6[] r0 = (defpackage.dn6[]) r0
            return r0
    }
}
