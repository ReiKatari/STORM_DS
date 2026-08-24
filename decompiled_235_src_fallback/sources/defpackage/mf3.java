package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf3  reason: default package */
/* loaded from: classes.dex */
public final class mf3 extends defpackage.kf3 {
    public final defpackage.ye3 f0;
    public final java.util.List g0;
    public final int h0;
    public int i0;

    public mf3(defpackage.id3 r3, defpackage.ye3 r4) {
            r2 = this;
            r3.getClass()
            r0 = 0
            r1 = 12
            r2.<init>(r3, r4, r0, r1)
            r2.f0 = r4
            java.util.Map r3 = r4.A
            java.util.Set r3 = r3.keySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = defpackage.gt0.k1(r3)
            r2.g0 = r3
            int r3 = r3.size()
            int r3 = r3 * 2
            r2.h0 = r3
            r3 = -1
            r2.i0 = r3
            return
    }

    @Override // defpackage.kf3, defpackage.v0
    public final defpackage.de3 E() {
            r0 = this;
            ye3 r0 = r0.f0
            return r0
    }

    @Override // defpackage.kf3
    public final defpackage.ye3 R() {
            r0 = this;
            ye3 r0 = r0.f0
            return r0
    }

    @Override // defpackage.kf3, defpackage.v0, defpackage.ux0
    public final void a(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // defpackage.kf3, defpackage.v0
    public final defpackage.de3 d(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            int r0 = r1.i0
            int r0 = r0 % 2
            if (r0 != 0) goto Le
            df3 r1 = defpackage.fe3.b(r2)
            return r1
        Le:
            ye3 r1 = r1.f0
            java.lang.Object r1 = defpackage.c14.j0(r1, r2)
            de3 r1 = (defpackage.de3) r1
            return r1
    }

    @Override // defpackage.kf3, defpackage.ux0
    public final int q(defpackage.wb6 r2) {
            r1 = this;
            r2.getClass()
            int r2 = r1.i0
            int r0 = r1.h0
            int r0 = r0 + (-1)
            if (r2 >= r0) goto L10
            int r2 = r2 + 1
            r1.i0 = r2
            return r2
        L10:
            r1 = -1
            return r1
    }

    @Override // defpackage.kf3, defpackage.v0
    public final java.lang.String x(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            int r2 = r2 / 2
            java.util.List r0 = r0.g0
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }
}
