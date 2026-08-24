package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s35  reason: default package */
/* loaded from: classes.dex */
public class s35 implements defpackage.t35, defpackage.bi4, defpackage.ax1, defpackage.w62, defpackage.f36, defpackage.ru6, defpackage.so2, defpackage.f3, defpackage.ot {
    public java.lang.Object A;

    public s35(int r2) {
            r1 = this;
            switch(r2) {
                case 7: goto L2c;
                case 8: goto L21;
                case 26: goto Lf;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.A = r2
            return
        Lf:
            r1.<init>()
            kt5 r2 = new kt5
            r0 = 10
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.A = r0
            return
        L21:
            r1.<init>()
            android.graphics.Region r2 = new android.graphics.Region
            r2.<init>()
            r1.A = r2
            return
        L2c:
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            vs4 r2 = defpackage.np2.Y(r2)
            r1.A = r2
            return
    }

    public s35(android.content.Context r3, int r4) {
            r2 = this;
            java.lang.String r0 = "__androidx_security_crypto_encrypted_file_pref__"
            r1 = 0
            switch(r4) {
                case 13: goto L14;
                default: goto L6;
            }
        L6:
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.A = r3
            return
        L14:
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r2.A = r3
            return
    }

    public s35(android.view.View r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L13
            bn6 r0 = new bn6
            r0.<init>(r3)
            r0.B = r3
            r2.A = r0
            return
        L13:
            s35 r0 = new s35
            r0.<init>(r3)
            r2.A = r0
            return
    }

    public /* synthetic */ s35(java.lang.Object r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public s35(defpackage.qh1 r3) {
            r2 = this;
            r2.<init>()
            gv r0 = new gv
            float r1 = defpackage.eo6.a
            r0.<init>()
            r0.a = r1
            float r3 = r3.a()
            float r1 = defpackage.ud2.a
            r1 = 1136724797(0x43c10b3d, float:386.0878)
            float r3 = r3 * r1
            r1 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r1
            r1 = 1062668861(0x3f570a3d, float:0.84)
            float r3 = r3 * r1
            r0.b = r3
            r2.A = r0
            return
    }

    public static /* synthetic */ void s(defpackage.s35 r1, defpackage.t90 r2, int r3) {
            q45 r0 = defpackage.q45.DEFAULT
            r1.r(r2, r3, r0)
            return
    }

    public byte[] A() {
            r2 = this;
            java.lang.String r0 = "__androidx_security_crypto_encrypted_file_keyset__"
            java.lang.Object r2 = r2.A     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            java.lang.String r2 = r2.getString(r0, r1)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L12
            byte[] r2 = defpackage.np2.G(r2)     // Catch: java.lang.Throwable -> L1a
            return r2
        L12:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = "can't read keyset; the pref value __androidx_security_crypto_encrypted_file_keyset__ does not exist"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            java.io.CharConversionException r2 = new java.io.CharConversionException
            java.lang.String r0 = "can't read keyset; the pref value __androidx_security_crypto_encrypted_file_keyset__ is not a valid hex string"
            r2.<init>(r0)
            throw r2
    }

    public void B() {
            r1 = this;
            java.lang.Object r1 = r1.A
            xw r1 = (defpackage.xw) r1
            xc6 r0 = defpackage.xc6.CREATED
            java.lang.Object r1 = r1.b(r0)
            xc6 r0 = defpackage.xc6.CREATING
            if (r1 == r0) goto Lf
            return
        Lf:
            r1 = 0
            throw r1
    }

    public java.lang.Object C(defpackage.ul0 r21, defpackage.on2 r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.A
            gx0 r2 = (defpackage.gx0) r2
            if (r2 == 0) goto Lb
            goto L10
        Lb:
            java.lang.String r2 = "Called runAndWatch on a manager that has been disposed of"
            defpackage.r05.b(r2)
        L10:
            java.lang.Object r2 = r0.A
            gx0 r2 = (defpackage.gx0) r2
            boolean r3 = r2 instanceof defpackage.si6
            if (r3 == 0) goto La1
            si6 r2 = (defpackage.si6) r2
            ob6 r3 = r2.f
            if (r3 == 0) goto La1
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto La1
            f94 r3 = new f94
            r3.<init>()
            ob6 r4 = r2.f
            if (r4 == 0) goto L2e
            goto L33
        L2e:
            java.lang.String r5 = "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"
            defpackage.r05.b(r5)
        L33:
            ka4 r5 = r2.d
            java.util.ArrayList r6 = r3.c
            if (r5 != 0) goto L47
            java.lang.Object r5 = r2.b
            r5.getClass()
            c94 r7 = new c94
            r7.<init>(r4, r5)
            r6.add(r7)
            goto L99
        L47:
            java.lang.Object[] r7 = r5.b
            long[] r5 = r5.a
            int r8 = r5.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L99
            r10 = 0
        L51:
            r11 = r5[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L94
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L6b:
            if (r15 >= r13) goto L91
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L88
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]
            r16 = r14
            c94 r14 = new c94
            r14.<init>(r4, r9)
            r6.add(r14)
            goto L8a
        L88:
            r16 = r14
        L8a:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L6b
        L91:
            r9 = r14
            if (r13 != r9) goto L99
        L94:
            if (r10 == r8) goto L99
            int r10 = r10 + 1
            goto L51
        L99:
            r3.d()
            r2.e()
            r0.A = r3
        La1:
            java.lang.Object r0 = r0.A
            gx0 r0 = (defpackage.gx0) r0
            r0.getClass()
            qn2 r2 = r0.j(r1)
            vl6 r3 = defpackage.bm6.j()
            vl6 r2 = r3.u(r2)
            r0.c(r1)
            vl6 r1 = r2.j()     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r3 = r22.c()     // Catch: java.lang.Throwable -> Lcb
            defpackage.vl6.q(r1)     // Catch: java.lang.Throwable -> Lc9
            r2.c()
            r0.d()
            return r3
        Lc9:
            r0 = move-exception
            goto Ld0
        Lcb:
            r0 = move-exception
            defpackage.vl6.q(r1)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Ld0:
            r2.c()
            throw r0
    }

    public void D(defpackage.m93 r4) {
            r3 = this;
            java.lang.Object r3 = r3.A
            android.graphics.Region r3 = (android.graphics.Region) r3
            int r0 = r4.a
            int r1 = r4.b
            int r2 = r4.c
            int r4 = r4.d
            r3.set(r0, r1, r2, r4)
            return
    }

    public void E() {
            r2 = this;
            java.lang.Object r2 = r2.A
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L7
            goto L3f
        L7:
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L1d
            boolean r0 = r2.onCheckIsTextEditor()
            if (r0 == 0) goto L14
            goto L1d
        L14:
            android.view.View r0 = r2.getRootView()
            android.view.View r0 = r0.findFocus()
            goto L21
        L1d:
            r2.requestFocus()
            r0 = r2
        L21:
            if (r0 != 0) goto L2e
            android.view.View r2 = r2.getRootView()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r2.findViewById(r0)
        L2e:
            if (r0 == 0) goto L3f
            boolean r2 = r0.hasWindowFocus()
            if (r2 == 0) goto L3f
            ym6 r2 = new ym6
            r1 = 0
            r2.<init>(r0, r1)
            r0.post(r2)
        L3f:
            return
    }

    public void F(byte[] r5) {
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.A
            t90 r0 = (defpackage.t90) r0
            int r1 = r5.length
            s(r4, r0, r1)
            int r4 = r5.length
            if (r4 != 0) goto Lf
            return
        Lf:
            r0.b(r4)
            byte[] r1 = r0.a
            int r2 = r0.b
            r3 = 0
            defpackage.fv.q0(r2, r3, r4, r5, r1)
            int r5 = r0.b
            int r5 = r5 + r4
            r0.b = r5
            return
    }

    public void G(int r3, int r4, defpackage.q45 r5) {
            r2 = this;
            java.lang.Object r0 = r2.A
            t90 r0 = (defpackage.t90) r0
            r5.getClass()
            q45 r1 = defpackage.q45.FIXED
            if (r5 != r1) goto Le
            x45 r1 = defpackage.x45.i32
            goto L10
        Le:
            x45 r1 = defpackage.x45.VARINT
        L10:
            int r4 = r1.wireIntWithTag(r4)
            s(r2, r0, r4)
            r2.r(r0, r3, r5)
            return
    }

    public void H(defpackage.t90 r5) {
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.A
            t90 r0 = (defpackage.t90) r0
            int r1 = r5.b
            s(r4, r0, r1)
            int r4 = r5.b
            r0.b(r4)
            byte[] r5 = r5.a
            byte[] r1 = r0.a
            int r2 = r0.b
            r3 = 0
            defpackage.fv.q0(r2, r3, r4, r5, r1)
            int r5 = r0.b
            int r5 = r5 + r4
            r0.b = r5
            return
    }

    @Override // defpackage.w62
    public defpackage.ke5 a() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r5.A
            ue5 r2 = (defpackage.ue5) r2
            je5 r2 = r2.k
            boolean r2 = r2.m0
            if (r2 != 0) goto L5d
            java.lang.Object r2 = r5.A     // Catch: java.io.IOException -> L30
            ue5 r2 = (defpackage.ue5) r2     // Catch: java.io.IOException -> L30
            h26 r2 = r2.b()     // Catch: java.io.IOException -> L30
            boolean r3 = r2.c()     // Catch: java.io.IOException -> L30
            if (r3 != 0) goto L45
            g26 r3 = r2.d()     // Catch: java.io.IOException -> L30
            h26 r4 = r3.b     // Catch: java.io.IOException -> L30
            if (r4 != 0) goto L28
            java.lang.Throwable r4 = r3.c     // Catch: java.io.IOException -> L30
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 == 0) goto L32
            g26 r3 = r2.g()     // Catch: java.io.IOException -> L30
            goto L32
        L30:
            r2 = move-exception
            goto L4a
        L32:
            h26 r4 = r3.b     // Catch: java.io.IOException -> L30
            java.lang.Throwable r3 = r3.c     // Catch: java.io.IOException -> L30
            if (r3 != 0) goto L44
            if (r4 == 0) goto L45
            java.lang.Object r2 = r5.A     // Catch: java.io.IOException -> L30
            ue5 r2 = (defpackage.ue5) r2     // Catch: java.io.IOException -> L30
            pu r2 = r2.p     // Catch: java.io.IOException -> L30
            r2.addFirst(r4)     // Catch: java.io.IOException -> L30
            goto L2
        L44:
            throw r3     // Catch: java.io.IOException -> L30
        L45:
            ke5 r5 = r2.b()     // Catch: java.io.IOException -> L30
            return r5
        L4a:
            if (r1 != 0) goto L4e
            r1 = r2
            goto L51
        L4e:
            defpackage.mb3.q(r1, r2)
        L51:
            java.lang.Object r2 = r5.A
            ue5 r2 = (defpackage.ue5) r2
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto L5c
            goto L2
        L5c:
            throw r1
        L5d:
            java.lang.String r5 = "Canceled"
            defpackage.e41.i(r5)
            return r0
    }

