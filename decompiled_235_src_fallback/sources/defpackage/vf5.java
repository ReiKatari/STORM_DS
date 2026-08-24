package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf5  reason: default package */
/* loaded from: classes.dex */
public enum vf5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.vf5[] $VALUES = null;
    public static final defpackage.vf5 ALLOW = null;
    public static final defpackage.vf5 PREVENT = null;
    public static final defpackage.vf5 PREVENT_WHEN_EMPTY = null;

    private static /* synthetic */ defpackage.vf5[] $values() {
            vf5 r0 = defpackage.vf5.ALLOW
            vf5 r1 = defpackage.vf5.PREVENT_WHEN_EMPTY
            vf5 r2 = defpackage.vf5.PREVENT
            vf5[] r0 = new defpackage.vf5[]{r0, r1, r2}
            return r0
    }

    static {
            vf5 r0 = new vf5
            java.lang.String r1 = "ALLOW"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.vf5.ALLOW = r0
            vf5 r0 = new vf5
            java.lang.String r1 = "PREVENT_WHEN_EMPTY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.vf5.PREVENT_WHEN_EMPTY = r0
            vf5 r0 = new vf5
            java.lang.String r1 = "PREVENT"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.vf5.PREVENT = r0
            vf5[] r0 = $values()
            defpackage.vf5.$VALUES = r0
            return
    }

    vf5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.vf5 valueOf(java.lang.String r1) {
            java.lang.Class<vf5> r0 = defpackage.vf5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            vf5 r1 = (defpackage.vf5) r1
            return r1
    }

    public static defpackage.vf5[] values() {
            vf5[] r0 = defpackage.vf5.$VALUES
            java.lang.Object r0 = r0.clone()
            vf5[] r0 = (defpackage.vf5[]) r0
            return r0
    }
}
