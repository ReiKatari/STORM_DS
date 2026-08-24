package defpackage;

import android.content.SharedPreferences;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vf6 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ng6 B;

    public /* synthetic */ vf6(ng6 ng6Var, int i) {
        this.A = i;
        this.B = ng6Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        Object em5Var;
        int i = this.A;
        ng6 ng6Var = this.B;
        switch (i) {
            case 0:
                return Boolean.valueOf(ng6Var.b.getBoolean("system_disable_touch_gestures_on_touch_screen_area", false));
            case 1:
                return Boolean.valueOf(ng6Var.b.getBoolean("dual_screen_internal_fill_width", false));
            case 2:
                return Boolean.valueOf(ng6Var.b.getBoolean("dual_screen_integer_scale", false));
            case 3:
                return ng6Var.i();
            case 4:
                return Boolean.valueOf(ng6Var.b.getBoolean("dual_screen_external_fill_height", false));
            case 5:
                return ng6Var.f();
            case 6:
                return Boolean.valueOf(ng6Var.b.getBoolean("dual_screen_external_fill_width", false));
            case 7:
                return Boolean.valueOf(ng6Var.b.getBoolean("dual_screen_internal_fill_height", false));
            case 8:
                return ng6Var.g();
            case 9:
                return ng6Var.h();
            case 10:
                return Boolean.valueOf(ng6Var.b.getBoolean("ra_enabled", true));
            case 11:
                return ng6Var.r();
            case 12:
                return Boolean.valueOf(ng6Var.b.getBoolean("external_display_keep_ratio", true));
            case 13:
                return ng6Var.m();
            case 14:
                return Boolean.valueOf(ng6Var.b.getBoolean("video_retroarch_shader_clear_history", false));
            case 15:
                return Boolean.valueOf(ng6Var.b.getBoolean("video_renderer_debug_tools_enabled", false));
            case 16:
                return Float.valueOf(ng6Var.b.getInt("video_conservative_coverage_px", 150) / 100.0f);
            default:
                Enum r0 = h91.PHYSICAL_CAMERAS;
                SharedPreferences sharedPreferences = ng6Var.b;
                String lowerCase = r0.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String string = sharedPreferences.getString("dsi_camera_source", lowerCase);
                if (string != null) {
                    try {
                        em5Var = jw2.o(string, h91.values());
                    } catch (Throwable th) {
                        em5Var = new em5(th);
                    }
                    if (hm5.a(em5Var) != null) {
                        lb1.w("Invalid enum preference dsi_camera_source=", string, "; using ", r0.name(), "SPSettingsRepository");
                    }
                    Enum r02 = r0;
                    if (!(em5Var instanceof em5)) {
                        r02 = em5Var;
                    }
                    r0 = r02;
                }
                return (h91) r0;
        }
    }
}
