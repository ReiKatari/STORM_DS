package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f53  reason: default package */
/* loaded from: classes.dex */
public final class f53 extends defpackage.hw6 implements defpackage.eo2 {
    public /* synthetic */ float X;

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r41 r2 = (defpackage.r41) r2
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r41 r0 = r0.q(r2, r1)
            f53 r0 = (defpackage.f53) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            f53 r1 = new f53
            r0 = 2
            r1.<init>(r0, r2)
            java.lang.Number r3 = (java.lang.Number) r3
            float r2 = r3.floatValue()
            r1.X = r2
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r2) {
            r1 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            float r1 = r1.X
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }
}
