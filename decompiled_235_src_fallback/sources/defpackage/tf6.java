package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tf6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tf6 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ng6 B;

    public /* synthetic */ tf6(defpackage.ng6 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r19 = this;
            r0 = r19
            int r1 = r0.A
            java.lang.String r2 = "video_retroarch_shader_parameters"
            r3 = 1
            r4 = 0
            r5 = 0
            ng6 r0 = r0.B
            switch(r1) {
                case 0: goto L217;
                case 1: goto L20a;
                case 2: goto L1dd;
                case 3: goto L1be;
                case 4: goto L1b1;
                case 5: goto L1a4;
                case 6: goto L197;
                case 7: goto L18a;
                case 8: goto L181;
                case 9: goto L176;
                case 10: goto L169;
                case 11: goto L15c;
                case 12: goto L14d;
                case 13: goto L140;
                case 14: goto L137;
                case 15: goto L125;
                case 16: goto L120;
                case 17: goto L107;
                case 18: goto Lfa;
                case 19: goto Ldf;
                case 20: goto L97;
                case 21: goto L92;
                case 22: goto L85;
                case 23: goto L80;
                case 24: goto L71;
                case 25: goto L6c;
                case 26: goto L5f;
                case 27: goto L58;
                case 28: goto L13;
                default: goto Le;
            }
        Le:
            me.magnum.melonds.domain.model.MicSource r0 = r0.o()
            return r0
        L13:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "soft_input_behaviour"
            java.lang.String r2 = "hide_system_buttons_when_controller_connected"
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L55
            int r1 = r0.hashCode()
            switch(r1) {
                case -329143742: goto L49;
                case 264288026: goto L3f;
                case 482345502: goto L33;
                case 2049787261: goto L27;
                default: goto L26;
            }
        L26:
            goto L55
        L27:
            java.lang.String r1 = "always_invisible"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L55
        L30:
            um6 r0 = defpackage.um6.ALWAYS_INVISIBLE
            goto L57
        L33:
            java.lang.String r1 = "hide_mapped_buttons_when_controller_connected"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            goto L55
        L3c:
            um6 r0 = defpackage.um6.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS
            goto L57
        L3f:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L46
            goto L55
        L46:
            um6 r0 = defpackage.um6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED
            goto L57
        L49:
            java.lang.String r1 = "always_visible"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto L55
        L52:
            um6 r0 = defpackage.um6.ALWAYS_VISIBLE
            goto L57
        L55:
            um6 r0 = defpackage.um6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED
        L57:
            return r0
        L58:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r0 = r0.getString(r2, r4)
            return r0
        L5f:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "rom_ra_covers_enabled"
            boolean r0 = r0.getBoolean(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L6c:
            jx5 r0 = r0.q()
            return r0
        L71:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "input_opacity"
            r2 = 50
            int r0 = r0.getInt(r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L80:
            n06 r0 = r0.t()
            return r0
        L85:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "input_touch_haptic_feedback_enabled"
            boolean r0 = r0.getBoolean(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L92:
            java.util.UUID r0 = r0.v()
            return r0
        L97:
            g57 r1 = defpackage.g57.DARK
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r2 = r1.name()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            java.lang.String r3 = "theme"
            java.lang.String r2 = r0.getString(r3, r2)
            if (r2 != 0) goto Lb1
            goto Ldc
        Lb1:
            g57[] r0 = defpackage.g57.values()     // Catch: java.lang.Throwable -> Lba
            java.lang.Enum r0 = defpackage.jw2.o(r2, r0)     // Catch: java.lang.Throwable -> Lba
            goto Lc1
        Lba:
            r0 = move-exception
            em5 r3 = new em5
            r3.<init>(r0)
            r0 = r3
        Lc1:
            java.lang.Throwable r3 = defpackage.hm5.a(r0)
            if (r3 == 0) goto Ld4
            java.lang.String r3 = r1.name()
            java.lang.String r4 = "Invalid enum preference theme="
            java.lang.String r5 = "; using "
            java.lang.String r6 = "SPSettingsRepository"
            defpackage.lb1.w(r4, r2, r5, r3, r6)
        Ld4:
            boolean r2 = r0 instanceof defpackage.em5
            if (r2 == 0) goto Ld9
            goto Lda
        Ld9:
            r1 = r0
        Lda:
            java.lang.Enum r1 = (java.lang.Enum) r1
        Ldc:
            g57 r1 = (defpackage.g57) r1
            return r1
        Ldf:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "dsi_camera_static_image"
            java.util.Set r0 = r0.getStringSet(r1, r4)
            if (r0 == 0) goto Lf2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = defpackage.gt0.I0(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto Lf3
        Lf2:
            r0 = r4
        Lf3:
            if (r0 == 0) goto Lf9
            android.net.Uri r4 = android.net.Uri.parse(r0)
        Lf9:
            return r4
        Lfa:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_vulkan_fastpath_enabled"
            boolean r0 = r0.getBoolean(r1, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L107:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_retroarch_shader_root"
            java.util.Set r0 = r0.getStringSet(r1, r4)
            if (r0 == 0) goto L11f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = defpackage.gt0.I0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L11f
            android.net.Uri r4 = android.net.Uri.parse(r0)
        L11f:
            return r4
        L120:
            me.magnum.melonds.domain.model.VideoRenderer r0 = r0.e()
            return r0
        L125:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_conservative_coverage_depth_bias"
            int r0 = r0.getInt(r1, r5)
            float r0 = (float) r0
            r1 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L137:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_retroarch_shader_source"
            java.lang.String r0 = r0.getString(r1, r4)
            return r0
        L140:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_conservative_coverage_enabled"
            boolean r0 = r0.getBoolean(r1, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L14d:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_retroarch_shader_library_version"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L15c:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "system_app_log_file_enabled"
            boolean r0 = r0.getBoolean(r1, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L169:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "enable_threaded_rendering"
            boolean r0 = r0.getBoolean(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L176:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r0 = r0.getString(r2, r4)
            java.util.Map r0 = defpackage.ng6.H(r0)
            return r0
        L181:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_retroarch_shader_preset"
            java.lang.String r0 = r0.getString(r1, r4)
            return r0
        L18a:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_renderer_debug_bgobj_enabled"
            boolean r0 = r0.getBoolean(r1, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L197:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_renderer_debug_latch_trace_enabled"
            boolean r0 = r0.getBoolean(r1, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1a4:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_conservative_coverage_apply_repeat"
            boolean r0 = r0.getBoolean(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1b1:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_debug_3d_clear_magenta"
            boolean r0 = r0.getBoolean(r1, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1be:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_internal_resolution"
            java.lang.String r2 = "2"
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L1cb
            goto L1cc
        L1cb:
            r2 = r0
        L1cc:
            java.lang.Integer r0 = defpackage.xs6.h0(r2)
            if (r0 == 0) goto L1d7
            int r0 = r0.intValue()
            goto L1d8
        L1d7:
            r0 = 2
        L1d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L1dd:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_filtering"
            java.lang.String r2 = "quilez"
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L1ea
            goto L1eb
        L1ea:
            r2 = r0
        L1eb:
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r0 = r2.toUpperCase(r0)     // Catch: java.lang.Throwable -> L1f9
            r0.getClass()     // Catch: java.lang.Throwable -> L1f9
            me.magnum.melonds.domain.model.VideoFiltering r0 = me.magnum.melonds.domain.model.VideoFiltering.valueOf(r0)     // Catch: java.lang.Throwable -> L1f9
            goto L200
        L1f9:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L200:
            me.magnum.melonds.domain.model.VideoFiltering r1 = me.magnum.melonds.domain.model.VideoFiltering.QUILEZ
            boolean r2 = r0 instanceof defpackage.em5
            if (r2 == 0) goto L207
            r0 = r1
        L207:
            me.magnum.melonds.domain.model.VideoFiltering r0 = (me.magnum.melonds.domain.model.VideoFiltering) r0
            return r0
        L20a:
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r1 = "video_conservative_coverage_apply_clamp"
            boolean r0 = r0.getBoolean(r1, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L217:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L281
            android.content.Context r2 = r0.a     // Catch: java.lang.Exception -> L281
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Exception -> L281
            java.lang.String r6 = "controller_config.json"
            r1.<init>(r2, r6)     // Catch: java.lang.Exception -> L281
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L281
            r2.<init>(r1)     // Catch: java.lang.Exception -> L281
            id3 r0 = r0.c     // Catch: java.lang.Throwable -> L262
            v41$b r1 = defpackage.v41.Companion     // Catch: java.lang.Throwable -> L262
            gg3 r1 = r1.serializer()     // Catch: java.lang.Throwable -> L262
            gg3 r1 = (defpackage.gg3) r1     // Catch: java.lang.Throwable -> L262
            r1.getClass()     // Catch: java.lang.Throwable -> L262
            s63 r6 = new s63     // Catch: java.lang.Throwable -> L262
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L262
            java.lang.Object r7 = r6.B     // Catch: java.lang.Throwable -> L262
            pm0 r7 = (defpackage.pm0) r7     // Catch: java.lang.Throwable -> L262
            java.lang.Object r0 = defpackage.oi2.s(r0, r1, r6)     // Catch: java.lang.Throwable -> L265
            r7.getClass()     // Catch: java.lang.Throwable -> L262
            u90 r1 = defpackage.u90.c     // Catch: java.lang.Throwable -> L262
            java.nio.ByteBuffer r6 = r7.c     // Catch: java.lang.Throwable -> L262
            byte[] r6 = r6.array()     // Catch: java.lang.Throwable -> L262
            r6.getClass()     // Catch: java.lang.Throwable -> L262
            r1.getClass()     // Catch: java.lang.Throwable -> L262
            r1.a(r6)     // Catch: java.lang.Throwable -> L262
            v41 r0 = (defpackage.v41) r0     // Catch: java.lang.Throwable -> L262
            u41 r0 = r0.a()     // Catch: java.lang.Throwable -> L262
            r2.close()     // Catch: java.lang.Exception -> L281
            goto L368
        L262:
            r0 = move-exception
            r1 = r0
            goto L27b
        L265:
            r0 = move-exception
            r7.getClass()     // Catch: java.lang.Throwable -> L262
            u90 r1 = defpackage.u90.c     // Catch: java.lang.Throwable -> L262
            java.nio.ByteBuffer r6 = r7.c     // Catch: java.lang.Throwable -> L262
            byte[] r6 = r6.array()     // Catch: java.lang.Throwable -> L262
            r6.getClass()     // Catch: java.lang.Throwable -> L262
            r1.getClass()     // Catch: java.lang.Throwable -> L262
            r1.a(r6)     // Catch: java.lang.Throwable -> L262
            throw r0     // Catch: java.lang.Throwable -> L262
        L27b:
            throw r1     // Catch: java.lang.Throwable -> L27c
        L27c:
            r0 = move-exception
            defpackage.ge7.t(r2, r1)     // Catch: java.lang.Exception -> L281
            throw r0     // Catch: java.lang.Exception -> L281
        L281:
            i63 r6 = new i63
            b63 r0 = defpackage.b63.A
            f63 r1 = new f63
            r2 = 97
            r1.<init>(r2, r4)
            r2 = 4
            r6.<init>(r0, r1, r2)
            i63 r7 = new i63
            b63 r0 = defpackage.b63.B
            f63 r1 = new f63
            r8 = 96
            r1.<init>(r8, r4)
            r7.<init>(r0, r1, r2)
            i63 r8 = new i63
            b63 r0 = defpackage.b63.X
            f63 r1 = new f63
            r9 = 100
            r1.<init>(r9, r4)
            r8.<init>(r0, r1, r2)
            i63 r9 = new i63
            b63 r0 = defpackage.b63.Y
            f63 r1 = new f63
            r10 = 99
            r1.<init>(r10, r4)
            r9.<init>(r0, r1, r2)
            i63 r10 = new i63
            b63 r0 = defpackage.b63.LEFT
            e63 r1 = new e63
            d63 r11 = defpackage.d63.NEGATIVE
            r12 = 15
            r1.<init>(r4, r12, r11)
            e63 r13 = new e63
            r13.<init>(r4, r5, r11)
            r10.<init>(r0, r1, r13)
            i63 r0 = new i63
            b63 r1 = defpackage.b63.RIGHT
            e63 r13 = new e63
            d63 r14 = defpackage.d63.POSITIVE
            r13.<init>(r4, r12, r14)
            e63 r12 = new e63
            r12.<init>(r4, r5, r14)
            r0.<init>(r1, r13, r12)
            i63 r12 = new i63
            b63 r1 = defpackage.b63.UP
            e63 r5 = new e63
            r13 = 16
            r5.<init>(r4, r13, r11)
            e63 r15 = new e63
            r15.<init>(r4, r3, r11)
            r12.<init>(r1, r5, r15)
            i63 r1 = new i63
            b63 r5 = defpackage.b63.DOWN
            e63 r11 = new e63
            r11.<init>(r4, r13, r14)
            e63 r13 = new e63
            r13.<init>(r4, r3, r14)
            r1.<init>(r5, r11, r13)
            i63 r14 = new i63
            b63 r3 = defpackage.b63.L
            f63 r5 = new f63
            r11 = 102(0x66, float:1.43E-43)
            r5.<init>(r11, r4)
            r14.<init>(r3, r5, r2)
            i63 r15 = new i63
            b63 r3 = defpackage.b63.R
            f63 r5 = new f63
            r11 = 103(0x67, float:1.44E-43)
            r5.<init>(r11, r4)
            r15.<init>(r3, r5, r2)
            i63 r3 = new i63
            b63 r5 = defpackage.b63.START
            f63 r11 = new f63
            r13 = 108(0x6c, float:1.51E-43)
            r11.<init>(r13, r4)
            r3.<init>(r5, r11, r2)
            i63 r5 = new i63
            b63 r11 = defpackage.b63.SELECT
            f63 r13 = new f63
            r19 = r0
            r0 = 109(0x6d, float:1.53E-43)
            r13.<init>(r0, r4)
            r5.<init>(r11, r13, r2)
            i63 r0 = new i63
            b63 r11 = defpackage.b63.PAUSE
            f63 r13 = new f63
            r16 = r1
            r1 = 110(0x6e, float:1.54E-43)
            r13.<init>(r1, r4)
            r0.<init>(r11, r13, r2)
            r11 = r19
            r18 = r0
            r17 = r5
            r13 = r16
            r16 = r3
            i63[] r0 = new defpackage.i63[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            java.util.List r0 = defpackage.hf.c0(r0)
            u41 r1 = new u41
            r1.<init>(r0)
            r0 = r1
        L368:
            tp6 r0 = defpackage.up6.a(r0)
            return r0
    }
}
