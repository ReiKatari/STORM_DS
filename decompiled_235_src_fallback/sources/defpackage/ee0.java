package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee0  reason: default package */
/* loaded from: classes.dex */
public enum ee0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.ee0[] $VALUES = null;
    public static final defpackage.ee0 ERROR = null;

    private static /* synthetic */ defpackage.ee0[] $values() {
            ee0 r0 = defpackage.ee0.ERROR
            ee0[] r0 = new defpackage.ee0[]{r0}
            return r0
    }

    static {
            ee0 r0 = new ee0
            java.lang.String r1 = "ERROR"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ee0.ERROR = r0
            ee0[] r0 = $values()
            defpackage.ee0.$VALUES = r0
            return
    }

    ee0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.ee0 valueOf(java.lang.String r1) {
            java.lang.Class<ee0> r0 = defpackage.ee0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ee0 r1 = (defpackage.ee0) r1
            return r1
    }

    public static defpackage.ee0[] values() {
            ee0[] r0 = defpackage.ee0.$VALUES
            java.lang.Object r0 = r0.clone()
            ee0[] r0 = (defpackage.ee0[]) r0
            return r0
    }
}
