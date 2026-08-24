package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi2  reason: default package */
/* loaded from: classes.dex */
public final class mi2 implements defpackage.ki2 {
    public final defpackage.rh a;
    public final defpackage.sh b;
    public final defpackage.rr6 c;
    public final defpackage.ri2 d;
    public final defpackage.s63 e;
    public final defpackage.bg2 f;

    public mi2(defpackage.rh r6, defpackage.sh r7) {
            r5 = this;
            rr6 r0 = defpackage.ni2.a
            ri2 r1 = new ri2
            bt r2 = defpackage.ni2.b
            r1.<init>(r2)
            s63 r2 = new s63
            r3 = 27
            r4 = 0
            r2.<init>(r3, r4)
            r5.<init>()
            r5.a = r6
            r5.b = r7
            r5.c = r0
            r5.d = r1
            r5.e = r2
            bg2 r6 = new bg2
            r7 = 1
            r6.<init>(r5, r7)
            r5.f = r6
            return
    }

    public final defpackage.we7 a(defpackage.te7 r5) {
            r4 = this;
            rr6 r0 = r4.c
            bi2 r1 = new bi2
            r2 = 1
            r1.<init>(r2, r4, r5)
            java.lang.Object r4 = r0.B
            w31 r4 = (defpackage.w31) r4
            monitor-enter(r4)
            java.lang.Object r2 = r0.L     // Catch: java.lang.Throwable -> L2c
            yz3 r2 = (defpackage.yz3) r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r2.h(r5)     // Catch: java.lang.Throwable -> L2c
            we7 r2 = (defpackage.we7) r2     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L21
            monitor-exit(r4)
            return r2
        L21:
            java.lang.Object r2 = r0.L     // Catch: java.lang.Throwable -> L2c
            yz3 r2 = (defpackage.yz3) r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r2.m(r5)     // Catch: java.lang.Throwable -> L2c
            we7 r2 = (defpackage.we7) r2     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r5 = move-exception
            goto L67
        L2e:
            monitor-exit(r4)
            ja7 r4 = new ja7     // Catch: java.lang.Exception -> L5e
            r2 = 4
            r4.<init>(r2, r0, r5)     // Catch: java.lang.Exception -> L5e
            java.lang.Object r4 = r1.g(r4)     // Catch: java.lang.Exception -> L5e
            we7 r4 = (defpackage.we7) r4     // Catch: java.lang.Exception -> L5e
            java.lang.Object r1 = r0.B
            w31 r1 = (defpackage.w31) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.L     // Catch: java.lang.Throwable -> L58
            yz3 r2 = (defpackage.yz3) r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r2 = r2.h(r5)     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L5a
            boolean r2 = r4.c()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L5a
            java.lang.Object r0 = r0.L     // Catch: java.lang.Throwable -> L58
            yz3 r0 = (defpackage.yz3) r0     // Catch: java.lang.Throwable -> L58
            r0.l(r5, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L5c
        L5a:
            monitor-exit(r1)
            return r4
        L5c:
            monitor-exit(r1)
            throw r4
        L5e:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r5.<init>(r0, r4)
            throw r5
        L67:
            monitor-exit(r4)
            throw r5
    }

    public final defpackage.we7 b(defpackage.li2 r7, defpackage.oj2 r8, int r9, int r10) {
            r6 = this;
            te7 r0 = new te7
            sh r1 = r6.b
            r1.getClass()
            int r1 = r1.A
            if (r1 == 0) goto L22
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L11
            goto L22
        L11:
            int r8 = r8.A
            int r8 = r8 + r1
            r1 = 1
            r2 = 1000(0x3e8, float:1.401E-42)
            int r8 = defpackage.gi2.q(r8, r1, r2)
            oj2 r1 = new oj2
            r1.<init>(r8)
            r2 = r1
            goto L23
        L22:
            r2 = r8
        L23:
            rh r8 = r6.a
            r8.getClass()
            r5 = 0
            r1 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            we7 r6 = r6.a(r0)
            return r6
    }
}
