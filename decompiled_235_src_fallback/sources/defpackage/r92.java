package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r92  reason: default package */
/* loaded from: classes.dex */
public final class r92 extends defpackage.s36 {
    public final java.util.HashMap X;

    public r92() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.X = r0
            return
    }

    @Override // defpackage.s36
    public final defpackage.p36 a(java.lang.Object r1) {
            r0 = this;
            java.util.HashMap r0 = r0.X
            java.lang.Object r0 = r0.get(r1)
            p36 r0 = (defpackage.p36) r0
            return r0
    }

    @Override // defpackage.s36
    public final java.lang.Object b(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = super.b(r2)
            java.util.HashMap r1 = r1.X
            r1.remove(r2)
            return r0
    }
}
