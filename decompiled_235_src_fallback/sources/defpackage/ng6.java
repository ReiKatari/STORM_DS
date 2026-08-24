package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng6  reason: default package */
/* loaded from: classes.dex */
public final class ng6 implements defpackage.kd6, android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    public static final defpackage.po5 l = null;
    public final android.content.Context a;
    public final android.content.SharedPreferences b;
    public final defpackage.id3 c;
    public final defpackage.uh7 d;
    public final defpackage.jd6 e;
    public final defpackage.cp5 f;
    public final defpackage.ex6 g;
    public final java.util.LinkedHashMap h;
    public final defpackage.be5 i;
    public volatile java.lang.String j;
    public volatile java.lang.String k;

    static {
            po5 r0 = new po5
            hp5 r2 = defpackage.hp5.VULKAN_IR
            zt1 r6 = defpackage.zt1.A
            r7 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r6, r7)
            defpackage.ng6.l = r0
            return
    }

    public ng6(android.content.Context r17, android.content.SharedPreferences r18, defpackage.jd1 r19, defpackage.id3 r20, defpackage.uh7 r21, defpackage.o41 r22, defpackage.jd6 r23, defpackage.cp5 r24) {
            r16 = this;
            r0 = r16
            r1 = r18
            r0.<init>()
            r2 = r17
            r0.a = r2
            r0.b = r1
            r2 = r20
            r0.c = r2
            r2 = r21
            r0.d = r2
            r2 = r23
            r0.e = r2
            r2 = r24
            r0.f = r2
            tf6 r2 = new tf6
            r3 = 0
            r2.<init>(r0, r3)
            ex6 r4 = new ex6
            r4.<init>(r2)
            r0.g = r4
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.h = r2
            r1.registerOnSharedPreferenceChangeListener(r0)
            java.lang.String r2 = "theme"
            r4 = 0
            java.lang.String r5 = r1.getString(r2, r4)
            if (r5 == 0) goto L3e
            goto L4a
        L3e:
            android.content.SharedPreferences$Editor r5 = r1.edit()
            java.lang.String r6 = "dark"
            r5.putString(r2, r6)
            r5.apply()
        L4a:
            java.lang.String r2 = "internal_mac_address"
            java.lang.String r5 = r1.getString(r2, r4)
            if (r5 == 0) goto L53
            goto L67
        L53:
            java.util.List r5 = defpackage.zz3.b
            zz3 r5 = defpackage.kn2.W(r4)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r5 = r5.toString()
            r1.putString(r2, r5)
            r1.apply()
        L67:
            tf6 r1 = new tf6
            r2 = 16
            r1.<init>(r0, r2)
            java.lang.String r5 = "video_renderer"
            wp0 r1 = r0.p(r5, r1)
            tf6 r5 = new tf6
            r6 = 2
            r5.<init>(r0, r6)
            java.lang.String r7 = "video_filtering"
            wp0 r5 = r0.p(r7, r5)
            tf6 r7 = new tf6
            r8 = 10
            r7.<init>(r0, r8)
            java.lang.String r8 = "enable_threaded_rendering"
            wp0 r7 = r0.p(r8, r7)
            tf6 r8 = new tf6
            r9 = 3
            r8.<init>(r0, r9)
            java.lang.String r10 = "video_internal_resolution"
            wp0 r8 = r0.p(r10, r8)
            tf6 r10 = new tf6
            r11 = 18
            r10.<init>(r0, r11)
            java.lang.String r11 = "video_vulkan_fastpath_enabled"
            wp0 r10 = r0.p(r11, r10)
            dg6 r11 = new dg6
            r11.<init>(r4)
            r12 = 5
            le2[] r13 = new defpackage.le2[r12]
            r13[r3] = r1
            r1 = 1
            r13[r1] = r5
            r13[r6] = r7
            r13[r9] = r8
            r5 = 4
            r13[r5] = r10
            wp0 r7 = new wp0
            r8 = 6
            r7.<init>(r8, r13, r11)
            wp0 r10 = r0.C()
            eg6 r11 = new eg6
            r11.<init>(r9, r4, r3)
            xf2 r13 = new xf2
            r13.<init>(r7, r10, r11)
            tf6 r7 = new tf6
            r10 = 7
            r7.<init>(r0, r10)
            java.lang.String r10 = "video_renderer_debug_bgobj_enabled"
            wp0 r7 = r0.p(r10, r7)
            eg6 r10 = new eg6
            r10.<init>(r9, r4, r1)
            xf2 r11 = new xf2
            r11.<init>(r13, r7, r10)
            tf6 r7 = new tf6
            r7.<init>(r0, r8)
            java.lang.String r10 = "video_renderer_debug_latch_trace_enabled"
            wp0 r7 = r0.p(r10, r7)
            eg6 r10 = new eg6
            r10.<init>(r9, r4, r6)
            xf2 r13 = new xf2
            r13.<init>(r11, r7, r10)
            tf6 r7 = new tf6
            r10 = 13
            r7.<init>(r0, r10)
            java.lang.String r10 = "video_conservative_coverage_enabled"
            wp0 r7 = r0.p(r10, r7)
            vf6 r10 = new vf6
            r10.<init>(r0, r2)
            java.lang.String r2 = "video_conservative_coverage_px"
            wp0 r2 = r0.p(r2, r10)
            tf6 r10 = new tf6
            r11 = 15
            r10.<init>(r0, r11)
            java.lang.String r11 = "video_conservative_coverage_depth_bias"
            wp0 r10 = r0.p(r11, r10)
            tf6 r11 = new tf6
            r11.<init>(r0, r12)
            java.lang.String r14 = "video_conservative_coverage_apply_repeat"
            wp0 r11 = r0.p(r14, r11)
            tf6 r14 = new tf6
            r14.<init>(r0, r1)
            java.lang.String r15 = "video_conservative_coverage_apply_clamp"
            wp0 r14 = r0.p(r15, r14)
            fg6 r15 = new fg6
            r15.<init>(r4)
            r17 = r3
            le2[] r3 = new defpackage.le2[r12]
            r3[r17] = r7
            r3[r1] = r2
            r3[r6] = r10
            r3[r9] = r11
            r3[r5] = r14
            wp0 r2 = new wp0
            r2.<init>(r8, r3, r15)
            tf6 r3 = new tf6
            r3.<init>(r0, r5)
            java.lang.String r7 = "video_debug_3d_clear_magenta"
            wp0 r3 = r0.p(r7, r3)
            et r7 = new et
            r7.<init>(r9, r4, r9)
            xf2 r8 = new xf2
            r8.<init>(r2, r3, r7)
            m02 r2 = new m02
            r2.<init>(r9, r4, r5)
            xf2 r3 = new xf2
            r3.<init>(r13, r8, r2)
            wp0 r2 = r0.G()
            wp0 r7 = r0.F()
            tf6 r8 = new tf6
            r10 = 9
            r8.<init>(r0, r10)
            java.lang.String r10 = "video_retroarch_shader_parameters"
            wp0 r8 = r0.p(r10, r8)
            vf6 r10 = new vf6
            r11 = 14
            r10.<init>(r0, r11)
            java.lang.String r11 = "video_retroarch_shader_clear_history"
            wp0 r10 = r0.p(r11, r10)
            kg6 r11 = new kg6
            r11.<init>(r0, r4)
            le2[] r5 = new defpackage.le2[r5]
            r5[r17] = r2
            r5[r1] = r7
            r5[r6] = r8
            r5[r9] = r10
            wp0 r2 = new wp0
            r2.<init>(r12, r5, r11)
            m02 r5 = new m02
            r5.<init>(r9, r4, r9)
            xf2 r4 = new xf2
            r4.<init>(r3, r2, r5)
            r2 = -1
            le2 r2 = defpackage.f04.o(r4, r2)
            x31 r3 = defpackage.dh6.b
            r4 = r22
            be5 r1 = defpackage.f04.P(r2, r4, r3, r1)
            r0.i = r1
            return
    }

    public static java.util.Map H(java.lang.String r4) {
            zt1 r0 = defpackage.zt1.A
            if (r4 == 0) goto L70
            boolean r1 = defpackage.qs6.v0(r4)
            if (r1 == 0) goto Lb
            goto L70
        Lb:
            ev r1 = new ev
            r2 = 4
            r1.<init>(r4, r2)
            r76 r4 = new r76
            r2 = 8
            r4.<init>(r2)
            qd2 r2 = new qd2
            tb6 r3 = defpackage.tb6.d0
            r2.<init>(r1, r4)
            r76 r4 = new r76
            r1 = 9
            r4.<init>(r1)
            pc2 r4 = defpackage.sb6.b0(r2, r4)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            oc2 r2 = new oc2
            r2.<init>(r4)
        L34:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r2.next()
            vr4 r4 = (defpackage.vr4) r4
            java.lang.Object r3 = r4.A
            java.lang.Object r4 = r4.B
            r1.put(r3, r4)
            goto L34
        L48:
            int r4 = r1.size()
            if (r4 == 0) goto L70
            r0 = 1
            if (r4 == r0) goto L52
            return r1
        L52:
            java.util.Set r4 = r1.entrySet()
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            java.util.Map r4 = java.util.Collections.singletonMap(r0, r4)
            r4.getClass()
            return r4
        L70:
            return r0
    }

    public static android.net.Uri I(android.net.Uri r3, defpackage.zl1 r4, java.lang.String r5, java.io.File r6) {
            if (r3 == 0) goto L37
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L14
            java.lang.String r0 = r3.getScheme()
            if (r0 != 0) goto L37
        L14:
            java.lang.String r0 = r3.getPath()
            if (r0 != 0) goto L27
            java.lang.String r3 = r3.toString()
            r3.getClass()
            java.lang.String r0 = "file://"
            java.lang.String r0 = defpackage.qs6.D0(r3, r0)
        L27:
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r5)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L37
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            return r3
        L37:
            r3 = 0
            if (r4 != 0) goto L3c
            r4 = r3
            goto L69
        L3c:
            zl1 r4 = r4.f(r5)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L49
            android.net.Uri r4 = r4.j()     // Catch: java.lang.Throwable -> L47
            goto L51
        L47:
            r4 = move-exception
            goto L4b
        L49:
            r4 = r3
            goto L51
        L4b:
            em5 r0 = new em5
            r0.<init>(r4)
            r4 = r0
        L51:
            java.lang.Throwable r0 = defpackage.hm5.a(r4)
            if (r0 == 0) goto L62
            java.lang.String r1 = "Could not access restored file "
            java.lang.String r1 = r1.concat(r5)
            java.lang.String r2 = "SPSettingsRepository"
            android.util.Log.w(r2, r1, r0)
        L62:
            boolean r0 = r4 instanceof defpackage.em5
            if (r0 == 0) goto L67
            r4 = r3
        L67:
            android.net.Uri r4 = (android.net.Uri) r4
        L69:
            if (r4 == 0) goto L6c
            return r4
        L6c:
            java.io.File r4 = new java.io.File
            r4.<init>(r6, r5)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L7b
            android.net.Uri r3 = android.net.Uri.fromFile(r4)
        L7b:
            return r3
    }

    public static java.lang.String K(java.util.ArrayList r7) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r7.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L39
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            zq7 r3 = (defpackage.zq7) r3
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "id"
            java.lang.String r6 = r3.a
            r4.put(r5, r6)
            java.lang.String r5 = "displayName"
            java.lang.String r6 = r3.b
            r4.put(r5, r6)
            java.lang.String r5 = "driverDir"
            java.lang.String r6 = r3.c
            r4.put(r5, r6)
            java.lang.String r5 = "driverName"
            java.lang.String r3 = r3.d
            r4.put(r5, r3)
            r0.put(r4)
            goto La
        L39:
            java.lang.String r7 = r0.toString()
            r7.getClass()
            return r7
    }

    public static defpackage.po5 a(java.io.File r25, java.lang.String r26, java.util.Map r27, boolean r28) {
            r0 = r25
            r1 = r26
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r3 = r2.exists()
            java.lang.String r4 = "SPSettingsRepository"
            if (r3 == 0) goto L363
            boolean r3 = r2.isFile()
            if (r3 != 0) goto L19
            goto L363
        L19:
            uf6 r3 = new uf6
            r5 = 0
            r3.<init>(r0, r5)
            xh5 r6 = defpackage.fp5.a
            java.lang.String r6 = defpackage.jc2.B0(r2)
            java.util.LinkedHashMap r6 = defpackage.fp5.b(r6)
            ep5 r7 = defpackage.fp5.g(r1, r3)
            int r8 = r7.a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            if (r8 <= 0) goto L36
            goto L37
        L36:
            r9 = 0
        L37:
            if (r9 == 0) goto L3f
            int r9 = r9.intValue()
        L3d:
            r14 = r9
            goto L44
        L3f:
            int r9 = defpackage.fp5.c(r6)
            goto L3d
        L44:
            java.lang.Object r9 = r3.g(r1)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L51
            r9 = r5
            r16 = 0
            goto L255
        L51:
            java.util.LinkedHashMap r9 = defpackage.fp5.b(r9)
            pu r12 = new pu
            r12.<init>()
            java.util.ArrayList r13 = defpackage.fp5.e(r9)
            int r15 = r13.size()
            r10 = r5
            r16 = 0
        L65:
            if (r10 >= r15) goto L7b
            java.lang.Object r17 = r13.get(r10)
            int r10 = r10 + 1
            r11 = r17
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = defpackage.fp5.d(r1, r11)
            if (r11 == 0) goto L65
            r12.addLast(r11)
            goto L65
        L7b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
        L85:
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto Lc5
            java.lang.Object r13 = r12.removeFirst()
            java.lang.String r13 = (java.lang.String) r13
            boolean r15 = r11.add(r13)
            if (r15 != 0) goto L98
            goto L85
        L98:
            java.lang.Object r15 = r3.g(r13)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto La1
            goto L85
        La1:
            r10.add(r15)
            java.util.List r15 = defpackage.fp5.a(r15)
            java.util.Iterator r15 = r15.iterator()
        Lac:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L85
            java.lang.Object r17 = r15.next()
            r5 = r17
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = defpackage.fp5.d(r13, r5)
            if (r5 == 0) goto Lc3
            r12.addLast(r5)
        Lc3:
            r5 = 0
            goto Lac
        Lc5:
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto Lce
        Lcb:
            r9 = 0
            goto L255
        Lce:
            r23 = 0
            r24 = 62
            java.lang.String r20 = "\n"
            r21 = 0
            r22 = 0
            r19 = r10
            java.lang.String r3 = defpackage.gt0.P0(r19, r20, r21, r22, r23, r24)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r5)
            r3.getClass()
            java.lang.String r5 = "sourcesize"
            r10 = 0
            boolean r5 = defpackage.qs6.j0(r3, r5, r10)
            if (r5 != 0) goto L101
            java.lang.String r5 = "originalsize"
            boolean r5 = defpackage.qs6.j0(r3, r5, r10)
            if (r5 != 0) goto L101
            java.lang.String r5 = "outputsize"
            boolean r5 = defpackage.qs6.j0(r3, r5, r10)
            if (r5 != 0) goto L101
            goto Lcb
        L101:
            int r5 = defpackage.fp5.c(r9)
            r10 = 0
        L106:
            if (r10 >= r5) goto L188
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "scale_type"
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.Object r11 = r9.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L128
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toLowerCase(r12)
            r11.getClass()
            goto L12a
        L128:
            r11 = r16
        L12a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "scale_type_x"
            r12.<init>(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = r9.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L14a
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r12 = r12.toLowerCase(r13)
            r12.getClass()
            goto L14c
        L14a:
            r12 = r16
        L14c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "scale_type_y"
            r13.<init>(r15)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r9.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L16c
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toLowerCase(r15)
            r13.getClass()
            goto L16e
        L16c:
            r13 = r16
        L16e:
            java.lang.String r15 = "viewport"
            boolean r11 = defpackage.nb3.k(r11, r15)
            if (r11 != 0) goto L186
            boolean r11 = defpackage.nb3.k(r12, r15)
            if (r11 != 0) goto L186
            boolean r11 = defpackage.nb3.k(r13, r15)
            if (r11 == 0) goto L183
            goto L186
        L183:
            int r10 = r10 + 1
            goto L106
        L186:
            r10 = 1
            goto L189
        L188:
            r10 = 0
        L189:
            java.lang.String r5 = "texelfetch"
            r9 = 0
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "texelfetchoffset"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "subpix"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "retro_pixel"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "pixel_size"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "pixel size"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "lcd gamma"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "lcd grid"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "scanline"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "scanlines"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "pixel_borders"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "tx_to_px"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 != 0) goto L1f5
            java.lang.String r5 = "subpx_coverage"
            boolean r5 = defpackage.qs6.j0(r3, r5, r9)
            if (r5 == 0) goto L1f3
            goto L1f5
        L1f3:
            r5 = r9
            goto L1f6
        L1f5:
            r5 = 1
        L1f6:
            xh5 r11 = defpackage.fp5.d
            java.util.regex.Pattern r11 = r11.A
            java.util.regex.Matcher r11 = r11.matcher(r3)
            boolean r11 = r11.find()
            if (r11 != 0) goto L223
            xh5 r11 = defpackage.fp5.e
            java.util.regex.Pattern r11 = r11.A
            java.util.regex.Matcher r11 = r11.matcher(r3)
            boolean r11 = r11.find()
            if (r11 != 0) goto L223
            xh5 r11 = defpackage.fp5.f
            java.util.regex.Pattern r11 = r11.A
            java.util.regex.Matcher r11 = r11.matcher(r3)
            boolean r11 = r11.find()
            if (r11 == 0) goto L221
            goto L223
        L221:
            r11 = r9
            goto L224
        L223:
            r11 = 1
        L224:
            xh5 r12 = defpackage.fp5.g
            java.util.regex.Pattern r12 = r12.A
            java.util.regex.Matcher r12 = r12.matcher(r3)
            boolean r12 = r12.find()
            if (r12 != 0) goto L243
            xh5 r12 = defpackage.fp5.h
            java.util.regex.Pattern r12 = r12.A
            java.util.regex.Matcher r3 = r12.matcher(r3)
            boolean r3 = r3.find()
            if (r3 == 0) goto L241
            goto L243
        L241:
            r3 = r9
            goto L244
        L243:
            r3 = 1
        L244:
            if (r10 == 0) goto L24d
            if (r5 != 0) goto L251
            if (r11 != 0) goto L251
            if (r3 == 0) goto L255
            goto L251
        L24d:
            if (r5 == 0) goto L255
            if (r11 == 0) goto L255
        L251:
            hp5 r3 = defpackage.hp5.NATIVE
        L253:
            r13 = r3
            goto L258
        L255:
            hp5 r3 = defpackage.hp5.VULKAN_IR
            goto L253
        L258:
            java.util.ArrayList r3 = defpackage.fp5.e(r6)
            java.util.List r5 = defpackage.fp5.f(r6)
            java.lang.String r6 = r13.name()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r10)
            r6.getClass()
            int r3 = r3.size()
            int r10 = r5.size()
            long r11 = r7.b
            r19 = 15
            long r19 = r19 * r11
            r21 = 100
            long r19 = r19 / r21
            r15 = r10
            long r9 = (long) r8
            r21 = 40
            long r9 = r9 * r21
            long r9 = r9 + r19
            r19 = 2
            long r9 = r9 * r19
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r17 = r2
            java.lang.String r2 = "RetroArchShaderImport: preset="
            r8.<init>(r2)
            r8.append(r1)
            java.lang.String r2 = " passes="
            r8.append(r2)
            r8.append(r14)
            java.lang.String r2 = " source="
            r8.append(r2)
            r8.append(r6)
            java.lang.String r2 = " shaders="
            r8.append(r2)
            r8.append(r3)
            java.lang.String r2 = " textures="
            r8.append(r2)
            r8.append(r15)
            java.lang.String r2 = " sourceBytes="
            r8.append(r2)
            r8.append(r11)
            java.lang.String r2 = " estimatedCompileMs="
            r8.append(r2)
            r8.append(r9)
            java.lang.String r2 = r8.toString()
            android.util.Log.i(r4, r2)
            java.util.Iterator r2 = r5.iterator()
            r10 = 0
        L2d3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L352
            java.lang.Object r3 = r2.next()
            int r5 = r10 + 1
            if (r10 < 0) goto L34e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = defpackage.fp5.d(r1, r3)
            if (r6 == 0) goto L2ef
            java.io.File r8 = new java.io.File
            r8.<init>(r0, r6)
            goto L2f1
        L2ef:
            r8 = r16
        L2f1:
            if (r6 != 0) goto L2f5
            java.lang.String r6 = "<unsupported>"
        L2f5:
            if (r8 == 0) goto L302
            boolean r9 = r8.isFile()
            r11 = 1
            if (r9 != r11) goto L300
            r9 = r11
            goto L304
        L300:
            r9 = 0
            goto L304
        L302:
            r11 = 1
            goto L300
        L304:
            if (r8 == 0) goto L318
            boolean r12 = r8.isFile()
            if (r12 == 0) goto L30d
            goto L30f
        L30d:
            r8 = r16
        L30f:
            if (r8 == 0) goto L318
            long r18 = r8.length()
        L315:
            r11 = r18
            goto L31b
        L318:
            r18 = 0
            goto L315
        L31b:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r8 = "RetroArchShaderImport: texture["
            r15.<init>(r8)
            r15.append(r10)
            java.lang.String r8 = "] ref="
            r15.append(r8)
            r15.append(r3)
            java.lang.String r3 = " resolved="
            r15.append(r3)
            r15.append(r6)
            java.lang.String r3 = " exists="
            r15.append(r3)
            r15.append(r9)
            java.lang.String r3 = " bytes="
            r15.append(r3)
            r15.append(r11)
            java.lang.String r3 = r15.toString()
            android.util.Log.i(r4, r3)
            r10 = r5
            goto L2d3
        L34e:
            defpackage.hf.q0()
            throw r16
        L352:
            po5 r11 = new po5
            java.lang.String r12 = r17.getAbsolutePath()
            long r0 = r7.b
            r17 = r27
            r18 = r28
            r15 = r0
            r11.<init>(r12, r13, r14, r15, r17, r18)
            return r11
        L363:
            java.lang.String r0 = "RetroArch shader preset not available in import cache: "
            java.lang.String r0 = r0.concat(r1)
            android.util.Log.w(r4, r0)
            po5 r0 = defpackage.ng6.l
            return r0
    }

    public static java.lang.String d(java.io.File r7, java.io.File r8) {
            java.io.File r8 = r8.getCanonicalFile()
            xh5 r0 = defpackage.fp5.a
            java.lang.String r0 = defpackage.jc2.B0(r7)
            java.util.LinkedHashMap r0 = defpackage.fp5.b(r0)
            java.util.ArrayList r1 = defpackage.fp5.e(r0)
            java.util.List r0 = defpackage.fp5.f(r0)
            java.util.ArrayList r0 = defpackage.gt0.V0(r1, r0)
            int r1 = r0.size()
            r2 = 0
        L1f:
            if (r2 >= r1) goto L68
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            r5 = 92
            r6 = 47
            java.lang.String r4 = defpackage.xs6.d0(r4, r5, r6)
            java.lang.CharSequence r4 = defpackage.qs6.T0(r4)
            java.lang.String r4 = r4.toString()
            boolean r5 = defpackage.qs6.v0(r4)
            if (r5 != 0) goto L1f
            boolean r5 = defpackage.qs6.L0(r4, r6)
            if (r5 == 0) goto L47
            goto L1f
        L47:
            java.io.File r5 = new java.io.File
            java.io.File r6 = r7.getParentFile()
            r5.<init>(r6, r4)
            java.io.File r4 = r5.getCanonicalFile()
            r4.getClass()
            r8.getClass()
        L5a:
            if (r4 == 0) goto L69
            boolean r5 = r4.equals(r8)
            if (r5 == 0) goto L63
            goto L1f
        L63:
            java.io.File r4 = r4.getParentFile()
            goto L5a
        L68:
            r3 = 0
        L69:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public final defpackage.sr7 A() {
            r6 = this;
            sr7 r0 = defpackage.sr7.SYSTEM
            java.lang.String r1 = r0.name()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r2 = "video_vulkan_driver_mode"
            java.lang.String r6 = r6.getString(r2, r1)
            if (r6 != 0) goto L1a
            goto L45
        L1a:
            sr7[] r1 = defpackage.sr7.values()     // Catch: java.lang.Throwable -> L23
            java.lang.Enum r1 = defpackage.jw2.o(r6, r1)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L2a:
            java.lang.Throwable r2 = defpackage.hm5.a(r1)
            if (r2 == 0) goto L3d
            java.lang.String r2 = r0.name()
            java.lang.String r3 = "Invalid enum preference video_vulkan_driver_mode="
            java.lang.String r4 = "; using "
            java.lang.String r5 = "SPSettingsRepository"
            defpackage.lb1.w(r3, r6, r4, r2, r5)
        L3d:
            boolean r6 = r1 instanceof defpackage.em5
            if (r6 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            java.lang.Enum r0 = (java.lang.Enum) r0
        L45:
            sr7 r0 = (defpackage.sr7) r0
            return r0
    }

    public final defpackage.po5 B(defpackage.bg6 r11, java.lang.String r12, java.util.Map r13, boolean r14) {
            r10 = this;
            r0 = 0
            if (r12 == 0) goto L7d
            java.lang.CharSequence r12 = defpackage.qs6.T0(r12)
            java.lang.String r12 = r12.toString()
            if (r12 == 0) goto L7d
            r1 = 92
            r2 = 47
            java.lang.String r12 = r12.replace(r1, r2)
            r12.getClass()
            r1 = 1
            char[] r3 = new char[r1]
            r4 = 0
            r3[r4] = r2
            int r5 = r12.length()
            r6 = r4
        L23:
            if (r6 >= r5) goto L43
            char r7 = r12.charAt(r6)
            r8 = r4
        L2a:
            if (r8 >= r1) goto L34
            char r9 = r3[r8]
            if (r7 != r9) goto L31
            goto L35
        L31:
            int r8 = r8 + 1
            goto L2a
        L34:
            r8 = -1
        L35:
            if (r8 < 0) goto L3a
            int r6 = r6 + 1
            goto L23
        L3a:
            int r3 = r12.length()
            java.lang.CharSequence r12 = r12.subSequence(r6, r3)
            goto L45
        L43:
            java.lang.String r12 = ""
        L45:
            java.lang.String r12 = r12.toString()
            if (r12 == 0) goto L7d
            boolean r3 = defpackage.qs6.v0(r12)
            if (r3 != 0) goto L52
            goto L53
        L52:
            r12 = r0
        L53:
            if (r12 == 0) goto L7d
            char[] r3 = new char[r1]
            r3[r4] = r2
            r2 = 6
            java.util.List r2 = defpackage.qs6.J0(r12, r3, r2)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L65
            goto L7f
        L65:
            java.util.Iterator r2 = r2.iterator()
        L69:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ".."
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L69
        L7d:
            r12 = r0
            goto L87
        L7f:
            java.lang.String r2 = ".slangp"
            boolean r1 = defpackage.xs6.Y(r12, r2, r1)
            if (r1 == 0) goto L7d
        L87:
            if (r12 != 0) goto L8c
            po5 r10 = defpackage.ng6.l
            return r10
        L8c:
            if (r11 != 0) goto L91
            po5 r10 = defpackage.ng6.l
            return r10
        L91:
            boolean r1 = r11 instanceof defpackage.zf6
            java.lang.String r2 = " -> "
            java.lang.String r3 = "retroarch-shaders/current"
            java.lang.String r4 = "SPSettingsRepository"
            if (r1 == 0) goto Lea
            zf6 r11 = (defpackage.zf6) r11
            java.io.File r11 = r11.a
            java.lang.String r1 = r10.j
            if (r1 != 0) goto La7
            java.lang.String r1 = r10.k
            if (r1 == 0) goto Lb9
        La7:
            r10.j = r0
            r10.k = r0
            java.io.File r0 = new java.io.File
            android.content.Context r10 = r10.a
            java.io.File r10 = r10.getFilesDir()
            r0.<init>(r10, r3)
            defpackage.jc2.x0(r0)
        Lb9:
            java.io.File r10 = new java.io.File
            r10.<init>(r11, r12)
            boolean r0 = r10.exists()
            if (r0 == 0) goto Lde
            boolean r0 = r10.isFile()
            if (r0 != 0) goto Lcb
            goto Lde
        Lcb:
            java.lang.String r10 = d(r10, r11)
            if (r10 == 0) goto Ld9
            java.lang.String r11 = "RetroArch shader preset references files outside the shader library: "
            defpackage.lb1.w(r11, r12, r2, r10, r4)
            po5 r10 = defpackage.ng6.l
            return r10
        Ld9:
            po5 r10 = a(r11, r12, r13, r14)
            return r10
        Lde:
            java.lang.String r10 = "RetroArch shader preset not found in installed library: "
            java.lang.String r10 = r10.concat(r12)
            android.util.Log.w(r4, r10)
            po5 r10 = defpackage.ng6.l
            return r10
        Lea:
            boolean r1 = r11 instanceof defpackage.ag6
            if (r1 == 0) goto L1c1
            ag6 r11 = (defpackage.ag6) r11
            android.net.Uri r11 = r11.a
            java.io.File r1 = new java.io.File
            android.content.Context r5 = r10.a
            java.io.File r5 = r5.getFilesDir()
            r1.<init>(r5, r3)
            android.content.Context r3 = r10.a
            qi6 r3 = defpackage.zl1.h(r3, r11)
            boolean r5 = r3.e()
            if (r5 == 0) goto L1a7
            boolean r5 = r3.k()
            if (r5 != 0) goto L111
            goto L1a7
        L111:
            java.lang.String r5 = r11.toString()
            r5.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r7 = "\n"
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r10.j
            boolean r7 = defpackage.nb3.k(r7, r5)
            if (r7 == 0) goto L142
            java.lang.String r7 = r10.k
            boolean r7 = defpackage.nb3.k(r7, r6)
            if (r7 == 0) goto L142
            boolean r7 = r1.isDirectory()
            if (r7 != 0) goto L14f
        L142:
            defpackage.jc2.x0(r1)     // Catch: java.lang.Exception -> L186
            r1.mkdirs()     // Catch: java.lang.Exception -> L186
            r10.c(r3, r12, r1)     // Catch: java.lang.Exception -> L186
            r10.j = r5     // Catch: java.lang.Exception -> L186
            r10.k = r6     // Catch: java.lang.Exception -> L186
        L14f:
            java.io.File r10 = new java.io.File
            r10.<init>(r1, r12)
            boolean r11 = r10.exists()
            if (r11 == 0) goto L17a
            boolean r11 = r10.isFile()
            if (r11 != 0) goto L161
            goto L17a
        L161:
            java.lang.String r10 = d(r10, r1)
            if (r10 == 0) goto L175
            java.lang.String r11 = "RetroArch shader preset references files outside selected root: "
            java.lang.String r13 = ". Select the top-level slang-shaders folder."
            java.lang.String r10 = defpackage.lb1.n(r11, r12, r2, r10, r13)
            android.util.Log.w(r4, r10)
            po5 r10 = defpackage.ng6.l
            return r10
        L175:
            po5 r10 = a(r1, r12, r13, r14)
            return r10
        L17a:
            java.lang.String r10 = "RetroArch shader preset not found after import: "
            java.lang.String r10 = r10.concat(r12)
            android.util.Log.w(r4, r10)
            po5 r10 = defpackage.ng6.l
            return r10
        L186:
            r13 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to import RetroArch shader preset "
            r14.<init>(r1)
            r14.append(r12)
            java.lang.String r12 = " from "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            android.util.Log.e(r4, r11, r13)
            r10.j = r0
            r10.k = r0
            po5 r10 = defpackage.ng6.l
            return r10
        L1a7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid RetroArch shader root: "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            android.util.Log.w(r4, r11)
            r10.j = r0
            r10.k = r0
            po5 r10 = a(r1, r12, r13, r14)
            return r10
        L1c1:
            defpackage.i.d()
            return r0
    }

    public final defpackage.wp0 C() {
            r2 = this;
            vf6 r0 = new vf6
            r1 = 15
            r0.<init>(r2, r1)
            java.lang.String r1 = "video_renderer_debug_tools_enabled"
            wp0 r2 = r2.p(r1, r0)
            return r2
    }

    public final boolean D() {
            r2 = this;
            java.lang.String r0 = "ra_offline_softcore_enabled"
            r1 = 1
            android.content.SharedPreferences r2 = r2.b
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public final defpackage.wp0 E() {
            r2 = this;
            tf6 r0 = new tf6
            r1 = 27
            r0.<init>(r2, r1)
            java.lang.String r1 = "video_retroarch_shader_parameters"
            wp0 r2 = r2.p(r1, r0)
            return r2
    }

    public final defpackage.wp0 F() {
            r2 = this;
            tf6 r0 = new tf6
            r1 = 8
            r0.<init>(r2, r1)
            java.lang.String r1 = "video_retroarch_shader_preset"
            wp0 r2 = r2.p(r1, r0)
            return r2
    }

    public final defpackage.wp0 G() {
            r5 = this;
            tf6 r0 = new tf6
            r1 = 14
            r0.<init>(r5, r1)
            java.lang.String r1 = "video_retroarch_shader_source"
            wp0 r0 = r5.p(r1, r0)
            tf6 r1 = new tf6
            r2 = 17
            r1.<init>(r5, r2)
            java.lang.String r2 = "video_retroarch_shader_root"
            wp0 r1 = r5.p(r2, r1)
            tf6 r2 = new tf6
            r3 = 12
            r2.<init>(r5, r3)
            java.lang.String r3 = "video_retroarch_shader_library_version"
            wp0 r2 = r5.p(r3, r2)
            lg6 r3 = new lg6
            r4 = 0
            r3.<init>(r5, r4)
            r5 = 3
            le2[] r5 = new defpackage.le2[r5]
            r4 = 0
            r5[r4] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            wp0 r0 = new wp0
            r1 = 4
            r0.<init>(r1, r5, r3)
            return r0
    }

    public final me.magnum.melonds.domain.model.VideoRenderer J(me.magnum.melonds.domain.model.VideoRenderer r7, me.magnum.melonds.domain.model.VideoRenderer r8) {
            r6 = this;
            r0 = -1
            if (r7 != 0) goto L5
            r1 = r0
            goto Ld
        L5:
            int[] r1 = defpackage.cg6.c
            int r2 = r7.ordinal()
            r1 = r1[r2]
        Ld:
            if (r1 == r0) goto L52
            r0 = 196610(0x30002, float:2.75509E-40)
            java.lang.Class<android.app.ActivityManager> r2 = android.app.ActivityManager.class
            android.content.Context r6 = r6.a
            r3 = 0
            r4 = 1
            if (r1 == r4) goto L3d
            r5 = 2
            if (r1 == r5) goto L1e
            return r7
        L1e:
            java.lang.Object r6 = r6.getSystemService(r2)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L2e
            android.content.pm.ConfigurationInfo r6 = r6.getDeviceConfigurationInfo()
            if (r6 == 0) goto L2e
            int r3 = r6.reqGlEsVersion
        L2e:
            if (r3 < r0) goto L52
            java.lang.String r6 = android.os.Build.HARDWARE
            java.lang.String r7 = "qcom"
            boolean r6 = defpackage.xs6.Z(r6, r7, r4)
            if (r6 == 0) goto L52
            me.magnum.melonds.domain.model.VideoRenderer r6 = me.magnum.melonds.domain.model.VideoRenderer.COMPUTE
            return r6
        L3d:
            java.lang.Object r6 = r6.getSystemService(r2)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L4d
            android.content.pm.ConfigurationInfo r6 = r6.getDeviceConfigurationInfo()
            if (r6 == 0) goto L4d
            int r3 = r6.reqGlEsVersion
        L4d:
            if (r3 < r0) goto L52
            me.magnum.melonds.domain.model.VideoRenderer r6 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL
            return r6
        L52:
            return r8
    }

    public final void L(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            java.util.List r0 = r4.n()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()
            r3 = r2
            zq7 r3 = (defpackage.zq7) r3
            java.lang.String r3 = r3.a
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto Ld
            r1.add(r2)
            goto Ld
        L26:
            zq7 r0 = new zq7
            r0.<init>(r5, r8, r6, r7)
            java.util.ArrayList r6 = defpackage.gt0.U0(r0, r1)
            android.content.SharedPreferences r4 = r4.b
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r7 = "video_vulkan_custom_drivers"
            java.lang.String r6 = K(r6)
            r4.putString(r7, r6)
            java.lang.String r6 = "video_vulkan_selected_driver_id"
            r4.putString(r6, r5)
            java.lang.String r5 = "CUSTOM"
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            r5.getClass()
            java.lang.String r6 = "video_vulkan_driver_mode"
            r4.putString(r6, r5)
            java.lang.String r5 = "video_vulkan_custom_driver_dir"
            r4.remove(r5)
            java.lang.String r5 = "video_vulkan_custom_driver_name"
            r4.remove(r5)
            java.lang.String r5 = "video_vulkan_custom_driver_display_name"
            r4.remove(r5)
            r4.commit()
            return
    }

    public final void M(defpackage.p66 r3) {
            r2 = this;
            android.content.SharedPreferences r2 = r2.b
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "dual_screen_external_vertical_alignment"
            if (r3 != 0) goto Le
            r2.remove(r0)
            goto L1e
        Le:
            java.lang.String r3 = r3.name()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            r3.getClass()
            r2.putString(r0, r3)
        L1e:
            r2.apply()
            return
    }

    public final void N(defpackage.p66 r3) {
            r2 = this;
            android.content.SharedPreferences r2 = r2.b
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "dual_screen_internal_vertical_alignment"
            if (r3 != 0) goto Le
            r2.remove(r0)
            goto L1e
        Le:
            java.lang.String r3 = r3.name()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            r3.getClass()
            r2.putString(r0, r3)
        L1e:
            r2.apply()
            return
    }

    public final void O(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            android.content.SharedPreferences r1 = r1.b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "video_vulkan_selected_driver_id"
            r1.putString(r0, r2)
            java.lang.String r2 = "CUSTOM"
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = "video_vulkan_driver_mode"
            r1.putString(r0, r2)
            r1.commit()
            return
    }

    public final void P(defpackage.sr7 r2) {
            r1 = this;
            r2.getClass()
            android.content.SharedPreferences r1 = r1.b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = r2.name()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = "video_vulkan_driver_mode"
            r1.putString(r0, r2)
            r1.commit()
            return
    }

    public final boolean Q() {
            r2 = this;
            java.lang.String r0 = "use_custom_bios"
            r1 = 0
            android.content.SharedPreferences r2 = r2.b
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public final me.magnum.melonds.domain.model.RendererConfiguration b(me.magnum.melonds.domain.model.RendererConfiguration r24, defpackage.jt5 r25, defpackage.bg6 r26, java.lang.String r27, java.lang.String r28) {
            r23 = this;
            r0 = r23
            r1 = r25
            me.magnum.melonds.domain.model.VideoRenderer r2 = r1.i
            java.lang.String r3 = r1.n
            me.magnum.melonds.domain.model.VideoRenderer r4 = r24.getRenderer()
            me.magnum.melonds.domain.model.VideoRenderer r6 = r0.J(r2, r4)
            me.magnum.melonds.domain.model.VideoFiltering r2 = r1.l
            if (r2 != 0) goto L18
            me.magnum.melonds.domain.model.VideoFiltering r2 = r24.getVideoFiltering()
        L18:
            me.magnum.melonds.domain.model.VideoFiltering r4 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            po5 r5 = defpackage.ng6.l
            if (r2 != r4) goto L3d
            java.lang.String r7 = r1.m
            if (r7 != 0) goto L29
            if (r3 != 0) goto L29
            po5 r0 = r24.getRetroArchShader()
            goto L3e
        L29:
            if (r7 != 0) goto L2d
            r7 = r27
        L2d:
            if (r3 != 0) goto L31
            r3 = r28
        L31:
            java.util.Map r3 = H(r3)
            r8 = 0
            r9 = r26
            po5 r0 = r0.B(r9, r7, r3, r8)
            goto L3e
        L3d:
            r0 = r5
        L3e:
            me.magnum.melonds.domain.model.VideoRenderer r3 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r6 != r3) goto L4c
            boolean r7 = r2.isSupportedByVulkan()
            if (r7 != 0) goto L4c
            me.magnum.melonds.domain.model.VideoFiltering r2 = me.magnum.melonds.domain.model.VideoFiltering.NONE
        L4a:
            r7 = r2
            goto L66
        L4c:
            if (r6 == r3) goto L57
            boolean r3 = r2.isSupportedByOpenGlSurface()
            if (r3 != 0) goto L57
            me.magnum.melonds.domain.model.VideoFiltering r2 = me.magnum.melonds.domain.model.VideoFiltering.NONE
            goto L4a
        L57:
            if (r2 != r4) goto L4a
            java.lang.String r3 = r0.a
            if (r3 == 0) goto L63
            boolean r3 = defpackage.qs6.v0(r3)
            if (r3 == 0) goto L4a
        L63:
            me.magnum.melonds.domain.model.VideoFiltering r2 = me.magnum.melonds.domain.model.VideoFiltering.NONE
            goto L4a
        L66:
            java.lang.Boolean r2 = r1.j
            if (r2 == 0) goto L6f
            boolean r2 = r2.booleanValue()
            goto L73
        L6f:
            boolean r2 = r24.getThreadedRendering()
        L73:
            boolean r8 = defpackage.mp2.X(r6, r2)
            java.lang.Integer r1 = r1.k
            if (r1 == 0) goto L81
            int r1 = r1.intValue()
        L7f:
            r10 = r1
            goto L86
        L81:
            int r1 = r24.getResolutionScaling()
            goto L7f
        L86:
            if (r7 != r4) goto L8b
            r20 = r0
            goto L8d
        L8b:
            r20 = r5
        L8d:
            r21 = 16360(0x3fe8, float:2.2925E-41)
            r22 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r5 = r24
            me.magnum.melonds.domain.model.RendererConfiguration r0 = me.magnum.melonds.domain.model.RendererConfiguration.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
    }

    public final void c(defpackage.qi6 r9, java.lang.String r10, java.io.File r11) {
            r8 = this;
            pu r0 = new pu
            r0.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.addLast(r10)
        Ld:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L15a
            java.lang.Object r10 = r0.removeFirst()
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = r1.add(r10)
            if (r2 != 0) goto L20
            goto Ld
        L20:
            r2 = 1
            char[] r2 = new char[r2]
            r3 = 47
            r4 = 0
            r2[r4] = r3
            r3 = 6
            java.util.List r2 = defpackage.qs6.J0(r10, r2, r3)
            java.util.Iterator r2 = r2.iterator()
            r3 = r9
        L32:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = defpackage.qs6.v0(r5)
            r7 = 0
            if (r6 == 0) goto L47
        L45:
            r3 = r7
            goto L4e
        L47:
            zl1 r3 = r3.f(r5)
            if (r3 != 0) goto L32
            goto L45
        L4e:
            if (r3 == 0) goto L151
            boolean r2 = r3.l()
            if (r2 == 0) goto L147
            java.io.File r2 = new java.io.File
            r2.<init>(r11, r10)
            java.io.File r5 = r2.getParentFile()
            if (r5 == 0) goto L64
            r5.mkdirs()
        L64:
            android.content.Context r5 = r8.a
            android.content.ContentResolver r5 = r5.getContentResolver()
            android.net.Uri r3 = r3.j()
            java.io.InputStream r3 = r5.openInputStream(r3)
            if (r3 == 0) goto L13d
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L12e
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L12e
            defpackage.f04.w(r3, r5)     // Catch: java.lang.Throwable -> L130
            r5.close()     // Catch: java.lang.Throwable -> L12e
            r3.close()
            java.lang.String r3 = defpackage.jc2.y0(r2)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r5)
            r3.getClass()
            int r5 = r3.hashCode()
            java.lang.String r6 = "Unsupported RetroArch shader dependency path: "
            switch(r5) {
                case -899875921: goto Lee;
                case 104: goto Lb8;
                case 104414: goto Lae;
                case 3175934: goto La4;
                case 109519073: goto L9a;
                default: goto L98;
            }
        L98:
            goto Ld
        L9a:
            java.lang.String r4 = "slang"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lc2
            goto Ld
        La4:
            java.lang.String r4 = "glsl"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lc2
            goto Ld
        Lae:
            java.lang.String r4 = "inc"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lc2
            goto Ld
        Lb8:
            java.lang.String r4 = "h"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lc2
            goto Ld
        Lc2:
            xh5 r3 = defpackage.fp5.a
            java.lang.String r2 = defpackage.jc2.B0(r2)
            java.util.List r2 = defpackage.fp5.a(r2)
            java.util.Iterator r2 = r2.iterator()
        Ld0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = defpackage.fp5.d(r10, r3)
            if (r4 == 0) goto Le6
            r0.addLast(r4)
            goto Ld0
        Le6:
            java.lang.String r8 = r6.concat(r3)
            defpackage.i.h(r8)
            return
        Lee:
            java.lang.String r5 = "slangp"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto Lf8
            goto Ld
        Lf8:
            xh5 r3 = defpackage.fp5.a
            java.lang.String r2 = defpackage.jc2.B0(r2)
            java.util.LinkedHashMap r2 = defpackage.fp5.b(r2)
            java.util.ArrayList r3 = defpackage.fp5.e(r2)
            java.util.List r2 = defpackage.fp5.f(r2)
            java.util.ArrayList r2 = defpackage.gt0.V0(r3, r2)
            int r3 = r2.size()
        L112:
            if (r4 >= r3) goto Ld
            java.lang.Object r5 = r2.get(r4)
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = defpackage.fp5.d(r10, r5)
            if (r7 == 0) goto L126
            r0.addLast(r7)
            goto L112
        L126:
            java.lang.String r8 = r6.concat(r5)
            defpackage.i.h(r8)
            return
        L12e:
            r8 = move-exception
            goto L137
        L130:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L132
        L132:
            r9 = move-exception
            defpackage.ge7.t(r5, r8)     // Catch: java.lang.Throwable -> L12e
            throw r9     // Catch: java.lang.Throwable -> L12e
        L137:
            throw r8     // Catch: java.lang.Throwable -> L138
        L138:
            r9 = move-exception
            defpackage.ge7.t(r3, r8)
            throw r9
        L13d:
            java.lang.String r8 = "Unable to open RetroArch shader dependency: "
            java.lang.String r8 = r8.concat(r10)
            defpackage.i.h(r8)
            return
        L147:
            java.lang.String r8 = "RetroArch shader dependency is not a file: "
            java.lang.String r8 = r8.concat(r10)
            defpackage.i.h(r8)
            return
        L151:
            java.lang.String r8 = "RetroArch shader dependency not found: "
            java.lang.String r8 = r8.concat(r10)
            defpackage.i.h(r8)
        L15a:
            return
    }

    public final me.magnum.melonds.domain.model.VideoRenderer e() {
            r3 = this;
            java.lang.String r0 = "video_renderer"
            java.lang.String r1 = "software"
            android.content.SharedPreferences r2 = r3.b
            java.lang.String r0 = r2.getString(r0, r1)
            r0.getClass()
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.toUpperCase(r1)     // Catch: java.lang.Throwable -> L1b
            r0.getClass()     // Catch: java.lang.Throwable -> L1b
            me.magnum.melonds.domain.model.VideoRenderer r0 = me.magnum.melonds.domain.model.VideoRenderer.valueOf(r0)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L22:
            me.magnum.melonds.domain.model.VideoRenderer r1 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE
            boolean r2 = r0 instanceof defpackage.em5
            if (r2 == 0) goto L29
            r0 = r1
        L29:
            me.magnum.melonds.domain.model.VideoRenderer r0 = (me.magnum.melonds.domain.model.VideoRenderer) r0
            me.magnum.melonds.domain.model.VideoRenderer r3 = r3.J(r0, r1)
            return r3
    }

    public final me.magnum.melonds.domain.model.ConsoleType f() {
            r6 = this;
            me.magnum.melonds.domain.model.ConsoleType r0 = me.magnum.melonds.domain.model.ConsoleType.DS
            java.lang.String r1 = r0.name()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r2 = "console_type"
            java.lang.String r6 = r6.getString(r2, r1)
            if (r6 != 0) goto L1a
            goto L45
        L1a:
            me.magnum.melonds.domain.model.ConsoleType[] r1 = me.magnum.melonds.domain.model.ConsoleType.values()     // Catch: java.lang.Throwable -> L23
            java.lang.Enum r1 = defpackage.jw2.o(r6, r1)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L2a:
            java.lang.Throwable r2 = defpackage.hm5.a(r1)
            if (r2 == 0) goto L3d
            java.lang.String r2 = r0.name()
            java.lang.String r3 = "Invalid enum preference console_type="
            java.lang.String r4 = "; using "
            java.lang.String r5 = "SPSettingsRepository"
            defpackage.lb1.w(r3, r6, r4, r2, r5)
        L3d:
            boolean r6 = r1 instanceof defpackage.em5
            if (r6 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            java.lang.Enum r0 = (java.lang.Enum) r0
        L45:
            me.magnum.melonds.domain.model.ConsoleType r0 = (me.magnum.melonds.domain.model.ConsoleType) r0
            return r0
    }

    public final defpackage.p66 g() {
            r4 = this;
            android.content.SharedPreferences r4 = r4.b
            java.lang.String r0 = "dual_screen_external_vertical_alignment"
            r1 = 0
            java.lang.String r4 = r4.getString(r0, r1)
            if (r4 != 0) goto Lc
            return r1
        Lc:
            p66[] r0 = defpackage.p66.values()     // Catch: java.lang.Throwable -> L17
            java.lang.Enum r0 = defpackage.jw2.o(r4, r0)     // Catch: java.lang.Throwable -> L17
            p66 r0 = (defpackage.p66) r0     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r0 = move-exception
            em5 r2 = new em5
            r2.<init>(r0)
            r0 = r2
        L1e:
            java.lang.Throwable r2 = defpackage.hm5.a(r0)
            if (r2 == 0) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid enum preference dual_screen_external_vertical_alignment="
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = "; ignoring"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "SPSettingsRepository"
            android.util.Log.w(r2, r4)
        L3c:
            boolean r4 = r0 instanceof defpackage.em5
            if (r4 == 0) goto L41
            goto L42
        L41:
            r1 = r0
        L42:
            p66 r1 = (defpackage.p66) r1
            return r1
    }

    public final defpackage.p66 h() {
            r4 = this;
            android.content.SharedPreferences r4 = r4.b
            java.lang.String r0 = "dual_screen_internal_vertical_alignment"
            r1 = 0
            java.lang.String r4 = r4.getString(r0, r1)
            if (r4 != 0) goto Lc
            return r1
        Lc:
            p66[] r0 = defpackage.p66.values()     // Catch: java.lang.Throwable -> L17
            java.lang.Enum r0 = defpackage.jw2.o(r4, r0)     // Catch: java.lang.Throwable -> L17
            p66 r0 = (defpackage.p66) r0     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r0 = move-exception
            em5 r2 = new em5
            r2.<init>(r0)
            r0 = r2
        L1e:
            java.lang.Throwable r2 = defpackage.hm5.a(r0)
            if (r2 == 0) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid enum preference dual_screen_internal_vertical_alignment="
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = "; ignoring"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "SPSettingsRepository"
            android.util.Log.w(r2, r4)
        L3c:
            boolean r4 = r0 instanceof defpackage.em5
            if (r4 == 0) goto L41
            goto L42
        L41:
            r1 = r0
        L42:
            p66 r1 = (defpackage.p66) r1
            return r1
    }

    public final defpackage.jq1 i() {
            r6 = this;
            jq1 r0 = defpackage.jq1.OFF
            java.lang.String r1 = r0.name()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r2 = "dual_screen_preset"
            java.lang.String r6 = r6.getString(r2, r1)
            if (r6 != 0) goto L1a
            goto L45
        L1a:
            jq1[] r1 = defpackage.jq1.values()     // Catch: java.lang.Throwable -> L23
            java.lang.Enum r1 = defpackage.jw2.o(r6, r1)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L2a:
            java.lang.Throwable r2 = defpackage.hm5.a(r1)
            if (r2 == 0) goto L3d
            java.lang.String r2 = r0.name()
            java.lang.String r3 = "Invalid enum preference dual_screen_preset="
            java.lang.String r4 = "; using "
            java.lang.String r5 = "SPSettingsRepository"
            defpackage.lb1.w(r3, r6, r4, r2, r5)
        L3d:
            boolean r6 = r1 instanceof defpackage.em5
            if (r6 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            java.lang.Enum r0 = (java.lang.Enum) r0
        L45:
            jq1 r0 = (defpackage.jq1) r0
            return r0
    }

    public final java.io.File j() {
            r5 = this;
            java.lang.String r0 = "storm_ds"
            android.content.Context r5 = r5.a
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L30
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "com.stormds.emulator"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L30
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L19
            r2.mkdirs()     // Catch: java.lang.Throwable -> L30
        L19:
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L20
            return r2
        L20:
            java.io.File r2 = r5.getExternalFilesDir(r1)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L2f
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L30
            java.io.File r3 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L30
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L30
        L2f:
            return r2
        L30:
            java.io.File r1 = r5.getExternalFilesDir(r1)
            if (r1 != 0) goto L3f
            java.io.File r1 = new java.io.File
            java.io.File r5 = r5.getFilesDir()
            r1.<init>(r5, r0)
        L3f:
            return r1
    }

    public final java.lang.Object k(defpackage.s41 r51) {
            r50 = this;
            r1 = r50
            r0 = r51
            boolean r2 = r0 instanceof defpackage.gg6
            if (r2 == 0) goto L17
            r2 = r0
            gg6 r2 = (defpackage.gg6) r2
            int r3 = r2.z0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.z0 = r3
            goto L1c
        L17:
            gg6 r2 = new gg6
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.x0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.z0
            android.content.Context r5 = r1.a
            r7 = 1
            android.content.SharedPreferences r8 = r1.b
            if (r4 == 0) goto Lba
            if (r4 != r7) goto Lb2
            int r1 = r2.w0
            boolean r3 = r2.r0
            boolean r4 = r2.q0
            int r10 = r2.v0
            int r11 = r2.u0
            boolean r12 = r2.p0
            float r13 = r2.t0
            float r14 = r2.s0
            boolean r15 = r2.o0
            r51 = r7
            boolean r7 = r2.n0
            me.magnum.melonds.domain.model.FirmwareConfiguration r6 = r2.m0
            r16 = 0
            me.magnum.melonds.domain.model.MicSource r9 = r2.l0
            r17 = r0
            me.magnum.melonds.domain.model.AudioLatency r0 = r2.k0
            r50 = r0
            me.magnum.melonds.domain.model.AudioBitrate r0 = r2.j0
            r18 = r0
            me.magnum.melonds.domain.model.AudioInterpolation r0 = r2.i0
            r19 = r0
            me.magnum.melonds.domain.model.ConsoleType r0 = r2.h0
            r20 = r0
            java.lang.String r0 = r2.g0
            r21 = r0
            android.net.Uri r0 = r2.f0
            r22 = r0
            android.net.Uri r0 = r2.e0
            r23 = r0
            android.net.Uri r0 = r2.d0
            r24 = r0
            android.net.Uri r0 = r2.Z
            r25 = r0
            android.net.Uri r0 = r2.Y
            r26 = r0
            android.net.Uri r0 = r2.X
            android.net.Uri r2 = r2.R
            defpackage.oi2.Y(r17)
            r27 = r26
            r26 = r23
            r23 = r27
            r27 = r25
            r25 = r24
            r24 = r27
            r41 = r50
            r40 = r1
            r37 = r3
            r34 = r4
            r43 = r6
            r42 = r9
            r33 = r10
            r32 = r11
            r31 = r12
            r30 = r13
            r29 = r14
            r39 = r18
            r38 = r19
            r36 = r20
            r28 = r21
            r27 = r22
            r22 = r0
            r21 = r2
            r19 = r7
            r20 = r15
            r0 = r17
            r17 = r5
            goto L46d
        Lb2:
            r16 = 0
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r16
        Lba:
            r17 = r0
            r51 = r7
            r16 = 0
            defpackage.oi2.Y(r17)
            me.magnum.melonds.domain.model.ConsoleType r4 = r1.f()
            boolean r0 = r1.Q()
            java.lang.String r6 = "bios_dir"
            r7 = r16
            java.util.Set r9 = r8.getStringSet(r6, r7)
            if (r9 == 0) goto Lde
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r7 = defpackage.gt0.I0(r9)
            java.lang.String r7 = (java.lang.String) r7
            goto Ldf
        Lde:
            r7 = 0
        Ldf:
            if (r7 == 0) goto Le6
            android.net.Uri r7 = android.net.Uri.parse(r7)
            goto Le7
        Le6:
            r7 = 0
        Le7:
            java.lang.String r9 = "dsi_bios_dir"
            r10 = 0
            java.util.Set r11 = r8.getStringSet(r9, r10)
            if (r11 == 0) goto Lf9
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r10 = defpackage.gt0.I0(r11)
            java.lang.String r10 = (java.lang.String) r10
            goto Lfa
        Lf9:
            r10 = 0
        Lfa:
            if (r10 == 0) goto L101
            android.net.Uri r10 = android.net.Uri.parse(r10)
            goto L102
        L101:
            r10 = 0
        L102:
            me.magnum.melonds.domain.model.ConsoleType r11 = me.magnum.melonds.domain.model.ConsoleType.DS
            java.lang.String r12 = "SPSettingsRepository"
            if (r4 != r11) goto L10c
            if (r0 == 0) goto L10c
            if (r7 == 0) goto L114
        L10c:
            me.magnum.melonds.domain.model.ConsoleType r0 = me.magnum.melonds.domain.model.ConsoleType.DSi
            if (r4 != r0) goto L119
            if (r7 == 0) goto L114
            if (r10 != 0) goto L119
        L114:
            java.lang.String r0 = "BIOS directory preference is incomplete; load will fail gracefully if custom BIOS is required"
            android.util.Log.w(r12, r0)
        L119:
            zl1 r0 = r1.y(r7, r6)
            zl1 r6 = r1.y(r10, r9)
            java.io.File r9 = new java.io.File
            java.io.File r11 = r5.getFilesDir()
            java.lang.String r13 = "bios/ds"
            r9.<init>(r11, r13)
            java.io.File r11 = new java.io.File
            java.io.File r13 = r5.getFilesDir()
            java.lang.String r14 = "bios/dsi"
            r11.<init>(r13, r14)
            java.lang.String r13 = "bios7.bin"
            android.net.Uri r14 = I(r7, r0, r13, r9)
            java.lang.String r15 = "bios9.bin"
            r17 = r5
            android.net.Uri r5 = I(r7, r0, r15, r9)
            r18 = r3
            java.lang.String r3 = "firmware.bin"
            android.net.Uri r7 = I(r7, r0, r3, r9)
            android.net.Uri r9 = I(r10, r6, r13, r11)
            android.net.Uri r13 = I(r10, r6, r15, r11)
            android.net.Uri r3 = I(r10, r6, r3, r11)
            java.lang.String r0 = "nand.bin"
            android.net.Uri r6 = I(r10, r6, r0, r11)
            boolean r10 = r1.Q()
            java.lang.String r0 = "show_bios"
            r11 = 0
            boolean r15 = r8.getBoolean(r0, r11)
            java.io.File r0 = r17.getFilesDir()
            java.lang.String r11 = r0.getAbsolutePath()
            r11.getClass()
            java.lang.String r0 = "fast_forward_speed_multiplier"
            java.lang.String r1 = "-1"
            java.lang.String r0 = r8.getString(r0, r1)
            r0.getClass()
            java.lang.Float r0 = defpackage.ws6.U(r0)
            if (r0 == 0) goto L18c
            float r0 = r0.floatValue()
        L18a:
            r1 = r0
            goto L18f
        L18c:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L18a
        L18f:
            java.lang.String r0 = "frame_limit_speed_multiplier"
            r19 = r1
            java.lang.String r1 = "1"
            java.lang.String r0 = r8.getString(r0, r1)
            r0.getClass()
            java.lang.Float r0 = defpackage.ws6.U(r0)
            r20 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r20 == 0) goto L1b6
            r21 = r15
            float r15 = r20.floatValue()
            r20 = r10
            r10 = 1048576000(0x3e800000, float:0.25)
            float r0 = defpackage.gi2.p(r15, r10, r0)
        L1b4:
            r10 = r0
            goto L1bb
        L1b6:
            r20 = r10
            r21 = r15
            goto L1b4
        L1bb:
            java.lang.String r0 = "enable_rewind"
            r22 = r10
            r15 = 0
            boolean r10 = r8.getBoolean(r0, r15)
            java.lang.String r0 = "rewind_period"
            r15 = 10
            r23 = r10
            int r10 = r8.getInt(r0, r15)
            java.lang.String r0 = "rewind_window"
            r24 = r15
            r15 = 6
            int r0 = r8.getInt(r0, r15)
            int r15 = r0 * 10
            java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L1e4
            r0 = r51
            goto L1e5
        L1e4:
            r0 = 0
        L1e5:
            r0 = r0 ^ 1
            r24 = r15
            java.lang.String r15 = "enable_jit"
            boolean r15 = r8.getBoolean(r15, r0)
            java.lang.String r0 = "sound_enabled"
            r27 = r10
            r26 = r15
            r15 = r51
            boolean r10 = r8.getBoolean(r0, r15)
            me.magnum.melonds.domain.model.AudioInterpolation r15 = me.magnum.melonds.domain.model.AudioInterpolation.NONE
            java.lang.String r0 = r15.name()
            r28 = r15
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r15)
            r0.getClass()
            java.lang.String r15 = "audio_interpolation"
            java.lang.String r15 = r8.getString(r15, r0)
            r29 = r10
            java.lang.String r10 = "; using "
            if (r15 != 0) goto L21f
            r30 = r4
            r31 = r11
            r15 = r28
            goto L251
        L21f:
            me.magnum.melonds.domain.model.AudioInterpolation[] r0 = me.magnum.melonds.domain.model.AudioInterpolation.values()     // Catch: java.lang.Throwable -> L22a
            java.lang.Enum r0 = defpackage.jw2.o(r15, r0)     // Catch: java.lang.Throwable -> L22a
            r30 = r4
            goto L233
        L22a:
            r0 = move-exception
            r30 = r4
            em5 r4 = new em5
            r4.<init>(r0)
            r0 = r4
        L233:
            java.lang.Throwable r4 = defpackage.hm5.a(r0)
            if (r4 == 0) goto L245
            java.lang.String r4 = r28.name()
            r31 = r11
            java.lang.String r11 = "Invalid enum preference audio_interpolation="
            defpackage.lb1.w(r11, r15, r10, r4, r12)
            goto L247
        L245:
            r31 = r11
        L247:
            boolean r4 = r0 instanceof defpackage.em5
            if (r4 == 0) goto L24e
            r15 = r28
            goto L24f
        L24e:
            r15 = r0
        L24f:
            java.lang.Enum r15 = (java.lang.Enum) r15
        L251:
            r4 = r15
            me.magnum.melonds.domain.model.AudioInterpolation r4 = (me.magnum.melonds.domain.model.AudioInterpolation) r4
            me.magnum.melonds.domain.model.AudioBitrate r11 = me.magnum.melonds.domain.model.AudioBitrate.AUTO
            java.lang.String r0 = r11.name()
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r15)
            r0.getClass()
            java.lang.String r15 = "audio_bitrate"
            java.lang.String r15 = r8.getString(r15, r0)
            if (r15 != 0) goto L26e
            r32 = r4
            goto L2a0
        L26e:
            me.magnum.melonds.domain.model.AudioBitrate[] r0 = me.magnum.melonds.domain.model.AudioBitrate.values()     // Catch: java.lang.Throwable -> L279
            java.lang.Enum r0 = defpackage.jw2.o(r15, r0)     // Catch: java.lang.Throwable -> L279
            r28 = r11
            goto L282
        L279:
            r0 = move-exception
            r28 = r11
            em5 r11 = new em5
            r11.<init>(r0)
            r0 = r11
        L282:
            java.lang.Throwable r11 = defpackage.hm5.a(r0)
            if (r11 == 0) goto L294
            java.lang.String r11 = r28.name()
            r32 = r4
            java.lang.String r4 = "Invalid enum preference audio_bitrate="
            defpackage.lb1.w(r4, r15, r10, r11, r12)
            goto L296
        L294:
            r32 = r4
        L296:
            boolean r4 = r0 instanceof defpackage.em5
            if (r4 == 0) goto L29d
            r11 = r28
            goto L29e
        L29d:
            r11 = r0
        L29e:
            java.lang.Enum r11 = (java.lang.Enum) r11
        L2a0:
            r4 = r11
            me.magnum.melonds.domain.model.AudioBitrate r4 = (me.magnum.melonds.domain.model.AudioBitrate) r4
            java.lang.String r0 = "volume"
            r11 = 256(0x100, float:3.59E-43)
            int r0 = r8.getInt(r0, r11)
            r15 = 0
            int r11 = defpackage.gi2.q(r0, r15, r11)
            me.magnum.melonds.domain.model.AudioLatency r15 = me.magnum.melonds.domain.model.AudioLatency.LOW
            java.lang.String r0 = r15.name()
            r28 = r15
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r15)
            r0.getClass()
            java.lang.String r15 = "audio_latency"
            java.lang.String r15 = r8.getString(r15, r0)
            if (r15 != 0) goto L2d0
            r34 = r4
            r33 = r11
            r15 = r28
            goto L302
        L2d0:
            me.magnum.melonds.domain.model.AudioLatency[] r0 = me.magnum.melonds.domain.model.AudioLatency.values()     // Catch: java.lang.Throwable -> L2db
            java.lang.Enum r0 = defpackage.jw2.o(r15, r0)     // Catch: java.lang.Throwable -> L2db
            r33 = r11
            goto L2e4
        L2db:
            r0 = move-exception
            r33 = r11
            em5 r11 = new em5
            r11.<init>(r0)
            r0 = r11
        L2e4:
            java.lang.Throwable r11 = defpackage.hm5.a(r0)
            if (r11 == 0) goto L2f6
            java.lang.String r11 = r28.name()
            r34 = r4
            java.lang.String r4 = "Invalid enum preference audio_latency="
            defpackage.lb1.w(r4, r15, r10, r11, r12)
            goto L2f8
        L2f6:
            r34 = r4
        L2f8:
            boolean r4 = r0 instanceof defpackage.em5
            if (r4 == 0) goto L2ff
            r15 = r28
            goto L300
        L2ff:
            r15 = r0
        L300:
            java.lang.Enum r15 = (java.lang.Enum) r15
        L302:
            r0 = r15
            me.magnum.melonds.domain.model.AudioLatency r0 = (me.magnum.melonds.domain.model.AudioLatency) r0
            me.magnum.melonds.domain.model.MicSource r4 = r50.o()
            r15 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            java.lang.String r11 = "firmware_settings_birthday"
            java.lang.String r12 = "01/01"
            java.lang.String r11 = r8.getString(r11, r12)
            r11.getClass()
            java.lang.String r12 = "/"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            r15 = 6
            java.util.List r11 = defpackage.qs6.K0(r11, r12, r15)
            int r12 = r11.size()
            r15 = 2
            if (r12 == r15) goto L331
            vr4 r11 = new vr4
            r11.<init>(r10, r10)
            goto L366
        L331:
            r15 = 0
            java.lang.Object r10 = r11.get(r15)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Integer r10 = defpackage.xs6.h0(r10)
            if (r10 == 0) goto L345
            int r10 = r10.intValue()
            r15 = r10
        L343:
            r10 = 1
            goto L347
        L345:
            r15 = 1
            goto L343
        L347:
            java.lang.Object r11 = r11.get(r10)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Integer r10 = defpackage.xs6.h0(r11)
            if (r10 == 0) goto L358
            int r10 = r10.intValue()
            goto L359
        L358:
            r10 = 1
        L359:
            vr4 r11 = new vr4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.<init>(r12, r10)
        L366:
            boolean r10 = r50.Q()
            if (r10 == 0) goto L378
            java.lang.String r10 = "custom_randomize_mac_address"
            r15 = 0
            boolean r10 = r8.getBoolean(r10, r15)
            r42 = r10
            r43 = 0
            goto L394
        L378:
            r15 = 0
            java.lang.String r10 = "internal_randomize_mac_address"
            boolean r10 = r8.getBoolean(r10, r15)
            if (r10 != 0) goto L38e
            java.lang.String r12 = "internal_mac_address"
            r15 = 0
            java.lang.String r12 = r8.getString(r12, r15)
            if (r12 != 0) goto L38c
            r15 = 1
            goto L390
        L38c:
            r15 = r10
            goto L390
        L38e:
            r15 = r10
            r12 = 0
        L390:
            r43 = r12
            r42 = r15
        L394:
            me.magnum.melonds.domain.model.FirmwareConfiguration r35 = new me.magnum.melonds.domain.model.FirmwareConfiguration
            java.lang.String r10 = "firmware_settings_nickname"
            java.lang.String r12 = "Player"
            java.lang.String r36 = r8.getString(r10, r12)
            r36.getClass()
            java.lang.String r10 = "firmware_settings_message"
            java.lang.String r12 = "Hello!"
            java.lang.String r37 = r8.getString(r10, r12)
            r37.getClass()
            java.lang.String r10 = "firmware_settings_language"
            java.lang.String r1 = r8.getString(r10, r1)
            r1.getClass()
            java.lang.Integer r1 = defpackage.xs6.h0(r1)
            if (r1 == 0) goto L3c2
            int r15 = r1.intValue()
            r38 = r15
            goto L3c4
        L3c2:
            r38 = 1
        L3c4:
            java.lang.String r1 = "firmware_settings_colour"
            r15 = 0
            int r39 = r8.getInt(r1, r15)
            java.lang.Object r1 = r11.B
            java.lang.Number r1 = (java.lang.Number) r1
            int r40 = r1.intValue()
            java.lang.Object r1 = r11.A
            java.lang.Number r1 = (java.lang.Number) r1
            int r41 = r1.intValue()
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
            r1 = r35
            r2.R = r14
            r2.X = r5
            r2.Y = r7
            r2.Z = r9
            r2.d0 = r13
            r2.e0 = r3
            r2.f0 = r6
            r10 = r31
            r2.g0 = r10
            r11 = r30
            r2.h0 = r11
            r15 = r32
            r2.i0 = r15
            r12 = r34
            r2.j0 = r12
            r2.k0 = r0
            r2.l0 = r4
            r2.m0 = r1
            r1 = r20
            r2.n0 = r1
            r1 = r21
            r2.o0 = r1
            r1 = r19
            r2.s0 = r1
            r1 = r22
            r2.t0 = r1
            r1 = r23
            r2.p0 = r1
            r1 = r27
            r2.u0 = r1
            r1 = r24
            r2.v0 = r1
            r1 = r26
            r2.q0 = r1
            r1 = r29
            r2.r0 = r1
            r1 = r33
            r2.w0 = r1
            r1 = 1
            r2.z0 = r1
            r1 = r50
            be5 r1 = r1.i
            java.lang.Object r1 = defpackage.f04.B(r1, r2)
            r2 = r18
            if (r1 != r2) goto L43c
            return r2
        L43c:
            r41 = r0
            r0 = r1
            r42 = r4
            r28 = r10
            r36 = r11
            r39 = r12
            r25 = r13
            r38 = r15
            r30 = r22
            r31 = r23
            r34 = r26
            r32 = r27
            r37 = r29
            r40 = r33
            r43 = r35
            r26 = r3
            r22 = r5
            r27 = r6
            r23 = r7
            r29 = r19
            r19 = r20
            r20 = r21
            r33 = r24
            r24 = r9
            r21 = r14
        L46d:
            r44 = r0
            me.magnum.melonds.domain.model.RendererConfiguration r44 = (me.magnum.melonds.domain.model.RendererConfiguration) r44
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r45 = new me.magnum.melonds.domain.model.DldiSdCardConfiguration
            java.lang.String r0 = "system_dldi_sd_card_enabled"
            r15 = 0
            boolean r1 = r8.getBoolean(r0, r15)
            java.io.File r2 = new java.io.File
            java.io.File r3 = r17.getFilesDir()
            java.lang.String r4 = "dldi/dldi_sd.img"
            r2.<init>(r3, r4)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r3 = "system_dldi_sd_card_image_size"
            java.lang.String r4 = "0"
            java.lang.String r3 = r8.getString(r3, r4)
            if (r3 == 0) goto L4a5
            java.lang.Integer r3 = defpackage.xs6.h0(r3)
            if (r3 == 0) goto L4a5
            int r3 = r3.intValue()
            r4 = 5
            r15 = 0
            int r11 = defpackage.gi2.q(r3, r15, r4)
            r3 = r11
            goto L4a7
        L4a5:
            r15 = 0
            r3 = r15
        L4a7:
            boolean r0 = r8.getBoolean(r0, r15)
            if (r0 == 0) goto L4cc
            java.lang.String r0 = "system_dldi_sd_card_dir"
            r7 = 0
            java.util.Set r0 = r8.getStringSet(r0, r7)
            if (r0 == 0) goto L4bf
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = defpackage.gt0.I0(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L4c0
        L4bf:
            r0 = r7
        L4c0:
            if (r0 == 0) goto L4c7
            android.net.Uri r9 = android.net.Uri.parse(r0)
            goto L4c8
        L4c7:
            r9 = r7
        L4c8:
            if (r9 == 0) goto L4cc
            r4 = 1
            goto L4cd
        L4cc:
            r4 = r15
        L4cd:
            java.io.File r0 = new java.io.File
            java.io.File r5 = r17.getFilesDir()
            java.lang.String r6 = "dldi/sync"
            r0.<init>(r5, r6)
            java.lang.String r5 = r0.getAbsolutePath()
            r0 = r45
            r0.<init>(r1, r2, r3, r4, r5)
            me.magnum.melonds.domain.model.EmulatorConfiguration r18 = new me.magnum.melonds.domain.model.EmulatorConfiguration
            r35 = 0
            r46 = 0
            r48 = 134217728(0x8000000, float:3.85186E-34)
            r49 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49)
            return r18
    }

    public final java.lang.Object l(defpackage.jt5 r53, defpackage.s41 r54) {
            r52 = this;
            r0 = r52
            r1 = r54
            boolean r2 = r1 instanceof defpackage.hg6
            if (r2 == 0) goto L17
            r2 = r1
            hg6 r2 = (defpackage.hg6) r2
            int r3 = r2.t0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.t0 = r3
            goto L1c
        L17:
            hg6 r2 = new hg6
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.r0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.t0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r4 == 0) goto Lfb
            if (r4 == r9) goto Lf2
            if (r4 == r7) goto Lb5
            if (r4 == r6) goto L71
            if (r4 != r5) goto L6b
            int r0 = r2.o0
            int r3 = r2.n0
            int r4 = r2.m0
            int r5 = r2.l0
            int r6 = r2.k0
            int r7 = r2.j0
            int r8 = r2.i0
            float r11 = r2.q0
            float r12 = r2.p0
            int r13 = r2.h0
            int r14 = r2.g0
            java.lang.String r15 = r2.f0
            bg6 r10 = r2.e0
            jt5 r9 = r2.d0
            r52 = r0
            me.magnum.melonds.domain.model.RendererConfiguration r0 = r2.Z
            r53 = r0
            ng6 r0 = r2.Y
            me.magnum.melonds.domain.model.EmulatorConfiguration r2 = r2.X
            defpackage.oi2.Y(r1)
            r42 = r52
            r20 = r2
            r34 = r7
            r32 = r11
            r31 = r12
            r2 = r1
            r1 = r53
        L67:
            r35 = r6
            goto L217
        L6b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L71:
            int r4 = r2.o0
            int r6 = r2.n0
            int r7 = r2.m0
            int r9 = r2.l0
            int r10 = r2.k0
            int r11 = r2.j0
            int r12 = r2.i0
            float r13 = r2.q0
            float r14 = r2.p0
            int r15 = r2.h0
            int r5 = r2.g0
            bg6 r8 = r2.e0
            r17 = r1
            jt5 r1 = r2.d0
            r53 = r1
            me.magnum.melonds.domain.model.RendererConfiguration r1 = r2.Z
            r18 = r1
            ng6 r1 = r2.Y
            r19 = r1
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = r2.X
            defpackage.oi2.Y(r17)
            r0 = r19
            r19 = r4
            r4 = r7
            r7 = r0
            r0 = r12
            r12 = r8
            r8 = r0
            r0 = r5
            r20 = r6
            r6 = r10
            r10 = r53
            r5 = r1
            r1 = r15
            r15 = r14
            r14 = r11
            r11 = r18
            r18 = r3
            goto L1b6
        Lb5:
            r17 = r1
            int r1 = r2.o0
            int r4 = r2.n0
            int r5 = r2.m0
            int r7 = r2.l0
            int r8 = r2.k0
            int r9 = r2.j0
            int r10 = r2.i0
            float r11 = r2.q0
            float r12 = r2.p0
            int r13 = r2.h0
            int r14 = r2.g0
            jt5 r15 = r2.d0
            me.magnum.melonds.domain.model.RendererConfiguration r6 = r2.Z
            r19 = r1
            ng6 r1 = r2.Y
            r53 = r1
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = r2.X
            defpackage.oi2.Y(r17)
            r0 = r7
            r7 = r53
            r53 = r17
            r17 = r3
            r3 = r15
            r15 = r10
            r10 = r5
            r5 = r1
            r1 = r14
            r14 = r9
            r9 = r12
            r12 = r0
            r0 = r13
            r13 = r8
            r8 = r4
            r4 = r11
        Lef:
            r11 = r6
            goto L15e
        Lf2:
            r17 = r1
            jt5 r1 = r2.R
            defpackage.oi2.Y(r17)
            r4 = 1
            goto L112
        Lfb:
            r17 = r1
            defpackage.oi2.Y(r17)
            r1 = r53
            r2.R = r1
            r4 = 1
            r2.t0 = r4
            java.lang.Object r5 = r0.k(r2)
            if (r5 != r3) goto L110
        L10d:
            r2 = r3
            goto L1fe
        L110:
            r17 = r5
        L112:
            r5 = r17
            me.magnum.melonds.domain.model.EmulatorConfiguration r5 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r5
            me.magnum.melonds.domain.model.RendererConfiguration r6 = r5.getRendererConfiguration()
            wp0 r8 = r0.G()
            r9 = 0
            r2.R = r9
            r2.X = r5
            r2.Y = r0
            r2.Z = r6
            r2.d0 = r1
            r9 = 0
            r2.g0 = r9
            r2.h0 = r9
            r11 = 0
            r2.p0 = r11
            r2.q0 = r11
            r2.i0 = r9
            r2.j0 = r9
            r2.k0 = r9
            r2.l0 = r9
            r2.m0 = r9
            r2.n0 = r9
            r2.o0 = r9
            r2.t0 = r7
            java.lang.Object r7 = defpackage.f04.B(r8, r2)
            if (r7 != r3) goto L14a
            goto L10d
        L14a:
            r17 = r3
            r53 = r7
            r8 = r9
            r10 = r8
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r19 = r15
            r4 = r11
            r7 = r0
            r3 = r1
            r0 = r19
            r1 = r0
            r9 = r4
            goto Lef
        L15e:
            r6 = r53
            bg6 r6 = (defpackage.bg6) r6
            r53 = r8
            wp0 r8 = r52.F()
            r20 = r8
            r8 = 0
            r2.R = r8
            r2.X = r5
            r2.Y = r7
            r2.Z = r11
            r2.d0 = r3
            r2.e0 = r6
            r2.g0 = r1
            r2.h0 = r0
            r2.p0 = r9
            r2.q0 = r4
            r2.i0 = r15
            r2.j0 = r14
            r2.k0 = r13
            r2.l0 = r12
            r2.m0 = r10
            r8 = r53
            r2.n0 = r8
            r53 = r0
            r0 = r19
            r2.o0 = r0
            r0 = 3
            r2.t0 = r0
            r0 = r20
            java.lang.Object r0 = defpackage.f04.B(r0, r2)
            r18 = r1
            r1 = r17
            if (r0 != r1) goto L1a4
            r2 = r1
            goto L1fe
        L1a4:
            r17 = r0
            r20 = r8
            r8 = r15
            r0 = r18
            r18 = r1
            r15 = r9
            r9 = r12
            r1 = r53
            r12 = r6
            r6 = r13
            r13 = r4
            r4 = r10
            r10 = r3
        L1b6:
            r3 = r17
            java.lang.String r3 = (java.lang.String) r3
            r17 = r4
            wp0 r4 = r52.E()
            r52 = r4
            r4 = 0
            r2.R = r4
            r2.X = r5
            r2.Y = r7
            r2.Z = r11
            r2.d0 = r10
            r2.e0 = r12
            r2.f0 = r3
            r2.g0 = r0
            r2.h0 = r1
            r2.p0 = r15
            r2.q0 = r13
            r2.i0 = r8
            r2.j0 = r14
            r2.k0 = r6
            r2.l0 = r9
            r4 = r17
            r2.m0 = r4
            r16 = r0
            r0 = r20
            r2.n0 = r0
            r17 = r0
            r0 = r19
            r2.o0 = r0
            r0 = 4
            r2.t0 = r0
            r0 = r52
            java.lang.Object r0 = defpackage.f04.B(r0, r2)
            r2 = r18
            if (r0 != r2) goto L1ff
        L1fe:
            return r2
        L1ff:
            r2 = r0
            r20 = r5
            r0 = r7
            r5 = r9
            r9 = r10
            r10 = r12
            r32 = r13
            r34 = r14
            r31 = r15
            r14 = r16
            r42 = r19
            r13 = r1
            r15 = r3
            r1 = r11
            r3 = r17
            goto L67
        L217:
            if (r14 == 0) goto L21c
            r21 = 1
            goto L21e
        L21c:
            r21 = 0
        L21e:
            if (r13 == 0) goto L223
            r22 = 1
            goto L225
        L223:
            r22 = 0
        L225:
            if (r8 == 0) goto L22a
            r33 = 1
            goto L22c
        L22a:
            r33 = 0
        L22c:
            if (r5 == 0) goto L231
            r36 = 1
            goto L233
        L231:
            r36 = 0
        L233:
            if (r4 == 0) goto L238
            r37 = 1
            goto L23a
        L238:
            r37 = 0
        L23a:
            if (r3 == 0) goto L23f
            r39 = 1
            goto L241
        L23f:
            r39 = 0
        L241:
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r2 = r9
            r3 = r10
            r4 = r15
            me.magnum.melonds.domain.model.RendererConfiguration r46 = r0.b(r1, r2, r3, r4, r5)
            r50 = 234881023(0xdffffff, float:1.5777217E-30)
            r51 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r38 = 0
            r40 = 0
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            me.magnum.melonds.domain.model.EmulatorConfiguration r0 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r51)
            return r0
    }

    public final defpackage.u82 m() {
            r6 = this;
            u82 r0 = defpackage.u82.MELON_DUAL_DS
            java.lang.String r1 = r0.name()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r2 = "external_display_mode"
            java.lang.String r6 = r6.getString(r2, r1)
            if (r6 != 0) goto L1a
            goto L45
        L1a:
            u82[] r1 = defpackage.u82.values()     // Catch: java.lang.Throwable -> L23
            java.lang.Enum r1 = defpackage.jw2.o(r6, r1)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L2a:
            java.lang.Throwable r2 = defpackage.hm5.a(r1)
            if (r2 == 0) goto L3d
            java.lang.String r2 = r0.name()
            java.lang.String r3 = "Invalid enum preference external_display_mode="
            java.lang.String r4 = "; using "
            java.lang.String r5 = "SPSettingsRepository"
            defpackage.lb1.w(r3, r6, r4, r2, r5)
        L3d:
            boolean r6 = r1 instanceof defpackage.em5
            if (r6 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            java.lang.Enum r0 = (java.lang.Enum) r0
        L45:
            u82 r0 = (defpackage.u82) r0
            return r0
    }

    public final java.util.List n() {
            r11 = this;
            android.content.SharedPreferences r11 = r11.b
            java.lang.String r0 = "video_vulkan_custom_drivers"
            r1 = 0
            java.lang.String r0 = r11.getString(r0, r1)
            yt1 r2 = defpackage.yt1.A
            if (r0 == 0) goto L95
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            kw3 r0 = defpackage.hf.I()     // Catch: java.lang.Throwable -> L7f
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L7f
            r5 = 0
        L1b:
            if (r5 >= r4) goto L81
            org.json.JSONObject r6 = r3.optJSONObject(r5)     // Catch: java.lang.Throwable -> L7f
            if (r6 != 0) goto L24
            goto L7c
        L24:
            java.lang.String r7 = "id"
            java.lang.String r7 = r6.optString(r7)     // Catch: java.lang.Throwable -> L7f
            r7.getClass()     // Catch: java.lang.Throwable -> L7f
            boolean r8 = defpackage.qs6.v0(r7)     // Catch: java.lang.Throwable -> L7f
            if (r8 != 0) goto L34
            goto L35
        L34:
            r7 = r1
        L35:
            if (r7 != 0) goto L38
            goto L7c
        L38:
            java.lang.String r8 = "displayName"
            java.lang.String r8 = r6.optString(r8)     // Catch: java.lang.Throwable -> L7f
            r8.getClass()     // Catch: java.lang.Throwable -> L7f
            boolean r9 = defpackage.qs6.v0(r8)     // Catch: java.lang.Throwable -> L7f
            if (r9 != 0) goto L48
            goto L49
        L48:
            r8 = r1
        L49:
            if (r8 != 0) goto L4c
            goto L7c
        L4c:
            java.lang.String r9 = "driverDir"
            java.lang.String r9 = r6.optString(r9)     // Catch: java.lang.Throwable -> L7f
            r9.getClass()     // Catch: java.lang.Throwable -> L7f
            boolean r10 = defpackage.qs6.v0(r9)     // Catch: java.lang.Throwable -> L7f
            if (r10 != 0) goto L5c
            goto L5d
        L5c:
            r9 = r1
        L5d:
            if (r9 != 0) goto L60
            goto L7c
        L60:
            java.lang.String r10 = "driverName"
            java.lang.String r6 = r6.optString(r10)     // Catch: java.lang.Throwable -> L7f
            r6.getClass()     // Catch: java.lang.Throwable -> L7f
            boolean r10 = defpackage.qs6.v0(r6)     // Catch: java.lang.Throwable -> L7f
            if (r10 != 0) goto L70
            goto L71
        L70:
            r6 = r1
        L71:
            if (r6 != 0) goto L74
            goto L7c
        L74:
            zq7 r10 = new zq7     // Catch: java.lang.Throwable -> L7f
            r10.<init>(r7, r8, r9, r6)     // Catch: java.lang.Throwable -> L7f
            r0.add(r10)     // Catch: java.lang.Throwable -> L7f
        L7c:
            int r5 = r5 + 1
            goto L1b
        L7f:
            r0 = move-exception
            goto L86
        L81:
            kw3 r0 = defpackage.hf.A(r0)     // Catch: java.lang.Throwable -> L7f
            goto L8c
        L86:
            em5 r3 = new em5
            r3.<init>(r0)
            r0 = r3
        L8c:
            boolean r3 = r0 instanceof defpackage.em5
            if (r3 == 0) goto L92
            r0 = r2
        L92:
            java.util.List r0 = (java.util.List) r0
            goto L96
        L95:
            r0 = r1
        L96:
            if (r0 != 0) goto L99
            r0 = r2
        L99:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto La0
            return r0
        La0:
            java.lang.String r0 = "video_vulkan_custom_driver_name"
            java.lang.String r0 = r11.getString(r0, r1)
            java.lang.String r3 = "video_vulkan_custom_driver_dir"
            java.lang.String r3 = r11.getString(r3, r1)
            java.lang.String r4 = "video_vulkan_custom_driver_display_name"
            java.lang.String r11 = r11.getString(r4, r1)
            if (r0 == 0) goto Lde
            boolean r1 = defpackage.qs6.v0(r0)
            if (r1 == 0) goto Lbb
            goto Lde
        Lbb:
            if (r3 == 0) goto Lde
            boolean r1 = defpackage.qs6.v0(r3)
            if (r1 == 0) goto Lc4
            goto Lde
        Lc4:
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto Lde
            zq7 r1 = new zq7
            if (r11 != 0) goto Ld4
            r11 = r0
        Ld4:
            java.lang.String r2 = "legacy"
            r1.<init>(r2, r11, r3, r0)
            java.util.List r11 = defpackage.hf.b0(r1)
            return r11
        Lde:
            return r2
    }

    public final me.magnum.melonds.domain.model.MicSource o() {
            r6 = this;
            me.magnum.melonds.domain.model.MicSource r0 = me.magnum.melonds.domain.model.MicSource.BLOW
            java.lang.String r1 = r0.name()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r2 = "mic_source"
            java.lang.String r6 = r6.getString(r2, r1)
            if (r6 != 0) goto L1a
            goto L45
        L1a:
            me.magnum.melonds.domain.model.MicSource[] r1 = me.magnum.melonds.domain.model.MicSource.values()     // Catch: java.lang.Throwable -> L23
            java.lang.Enum r1 = defpackage.jw2.o(r6, r1)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L2a:
            java.lang.Throwable r2 = defpackage.hm5.a(r1)
            if (r2 == 0) goto L3d
            java.lang.String r2 = r0.name()
            java.lang.String r3 = "Invalid enum preference mic_source="
            java.lang.String r4 = "; using "
            java.lang.String r5 = "SPSettingsRepository"
            defpackage.lb1.w(r3, r6, r4, r2, r5)
        L3d:
            boolean r6 = r1 instanceof defpackage.em5
            if (r6 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            java.lang.Enum r0 = (java.lang.Enum) r0
        L45:
            me.magnum.melonds.domain.model.MicSource r0 = (me.magnum.melonds.domain.model.MicSource) r0
            return r0
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            java.util.LinkedHashMap r0 = r0.h
            java.lang.Object r0 = r0.get(r2)
            na4 r0 = (defpackage.na4) r0
            if (r0 == 0) goto L12
            jg7 r1 = defpackage.jg7.a
            r0.k(r1)
        L12:
            return
    }

    public final defpackage.wp0 p(java.lang.String r5, defpackage.on2 r6) {
            r4 = this;
            java.util.LinkedHashMap r4 = r4.h
            java.lang.Object r0 = r4.get(r5)
            if (r0 != 0) goto L19
            m80 r0 = defpackage.m80.DROP_OLDEST
            r1 = 2
            r2 = 1
            r3 = 0
            of6 r0 = defpackage.pf6.b(r2, r3, r0, r1)
            jg7 r1 = defpackage.jg7.a
            r0.k(r1)
            r4.put(r5, r0)
        L19:
            na4 r0 = (defpackage.na4) r0
            wp0 r4 = new wp0
            r5 = 8
            r4.<init>(r5, r0, r6)
            return r4
    }

    public final defpackage.jx5 q() {
            r6 = this;
            jx5 r0 = defpackage.jx5.NONE
            java.lang.String r1 = r0.name()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r2 = "rom_icon_filtering"
            java.lang.String r6 = r6.getString(r2, r1)
            if (r6 != 0) goto L1a
            goto L45
        L1a:
            jx5[] r1 = defpackage.jx5.values()     // Catch: java.lang.Throwable -> L23
            java.lang.Enum r1 = defpackage.jw2.o(r6, r1)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L2a:
            java.lang.Throwable r2 = defpackage.hm5.a(r1)
            if (r2 == 0) goto L3d
            java.lang.String r2 = r0.name()
            java.lang.String r3 = "Invalid enum preference rom_icon_filtering="
            java.lang.String r4 = "; using "
            java.lang.String r5 = "SPSettingsRepository"
            defpackage.lb1.w(r3, r6, r4, r2, r5)
        L3d:
            boolean r6 = r1 instanceof defpackage.em5
            if (r6 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            java.lang.Enum r0 = (java.lang.Enum) r0
        L45:
            jx5 r0 = (defpackage.jx5) r0
            return r0
    }

    public final android.net.Uri[] r() {
            r3 = this;
            java.lang.String r0 = "rom_search_dirs"
            du1 r1 = defpackage.du1.A
            android.content.SharedPreferences r3 = r3.b
            java.util.Set r3 = r3.getStringSet(r0, r1)
            r0 = 0
            if (r3 == 0) goto L41
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r3, r2)
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.add(r2)
            goto L1e
        L35:
            android.net.Uri[] r3 = new android.net.Uri[r0]
            java.lang.Object[] r3 = r1.toArray(r3)
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            if (r3 != 0) goto L40
            goto L41
        L40:
            return r3
        L41:
            android.net.Uri[] r3 = new android.net.Uri[r0]
            return r3
    }

    public final defpackage.gn6 s() {
            r2 = this;
            android.content.SharedPreferences r2 = r2.b
            java.lang.String r0 = "rom_sorting_mode"
            java.lang.String r1 = "alphabetically"
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 != 0) goto Ld
            goto Le
        Ld:
            r1 = r2
        Le:
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r1.toUpperCase(r2)     // Catch: java.lang.Throwable -> L1c
            r2.getClass()     // Catch: java.lang.Throwable -> L1c
            gn6 r2 = defpackage.gn6.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r2 = move-exception
            em5 r0 = new em5
            r0.<init>(r2)
            r2 = r0
        L23:
            gn6 r0 = defpackage.gn6.ALPHABETICALLY
            boolean r1 = r2 instanceof defpackage.em5
            if (r1 == 0) goto L2a
            r2 = r0
        L2a:
            gn6 r2 = (defpackage.gn6) r2
            return r2
    }

    public final defpackage.n06 t() {
            r2 = this;
            android.content.SharedPreferences r2 = r2.b
            java.lang.String r0 = "rom_view_mode"
            java.lang.String r1 = "grid"
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 != 0) goto Ld
            goto Le
        Ld:
            r1 = r2
        Le:
            n06[] r2 = defpackage.n06.values()     // Catch: java.lang.Throwable -> L19
            java.lang.Enum r2 = defpackage.jw2.o(r1, r2)     // Catch: java.lang.Throwable -> L19
            n06 r2 = (defpackage.n06) r2     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            em5 r0 = new em5
            r0.<init>(r2)
            r2 = r0
        L20:
            n06 r0 = defpackage.n06.GRID
            boolean r1 = r2 instanceof defpackage.em5
            if (r1 == 0) goto L27
            r2 = r0
        L27:
            n06 r2 = (defpackage.n06) r2
            return r2
    }

    public final android.net.Uri u(defpackage.pq5 r7) {
            r6 = this;
            r7.getClass()
            android.content.SharedPreferences r0 = r6.b
            java.lang.String r1 = "use_rom_dir"
            r2 = 1
            boolean r3 = r0.getBoolean(r1, r2)
            r4 = 0
            if (r3 != 0) goto L45
            java.lang.String r3 = "sram_dir"
            java.util.Set r5 = r0.getStringSet(r3, r4)
            if (r5 == 0) goto L20
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r5 = defpackage.gt0.I0(r5)
            java.lang.String r5 = (java.lang.String) r5
            goto L21
        L20:
            r5 = r4
        L21:
            if (r5 == 0) goto L28
            android.net.Uri r5 = android.net.Uri.parse(r5)
            goto L29
        L28:
            r5 = r4
        L29:
            if (r5 == 0) goto L45
            java.util.Set r6 = r0.getStringSet(r3, r4)
            if (r6 == 0) goto L3a
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = defpackage.gt0.I0(r6)
            java.lang.String r6 = (java.lang.String) r6
            goto L3b
        L3a:
            r6 = r4
        L3b:
            if (r6 == 0) goto L41
            android.net.Uri r4 = android.net.Uri.parse(r6)
        L41:
            r4.getClass()
            return r4
        L45:
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L68
            android.net.Uri r7 = r7.e
            if (r7 == 0) goto L68
            if (r7 == 0) goto L60
            uh7 r6 = r6.d
            zl1 r6 = r6.b(r7)
            if (r6 == 0) goto L5d
            android.net.Uri r4 = r6.j()
        L5d:
            if (r4 == 0) goto L60
            return r4
        L60:
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = "Could not determine ROMs parent document"
            r6.<init>(r7)
            throw r6
        L68:
            java.io.File r7 = new java.io.File
            java.io.File r0 = r6.j()
            java.lang.String r1 = "save"
            r7.<init>(r0, r1)
            boolean r0 = r7.isDirectory()
            if (r0 != 0) goto L92
            boolean r0 = r7.mkdirs()
            if (r0 != 0) goto L92
            java.io.File r7 = new java.io.File
            android.content.Context r6 = r6.a
            java.io.File r6 = r6.getExternalFilesDir(r4)
            r7.<init>(r6, r1)
            r7.mkdirs()
            android.net.Uri r6 = android.net.Uri.fromFile(r7)
            goto L96
        L92:
            android.net.Uri r6 = android.net.Uri.fromFile(r7)
        L96:
            r6.getClass()
            return r6
    }

    public final java.util.UUID v() {
            r2 = this;
            java.lang.String r0 = "input_layout_id"
            r1 = 0
            android.content.SharedPreferences r2 = r2.b
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 == 0) goto L13
            java.util.UUID r2 = java.util.UUID.fromString(r2)
            if (r2 != 0) goto L12
            goto L13
        L12:
            return r2
        L13:
            java.util.UUID r2 = defpackage.fk3.h
            return r2
    }

    public final defpackage.zq7 w() {
            r4 = this;
            java.lang.String r0 = r4.x()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.List r4 = r4.n()
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            r3 = r2
            zq7 r3 = (defpackage.zq7) r3
            java.lang.String r3 = r3.a
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L10
            r1 = r2
        L26:
            zq7 r1 = (defpackage.zq7) r1
            return r1
    }

    public final java.lang.String x() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.b
            java.lang.String r1 = "video_vulkan_selected_driver_id"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L1b
            java.util.List r3 = r3.n()
            java.lang.Object r3 = defpackage.gt0.J0(r3)
            zq7 r3 = (defpackage.zq7) r3
            if (r3 == 0) goto L1a
            java.lang.String r3 = r3.a
            return r3
        L1a:
            return r2
        L1b:
            return r0
    }

    public final defpackage.zl1 y(android.net.Uri r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            goto L16
        L4:
            java.lang.String r1 = r5.getScheme()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "file"
            boolean r1 = defpackage.nb3.k(r1, r2)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L32
            java.lang.String r4 = r5.getPath()     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L17
        L16:
            return r0
        L17:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r1.exists()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L30
            boolean r4 = r1.isDirectory()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L30
            vd5 r4 = new vd5     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            goto L3f
        L2e:
            r4 = move-exception
            goto L39
        L30:
            r4 = r0
            goto L3f
        L32:
            android.content.Context r4 = r4.a     // Catch: java.lang.Throwable -> L2e
            qi6 r4 = defpackage.zl1.h(r4, r5)     // Catch: java.lang.Throwable -> L2e
            goto L3f
        L39:
            em5 r1 = new em5
            r1.<init>(r4)
            r4 = r1
        L3f:
            java.lang.Throwable r1 = defpackage.hm5.a(r4)
            if (r1 == 0) goto L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not access restored tree preference "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = "="
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r6 = "SPSettingsRepository"
            android.util.Log.w(r6, r5, r1)
        L60:
            boolean r5 = r4 instanceof defpackage.em5
            if (r5 == 0) goto L65
            goto L66
        L65:
            r0 = r4
        L66:
            zl1 r0 = (defpackage.zl1) r0
            return r0
    }

    public final defpackage.yq7 z(java.lang.String r14) {
            r13 = this;
            zq7 r0 = r13.w()
            android.content.Context r1 = r13.a
            r2 = 0
            if (r0 == 0) goto L75
            java.lang.String r3 = r0.c
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r0.d
            r4.<init>(r3, r5)
            boolean r4 = r4.isFile()
            if (r4 == 0) goto L19
            goto L76
        L19:
            java.io.File r4 = new java.io.File
            java.io.File r6 = r1.getFilesDir()
            java.lang.String r7 = "adreno-drivers"
            r4.<init>(r6, r7)
            ic2 r6 = defpackage.ic2.TOP_DOWN
            hc2 r4 = defpackage.jc2.E0(r4, r6)
            fc2 r6 = new fc2
            r6.<init>(r4)
        L2f:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r6.next()
            r7 = r4
            java.io.File r7 = (java.io.File) r7
            boolean r8 = r7.isFile()
            if (r8 == 0) goto L2f
            java.lang.String r7 = r7.getName()
            boolean r7 = defpackage.nb3.k(r7, r5)
            if (r7 == 0) goto L2f
            goto L4e
        L4d:
            r4 = r2
        L4e:
            java.io.File r4 = (java.io.File) r4
            if (r4 != 0) goto L53
            goto L76
        L53:
            java.io.File r4 = r4.getParentFile()
            if (r4 == 0) goto L61
            java.lang.String r4 = r4.getAbsolutePath()
            if (r4 != 0) goto L60
            goto L61
        L60:
            r3 = r4
        L61:
            java.lang.String r4 = r0.a
            java.lang.String r0 = r0.b
            r0.getClass()
            r3.getClass()
            r5.getClass()
            zq7 r6 = new zq7
            r6.<init>(r4, r0, r3, r5)
            r0 = r6
            goto L76
        L75:
            r0 = r2
        L76:
            sr7 r13 = r13.A()
            sr7 r3 = defpackage.sr7.CUSTOM
            r4 = 0
            if (r13 != r3) goto L89
            if (r0 == 0) goto L89
            boolean r13 = defpackage.q60.N(r1)
            if (r13 == 0) goto L89
            r13 = 1
            goto L8a
        L89:
            r13 = r4
        L8a:
            java.io.File r5 = new java.io.File
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r6 = "adrenotools/tmp"
            r5.<init>(r1, r6)
            r5.mkdirs()
            if (r13 == 0) goto L9c
        L9a:
            r7 = r3
            goto L9f
        L9c:
            sr7 r3 = defpackage.sr7.SYSTEM
            goto L9a
        L9f:
            java.lang.String r8 = r5.getAbsolutePath()
            r8.getClass()
            if (r0 == 0) goto Lc5
            if (r13 == 0) goto Lac
            r1 = r0
            goto Lad
        Lac:
            r1 = r2
        Lad:
            if (r1 == 0) goto Lc5
            java.lang.String r1 = r1.c
            if (r1 == 0) goto Lc5
            java.lang.String r3 = java.io.File.separator
            r3.getClass()
            boolean r4 = defpackage.xs6.Y(r1, r3, r4)
            if (r4 == 0) goto Lbf
            goto Lc3
        Lbf:
            java.lang.String r1 = r1.concat(r3)
        Lc3:
            r10 = r1
            goto Lc6
        Lc5:
            r10 = r2
        Lc6:
            if (r0 == 0) goto Ld3
            if (r13 == 0) goto Lcc
            r1 = r0
            goto Lcd
        Lcc:
            r1 = r2
        Lcd:
            if (r1 == 0) goto Ld3
            java.lang.String r1 = r1.d
            r11 = r1
            goto Ld4
        Ld3:
            r11 = r2
        Ld4:
            if (r0 == 0) goto Lde
            if (r13 == 0) goto Ld9
            goto Lda
        Ld9:
            r0 = r2
        Lda:
            if (r0 == 0) goto Lde
            java.lang.String r2 = r0.b
        Lde:
            r12 = r2
            yq7 r6 = new yq7
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
    }
}
