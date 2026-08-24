package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko3  reason: default package */
/* loaded from: classes.dex */
public final class ko3 implements defpackage.tp3 {
    public final defpackage.ip3 a;

    public ko3(defpackage.ip3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.tp3
    public final int a() {
            r0 = this;
            ip3 r0 = r0.a
            wo3 r0 = r0.h()
            int r0 = r0.p
            return r0
    }

    @Override // defpackage.tp3
    public final int b() {
            r0 = this;
            ip3 r0 = r0.a
            wo3 r0 = r0.h()
            java.util.List r0 = r0.m
            java.lang.Object r0 = defpackage.gt0.Q0(r0)
            xo3 r0 = (defpackage.xo3) r0
            int r0 = r0.a
            return r0
    }

    @Override // defpackage.tp3
    public final int c() {
            r15 = this;
            ip3 r15 = r15.a
            wo3 r0 = r15.h()
            java.util.List r0 = r0.m
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            wo3 r0 = r15.h()
            lo4 r2 = r0.q
            lo4 r3 = defpackage.lo4.Vertical
            r4 = 32
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r2 != r3) goto L28
            long r7 = r0.e()
            long r7 = r7 & r5
        L26:
            int r0 = (int) r7
            goto L2e
        L28:
            long r7 = r0.e()
            long r7 = r7 >> r4
            goto L26
        L2e:
            wo3 r15 = r15.h()
            lo4 r2 = r15.q
            java.util.List r7 = r15.m
            r8 = 1
            if (r2 != r3) goto L3b
            r2 = r8
            goto L3c
        L3b:
            r2 = r1
        L3c:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L43
            goto L9c
        L43:
            r3 = r1
            r9 = r3
            r10 = r9
        L46:
            int r11 = r7.size()
            if (r3 >= r11) goto L97
            java.lang.Object r11 = r7.get(r3)
            xo3 r11 = (defpackage.xo3) r11
            if (r2 == 0) goto L57
            int r11 = r11.p
            goto L59
        L57:
            int r11 = r11.q
        L59:
            r12 = -1
            if (r11 != r12) goto L5f
            int r3 = r3 + 1
            goto L46
        L5f:
            r12 = r1
        L60:
            int r13 = r7.size()
            if (r3 >= r13) goto L93
            java.lang.Object r13 = r7.get(r3)
            xo3 r13 = (defpackage.xo3) r13
            if (r2 == 0) goto L71
            int r13 = r13.p
            goto L73
        L71:
            int r13 = r13.q
        L73:
            if (r13 != r11) goto L93
            if (r2 == 0) goto L82
            java.lang.Object r13 = r7.get(r3)
            xo3 r13 = (defpackage.xo3) r13
            long r13 = r13.n
            long r13 = r13 & r5
        L80:
            int r13 = (int) r13
            goto L8c
        L82:
            java.lang.Object r13 = r7.get(r3)
            xo3 r13 = (defpackage.xo3) r13
            long r13 = r13.n
            long r13 = r13 >> r4
            goto L80
        L8c:
            int r12 = java.lang.Math.max(r12, r13)
            int r3 = r3 + 1
            goto L60
        L93:
            int r9 = r9 + r12
            int r10 = r10 + 1
            goto L46
        L97:
            int r9 = r9 / r10
            int r15 = r15.s
            int r1 = r9 + r15
        L9c:
            if (r1 != 0) goto L9f
            goto La2
        L9f:
            int r0 = r0 / r1
            if (r0 >= r8) goto La3
        La2:
            return r8
        La3:
            return r0
    }

    @Override // defpackage.tp3
    public final boolean d() {
            r0 = this;
            ip3 r0 = r0.a
            wo3 r0 = r0.h()
            java.util.List r0 = r0.m
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.tp3
    public final int e() {
            r0 = this;
            ip3 r0 = r0.a
            int r0 = r0.g()
            return r0
    }
}
