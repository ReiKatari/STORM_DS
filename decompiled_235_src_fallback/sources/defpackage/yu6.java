package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yu6 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ yu6(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    public /* synthetic */ yu6(defpackage.f47 r1, defpackage.ep r2, defpackage.vm r3) {
            r0 = this;
            r1 = 5
            r0.A = r1
            r0.<init>()
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r14 = this;
            int r0 = r14.A
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            jg7 r5 = defpackage.jg7.a
            java.lang.Object r6 = r14.L
            java.lang.Object r14 = r14.B
            switch(r0) {
                case 0: goto L22b;
                case 1: goto L1dc;
                case 2: goto L1cd;
                case 3: goto Le1;
                case 4: goto Ld6;
                case 5: goto La2;
                case 6: goto L27;
                case 7: goto L1b;
                default: goto Lf;
            }
        Lf:
            j97 r14 = (defpackage.j97) r14
            st7 r6 = (defpackage.st7) r6
            java.lang.Object r14 = r14.B
            gt7 r14 = (defpackage.gt7) r14
            r14.a(r6)
            return r5
        L1b:
            j97 r14 = (defpackage.j97) r14
            st7 r6 = (defpackage.st7) r6
            java.lang.Object r14 = r14.B
            gt7 r14 = (defpackage.gt7) r14
            r14.a(r6)
            return r5
        L27:
            eo2 r14 = (defpackage.eo2) r14
            qa4 r6 = (defpackage.qa4) r6
            t52 r0 = defpackage.wa7.getEntries()
            java.util.ArrayList r1 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.ht0.v0(r0, r7)
            r1.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L3e:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L61
            java.lang.Object r7 = r0.next()
            wa7 r7 = (defpackage.wa7) r7
            java.lang.String r8 = r7.getPreferenceValue()
            java.lang.String r7 = r7.getDisplayName()
            java.lang.String r9 = " ("
            java.lang.String r7 = defpackage.qs6.Q0(r7, r9)
            vr4 r9 = new vr4
            r9.<init>(r8, r7)
            r1.add(r9)
            goto L3e
        L61:
            int r0 = r1.size()
            r7 = r4
        L66:
            if (r7 >= r0) goto L83
            java.lang.Object r8 = r1.get(r7)
            int r7 = r7 + 1
            vr4 r8 = (defpackage.vr4) r8
            java.lang.Object r8 = r8.A
            java.lang.Object r9 = r6.getValue()
            java.lang.String r9 = (java.lang.String) r9
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto L80
            r2 = r4
            goto L83
        L80:
            int r4 = r4 + 1
            goto L66
        L83:
            int r2 = r2 + r3
            int r0 = r1.size()
            int r2 = r2 % r0
            java.lang.Object r0 = r1.get(r2)
            vr4 r0 = (defpackage.vr4) r0
            java.lang.Object r0 = r0.A
            java.lang.String r0 = (java.lang.String) r0
            r6.setValue(r0)
            java.lang.Object r0 = r6.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "translator_engine"
            r14.o(r1, r0)
            return r5
        La2:
            ep r14 = (defpackage.ep) r14
            vm r6 = (defpackage.vm) r6
            java.lang.Object r14 = r14.a
            pv3 r14 = (defpackage.pv3) r14
            boolean r0 = r14 instanceof defpackage.ov3
            if (r0 == 0) goto Ld5
            ov3 r14 = (defpackage.ov3) r14     // Catch: java.lang.IllegalArgumentException -> Ld5
            java.lang.String r14 = r14.a     // Catch: java.lang.IllegalArgumentException -> Ld5
            r6.getClass()     // Catch: java.lang.IllegalArgumentException -> Ld5
            android.content.Context r0 = r6.a     // Catch: android.content.ActivityNotFoundException -> Lc6 java.lang.IllegalArgumentException -> Ld5
            android.content.Intent r1 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> Lc6 java.lang.IllegalArgumentException -> Ld5
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r14)     // Catch: android.content.ActivityNotFoundException -> Lc6 java.lang.IllegalArgumentException -> Ld5
            r1.<init>(r2, r3)     // Catch: android.content.ActivityNotFoundException -> Lc6 java.lang.IllegalArgumentException -> Ld5
            r0.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> Lc6 java.lang.IllegalArgumentException -> Ld5
            goto Ld5
        Lc6:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> Ld5
            java.lang.String r2 = "Can't open "
            r3 = 46
            java.lang.String r14 = defpackage.i61.k(r3, r2, r14)     // Catch: java.lang.IllegalArgumentException -> Ld5
            r1.<init>(r14, r0)     // Catch: java.lang.IllegalArgumentException -> Ld5
            throw r1     // Catch: java.lang.IllegalArgumentException -> Ld5
        Ld5:
            return r5
        Ld6:
            on2 r14 = (defpackage.on2) r14
            j37 r6 = (defpackage.j37) r6
            r14.c()
            r6.a()
            return r5
        Le1:
            p27 r14 = (defpackage.p27) r14
            qa4 r6 = (defpackage.qa4) r6
            java.lang.Object r0 = r6.getValue()
            q93 r0 = (defpackage.q93) r0
            long r5 = r0.a
            jk4 r0 = r14.i()
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            if (r0 == 0) goto L1c7
            long r9 = r0.a
            fp r0 = r14.m()
            if (r0 == 0) goto L1c7
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            if (r0 != 0) goto L10a
            goto L1c7
        L10a:
            vs4 r0 = r14.r
            java.lang.Object r0 = r0.getValue()
            fv2 r0 = (defpackage.fv2) r0
            if (r0 != 0) goto L116
            r0 = r2
            goto L11e
        L116:
            int[] r11 = defpackage.r27.a
            int r0 = r0.ordinal()
            r0 = r11[r0]
        L11e:
            if (r0 == r2) goto L1c7
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 2
            r13 = 32
            if (r0 == r3) goto L13f
            if (r0 == r2) goto L13f
            r3 = 3
            if (r0 != r3) goto L13a
            c37 r0 = r14.n()
            long r0 = r0.b
            int r3 = defpackage.k47.c
            long r0 = r0 & r11
        L138:
            int r0 = (int) r0
            goto L149
        L13a:
            defpackage.i.d()
            goto L1cc
        L13f:
            c37 r0 = r14.n()
            long r0 = r0.b
            int r3 = defpackage.k47.c
            long r0 = r0 >> r13
            goto L138
        L149:
            jt3 r1 = r14.d
            if (r1 == 0) goto L1c7
            b47 r1 = r1.d()
            if (r1 != 0) goto L154
            goto L1c7
        L154:
            jt3 r3 = r14.d
            if (r3 == 0) goto L1c7
            d17 r3 = r3.a
            fp r3 = r3.a
            if (r3 != 0) goto L15f
            goto L1c7
        L15f:
            mk4 r14 = r14.b
            int r14 = r14.s(r0)
            java.lang.String r0 = r3.B
            int r0 = r0.length()
            int r14 = defpackage.gi2.q(r14, r4, r0)
            long r3 = r1.d(r9)
            long r3 = r3 >> r13
            int r0 = (int) r3
            float r0 = java.lang.Float.intBitsToFloat(r0)
            a47 r1 = r1.a
            v84 r3 = r1.b
            int r14 = r3.d(r14)
            float r4 = r1.e(r14)
            float r1 = r1.f(r14)
            float r9 = java.lang.Math.min(r4, r1)
            float r1 = java.lang.Math.max(r4, r1)
            float r1 = defpackage.gi2.p(r0, r9, r1)
            r9 = 0
            boolean r4 = defpackage.q93.b(r5, r9)
            if (r4 != 0) goto L1ac
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            long r4 = r5 >> r13
            int r4 = (int) r4
            int r4 = r4 / r2
            float r2 = (float) r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1ac
            goto L1c7
        L1ac:
            float r0 = r3.f(r14)
            float r14 = r3.b(r14)
            float r14 = r14 - r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r2
            float r14 = r14 + r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            int r14 = java.lang.Float.floatToRawIntBits(r14)
            long r2 = (long) r14
            long r0 = r0 << r13
            long r2 = r2 & r11
            long r7 = r0 | r2
        L1c7:
            jk4 r1 = new jk4
            r1.<init>(r7)
        L1cc:
            return r1
        L1cd:
            w61 r14 = (defpackage.w61) r14
            qn2 r6 = (defpackage.qn2) r6
            a71 r0 = defpackage.a71.UNDISPATCHED
            v27 r2 = new v27
            r2.<init>(r4, r1, r6)
            defpackage.hv.L(r14, r1, r0, r2, r3)
            return r5
        L1dc:
            android.content.Context r14 = (android.content.Context) r14
            android.view.textclassifier.TextClassification r6 = (android.view.textclassifier.TextClassification) r6
            java.lang.String r0 = defpackage.q66.o(r6)
            if (r0 == 0) goto L1ea
            int r4 = r0.hashCode()
        L1ea:
            android.content.Intent r0 = defpackage.q66.g(r6)
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r14 = android.app.PendingIntent.getActivity(r14, r4, r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L227
            android.app.ActivityOptions r0 = android.app.ActivityOptions.makeBasic()     // Catch: android.app.PendingIntent.CanceledException -> L20a
            android.app.ActivityOptions r0 = defpackage.rv2.d(r0)     // Catch: android.app.PendingIntent.CanceledException -> L20a
            android.os.Bundle r0 = r0.toBundle()     // Catch: android.app.PendingIntent.CanceledException -> L20a
            defpackage.rv2.l(r14, r0)     // Catch: android.app.PendingIntent.CanceledException -> L20a
            goto L22a
        L20a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error sending pendingIntent: "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r14 = " error: "
            r1.append(r14)
            r1.append(r0)
            java.lang.String r14 = r1.toString()
            java.lang.String r0 = "TextClassification"
            android.util.Log.e(r0, r14)
            goto L22a
        L227:
            r14.send()
        L22a:
            return r5
        L22b:
            dv6 r14 = (defpackage.dv6) r14
            java.util.List r6 = (java.util.List) r6
            xx r0 = defpackage.vr6.a
            lg0 r14 = r14.a
            r14.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L23d
            goto L287
        L23d:
            android.hardware.camera2.CameraCharacteristics$Key r0 = defpackage.o2.d()
            r0.getClass()
            qc0 r14 = (defpackage.qc0) r14
            java.lang.Object r14 = r14.c(r0)
            long[] r14 = (long[]) r14
            if (r14 == 0) goto L287
            int r0 = r14.length
            if (r0 != 0) goto L252
            goto L287
        L252:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r14.length
            r2 = r4
        L259:
            if (r2 >= r1) goto L267
            r7 = r14[r2]
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r0.add(r5)
            int r2 = r2 + 1
            goto L259
        L267:
            java.util.Iterator r14 = r6.iterator()
        L26b:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L288
            java.lang.Object r1 = r14.next()
            jv6 r1 = (defpackage.jv6) r1
            tr6 r1 = r1.c
            long r1 = r1.getValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L26b
        L287:
            r3 = r4
        L288:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
    }
}
