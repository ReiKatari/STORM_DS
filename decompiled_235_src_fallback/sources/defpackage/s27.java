package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s27  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s27 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ s27(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r3 = r0.R
            java.lang.Object r4 = r0.L
            java.lang.Object r0 = r0.B
            r5 = 1
            switch(r1) {
                case 0: goto La2;
                case 1: goto L76;
                case 2: goto L47;
                default: goto L10;
            }
        L10:
            sr4 r0 = (defpackage.sr4) r0
            sr4 r4 = (defpackage.sr4) r4
            sr4 r3 = (defpackage.sr4) r3
            r1 = r17
            hw r1 = (defpackage.hw) r1
            boolean r2 = r1 instanceof defpackage.fw
            if (r2 == 0) goto L29
            if (r0 == 0) goto L26
            fw r1 = new fw
            r1.<init>(r0)
            goto L46
        L26:
            fw r1 = (defpackage.fw) r1
            goto L46
        L29:
            boolean r0 = r1 instanceof defpackage.ew
            if (r0 == 0) goto L46
            ew r1 = (defpackage.ew) r1
            b62 r0 = r1.b
            java.lang.Throwable r2 = r0.c
            boolean r2 = r2 instanceof defpackage.eh4
            if (r2 == 0) goto L3f
            if (r4 == 0) goto L46
            ew r1 = new ew
            r1.<init>(r4, r0)
            goto L46
        L3f:
            if (r3 == 0) goto L46
            ew r1 = new ew
            r1.<init>(r3, r0)
        L46:
            return r1
        L47:
            eo2 r0 = (defpackage.eo2) r0
            qa4 r4 = (defpackage.qa4) r4
            qa4 r3 = (defpackage.qa4) r3
            r1 = r17
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r5 = r1.booleanValue()
            r4.setValue(r1)
            java.lang.String r4 = "translator_tts_enabled"
            r0.o(r4, r1)
            if (r5 != 0) goto L75
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L75
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r3.setValue(r1)
            java.lang.String r3 = "translator_local_voice_actor_studio"
            r0.o(r3, r1)
        L75:
            return r2
        L76:
            j37 r0 = (defpackage.j37) r0
            qn2 r4 = (defpackage.qn2) r4
            qa4 r3 = (defpackage.qa4) r3
            r1 = r17
            c37 r1 = (defpackage.c37) r1
            r1.getClass()
            r0.getClass()
            vs4 r0 = r0.b
            r0.setValue(r1)
            fp r0 = r1.a
            java.lang.String r0 = r0.B
            java.lang.Object r0 = r4.g(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ r5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.setValue(r0)
            return r2
        La2:
            p27 r0 = (defpackage.p27) r0
            w61 r4 = (defpackage.w61) r4
            android.content.Context r3 = (android.content.Context) r3
            r1 = r17
            j07 r1 = (defpackage.j07) r1
            ca4 r6 = r1.a
            ca4 r1 = r1.a
            w07 r7 = defpackage.w07.b
            r6.a(r7)
            t07 r6 = defpackage.t07.Cut
            c37 r8 = r0.n()
            long r8 = r8.b
            boolean r8 = defpackage.k47.c(r8)
            r9 = 0
            if (r8 != 0) goto Ld6
            boolean r8 = r0.j()
            if (r8 == 0) goto Ld6
            wq7 r8 = r0.f
            boolean r8 = r8 instanceof defpackage.jt4
            if (r8 != 0) goto Ld6
            tr0 r8 = r0.h
            if (r8 == 0) goto Ld6
            r8 = r5
            goto Ld7
        Ld6:
            r8 = r9
        Ld7:
            k27 r10 = new k27
            r11 = 0
            r10.<init>(r0, r11, r5)
            yu6 r12 = new yu6
            r13 = 2
            r12.<init>(r13, r4, r10)
            android.content.res.Resources r10 = r3.getResources()
            qk4 r14 = new qk4
            r15 = 23
            r14.<init>(r15, r12, r11)
            if (r8 == 0) goto L108
            java.lang.Object r8 = r6.getKey()
            int r12 = r6.m9getStringId9Hzcbyc()
            java.lang.String r10 = r10.getString(r12)
            int r6 = r6.m8getDrawableId3I4p1mQ()
            s07 r12 = new s07
            r12.<init>(r8, r10, r6, r14)
            r1.a(r12)
        L108:
            t07 r6 = defpackage.t07.Copy
            c37 r8 = r0.n()
            r17 = r6
            long r5 = r8.b
            boolean r5 = defpackage.k47.c(r5)
            if (r5 != 0) goto L124
            wq7 r5 = r0.f
            boolean r5 = r5 instanceof defpackage.jt4
            if (r5 != 0) goto L124
            tr0 r5 = r0.h
            if (r5 == 0) goto L124
            r5 = 1
            goto L125
        L124:
            r5 = r9
        L125:
            k27 r6 = new k27
            r6.<init>(r0, r11, r13)
            yu6 r8 = new yu6
            r8.<init>(r13, r4, r6)
            android.content.res.Resources r6 = r3.getResources()
            qk4 r10 = new qk4
            r10.<init>(r15, r8, r11)
            if (r5 == 0) goto L152
            java.lang.Object r5 = r17.getKey()
            int r8 = r17.m9getStringId9Hzcbyc()
            java.lang.String r6 = r6.getString(r8)
            int r8 = r17.m8getDrawableId3I4p1mQ()
            s07 r12 = new s07
            r12.<init>(r5, r6, r8, r10)
            r1.a(r12)
        L152:
            t07 r5 = defpackage.t07.Paste
            boolean r6 = r0.j()
            if (r6 == 0) goto L16e
            vs4 r6 = r0.x
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L16e
            tr0 r6 = r0.h
            if (r6 == 0) goto L16e
            r6 = 1
            goto L16f
        L16e:
            r6 = r9
        L16f:
            k27 r8 = new k27
            r10 = 3
            r8.<init>(r0, r11, r10)
            yu6 r10 = new yu6
            r10.<init>(r13, r4, r8)
            android.content.res.Resources r4 = r3.getResources()
            qk4 r8 = new qk4
            r8.<init>(r15, r10, r11)
            if (r6 == 0) goto L19d
            java.lang.Object r6 = r5.getKey()
            int r10 = r5.m9getStringId9Hzcbyc()
            java.lang.String r4 = r4.getString(r10)
            int r5 = r5.m8getDrawableId3I4p1mQ()
            s07 r10 = new s07
            r10.<init>(r6, r4, r5, r8)
            r1.a(r10)
        L19d:
            t07 r4 = defpackage.t07.SelectAll
            c37 r5 = r0.n()
            long r5 = r5.b
            int r5 = defpackage.k47.d(r5)
            c37 r6 = r0.n()
            fp r6 = r6.a
            java.lang.String r6 = r6.B
            int r6 = r6.length()
            if (r5 == r6) goto L1b9
            r5 = 1
            goto L1ba
        L1b9:
            r5 = r9
        L1ba:
            u27 r6 = new u27
            r6.<init>(r0, r9)
            u27 r8 = new u27
            r10 = 1
            r8.<init>(r0, r10)
            android.content.res.Resources r12 = r3.getResources()
            qk4 r14 = new qk4
            r14.<init>(r15, r8, r6)
            if (r5 == 0) goto L1e8
            java.lang.Object r5 = r4.getKey()
            int r6 = r4.m9getStringId9Hzcbyc()
            java.lang.String r6 = r12.getString(r6)
            int r4 = r4.m8getDrawableId3I4p1mQ()
            s07 r8 = new s07
            r8.<init>(r5, r6, r4, r14)
            r1.a(r8)
        L1e8:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r4 < r5) goto L22d
            t07 r4 = defpackage.t07.Autofill
            boolean r5 = r0.j()
            if (r5 == 0) goto L204
            c37 r5 = r0.n()
            long r5 = r5.b
            boolean r5 = defpackage.k47.c(r5)
            if (r5 == 0) goto L204
            r5 = r10
            goto L205
        L204:
            r5 = r9
        L205:
            u27 r6 = new u27
            r6.<init>(r0, r13)
            android.content.res.Resources r0 = r3.getResources()
            qk4 r3 = new qk4
            r3.<init>(r15, r6, r11)
            if (r5 == 0) goto L22d
            java.lang.Object r5 = r4.getKey()
            int r6 = r4.m9getStringId9Hzcbyc()
            java.lang.String r0 = r0.getString(r6)
            int r4 = r4.m8getDrawableId3I4p1mQ()
            s07 r6 = new s07
            r6.<init>(r5, r0, r4, r3)
            r1.a(r6)
        L22d:
            r1.a(r7)
            return r2
    }
}
