package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xy0  reason: default package */
/* loaded from: classes.dex */
public enum xy0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.xy0[] $VALUES = null;
    public static final defpackage.xy0 ALWAYS_OVERRIDE = null;
    public static final defpackage.xy0 HIGH_PRIORITY_REQUIRED = null;
    public static final defpackage.xy0 OPTIONAL = null;
    public static final defpackage.xy0 REQUIRED = null;

    private static /* synthetic */ defpackage.xy0[] $values() {
            xy0 r0 = defpackage.xy0.ALWAYS_OVERRIDE
            xy0 r1 = defpackage.xy0.HIGH_PRIORITY_REQUIRED
            xy0 r2 = defpackage.xy0.REQUIRED
            xy0 r3 = defpackage.xy0.OPTIONAL
            xy0[] r0 = new defpackage.xy0[]{r0, r1, r2, r3}
            return r0
    }

    static {
            xy0 r0 = new xy0
            java.lang.String r1 = "ALWAYS_OVERRIDE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xy0.ALWAYS_OVERRIDE = r0
            xy0 r0 = new xy0
            java.lang.String r1 = "HIGH_PRIORITY_REQUIRED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.xy0.HIGH_PRIORITY_REQUIRED = r0
            xy0 r0 = new xy0
            java.lang.String r1 = "REQUIRED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.xy0.REQUIRED = r0
            xy0 r0 = new xy0
            java.lang.String r1 = "OPTIONAL"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.xy0.OPTIONAL = r0
            xy0[] r0 = $values()
            defpackage.xy0.$VALUES = r0
            return
    }

    xy0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.xy0 valueOf(java.lang.String r1) {
            java.lang.Class<xy0> r0 = defpackage.xy0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xy0 r1 = (defpackage.xy0) r1
            return r1
    }

    public static defpackage.xy0[] values() {
            xy0[] r0 = defpackage.xy0.$VALUES
            java.lang.Object r0 = r0.clone()
            xy0[] r0 = (defpackage.xy0[]) r0
            return r0
    }
}