    @Override // defpackage.w62
    public defpackage.ue5 b() {
            r0 = this;
            java.lang.Object r0 = r0.A
            ue5 r0 = (defpackage.ue5) r0
            return r0
    }

    @Override // defpackage.f3
    public boolean c(android.view.View r4) {
            r3 = this;
            java.lang.Object r3 = r3.A
            com.google.android.material.behavior.SwipeDismissBehavior r3 = (com.google.android.material.behavior.SwipeDismissBehavior) r3
            boolean r0 = r3.v(r4)
            r1 = 0
            if (r0 == 0) goto L31
            int r0 = r4.getLayoutDirection()
            r2 = 1
            if (r0 != r2) goto L13
            r1 = r2
        L13:
            int r3 = r3.d
            if (r3 != 0) goto L19
            if (r1 != 0) goto L1d
        L19:
            if (r3 != r2) goto L23
            if (r1 != 0) goto L23
        L1d:
            int r3 = r4.getWidth()
            int r3 = -r3
            goto L27
        L23:
            int r3 = r4.getWidth()
        L27:
            java.util.WeakHashMap r0 = defpackage.ao7.a
            r4.offsetLeftAndRight(r3)
            r3 = 0
            r4.setAlpha(r3)
            return r2
        L31:
            return r1
    }

