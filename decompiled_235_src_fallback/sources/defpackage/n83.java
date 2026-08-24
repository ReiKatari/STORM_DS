package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n83  reason: default package */
/* loaded from: classes.dex */
public class n83 extends defpackage.h83 implements defpackage.jm3 {
    public defpackage.tt7 m0;

    public n83(defpackage.tt7 r1) {
            r0 = this;
            r0.<init>()
            r0.m0 = r1
            return
    }

    @Override // defpackage.h83
    public final defpackage.tt7 R0(defpackage.tt7 r2) {
            r1 = this;
            tt7 r1 = r1.m0
            ig7 r0 = new ig7
            r0.<init>(r2, r1)
            return r0
    }

    @Override // defpackage.h83
    public final void S0() {
            r0 = this;
            super.S0()
            defpackage.xk2.w(r0)
            return
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r7, defpackage.x24 r8, long r9) {
            r6 = this;
            tt7 r0 = r6.l0
            kk3 r1 = r7.getLayoutDirection()
            int r0 = r0.d(r7, r1)
            tt7 r1 = r6.k0
            kk3 r2 = r7.getLayoutDirection()
            int r1 = r1.d(r7, r2)
            int r0 = r0 - r1
            tt7 r1 = r6.l0
            int r1 = r1.a(r7)
            tt7 r2 = r6.k0
            int r2 = r2.a(r7)
            int r1 = r1 - r2
            tt7 r2 = r6.l0
            kk3 r3 = r7.getLayoutDirection()
            int r2 = r2.b(r7, r3)
            tt7 r3 = r6.k0
            kk3 r4 = r7.getLayoutDirection()
            int r3 = r3.b(r7, r4)
            int r2 = r2 - r3
            tt7 r3 = r6.l0
            int r3 = r3.c(r7)
            tt7 r6 = r6.k0
            int r6 = r6.c(r7)
            int r3 = r3 - r6
            int r2 = r2 + r0
            int r3 = r3 + r1
            int r6 = -r2
            int r4 = -r3
            long r4 = defpackage.s21.i(r9, r6, r4)
            dx4 r6 = r8.y(r4)
            int r8 = r6.A
            int r8 = r8 + r2
            int r8 = defpackage.s21.g(r8, r9)
            int r2 = r6.B
            int r2 = r2 + r3
            int r9 = defpackage.s21.f(r2, r9)
            m83 r10 = new m83
            r2 = 0
            r10.<init>(r6, r0, r1, r2)
            zt1 r6 = defpackage.zt1.A
            f34 r6 = r7.K(r8, r9, r6, r10)
            return r6
    }
}
