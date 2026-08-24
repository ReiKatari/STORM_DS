package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq2  reason: default package */
/* loaded from: classes.dex */
public final class hq2 {
    public final android.app.Activity a;
    public final defpackage.bv1 b;
    public final defpackage.wc0 c;
    public final defpackage.bv1 d;
    public final defpackage.bv1 e;
    public final android.content.SharedPreferences f;
    public final defpackage.xk4 g;
    public final defpackage.wp2 h;
    public final defpackage.ci i;
    public final defpackage.o41 j;
    public final android.os.Handler k;
    public me.magnum.melonds.translator.ui.GameTranslationOverlayView l;
    public defpackage.ap6 m;
    public boolean n;
    public boolean o;
    public final defpackage.qq2 p;
    public defpackage.pu1 q;
    public java.lang.String r;
    public java.lang.String s;
    public java.lang.String t;
    public final java.util.LinkedHashMap u;
    public long v;
    public java.lang.String w;

    public hq2(android.app.Activity r1, defpackage.bv1 r2, defpackage.wc0 r3, defpackage.bv1 r4, defpackage.bv1 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            java.lang.String r2 = defpackage.v15.b(r1)
            r3 = 0
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r3)
            r2.getClass()
            r0.f = r2
            wk4 r2 = new wk4
            r2.<init>()
            r3 = 10
            r2.a(r3)
            r3 = 15
            r2.b(r3)
            xk4 r3 = new xk4
            r3.<init>(r2)
            r0.g = r3
            wp2 r2 = new wp2
            r2.<init>()
            r0.h = r2
            ci r2 = new ci
            r2.<init>(r1)
            r0.i = r2
            xe1 r2 = defpackage.xk1.a
            jv2 r2 = defpackage.e04.a
            gu6 r3 = defpackage.oi2.c()
            r2.getClass()
            l61 r2 = defpackage.jw2.y(r2, r3)
            o41 r2 = defpackage.g04.i(r2)
            r0.j = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r0.k = r2
            qq2 r2 = new qq2
            r2.<init>(r1)
            r0.p = r2
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.u = r1
            java.lang.String r1 = ""
            r0.w = r1
            return
    }

    public static final defpackage.f13 a(defpackage.hq2 r7) {
            xk4 r0 = r7.g
            va7 r1 = defpackage.wa7.Companion
            android.content.SharedPreferences r2 = r7.f
            java.lang.String r3 = "translator_engine"
            java.lang.String r4 = "google"
            java.lang.String r2 = r2.getString(r3, r4)
            r1.getClass()
            wa7 r1 = defpackage.va7.a(r2)
            int[] r2 = defpackage.aq2.a
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 1
            switch(r2) {
                case 1: goto L74;
                case 2: goto L6d;
                case 3: goto L66;
                case 4: goto L60;
                case 5: goto L4d;
                case 6: goto L45;
                case 7: goto L3f;
                case 8: goto L26;
                default: goto L21;
            }
        L21:
            defpackage.i.d()
            r7 = 0
            return r7
        L26:
            eb r2 = new eb
            xp2 r4 = new xp2
            r5 = 8
            r4.<init>(r7, r5)
            xp2 r5 = new xp2
            r6 = 9
            r5.<init>(r7, r6)
            xp2 r6 = new xp2
            r6.<init>(r7, r3)
            r2.<init>(r0, r4, r5, r6)
            goto L7a
        L3f:
            ss2 r2 = new ss2
            r2.<init>(r0, r3)
            goto L7a
        L45:
            bt r2 = new bt
            xk4 r7 = r7.g
            r2.<init>(r7)
            goto L7a
        L4d:
            yc1 r2 = new yc1
            xp2 r3 = new xp2
            r4 = 7
            r3.<init>(r7, r4)
            r0.getClass()
            r2.<init>()
            r2.A = r0
            r2.B = r3
            goto L7a
        L60:
            ap3 r2 = new ap3
            r2.<init>(r0)
            goto L7a
        L66:
            ss2 r2 = new ss2
            r7 = 0
            r2.<init>(r0, r7)
            goto L7a
        L6d:
            ss2 r2 = new ss2
            r7 = 3
            r2.<init>(r0, r7)
            goto L7a
        L74:
            ng0 r2 = new ng0
            r7 = 2
            r2.<init>(r7)
        L7a:
            wa7 r7 = defpackage.wa7.OFFLINE
            if (r1 != r7) goto L7f
            return r2
        L7f:
            ap3 r7 = new ap3
            r7.<init>(r2)
            return r7
    }

    public static final boolean b(defpackage.hq2 r9, android.graphics.Bitmap r10) {
            r9.getClass()
            int r9 = r10.getWidth()
            r0 = 4
            r1 = 1
            if (r9 < r0) goto L4d
            int r9 = r10.getHeight()
            if (r9 >= r0) goto L12
            goto L4d
        L12:
            int r9 = r10.getWidth()
            r0 = 12
            int r9 = r9 / r0
            if (r9 >= r1) goto L1c
            r9 = r1
        L1c:
            int r2 = r10.getHeight()
            int r2 = r2 / r0
            if (r2 >= r1) goto L24
            r2 = r1
        L24:
            r3 = r1
        L25:
            if (r3 >= r0) goto L4d
            r4 = r1
        L28:
            if (r4 >= r0) goto L4a
            int r5 = r4 * r9
            int r6 = r3 * r2
            int r5 = r10.getPixel(r5, r6)
            int r6 = r5 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r5 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r8 = 10
            if (r6 > r8) goto L48
            if (r7 > r8) goto L48
            if (r5 <= r8) goto L45
            goto L48
        L45:
            int r4 = r4 + 1
            goto L28
        L48:
            r9 = 0
            return r9
        L4a:
            int r3 = r3 + 1
            goto L25
        L4d:
            return r1
    }

    public static void f(defpackage.hq2 r9, android.graphics.Bitmap r10, boolean r11, boolean r12, java.util.List r13, int r14) {
            r0 = r14 & 2
            r1 = 0
            if (r0 == 0) goto L7
            r7 = r1
            goto L8
        L7:
            r7 = r11
        L8:
            r11 = r14 & 4
            if (r11 == 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r12
        Lf:
            r11 = r14 & 8
            r12 = 0
            if (r11 == 0) goto L16
            r6 = r12
            goto L17
        L16:
            r6 = r13
        L17:
            o41 r11 = r9.j
            fq2 r2 = new fq2
            r8 = 0
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9 = 3
            defpackage.hv.L(r11, r12, r12, r2, r9)
            return
    }

    public final void c() {
            r2 = this;
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r2.l
            if (r0 == 0) goto L7
            r0.a()
        L7:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r2.l
            r1 = 0
            if (r0 == 0) goto Lf
            r0.setTranslating(r1)
        Lf:
            boolean r0 = r2.n
            if (r0 == 0) goto L1a
            r2.n = r1
            bv1 r2 = r2.e     // Catch: java.lang.Throwable -> L1a
            r2.c()     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    public final java.lang.String d() {
            r4 = this;
            java.lang.String r0 = r4.s
            java.lang.String r1 = "global"
            r2 = 0
            if (r0 == 0) goto L11
            boolean r3 = defpackage.qs6.v0(r0)
            if (r3 != 0) goto Le
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != 0) goto L2f
        L11:
            java.lang.String r0 = r4.t
            if (r0 == 0) goto L1c
            boolean r3 = defpackage.qs6.v0(r0)
            if (r3 != 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 != 0) goto L2f
            java.lang.String r4 = r4.r
            if (r4 == 0) goto L2a
            boolean r0 = defpackage.qs6.v0(r4)
            if (r0 != 0) goto L2a
            r2 = r4
        L2a:
            if (r2 != 0) goto L2e
            r0 = r1
            goto L2f
        L2e:
            r0 = r2
        L2f:
            java.lang.String r4 = "[^a-zA-Z0-9_]"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            r4.getClass()
            java.lang.String r2 = "_"
            java.util.regex.Matcher r4 = r4.matcher(r0)
            java.lang.String r4 = r4.replaceAll(r2)
            r4.getClass()
            r0 = 32
            java.lang.String r4 = defpackage.qs6.S0(r0, r4)
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L54
            java.lang.String r4 = "translator_saved_regions"
            return r4
        L54:
            java.lang.String r0 = "translator_saved_regions_"
            java.lang.String r4 = r0.concat(r4)
            return r4
    }

    public final java.util.List e() {
            r6 = this;
            java.lang.String r0 = r6.d()
            android.content.SharedPreferences r1 = r6.f
            r2 = 0
            java.lang.String r3 = r1.getString(r0, r2)
            if (r3 == 0) goto L13
            boolean r4 = defpackage.qs6.v0(r3)
            if (r4 == 0) goto L1f
        L13:
            java.lang.String r4 = "translator_saved_regions"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L1f
            java.lang.String r3 = r1.getString(r4, r2)
        L1f:
            yt1 r0 = defpackage.yt1.A
            if (r3 == 0) goto L5e
            boolean r1 = defpackage.qs6.v0(r3)
            if (r1 == 0) goto L2a
            goto L5e
        L2a:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L4c
            r4 = 0
        L39:
            if (r4 >= r3) goto L56
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L42
            goto L4e
        L42:
            ua7 r5 = defpackage.gi2.C(r5)     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L4e
            r2.add(r5)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r1 = move-exception
            goto L51
        L4e:
            int r4 = r4 + 1
            goto L39
        L51:
            em5 r2 = new em5
            r2.<init>(r1)
        L56:
            boolean r1 = r2 instanceof defpackage.em5
            if (r1 == 0) goto L5b
            goto L5c
        L5b:
            r0 = r2
        L5c:
            java.util.List r0 = (java.util.List) r0
        L5e:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r6 = r6.l
            if (r6 == 0) goto L65
            r6.setSavedRegions(r0)
        L65:
            return r0
    }

    public final void g(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            android.content.SharedPreferences r0 = r3.f
            java.lang.String r1 = "translator_tts_enabled"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L1b
            java.lang.String r1 = "translator_local_voice_actor_studio"
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            qq2 r3 = r3.p
            r3.d(r4, r5)
            return
    }

    public final void h() {
            r4 = this;
            lb7 r0 = defpackage.mb7.Companion
            java.lang.String r1 = "translator_trigger_mode"
            java.lang.String r2 = "on_demand"
            android.content.SharedPreferences r3 = r4.f
            java.lang.String r1 = r3.getString(r1, r2)
            r0.getClass()
            mb7 r0 = defpackage.lb7.a(r1)
            mb7 r1 = defpackage.mb7.AUTO_SCREEN_CHANGE
            ap6 r2 = r4.m
            r3 = 0
            if (r0 != r1) goto L30
            if (r2 == 0) goto L1f
            r2.h(r3)
        L1f:
            xd1 r0 = new xd1
            r1 = 19
            r0.<init>(r4, r3, r1)
            r1 = 3
            o41 r2 = r4.j
            ap6 r0 = defpackage.hv.L(r2, r3, r3, r0, r1)
            r4.m = r0
            return
        L30:
            if (r2 == 0) goto L35
            r2.h(r3)
        L35:
            r4.m = r3
            return
    }

    public final void i() {
            r6 = this;
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r6.l
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "translator_enabled"
            android.content.SharedPreferences r2 = r6.f
            r3 = 0
            boolean r1 = r2.getBoolean(r1, r3)
            if (r1 == 0) goto L12
            r4 = r3
            goto L14
        L12:
            r4 = 8
        L14:
            r0.setVisibility(r4)
            if (r1 == 0) goto L23
            java.lang.String r4 = "translator_show_floating_button"
            r5 = 1
            boolean r4 = r2.getBoolean(r4, r5)
            if (r4 == 0) goto L23
            r3 = r5
        L23:
            r0.setShowFloatingButton(r3)
            xa7 r3 = defpackage.ya7.Companion
            java.lang.String r4 = "translator_overlay_style"
            java.lang.String r5 = "smart_background_match"
            java.lang.String r4 = r2.getString(r4, r5)
            r3.getClass()
            ya7 r3 = defpackage.xa7.a(r4)
            r0.setOverlayStyle(r3)
            java.lang.String r3 = "translator_bubble_opacity"
            r4 = 90
            int r3 = r2.getInt(r3, r4)
            float r3 = (float) r3
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r4
            r0.setBubbleOpacity(r3)
            java.lang.String r3 = "translator_font_size_scale"
            r5 = 100
            int r2 = r2.getInt(r3, r5)
            float r2 = (float) r2
            float r2 = r2 / r4
            r0.setFontSizeScale(r2)
            java.util.List r2 = r6.e()
            r0.setSavedRegions(r2)
            if (r1 == 0) goto L63
            r6.h()
            return
        L63:
            ap6 r1 = r6.m
            r2 = 0
            if (r1 == 0) goto L6b
            r1.h(r2)
        L6b:
            r6.m = r2
            r0.a()
            return
    }

    public final void j(boolean r5) {
            r4 = this;
            android.content.SharedPreferences r0 = r4.f
            java.lang.String r1 = "translator_enabled"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L18
            android.app.Activity r4 = r4.a
            r5 = 2131952737(0x7f130461, float:1.9541925E38)
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r2)
            r4.show()
            return
        L18:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r4.l
            if (r0 == 0) goto L29
            java.util.ArrayList r1 = r0.B
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L32
            jp2 r0 = r0.B0
            if (r0 == 0) goto L29
            goto L32
        L29:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r4.l
            r1 = 1
            if (r0 == 0) goto L36
            boolean r0 = r0.f0
            if (r0 != r1) goto L36
        L32:
            r4.c()
            return
        L36:
            ci r0 = r4.i
            boolean r0 = r0.B
            if (r0 != 0) goto L86
            boolean r0 = me.magnum.melonds.translator.capture.ScreenCaptureService.A
            boolean r0 = me.magnum.melonds.translator.capture.ScreenCaptureService.A
            if (r0 == 0) goto L43
            goto L86
        L43:
            r4.o = r1
            ci r5 = r4.i     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = r5.R     // Catch: java.lang.Throwable -> L6f
            android.media.projection.MediaProjectionManager r5 = (android.media.projection.MediaProjectionManager) r5     // Catch: java.lang.Throwable -> L6f
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6f
            r1 = 34
            if (r0 < r1) goto L60
            android.media.projection.MediaProjectionConfig r0 = defpackage.rv2.h()     // Catch: java.lang.Throwable -> L6f
            r0.getClass()     // Catch: java.lang.Throwable -> L6f
            android.content.Intent r5 = defpackage.rv2.f(r5, r0)     // Catch: java.lang.Throwable -> L6f
            r5.getClass()     // Catch: java.lang.Throwable -> L6f
            goto L67
        L60:
            android.content.Intent r5 = r5.createScreenCaptureIntent()     // Catch: java.lang.Throwable -> L6f
            r5.getClass()     // Catch: java.lang.Throwable -> L6f
        L67:
            pu1 r0 = r4.q     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r0.g(r5)     // Catch: java.lang.Throwable -> L6f
            return
        L6f:
            r5 = move-exception
            goto L72
        L71:
            return
        L72:
            java.lang.String r0 = "GameTranslatorManager"
            java.lang.String r1 = "Failed to launch MediaProjection permission request"
            android.util.Log.e(r0, r1, r5)
            android.app.Activity r4 = r4.a
            r5 = 2131952730(0x7f13045a, float:1.954191E38)
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r2)
            r4.show()
            return
        L86:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r4.l
            if (r0 == 0) goto L8d
            r0.setTranslating(r1)
        L8d:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r4.l
            if (r0 == 0) goto L95
            boolean r1 = r0.getShowFloatingButton()
        L95:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r4.l
            if (r0 == 0) goto L9c
            r0.setShowFloatingButton(r2)
        L9c:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r0 = r4.l
            if (r0 == 0) goto La3
            r0.invalidate()
        La3:
            o41 r0 = r4.j
            gq2 r2 = new gq2
            r3 = 0
            r2.<init>(r4, r1, r5, r3)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r2, r4)
            return
    }
}
