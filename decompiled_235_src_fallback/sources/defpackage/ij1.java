package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.pd4("dialog")
/* renamed from: ij1  reason: default package */
/* loaded from: classes.dex */
public final class ij1 extends defpackage.qd4 {
    @Override // defpackage.qd4
    public final defpackage.ic4 a() {
            r2 = this;
            hj1 r0 = new hj1
            zv0 r1 = defpackage.hw0.a
            r0.<init>(r2)
            return r0
    }

    @Override // defpackage.qd4
    public final void d(java.util.List r2, defpackage.ad4 r3) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L18
            java.lang.Object r3 = r2.next()
            sb4 r3 = (defpackage.sb4) r3
            vb4 r0 = r1.b()
            r0.f(r3)
            goto L4
        L18:
            return
    }

    @Override // defpackage.qd4
    public final void e(defpackage.sb4 r4, boolean r5) {
            r3 = this;
            vb4 r0 = r3.b()
            r0.e(r4, r5)
            vb4 r5 = r3.b()
            de5 r5 = r5.f
            rp6 r5 = r5.A
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            int r4 = defpackage.gt0.L0(r5, r4)
            vb4 r5 = r3.b()
            de5 r5 = r5.f
            rp6 r5 = r5.A
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L2c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r5.next()
            int r2 = r0 + 1
            if (r0 < 0) goto L47
            sb4 r1 = (defpackage.sb4) r1
            if (r0 <= r4) goto L45
            vb4 r0 = r3.b()
            r0.c(r1)
        L45:
            r0 = r2
            goto L2c
        L47:
            defpackage.hf.q0()
            r3 = 0
            throw r3
        L4c:
            return
    }
}