    @Override // defpackage.ax1
    public void d() {
            r0 = this;
            return
    }

    @Override // defpackage.ax1
    public void e(defpackage.pq5 r3) {
            r2 = this;
            r3.getClass()
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            java.lang.Object r2 = r2.A
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r2 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r2
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.emulator.EmulatorActivity> r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.class
            r0.<init>(r2, r1)
            wz5 r1 = new wz5
            r1.<init>()
            r1.A = r3
            java.lang.String r3 = "rom"
            r0.putExtra(r3, r1)
            r2.startActivity(r0)
            r3 = 17432576(0x10a0000, float:2.5346597E-38)
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r2.overridePendingTransition(r3, r0)
            return
    }

    @Override // defpackage.f36
    public defpackage.e36 f(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            java.lang.Object r3 = r3.A
            pu6 r3 = (defpackage.pu6) r3
            java.lang.String r0 = r3.getDatabaseName()
            java.lang.String r1 = "' was requested."
            if (r0 != 0) goto L23
            java.lang.String r0 = ":memory:"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L18
            goto L61
        L18:
            java.lang.String r3 = "This driver is configured to open an in-memory database but a file-based named '"
            java.lang.String r3 = defpackage.lb1.A(r3, r4, r1)
            defpackage.i.f(r3)
            r3 = 0
            return r3
        L23:
            boolean r2 = r0.equals(r4)
            if (r2 != 0) goto L61
            r2 = 47
            java.lang.String r0 = defpackage.qs6.O0(r2, r0, r0)
            java.lang.String r2 = defpackage.qs6.O0(r2, r4, r4)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3a
            goto L61
        L3a:
            java.lang.String r3 = r3.getDatabaseName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "This driver is configured to open a database named '"
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r3 = "' but '"
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L61:
            mu6 r4 = new mu6
            vm2 r3 = r3.I()
            r4.<init>(r3)
            return r4
    }

