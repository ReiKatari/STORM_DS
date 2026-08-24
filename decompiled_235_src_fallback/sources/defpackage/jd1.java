package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd1  reason: default package */
/* loaded from: classes.dex */
public class jd1 implements defpackage.x42, defpackage.x93, defpackage.vr0, defpackage.kw2, defpackage.mk4, defpackage.k61, defpackage.wx4, defpackage.i71, defpackage.a97 {
    public final /* synthetic */ int A;

    public /* synthetic */ jd1(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public static final boolean c(defpackage.lt4 r5) {
            lt4 r0 = defpackage.kl5.X
            da0 r0 = r5.A
            da0 r1 = defpackage.f.a
            int r1 = defpackage.da0.k(r0, r1)
            r2 = -1
            if (r1 == r2) goto Le
            goto L16
        Le:
            da0 r1 = r5.A
            da0 r3 = defpackage.f.b
            int r1 = defpackage.da0.k(r1, r3)
        L16:
            r3 = 1
            r4 = 2
            if (r1 == r2) goto L21
            int r1 = r1 + r3
            r5 = 0
            da0 r0 = defpackage.da0.p(r0, r1, r5, r4)
            goto L2f
        L21:
            java.lang.Character r5 = r5.e()
            if (r5 == 0) goto L2f
            int r5 = r0.d()
            if (r5 != r4) goto L2f
            da0 r0 = defpackage.da0.R
        L2f:
            java.lang.String r5 = r0.s()
            java.lang.String r0 = ".class"
            boolean r5 = defpackage.xs6.Y(r5, r0, r3)
            r5 = r5 ^ r3
            return r5
    }

    @Override // defpackage.x42
    public java.lang.Object a(java.lang.String r1, java.security.Provider r2) {
            r0 = this;
            if (r2 != 0) goto L7
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r1)
            return r0
        L7:
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r1, r2)
            return r0
    }

    @Override // defpackage.vr0
    public defpackage.s83 b() {
            r2 = this;
            java.time.Instant r2 = defpackage.wa2.B()
            r2.getClass()
            s83 r0 = defpackage.s83.L
            long r0 = defpackage.wa2.e(r2)
            int r2 = defpackage.mc3.a(r2)
            s83 r2 = defpackage.bl2.A(r2, r0)
            return r2
    }

    @Override // defpackage.kw2
    public boolean d() {
            r6 = this;
            ta2 r6 = defpackage.ta2.a
            monitor-enter(r6)
            int r0 = defpackage.ta2.c     // Catch: java.lang.Throwable -> L2e
            int r1 = r0 + 1
            defpackage.ta2.c = r1     // Catch: java.lang.Throwable -> L2e
            r1 = 30
            if (r0 >= r1) goto L1a
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2e
            long r2 = defpackage.ta2.d     // Catch: java.lang.Throwable -> L2e
            r4 = 30000(0x7530, double:1.4822E-319)
            long r2 = r2 + r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L38
        L1a:
            r0 = 0
            defpackage.ta2.c = r0     // Catch: java.lang.Throwable -> L2e
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2e
            defpackage.ta2.d = r1     // Catch: java.lang.Throwable -> L2e
            java.io.File r1 = defpackage.ta2.b     // Catch: java.lang.Throwable -> L2e
            java.lang.String[] r1 = r1.list()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L30
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L3c
        L30:
            int r1 = r1.length     // Catch: java.lang.Throwable -> L2e
            r2 = 800(0x320, float:1.121E-42)
            if (r1 >= r2) goto L36
            r0 = 1
        L36:
            defpackage.ta2.e = r0     // Catch: java.lang.Throwable -> L2e
        L38:
            boolean r0 = defpackage.ta2.e     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r6)
            return r0
        L3c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            throw r0
    }

    @Override // defpackage.kw2
    public boolean e(defpackage.wi6 r3) {
            r2 = this;
            ge7 r2 = r3.a
            boolean r0 = r2 instanceof defpackage.pj1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto Le
            pj1 r2 = (defpackage.pj1) r2
            int r2 = r2.m
            goto Lf
        Le:
            r2 = r1
        Lf:
            r0 = 100
            if (r2 <= r0) goto L21
            ge7 r2 = r3.b
            boolean r3 = r2 instanceof defpackage.pj1
            if (r3 == 0) goto L1d
            pj1 r2 = (defpackage.pj1) r2
            int r1 = r2.m
        L1d:
            if (r1 <= r0) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    public java.lang.String f(java.lang.reflect.Method r1, int r2) {
            r0 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "parameter #"
            r0.<init>(r1)
            int r2 = r2 + 1
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Object g(java.lang.reflect.Method r1, java.lang.Object r2, java.lang.Object[] r3) {
            r0 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public boolean h(java.lang.reflect.Method r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.mk4
    public int i(int r1) {
            r0 = this;
            return r1
    }

    public boolean j(java.lang.CharSequence r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.mk4
    public int s(int r1) {
            r0 = this;
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 25: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "ReusedSlotId"
            return r1
    }
}
