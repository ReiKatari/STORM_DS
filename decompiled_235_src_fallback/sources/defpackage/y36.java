package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y36  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class y36 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ y36(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public /* synthetic */ y36(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r22, java.lang.Object r23) {
            r21 = this;
            r0 = r21
            r1 = r23
            int r2 = r0.A
            r3 = 7
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            java.lang.Object r0 = r0.B
            switch(r2) {
                case 0: goto L2ae;
                case 1: goto L28e;
                case 2: goto L27c;
                case 3: goto L267;
                case 4: goto L1fc;
                case 5: goto L18b;
                case 6: goto L12e;
                case 7: goto L105;
                case 8: goto Le1;
                case 9: goto Lc2;
                case 10: goto La3;
                case 11: goto L8e;
                case 12: goto L42;
                case 13: goto L2d;
                default: goto L10;
            }
        L10:
            ic r0 = (defpackage.ic) r0
            r2 = r22
            q93 r2 = (defpackage.q93) r2
            r6 = r1
            kk3 r6 = (defpackage.kk3) r6
            r3 = 0
            long r1 = r2.a
            r19 = r3
            r4 = r1
            r2 = r19
            r1 = r0
            long r0 = r1.a(r2, r4, r6)
            i93 r2 = new i93
            r2.<init>(r0)
            return r2
        L2d:
            nh2 r0 = (defpackage.nh2) r0
            r2 = r22
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r3)
            defpackage.is7.b(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L42:
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r2 = r22
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            r1.getClass()
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L60
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = (java.lang.String) r1
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            r0.apply()
            goto L8b
        L60:
            boolean r3 = r1 instanceof java.lang.Boolean
            if (r3 == 0) goto L76
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.apply()
            goto L8b
        L76:
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L8b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            r0.apply()
        L8b:
            jg7 r0 = defpackage.jg7.a
            return r0
        L8e:
            f47 r0 = (defpackage.f47) r0
            r2 = r22
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r6)
            r0.a(r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        La3:
            android.app.RemoteAction r0 = (android.app.RemoteAction) r0
            r2 = r22
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            xq2 r2 = (defpackage.xq2) r2
            r1 = -1376593684(0xffffffffadf2d8ec, float:-2.7608547E-11)
            r2.b0(r1)
            java.lang.CharSequence r0 = defpackage.q66.l(r0)
            java.lang.String r0 = r0.toString()
            r2.p(r7)
            return r0
        Lc2:
            android.view.textclassifier.TextClassification r0 = (android.view.textclassifier.TextClassification) r0
            r2 = r22
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            xq2 r2 = (defpackage.xq2) r2
            r1 = 950061013(0x38a0c7d5, float:7.666616E-5)
            r2.b0(r1)
            java.lang.CharSequence r0 = defpackage.q66.m(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.p(r7)
            return r0
        Le1:
            char[] r0 = (char[]) r0
            r2 = r22
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.getClass()
            int r0 = defpackage.qs6.u0(r2, r0, r1, r7)
            if (r0 >= 0) goto Lf7
            goto L104
        Lf7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            vr4 r5 = new vr4
            r5.<init>(r0, r1)
        L104:
            return r5
        L105:
            java.util.List r0 = (java.util.List) r0
            r2 = r22
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.getClass()
            vr4 r0 = defpackage.qs6.n0(r2, r0, r1)
            if (r0 == 0) goto L12d
            java.lang.Object r1 = r0.A
            java.lang.Object r0 = r0.B
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            vr4 r5 = new vr4
            r5.<init>(r1, r0)
        L12d:
            return r5
        L12e:
            qm6 r0 = (defpackage.qm6) r0
            r2 = r22
            java.util.Set r2 = (java.util.Set) r2
            vl6 r1 = (defpackage.vl6) r1
            java.util.concurrent.atomic.AtomicReference r1 = r0.b
        L138:
            java.lang.Object r3 = r1.get()
            if (r3 != 0) goto L142
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8
            goto L160
        L142:
            boolean r8 = r3 instanceof java.util.Set
            if (r8 == 0) goto L151
            java.util.Set[] r8 = new java.util.Set[r4]
            r8[r7] = r3
            r8[r6] = r2
            java.util.List r8 = defpackage.hf.c0(r8)
            goto L160
        L151:
            boolean r8 = r3 instanceof java.util.List
            if (r8 == 0) goto L182
            r8 = r3
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r9 = defpackage.hf.b0(r2)
            java.util.ArrayList r8 = defpackage.gt0.V0(r8, r9)
        L160:
            boolean r9 = r1.compareAndSet(r3, r8)
            if (r9 == 0) goto L17b
            boolean r1 = r0.c()
            if (r1 == 0) goto L178
            qn2 r1 = r0.a
            t46 r2 = new t46
            r3 = 10
            r2.<init>(r0, r3)
            r1.g(r2)
        L178:
            jg7 r5 = defpackage.jg7.a
            goto L18a
        L17b:
            java.lang.Object r9 = r1.get()
            if (r9 == r3) goto L160
            goto L138
        L182:
            java.lang.String r0 = "Unexpected notification"
            defpackage.tx0.b(r0)
            defpackage.e41.c()
        L18a:
            return r5
        L18b:
            si6 r0 = (defpackage.si6) r0
            r2 = r22
            java.util.Set r2 = (java.util.Set) r2
            vl6 r1 = (defpackage.vl6) r1
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            ka4 r6 = r0.d     // Catch: java.lang.Throwable -> L1a7
            if (r6 != 0) goto L1a9
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L1a7
            java.lang.Object r3 = r0.b     // Catch: java.lang.Throwable -> L1a7
            boolean r2 = defpackage.gt0.C0(r2, r3)     // Catch: java.lang.Throwable -> L1a7
            if (r2 == 0) goto L1ef
            ob6 r5 = r0.f     // Catch: java.lang.Throwable -> L1a7
            goto L1ef
        L1a7:
            r0 = move-exception
            goto L1fa
        L1a9:
            java.lang.Object[] r8 = r6.b     // Catch: java.lang.Throwable -> L1a7
            long[] r6 = r6.a     // Catch: java.lang.Throwable -> L1a7
            int r9 = r6.length     // Catch: java.lang.Throwable -> L1a7
            int r9 = r9 - r4
            if (r9 < 0) goto L1ef
            r4 = r7
        L1b2:
            r10 = r6[r4]     // Catch: java.lang.Throwable -> L1a7
            long r12 = ~r10     // Catch: java.lang.Throwable -> L1a7
            long r12 = r12 << r3
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L1ea
            int r12 = r4 - r9
            int r12 = ~r12     // Catch: java.lang.Throwable -> L1a7
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r7
        L1cb:
            if (r14 >= r12) goto L1e8
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L1e4
            int r15 = r4 << 3
            int r15 = r15 + r14
            r15 = r8[r15]     // Catch: java.lang.Throwable -> L1a7
            boolean r15 = r2.contains(r15)     // Catch: java.lang.Throwable -> L1a7
            if (r15 == 0) goto L1e4
            ob6 r5 = r0.f     // Catch: java.lang.Throwable -> L1a7
            goto L1ef
        L1e4:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L1cb
        L1e8:
            if (r12 != r13) goto L1ef
        L1ea:
            if (r4 == r9) goto L1ef
            int r4 = r4 + 1
            goto L1b2
        L1ef:
            monitor-exit(r1)
            if (r5 == 0) goto L1f7
            jg7 r0 = defpackage.jg7.a
            r5.c(r0)
        L1f7:
            jg7 r0 = defpackage.jg7.a
            return r0
        L1fa:
            monitor-exit(r1)
            throw r0
        L1fc:
            me.magnum.melonds.ui.settings.SettingsActivity r0 = (me.magnum.melonds.ui.settings.SettingsActivity) r0
            r2 = r22
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r3 = me.magnum.melonds.ui.settings.SettingsActivity.F0
            r3 = r1 & 3
            if (r3 == r4) goto L20f
            r7 = r6
        L20f:
            r1 = r1 & r6
            r12 = r2
            xq2 r12 = (defpackage.xq2) r12
            boolean r1 = r12.S(r1, r7)
            if (r1 == 0) goto L261
            tp6 r1 = r0.B0
            qa4 r1 = defpackage.np2.C(r1, r12)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            tp6 r2 = r0.C0
            qa4 r2 = defpackage.np2.C(r2, r12)
            java.lang.Object r2 = r2.getValue()
            hd6 r2 = (defpackage.hd6) r2
            if (r2 == 0) goto L237
            android.graphics.drawable.Drawable r3 = r2.c
            r8 = r3
            goto L238
        L237:
            r8 = r5
        L238:
            if (r2 == 0) goto L249
            java.lang.String r3 = r2.a
            boolean r4 = defpackage.qs6.v0(r3)
            if (r4 != 0) goto L243
            goto L244
        L243:
            r3 = r5
        L244:
            if (r3 != 0) goto L247
            goto L249
        L247:
            r9 = r3
            goto L24a
        L249:
            r9 = r1
        L24a:
            if (r2 == 0) goto L24e
            java.lang.String r5 = r2.b
        L24e:
            r10 = r5
            r2 = 2131952616(0x7f1303e8, float:1.954168E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = " › "
            java.lang.String r11 = defpackage.lb1.m(r0, r2, r1)
            r13 = 0
            defpackage.g04.q(r8, r9, r10, r11, r12, r13)
            goto L264
        L261:
            r12.V()
        L264:
            jg7 r0 = defpackage.jg7.a
            return r0
        L267:
            u3 r0 = (defpackage.u3) r0
            r2 = r22
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r6)
            defpackage.hi2.j(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L27c:
            ch5 r0 = (defpackage.ch5) r0
            r2 = r22
            vy4 r2 = (defpackage.vy4) r2
            jk4 r1 = (defpackage.jk4) r1
            r2.a()
            long r1 = r1.a
            r0.A = r1
            jg7 r0 = defpackage.jg7.a
            return r0
        L28e:
            e86 r0 = (defpackage.e86) r0
            r2 = r22
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            w61 r3 = r0.F0()
            d86 r4 = new d86
            r4.<init>(r0, r2, r1, r5)
            r0 = 3
            defpackage.hv.L(r3, r5, r5, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L2ae:
            me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment r0 = (me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment) r0
            r2 = r22
            android.net.Uri r2 = (android.net.Uri) r2
            on2 r1 = (defpackage.on2) r1
            r2.getClass()
            r1.getClass()
            jd6 r3 = r0.k()
            android.content.SharedPreferences r3 = r3.b
            java.lang.String r4 = "save_internal_config_as_file"
            boolean r3 = r3.getBoolean(r4, r7)
            if (r3 != 0) goto L2ce
            r1.c()
            goto L311
        L2ce:
            jd6 r3 = r0.k()
            boolean r3 = r3.f(r2)
            if (r3 != 0) goto L2e3
            r1.c()
            jd6 r0 = r0.k()
            r0.i()
            goto L311
        L2e3:
            zb r3 = new zb
            android.content.Context r4 = r0.requireContext()
            r3.<init>(r4)
            r4 = 2131952626(0x7f1303f2, float:1.95417E38)
            r3.z(r4)
            r4 = 2131952625(0x7f1303f1, float:1.9541698E38)
            r3.w(r4)
            z36 r4 = new z36
            r4.<init>(r0, r2, r1)
            r5 = 2131952628(0x7f1303f4, float:1.9541704E38)
            r3.y(r5, r4)
            z36 r4 = new z36
            r4.<init>(r1, r0, r2)
            r0 = 2131952627(0x7f1303f3, float:1.9541702E38)
            r3.x(r0, r4)
            r3.B()
        L311:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