    @Override // defpackage.ru6
    public java.lang.String g() {
            r0 = this;
            java.lang.Object r0 = r0.A
            uu6 r0 = (defpackage.uu6) r0
            java.lang.String r0 = r0.B
            return r0
    }

    @Override // defpackage.t35
    public void h() {
            r1 = this;
            java.lang.String r1 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r0 = "ProfileInstaller"
            android.util.Log.d(r0, r1)
            return
    }

    @Override // defpackage.so2
    public void i(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    @Override // defpackage.t35
    public void j(int r4, java.lang.Object r5) {
            r3 = this;
            switch(r4) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L3;
                case 10: goto L9;
                case 11: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = ""
            goto L23
        L6:
            java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L23
        L9:
            java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L23
        Lc:
            java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
            goto L23
        Lf:
            java.lang.String r0 = "RESULT_IO_EXCEPTION"
            goto L23
        L12:
            java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L23
        L15:
            java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L23
        L18:
            java.lang.String r0 = "RESULT_NOT_WRITABLE"
            goto L23
        L1b:
            java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L23
        L1e:
            java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
            goto L23
        L21:
            java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
        L23:
            r1 = 6
            java.lang.String r2 = "ProfileInstaller"
            if (r4 == r1) goto L33
            r1 = 7
            if (r4 == r1) goto L33
            r1 = 8
            if (r4 == r1) goto L33
            android.util.Log.d(r2, r0)
            goto L38
        L33:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r2, r0, r5)
        L38:
            java.lang.Object r3 = r3.A
            androidx.profileinstaller.ProfileInstallReceiver r3 = (androidx.profileinstaller.ProfileInstallReceiver) r3
            r3.setResultCode(r4)
            return
    }

