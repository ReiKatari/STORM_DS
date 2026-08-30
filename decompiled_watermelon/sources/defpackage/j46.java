package defpackage;

import android.content.SharedPreferences;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j46 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ b56 B;

    public /* synthetic */ j46(b56 b56Var, int i) {
        this.A = i;
        this.B = b56Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        Object kc5Var;
        int i = this.A;
        b56 b56Var = this.B;
        switch (i) {
            case 0:
                return Boolean.valueOf(b56Var.b.getBoolean("system_disable_touch_gestures_on_touch_screen_area", false));
            case 1:
                return Boolean.valueOf(b56Var.b.getBoolean("dual_screen_internal_fill_width", false));
            case 2:
                return Boolean.valueOf(b56Var.b.getBoolean("dual_screen_integer_scale", false));
            case 3:
                return b56Var.i();
            case 4:
                return Boolean.valueOf(b56Var.b.getBoolean("dual_screen_external_fill_height", false));
            case 5:
                return b56Var.f();
            case ig7.b /* 6 */:
                return Boolean.valueOf(b56Var.b.getBoolean("dual_screen_external_fill_width", false));
            case 7:
                return Boolean.valueOf(b56Var.b.getBoolean("dual_screen_internal_fill_height", false));
            case 8:
                return b56Var.g();
            case 9:
                return b56Var.h();
            case 10:
                return Boolean.valueOf(b56Var.b.getBoolean("ra_enabled", true));
            case 11:
                return b56Var.r();
            case mj2.L /* 12 */:
                return Boolean.valueOf(b56Var.b.getBoolean("external_display_keep_ratio", true));
            case 13:
                return b56Var.l();
            case 14:
                return Boolean.valueOf(b56Var.b.getBoolean("video_retroarch_shader_clear_history", false));
            case ig7.e /* 15 */:
                return Boolean.valueOf(b56Var.b.getBoolean("video_renderer_debug_tools_enabled", false));
            case 16:
                return Float.valueOf(b56Var.b.getInt("video_conservative_coverage_px", 150) / 100.0f);
            default:
                Enum r0 = t51.PHYSICAL_CAMERAS;
                SharedPreferences sharedPreferences = b56Var.b;
                String lowerCase = r0.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String string = sharedPreferences.getString("dsi_camera_source", lowerCase);
                if (string != null) {
                    try {
                        kc5Var = se.t(string, t51.values());
                    } catch (Throwable th) {
                        kc5Var = new kc5(th);
                    }
                    if (nc5.a(kc5Var) != null) {
                        wh1.y("Invalid enum preference dsi_camera_source=", string, "; using ", r0.name(), "SPSettingsRepository");
                    }
                    Enum r02 = r0;
                    if (!(kc5Var instanceof kc5)) {
                        r02 = kc5Var;
                    }
                    r0 = r02;
                }
                return (t51) r0;
        }
    }
}
