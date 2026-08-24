package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: px7  reason: default package */
/* loaded from: classes.dex */
public final class px7 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.rx7 Z;

    public /* synthetic */ px7(defpackage.rx7 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            px7 r2 = (defpackage.px7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            px7 r2 = (defpackage.px7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            rx7 r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            px7 r3 = new px7
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            px7 r3 = new px7
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            rx7 r3 = r6.Z
            r4 = 0
            switch(r0) {
                case 0: goto L6b;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L1f
            if (r5 != r2) goto L1b
            defpackage.oi2.Y(r7)     // Catch: java.lang.Throwable -> L17 defpackage.ix7 -> L19 java.util.concurrent.CancellationException -> L48
            goto L34
        L17:
            r6 = move-exception
            goto L37
        L19:
            r6 = move-exception
            goto L4e
        L1b:
            defpackage.i.m(r1)
            goto L6a
        L1f:
            defpackage.oi2.Y(r7)
            tc3 r7 = r3.m     // Catch: java.lang.Throwable -> L17 defpackage.ix7 -> L19 java.util.concurrent.CancellationException -> L48
            px7 r1 = new px7     // Catch: java.lang.Throwable -> L17 defpackage.ix7 -> L19 java.util.concurrent.CancellationException -> L48
            r5 = 0
            r1.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L17 defpackage.ix7 -> L19 java.util.concurrent.CancellationException -> L48
            r6.Y = r2     // Catch: java.lang.Throwable -> L17 defpackage.ix7 -> L19 java.util.concurrent.CancellationException -> L48
            java.lang.Object r7 = defpackage.hv.d0(r7, r1, r6)     // Catch: java.lang.Throwable -> L17 defpackage.ix7 -> L19 java.util.concurrent.CancellationException -> L48
            if (r7 != r0) goto L34
            r4 = r0
            goto L6a
        L34:
            nx7 r7 = (defpackage.nx7) r7     // Catch: java.lang.Throwable -> L17 defpackage.ix7 -> L19 java.util.concurrent.CancellationException -> L48
            goto L55
        L37:
            java.lang.String r7 = defpackage.sx7.a
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r1 = "Unexpected error in WorkerWrapper"
            r0.e(r7, r1, r6)
            kx7 r7 = new kx7
            r7.<init>()
            goto L55
        L48:
            kx7 r7 = new kx7
            r7.<init>()
            goto L55
        L4e:
            mx7 r7 = new mx7
            int r6 = r6.A
            r7.<init>(r6)
        L55:
            androidx.work.impl.WorkDatabase r6 = r3.h
            ox7 r0 = new ox7
            r0.<init>(r7, r3)
            er2 r7 = new er2
            r1 = 25
            r7.<init>(r0, r1)
            java.lang.Object r4 = r6.o(r7)
            r4.getClass()
        L6a:
            return r4
        L6b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L7c
            if (r5 != r2) goto L77
            defpackage.oi2.Y(r7)
            goto L88
        L77:
            defpackage.i.m(r1)
            r7 = r4
            goto L88
        L7c:
            defpackage.oi2.Y(r7)
            r6.Y = r2
            java.lang.Object r7 = defpackage.rx7.a(r3, r6)
            if (r7 != r0) goto L88
            r7 = r0
        L88:
            return r7
    }
}
