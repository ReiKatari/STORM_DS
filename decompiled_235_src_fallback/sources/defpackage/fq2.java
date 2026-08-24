package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq2  reason: default package */
/* loaded from: classes.dex */
public final class fq2 extends defpackage.hw6 implements defpackage.eo2 {
    public java.lang.String X;
    public java.lang.String Y;
    public java.util.List Z;
    public defpackage.dh5 d0;
    public defpackage.dh5 e0;
    public int f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ defpackage.hq2 h0;
    public final /* synthetic */ android.graphics.Bitmap i0;
    public final /* synthetic */ java.util.List j0;
    public final /* synthetic */ boolean k0;

    public fq2(boolean r1, defpackage.hq2 r2, android.graphics.Bitmap r3, java.util.List r4, boolean r5, defpackage.r41 r6) {
            r0 = this;
            r0.g0 = r1
            r0.h0 = r2
            r0.i0 = r3
            r0.j0 = r4
            r0.k0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            fq2 r0 = (defpackage.fq2) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            fq2 r0 = new fq2
            java.util.List r4 = r7.j0
            boolean r5 = r7.k0
            boolean r1 = r7.g0
            hq2 r2 = r7.h0
            android.graphics.Bitmap r3 = r7.i0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r32) {
            r31 = this;
            r0 = r31
            java.lang.String r1 = "ru"
            java.lang.String r2 = "auto"
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.f0
            android.graphics.Bitmap r8 = r0.i0
            java.lang.String r13 = "GameTranslatorManager"
            yt1 r16 = defpackage.yt1.A
            boolean r6 = r0.g0
            r7 = 3
            r9 = 2
            r10 = 1
            r17 = 0
            r11 = 0
            hq2 r12 = r0.h0
            if (r4 == 0) goto L72
            if (r4 == r10) goto L58
            if (r4 == r9) goto L41
            if (r4 != r7) goto L3a
            dh5 r1 = r0.e0
            java.lang.String r1 = (java.lang.String) r1
            dh5 r1 = r0.d0
            java.lang.String r0 = r0.Y
            defpackage.oi2.Y(r32)     // Catch: java.lang.Throwable -> L33
            r2 = r11
            r7 = r12
            r10 = r17
            goto L2f7
        L33:
            r0 = move-exception
            r2 = r11
        L35:
            r7 = r12
            r10 = r17
            goto L33d
        L3a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L41:
            dh5 r1 = r0.e0
            dh5 r2 = r0.d0
            java.lang.String r4 = r0.Y
            java.lang.String r8 = r0.X
            defpackage.oi2.Y(r32)     // Catch: java.lang.Throwable -> L33
            r5 = r6
            r7 = r12
            r10 = r17
            r6 = r2
            r12 = r4
            r2 = r11
            r4 = r1
            r1 = r32
            goto L1b3
        L58:
            dh5 r1 = r0.e0
            dh5 r2 = r0.d0
            java.util.List r4 = r0.Z
            java.lang.String r10 = r0.Y
            java.lang.String r7 = r0.X
            defpackage.oi2.Y(r32)     // Catch: java.lang.Throwable -> L33
            r5 = r6
            r14 = r9
            r19 = r12
            r6 = r32
            r9 = r7
            r12 = r10
            r10 = r4
            r4 = r2
            r2 = r11
            goto L173
        L72:
            defpackage.oi2.Y(r32)
            if (r6 == 0) goto L116
            r12.getClass()     // Catch: java.lang.Throwable -> L113
            r4 = 9
            r19 = 0
            r7 = 8
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r8, r4, r7, r11)     // Catch: java.lang.Throwable -> Le3
            r4.getClass()     // Catch: java.lang.Throwable -> Le1
            r10 = r11
            r21 = r19
        L8a:
            if (r10 >= r7) goto Ld9
            r5 = r11
        L8d:
            if (r5 >= r7) goto Ld2
            int r7 = r4.getPixel(r5, r10)     // Catch: java.lang.Throwable -> Le1
            int r14 = r5 + 1
            int r15 = r4.getPixel(r14, r10)     // Catch: java.lang.Throwable -> Le1
            int r11 = r7 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 * 299
            int r9 = r7 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 * 587
            int r9 = r9 + r11
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 * 114
            int r7 = r7 + r9
            int r7 = r7 / 1000
            int r9 = r15 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 * 299
            int r11 = r15 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 * 587
            int r11 = r11 + r9
            r9 = r15 & 255(0xff, float:3.57E-43)
            int r9 = r9 * 114
            int r9 = r9 + r11
            int r9 = r9 / 1000
            if (r7 <= r9) goto Lcc
            int r7 = r10 * 8
            int r7 = r7 + r5
            r25 = 1
            long r25 = r25 << r7
            long r21 = r21 | r25
        Lcc:
            r5 = r14
            r7 = 8
            r9 = 2
            r11 = 0
            goto L8d
        Ld2:
            int r10 = r10 + 1
            r7 = 8
            r9 = 2
            r11 = 0
            goto L8a
        Ld9:
            if (r4 == r8) goto Lde
            r4.recycle()     // Catch: java.lang.Throwable -> Le1
        Lde:
            r4 = r21
            goto Le5
        Le1:
            r0 = move-exception
            goto L10d
        Le3:
            r4 = r19
        Le5:
            long r9 = r12.v     // Catch: java.lang.Throwable -> L10c
            long r9 = r9 ^ r4
            int r7 = java.lang.Long.bitCount(r9)     // Catch: java.lang.Throwable -> L10c
            r9 = 2
            if (r7 > r9) goto L10f
            long r10 = r12.v     // Catch: java.lang.Throwable -> L10c
            int r7 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r7 == 0) goto L10f
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r12.l     // Catch: java.lang.Throwable -> L10c
            if (r0 == 0) goto L102
            r7 = 0
            r0.setTranslating(r7)     // Catch: java.lang.Throwable -> Lfe
            goto L103
        Lfe:
            r0 = move-exception
        Lff:
            r2 = r7
            goto L35
        L102:
            r7 = 0
        L103:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r12.l
            if (r0 == 0) goto L380
            r0.setTranslating(r7)
            goto L380
        L10c:
            r0 = move-exception
        L10d:
            r7 = 0
            goto Lff
        L10f:
            r7 = 0
            r12.v = r4     // Catch: java.lang.Throwable -> Lfe
            goto L117
        L113:
            r0 = move-exception
            r7 = r11
            goto Lff
        L116:
            r7 = r11
        L117:
            android.content.SharedPreferences r4 = r12.f     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r5 = "translator_source_lang"
            java.lang.String r4 = r4.getString(r5, r2)     // Catch: java.lang.Throwable -> Lfe
            if (r4 != 0) goto L122
            goto L123
        L122:
            r2 = r4
        L123:
            android.content.SharedPreferences r4 = r12.f     // Catch: java.lang.Throwable -> Lfe
            java.lang.String r5 = "translator_target_lang"
            java.lang.String r4 = r4.getString(r5, r1)     // Catch: java.lang.Throwable -> Lfe
            if (r4 != 0) goto L12e
            goto L12f
        L12e:
            r1 = r4
        L12f:
            java.util.List r4 = r0.j0     // Catch: java.lang.Throwable -> Lfe
            if (r4 == 0) goto L135
        L133:
            r10 = r4
            goto L141
        L135:
            boolean r4 = r0.k0     // Catch: java.lang.Throwable -> Lfe
            if (r4 == 0) goto L13c
            r10 = r16
            goto L141
        L13c:
            java.util.List r4 = r12.e()     // Catch: java.lang.Throwable -> Lfe
            goto L133
        L141:
            dh5 r4 = new dh5     // Catch: java.lang.Throwable -> Lfe
            r4.<init>()     // Catch: java.lang.Throwable -> Lfe
            r5 = r6
            l5 r6 = new l5     // Catch: java.lang.Throwable -> Lfe
            r23 = r7
            hq2 r7 = r0.h0     // Catch: java.lang.Throwable -> L337
            r11 = 0
            r14 = r12
            r12 = 16
            r19 = r14
            r15 = 1
            r14 = r9
            r9 = r2
            r2 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1c1
            r0.X = r9     // Catch: java.lang.Throwable -> L1c1
            r0.Y = r1     // Catch: java.lang.Throwable -> L1c1
            r0.Z = r10     // Catch: java.lang.Throwable -> L1c1
            r0.d0 = r4     // Catch: java.lang.Throwable -> L1c1
            r0.e0 = r4     // Catch: java.lang.Throwable -> L1c1
            r0.f0 = r15     // Catch: java.lang.Throwable -> L1c1
            r11 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r6 = defpackage.xk2.N(r11, r6, r0)     // Catch: java.lang.Throwable -> L1c1
            if (r6 != r3) goto L171
            goto L2f5
        L171:
            r12 = r1
            r1 = r4
        L173:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L1c1
            if (r6 != 0) goto L179
            r6 = r16
        L179:
            r1.A = r6     // Catch: java.lang.Throwable -> L1c1
            java.lang.Object r1 = r4.A     // Catch: java.lang.Throwable -> L1c1
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1c1
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c1
            if (r1 == 0) goto L1c8
            boolean r1 = r10.isEmpty()     // Catch: java.lang.Throwable -> L1c1
            if (r1 != 0) goto L1c8
            java.lang.String r1 = "Custom regions returned 0 blocks, executing fullscreen fallback..."
            android.util.Log.i(r13, r1)     // Catch: java.lang.Throwable -> L1c1
            u12 r6 = new u12     // Catch: java.lang.Throwable -> L1c1
            r11 = 10
            r10 = r17
            r7 = r19
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1be
            r0.X = r9     // Catch: java.lang.Throwable -> L1be
            r0.Y = r12     // Catch: java.lang.Throwable -> L1be
            r0.Z = r10     // Catch: java.lang.Throwable -> L1be
            r0.d0 = r4     // Catch: java.lang.Throwable -> L1be
            r0.e0 = r4     // Catch: java.lang.Throwable -> L1be
            r0.f0 = r14     // Catch: java.lang.Throwable -> L1be
            r14 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r1 = defpackage.xk2.N(r14, r6, r0)     // Catch: java.lang.Throwable -> L1be
            if (r1 != r3) goto L1b1
            goto L2f5
        L1b1:
            r6 = r4
            r8 = r9
        L1b3:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1be
            if (r1 != 0) goto L1b9
            r1 = r16
        L1b9:
            r4.A = r1     // Catch: java.lang.Throwable -> L1be
            r4 = r6
            r9 = r8
            goto L1cc
        L1be:
            r0 = move-exception
            goto L33d
        L1c1:
            r0 = move-exception
            r10 = r17
            r7 = r19
            goto L33d
        L1c8:
            r10 = r17
            r7 = r19
        L1cc:
            java.lang.Object r1 = r4.A     // Catch: java.lang.Throwable -> L1be
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1be
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1be
            if (r1 == 0) goto L22c
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r7.l     // Catch: java.lang.Throwable -> L1be
            android.app.Activity r1 = r7.a
            if (r0 == 0) goto L1df
            r0.a()     // Catch: java.lang.Throwable -> L1be
        L1df:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r7.l     // Catch: java.lang.Throwable -> L1be
            if (r0 == 0) goto L1e6
            r0.setTranslating(r2)     // Catch: java.lang.Throwable -> L1be
        L1e6:
            boolean r0 = r7.n     // Catch: java.lang.Throwable -> L1be
            if (r0 == 0) goto L1f1
            r7.n = r2     // Catch: java.lang.Throwable -> L1be
            bv1 r0 = r7.e     // Catch: java.lang.Throwable -> L1f1
            r0.c()     // Catch: java.lang.Throwable -> L1f1
        L1f1:
            if (r5 != 0) goto L223
            wp2 r0 = r7.h     // Catch: java.lang.Throwable -> L1be
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> L1be
            if (r0 == 0) goto L1ff
            boolean r3 = defpackage.qs6.v0(r0)     // Catch: java.lang.Throwable -> L1be
            if (r3 == 0) goto L203
        L1ff:
            r3 = 2131952751(0x7f13046f, float:1.9541954E38)
            goto L215
        L203:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1be
            r3.<init>()     // Catch: java.lang.Throwable -> L1be
            java.lang.String r4 = "OCR: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1be
            r3.append(r0)     // Catch: java.lang.Throwable -> L1be
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1be
            goto L21c
        L215:
            java.lang.String r0 = r1.getString(r3)     // Catch: java.lang.Throwable -> L1be
            r0.getClass()     // Catch: java.lang.Throwable -> L1be
        L21c:
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)     // Catch: java.lang.Throwable -> L1be
            r0.show()     // Catch: java.lang.Throwable -> L1be
        L223:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r7.l
            if (r0 == 0) goto L380
        L227:
            r0.setTranslating(r2)
            goto L380
        L22c:
            java.lang.Object r1 = r4.A     // Catch: java.lang.Throwable -> L1be
            r23 = r1
            java.lang.Iterable r23 = (java.lang.Iterable) r23     // Catch: java.lang.Throwable -> L1be
            java.lang.String r24 = " "
            bz1 r1 = new bz1     // Catch: java.lang.Throwable -> L1be
            r6 = 18
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1be
            r28 = 30
            r25 = 0
            r26 = 0
            r27 = r1
            java.lang.String r1 = defpackage.gt0.P0(r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Throwable -> L1be
            java.lang.String r6 = "\\s+"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.Throwable -> L1be
            r6.getClass()     // Catch: java.lang.Throwable -> L1be
            java.lang.String r8 = " "
            java.util.regex.Matcher r1 = r6.matcher(r1)     // Catch: java.lang.Throwable -> L1be
            java.lang.String r1 = r1.replaceAll(r8)     // Catch: java.lang.Throwable -> L1be
            r1.getClass()     // Catch: java.lang.Throwable -> L1be
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)     // Catch: java.lang.Throwable -> L1be
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1be
            if (r5 == 0) goto L282
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L1be
            r6 = 3
            if (r5 < r6) goto L276
            java.lang.String r5 = r7.w     // Catch: java.lang.Throwable -> L1be
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Throwable -> L1be
            if (r5 == 0) goto L282
        L276:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r7.l     // Catch: java.lang.Throwable -> L1be
            if (r0 == 0) goto L27d
            r0.setTranslating(r2)     // Catch: java.lang.Throwable -> L1be
        L27d:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r7.l
            if (r0 == 0) goto L380
            goto L227
        L282:
            r7.w = r1     // Catch: java.lang.Throwable -> L1be
            f13 r28 = defpackage.hq2.a(r7)     // Catch: java.lang.Throwable -> L1be
            java.lang.Object r1 = r4.A     // Catch: java.lang.Throwable -> L1be
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1be
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1be
            java.lang.Class r5 = r28.getClass()     // Catch: java.lang.Throwable -> L1be
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L1be
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1be
            r6.<init>()     // Catch: java.lang.Throwable -> L1be
            java.lang.String r8 = "Translating "
            r6.append(r8)     // Catch: java.lang.Throwable -> L1be
            r6.append(r1)     // Catch: java.lang.Throwable -> L1be
            java.lang.String r1 = " blocks with "
            r6.append(r1)     // Catch: java.lang.Throwable -> L1be
            r6.append(r5)     // Catch: java.lang.Throwable -> L1be
            java.lang.String r1 = " ("
            r6.append(r1)     // Catch: java.lang.Throwable -> L1be
            r6.append(r9)     // Catch: java.lang.Throwable -> L1be
            java.lang.String r1 = " -> "
            r6.append(r1)     // Catch: java.lang.Throwable -> L1be
            r6.append(r12)     // Catch: java.lang.Throwable -> L1be
            java.lang.String r1 = ")"
            r6.append(r1)     // Catch: java.lang.Throwable -> L1be
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L1be
            android.util.Log.i(r13, r1)     // Catch: java.lang.Throwable -> L1be
            ji r23 = new ji     // Catch: java.lang.Throwable -> L1be
            hq2 r1 = r0.h0     // Catch: java.lang.Throwable -> L1be
            r29 = 0
            r30 = 8
            r27 = r1
            r24 = r4
            r25 = r9
            r26 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)     // Catch: java.lang.Throwable -> L1be
            r4 = r23
            r1 = r24
            r0.X = r10     // Catch: java.lang.Throwable -> L1be
            r0.Y = r12     // Catch: java.lang.Throwable -> L1be
            r0.Z = r10     // Catch: java.lang.Throwable -> L1be
            r0.d0 = r1     // Catch: java.lang.Throwable -> L1be
            r0.e0 = r10     // Catch: java.lang.Throwable -> L1be
            r6 = 3
            r0.f0 = r6     // Catch: java.lang.Throwable -> L1be
            r14 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r0 = defpackage.xk2.N(r14, r4, r0)     // Catch: java.lang.Throwable -> L1be
            if (r0 != r3) goto L2f6
        L2f5:
            return r3
        L2f6:
            r0 = r12
        L2f7:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r3 = r7.l     // Catch: java.lang.Throwable -> L1be
            android.content.SharedPreferences r4 = r7.f
            if (r3 == 0) goto L304
            java.lang.Object r5 = r1.A     // Catch: java.lang.Throwable -> L1be
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L1be
            r3.setTranslatedBlocks(r5)     // Catch: java.lang.Throwable -> L1be
        L304:
            java.lang.String r3 = "translator_tts_enabled"
            boolean r3 = r4.getBoolean(r3, r2)     // Catch: java.lang.Throwable -> L1be
            if (r3 != 0) goto L314
            java.lang.String r3 = "translator_local_voice_actor_studio"
            boolean r3 = r4.getBoolean(r3, r2)     // Catch: java.lang.Throwable -> L1be
            if (r3 == 0) goto L331
        L314:
            java.lang.Object r1 = r1.A     // Catch: java.lang.Throwable -> L1be
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch: java.lang.Throwable -> L1be
            java.lang.String r15 = ". "
            bz1 r1 = new bz1     // Catch: java.lang.Throwable -> L1be
            r3 = 19
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1be
            r19 = 30
            r16 = 0
            r17 = 0
            r18 = r1
            java.lang.String r1 = defpackage.gt0.P0(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L1be
            r7.g(r1, r0)     // Catch: java.lang.Throwable -> L1be
        L331:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r7.l
            if (r0 == 0) goto L380
            goto L227
        L337:
            r0 = move-exception
            r7 = r12
            r10 = r17
            r2 = r23
        L33d:
            java.lang.String r1 = "Process captured frame failed"
            android.util.Log.e(r13, r1, r0)     // Catch: java.lang.Throwable -> L357
            java.lang.String r17 = r0.getMessage()     // Catch: java.lang.Throwable -> L357
            if (r17 == 0) goto L359
            boolean r0 = defpackage.qs6.v0(r17)     // Catch: java.lang.Throwable -> L357
            if (r0 != 0) goto L34f
            goto L351
        L34f:
            r17 = r10
        L351:
            if (r17 != 0) goto L354
            goto L359
        L354:
            r0 = r17
            goto L366
        L357:
            r0 = move-exception
            goto L383
        L359:
            android.app.Activity r0 = r7.a     // Catch: java.lang.Throwable -> L357
            r3 = 2131952751(0x7f13046f, float:1.9541954E38)
            java.lang.String r17 = r0.getString(r3)     // Catch: java.lang.Throwable -> L357
            r17.getClass()     // Catch: java.lang.Throwable -> L357
            goto L354
        L366:
            android.app.Activity r1 = r7.a     // Catch: java.lang.Throwable -> L357
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)     // Catch: java.lang.Throwable -> L357
            r0.show()     // Catch: java.lang.Throwable -> L357
            boolean r0 = r7.n     // Catch: java.lang.Throwable -> L357
            if (r0 == 0) goto L37a
            r7.n = r2     // Catch: java.lang.Throwable -> L357
            bv1 r0 = r7.e     // Catch: java.lang.Throwable -> L37a
            r0.c()     // Catch: java.lang.Throwable -> L37a
        L37a:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r7.l
            if (r0 == 0) goto L380
            goto L227
        L380:
            jg7 r0 = defpackage.jg7.a
            return r0
        L383:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r1 = r7.l
            if (r1 == 0) goto L38a
            r1.setTranslating(r2)
        L38a:
            throw r0
    }
}
