package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz3  reason: default package */
/* loaded from: classes.dex */
public final class fz3 implements defpackage.gg3 {
    public static final defpackage.fz3 a = null;
    public static final defpackage.x25 b = null;

    static {
            fz3 r0 = new fz3
            r0.<init>()
            defpackage.fz3.a = r0
            x25 r0 = new x25
            java.lang.String r1 = "kotlin.Long"
            v25 r2 = defpackage.v25.k
            r0.<init>(r1, r2)
            defpackage.fz3.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r1) {
            r0 = this;
            long r0 = r1.L()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            r3.X(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.fz3.b
            return r0
    }
}
