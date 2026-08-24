package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ut  reason: default package */
/* loaded from: classes.dex */
public final class ut implements defpackage.st, defpackage.g34, defpackage.sz3 {
    public final defpackage.mm3 A;
    public defpackage.cf6 B;
    public boolean L;

    public ut(defpackage.mm3 r1, defpackage.cf6 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.g34
    public final defpackage.f34 K(int r7, int r8, java.util.Map r9, defpackage.qn2 r10) {
            r6 = this;
            mm3 r0 = r6.A
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            f34 r6 = r0.o0(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // defpackage.qh1
    public final long M(float r1) {
            r0 = this;
            mm3 r0 = r0.A
            long r0 = r0.M(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float Q(int r1) {
            r0 = this;
            mm3 r0 = r0.A
            float r0 = r0.Q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float T(float r1) {
            r0 = this;
            mm3 r0 = r0.A
            float r0 = r0.a()
            float r1 = r1 / r0
            return r1
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            mm3 r0 = r0.A
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            mm3 r0 = r0.A
            float r0 = r0.a()
            return r0
    }

    @Override // defpackage.eb3
    public final boolean a0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.sz3
    public final defpackage.jk3 b(defpackage.jk3 r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.nz3
            if (r0 == 0) goto L5
            return r1
        L5:
            boolean r0 = r1 instanceof defpackage.eg4
            if (r0 == 0) goto L18
            r0 = r1
            eg4 r0 = (defpackage.eg4) r0
            mz3 r0 = r0.W0()
            if (r0 == 0) goto L17
            nz3 r0 = r0.n0
            if (r0 == 0) goto L17
            return r0
        L17:
            return r1
        L18:
            java.lang.String r0 = "Unsupported LayoutCoordinates"
            defpackage.p53.b(r0)
            defpackage.e41.c()
            r0 = 0
            return r0
    }

    @Override // defpackage.qh1
    public final float e0(float r1) {
            r0 = this;
            mm3 r0 = r0.A
            float r0 = r0.a()
            float r0 = r0 * r1
            return r0
    }

    @Override // defpackage.eb3
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            mm3 r0 = r0.A
            sm3 r0 = r0.k0
            kk3 r0 = r0.v0
            return r0
    }

    @Override // defpackage.qh1
    public final int k0(long r1) {
            r0 = this;
            mm3 r0 = r0.A
            int r0 = r0.k0(r1)
            return r0
    }

    @Override // defpackage.g34
    public final defpackage.f34 o0(int r10, int r11, java.util.Map r12, defpackage.qn2 r13, defpackage.qn2 r14) {
            r9 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r10 & r0
            if (r1 != 0) goto La
            r0 = r0 & r11
            if (r0 != 0) goto La
            goto L28
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size("
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = " x "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ") is out of range. Each dimension must be between 0 and 16777215."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.p53.c(r0)
        L28:
            tt r1 = new tt
            r8 = 0
            r7 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @Override // defpackage.qh1
    public final long p(float r1) {
            r0 = this;
            mm3 r0 = r0.A
            long r0 = r0.p(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long q(long r1) {
            r0 = this;
            mm3 r0 = r0.A
            long r0 = r0.q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final int r0(float r1) {
            r0 = this;
            mm3 r0 = r0.A
            int r0 = r0.r0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long v0(long r1) {
            r0 = this;
            mm3 r0 = r0.A
            long r0 = r0.v0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float x(long r1) {
            r0 = this;
            mm3 r0 = r0.A
            float r0 = r0.x(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float y0(long r1) {
            r0 = this;
            mm3 r0 = r0.A
            float r0 = r0.y0(r1)
            return r0
    }
}
