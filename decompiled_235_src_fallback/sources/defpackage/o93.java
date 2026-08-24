package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o93  reason: default package */
/* loaded from: classes.dex */
public final class o93 implements defpackage.gg3 {
    public static final defpackage.o93 a = null;
    public static final defpackage.x25 b = null;

    static {
            o93 r0 = new o93
            r0.<init>()
            defpackage.o93.a = r0
            x25 r0 = new x25
            java.lang.String r1 = "kotlin.Int"
            v25 r2 = defpackage.v25.j
            r0.<init>(r1, r2)
            defpackage.o93.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r1) {
            r0 = this;
            int r0 = r1.B()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            r1.T(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.o93.b
            return r0
    }
}
