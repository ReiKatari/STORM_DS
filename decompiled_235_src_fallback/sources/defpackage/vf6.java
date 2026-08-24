package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vf6 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ng6 B;

    public /* synthetic */ vf6(defpackage.ng6 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r6 = this;
            int r0 = r6.A
            r1 = 1
            r2 = 0
            ng6 r6 = r6.B
            switch(r0) {
                case 0: goto Lf7;
                case 1: goto Lea;
                case 2: goto Ldd;
                case 3: goto Ld8;
                case 4: goto Lcb;
                case 5: goto Lc6;
                case 6: goto Lb9;
                case 7: goto Lac;
                case 8: goto La7;
                case 9: goto La2;
                case 10: goto L95;
                case 11: goto L90;
                case 12: goto L83;
                case 13: goto L7e;
                case 14: goto L71;
                case 15: goto L64;
                case 16: goto L51;
                default: goto L9;
            }
        L9:
            h91 r0 = defpackage.h91.PHYSICAL_CAMERAS
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r1 = r0.name()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            java.lang.String r2 = "dsi_camera_source"
            java.lang.String r6 = r6.getString(r2, r1)
            if (r6 != 0) goto L23
            goto L4e
        L23:
            h91[] r1 = defpackage.h91.values()     // Catch: java.lang.Throwable -> L2c
            java.lang.Enum r1 = defpackage.jw2.o(r6, r1)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L33:
            java.lang.Throwable r2 = defpackage.hm5.a(r1)
            if (r2 == 0) goto L46
            java.lang.String r2 = r0.name()
            java.lang.String r3 = "Invalid enum preference dsi_camera_source="
            java.lang.String r4 = "; using "
            java.lang.String r5 = "SPSettingsRepository"
            defpackage.lb1.w(r3, r6, r4, r2, r5)
        L46:
            boolean r6 = r1 instanceof defpackage.em5
            if (r6 == 0) goto L4b
            goto L4c
        L4b:
            r0 = r1
        L4c:
            java.lang.Enum r0 = (java.lang.Enum) r0
        L4e:
            h91 r0 = (defpackage.h91) r0
            return r0
        L51:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "video_conservative_coverage_px"
            r1 = 150(0x96, float:2.1E-43)
            int r6 = r6.getInt(r0, r1)
            float r6 = (float) r6
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            return r6
        L64:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "video_renderer_debug_tools_enabled"
            boolean r6 = r6.getBoolean(r0, r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L71:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "video_retroarch_shader_clear_history"
            boolean r6 = r6.getBoolean(r0, r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L7e:
            u82 r6 = r6.m()
            return r6
        L83:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "external_display_keep_ratio"
            boolean r6 = r6.getBoolean(r0, r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L90:
            android.net.Uri[] r6 = r6.r()
            return r6
        L95:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "ra_enabled"
            boolean r6 = r6.getBoolean(r0, r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        La2:
            p66 r6 = r6.h()
            return r6
        La7:
            p66 r6 = r6.g()
            return r6
        Lac:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "dual_screen_internal_fill_height"
            boolean r6 = r6.getBoolean(r0, r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Lb9:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "dual_screen_external_fill_width"
            boolean r6 = r6.getBoolean(r0, r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Lc6:
            me.magnum.melonds.domain.model.ConsoleType r6 = r6.f()
            return r6
        Lcb:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "dual_screen_external_fill_height"
            boolean r6 = r6.getBoolean(r0, r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Ld8:
            jq1 r6 = r6.i()
            return r6
        Ldd:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "dual_screen_integer_scale"
            boolean r6 = r6.getBoolean(r0, r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Lea:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "dual_screen_internal_fill_width"
            boolean r6 = r6.getBoolean(r0, r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Lf7:
            android.content.SharedPreferences r6 = r6.b
            java.lang.String r0 = "system_disable_touch_gestures_on_touch_screen_area"
            boolean r6 = r6.getBoolean(r0, r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
    }
}
