package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr3  reason: default package */
/* loaded from: classes.dex */
public final class lr3 implements defpackage.p76 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.p76 b;
    public final /* synthetic */ defpackage.f86 c;

    public /* synthetic */ lr3(defpackage.p76 r1, defpackage.f86 r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.c = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.p76
    public final float a(float r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            p76 r1 = r1.b
            float r1 = r1.a(r2)
            return r1
        Lc:
            p76 r1 = r1.b
            float r1 = r1.a(r2)
            return r1
    }

    public final int b(int r11) {
            r10 = this;
            int r0 = r10.a
            f86 r1 = r10.c
            switch(r0) {
                case 0: goto L3b;
                default: goto L7;
            }
        L7:
            nr4 r1 = (defpackage.nr4) r1
            int r10 = r1.k()
            int r11 = r11 - r10
            int r10 = r1.p()
            int r10 = r10 * r11
            float r10 = (float) r10
            float r11 = r1.l()
            int r0 = r1.p()
            float r0 = (float) r0
            float r11 = r11 * r0
            float r10 = r10 - r11
            r11 = 0
            float r10 = r10 + r11
            int r10 = defpackage.u24.E(r10)
            long r2 = defpackage.ii2.r(r1)
            long r10 = (long) r10
            long r4 = r2 + r10
            long r6 = r1.h
            long r8 = r1.g
            long r10 = defpackage.gi2.s(r4, r6, r8)
            long r0 = defpackage.ii2.r(r1)
            long r10 = r10 - r0
            int r10 = (int) r10
            return r10
        L3b:
            pr3 r1 = (defpackage.pr3) r1
            jr3 r0 = r1.j()
            java.util.List r2 = r0.k
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto L4b
            goto L87
        L4b:
            int r2 = r1.h()
            int r10 = r10.e()
            if (r11 > r10) goto L77
            if (r2 > r11) goto L77
            java.util.List r10 = r0.k
            int r0 = r10.size()
            r1 = r3
        L5e:
            if (r1 >= r0) goto L6f
            java.lang.Object r2 = r10.get(r1)
            r4 = r2
            kr3 r4 = (defpackage.kr3) r4
            int r4 = r4.a
            if (r4 != r11) goto L6c
            goto L70
        L6c:
            int r1 = r1 + 1
            goto L5e
        L6f:
            r2 = 0
        L70:
            kr3 r2 = (defpackage.kr3) r2
            if (r2 == 0) goto L87
            int r3 = r2.l
            goto L87
        L77:
            int r10 = defpackage.yh2.P(r0)
            int r0 = r1.h()
            int r11 = r11 - r0
            int r11 = r11 * r10
            int r10 = r1.i()
            int r3 = r11 - r10
        L87:
            return r3
    }

    public final int c() {
            r1 = this;
            int r0 = r1.a
            f86 r1 = r1.c
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            nr4 r1 = (defpackage.nr4) r1
            int r1 = r1.e
            return r1
        Lc:
            pr3 r1 = (defpackage.pr3) r1
            int r1 = r1.h()
            return r1
    }

    public final int d() {
            r1 = this;
            int r0 = r1.a
            f86 r1 = r1.c
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            nr4 r1 = (defpackage.nr4) r1
            int r1 = r1.f
            return r1
        Lc:
            pr3 r1 = (defpackage.pr3) r1
            int r1 = r1.i()
            return r1
    }

    public final int e() {
            r1 = this;
            int r0 = r1.a
            f86 r1 = r1.c
            switch(r0) {
                case 0: goto L18;
                default: goto L7;
            }
        L7:
            nr4 r1 = (defpackage.nr4) r1
            cr4 r1 = r1.m()
            java.util.List r1 = r1.a
            java.lang.Object r1 = defpackage.gt0.Q0(r1)
            i34 r1 = (defpackage.i34) r1
            int r1 = r1.a
            return r1
        L18:
            pr3 r1 = (defpackage.pr3) r1
            jr3 r1 = r1.j()
            java.util.List r1 = r1.k
            java.lang.Object r1 = defpackage.gt0.R0(r1)
            kr3 r1 = (defpackage.kr3) r1
            if (r1 == 0) goto L2b
            int r1 = r1.a
            goto L2c
        L2b:
            r1 = 0
        L2c:
            return r1
    }

    public final void f(int r4) {
            r3 = this;
            int r0 = r3.a
            f86 r3 = r3.c
            switch(r0) {
                case 0: goto L1a;
                default: goto L7;
            }
        L7:
            nr4 r3 = (defpackage.nr4) r3
            int r0 = r3.p()
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L14
            goto L15
        L14:
            float r1 = r1 / r0
        L15:
            r0 = 1
            r3.t(r1, r4, r0)
            return
        L1a:
            pr3 r3 = (defpackage.pr3) r3
            r3.m(r4)
            return
    }
}
