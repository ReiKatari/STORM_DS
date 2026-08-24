package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.common.MlKitException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.domain.model.VideoFiltering;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tf6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tf6 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ng6 B;

    public /* synthetic */ tf6(ng6 ng6Var, int i) {
        this.A = i;
        this.B = ng6Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        u41 u41Var;
        Object em5Var;
        int i;
        String str;
        String str2;
        Object em5Var2;
        int i2 = this.A;
        ng6 ng6Var = this.B;
        switch (i2) {
            case 0:
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(ng6Var.a.getFilesDir(), "controller_config.json"));
                    id3 id3Var = ng6Var.c;
                    gg3 serializer = v41.Companion.serializer();
                    serializer.getClass();
                    s63 s63Var = new s63(fileInputStream);
                    pm0 pm0Var = (pm0) s63Var.B;
                    Object s = oi2.s(id3Var, serializer, s63Var);
                    pm0Var.getClass();
                    u90 u90Var = u90.c;
                    byte[] array = pm0Var.c.array();
                    array.getClass();
                    u90Var.getClass();
                    u90Var.a(array);
                    u41Var = ((v41) s).a();
                    fileInputStream.close();
                } catch (Exception unused) {
                    i63 i63Var = new i63(b63.A, new f63(97, null), 4);
                    i63 i63Var2 = new i63(b63.B, new f63(96, null), 4);
                    i63 i63Var3 = new i63(b63.X, new f63(100, null), 4);
                    i63 i63Var4 = new i63(b63.Y, new f63(99, null), 4);
                    b63 b63Var = b63.LEFT;
                    d63 d63Var = d63.NEGATIVE;
                    i63 i63Var5 = new i63(b63Var, new e63(null, 15, d63Var), new e63(null, 0, d63Var));
                    b63 b63Var2 = b63.RIGHT;
                    d63 d63Var2 = d63.POSITIVE;
                    u41Var = new u41(hf.c0(i63Var, i63Var2, i63Var3, i63Var4, i63Var5, new i63(b63Var2, new e63(null, 15, d63Var2), new e63(null, 0, d63Var2)), new i63(b63.UP, new e63(null, 16, d63Var), new e63(null, 1, d63Var)), new i63(b63.DOWN, new e63(null, 16, d63Var2), new e63(null, 1, d63Var2)), new i63(b63.L, new f63(MlKitException.MODEL_HASH_MISMATCH, null), 4), new i63(b63.R, new f63(103, null), 4), new i63(b63.START, new f63(108, null), 4), new i63(b63.SELECT, new f63(109, null), 4), new i63(b63.PAUSE, new f63(110, null), 4)));
                }
                return up6.a(u41Var);
            case 1:
                return Boolean.valueOf(ng6Var.b.getBoolean("video_conservative_coverage_apply_clamp", false));
            case 2:
                String str3 = "quilez";
                String string = ng6Var.b.getString("video_filtering", "quilez");
                if (string != null) {
                    str3 = string;
                }
                try {
                    String upperCase = str3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    em5Var = VideoFiltering.valueOf(upperCase);
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                Object obj = VideoFiltering.QUILEZ;
                if (em5Var instanceof em5) {
                    em5Var = obj;
                }
                return (VideoFiltering) em5Var;
            case 3:
                String str4 = "2";
                String string2 = ng6Var.b.getString("video_internal_resolution", "2");
                if (string2 != null) {
                    str4 = string2;
                }
                Integer h0 = xs6.h0(str4);
                if (h0 != null) {
                    i = h0.intValue();
                } else {
                    i = 2;
                }
                return Integer.valueOf(i);
            case 4:
                return Boolean.valueOf(ng6Var.b.getBoolean("video_debug_3d_clear_magenta", false));
            case 5:
                return Boolean.valueOf(ng6Var.b.getBoolean("video_conservative_coverage_apply_repeat", true));
            case 6:
                return Boolean.valueOf(ng6Var.b.getBoolean("video_renderer_debug_latch_trace_enabled", false));
            case 7:
                return Boolean.valueOf(ng6Var.b.getBoolean("video_renderer_debug_bgobj_enabled", false));
            case 8:
                return ng6Var.b.getString("video_retroarch_shader_preset", null);
            case 9:
                return ng6.H(ng6Var.b.getString("video_retroarch_shader_parameters", null));
            case 10:
                return Boolean.valueOf(ng6Var.b.getBoolean("enable_threaded_rendering", true));
            case 11:
                return Boolean.valueOf(ng6Var.b.getBoolean("system_app_log_file_enabled", false));
            case 12:
                return Long.valueOf(ng6Var.b.getLong("video_retroarch_shader_library_version", 0L));
            case 13:
                return Boolean.valueOf(ng6Var.b.getBoolean("video_conservative_coverage_enabled", false));
            case 14:
                return ng6Var.b.getString("video_retroarch_shader_source", null);
            case 15:
                return Float.valueOf(ng6Var.b.getInt("video_conservative_coverage_depth_bias", 0) / 1000000.0f);
            case 16:
                return ng6Var.e();
            case 17:
                Set<String> stringSet = ng6Var.b.getStringSet("video_retroarch_shader_root", null);
                if (stringSet == null || (str = (String) gt0.I0(stringSet)) == null) {
                    return null;
                }
                return Uri.parse(str);
            case 18:
                return Boolean.valueOf(ng6Var.b.getBoolean("video_vulkan_fastpath_enabled", false));
            case 19:
                Set<String> stringSet2 = ng6Var.b.getStringSet("dsi_camera_static_image", null);
                if (stringSet2 != null) {
                    str2 = (String) gt0.I0(stringSet2);
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                return Uri.parse(str2);
            case 20:
                Enum r1 = g57.DARK;
                SharedPreferences sharedPreferences = ng6Var.b;
                String lowerCase = r1.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String string3 = sharedPreferences.getString("theme", lowerCase);
                if (string3 != null) {
                    try {
                        em5Var2 = jw2.o(string3, g57.values());
                    } catch (Throwable th2) {
                        em5Var2 = new em5(th2);
                    }
                    if (hm5.a(em5Var2) != null) {
                        lb1.w("Invalid enum preference theme=", string3, "; using ", r1.name(), "SPSettingsRepository");
                    }
                    Enum r12 = r1;
                    if (!(em5Var2 instanceof em5)) {
                        r12 = em5Var2;
                    }
                    r1 = r12;
                }
                return (g57) r1;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ng6Var.v();
            case 22:
                return Boolean.valueOf(ng6Var.b.getBoolean("input_touch_haptic_feedback_enabled", true));
            case ConnectionResult.API_DISABLED /* 23 */:
                return ng6Var.t();
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return Integer.valueOf(ng6Var.b.getInt("input_opacity", 50));
            case 25:
                return ng6Var.q();
            case SubAllocator.N4 /* 26 */:
                return Boolean.valueOf(ng6Var.b.getBoolean("rom_ra_covers_enabled", true));
            case 27:
                return ng6Var.b.getString("video_retroarch_shader_parameters", null);
            case 28:
                String string4 = ng6Var.b.getString("soft_input_behaviour", "hide_system_buttons_when_controller_connected");
                if (string4 != null) {
                    switch (string4.hashCode()) {
                        case -329143742:
                            if (string4.equals("always_visible")) {
                                return um6.ALWAYS_VISIBLE;
                            }
                            break;
                        case 264288026:
                            if (string4.equals("hide_system_buttons_when_controller_connected")) {
                                return um6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED;
                            }
                            break;
                        case 482345502:
                            if (string4.equals("hide_mapped_buttons_when_controller_connected")) {
                                return um6.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS;
                            }
                            break;
                        case 2049787261:
                            if (string4.equals("always_invisible")) {
                                return um6.ALWAYS_INVISIBLE;
                            }
                            break;
                    }
                }
                return um6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED;
            default:
                return ng6Var.o();
        }
    }
}