    @Override // defpackage.ax1
    public void k(me.magnum.melonds.domain.model.ConsoleType r1) {
            r0 = this;
            return
    }

    @Override // defpackage.ru6
    public void l(defpackage.qu6 r7) {
            r6 = this;
            java.lang.Object r6 = r6.A
            uu6 r6 = (defpackage.uu6) r6
            int[] r0 = r6.R
            int r0 = r0.length
            r1 = 1
            r2 = r1
        L9:
            if (r2 >= r0) goto L4a
            int[] r3 = r6.R
            r3 = r3[r2]
            if (r3 == r1) goto L40
            r4 = 2
            if (r3 == r4) goto L38
            r4 = 3
            if (r3 == r4) goto L2d
            r4 = 4
            if (r3 == r4) goto L22
            r4 = 5
            if (r3 == r4) goto L1e
            goto L47
        L1e:
            r7.f(r2)
            goto L47
        L22:
            byte[][] r3 = r6.d0
            r3 = r3[r2]
            r3.getClass()
            r7.d(r3, r2)
            goto L47
        L2d:
            java.lang.String[] r3 = r6.Z
            r3 = r3[r2]
            r3.getClass()
            r7.m(r2, r3)
            goto L47
        L38:
            double[] r3 = r6.Y
            r4 = r3[r2]
            r7.p(r2, r4)
            goto L47
        L40:
            long[] r3 = r6.X
            r4 = r3[r2]
            r7.c(r2, r4)
        L47:
            int r2 = r2 + 1
            goto L9
        L4a:
            return
    }

    @Override // defpackage.f36
    public boolean m() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.ot
    public java.lang.Object n(defpackage.p76 r8, java.lang.Float r9, java.lang.Float r10, defpackage.qn2 r11, defpackage.pl6 r12) {
            r7 = this;
            float r2 = r9.floatValue()
            float r9 = r10.floatValue()
            r10 = 0
            r0 = 28
            uo r3 = defpackage.ak7.f(r10, r9, r0)
            float r10 = java.lang.Math.abs(r2)
            float r9 = java.lang.Math.signum(r9)
            float r1 = r9 * r10
            java.lang.Object r7 = r7.A
            r4 = r7
            io6 r4 = (defpackage.io6) r4
            r0 = r8
            r5 = r11
            r6 = r12
            java.lang.Object r7 = defpackage.kn2.j(r0, r1, r2, r3, r4, r5, r6)
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            if (r7 != r8) goto L2a
            return r7
        L2a:
            qo r7 = (defpackage.qo) r7
            return r7
    }

