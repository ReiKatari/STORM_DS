package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar3  reason: default package */
/* loaded from: classes.dex */
public final class ar3 implements defpackage.tp3 {
    public final defpackage.pr3 a;

    public ar3(defpackage.pr3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.tp3
    public final int a() {
            r0 = this;
            pr3 r0 = r0.a
            jr3 r0 = r0.j()
            int r0 = r0.n
            return r0
    }

    @Override // defpackage.tp3
    public final int b() {
            r1 = this;
            int r0 = r1.a()
            int r0 = r0 + (-1)
            pr3 r1 = r1.a
            jr3 r1 = r1.j()
            java.util.List r1 = r1.k
            java.lang.Object r1 = defpackage.gt0.Q0(r1)
            kr3 r1 = (defpackage.kr3) r1
            int r1 = r1.a
            int r1 = java.lang.Math.min(r0, r1)
            return r1
    }

    @Override // defpackage.tp3
    public final int c() {
            r4 = this;
            pr3 r4 = r4.a
            jr3 r0 = r4.j()
            java.util.List r0 = r0.k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            r4 = 0
            return r4
        L10:
            jr3 r0 = r4.j()
            lo4 r1 = r0.o
            lo4 r2 = defpackage.lo4.Vertical
            if (r1 != r2) goto L26
            long r0 = r0.e()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
        L24:
            int r0 = (int) r0
            goto L2e
        L26:
            long r0 = r0.e()
            r2 = 32
            long r0 = r0 >> r2
            goto L24
        L2e:
            jr3 r4 = r4.j()
            int r4 = defpackage.yh2.P(r4)
            r1 = 1
            if (r4 != 0) goto L3a
            goto L3d
        L3a:
            int r0 = r0 / r4
            if (r0 >= r1) goto L3e
        L3d:
            return r1
        L3e:
            return r0
    }

    @Override // defpackage.tp3
    public final boolean d() {
            r0 = this;
            pr3 r0 = r0.a
            jr3 r0 = r0.j()
            java.util.List r0 = r0.k
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.tp3
    public final int e() {
            r1 = this;
            pr3 r1 = r1.a
            int r1 = r1.h()
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }
}
