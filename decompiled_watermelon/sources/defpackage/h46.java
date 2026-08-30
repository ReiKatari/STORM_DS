package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.domain.model.VideoFiltering;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h46 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ b56 B;

    public /* synthetic */ h46(b56 b56Var, int i) {
        this.A = i;
        this.B = b56Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        m11 m11Var;
        Object kc5Var;
        String str;
        String str2;
        Object kc5Var2;
        int i = this.A;
        int i2 = 1;
        b56 b56Var = this.B;
        switch (i) {
            case 0:
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(b56Var.a.getFilesDir(), "controller_config.json"));
                    t63 t63Var = b56Var.c;
                    m93 serializer = n11.Companion.serializer();
                    serializer.getClass();
                    t71 t71Var = new t71(fileInputStream);
                    gk0 gk0Var = (gk0) t71Var.B;
                    try {
                        Object n = ep2.n(t63Var, serializer, t71Var);
                        gk0Var.getClass();
                        n70 n70Var = n70.c;
                        byte[] array = gk0Var.c.array();
                        array.getClass();
                        n70Var.getClass();
                        n70Var.a(array);
                        m11Var = ((n11) n).a();
                        fileInputStream.close();
                    } catch (Throwable th) {
                        gk0Var.getClass();
                        n70 n70Var2 = n70.c;
                        byte[] array2 = gk0Var.c.array();
                        array2.getClass();
                        n70Var2.getClass();
                        n70Var2.a(array2);
                        throw th;
                    }
                } catch (Exception unused) {
                    f03 f03Var = new f03(yz2.A, new c03(97, null), 4);
                    f03 f03Var2 = new f03(yz2.B, new c03(96, null), 4);
                    f03 f03Var3 = new f03(yz2.X, new c03(100, null), 4);
                    f03 f03Var4 = new f03(yz2.Y, new c03(99, null), 4);
                    yz2 yz2Var = yz2.LEFT;
                    a03 a03Var = a03.NEGATIVE;
                    f03 f03Var5 = new f03(yz2Var, new b03(null, 15, a03Var), new b03(null, 0, a03Var));
                    yz2 yz2Var2 = yz2.RIGHT;
                    a03 a03Var2 = a03.POSITIVE;
                    m11Var = new m11(l07.c0(f03Var, f03Var2, f03Var3, f03Var4, f03Var5, new f03(yz2Var2, new b03(null, 15, a03Var2), new b03(null, 0, a03Var2)), new f03(yz2.UP, new b03(null, 16, a03Var), new b03(null, 1, a03Var)), new f03(yz2.DOWN, new b03(null, 16, a03Var2), new b03(null, 1, a03Var2)), new f03(yz2.L, new c03(102, null), 4), new f03(yz2.R, new c03(103, null), 4), new f03(yz2.START, new c03(108, null), 4), new f03(yz2.SELECT, new c03(109, null), 4), new f03(yz2.PAUSE, new c03(110, null), 4)));
                }
                return fe6.a(m11Var);
            case 1:
                return Boolean.valueOf(b56Var.b.getBoolean("video_conservative_coverage_apply_clamp", false));
            case 2:
                String string = b56Var.b.getString("video_filtering", "none");
                string.getClass();
                try {
                    String upperCase = string.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    kc5Var = VideoFiltering.valueOf(upperCase);
                } catch (Throwable th2) {
                    kc5Var = new kc5(th2);
                }
                Object obj = VideoFiltering.NONE;
                if (kc5Var instanceof kc5) {
                    kc5Var = obj;
                }
                return (VideoFiltering) kc5Var;
            case 3:
                String string2 = b56Var.b.getString("video_internal_resolution", "1");
                string2.getClass();
                Integer o0 = gh6.o0(string2);
                if (o0 != null) {
                    i2 = o0.intValue();
                }
                return Integer.valueOf(i2);
            case 4:
                return Boolean.valueOf(b56Var.b.getBoolean("video_debug_3d_clear_magenta", false));
            case 5:
                return Boolean.valueOf(b56Var.b.getBoolean("video_conservative_coverage_apply_repeat", true));
            case ig7.b /* 6 */:
                return Boolean.valueOf(b56Var.b.getBoolean("video_renderer_debug_latch_trace_enabled", false));
            case 7:
                return Boolean.valueOf(b56Var.b.getBoolean("video_renderer_debug_bgobj_enabled", false));
            case 8:
                return b56Var.b.getString("video_retroarch_shader_preset", null);
            case 9:
                return b56.F(b56Var.b.getString("video_retroarch_shader_parameters", null));
            case 10:
                return Boolean.valueOf(b56Var.b.getBoolean("enable_threaded_rendering", true));
            case 11:
                return Boolean.valueOf(b56Var.b.getBoolean("system_app_log_file_enabled", false));
            case mj2.L /* 12 */:
                return Long.valueOf(b56Var.b.getLong("video_retroarch_shader_library_version", 0L));
            case 13:
                return Boolean.valueOf(b56Var.b.getBoolean("video_conservative_coverage_enabled", false));
            case 14:
                return b56Var.b.getString("video_retroarch_shader_source", null);
            case ig7.e /* 15 */:
                return Float.valueOf(b56Var.b.getInt("video_conservative_coverage_depth_bias", 0) / 1000000.0f);
            case 16:
                return b56Var.e();
            case 17:
                Set<String> stringSet = b56Var.b.getStringSet("video_retroarch_shader_root", null);
                if (stringSet == null || (str = (String) tq0.L0(stringSet)) == null) {
                    return null;
                }
                return Uri.parse(str);
            case 18:
                return Boolean.valueOf(b56Var.b.getBoolean("video_vulkan_fastpath_enabled", false));
            case 19:
                Set<String> stringSet2 = b56Var.b.getStringSet("dsi_camera_static_image", null);
                if (stringSet2 != null) {
                    str2 = (String) tq0.L0(stringSet2);
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                return Uri.parse(str2);
            case 20:
                Enum r1 = ps6.LIGHT;
                SharedPreferences sharedPreferences = b56Var.b;
                String lowerCase = r1.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String string3 = sharedPreferences.getString("theme", lowerCase);
                if (string3 != null) {
                    try {
                        kc5Var2 = se.t(string3, ps6.values());
                    } catch (Throwable th3) {
                        kc5Var2 = new kc5(th3);
                    }
                    if (nc5.a(kc5Var2) != null) {
                        wh1.y("Invalid enum preference theme=", string3, "; using ", r1.name(), "SPSettingsRepository");
                    }
                    Enum r12 = r1;
                    if (!(kc5Var2 instanceof kc5)) {
                        r12 = kc5Var2;
                    }
                    r1 = r12;
                }
                return (ps6) r1;
            case 21:
                return b56Var.v();
            case 22:
                return Boolean.valueOf(b56Var.b.getBoolean("input_touch_haptic_feedback_enabled", true));
            case 23:
                return b56Var.t();
            case 24:
                return Integer.valueOf(b56Var.b.getInt("input_opacity", 50));
            case 25:
                return b56Var.q();
            case 26:
                return Boolean.valueOf(b56Var.b.getBoolean("rom_ra_covers_enabled", true));
            case 27:
                return b56Var.b.getString("video_retroarch_shader_parameters", null);
            case 28:
                String string4 = b56Var.b.getString("soft_input_behaviour", "hide_system_buttons_when_controller_connected");
                if (string4 != null) {
                    switch (string4.hashCode()) {
                        case -329143742:
                            if (string4.equals("always_visible")) {
                                return fb6.ALWAYS_VISIBLE;
                            }
                            break;
                        case 264288026:
                            if (string4.equals("hide_system_buttons_when_controller_connected")) {
                                return fb6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED;
                            }
                            break;
                        case 482345502:
                            if (string4.equals("hide_mapped_buttons_when_controller_connected")) {
                                return fb6.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS;
                            }
                            break;
                        case 2049787261:
                            if (string4.equals("always_invisible")) {
                                return fb6.ALWAYS_INVISIBLE;
                            }
                            break;
                    }
                }
                return fb6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED;
            default:
                return b56Var.o();
        }
    }
}
