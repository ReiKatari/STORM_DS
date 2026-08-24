package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u50  reason: default package */
/* loaded from: classes.dex */
public final class u50 implements defpackage.gg3 {
    public static final defpackage.u50 a = null;
    public static final defpackage.x25 b = null;

    static {
            u50 r0 = new u50
            r0.<init>()
            defpackage.u50.a = r0
            x25 r0 = new x25
            java.lang.String r1 = "kotlin.Boolean"
            v25 r2 = defpackage.v25.e
            r0.<init>(r1, r2)
            defpackage.u50.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r1) {
            r0 = this;
            boolean r0 = r1.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            r1.r(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.u50.b
            return r0
    }
}