    public java.lang.Object o(defpackage.s41 r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yc6
            if (r0 == 0) goto L13
            r0 = r5
            yc6 r0 = (defpackage.yc6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            yc6 r0 = new yc6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r0.Y
            r1 = 0
            if (r0 == 0) goto L3f
            r2 = 1
            if (r0 != r2) goto L39
            defpackage.oi2.Y(r5)
            java.lang.Object r4 = r4.A
            xw r4 = (defpackage.xw) r4
            xc6 r5 = defpackage.xc6.PENDING
            xc6 r0 = defpackage.xc6.CREATING
            boolean r4 = r4.a(r5, r0)
            if (r4 == 0) goto L38
            jg7 r4 = defpackage.jg7.a
            return r4
        L38:
            throw r1
        L39:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            return r1
        L3f:
            defpackage.oi2.Y(r5)
            throw r1
    }

    @Override // defpackage.bi4
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r1 = "ObserverToConsumerAdapter"
            java.lang.String r0 = "Unexpected error in Observable"
            defpackage.kj2.w(r1, r0, r2)
            return
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            java.lang.Object r0 = r0.A
            kv6 r0 = (defpackage.kv6) r0
            r0.run()
            return
    }

    public java.lang.Object p(long r5, boolean r7, java.lang.String r8, java.lang.Long r9, defpackage.s41 r10) {
            r4 = this;
            boolean r0 = r10 instanceof defpackage.m85
            if (r0 == 0) goto L14
            r0 = r10
            m85 r0 = (defpackage.m85) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            m85 r0 = new m85
            r0.<init>(r4, r10)
            goto L12
        L1a:
            java.lang.Object r0 = r10.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r10.Y
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            defpackage.oi2.Y(r0)
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r4 = r0.A
            return r4
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L34:
            defpackage.oi2.Y(r0)
            java.lang.Object r4 = r4.A
            l85 r4 = (defpackage.l85) r4
            r10.Y = r3
            java.lang.Object r4 = r4.d(r5, r7, r8, r9, r10)
            if (r4 != r1) goto L44
            return r1
        L44:
            return r4
    }

