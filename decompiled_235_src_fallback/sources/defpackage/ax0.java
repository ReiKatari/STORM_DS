package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax0  reason: default package */
/* loaded from: classes.dex */
public final class ax0 extends defpackage.d2 {
    public final defpackage.w61 c;
    public defpackage.eo2 d;
    public defpackage.v80 e;
    public defpackage.ap6 f;
    public boolean g;

    public ax0(defpackage.w61 r3, defpackage.u05 r4) {
            r2 = this;
            r2.<init>(r4)
            r2.c = r3
            wg r3 = new wg
            r4 = 2
            r0 = 5
            r1 = 0
            r3.<init>(r4, r1, r0)
            r2.d = r3
            return
    }

    @Override // defpackage.d2
    public final void l() {
            r3 = this;
            v80 r0 = r3.e
            if (r0 == 0) goto Lf
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "onBack cancelled"
            r1.<init>(r2)
            r2 = 1
            r0.k(r1, r2)
        Lf:
            ap6 r0 = r3.f
            r1 = 0
            if (r0 == 0) goto L17
            r0.h(r1)
        L17:
            r3.e = r1
            r3.f = r1
            r0 = 0
            r3.g = r0
            return
    }

    @Override // defpackage.d2
    public final void m() {
            r5 = this;
            v80 r0 = r5.e
            if (r0 == 0) goto Lb
            boolean r0 = r5.g
            if (r0 != 0) goto Lb
            r5.l()
        Lb:
            v80 r0 = r5.e
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L2d
            r5.g = r2
            m80 r0 = defpackage.m80.SUSPEND
            r3 = 4
            r4 = -2
            v80 r0 = defpackage.nb3.c(r4, r0, r1, r3)
            r5.e = r0
            z r0 = new z
            r3 = 22
            r0.<init>(r5, r1, r3)
            r3 = 3
            w61 r4 = r5.c
            ap6 r0 = defpackage.hv.L(r4, r1, r1, r0, r3)
            r5.f = r0
        L2d:
            v80 r0 = r5.e
            if (r0 == 0) goto L34
            r0.i(r1)
        L34:
            r5.g = r2
            return
    }

    @Override // defpackage.d2
    public final void n(defpackage.b00 r1) {
            r0 = this;
            v80 r0 = r0.e
            if (r0 == 0) goto L7
            r0.c(r1)
        L7:
            return
    }

    @Override // defpackage.d2
    public final void o() {
            r4 = this;
            r4.l()
            boolean r0 = super.k()
            if (r0 == 0) goto L27
            r0 = 1
            r4.g = r0
            m80 r0 = defpackage.m80.SUSPEND
            r1 = 4
            r2 = -2
            r3 = 0
            v80 r0 = defpackage.nb3.c(r2, r0, r3, r1)
            r4.e = r0
            z r0 = new z
            r1 = 22
            r0.<init>(r4, r3, r1)
            r1 = 3
            w61 r2 = r4.c
            ap6 r0 = defpackage.hv.L(r2, r3, r3, r0, r1)
            r4.f = r0
        L27:
            return
    }

    public final void s(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L15
            boolean r0 = super.k()
            if (r0 == 0) goto L15
            ap6 r0 = r1.f
            if (r0 == 0) goto L15
            boolean r0 = r0.e()
            if (r0 != 0) goto L15
            r1.l()
        L15:
            java.lang.Object r0 = r1.a
            d00 r0 = (defpackage.d00) r0
            r0.f(r2)
            java.lang.Object r1 = r1.b
            c00 r1 = (defpackage.c00) r1
            r1.f(r2)
            return
    }
}
