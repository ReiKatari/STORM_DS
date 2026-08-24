package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ij3  reason: default package */
/* loaded from: classes.dex */
public final class ij3 implements defpackage.bj5, defpackage.o61 {
    public final defpackage.l61 A;
    public final defpackage.eo2 B;
    public final defpackage.o41 L;
    public defpackage.ap6 R;

    public ij3(defpackage.l61 r1, defpackage.eo2 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            l61 r1 = r1.N(r0)
            o41 r1 = defpackage.g04.i(r1)
            r0.L = r1
            return
    }

    @Override // defpackage.l61
    public final defpackage.l61 D(defpackage.k61 r1) {
            r0 = this;
            l61 r0 = defpackage.jw2.w(r0, r1)
            return r0
    }

    @Override // defpackage.l61
    public final defpackage.l61 N(defpackage.l61 r1) {
            r0 = this;
            l61 r0 = defpackage.jw2.y(r0, r1)
            return r0
    }

    @Override // defpackage.l61
    public final defpackage.j61 Z(defpackage.k61 r1) {
            r0 = this;
            j61 r0 = defpackage.jw2.p(r0, r1)
            return r0
    }

    @Override // defpackage.bj5
    public final void a() {
            r3 = this;
            ap6 r0 = r3.R
            if (r0 == 0) goto Ld
            zj2 r1 = new zj2
            r2 = 1
            r1.<init>(r2)
            r0.z(r1)
        Ld:
            r0 = 0
            r3.R = r0
            return
    }

    @Override // defpackage.bj5
    public final void b() {
            r3 = this;
            ap6 r0 = r3.R
            if (r0 == 0) goto Ld
            zj2 r1 = new zj2
            r2 = 1
            r1.<init>(r2)
            r0.z(r1)
        Ld:
            r0 = 0
            r3.R = r0
            return
    }

    @Override // defpackage.bj5
    public final void c() {
            r4 = this;
            ap6 r0 = r4.R
            r1 = 0
            if (r0 == 0) goto L12
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = "Old job was still running!"
            r2.<init>(r3)
            r2.initCause(r1)
            r0.h(r2)
        L12:
            eo2 r0 = r4.B
            r2 = 3
            o41 r3 = r4.L
            ap6 r0 = defpackage.hv.L(r3, r1, r1, r0, r2)
            r4.R = r0
            return
    }

    @Override // defpackage.j61
    public final defpackage.k61 getKey() {
            r0 = this;
            cs1 r0 = defpackage.cs1.Z
            return r0
    }

    @Override // defpackage.o61
    public final void u(defpackage.l61 r4, java.lang.Throwable r5) {
            r3 = this;
            cs1 r0 = defpackage.cy0.B
            j61 r0 = r4.Z(r0)
            cy0 r0 = (defpackage.cy0) r0
            if (r0 == 0) goto L14
            q6 r1 = new q6
            r2 = 18
            r1.<init>(r2, r0, r3)
            defpackage.nw7.s0(r5, r1)
        L14:
            l61 r3 = r3.A
            cs1 r0 = defpackage.cs1.Z
            j61 r3 = r3.Z(r0)
            o61 r3 = (defpackage.o61) r3
            if (r3 == 0) goto L24
            r3.u(r4, r5)
            return
        L24:
            throw r5
    }

    @Override // defpackage.l61
    public final java.lang.Object x(defpackage.eo2 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r1.o(r2, r0)
            return r0
    }
}