    public defpackage.le5 q() {
            r2 = this;
            java.lang.Object r2 = r2.A
            bk1 r2 = (defpackage.bk1) r2
            java.lang.Object r0 = r2.R
            lk1 r0 = (defpackage.lk1) r0
            monitor-enter(r0)
            r1 = 1
            r2.e(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r2.L     // Catch: java.lang.Throwable -> L22
            ek1 r2 = (defpackage.ek1) r2     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L22
            gk1 r2 = r0.k(r2)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            if (r2 == 0) goto L20
            le5 r0 = new le5
            r0.<init>(r2)
            return r0
        L20:
            r2 = 0
            return r2
        L22:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public void r(defpackage.t90 r2, int r3, defpackage.q45 r4) {
            r1 = this;
            int[] r0 = defpackage.i55.a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            if (r4 == r0) goto L50
            r1 = 2
            if (r4 == r1) goto L3b
            r1 = 3
            if (r4 != r1) goto L37
            int r1 = r3 << 1
            int r3 = r3 >> 31
            r1 = r1 ^ r3
            r3 = 5
            r2.b(r3)
            r3 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r3 != 0) goto L2a
            byte[] r3 = r2.a
            int r4 = r2.b
            int r0 = r4 + 1
            r2.b = r0
            byte r1 = (byte) r1
            r3[r4] = r1
            return
        L2a:
            long r3 = (long) r1
            int[] r1 = defpackage.t90.c
            int r0 = java.lang.Long.numberOfLeadingZeros(r3)
            r1 = r1[r0]
            r2.a(r1, r3)
            return
        L37:
            defpackage.i.d()
            return
        L3b:
            long r3 = (long) r3
            r2.getClass()
            int[] r1 = defpackage.t90.c
            int r0 = java.lang.Long.numberOfLeadingZeros(r3)
            r1 = r1[r0]
            int r0 = r1 + 1
            r2.b(r0)
            r2.a(r1, r3)
            return
        L50:
            java.lang.Object r1 = r1.A
            t90 r1 = (defpackage.t90) r1
            int r2 = java.lang.Integer.reverseBytes(r3)
            r1.c(r2)
            return
    }

    public void t(defpackage.t90 r3, long r4, defpackage.q45 r6) {
            r2 = this;
            int[] r0 = defpackage.i55.a
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 1
            if (r6 == r0) goto L3d
            r2 = 2
            if (r6 == r2) goto L2c
            r2 = 3
            if (r6 != r2) goto L28
            long r0 = r4 << r0
            r2 = 63
            long r4 = r4 >> r2
            long r4 = r4 ^ r0
            int[] r2 = defpackage.t90.c
            int r6 = java.lang.Long.numberOfLeadingZeros(r4)
            r2 = r2[r6]
            int r6 = r2 + 1
            r3.b(r6)
            r3.a(r2, r4)
            return
        L28:
            defpackage.i.d()
            return
        L2c:
            int[] r2 = defpackage.t90.c
            int r6 = java.lang.Long.numberOfLeadingZeros(r4)
            r2 = r2[r6]
            int r6 = r2 + 1
            r3.b(r6)
            r3.a(r2, r4)
            return
        L3d:
            java.lang.Object r2 = r2.A
            t90 r2 = (defpackage.t90) r2
            long r3 = java.lang.Long.reverseBytes(r4)
            r2.d(r3)
            return
    }

    @Override // defpackage.bi4
    public void u(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.A
            b31 r0 = (defpackage.b31) r0
            r0.accept(r1)
            return
    }

    public java.lang.Object v(java.lang.String r5, defpackage.s41 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.n85
            if (r0 == 0) goto L13
            r0 = r6
            n85 r0 = (defpackage.n85) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            n85 r0 = new n85
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            defpackage.oi2.Y(r6)
            hm5 r6 = (defpackage.hm5) r6
            java.lang.Object r4 = r6.A
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L32:
            defpackage.oi2.Y(r6)
            java.lang.Object r4 = r4.A
            l85 r4 = (defpackage.l85) r4
            r0.Y = r3
            java.lang.Object r4 = r4.m(r5, r0)
            if (r4 != r1) goto L42
            return r1
        L42:
            return r4
    }

    public java.lang.Integer[] w() {
            r3 = this;
            java.lang.String r0 = "Failed to get output formats from StreamConfigurationMap"
            java.lang.String r1 = "StreamConfigurationMapCompatBaseImpl"
            r2 = 0
            java.lang.Object r3 = r3.A     // Catch: java.lang.IllegalArgumentException -> L10 java.lang.NullPointerException -> L12
            android.hardware.camera2.params.StreamConfigurationMap r3 = (android.hardware.camera2.params.StreamConfigurationMap) r3     // Catch: java.lang.IllegalArgumentException -> L10 java.lang.NullPointerException -> L12
            if (r3 == 0) goto L17
            int[] r3 = r3.getOutputFormats()     // Catch: java.lang.IllegalArgumentException -> L10 java.lang.NullPointerException -> L12
            goto L1d
        L10:
            r3 = move-exception
            goto L14
        L12:
            r3 = move-exception
            goto L19
        L14:
            defpackage.kj2.g0(r1, r0, r3)
        L17:
            r3 = r2
            goto L1d
        L19:
            defpackage.kj2.g0(r1, r0, r3)
            goto L17
        L1d:
            if (r3 == 0) goto L23
            java.lang.Integer[] r2 = defpackage.fv.W0(r3)
        L23:
            return r2
    }

    public long x(int r1, android.util.Size r2) {
            r0 = this;
            r2.getClass()
            java.lang.Object r0 = r0.A
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0
            if (r0 == 0) goto Le
            long r0 = r0.getOutputMinFrameDuration(r1, r2)
            return r0
        Le:
            r0 = 0
            return r0
    }

    public android.util.Size[] y(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.A
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0
            if (r0 == 0) goto Lb
            android.util.Size[] r0 = r0.getOutputSizes(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public void z() {
            r2 = this;
            java.lang.Object r2 = r2.A
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L1a
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.os.IBinder r2 = r2.getWindowToken()
            r1 = 0
            r0.hideSoftInputFromWindow(r2, r1)
        L1a:
            return
    }
}
