package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ci2 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ ci2(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    public /* synthetic */ ci2(defpackage.qz2 r2, defpackage.dh5 r3) {
            r1 = this;
            r0 = 5
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    public /* synthetic */ ci2(defpackage.vb4 r1, defpackage.sb4 r2, boolean r3) {
            r0 = this;
            r3 = 12
            r0.A = r3
            r0.<init>()
            r0.B = r1
            r0.L = r2
            return
    }

    private final java.lang.Object a() {
            r4 = this;
            java.lang.Object r0 = r4.B
            bi2 r0 = (defpackage.bi2) r0
            java.lang.Object r4 = r4.L
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            java.lang.Object r1 = defpackage.rf6.b
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = defpackage.rf6.c     // Catch: java.lang.Throwable -> L2f
            r2.remove(r0)     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            ga0 r0 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = defpackage.zv7.a     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "NetworkRequestConstraintController unregister shared callback"
            r0.b(r2, r3)     // Catch: java.lang.Throwable -> L2f
            rf6 r0 = defpackage.rf6.a     // Catch: java.lang.Throwable -> L2f
            r4.unregisterNetworkCallback(r0)     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            defpackage.rf6.f = r4     // Catch: java.lang.Throwable -> L2f
            defpackage.rf6.d = r4     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            defpackage.rf6.e = r4     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r4 = move-exception
            goto L35
        L31:
            monitor-exit(r1)
            jg7 r4 = defpackage.jg7.a
            return r4
        L35:
            monitor-exit(r1)
            throw r4
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r15 = this;
            int r0 = r15.A
            r1 = 2
            r2 = -1
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r0) {
                case 0: goto L4d9;
                case 1: goto L4c4;
                case 2: goto L4b0;
                case 3: goto L480;
                case 4: goto L3a8;
                case 5: goto L394;
                case 6: goto L2c2;
                case 7: goto L2b2;
                case 8: goto L262;
                case 9: goto L23f;
                case 10: goto L21c;
                case 11: goto L20c;
                case 12: goto L1c9;
                case 13: goto L1bb;
                case 14: goto L1a2;
                case 15: goto L18a;
                case 16: goto L17d;
                case 17: goto L15d;
                case 18: goto L14f;
                case 19: goto L103;
                case 20: goto Lea;
                case 21: goto Ld6;
                case 22: goto Lc8;
                case 23: goto L7e;
                case 24: goto L70;
                case 25: goto L5c;
                case 26: goto L46;
                case 27: goto L41;
                case 28: goto L17;
                default: goto La;
            }
        La:
            java.lang.Object r0 = r15.B
            r76 r0 = (defpackage.r76) r0
            java.lang.Object r15 = r15.L
            androidx.work.impl.WorkDatabase r15 = (androidx.work.impl.WorkDatabase) r15
            java.lang.Object r15 = r0.g(r15)
            return r15
        L17:
            java.lang.Object r0 = r15.B
            el6 r0 = (defpackage.el6) r0
            java.lang.Object r15 = r15.L
            k92 r15 = (defpackage.k92) r15
            java.lang.Object r1 = r15.a
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 != 0) goto L3e
            java.util.ArrayList r1 = r15.b
            ro5 r2 = new ro5
            r3 = 13
            r2.<init>(r0, r3)
            defpackage.gt0.W0(r1, r2)
            cf5 r15 = r15.c
            if (r15 == 0) goto L3e
            ey0 r0 = r15.a
            if (r0 == 0) goto L3e
            r0.s(r15, r5)
        L3e:
            jg7 r15 = defpackage.jg7.a
            return r15
        L41:
            java.lang.Object r15 = r15.a()
            return r15
        L46:
            java.lang.Object r0 = r15.B
            qn2 r0 = (defpackage.qn2) r0
            java.lang.Object r15 = r15.L
            rs4 r15 = (defpackage.rs4) r15
            float r15 = r15.h()
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            r0.g(r15)
            jg7 r15 = defpackage.jg7.a
            return r15
        L5c:
            java.lang.Object r0 = r15.B
            qn2 r0 = (defpackage.qn2) r0
            java.lang.Object r15 = r15.L
            c46 r15 = (defpackage.c46) r15
            int r15 = r15.a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r0.g(r15)
            jg7 r15 = defpackage.jg7.a
            return r15
        L70:
            java.lang.Object r0 = r15.B
            qn2 r0 = (defpackage.qn2) r0
            java.lang.Object r15 = r15.L
            vv5 r15 = (defpackage.vv5) r15
            r0.g(r15)
            jg7 r15 = defpackage.jg7.a
            return r15
        L7e:
            java.lang.Object r0 = r15.B
            ss5 r0 = (defpackage.ss5) r0
            java.lang.Object r15 = r15.L
            pp6 r15 = (defpackage.pp6) r15
            java.util.Map r0 = r0.k
            java.lang.Object r15 = r15.getValue()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L99
            goto Lc7
        L99:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc7
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Character r3 = (java.lang.Character) r3
            r3.getClass()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 > r15) goto La1
            if (r1 <= r2) goto La1
            r2 = r1
            r5 = r3
            goto La1
        Lc7:
            return r5
        Lc8:
            java.lang.Object r0 = r15.B
            qn2 r0 = (defpackage.qn2) r0
            java.lang.Object r15 = r15.L
            lr5 r15 = (defpackage.lr5) r15
            r0.g(r15)
            jg7 r15 = defpackage.jg7.a
            return r15
        Ld6:
            java.lang.Object r0 = r15.B
            qn2 r0 = (defpackage.qn2) r0
            java.lang.Object r15 = r15.L
            qw5 r15 = (defpackage.qw5) r15
            qw5 r1 = defpackage.qw5.FAVORITES
            if (r15 != r1) goto Le4
            qw5 r1 = defpackage.qw5.ALL
        Le4:
            r0.g(r1)
            jg7 r15 = defpackage.jg7.a
            return r15
        Lea:
            java.lang.Object r0 = r15.B
            xh5 r0 = (defpackage.xh5) r0
            java.lang.Object r15 = r15.L
            java.lang.String r15 = (java.lang.String) r15
            r0.getClass()
            java.util.regex.Pattern r0 = r0.A
            java.util.regex.Matcher r0 = r0.matcher(r15)
            r0.getClass()
            n14 r15 = defpackage.kn2.k(r0, r4, r15)
            return r15
        L103:
            java.lang.Object r0 = r15.B
            ka4 r0 = (defpackage.ka4) r0
            java.lang.Object r15 = r15.L
            ey0 r15 = (defpackage.ey0) r15
            java.lang.Object[] r2 = r0.b
            long[] r0 = r0.a
            int r3 = r0.length
            int r3 = r3 - r1
            if (r3 < 0) goto L14c
            r1 = r4
        L114:
            r5 = r0[r1]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L147
            int r7 = r1 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r4
        L12e:
            if (r9 >= r7) goto L145
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L141
            int r10 = r1 << 3
            int r10 = r10 + r9
            r10 = r2[r10]
            r15.z(r10)
        L141:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L12e
        L145:
            if (r7 != r8) goto L14c
        L147:
            if (r1 == r3) goto L14c
            int r1 = r1 + 1
            goto L114
        L14c:
            jg7 r15 = defpackage.jg7.a
            return r15
        L14f:
            java.lang.Object r0 = r15.B
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r0 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r0
            java.lang.Object r15 = r15.L
            android.net.Uri r15 = (android.net.Uri) r15
            r0.f(r15)
            jg7 r15 = defpackage.jg7.a
            return r15
        L15d:
            java.lang.Object r0 = r15.B
            androidx.preference.SwitchPreference r0 = (androidx.preference.SwitchPreference) r0
            java.lang.Object r15 = r15.L
            zw r15 = (defpackage.zw) r15
            x05 r1 = r0.getOnPreferenceChangeListener()
            boolean r2 = r1 instanceof defpackage.wx0
            if (r2 == 0) goto L175
            wx0 r1 = (defpackage.wx0) r1
            java.util.ArrayList r0 = r1.a
            r0.remove(r15)
            goto L17a
        L175:
            if (r1 != r15) goto L17a
            r0.setOnPreferenceChangeListener(r5)
        L17a:
            jg7 r15 = defpackage.jg7.a
            return r15
        L17d:
            java.lang.Object r0 = r15.B
            ax0 r0 = (defpackage.ax0) r0
            java.lang.Object r15 = r15.L
            eo2 r15 = (defpackage.eo2) r15
            r0.d = r15
            jg7 r15 = defpackage.jg7.a
            return r15
        L18a:
            java.lang.Object r0 = r15.B
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r15 = r15.L
            wh4 r15 = (defpackage.wh4) r15
            bt6 r1 = defpackage.bt6.h
            wb6[] r2 = new defpackage.wb6[r4]
            bg2 r3 = new bg2
            r4 = 15
            r3.<init>(r15, r4)
            yb6 r15 = defpackage.mp2.l(r0, r1, r2, r3)
            return r15
        L1a2:
            java.lang.Object r0 = r15.B
            m44 r0 = (defpackage.m44) r0
            java.lang.Object r15 = r15.L
            df5 r15 = (defpackage.df5) r15
            java.lang.Object r0 = r0.B
            vw r0 = (defpackage.vw) r0
            int r0 = r0.get()
            if (r0 == 0) goto L1b5
            goto L1b8
        L1b5:
            r15.c()
        L1b8:
            jg7 r15 = defpackage.jg7.a
            return r15
        L1bb:
            java.lang.Object r0 = r15.B
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            java.lang.Object r15 = r15.L
            c53 r15 = (defpackage.c53) r15
            r0.unregisterNetworkCallback(r15)
            jg7 r15 = defpackage.jg7.a
            return r15
        L1c9:
            java.lang.Object r0 = r15.B
            vb4 r0 = (defpackage.vb4) r0
            java.lang.Object r15 = r15.L
            sb4 r15 = (defpackage.sb4) r15
            r15.getClass()
            q61 r1 = r0.a
            monitor-enter(r1)
            tp6 r0 = r0.b     // Catch: java.lang.Throwable -> L200
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L200
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L200
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L200
            r3.<init>()     // Catch: java.lang.Throwable -> L200
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L200
        L1e8:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L200
            if (r4 == 0) goto L203
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L200
            r6 = r4
            sb4 r6 = (defpackage.sb4) r6     // Catch: java.lang.Throwable -> L200
            boolean r6 = defpackage.nb3.k(r6, r15)     // Catch: java.lang.Throwable -> L200
            if (r6 == 0) goto L1fc
            goto L203
        L1fc:
            r3.add(r4)     // Catch: java.lang.Throwable -> L200
            goto L1e8
        L200:
            r0 = move-exception
            r15 = r0
            goto L20a
        L203:
            r0.m(r5, r3)     // Catch: java.lang.Throwable -> L200
            monitor-exit(r1)
            jg7 r15 = defpackage.jg7.a
            return r15
        L20a:
            monitor-exit(r1)
            throw r15
        L20c:
            java.lang.Object r0 = r15.B
            q46 r0 = (defpackage.q46) r0
            java.lang.Object r15 = r15.L
            o46 r15 = (defpackage.o46) r15
            rr3 r1 = new rr3
            zt1 r2 = defpackage.zt1.A
            r1.<init>(r0, r2, r15)
            return r1
        L21c:
            java.lang.Object r0 = r15.B
            ii1 r0 = (defpackage.ii1) r0
            java.lang.Object r15 = r15.L
            ue1 r15 = (defpackage.ue1) r15
            java.lang.Object r0 = r0.getValue()
            zq4 r0 = (defpackage.zq4) r0
            ei r1 = new ei
            er4 r2 = r15.d
            hq3 r2 = r2.f
            java.lang.Object r2 = r2.getValue()
            l93 r2 = (defpackage.l93) r2
            r1.<init>(r2, r0)
            ar4 r2 = new ar4
            r2.<init>(r15, r0, r1)
            return r2
        L23f:
            java.lang.Object r0 = r15.B
            ii1 r0 = (defpackage.ii1) r0
            java.lang.Object r15 = r15.L
            ip3 r15 = (defpackage.ip3) r15
            java.lang.Object r0 = r0.getValue()
            oo3 r0 = (defpackage.oo3) r0
            ei r1 = new ei
            zo3 r2 = r15.d
            hq3 r2 = r2.f
            java.lang.Object r2 = r2.getValue()
            l93 r2 = (defpackage.l93) r2
            r1.<init>(r2, r0)
            po3 r2 = new po3
            r2.<init>(r15, r0, r1)
            return r2
        L262:
            java.lang.Object r0 = r15.B
            me.magnum.melonds.ui.layouteditor.b r0 = (me.magnum.melonds.ui.layouteditor.b) r0
            java.lang.Object r15 = r15.L
            lj3 r15 = (defpackage.lj3) r15
            jl3 r2 = r0.d0
            if (r2 == 0) goto L2af
            sn3 r0 = r0.A
            java.util.UUID r15 = r15.a
            s63 r2 = (defpackage.s63) r2
            r0.getClass()
            java.lang.Object r2 = r2.B
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r2 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r2
            int r4 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r2.D()
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.backgrounds.BackgroundsActivity> r6 = me.magnum.melonds.ui.backgrounds.BackgroundsActivity.class
            r4.<init>(r2, r6)
            java.lang.String r6 = "initial_background_id"
            if (r15 == 0) goto L290
            java.lang.String r15 = r15.toString()
            goto L291
        L290:
            r15 = r5
        L291:
            r4.putExtra(r6, r15)
            int[] r15 = defpackage.tk3.a
            int r0 = r0.ordinal()
            r15 = r15[r0]
            if (r15 == r3) goto L2aa
            if (r15 != r1) goto L2a6
            i9 r15 = r2.L0
            r15.a(r4)
            goto L2af
        L2a6:
            defpackage.i.d()
            goto L2b1
        L2aa:
            i9 r15 = r2.K0
            r15.a(r4)
        L2af:
            jg7 r5 = defpackage.jg7.a
        L2b1:
            return r5
        L2b2:
            java.lang.Object r0 = r15.B
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r15 = r15.L
            qn2 r15 = (defpackage.qn2) r15
            if (r0 == 0) goto L2bf
            r15.g(r0)
        L2bf:
            jg7 r15 = defpackage.jg7.a
            return r15
        L2c2:
            java.lang.Object r0 = r15.B
            wb6 r0 = (defpackage.wb6) r0
            java.lang.Object r15 = r15.L
            id3 r15 = (defpackage.id3) r15
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            td3 r6 = r15.a
            defpackage.te3.d(r15, r0)
            int r15 = r0.f()
            r6 = r4
        L2d9:
            if (r6 >= r15) goto L38b
            java.util.List r7 = r0.i(r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L2e8:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L2fa
            java.lang.Object r9 = r7.next()
            boolean r10 = r9 instanceof defpackage.se3
            if (r10 == 0) goto L2e8
            r8.add(r9)
            goto L2e8
        L2fa:
            int r7 = r8.size()
            if (r7 != r3) goto L305
            java.lang.Object r7 = r8.get(r4)
            goto L306
        L305:
            r7 = r5
        L306:
            se3 r7 = (defpackage.se3) r7
            if (r7 == 0) goto L387
            java.lang.String[] r7 = r7.names()
            if (r7 == 0) goto L387
            int r8 = r7.length
            r9 = r4
        L312:
            if (r9 >= r8) goto L387
            r10 = r7[r9]
            np2 r11 = r0.e()
            bc6 r12 = defpackage.bc6.e
            boolean r11 = defpackage.nb3.k(r11, r12)
            if (r11 == 0) goto L325
            java.lang.String r11 = "enum value"
            goto L327
        L325:
            java.lang.String r11 = "property"
        L327:
            boolean r12 = r1.containsKey(r10)
            if (r12 != 0) goto L337
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r1.put(r10, r11)
            int r9 = r9 + 1
            goto L312
        L337:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r3 = "The suggested name '"
            r15.<init>(r3)
            r15.append(r10)
            java.lang.String r3 = "' for "
            r15.append(r3)
            r15.append(r11)
            r3 = 32
            r15.append(r3)
            java.lang.String r4 = r0.g(r6)
            r15.append(r4)
            java.lang.String r4 = " is already one of the names for "
            r15.append(r4)
            r15.append(r11)
            r15.append(r3)
            java.lang.Object r1 = defpackage.c14.j0(r1, r10)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r1 = r0.g(r1)
            r15.append(r1)
            java.lang.String r1 = " in "
            r15.append(r1)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            ae3 r0 = new ae3
            java.lang.String r15 = defpackage.hi2.x(r15, r5, r2, r5, r5)
            r0.<init>(r15)
            throw r0
        L387:
            int r6 = r6 + 1
            goto L2d9
        L38b:
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L393
            zt1 r1 = defpackage.zt1.A
        L393:
            return r1
        L394:
            java.lang.Object r0 = r15.L
            qz2 r0 = (defpackage.qz2) r0
            java.lang.Object r15 = r15.B
            dh5 r15 = (defpackage.dh5) r15
            oz2 r1 = r0.A
            java.lang.Object r15 = r15.A
            fd6 r15 = (defpackage.fd6) r15
            r1.a(r0, r15)
            jg7 r15 = defpackage.jg7.a
            return r15
        L3a8:
            java.lang.Object r0 = r15.B
            i5 r0 = (defpackage.i5) r0
            java.lang.Object r15 = r15.L
            fd6 r15 = (defpackage.fd6) r15
            dh5 r1 = new dh5
            r1.<init>()
            java.lang.Object r0 = r0.L
            r2 = r0
            qz2 r2 = (defpackage.qz2) r2
            yz2 r6 = r2.s0
            monitor-enter(r6)
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L455
            fd6 r0 = r2.n0     // Catch: java.lang.Throwable -> L41e
            fd6 r7 = new fd6     // Catch: java.lang.Throwable -> L41e
            r7.<init>()     // Catch: java.lang.Throwable -> L41e
            r0.getClass()     // Catch: java.lang.Throwable -> L41e
            r8 = r4
        L3c9:
            r9 = 10
            if (r8 >= r9) goto L3de
            int r9 = r3 << r8
            int r10 = r0.a     // Catch: java.lang.Throwable -> L41e
            r9 = r9 & r10
            if (r9 == 0) goto L3db
            int[] r9 = r0.b     // Catch: java.lang.Throwable -> L41e
            r9 = r9[r8]     // Catch: java.lang.Throwable -> L41e
            r7.b(r8, r9)     // Catch: java.lang.Throwable -> L41e
        L3db:
            int r8 = r8 + 1
            goto L3c9
        L3de:
            r8 = r4
        L3df:
            if (r8 >= r9) goto L3f2
            int r10 = r3 << r8
            int r11 = r15.a     // Catch: java.lang.Throwable -> L41e
            r10 = r10 & r11
            if (r10 == 0) goto L3ef
            int[] r10 = r15.b     // Catch: java.lang.Throwable -> L41e
            r10 = r10[r8]     // Catch: java.lang.Throwable -> L41e
            r7.b(r8, r10)     // Catch: java.lang.Throwable -> L41e
        L3ef:
            int r8 = r8 + 1
            goto L3df
        L3f2:
            r1.A = r7     // Catch: java.lang.Throwable -> L41e
            int r15 = r7.a()     // Catch: java.lang.Throwable -> L41e
            long r7 = (long) r15     // Catch: java.lang.Throwable -> L41e
            int r15 = r0.a()     // Catch: java.lang.Throwable -> L41e
            long r9 = (long) r15     // Catch: java.lang.Throwable -> L41e
            long r7 = r7 - r9
            r9 = 0
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 == 0) goto L421
            java.util.LinkedHashMap r0 = r2.B     // Catch: java.lang.Throwable -> L41e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L41e
            if (r0 == 0) goto L40e
            goto L421
        L40e:
            java.util.LinkedHashMap r0 = r2.B     // Catch: java.lang.Throwable -> L41e
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L41e
            xz2[] r3 = new defpackage.xz2[r4]     // Catch: java.lang.Throwable -> L41e
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: java.lang.Throwable -> L41e
            r5 = r0
            xz2[] r5 = (defpackage.xz2[]) r5     // Catch: java.lang.Throwable -> L41e
            goto L421
        L41e:
            r0 = move-exception
            r15 = r0
            goto L47c
        L421:
            java.lang.Object r0 = r1.A     // Catch: java.lang.Throwable -> L41e
            fd6 r0 = (defpackage.fd6) r0     // Catch: java.lang.Throwable -> L41e
            r0.getClass()     // Catch: java.lang.Throwable -> L41e
            r2.n0 = r0     // Catch: java.lang.Throwable -> L41e
            pz6 r9 = r2.f0     // Catch: java.lang.Throwable -> L41e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41e
            r0.<init>()     // Catch: java.lang.Throwable -> L41e
            java.lang.String r3 = r2.L     // Catch: java.lang.Throwable -> L41e
            r0.append(r3)     // Catch: java.lang.Throwable -> L41e
            java.lang.String r3 = " onSettings"
            r0.append(r3)     // Catch: java.lang.Throwable -> L41e
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L41e
            ci2 r13 = new ci2     // Catch: java.lang.Throwable -> L41e
            r13.<init>(r2, r1)     // Catch: java.lang.Throwable -> L41e
            r14 = 6
            r11 = 0
            defpackage.pz6.b(r9, r10, r11, r13, r14)     // Catch: java.lang.Throwable -> L41e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L455
            yz2 r0 = r2.s0     // Catch: java.lang.Throwable -> L455 java.io.IOException -> L458
            java.lang.Object r1 = r1.A     // Catch: java.lang.Throwable -> L455 java.io.IOException -> L458
            fd6 r1 = (defpackage.fd6) r1     // Catch: java.lang.Throwable -> L455 java.io.IOException -> L458
            r0.e(r1)     // Catch: java.lang.Throwable -> L455 java.io.IOException -> L458
            goto L45e
        L455:
            r0 = move-exception
            r15 = r0
            goto L47e
        L458:
            r0 = move-exception
            a62 r1 = defpackage.a62.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L455
            r2.e(r1, r1, r0)     // Catch: java.lang.Throwable -> L455
        L45e:
            monitor-exit(r6)
            if (r5 == 0) goto L479
            int r0 = r5.length
        L462:
            if (r4 >= r0) goto L479
            r1 = r5[r4]
            monitor-enter(r1)
            long r2 = r1.X     // Catch: java.lang.Throwable -> L475
            long r2 = r2 + r7
            r1.X = r2     // Catch: java.lang.Throwable -> L475
            if (r15 <= 0) goto L471
            r1.notifyAll()     // Catch: java.lang.Throwable -> L475
        L471:
            monitor-exit(r1)
            int r4 = r4 + 1
            goto L462
        L475:
            r0 = move-exception
            r15 = r0
            monitor-exit(r1)
            throw r15
        L479:
            jg7 r15 = defpackage.jg7.a
            return r15
        L47c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L455
            throw r15     // Catch: java.lang.Throwable -> L455
        L47e:
            monitor-exit(r6)
            throw r15
        L480:
            java.lang.Object r0 = r15.B
            r1 = r0
            qz2 r1 = (defpackage.qz2) r1
            java.lang.Object r15 = r15.L
            xz2 r15 = (defpackage.xz2) r15
            oz2 r0 = r1.A     // Catch: java.io.IOException -> L48f
            r0.b(r15)     // Catch: java.io.IOException -> L48f
            goto L4ad
        L48f:
            r0 = move-exception
            kx4 r2 = defpackage.kx4.a
            kx4 r2 = defpackage.kx4.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Http2Connection.Listener failure for "
            r3.<init>(r4)
            java.lang.String r1 = r1.L
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 4
            r2.i(r1, r3, r0)
            a62 r1 = defpackage.a62.PROTOCOL_ERROR     // Catch: java.io.IOException -> L4ad
            r15.c(r1, r0)     // Catch: java.io.IOException -> L4ad
        L4ad:
            jg7 r15 = defpackage.jg7.a
            return r15
        L4b0:
            java.lang.Object r0 = r15.B
            hs2 r0 = (defpackage.hs2) r0
            java.lang.Object r15 = r15.L
            gs2 r15 = (defpackage.gs2) r15
            android.content.Context r0 = r0.a
            android.content.ContentResolver r0 = r0.getContentResolver()
            r0.unregisterContentObserver(r15)
            jg7 r15 = defpackage.jg7.a
            return r15
        L4c4:
            java.lang.Object r0 = r15.B
            o60 r0 = (defpackage.o60) r0
            java.lang.Object r15 = r15.L
            hq2 r15 = (defpackage.hq2) r15
            r0.dismiss()
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r15 = r15.l
            if (r15 == 0) goto L4d6
            r15.setEditRegionsMode(r3)
        L4d6:
            jg7 r15 = defpackage.jg7.a
            return r15
        L4d9:
            java.lang.Object r0 = r15.B
            dh5 r0 = (defpackage.dh5) r0
            java.lang.Object r15 = r15.L
            di2 r15 = (defpackage.di2) r15
            py0 r1 = defpackage.zw4.a
            java.lang.Object r15 = defpackage.hf.K(r15, r1)
            r0.A = r15
            jg7 r15 = defpackage.jg7.a
            return r15
    }
}
