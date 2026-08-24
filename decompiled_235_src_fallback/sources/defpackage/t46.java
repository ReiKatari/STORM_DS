package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t46 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ t46(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r20 = this;
            r0 = r20
            int r1 = r0.A
            r2 = 1
            r4 = 0
            java.lang.Object r0 = r0.B
            switch(r1) {
                case 0: goto L2e1;
                case 1: goto L2da;
                case 2: goto L2c8;
                case 3: goto L2a7;
                case 4: goto L28d;
                case 5: goto L28c;
                case 6: goto L280;
                case 7: goto L272;
                case 8: goto L268;
                case 9: goto L234;
                case 10: goto L1a4;
                case 11: goto L188;
                case 12: goto L178;
                case 13: goto L139;
                case 14: goto L12b;
                case 15: goto L11f;
                case 16: goto L10f;
                case 17: goto L106;
                case 18: goto Lf5;
                case 19: goto Le0;
                case 20: goto Lb6;
                case 21: goto L9a;
                case 22: goto L95;
                case 23: goto L8b;
                case 24: goto L2d;
                case 25: goto L26;
                default: goto Lb;
            }
        Lb:
            ty7 r0 = (defpackage.ty7) r0
            lg0 r0 = r0.a
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            r1.getClass()
            qc0 r0 = (defpackage.qc0) r0
            java.lang.Object r0 = r0.c(r1)
            if (r0 == 0) goto L20
            r4 = r0
            android.hardware.camera2.params.StreamConfigurationMap r4 = (android.hardware.camera2.params.StreamConfigurationMap) r4
            goto L25
        L20:
            java.lang.String r0 = "Required value was null."
            defpackage.i.m(r0)
        L25:
            return r4
        L26:
            androidx.work.Worker r0 = (androidx.work.Worker) r0
            lx3 r0 = r0.e()
            return r0
        L2d:
            aw7 r0 = (defpackage.aw7) r0
            java.lang.String r1 = defpackage.y42.a
            lw7 r1 = r0.a
            androidx.work.impl.WorkDatabase r5 = r1.c
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r7 = r0.e
            r6.addAll(r7)
            java.util.HashSet r7 = defpackage.aw7.b(r0)
            java.util.Iterator r8 = r6.iterator()
        L47:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L5a
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r7.contains(r9)
            if (r9 == 0) goto L47
            goto L60
        L5a:
            java.util.ArrayList r2 = r0.e
            r6.removeAll(r2)
            r2 = 0
        L60:
            if (r2 != 0) goto L83
            az0 r2 = r1.b
            r5.b()
            defpackage.vy7.S(r5, r2, r0)     // Catch: java.lang.Throwable -> L7e
            boolean r0 = defpackage.y42.a(r0)     // Catch: java.lang.Throwable -> L7e
            r5.p()     // Catch: java.lang.Throwable -> L7e
            r5.f()
            if (r0 == 0) goto L7b
            java.util.List r0 = r1.e
            defpackage.h66.b(r2, r5, r0)
        L7b:
            jg7 r4 = defpackage.jg7.a
            goto L8a
        L7e:
            r0 = move-exception
            r5.f()
            throw r0
        L83:
            java.lang.String r1 = "WorkContinuation has cycles ("
            java.lang.String r2 = ")"
            defpackage.e41.o(r0, r2, r1)
        L8a:
            return r4
        L8b:
            me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity r0 = (me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity) r0
            int r1 = me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity.B0
            r0.finish()
            jg7 r0 = defpackage.jg7.a
            return r0
        L95:
            androidx.preference.ListPreference r0 = (androidx.preference.ListPreference) r0
            java.lang.String r0 = r0.e0
            return r0
        L9a:
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment) r0
            p15 r1 = new p15
            wh7 r2 = r0.d0
            if (r2 == 0) goto Lb0
            yj1 r3 = r0.e0
            if (r3 == 0) goto Laa
            r1.<init>(r0, r2, r3)
            return r1
        Laa:
            java.lang.String r0 = "directoryAccessValidator"
            defpackage.nb3.a0(r0)
            throw r4
        Lb0:
            java.lang.String r0 = "uriPermissionManager"
            defpackage.nb3.a0(r0)
            throw r4
        Lb6:
            cm7 r0 = (defpackage.cm7) r0
            int r1 = r0.A
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            r2 = 32
            java.math.BigInteger r1 = r1.shiftLeft(r2)
            int r3 = r0.B
            long r3 = (long) r3
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r1 = r1.or(r3)
            java.math.BigInteger r1 = r1.shiftLeft(r2)
            int r0 = r0.L
            long r2 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r0 = r1.or(r0)
            return r0
        Le0:
            j97 r0 = (defpackage.j97) r0
            java.lang.Object r0 = r0.B
            jh0 r0 = (defpackage.jh0) r0
            y65 r0 = r0.a()
            java.lang.Class<androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk> r1 = androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.class
            boolean r0 = r0.a(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lf5:
            z77 r0 = (defpackage.z77) r0
            qn2 r1 = r0.K0
            boolean r0 = r0.J0
            r0 = r0 ^ r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.g(r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L106:
            j57 r0 = (defpackage.j57) r0
            java.lang.Object r0 = r0.c()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            return r0
        L10f:
            r47 r0 = (defpackage.r47) r0
            r0.w0 = r4
            defpackage.bl2.G(r0)
            defpackage.xk2.w(r0)
            defpackage.f04.I(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L11f:
            m93 r0 = (defpackage.m93) r0
            long r0 = r0.b()
            i93 r2 = new i93
            r2.<init>(r0)
            return r2
        L12b:
            a17 r0 = (defpackage.a17) r0
            boolean r1 = r0.j0
            if (r1 == 0) goto L136
            l07 r0 = defpackage.hi2.w(r0)
            goto L138
        L136:
            l07 r0 = defpackage.l07.b
        L138:
            return r0
        L139:
            android.app.RemoteAction r0 = (android.app.RemoteAction) r0
            android.app.PendingIntent r1 = defpackage.q66.c(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r0 < r2) goto L172
            android.app.ActivityOptions r0 = android.app.ActivityOptions.makeBasic()     // Catch: android.app.PendingIntent.CanceledException -> L155
            android.app.ActivityOptions r0 = defpackage.rv2.d(r0)     // Catch: android.app.PendingIntent.CanceledException -> L155
            android.os.Bundle r0 = r0.toBundle()     // Catch: android.app.PendingIntent.CanceledException -> L155
            defpackage.rv2.l(r1, r0)     // Catch: android.app.PendingIntent.CanceledException -> L155
            goto L175
        L155:
            r0 = move-exception
            java.lang.String r2 = "TextClassification"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "error sending pendingIntent: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " error: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r2, r0)
            goto L175
        L172:
            r1.send()
        L175:
            jg7 r0 = defpackage.jg7.a
            return r0
        L178:
            c07 r0 = (defpackage.c07) r0
            r0.z0 = r4
            defpackage.bl2.G(r0)
            defpackage.xk2.w(r0)
            defpackage.f04.I(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L188:
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment r0 = (me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment) r0
            p15 r1 = new p15
            wh7 r2 = r0.Z
            if (r2 == 0) goto L19e
            yj1 r3 = r0.d0
            if (r3 == 0) goto L198
            r1.<init>(r0, r2, r3)
            return r1
        L198:
            java.lang.String r0 = "directoryAccessValidator"
            defpackage.nb3.a0(r0)
            throw r4
        L19e:
            java.lang.String r0 = "uriPermissionManager"
            defpackage.nb3.a0(r0)
            throw r4
        L1a4:
            r1 = r0
            qm6 r1 = (defpackage.qm6) r1
        L1a7:
            java.lang.Object r4 = r1.g
            monitor-enter(r4)
            boolean r0 = r1.c     // Catch: java.lang.Throwable -> L220
            if (r0 != 0) goto L225
            r1.c = r2     // Catch: java.lang.Throwable -> L220
            ua4 r0 = r1.f     // Catch: java.lang.Throwable -> L21a
            java.lang.Object[] r5 = r0.A     // Catch: java.lang.Throwable -> L21a
            int r0 = r0.L     // Catch: java.lang.Throwable -> L21a
            r6 = 0
        L1b7:
            if (r6 >= r0) goto L21c
            r7 = r5[r6]     // Catch: java.lang.Throwable -> L21a
            pm6 r7 = (defpackage.pm6) r7     // Catch: java.lang.Throwable -> L21a
            ka4 r8 = r7.g     // Catch: java.lang.Throwable -> L21a
            qn2 r7 = r7.a     // Catch: java.lang.Throwable -> L21a
            java.lang.Object[] r9 = r8.b     // Catch: java.lang.Throwable -> L21a
            long[] r10 = r8.a     // Catch: java.lang.Throwable -> L21a
            int r11 = r10.length     // Catch: java.lang.Throwable -> L21a
            int r11 = r11 + (-2)
            if (r11 < 0) goto L211
            r12 = 0
        L1cb:
            r13 = r10[r12]     // Catch: java.lang.Throwable -> L21a
            long r2 = ~r13     // Catch: java.lang.Throwable -> L21a
            r16 = 7
            long r2 = r2 << r16
            long r2 = r2 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r16
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 == 0) goto L20b
            int r2 = r12 - r11
            int r2 = ~r2     // Catch: java.lang.Throwable -> L21a
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r15 = 0
        L1e8:
            if (r15 >= r2) goto L209
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r13 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L200
            int r16 = r12 << 3
            int r16 = r16 + r15
            r17 = r3
            r3 = r9[r16]     // Catch: java.lang.Throwable -> L21a
            r7.g(r3)     // Catch: java.lang.Throwable -> L21a
            goto L202
        L200:
            r17 = r3
        L202:
            long r13 = r13 >> r17
            int r15 = r15 + 1
            r3 = r17
            goto L1e8
        L209:
            if (r2 != r3) goto L211
        L20b:
            if (r12 == r11) goto L211
            int r12 = r12 + 1
            r2 = 1
            goto L1cb
        L211:
            r8.b()     // Catch: java.lang.Throwable -> L21a
            int r6 = r6 + 1
            r2 = 1
            goto L1b7
        L218:
            r15 = 0
            goto L222
        L21a:
            r0 = move-exception
            goto L218
        L21c:
            r15 = 0
            r1.c = r15     // Catch: java.lang.Throwable -> L220
            goto L225
        L220:
            r0 = move-exception
            goto L232
        L222:
            r1.c = r15     // Catch: java.lang.Throwable -> L220
            throw r0     // Catch: java.lang.Throwable -> L220
        L225:
            monitor-exit(r4)
            boolean r0 = r1.c()
            if (r0 != 0) goto L22f
            jg7 r0 = defpackage.jg7.a
            return r0
        L22f:
            r2 = 1
            goto L1a7
        L232:
            monitor-exit(r4)
            throw r0
        L234:
            yd6 r0 = (defpackage.yd6) r0
            vs4 r1 = r0.L
            java.lang.Object r2 = r1.getValue()
            xi6 r2 = (defpackage.xi6) r2
            long r2 = r2.a
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L24a
            goto L267
        L24a:
            java.lang.Object r2 = r1.getValue()
            xi6 r2 = (defpackage.xi6) r2
            long r2 = r2.a
            boolean r2 = defpackage.xi6.f(r2)
            if (r2 == 0) goto L259
            goto L267
        L259:
            xd6 r0 = r0.A
            java.lang.Object r1 = r1.getValue()
            xi6 r1 = (defpackage.xi6) r1
            long r1 = r1.a
            android.graphics.Shader r4 = r0.b(r1)
        L267:
            return r4
        L268:
            me.magnum.melonds.ui.settings.SettingsActivity r0 = (me.magnum.melonds.ui.settings.SettingsActivity) r0
            int r1 = me.magnum.melonds.ui.settings.SettingsActivity.F0
            v82 r1 = new v82
            r1.<init>(r0)
            return r1
        L272:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r15 = 0
            java.lang.Object r0 = r0.get(r15)
            hg3 r0 = (defpackage.hg3) r0
            ar0 r0 = r0.c()
            return r0
        L280:
            yb6 r0 = (defpackage.yb6) r0
            wb6[] r1 = r0.k
            int r0 = defpackage.oi2.H(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L28c:
            return r0
        L28d:
            n96 r0 = (defpackage.n96) r0
            ga7 r1 = r0.e
            if (r1 == 0) goto L2a0
            ii1 r1 = r1.l
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            goto L2a2
        L2a0:
            r1 = 0
        L2a2:
            r0.f = r1
            jg7 r0 = defpackage.jg7.a
            return r0
        L2a7:
            u76 r0 = (defpackage.u76) r0
            py0 r1 = defpackage.xp4.a
            java.lang.Object r1 = defpackage.hf.K(r0, r1)
            tg r1 = (defpackage.tg) r1
            r0.w0 = r1
            if (r1 == 0) goto L2c3
            sg r5 = new sg
            android.content.Context r6 = r1.a
            qh1 r7 = r1.b
            long r8 = r1.c
            lq4 r10 = r1.d
            r5.<init>(r6, r7, r8, r10)
            r4 = r5
        L2c3:
            r0.x0 = r4
            jg7 r0 = defpackage.jg7.a
            return r0
        L2c8:
            g56 r0 = (defpackage.g56) r0
            ut3 r1 = r0.getLifecycle()
            mf5 r2 = new mf5
            r15 = 0
            r2.<init>(r0, r15)
            r1.a(r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        L2da:
            bp7 r0 = (defpackage.bp7) r0
            a56 r0 = defpackage.y46.c(r0)
            return r0
        L2e1:
            u46 r0 = (defpackage.u46) r0
            e56 r0 = r0.L
            if (r0 == 0) goto L2ff
            r15 = 0
            vr4[] r1 = new defpackage.vr4[r15]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r15)
            vr4[] r1 = (defpackage.vr4[]) r1
            android.os.Bundle r1 = defpackage.jw2.l(r1)
            r0.c(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L2fe
            goto L2ff
        L2fe:
            r4 = r1
        L2ff:
            return r4
    }
}
