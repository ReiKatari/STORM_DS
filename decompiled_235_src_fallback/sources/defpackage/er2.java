package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class er2 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ er2(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r35 = this;
            r0 = r35
            int r1 = r0.A
            r2 = 2
            r3 = 4
            r4 = 3
            java.lang.String r5 = "uriPermissionManager"
            java.lang.String r6 = "directoryAccessValidator"
            r7 = 1
            jg7 r8 = defpackage.jg7.a
            r9 = 0
            r10 = 0
            java.lang.Object r0 = r0.B
            switch(r1) {
                case 0: goto L581;
                case 1: goto L553;
                case 2: goto L53f;
                case 3: goto L530;
                case 4: goto L51a;
                case 5: goto L500;
                case 6: goto L4e7;
                case 7: goto L4dc;
                case 8: goto L4d5;
                case 9: goto L490;
                case 10: goto L46f;
                case 11: goto L467;
                case 12: goto L45c;
                case 13: goto L44e;
                case 14: goto L42f;
                case 15: goto L429;
                case 16: goto L41f;
                case 17: goto L414;
                case 18: goto L133;
                case 19: goto L11d;
                case 20: goto L110;
                case 21: goto Lc7;
                case 22: goto Lab;
                case 23: goto La1;
                case 24: goto L89;
                case 25: goto L82;
                case 26: goto L7c;
                case 27: goto L40;
                case 28: goto L28;
                default: goto L15;
            }
        L15:
            n46 r0 = (defpackage.n46) r0
            j56 r1 = r0.A
            java.lang.Object r2 = r0.R
            if (r2 == 0) goto L22
            java.lang.Object r10 = r1.e(r0, r2)
            goto L27
        L22:
            java.lang.String r0 = "Value should be initialized"
            defpackage.i.h(r0)
        L27:
            return r10
        L28:
            me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment r0 = (me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment) r0
            p15 r1 = new p15
            wh7 r2 = r0.d0
            if (r2 == 0) goto L3c
            yj1 r3 = r0.e0
            if (r3 == 0) goto L38
            r1.<init>(r0, r2, r3)
            return r1
        L38:
            defpackage.nb3.a0(r6)
            throw r10
        L3c:
            defpackage.nb3.a0(r5)
            throw r10
        L40:
            e31 r0 = (defpackage.e31) r0
            java.lang.ClassLoader r1 = r0.a
            java.lang.String r2 = "androidx.window.extensions.WindowExtensionsProvider"
            java.lang.Class r1 = r1.loadClass(r2)
            r1.getClass()
            java.lang.String r2 = "getWindowExtensions"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r10)
            java.lang.ClassLoader r0 = r0.a
            java.lang.String r2 = "androidx.window.extensions.WindowExtensions"
            java.lang.Class r0 = r0.loadClass(r2)
            r0.getClass()
            r1.getClass()
            java.lang.Class r2 = r1.getReturnType()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L76
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L76
            goto L77
        L76:
            r7 = r9
        L77:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L7c:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return r8
        L82:
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.lang.Object r0 = r0.call()
            return r0
        L89:
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment r0 = (me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment) r0
            p15 r1 = new p15
            wh7 r2 = r0.e0
            if (r2 == 0) goto L9d
            yj1 r3 = r0.f0
            if (r3 == 0) goto L99
            r1.<init>(r0, r2, r3)
            return r1
        L99:
            defpackage.nb3.a0(r6)
            throw r10
        L9d:
            defpackage.nb3.a0(r5)
            throw r10
        La1:
            me.magnum.melonds.ui.romlist.RomListActivity r0 = (me.magnum.melonds.ui.romlist.RomListActivity) r0
            int r1 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            v82 r1 = new v82
            r1.<init>(r0)
            return r1
        Lab:
            hw5 r0 = (defpackage.hw5) r0
            au5 r1 = defpackage.au5.a
            tp6 r1 = defpackage.up6.a(r1)
            as0 r2 = defpackage.to7.a(r0)
            bf4 r3 = new bf4
            r5 = 13
            r3.<init>(r0, r1, r10, r5)
            defpackage.hv.L(r2, r10, r10, r3, r4)
            de5 r0 = new de5
            r0.<init>(r1)
            return r0
        Lc7:
            ip3 r0 = (defpackage.ip3) r0
            wo3 r0 = r0.h()
            java.util.List r0 = r0.m
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Lda
            goto L100
        Lda:
            java.lang.Object r1 = r0.next()
            xo3 r1 = (defpackage.xo3) r1
            int r1 = r1.q
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        Le6:
            r10 = r1
        Le7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L100
            java.lang.Object r1 = r0.next()
            xo3 r1 = (defpackage.xo3) r1
            int r1 = r1.q
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r10.compareTo(r1)
            if (r2 >= 0) goto Le7
            goto Le6
        L100:
            if (r10 == 0) goto L106
            int r9 = r10.intValue()
        L106:
            int r9 = r9 + r7
            if (r9 >= r7) goto L10a
            goto L10b
        L10a:
            r7 = r9
        L10b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            return r0
        L110:
            no5 r0 = (defpackage.no5) r0
            r0.m()
            tp6 r0 = r0.d
            de5 r1 = new de5
            r1.<init>(r0)
            return r1
        L11d:
            sn5 r0 = (defpackage.sn5) r0
            as0 r1 = defpackage.to7.a(r0)
            qn5 r2 = new qn5
            r2.<init>(r0, r10, r9)
            defpackage.hv.L(r1, r10, r10, r2, r4)
            tp6 r0 = r0.c
            de5 r1 = new de5
            r1.<init>(r0)
            return r1
        L133:
            kl5 r0 = (defpackage.kl5) r0
            java.lang.ClassLoader r1 = r0.B
            db2 r2 = r0.L
            java.lang.String r0 = ""
            java.util.Enumeration r0 = r1.getResources(r0)
            r0.getClass()
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            r0.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r0.size()
            r6 = r9
        L153:
            if (r6 >= r5) goto L188
            java.lang.Object r8 = r0.get(r6)
            int r6 = r6 + 1
            java.net.URL r8 = (java.net.URL) r8
            r8.getClass()
            java.lang.String r11 = r8.getProtocol()
            java.lang.String r12 = "file"
            boolean r11 = defpackage.nb3.k(r11, r12)
            if (r11 != 0) goto L16e
            r11 = r10
            goto L182
        L16e:
            java.lang.String r11 = defpackage.lt4.B
            java.io.File r11 = new java.io.File
            java.net.URI r8 = r8.toURI()
            r11.<init>(r8)
            lt4 r8 = defpackage.w31.q(r11)
            vr4 r11 = new vr4
            r11.<init>(r2, r8)
        L182:
            if (r11 == 0) goto L153
            r4.add(r11)
            goto L153
        L188:
            java.lang.String r0 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r0 = r1.getResources(r0)
            r0.getClass()
            java.util.ArrayList r1 = java.util.Collections.list(r0)
            r1.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r1.size()
            r0 = r9
        L1a2:
            if (r0 >= r6) goto L40e
            java.lang.Object r8 = r1.get(r0)
            int r11 = r0 + 1
            java.net.URL r8 = (java.net.URL) r8
            r8.getClass()
            java.lang.String r0 = r8.toString()
            r0.getClass()
            java.lang.String r8 = "jar:file:"
            boolean r8 = defpackage.xs6.g0(r0, r8, r9)
            if (r8 != 0) goto L1c7
        L1be:
            r28 = r4
            r4 = r10
            r17 = r4
            r35 = r11
            goto L3af
        L1c7:
            java.lang.String r8 = "!"
            r12 = 6
            int r8 = defpackage.qs6.y0(r0, r8, r9, r12)
            r12 = -1
            if (r8 != r12) goto L1d2
            goto L1be
        L1d2:
            java.lang.String r12 = defpackage.lt4.B
            java.io.File r12 = new java.io.File
            java.lang.String r0 = r0.substring(r3, r8)
            java.net.URI r0 = java.net.URI.create(r0)
            r12.<init>(r0)
            lt4 r8 = defpackage.w31.q(r12)
            java.lang.String r0 = "not a zip: size="
            wf3 r12 = r2.F(r8)
            long r13 = r12.size()     // Catch: java.lang.Throwable -> L33f
            r15 = 22
            long r15 = r13 - r15
            r17 = r10
            r35 = r11
            r10 = 0
            int r18 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r18 < 0) goto L3ed
            r18 = 65558(0x10016, double:3.239E-319)
            long r13 = r13 - r18
            long r13 = java.lang.Math.max(r13, r10)     // Catch: java.lang.Throwable -> L33f
            r18 = r10
            r10 = r15
        L209:
            va2 r0 = r12.e(r10)     // Catch: java.lang.Throwable -> L33f
            fe5 r15 = new fe5     // Catch: java.lang.Throwable -> L33f
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L33f
            int r0 = r15.n()     // Catch: java.lang.Throwable -> L3c0
            r3 = 101010256(0x6054b50, float:2.506985E-35)
            if (r0 != r3) goto L3c8
            short r0 = r15.u()     // Catch: java.lang.Throwable -> L3c0
            r3 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            short r13 = r15.u()     // Catch: java.lang.Throwable -> L3c0
            r13 = r13 & r3
            short r14 = r15.u()     // Catch: java.lang.Throwable -> L3c0
            r14 = r14 & r3
            r26 = r10
            long r9 = (long) r14     // Catch: java.lang.Throwable -> L3c0
            short r11 = r15.u()     // Catch: java.lang.Throwable -> L3c0
            r11 = r11 & r3
            r14 = r3
            r28 = r4
            long r3 = (long) r11
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            java.lang.String r4 = "unsupported zip: spanned"
            if (r3 != 0) goto L3c2
            if (r0 != 0) goto L3c2
            if (r13 != 0) goto L3c2
            r11 = r8
            r7 = 4
            r15.skip(r7)     // Catch: java.lang.Throwable -> L3c0
            int r0 = r15.n()     // Catch: java.lang.Throwable -> L3c0
            long r7 = (long) r0     // Catch: java.lang.Throwable -> L3c0
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r23 = r7 & r20
            short r0 = r15.u()     // Catch: java.lang.Throwable -> L3c0
            r34 = r0 & r14
            h40 r20 = new h40     // Catch: java.lang.Throwable -> L3c0
            r21 = r9
            r25 = r34
            r20.<init>(r21, r23, r25)     // Catch: java.lang.Throwable -> L3c0
            r0 = r25
            long r7 = (long) r0     // Catch: java.lang.Throwable -> L3c0
            r15.v(r7)     // Catch: java.lang.Throwable -> L3c0
            r15.close()     // Catch: java.lang.Throwable -> L33f
            r7 = 20
            long r7 = r26 - r7
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 <= 0) goto L33b
            va2 r7 = r12.e(r7)     // Catch: java.lang.Throwable -> L33f
            fe5 r8 = new fe5     // Catch: java.lang.Throwable -> L33f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L33f
            int r7 = r8.n()     // Catch: java.lang.Throwable -> L31f
            r9 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r7 != r9) goto L328
            int r7 = r8.n()     // Catch: java.lang.Throwable -> L31f
            long r9 = r8.r()     // Catch: java.lang.Throwable -> L31f
            int r13 = r8.n()     // Catch: java.lang.Throwable -> L31f
            r3 = 1
            if (r13 != r3) goto L322
            if (r7 != 0) goto L322
            va2 r7 = r12.e(r9)     // Catch: java.lang.Throwable -> L31f
            fe5 r9 = new fe5     // Catch: java.lang.Throwable -> L31f
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L31f
            int r7 = r9.n()     // Catch: java.lang.Throwable -> L310
            r10 = 101075792(0x6064b50, float:2.525793E-35)
            if (r7 != r10) goto L2e9
            r13 = 12
            r9.skip(r13)     // Catch: java.lang.Throwable -> L310
            int r7 = r9.n()     // Catch: java.lang.Throwable -> L310
            int r10 = r9.n()     // Catch: java.lang.Throwable -> L310
            long r30 = r9.r()     // Catch: java.lang.Throwable -> L310
            long r13 = r9.r()     // Catch: java.lang.Throwable -> L310
            int r13 = (r30 > r13 ? 1 : (r30 == r13 ? 0 : -1))
            if (r13 != 0) goto L2e1
            if (r7 != 0) goto L2e1
            if (r10 != 0) goto L2e1
            r13 = 8
            r9.skip(r13)     // Catch: java.lang.Throwable -> L310
            long r32 = r9.r()     // Catch: java.lang.Throwable -> L310
            h40 r29 = new h40     // Catch: java.lang.Throwable -> L310
            r34 = r0
            r29.<init>(r30, r32, r34)     // Catch: java.lang.Throwable -> L310
            r9.close()     // Catch: java.lang.Throwable -> L2dd
            r0 = r17
            goto L2de
        L2dd:
            r0 = move-exception
        L2de:
            r20 = r29
            goto L31b
        L2e1:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L310
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L310
            throw r0     // Catch: java.lang.Throwable -> L310
        L2e7:
            r4 = r0
            goto L312
        L2e9:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L310
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L310
            r4.<init>()     // Catch: java.lang.Throwable -> L310
            java.lang.String r13 = "bad zip: expected "
            r4.append(r13)     // Catch: java.lang.Throwable -> L310
            java.lang.String r10 = defpackage.vs7.b(r10)     // Catch: java.lang.Throwable -> L310
            r4.append(r10)     // Catch: java.lang.Throwable -> L310
            java.lang.String r10 = " but was "
            r4.append(r10)     // Catch: java.lang.Throwable -> L310
            java.lang.String r7 = defpackage.vs7.b(r7)     // Catch: java.lang.Throwable -> L310
            r4.append(r7)     // Catch: java.lang.Throwable -> L310
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L310
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L310
            throw r0     // Catch: java.lang.Throwable -> L310
        L310:
            r0 = move-exception
            goto L2e7
        L312:
            r9.close()     // Catch: java.lang.Throwable -> L316
            goto L31a
        L316:
            r0 = move-exception
            defpackage.mb3.q(r4, r0)     // Catch: java.lang.Throwable -> L31f
        L31a:
            r0 = r4
        L31b:
            if (r0 != 0) goto L31e
            goto L328
        L31e:
            throw r0     // Catch: java.lang.Throwable -> L31f
        L31f:
            r0 = move-exception
            r4 = r0
            goto L330
        L322:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L31f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L31f
            throw r0     // Catch: java.lang.Throwable -> L31f
        L328:
            r8.close()     // Catch: java.lang.Throwable -> L32e
            r0 = r17
            goto L339
        L32e:
            r0 = move-exception
            goto L339
        L330:
            r8.close()     // Catch: java.lang.Throwable -> L334
            goto L338
        L334:
            r0 = move-exception
            defpackage.mb3.q(r4, r0)     // Catch: java.lang.Throwable -> L33f
        L338:
            r0 = r4
        L339:
            if (r0 != 0) goto L33e
        L33b:
            r0 = r20
            goto L343
        L33e:
            throw r0     // Catch: java.lang.Throwable -> L33f
        L33f:
            r0 = move-exception
            r1 = r0
            goto L403
        L343:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33f
            r4.<init>()     // Catch: java.lang.Throwable -> L33f
            long r7 = r0.c     // Catch: java.lang.Throwable -> L33f
            va2 r7 = r12.e(r7)     // Catch: java.lang.Throwable -> L33f
            fe5 r8 = new fe5     // Catch: java.lang.Throwable -> L33f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L33f
            long r9 = r0.b     // Catch: java.lang.Throwable -> L385
        L355:
            int r7 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r7 >= 0) goto L388
            jy7 r7 = defpackage.vs7.c(r8)     // Catch: java.lang.Throwable -> L385
            long r13 = r7.h     // Catch: java.lang.Throwable -> L385
            r15 = r4
            long r3 = r0.c     // Catch: java.lang.Throwable -> L374
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L37d
            lt4 r3 = defpackage.kl5.X     // Catch: java.lang.Throwable -> L374
            lt4 r3 = r7.a     // Catch: java.lang.Throwable -> L374
            boolean r3 = defpackage.jd1.c(r3)     // Catch: java.lang.Throwable -> L374
            if (r3 == 0) goto L377
            r15.add(r7)     // Catch: java.lang.Throwable -> L374
            goto L377
        L374:
            r0 = move-exception
        L375:
            r3 = r0
            goto L391
        L377:
            r3 = 1
            long r18 = r18 + r3
            r4 = r15
            goto L355
        L37d:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L374
            java.lang.String r3 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L374
            throw r0     // Catch: java.lang.Throwable -> L374
        L385:
            r0 = move-exception
            r15 = r4
            goto L375
        L388:
            r15 = r4
            r8.close()     // Catch: java.lang.Throwable -> L38f
            r0 = r17
            goto L39a
        L38f:
            r0 = move-exception
            goto L39a
        L391:
            r8.close()     // Catch: java.lang.Throwable -> L395
            goto L399
        L395:
            r0 = move-exception
            defpackage.mb3.q(r3, r0)     // Catch: java.lang.Throwable -> L33f
        L399:
            r0 = r3
        L39a:
            if (r0 != 0) goto L3bf
            java.util.LinkedHashMap r0 = defpackage.vs7.a(r15)     // Catch: java.lang.Throwable -> L33f
            ky7 r3 = new ky7     // Catch: java.lang.Throwable -> L33f
            r3.<init>(r11, r2, r0)     // Catch: java.lang.Throwable -> L33f
            r12.close()     // Catch: java.lang.Throwable -> L3a8
        L3a8:
            lt4 r0 = defpackage.kl5.X
            vr4 r4 = new vr4
            r4.<init>(r3, r0)
        L3af:
            if (r4 == 0) goto L3b4
            r5.add(r4)
        L3b4:
            r0 = r35
            r10 = r17
            r4 = r28
            r3 = 4
            r7 = 1
            r9 = 0
            goto L1a2
        L3bf:
            throw r0     // Catch: java.lang.Throwable -> L33f
        L3c0:
            r0 = move-exception
            goto L3e9
        L3c2:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L3c0
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L3c0
            throw r0     // Catch: java.lang.Throwable -> L3c0
        L3c8:
            r28 = r4
            r26 = r10
            r11 = r8
            r15.close()     // Catch: java.lang.Throwable -> L33f
            r3 = -1
            long r3 = r26 + r3
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 < 0) goto L3e1
            r8 = r11
            r7 = 1
            r9 = 0
            r10 = r3
            r4 = r28
            r3 = 4
            goto L209
        L3e1:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L33f
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L33f
            throw r0     // Catch: java.lang.Throwable -> L33f
        L3e9:
            r15.close()     // Catch: java.lang.Throwable -> L33f
            throw r0     // Catch: java.lang.Throwable -> L33f
        L3ed:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L33f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L33f
            long r3 = r12.size()     // Catch: java.lang.Throwable -> L33f
            r2.append(r3)     // Catch: java.lang.Throwable -> L33f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L33f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L33f
            throw r1     // Catch: java.lang.Throwable -> L33f
        L403:
            if (r12 == 0) goto L40d
            r12.close()     // Catch: java.lang.Throwable -> L409
            goto L40d
        L409:
            r0 = move-exception
            defpackage.mb3.q(r1, r0)
        L40d:
            throw r1
        L40e:
            r1 = r4
            java.util.ArrayList r0 = defpackage.gt0.V0(r1, r5)
            return r0
        L414:
            af5 r0 = (defpackage.af5) r0
            je5 r0 = r0.h
            r0.getClass()
            r0.cancel()
            return r8
        L41f:
            dh5 r0 = (defpackage.dh5) r0
            java.lang.Object r0 = r0.A
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.yy7.b(r0)
            return r8
        L429:
            xs7 r0 = (defpackage.xs7) r0
            defpackage.yy7.b(r0)
            return r8
        L42f:
            fz4 r0 = (defpackage.fz4) r0
            dz4 r1 = defpackage.dz4.e
            r2 = 0
            wb6[] r2 = new defpackage.wb6[r2]
            bg2 r3 = new bg2
            r4 = 19
            r3.<init>(r0, r4)
            java.lang.String r4 = "kotlinx.serialization.Polymorphic"
            yb6 r1 = defpackage.mp2.l(r4, r1, r2, r3)
            ar0 r0 = r0.a
            r0.getClass()
            h41 r2 = new h41
            r2.<init>(r1, r0)
            return r2
        L44e:
            mw4 r0 = (defpackage.mw4) r0
            sg0 r0 = r0.A
            oc0 r1 = new oc0
            r1.<init>()
            gr1 r0 = r0.a
            java.lang.String r0 = r0.B
            return r1
        L45c:
            ht4 r0 = (defpackage.ht4) r0
            f36 r1 = r0.A
            java.lang.String r0 = r0.B
            e36 r0 = r1.f(r0)
            return r0
        L467:
            il4 r0 = (defpackage.il4) r0
            gl4 r1 = new gl4
            r1.<init>(r0)
            return r1
        L46f:
            r17 = r10
            wf4 r0 = (defpackage.wf4) r0
            java.util.List r1 = defpackage.wf4.d0
            androidx.fragment.app.p r0 = r0.getActivity()
            boolean r1 = r0 instanceof me.magnum.melonds.ui.romlist.RomListActivity
            if (r1 == 0) goto L481
            r10 = r0
            me.magnum.melonds.ui.romlist.RomListActivity r10 = (me.magnum.melonds.ui.romlist.RomListActivity) r10
            goto L483
        L481:
            r10 = r17
        L483:
            if (r10 == 0) goto L48f
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.settings.SettingsActivity> r1 = me.magnum.melonds.ui.settings.SettingsActivity.class
            r0.<init>(r10, r1)
            r10.startActivity(r0)
        L48f:
            return r8
        L490:
            r17 = r10
            sb4 r0 = (defpackage.sb4) r0
            uk1 r0 = r0.d0
            boolean r1 = r0.b
            if (r1 == 0) goto L4ce
            java.lang.Object r1 = r0.k
            ku3 r1 = (defpackage.ku3) r1
            tt3 r1 = r1.d
            tt3 r2 = defpackage.tt3.DESTROYED
            if (r1 == r2) goto L4c6
            java.lang.Object r1 = r0.c
            sb4 r1 = (defpackage.sb4) r1
            java.io.Serializable r0 = r0.n
            ex6 r0 = (defpackage.ex6) r0
            java.lang.Object r0 = r0.getValue()
            yo7 r0 = (defpackage.yo7) r0
            r2 = 4
            os0 r0 = defpackage.xo7.a(r1, r0, r2)
            java.lang.Class<tb4> r1 = defpackage.tb4.class
            ar0 r1 = defpackage.gh5.a(r1)
            qo7 r0 = r0.Z(r1)
            tb4 r0 = (defpackage.tb4) r0
            v46 r10 = r0.b
            goto L4d4
        L4c6:
            java.lang.String r0 = "You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed."
            defpackage.i.m(r0)
        L4cb:
            r10 = r17
            goto L4d4
        L4ce:
            java.lang.String r0 = "You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."
            defpackage.i.m(r0)
            goto L4cb
        L4d4:
            return r10
        L4d5:
            com.smp.masterswitchpreference.MasterSwitchPreferenceFragment r0 = (com.smp.masterswitchpreference.MasterSwitchPreferenceFragment) r0
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = com.smp.masterswitchpreference.MasterSwitchPreferenceFragment.h(r0)
            return r0
        L4dc:
            kt3 r0 = (defpackage.kt3) r0
            android.view.inputmethod.BaseInputConnection r1 = new android.view.inputmethod.BaseInputConnection
            android.view.View r0 = r0.a
            r2 = 0
            r1.<init>(r0, r2)
            return r1
        L4e7:
            zb3 r0 = (defpackage.zb3) r0
            m16 r0 = r0.a
            boolean r1 = r0.k()
            if (r1 == 0) goto L4fa
            boolean r0 = r0.n()
            if (r0 == 0) goto L4f8
            goto L4fa
        L4f8:
            r7 = 0
            goto L4fb
        L4fa:
            r7 = 1
        L4fb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L500:
            wa3 r0 = (defpackage.wa3) r0
            fk3 r1 = new fk3
            android.content.Context r0 = r0.a
            r2 = 2131952786(0x7f130492, float:1.9542025E38)
            java.lang.String r3 = r0.getString(r2)
            dk3 r4 = defpackage.dk3.DEFAULT
            ck3 r5 = defpackage.ck3.FOLLOW_SYSTEM
            r7 = 0
            zt1 r8 = defpackage.zt1.A
            r2 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L51a:
            u63 r0 = (defpackage.u63) r0
            java.lang.Object r0 = r0.B
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            r0.getClass()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            return r0
        L530:
            w61 r0 = (defpackage.w61) r0
            l61 r0 = r0.A()
            float r0 = defpackage.kj2.y(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L53f:
            r1 = r0
            qz2 r1 = (defpackage.qz2) r1
            r1.getClass()
            yz2 r0 = r1.s0     // Catch: java.io.IOException -> L54c
            r3 = 0
            r0.u(r2, r3, r3)     // Catch: java.io.IOException -> L54c
            goto L552
        L54c:
            r0 = move-exception
            a62 r2 = defpackage.a62.PROTOCOL_ERROR
            r1.e(r2, r2, r0)
        L552:
            return r8
        L553:
            r3 = r9
            r17 = r10
            qu2 r0 = (defpackage.qu2) r0
            da2 r0 = r0.a()
            int[] r1 = defpackage.pu2.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L57b
            if (r0 == r2) goto L571
            if (r0 == r4) goto L57c
            r1 = 4
            if (r0 == r1) goto L579
            r2 = 5
            if (r0 != r2) goto L573
        L571:
            r2 = r1
            goto L57c
        L573:
            defpackage.i.d()
            r10 = r17
            goto L580
        L579:
            r2 = r4
            goto L57c
        L57b:
            r2 = r3
        L57c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
        L580:
            return r10
        L581:
            r17 = r10
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment r0 = (me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment) r0
            p15 r1 = new p15
            wh7 r2 = r0.d0
            if (r2 == 0) goto L597
            yj1 r3 = r0.e0
            if (r3 == 0) goto L593
            r1.<init>(r0, r2, r3)
            return r1
        L593:
            defpackage.nb3.a0(r6)
            throw r17
        L597:
            defpackage.nb3.a0(r5)
            throw r17
    }
}
