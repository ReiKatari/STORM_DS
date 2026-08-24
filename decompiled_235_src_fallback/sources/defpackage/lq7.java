package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq7  reason: default package */
/* loaded from: classes.dex */
public final class lq7 implements defpackage.eg0 {
    public final defpackage.v9 A;
    public final defpackage.nq7 B;
    public final defpackage.mq7 L;

    public lq7(defpackage.eg0 r1, defpackage.mq7 r2, defpackage.fa6 r3) {
            r0 = this;
            r0.<init>()
            r0.L = r2
            v9 r2 = new v9
            ve0 r3 = r1.e()
            r2.<init>(r3)
            r0.A = r2
            nq7 r2 = new nq7
            cg0 r1 = r1.q()
            r2.<init>(r1)
            r0.B = r2
            return
    }

    @Override // defpackage.ci7
    public final void b(defpackage.di7 r1) {
            r0 = this;
            defpackage.nj2.h()
            mq7 r0 = r0.L
            r0.b(r1)
            return
    }

    @Override // defpackage.ci7
    public final void d(defpackage.di7 r1) {
            r0 = this;
            defpackage.nj2.h()
            mq7 r0 = r0.L
            r0.d(r1)
            return
    }

    @Override // defpackage.eg0
    public final defpackage.ve0 e() {
            r0 = this;
            v9 r0 = r0.A
            return r0
    }

    @Override // defpackage.ci7
    public final void g(defpackage.di7 r1) {
            r0 = this;
            defpackage.nj2.h()
            mq7 r0 = r0.L
            r0.g(r1)
            return
    }

    @Override // defpackage.ci7
    public final void h(defpackage.di7 r1) {
            r0 = this;
            defpackage.nj2.h()
            mq7 r0 = r0.L
            r0.h(r1)
            return
    }

    @Override // defpackage.eg0
    public final void l(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation not supported by VirtualCamera."
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.eg0
    public final void m(java.util.ArrayList r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation not supported by VirtualCamera."
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.eg0
    public final boolean o() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.eg0
    public final defpackage.cg0 q() {
            r0 = this;
            nq7 r0 = r0.B
            return r0
    }

    @Override // defpackage.eg0
    public final defpackage.gx3 release() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation not supported by VirtualCamera."
            r1.<init>(r0)
            throw r1
    }
}
