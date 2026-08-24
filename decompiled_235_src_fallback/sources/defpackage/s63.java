package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s63  reason: default package */
/* loaded from: classes.dex */
public final class s63 implements defpackage.jl3, defpackage.so2, defpackage.mm5, defpackage.rb0, defpackage.x14, defpackage.oj1, defpackage.v23, defpackage.b51 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public s63(int r2) {
            r1 = this;
            r0 = 22
            r1.A = r0
            r1.<init>()
            int[] r2 = new int[r2]
            tp6 r2 = defpackage.up6.a(r2)
            r1.B = r2
            return
    }

    public s63(int r1, byte r2) {
            r0 = this;
            r0.A = r1
            switch(r1) {
                case 14: goto L4b;
                case 27: goto L30;
                case 28: goto L24;
                default: goto L5;
            }
        L5:
            k04 r1 = new k04
            r1.<init>()
            r0.<init>()
            r0.B = r1
            boolean r0 = r1.B
            if (r0 == 0) goto L14
            goto L23
        L14:
            boolean r0 = r1.L
            if (r0 == 0) goto L1d
            java.lang.String r0 = "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"
            defpackage.s05.a(r0)
        L1d:
            r1.a()
            r0 = 1
            r1.L = r0
        L23:
            return
        L24:
            r0.<init>()
            hz3 r1 = new hz3
            r2 = 0
            r1.<init>(r2)
            r0.B = r1
            return
        L30:
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L41
            w31 r1 = new w31
            r2 = 19
            r1.<init>(r2)
            goto L48
        L41:
            x31 r1 = new x31
            r2 = 19
            r1.<init>(r2)
        L48:
            r0.B = r1
            return
        L4b:
            r0.<init>()
            s94 r1 = new s94
            r1.<init>()
            r0.B = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return
    }

    public s63(android.content.Context r5) {
            r4 = this;
            r0 = 15
            r4.A = r0
            java.lang.StringBuilder r0 = defpackage.ck7.a
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.flags
            r1 = 1048576(0x100000, float:1.469368E-39)
            r5 = r5 & r1
            if (r5 == 0) goto L1e
            int r5 = r0.getLargeMemoryClass()
            goto L22
        L1e:
            int r5 = r0.getMemoryClass()
        L22:
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = (long) r5
            long r2 = r2 * r0
            r0 = 7
            long r2 = r2 / r0
            int r5 = (int) r2
            r4.<init>()
            nr1 r0 = new nr1
            r1 = 1
            r0.<init>(r5, r1)
            r4.B = r0
            return
    }

    public s63(android.net.Uri r3, android.content.ClipDescription r4, android.net.Uri r5) {
            r2 = this;
            r0 = 0
            r2.A = r0
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L14
            q63 r0 = new q63
            r0.<init>(r3, r4, r5)
            r2.B = r0
            goto L1b
        L14:
            bt r0 = new bt
            r0.<init>(r3, r4, r5, r1)
            r2.B = r0
        L1b:
            return
    }

    public s63(defpackage.bb r2, java.lang.Class r3) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            java.util.Map r0 = r2.b
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L2c
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1b
            goto L2c
        L1b:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = r3.getName()
            java.lang.String r3 = "Given internalKeyMananger "
            java.lang.String r0 = " does not support primitive class "
            defpackage.e41.k(r3, r1, r0, r2)
            r1 = 0
            throw r1
        L2c:
            r1.B = r2
            return
    }

    public s63(java.io.FileInputStream r3) {
            r2 = this;
            r0 = 1
            r2.A = r0
            r2.<init>()
            pm0 r0 = new pm0
            java.nio.charset.Charset r1 = defpackage.qm0.a
            r0.<init>(r3, r1)
            r2.B = r0
            return
    }

    public /* synthetic */ s63(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public s63(defpackage.pe5 r1, defpackage.ap3 r2) {
            r0 = this;
            r2 = 18
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    public static final defpackage.s63 A(defpackage.s35 r5, defpackage.os0 r6) {
            byte[] r5 = r5.A()
            g82 r0 = defpackage.g82.a()
            j42 r5 = defpackage.j42.q(r5, r0)
            ea0 r0 = r5.o()
            int r0 = r0.size()
            r1 = 0
            java.lang.String r2 = "empty keyset"
            if (r0 == 0) goto L54
            s63 r0 = new s63
            ea0 r5 = r5.o()     // Catch: defpackage.ub3 -> L4e
            int r3 = r5.size()     // Catch: defpackage.ub3 -> L4e
            if (r3 != 0) goto L28
            byte[] r5 = defpackage.aa3.b     // Catch: defpackage.ub3 -> L4e
            goto L2e
        L28:
            byte[] r4 = new byte[r3]     // Catch: defpackage.ub3 -> L4e
            r5.d(r4, r3)     // Catch: defpackage.ub3 -> L4e
            r5 = r4
        L2e:
            r3 = 0
            byte[] r3 = new byte[r3]     // Catch: defpackage.ub3 -> L4e
            byte[] r5 = r6.T(r5, r3)     // Catch: defpackage.ub3 -> L4e
            g82 r6 = defpackage.g82.a()     // Catch: defpackage.ub3 -> L4e
            ii3 r5 = defpackage.ii3.t(r5, r6)     // Catch: defpackage.ub3 -> L4e
            int r6 = r5.p()     // Catch: defpackage.ub3 -> L4e
            if (r6 <= 0) goto L48
            r6 = 5
            r0.<init>(r5, r6)
            return r0
        L48:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: defpackage.ub3 -> L4e
            r5.<init>(r2)     // Catch: defpackage.ub3 -> L4e
            throw r5     // Catch: defpackage.ub3 -> L4e
        L4e:
            java.lang.String r5 = "invalid keyset, corrupted key material"
            defpackage.e41.v(r5)
            return r1
        L54:
            defpackage.e41.v(r2)
            return r1
    }

    public static defpackage.oq3 C(defpackage.s63 r10, int r11) {
            java.lang.Object r10 = r10.B
            pr3 r10 = (defpackage.pr3) r10
            vl6 r1 = defpackage.ln2.t()
            if (r1 == 0) goto L10
            qn2 r0 = r1.e()
        Le:
            r2 = r0
            goto L12
        L10:
            r0 = 0
            goto Le
        L12:
            vl6 r3 = defpackage.ln2.N(r1)
            vs4 r0 = r10.f     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L32
            jr3 r0 = (defpackage.jr3) r0     // Catch: java.lang.Throwable -> L32
            defpackage.ln2.V(r1, r3, r2)
            pq3 r4 = r10.q
            long r6 = r0.j
            boolean r8 = r10.d
            v83 r9 = new v83
            r9.<init>(r11, r0)
            r5 = r11
            oq3 r10 = r4.a(r5, r6, r8, r9)
            return r10
        L32:
            r0 = move-exception
            r10 = r0
            defpackage.ln2.V(r1, r3, r2)
            throw r10
    }

    public static defpackage.ed6 m(defpackage.s23 r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            sy6 r1 = defpackage.sy6.b
            ed6 r2 = new ed6
            android.util.Size r3 = new android.util.Size
            int r4 = r8.getWidth()
            int r5 = r8.getHeight()
            r3.<init>(r4, r5)
            ke0 r4 = new ke0
            bg1 r5 = new bg1
            i23 r6 = r8.S()
            long r6 = r6.c()
            r5.<init>(r0, r1, r6)
            r4.<init>(r5)
            r2.<init>(r8, r3, r4)
            return r2
    }

    public static defpackage.bu6 u(defpackage.re5 r8, defpackage.z23 r9, defpackage.c44 r10, defpackage.d44 r11) {
            bu6 r0 = new bu6
            android.graphics.Bitmap r1 = r11.a
            android.content.Context r2 = r9.a
            android.content.res.Resources r2 = r2.getResources()
            r3 = r1
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r2, r3)
            zb1 r3 = defpackage.zb1.MEMORY_CACHE
            java.util.Map r11 = r11.b
            java.lang.String r2 = "coil#disk_cache_key"
            java.lang.Object r2 = r11.get(r2)
            boolean r4 = r2 instanceof java.lang.String
            r5 = 0
            if (r4 == 0) goto L22
            java.lang.String r2 = (java.lang.String) r2
            goto L23
        L22:
            r2 = r5
        L23:
            java.lang.String r4 = "coil#is_sampled"
            java.lang.Object r11 = r11.get(r4)
            boolean r4 = r11 instanceof java.lang.Boolean
            if (r4 == 0) goto L30
            r5 = r11
            java.lang.Boolean r5 = (java.lang.Boolean) r5
        L30:
            r11 = 0
            if (r5 == 0) goto L39
            boolean r4 = r5.booleanValue()
            r6 = r4
            goto L3a
        L39:
            r6 = r11
        L3a:
            android.graphics.Bitmap$Config[] r4 = defpackage.k.a
            if (r8 == 0) goto L43
            boolean r8 = r8.A
            if (r8 == 0) goto L43
            r11 = 1
        L43:
            r4 = r10
            r7 = r11
            r5 = r2
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static int z() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1 = 4
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = r2
        La:
            if (r3 != 0) goto L2c
            r0.nextBytes(r1)
            r3 = r1[r2]
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 24
            r4 = 1
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            r4 = 2
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            r4 = 3
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            goto La
        L2c:
            return r3
    }

    public java.util.ArrayList B(int r20) {
            r19 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r19
            java.lang.Object r1 = r1.B
            ip3 r1 = (defpackage.ip3) r1
            vl6 r2 = defpackage.ln2.t()
            if (r2 == 0) goto L17
            qn2 r3 = r2.e()
            r9 = r3
            goto L18
        L17:
            r9 = 0
        L18:
            vl6 r10 = defpackage.ln2.N(r2)
            boolean r3 = r1.b     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L26
            wo3 r3 = r1.c     // Catch: java.lang.Throwable -> L24
        L22:
            r8 = r3
            goto L2f
        L24:
            r0 = move-exception
            goto L85
        L26:
            vs4 r3 = r1.e     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L24
            wo3 r3 = (defpackage.wo3) r3     // Catch: java.lang.Throwable -> L24
            goto L22
        L2f:
            if (r8 == 0) goto L81
            bh5 r5 = new bh5     // Catch: java.lang.Throwable -> L24
            r5.<init>()     // Catch: java.lang.Throwable -> L24
            r3 = 1
            r5.A = r3     // Catch: java.lang.Throwable -> L24
            qn2 r3 = r8.k     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r3.g(r6)     // Catch: java.lang.Throwable -> L24
            r6 = r3
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L24
            int r11 = r6.size()     // Catch: java.lang.Throwable -> L24
            r3 = 0
            r12 = r3
        L4c:
            if (r12 >= r11) goto L81
            java.lang.Object r3 = r6.get(r12)     // Catch: java.lang.Throwable -> L24
            vr4 r3 = (defpackage.vr4) r3     // Catch: java.lang.Throwable -> L24
            pq3 r13 = r1.o     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r3.A     // Catch: java.lang.Throwable -> L24
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L24
            int r14 = r7.intValue()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r3.B     // Catch: java.lang.Throwable -> L24
            q21 r3 = (defpackage.q21) r3     // Catch: java.lang.Throwable -> L24
            r7 = r5
            long r4 = r3.a     // Catch: java.lang.Throwable -> L24
            ap3 r3 = defpackage.ip3.w     // Catch: java.lang.Throwable -> L24
            cn r18 = new cn     // Catch: java.lang.Throwable -> L24
            r15 = r4
            r5 = r7
            r3 = r18
            r4 = 0
            r7 = r20
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L24
            r18 = r3
            r17 = 0
            oq3 r3 = r13.a(r14, r15, r17, r18)     // Catch: java.lang.Throwable -> L24
            r0.add(r3)     // Catch: java.lang.Throwable -> L24
            int r12 = r12 + 1
            goto L4c
        L81:
            defpackage.ln2.V(r2, r10, r9)
            return r0
        L85:
            defpackage.ln2.V(r2, r10, r9)
            throw r0
    }

    @Override // defpackage.v23
    public defpackage.s23 a() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            s23 r0 = r0.a()
            ed6 r0 = m(r0)
            return r0
    }

    @Override // defpackage.v23
    public int b() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            int r0 = r0.b()
            return r0
    }

    @Override // defpackage.oj1
    public boolean c(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            r1 = 0
            return r1
        L7:
            r1.k()
            java.lang.Object r1 = r1.B
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            int r2 = (int) r2
            r1.j(r2)
            r1 = 1
            return r1
    }

    @Override // defpackage.v23
    public void close() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            r0.close()
            return
    }

    @Override // defpackage.v23
    public void d() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            r0.d()
            return
    }

    @Override // defpackage.v23
    public void e(defpackage.u23 r4, java.util.concurrent.Executor r5) {
            r3 = this;
            java.lang.Object r0 = r3.B
            ci r0 = (defpackage.ci) r0
            pk0 r1 = new pk0
            r2 = 2
            r1.<init>(r2, r3, r4)
            r0.e(r1, r5)
            return
    }

    @Override // defpackage.v23
    public int f() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            int r0 = r0.f()
            return r0
    }

    @Override // defpackage.oj1
    public float g() {
            r0 = this;
            java.lang.Object r0 = r0.B
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            float r0 = r0.getVerticalScrollFactorCompat()
            float r0 = -r0
            return r0
    }

    @Override // defpackage.v23
    public int getHeight() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            int r0 = r0.getHeight()
            return r0
    }

    @Override // defpackage.v23
    public android.view.Surface getSurface() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            android.view.Surface r0 = r0.getSurface()
            return r0
    }

    @Override // defpackage.v23
    public int getWidth() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            int r0 = r0.getWidth()
            return r0
    }

    @Override // defpackage.b51
    public java.lang.Object h(java.lang.Object r1) {
            r0 = this;
            yl5 r1 = (defpackage.yl5) r1
            java.lang.Object r0 = r0.B
            b51 r0 = (defpackage.b51) r0
            java.lang.Object r0 = r0.h(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            return r0
    }

    @Override // defpackage.so2
    public void i(java.lang.Throwable r6) {
            r5 = this;
            java.lang.Object r5 = r5.B
            ci0 r5 = (defpackage.ci0) r5
            rk3 r6 = new rk3
            r0 = 1
            r6.<init>(r5, r0)
            boolean r1 = defpackage.nj2.x()
            if (r1 == 0) goto L14
            r6.run()
            goto L3c
        L14:
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r1.<init>(r0)
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            q64 r3 = new q64
            r4 = 9
            r3.<init>(r4, r6, r1)
            boolean r6 = r2.post(r3)
            java.lang.String r2 = "Unable to post to main thread"
            defpackage.np2.A(r2, r6)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Ld0
            r2 = 30000(0x7530, double:1.4822E-319)
            boolean r6 = r1.await(r2, r6)     // Catch: java.lang.InterruptedException -> Ld0
            if (r6 == 0) goto Lc8
        L3c:
            java.lang.Object r6 = r5.d
            gj0 r6 = (defpackage.gj0) r6
            if (r6 == 0) goto La5
            r6.getClass()
            gh0 r6 = r6.n
            r6.getClass()
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.n
            k0 r1 = new k0
            r2 = 16
            r1.<init>(r5, r2)
            defpackage.gt0.W0(r6, r1)
            java.lang.Object r6 = r5.d
            gj0 r6 = (defpackage.gj0) r6
            r6.getClass()
            java.lang.Object r1 = r6.b
            monitor-enter(r1)
            android.os.Handler r2 = r6.e     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = "retry_token"
            r2.removeCallbacksAndMessages(r3)     // Catch: java.lang.Throwable -> L91
            fj0 r2 = r6.p     // Catch: java.lang.Throwable -> L91
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L9b
            if (r2 == r0) goto L93
            r0 = 2
            if (r2 == r0) goto L78
            r0 = 3
            if (r2 == r0) goto L78
            goto L8d
        L78:
            fj0 r0 = defpackage.fj0.SHUTDOWN     // Catch: java.lang.Throwable -> L91
            r6.p = r0     // Catch: java.lang.Throwable -> L91
            java.lang.Integer r0 = r6.r     // Catch: java.lang.Throwable -> L91
            defpackage.gj0.a(r0)     // Catch: java.lang.Throwable -> L91
            h61 r0 = new h61     // Catch: java.lang.Throwable -> L91
            r2 = 4
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L91
            tb0 r0 = defpackage.ak7.W(r0)     // Catch: java.lang.Throwable -> L91
            r6.q = r0     // Catch: java.lang.Throwable -> L91
        L8d:
            gx3 r6 = r6.q     // Catch: java.lang.Throwable -> L91
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L91
            goto La7
        L91:
            r5 = move-exception
            goto La3
        L93:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r6 = "CameraX could not be shutdown when it is initializing."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L91
            throw r5     // Catch: java.lang.Throwable -> L91
        L9b:
            fj0 r0 = defpackage.fj0.SHUTDOWN     // Catch: java.lang.Throwable -> L91
            r6.p = r0     // Catch: java.lang.Throwable -> L91
            n33 r6 = defpackage.n33.L     // Catch: java.lang.Throwable -> L91
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L91
            goto La7
        La3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L91
            throw r5
        La5:
            n33 r6 = defpackage.n33.L
        La7:
            r6.getClass()
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            r1 = 0
            r5.b = r1     // Catch: java.lang.Throwable -> Lc5
            r5.c = r6     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r6 = r5.g     // Catch: java.lang.Throwable -> Lc5
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch: java.lang.Throwable -> Lc5
            r6.clear()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r6 = r5.h     // Catch: java.lang.Throwable -> Lc5
            java.util.HashSet r6 = (java.util.HashSet) r6     // Catch: java.lang.Throwable -> Lc5
            r6.clear()     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r0)
            r5.j(r1, r1)
            return
        Lc5:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        Lc8:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.InterruptedException -> Ld0
            java.lang.String r6 = "Timeout to wait main thread execution"
            r5.<init>(r6)     // Catch: java.lang.InterruptedException -> Ld0
            throw r5     // Catch: java.lang.InterruptedException -> Ld0
        Ld0:
            r5 = move-exception
            ug r6 = new ug
            r6.<init>(r5)
            throw r6
    }

    @Override // defpackage.v23
    public defpackage.s23 j() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ci r0 = (defpackage.ci) r0
            s23 r0 = r0.j()
            ed6 r0 = m(r0)
            return r0
    }

    @Override // defpackage.oj1
    public void k() {
            r0 = this;
            java.lang.Object r0 = r0.B
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            android.widget.OverScroller r0 = r0.R
            r0.abortAnimation()
            return
    }

    public defpackage.x61 l(defpackage.bm0 r6, defpackage.s41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ei4
            if (r0 == 0) goto L13
            r0 = r7
            ei4 r0 = (defpackage.ei4) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ei4 r0 = new ei4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2a:
            defpackage.oi2.Y(r7)
            goto L3e
        L2e:
            defpackage.oi2.Y(r7)
            java.lang.Object r5 = r5.B
            tp6 r5 = (defpackage.tp6) r5
            r0.Y = r4
            java.lang.Object r5 = r5.b(r6, r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            defpackage.e41.c()
            return r3
    }

    public defpackage.d44 n(defpackage.z23 r18, defpackage.c44 r19, defpackage.wi6 r20, defpackage.y56 r21) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            ra0 r3 = r0.p
            boolean r3 = r3.getReadEnabled()
            if (r3 != 0) goto L12
        Le:
            r16 = 0
            goto L11a
        L12:
            r3 = r17
            java.lang.Object r3 = r3.B
            pe5 r3 = (defpackage.pe5) r3
            ex6 r3 = r3.c
            java.lang.Object r3 = r3.getValue()
            se5 r3 = (defpackage.se5) r3
            if (r3 == 0) goto L31
            at6 r5 = r3.a
            d44 r5 = r5.a(r1)
            if (r5 != 0) goto L32
            rs7 r3 = r3.b
            d44 r5 = r3.a(r1)
            goto L32
        L31:
            r5 = 0
        L32:
            if (r5 == 0) goto Le
            android.graphics.Bitmap r3 = r5.a
            android.graphics.Bitmap$Config r6 = r3.getConfig()
            if (r6 != 0) goto L3e
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L3e:
            boolean r6 = defpackage.nb3.B(r6)
            if (r6 != 0) goto L45
            goto L50
        L45:
            boolean r6 = r0.m
            if (r6 != 0) goto L50
            r17 = r5
            r7 = 0
        L4c:
            r16 = 0
            goto L117
        L50:
            java.util.Map r6 = r5.b
            java.lang.String r8 = "coil#is_sampled"
            java.lang.Object r6 = r6.get(r8)
            boolean r8 = r6 instanceof java.lang.Boolean
            if (r8 == 0) goto L5f
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L60
        L5f:
            r6 = 0
        L60:
            if (r6 == 0) goto L67
            boolean r6 = r6.booleanValue()
            goto L68
        L67:
            r6 = 0
        L68:
            wi6 r8 = defpackage.wi6.c
            boolean r8 = defpackage.nb3.k(r2, r8)
            r9 = 1
            if (r8 == 0) goto L79
            r17 = r5
            r16 = 0
            if (r6 == 0) goto L116
            goto L114
        L79:
            java.util.Map r1 = r1.B
            java.lang.String r8 = "coil#transformation_size"
            java.lang.Object r1 = r1.get(r8)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L90
            java.lang.String r0 = r2.toString()
            boolean r7 = r1.equals(r0)
            r17 = r5
            goto L4c
        L90:
            int r1 = r3.getWidth()
            int r3 = r3.getHeight()
            ge7 r8 = r2.a
            boolean r10 = r8 instanceof defpackage.pj1
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == 0) goto La6
            pj1 r8 = (defpackage.pj1) r8
            int r8 = r8.m
            goto La7
        La6:
            r8 = r11
        La7:
            ge7 r2 = r2.b
            boolean r10 = r2 instanceof defpackage.pj1
            if (r10 == 0) goto Lb4
            pj1 r2 = (defpackage.pj1) r2
            int r2 = r2.m
        Lb1:
            r10 = r21
            goto Lb6
        Lb4:
            r2 = r11
            goto Lb1
        Lb6:
            double r12 = defpackage.ak7.N(r1, r3, r8, r2, r10)
            boolean r0 = defpackage.h.a(r0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto Le7
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 <= 0) goto Lcc
            r10 = r14
        Lc7:
            r17 = r5
            r16 = 0
            goto Lce
        Lcc:
            r10 = r12
            goto Lc7
        Lce:
            double r4 = (double) r8
            double r7 = (double) r1
            double r7 = r7 * r10
            double r4 = r4 - r7
            double r4 = java.lang.Math.abs(r4)
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 <= 0) goto L116
            double r1 = (double) r2
            double r3 = (double) r3
            double r10 = r10 * r3
            double r1 = r1 - r10
            double r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 > 0) goto L106
            goto L116
        Le7:
            r17 = r5
            r16 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r4) goto Lf9
            if (r8 != r11) goto Lf2
            goto Lf9
        Lf2:
            int r8 = r8 - r1
            int r1 = java.lang.Math.abs(r8)
            if (r1 > r9) goto L106
        Lf9:
            if (r2 == r4) goto L116
            if (r2 != r11) goto Lfe
            goto L116
        Lfe:
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            if (r1 > r9) goto L106
            goto L116
        L106:
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 != 0) goto L10b
            goto L10e
        L10b:
            if (r0 != 0) goto L10e
            goto L114
        L10e:
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L116
            if (r6 == 0) goto L116
        L114:
            r7 = 0
            goto L117
        L116:
            r7 = r9
        L117:
            if (r7 == 0) goto L11a
            return r17
        L11a:
            return r16
    }

    public synchronized defpackage.s63 o() {
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.B     // Catch: java.lang.Throwable -> L21
            fi3 r0 = (defpackage.fi3) r0     // Catch: java.lang.Throwable -> L21
            pr2 r0 = r0.a()     // Catch: java.lang.Throwable -> L21
            ii3 r0 = (defpackage.ii3) r0     // Catch: java.lang.Throwable -> L21
            int r1 = r0.p()     // Catch: java.lang.Throwable -> L21
            if (r1 <= 0) goto L19
            s63 r1 = new s63     // Catch: java.lang.Throwable -> L21
            r2 = 5
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)
            return r1
        L19:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "empty keyset"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
        L21:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            return
    }

    public synchronized boolean p(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.B     // Catch: java.lang.Throwable -> L2a
            fi3 r0 = (defpackage.fi3) r0     // Catch: java.lang.Throwable -> L2a
            pr2 r0 = r0.B     // Catch: java.lang.Throwable -> L2a
            ii3 r0 = (defpackage.ii3) r0     // Catch: java.lang.Throwable -> L2a
            java.util.List r0 = r0.q()     // Catch: java.lang.Throwable -> L2a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2a
            hi3 r1 = (defpackage.hi3) r1     // Catch: java.lang.Throwable -> L2a
            int r1 = r1.r()     // Catch: java.lang.Throwable -> L2a
            if (r1 != r3) goto L15
            monitor-exit(r2)
            r2 = 1
            return r2
        L2a:
            r3 = move-exception
            goto L2f
        L2c:
            monitor-exit(r2)
            r2 = 0
            return r2
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3
    }

    public defpackage.c44 q(defpackage.z23 r8, java.lang.Object r9, defpackage.fo4 r10, defpackage.k62 r11) {
            r7 = this;
            c44 r11 = r8.e
            java.util.List r0 = r8.h
            if (r11 == 0) goto L7
            return r11
        L7:
            java.lang.Object r7 = r7.B
            pe5 r7 = (defpackage.pe5) r7
            uv0 r7 = r7.g
            java.util.List r7 = r7.c
            int r11 = r7.size()
            r1 = 0
            r2 = r1
        L15:
            r3 = 0
            if (r2 >= r11) goto L3d
            java.lang.Object r4 = r7.get(r2)
            vr4 r4 = (defpackage.vr4) r4
            java.lang.Object r5 = r4.A
            zh3 r5 = (defpackage.zh3) r5
            java.lang.Object r4 = r4.B
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class r6 = r9.getClass()
            boolean r4 = r4.isAssignableFrom(r6)
            if (r4 == 0) goto L3a
            r5.getClass()
            java.lang.String r4 = r5.a(r9, r10)
            if (r4 == 0) goto L3a
            goto L3e
        L3a:
            int r2 = r2 + 1
            goto L15
        L3d:
            r4 = r3
        L3e:
            if (r4 != 0) goto L41
            return r3
        L41:
            ps4 r7 = r8.z
            java.util.Map r7 = r7.A
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L4e
            zt1 r7 = defpackage.zt1.A
            goto L62
        L4e:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            boolean r9 = r7.hasNext()
            if (r9 != 0) goto La2
            r7 = r8
        L62:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L74
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L74
            c44 r7 = new c44
            r7.<init>(r4)
            return r7
        L74:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r7)
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L9c
            int r7 = r0.size()
            if (r7 > 0) goto L91
            wi6 r7 = r10.d
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "coil#transformation_size"
            r8.put(r9, r7)
            goto L9c
        L91:
            java.lang.Object r7 = r0.get(r1)
            r7.getClass()
            defpackage.u34.a()
            return r3
        L9c:
            c44 r7 = new c44
            r7.<init>(r4, r8)
            return r7
        La2:
            java.lang.Object r7 = r7.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            r7.getClass()
            defpackage.u34.a()
            return r3
    }

    public synchronized defpackage.hi3 r(defpackage.mh3 r5) {
            r4 = this;
            monitor-enter(r4)
            vg3 r0 = defpackage.ai5.c(r5)     // Catch: java.lang.Throwable -> L23
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L23
            int r1 = z()     // Catch: java.lang.Throwable -> L15
        La:
            boolean r2 = r4.p(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            int r1 = z()     // Catch: java.lang.Throwable -> L15
            goto La
        L15:
            r5 = move-exception
            goto L5b
        L17:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            jp4 r5 = r5.p()     // Catch: java.lang.Throwable -> L23
            jp4 r2 = defpackage.jp4.UNKNOWN_PREFIX     // Catch: java.lang.Throwable -> L23
            if (r5 != r2) goto L25
            jp4 r5 = defpackage.jp4.TINK     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r5 = move-exception
            goto L5d
        L25:
            gi3 r2 = defpackage.hi3.v()     // Catch: java.lang.Throwable -> L23
            r2.c()     // Catch: java.lang.Throwable -> L23
            pr2 r3 = r2.B     // Catch: java.lang.Throwable -> L23
            hi3 r3 = (defpackage.hi3) r3     // Catch: java.lang.Throwable -> L23
            defpackage.hi3.m(r3, r0)     // Catch: java.lang.Throwable -> L23
            r2.c()     // Catch: java.lang.Throwable -> L23
            pr2 r0 = r2.B     // Catch: java.lang.Throwable -> L23
            hi3 r0 = (defpackage.hi3) r0     // Catch: java.lang.Throwable -> L23
            defpackage.hi3.p(r0, r1)     // Catch: java.lang.Throwable -> L23
            hh3 r0 = defpackage.hh3.ENABLED     // Catch: java.lang.Throwable -> L23
            r2.c()     // Catch: java.lang.Throwable -> L23
            pr2 r1 = r2.B     // Catch: java.lang.Throwable -> L23
            hi3 r1 = (defpackage.hi3) r1     // Catch: java.lang.Throwable -> L23
            defpackage.hi3.o(r1, r0)     // Catch: java.lang.Throwable -> L23
            r2.c()     // Catch: java.lang.Throwable -> L23
            pr2 r0 = r2.B     // Catch: java.lang.Throwable -> L23
            hi3 r0 = (defpackage.hi3) r0     // Catch: java.lang.Throwable -> L23
            defpackage.hi3.n(r0, r5)     // Catch: java.lang.Throwable -> L23
            pr2 r5 = r2.a()     // Catch: java.lang.Throwable -> L23
            hi3 r5 = (defpackage.hi3) r5     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)
            return r5
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r5     // Catch: java.lang.Throwable -> L23
        L5d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    @Override // defpackage.rb0
    public java.lang.Object s(defpackage.qb0 r4) {
            r3 = this;
            java.lang.Object r0 = r3.B
            pw3 r0 = (defpackage.pw3) r0
            qb0 r1 = r0.Y
            if (r1 != 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.String r2 = "The result can only set once!"
            defpackage.np2.A(r2, r1)
            r0.Y = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "ListFuture["
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r3 = "]"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            return r3
    }

    public defpackage.vg3 t(defpackage.ea0 r5) {
            r4 = this;
            java.lang.Object r4 = r4.B
            bb r4 = (defpackage.bb) r4
            int r0 = r4.d     // Catch: defpackage.ub3 -> L89
            switch(r0) {
                case 0: goto L10;
                default: goto L9;
            }     // Catch: defpackage.ub3 -> L89
        L9:
            za r0 = new za     // Catch: defpackage.ub3 -> L89
            r1 = 1
            r0.<init>(r4, r1)     // Catch: defpackage.ub3 -> L89
            goto L16
        L10:
            za r0 = new za     // Catch: defpackage.ub3 -> L89
            r1 = 0
            r0.<init>(r4, r1)     // Catch: defpackage.ub3 -> L89
        L16:
            c1 r5 = r0.S(r5)     // Catch: defpackage.ub3 -> L89
            r0.i0(r5)     // Catch: defpackage.ub3 -> L89
            java.lang.Object r5 = r0.m(r5)     // Catch: defpackage.ub3 -> L89
            c1 r5 = (defpackage.c1) r5     // Catch: defpackage.ub3 -> L89
            tg3 r0 = defpackage.vg3.t()     // Catch: defpackage.ub3 -> L89
            java.lang.String r1 = r4.a()     // Catch: defpackage.ub3 -> L89
            r0.c()     // Catch: defpackage.ub3 -> L89
            pr2 r2 = r0.B     // Catch: defpackage.ub3 -> L89
            vg3 r2 = (defpackage.vg3) r2     // Catch: defpackage.ub3 -> L89
            defpackage.vg3.m(r2, r1)     // Catch: defpackage.ub3 -> L89
            int r1 = r5.a()     // Catch: java.io.IOException -> L7c
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L7c
            ms0 r3 = new ms0     // Catch: java.io.IOException -> L7c
            r3.<init>(r2, r1)     // Catch: java.io.IOException -> L7c
            r5.d(r3)     // Catch: java.io.IOException -> L7c
            int r1 = r3.c     // Catch: java.io.IOException -> L7c
            int r3 = r3.d     // Catch: java.io.IOException -> L7c
            int r1 = r1 - r3
            if (r1 != 0) goto L74
            ca0 r1 = new ca0     // Catch: java.io.IOException -> L7c
            r1.<init>(r2)     // Catch: java.io.IOException -> L7c
            r0.c()     // Catch: defpackage.ub3 -> L89
            pr2 r5 = r0.B     // Catch: defpackage.ub3 -> L89
            vg3 r5 = (defpackage.vg3) r5     // Catch: defpackage.ub3 -> L89
            defpackage.vg3.n(r5, r1)     // Catch: defpackage.ub3 -> L89
            int r4 = r4.d     // Catch: defpackage.ub3 -> L89
            switch(r4) {
                case 0: goto L61;
                default: goto L5e;
            }     // Catch: defpackage.ub3 -> L89
        L5e:
            ug3 r4 = defpackage.ug3.SYMMETRIC     // Catch: defpackage.ub3 -> L89
            goto L63
        L61:
            ug3 r4 = defpackage.ug3.SYMMETRIC     // Catch: defpackage.ub3 -> L89
        L63:
            r0.c()     // Catch: defpackage.ub3 -> L89
            pr2 r5 = r0.B     // Catch: defpackage.ub3 -> L89
            vg3 r5 = (defpackage.vg3) r5     // Catch: defpackage.ub3 -> L89
            defpackage.vg3.o(r5, r4)     // Catch: defpackage.ub3 -> L89
            pr2 r4 = r0.a()     // Catch: defpackage.ub3 -> L89
            vg3 r4 = (defpackage.vg3) r4     // Catch: defpackage.ub3 -> L89
            return r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L7c
            java.lang.String r0 = "Did not write as much data as expected."
            r4.<init>(r0)     // Catch: java.io.IOException -> L7c
            throw r4     // Catch: java.io.IOException -> L7c
        L7c:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: defpackage.ub3 -> L89
            java.lang.String r1 = "ByteString"
            java.lang.String r5 = r5.b(r1)     // Catch: defpackage.ub3 -> L89
            r0.<init>(r5, r4)     // Catch: defpackage.ub3 -> L89
            throw r0     // Catch: defpackage.ub3 -> L89
        L89:
            r4 = move-exception
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Unexpected proto"
            r5.<init>(r0, r4)
            throw r5
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 5: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Object r1 = r1.B
            ii3 r1 = (defpackage.ii3) r1
            ni3 r1 = defpackage.bk7.a(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public void v(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Ld
            java.lang.Object r2 = r2.B
            android.view.autofill.AutofillManager r2 = (android.view.autofill.AutofillManager) r2
            defpackage.hz.c(r2, r3, r4, r5)
        Ld:
            return
    }

    public void w() {
            r6 = this;
            java.lang.Object r6 = r6.B
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r6 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r6
            int r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r6.B()
            yl3 r0 = r6.C()
            tp6 r1 = r0.i
            java.lang.Object r1 = r1.getValue()
            fk3 r1 = (defpackage.fk3) r1
            if (r1 == 0) goto L26
            as0 r2 = defpackage.to7.a(r0)
            wl3 r3 = new wl3
            r4 = 0
            r5 = 0
            r3.<init>(r0, r1, r5, r4)
            r0 = 3
            defpackage.hv.L(r2, r5, r5, r3, r0)
        L26:
            r6.finish()
            return
    }

    public void x() {
            r1 = this;
            java.lang.Object r1 = r1.B
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r1
            int r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r1.D()
            return
    }

    public defpackage.yc1 y(defpackage.ap3 r42, defpackage.te r43) {
            r41 = this;
            r0 = r42
            r1 = r41
            java.lang.Object r1 = r1.B
            hz3 r1 = (defpackage.hz3) r1
            hz3 r2 = new hz3
            java.lang.Object r3 = r0.B
            java.util.List r3 = (java.util.List) r3
            int r4 = r3.size()
            r2.<init>(r4)
            int r4 = r3.size()
            r6 = 0
        L1a:
            if (r6 >= r4) goto Lac
            java.lang.Object r7 = r3.get(r6)
            xy4 r7 = (defpackage.xy4) r7
            long r8 = r7.a
            java.lang.Object r10 = r1.b(r8)
            wy4 r10 = (defpackage.wy4) r10
            if (r10 != 0) goto L39
            long r10 = r7.b
            long r12 = r7.d
            r25 = r10
            r27 = r12
            r29 = 0
            r10 = r43
            goto L4b
        L39:
            long r11 = r10.a
            boolean r13 = r10.c
            long r14 = r10.b
            r10 = r43
            long r14 = r10.D(r14)
            r25 = r11
            r29 = r13
            r27 = r14
        L4b:
            long r11 = r7.a
            vy4 r16 = new vy4
            long r13 = r7.b
            r15 = r6
            long r5 = r7.d
            r39 = r3
            boolean r3 = r7.e
            r23 = r3
            float r3 = r7.f
            r24 = r3
            int r3 = r7.g
            r30 = r3
            java.util.ArrayList r3 = r7.i
            r31 = r3
            r40 = r4
            long r3 = r7.j
            r32 = r3
            float r3 = r7.k
            r34 = r3
            long r3 = r7.l
            r35 = r3
            long r3 = r7.m
            r37 = r3
            r21 = r5
            r17 = r11
            r19 = r13
            r16.<init>(r17, r19, r21, r23, r24, r25, r27, r29, r30, r31, r32, r34, r35, r37)
            r5 = r16
            r3 = r17
            r2.f(r3, r5)
            boolean r3 = r7.e
            if (r3 == 0) goto La1
            wy4 r16 = new wy4
            long r4 = r7.b
            long r6 = r7.c
            r21 = r3
            r17 = r4
            r19 = r6
            r16.<init>(r17, r19, r21)
            r3 = r16
            r1.f(r8, r3)
            goto La4
        La1:
            r1.g(r8)
        La4:
            int r6 = r15 + 1
            r3 = r39
            r4 = r40
            goto L1a
        Lac:
            yc1 r1 = new yc1
            r1.<init>(r2, r0)
            return r1
    }
}
