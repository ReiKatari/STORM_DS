package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p5  reason: default package */
/* loaded from: classes.dex */
public final class p5 implements defpackage.qn2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ defpackage.kk3 B;
    public final /* synthetic */ defpackage.ts4 L;

    public p5(java.util.List r1, defpackage.kk3 r2, defpackage.ts4 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r13) {
            r12 = this;
            wg3 r13 = (defpackage.wg3) r13
            android.view.KeyEvent r13 = r13.a
            r13.getClass()
            int r0 = defpackage.xk2.u(r13)
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L71
            int r13 = r13.getKeyCode()
            long r0 = defpackage.qo2.e(r13)
            long r3 = defpackage.kg3.K
            boolean r13 = defpackage.kg3.a(r0, r3)
            r3 = -1
            r4 = 1
            if (r13 == 0) goto L23
            r13 = r3
            goto L2e
        L23:
            long r5 = defpackage.kg3.L
            boolean r13 = defpackage.kg3.a(r0, r5)
            if (r13 == 0) goto L2d
            r13 = r4
            goto L2e
        L2d:
            r13 = r2
        L2e:
            kk3 r0 = r12.B
            kk3 r1 = defpackage.kk3.Ltr
            if (r0 != r1) goto L35
            goto L36
        L35:
            int r13 = -r13
        L36:
            java.util.List r0 = r12.A
            java.util.Iterator r1 = r0.iterator()
            r5 = r2
        L3d:
            boolean r6 = r1.hasNext()
            ts4 r7 = r12.L
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r1.next()
            c6 r6 = (defpackage.c6) r6
            long r8 = r6.a
            long r10 = r7.h()
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L57
            r3 = r5
            goto L5a
        L57:
            int r5 = r5 + 1
            goto L3d
        L5a:
            if (r13 == 0) goto L71
            int r12 = r0.size()
            int r3 = r3 + r13
            if (r3 < 0) goto L71
            if (r3 >= r12) goto L71
            java.lang.Object r12 = r0.get(r3)
            c6 r12 = (defpackage.c6) r12
            long r12 = r12.a
            r7.i(r12)
            r2 = r4
        L71:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
    }
}
