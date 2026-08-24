package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k21  reason: default package */
/* loaded from: classes.dex */
public enum k21 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.k21[] $VALUES = null;
    public static final defpackage.k21 FIXED = null;
    public static final defpackage.k21 MATCH_CONSTRAINT = null;
    public static final defpackage.k21 MATCH_PARENT = null;
    public static final defpackage.k21 WRAP_CONTENT = null;

    private static /* synthetic */ defpackage.k21[] $values() {
            k21 r0 = defpackage.k21.FIXED
            k21 r1 = defpackage.k21.WRAP_CONTENT
            k21 r2 = defpackage.k21.MATCH_CONSTRAINT
            k21 r3 = defpackage.k21.MATCH_PARENT
            k21[] r0 = new defpackage.k21[]{r0, r1, r2, r3}
            return r0
    }

    static {
            k21 r0 = new k21
            java.lang.String r1 = "FIXED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.k21.FIXED = r0
            k21 r0 = new k21
            java.lang.String r1 = "WRAP_CONTENT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.k21.WRAP_CONTENT = r0
            k21 r0 = new k21
            java.lang.String r1 = "MATCH_CONSTRAINT"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.k21.MATCH_CONSTRAINT = r0
            k21 r0 = new k21
            java.lang.String r1 = "MATCH_PARENT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.k21.MATCH_PARENT = r0
            k21[] r0 = $values()
            defpackage.k21.$VALUES = r0
            return
    }

    k21(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.k21 valueOf(java.lang.String r1) {
            java.lang.Class<k21> r0 = defpackage.k21.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            k21 r1 = (defpackage.k21) r1
            return r1
    }

    public static defpackage.k21[] values() {
            k21[] r0 = defpackage.k21.$VALUES
            java.lang.Object r0 = r0.clone()
            k21[] r0 = (defpackage.k21[]) r0
            return r0
    }
}
