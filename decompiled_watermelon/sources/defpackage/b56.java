package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b56  reason: default package */
/* loaded from: classes.dex */
public final class b56 implements w16, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final ue5 l = new ue5(null, lf5.VULKAN_IR, 0, 0, qp1.A, false);
    public final Context a;
    public final SharedPreferences b;
    public final t63 c;
    public final w37 d;
    public final v16 e;
    public final gf5 f;
    public final il6 g = new il6(new h46(this, 0));
    public final LinkedHashMap h = new LinkedHashMap();
    public final o45 i;
    public volatile String j;
    public volatile String k;

    public b56(Context context, SharedPreferences sharedPreferences, ij7 ij7Var, t63 t63Var, w37 w37Var, g11 g11Var, v16 v16Var, gf5 gf5Var) {
        String str;
        this.a = context;
        this.b = sharedPreferences;
        this.c = t63Var;
        this.d = w37Var;
        this.e = v16Var;
        this.f = gf5Var;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        if (sharedPreferences.getString("theme", null) == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "system";
            } else {
                str = "light";
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("theme", str);
            edit.apply();
        }
        if (sharedPreferences.getString("internal_mac_address", null) == null) {
            List list = vs3.b;
            vs3 N = mj2.N(null);
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putString("internal_mac_address", N.toString());
            edit2.apply();
        }
        this.i = se.U(se.j(new gb2(new gb2(new gb2(new gb2(new gb2(new ln0(6, new u92[]{p("video_renderer", new h46(this, 16)), p("video_filtering", new h46(this, 2)), p("enable_threaded_rendering", new h46(this, 10)), p("video_internal_resolution", new h46(this, 3)), p("video_vulkan_fastpath_enabled", new h46(this, 18))}, new r46(null)), A(), new s46(3, 0, null)), p("video_renderer_debug_bgobj_enabled", new h46(this, 7)), new s46(3, 1, null)), p("video_renderer_debug_latch_trace_enabled", new h46(this, 6)), new s46(3, 2, null)), new gb2(new ln0(6, new u92[]{p("video_conservative_coverage_enabled", new h46(this, 13)), p("video_conservative_coverage_px", new j46(this, 16)), p("video_conservative_coverage_depth_bias", new h46(this, 15)), p("video_conservative_coverage_apply_repeat", new h46(this, 5)), p("video_conservative_coverage_apply_clamp", new h46(this, 1))}, new t46(null)), p("video_debug_3d_clear_magenta", new h46(this, 4)), new rs(3, 3, null)), new bw1(3, 4, null)), new ln0(5, new u92[]{E(), D(), p("video_retroarch_shader_parameters", new h46(this, 9)), p("video_retroarch_shader_clear_history", new j46(this, 14))}, new y46(this, null)), new bw1(3, 3, null)), -1), g11Var, q56.b, 1);
    }

    public static Map F(String str) {
        qp1 qp1Var = qp1.A;
        if (str != null && !zg6.B0(str)) {
            mu muVar = new mu(4, str);
            fu5 fu5Var = new fu5(27);
            e06 e06Var = e06.c0;
            w72 z0 = d06.z0(new y82(muVar, fu5Var), new fu5(28));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            v72 v72Var = new v72(z0);
            while (v72Var.hasNext()) {
                ti4 ti4Var = (ti4) v72Var.next();
                linkedHashMap.put(ti4Var.A, ti4Var.B);
            }
            int size = linkedHashMap.size();
            if (size != 0) {
                if (size != 1) {
                    return linkedHashMap;
                }
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                singletonMap.getClass();
                return singletonMap;
            }
        }
        return qp1Var;
    }

    public static String H(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xc7 xc7Var = (xc7) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", xc7Var.a);
            jSONObject.put("displayName", xc7Var.b);
            jSONObject.put("driverDir", xc7Var.c);
            jSONObject.put("driverName", xc7Var.d);
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        jSONArray2.getClass();
        return jSONArray2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ue5 a(java.io.File r25, java.lang.String r26, java.util.Map r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b56.a(java.io.File, java.lang.String, java.util.Map, boolean):ue5");
    }

    public static String d(File file, File file2) {
        Object obj;
        File canonicalFile = file2.getCanonicalFile();
        h85 h85Var = jf5.a;
        LinkedHashMap b = jf5.b(q72.L(file));
        ArrayList X0 = tq0.X0(jf5.e(b), jf5.f(b));
        int size = X0.size();
        int i = 0;
        loop0: while (true) {
            if (i < size) {
                obj = X0.get(i);
                i++;
                String obj2 = zg6.Z0(gh6.k0((String) obj, '\\', '/')).toString();
                if (!zg6.B0(obj2) && !zg6.R0(obj2, '/')) {
                    File canonicalFile2 = new File(file.getParentFile(), obj2).getCanonicalFile();
                    canonicalFile2.getClass();
                    canonicalFile.getClass();
                    while (canonicalFile2 != null) {
                        if (canonicalFile2.equals(canonicalFile)) {
                            break;
                        }
                        canonicalFile2 = canonicalFile2.getParentFile();
                    }
                    break loop0;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (String) obj;
    }

    public static Uri m(uh1 uh1Var, String str) {
        Object kc5Var;
        Object obj = null;
        if (uh1Var == null) {
            return null;
        }
        try {
            uh1 f = uh1Var.f(str);
            if (f != null) {
                kc5Var = f.j();
            } else {
                kc5Var = null;
            }
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Throwable a = nc5.a(kc5Var);
        if (a != null) {
            Log.w("SPSettingsRepository", "Could not access restored file ".concat(str), a);
        }
        if (!(kc5Var instanceof kc5)) {
            obj = kc5Var;
        }
        return (Uri) obj;
    }

    public final ln0 A() {
        return p("video_renderer_debug_tools_enabled", new j46(this, 15));
    }

    public final boolean B() {
        return this.b.getBoolean("ra_offline_softcore_enabled", true);
    }

    public final ln0 C() {
        return p("video_retroarch_shader_parameters", new h46(this, 27));
    }

    public final ln0 D() {
        return p("video_retroarch_shader_preset", new h46(this, 8));
    }

    public final ln0 E() {
        ln0 p = p("video_retroarch_shader_source", new h46(this, 14));
        ln0 p2 = p("video_retroarch_shader_root", new h46(this, 17));
        ln0 p3 = p("video_retroarch_shader_library_version", new h46(this, 12));
        return new ln0(4, new u92[]{p, p2, p3}, new z46(this, null));
    }

    public final VideoRenderer G(VideoRenderer videoRenderer, VideoRenderer videoRenderer2) {
        int i;
        ConfigurationInfo deviceConfigurationInfo;
        ConfigurationInfo deviceConfigurationInfo2;
        if (videoRenderer == null) {
            i = -1;
        } else {
            i = q46.c[videoRenderer.ordinal()];
        }
        if (i != -1) {
            Context context = this.a;
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    return videoRenderer;
                }
                ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                if (activityManager != null && (deviceConfigurationInfo2 = activityManager.getDeviceConfigurationInfo()) != null) {
                    i2 = deviceConfigurationInfo2.reqGlEsVersion;
                }
                if (i2 >= 196610 && gh6.g0(Build.HARDWARE, "qcom", true)) {
                    return VideoRenderer.COMPUTE;
                }
            } else {
                ActivityManager activityManager2 = (ActivityManager) context.getSystemService(ActivityManager.class);
                if (activityManager2 != null && (deviceConfigurationInfo = activityManager2.getDeviceConfigurationInfo()) != null) {
                    i2 = deviceConfigurationInfo.reqGlEsVersion;
                }
                if (i2 >= 196610) {
                    return VideoRenderer.OPENGL;
                }
            }
        }
        return videoRenderer2;
    }

    public final void I(String str, String str2, String str3, String str4) {
        List n = n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : n) {
            if (!((xc7) obj).a.equals(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList Y0 = tq0.Y0(arrayList, new xc7(str, str4, str2, str3));
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString("video_vulkan_custom_drivers", H(Y0));
        edit.putString("video_vulkan_selected_driver_id", str);
        String lowerCase = "CUSTOM".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        edit.putString("video_vulkan_driver_mode", lowerCase);
        edit.remove("video_vulkan_custom_driver_dir");
        edit.remove("video_vulkan_custom_driver_name");
        edit.remove("video_vulkan_custom_driver_display_name");
        edit.commit();
    }

    public final void J(gv5 gv5Var) {
        SharedPreferences.Editor edit = this.b.edit();
        if (gv5Var == null) {
            edit.remove("dual_screen_external_vertical_alignment");
        } else {
            String lowerCase = gv5Var.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            edit.putString("dual_screen_external_vertical_alignment", lowerCase);
        }
        edit.apply();
    }

    public final void K(gv5 gv5Var) {
        SharedPreferences.Editor edit = this.b.edit();
        if (gv5Var == null) {
            edit.remove("dual_screen_internal_vertical_alignment");
        } else {
            String lowerCase = gv5Var.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            edit.putString("dual_screen_internal_vertical_alignment", lowerCase);
        }
        edit.apply();
    }

    public final RendererConfiguration b(RendererConfiguration rendererConfiguration, ti5 ti5Var, p46 p46Var, String str, String str2) {
        ue5 ue5Var;
        String str3;
        boolean threadedRendering;
        int resolutionScaling;
        ue5 ue5Var2;
        VideoRenderer videoRenderer = ti5Var.i;
        String str4 = ti5Var.n;
        VideoRenderer G = G(videoRenderer, rendererConfiguration.getRenderer());
        VideoFiltering videoFiltering = ti5Var.l;
        if (videoFiltering == null) {
            videoFiltering = rendererConfiguration.getVideoFiltering();
        }
        VideoFiltering videoFiltering2 = VideoFiltering.RETROARCH;
        ue5 ue5Var3 = l;
        if (videoFiltering == videoFiltering2) {
            String str5 = ti5Var.m;
            if (str5 == null && str4 == null) {
                ue5Var = rendererConfiguration.getRetroArchShader();
            } else {
                if (str5 == null) {
                    str5 = str;
                }
                if (str4 == null) {
                    str4 = str2;
                }
                ue5Var = z(p46Var, str5, F(str4), false);
            }
        } else {
            ue5Var = ue5Var3;
        }
        VideoRenderer videoRenderer2 = VideoRenderer.VULKAN;
        if (G == videoRenderer2 && !videoFiltering.isSupportedByVulkan()) {
            videoFiltering = VideoFiltering.NONE;
        } else if (G != videoRenderer2 && !videoFiltering.isSupportedByOpenGlSurface()) {
            videoFiltering = VideoFiltering.NONE;
        } else if (videoFiltering == videoFiltering2 && ((str3 = ue5Var.a) == null || zg6.B0(str3))) {
            videoFiltering = VideoFiltering.NONE;
        }
        VideoFiltering videoFiltering3 = videoFiltering;
        Boolean bool = ti5Var.j;
        if (bool != null) {
            threadedRendering = bool.booleanValue();
        } else {
            threadedRendering = rendererConfiguration.getThreadedRendering();
        }
        boolean U = nk2.U(G, threadedRendering);
        Integer num = ti5Var.k;
        if (num != null) {
            resolutionScaling = num.intValue();
        } else {
            resolutionScaling = rendererConfiguration.getResolutionScaling();
        }
        int i = resolutionScaling;
        if (videoFiltering3 == videoFiltering2) {
            ue5Var2 = ue5Var;
        } else {
            ue5Var2 = ue5Var3;
        }
        return RendererConfiguration.copy$default(rendererConfiguration, G, videoFiltering3, U, null, i, false, false, false, false, RecyclerView.A1, RecyclerView.A1, false, false, false, ue5Var2, 16360, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x000d, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0151 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.c76 r9, java.lang.String r10, java.io.File r11) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b56.c(c76, java.lang.String, java.io.File):void");
    }

    public final VideoRenderer e() {
        Object kc5Var;
        String string = this.b.getString("video_renderer", "software");
        string.getClass();
        try {
            String upperCase = string.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            kc5Var = VideoRenderer.valueOf(upperCase);
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        VideoRenderer videoRenderer = VideoRenderer.SOFTWARE;
        if (kc5Var instanceof kc5) {
            kc5Var = videoRenderer;
        }
        return G((VideoRenderer) kc5Var, videoRenderer);
    }

    public final ConsoleType f() {
        Object kc5Var;
        Enum r0 = ConsoleType.DS;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("console_type", lowerCase);
        if (string != null) {
            try {
                kc5Var = se.t(string, ConsoleType.values());
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (nc5.a(kc5Var) != null) {
                wh1.y("Invalid enum preference console_type=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(kc5Var instanceof kc5)) {
                r02 = kc5Var;
            }
            r0 = r02;
        }
        return (ConsoleType) r0;
    }

    public final gv5 g() {
        Object kc5Var;
        gv5 gv5Var = null;
        String string = this.b.getString("dual_screen_external_vertical_alignment", null);
        if (string == null) {
            return null;
        }
        try {
            kc5Var = (gv5) se.t(string, gv5.values());
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (nc5.a(kc5Var) != null) {
            Log.w("SPSettingsRepository", "Invalid enum preference dual_screen_external_vertical_alignment=" + string + "; ignoring");
        }
        if (!(kc5Var instanceof kc5)) {
            gv5Var = kc5Var;
        }
        return gv5Var;
    }

    public final gv5 h() {
        Object kc5Var;
        gv5 gv5Var = null;
        String string = this.b.getString("dual_screen_internal_vertical_alignment", null);
        if (string == null) {
            return null;
        }
        try {
            kc5Var = (gv5) se.t(string, gv5.values());
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (nc5.a(kc5Var) != null) {
            Log.w("SPSettingsRepository", "Invalid enum preference dual_screen_internal_vertical_alignment=" + string + "; ignoring");
        }
        if (!(kc5Var instanceof kc5)) {
            gv5Var = kc5Var;
        }
        return gv5Var;
    }

    public final cm1 i() {
        Object kc5Var;
        Enum r0 = cm1.OFF;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("dual_screen_preset", lowerCase);
        if (string != null) {
            try {
                kc5Var = se.t(string, cm1.values());
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (nc5.a(kc5Var) != null) {
                wh1.y("Invalid enum preference dual_screen_preset=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(kc5Var instanceof kc5)) {
                r02 = kc5Var;
            }
            r0 = r02;
        }
        return (cm1) r0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.k11 r51) {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b56.j(k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ti5 r53, defpackage.k11 r54) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b56.k(ti5, k11):java.lang.Object");
    }

    public final c42 l() {
        Object kc5Var;
        Enum r0 = c42.MELON_DUAL_DS;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("external_display_mode", lowerCase);
        if (string != null) {
            try {
                kc5Var = se.t(string, c42.values());
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (nc5.a(kc5Var) != null) {
                wh1.y("Invalid enum preference external_display_mode=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(kc5Var instanceof kc5)) {
                r02 = kc5Var;
            }
            r0 = r02;
        }
        return (c42) r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List n() {
        Object kc5Var;
        pp1 pp1Var;
        SharedPreferences sharedPreferences = this.b;
        String string = sharedPreferences.getString("video_vulkan_custom_drivers", null);
        pp1 pp1Var2 = pp1.A;
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                ip3 C = l07.C();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("id");
                        optString.getClass();
                        if (zg6.B0(optString)) {
                            optString = null;
                        }
                        if (optString != null) {
                            String optString2 = optJSONObject.optString("displayName");
                            optString2.getClass();
                            if (zg6.B0(optString2)) {
                                optString2 = null;
                            }
                            if (optString2 != null) {
                                String optString3 = optJSONObject.optString("driverDir");
                                optString3.getClass();
                                if (zg6.B0(optString3)) {
                                    optString3 = null;
                                }
                                if (optString3 != null) {
                                    String optString4 = optJSONObject.optString("driverName");
                                    optString4.getClass();
                                    if (zg6.B0(optString4)) {
                                        optString4 = null;
                                    }
                                    if (optString4 != null) {
                                        C.add(new xc7(optString, optString2, optString3, optString4));
                                    }
                                }
                            }
                        }
                    }
                }
                kc5Var = l07.t(C);
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (kc5Var instanceof kc5) {
                kc5Var = pp1Var2;
            }
            pp1Var = (List) kc5Var;
        } else {
            pp1Var = null;
        }
        if (pp1Var == null) {
            pp1Var = pp1Var2;
        }
        if (!pp1Var.isEmpty()) {
            return pp1Var;
        }
        String string2 = sharedPreferences.getString("video_vulkan_custom_driver_name", null);
        String string3 = sharedPreferences.getString("video_vulkan_custom_driver_dir", null);
        String string4 = sharedPreferences.getString("video_vulkan_custom_driver_display_name", null);
        if (string2 != null && !zg6.B0(string2) && string3 != null && !zg6.B0(string3) && new File(string3).isDirectory()) {
            if (string4 == null) {
                string4 = string2;
            }
            return l07.b0(new xc7("legacy", string4, string3, string2));
        }
        return pp1Var2;
    }

    public final MicSource o() {
        Object kc5Var;
        Enum r0 = MicSource.BLOW;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("mic_source", lowerCase);
        if (string != null) {
            try {
                kc5Var = se.t(string, MicSource.values());
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (nc5.a(kc5Var) != null) {
                wh1.y("Invalid enum preference mic_source=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(kc5Var instanceof kc5)) {
                r02 = kc5Var;
            }
            r0 = r02;
        }
        return (MicSource) r0;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        h24 h24Var = (h24) this.h.get(str);
        if (h24Var != null) {
            h24Var.p(o27.a);
        }
    }

    public final ln0 p(String str, ki2 ki2Var) {
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(str);
        c46 c46Var = obj;
        if (obj == null) {
            c46 b = d46.b(1, 0, h60.DROP_OLDEST, 2);
            b.p(o27.a);
            linkedHashMap.put(str, b);
            c46Var = b;
        }
        return new ln0(8, (h24) c46Var, ki2Var);
    }

    public final um5 q() {
        Object kc5Var;
        Enum r0 = um5.NONE;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("rom_icon_filtering", lowerCase);
        if (string != null) {
            try {
                kc5Var = se.t(string, um5.values());
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (nc5.a(kc5Var) != null) {
                wh1.y("Invalid enum preference rom_icon_filtering=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(kc5Var instanceof kc5)) {
                r02 = kc5Var;
            }
            r0 = r02;
        }
        return (um5) r0;
    }

    public final Uri[] r() {
        Set<String> stringSet = this.b.getStringSet("rom_search_dirs", up1.A);
        if (stringSet != null) {
            Set<String> set = stringSet;
            ArrayList arrayList = new ArrayList(uq0.y0(set, 10));
            for (String str : set) {
                str.getClass();
                arrayList.add(Uri.parse(str));
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
            if (uriArr != null) {
                return uriArr;
            }
        }
        return new Uri[0];
    }

    public final qb6 s() {
        Object kc5Var;
        String str = "alphabetically";
        String string = this.b.getString("rom_sorting_mode", "alphabetically");
        if (string != null) {
            str = string;
        }
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            kc5Var = qb6.valueOf(upperCase);
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Object obj = qb6.ALPHABETICALLY;
        if (kc5Var instanceof kc5) {
            kc5Var = obj;
        }
        return (qb6) kc5Var;
    }

    public final tp5 t() {
        Object kc5Var;
        String str = "grid";
        String string = this.b.getString("rom_view_mode", "grid");
        if (string != null) {
            str = string;
        }
        try {
            kc5Var = (tp5) se.t(str, tp5.values());
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Object obj = tp5.GRID;
        if (kc5Var instanceof kc5) {
            kc5Var = obj;
        }
        return (tp5) kc5Var;
    }

    public final Uri u(rg5 rg5Var) {
        String str;
        Uri uri;
        String str2;
        rg5Var.getClass();
        SharedPreferences sharedPreferences = this.b;
        Uri uri2 = null;
        if (!sharedPreferences.getBoolean("use_rom_dir", true)) {
            Set<String> stringSet = sharedPreferences.getStringSet("sram_dir", null);
            if (stringSet != null) {
                str = (String) tq0.L0(stringSet);
            } else {
                str = null;
            }
            if (str != null) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            if (uri != null) {
                Set<String> stringSet2 = sharedPreferences.getStringSet("sram_dir", null);
                if (stringSet2 != null) {
                    str2 = (String) tq0.L0(stringSet2);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    uri2 = Uri.parse(str2);
                }
                uri2.getClass();
                return uri2;
            }
        }
        Uri uri3 = rg5Var.e;
        if (uri3 != null) {
            if (uri3 != null) {
                uh1 b = this.d.b(uri3);
                if (b != null) {
                    uri2 = b.j();
                }
                if (uri2 != null) {
                    return uri2;
                }
            }
            throw new Exception("Could not determine ROMs parent document");
        }
        File file = new File(this.a.getExternalFilesDir(null), "saves");
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new Exception("Could not create internal save directory");
        }
        Uri fromFile = Uri.fromFile(file);
        fromFile.getClass();
        return fromFile;
    }

    public final UUID v() {
        UUID fromString;
        String string = this.b.getString("input_layout_id", null);
        if (string != null && (fromString = UUID.fromString(string)) != null) {
            return fromString;
        }
        return nd3.h;
    }

    public final uh1 w(Uri uri, String str) {
        Object kc5Var;
        uh1 uh1Var = null;
        if (uri == null) {
            return null;
        }
        try {
            kc5Var = uh1.h(this.a, uri);
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Throwable a = nc5.a(kc5Var);
        if (a != null) {
            Log.w("SPSettingsRepository", "Could not access restored tree preference " + str + "=" + uri, a);
        }
        if (!(kc5Var instanceof kc5)) {
            uh1Var = kc5Var;
        }
        return uh1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wc7 x(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b56.x(java.lang.String):wc7");
    }

    public final yc7 y() {
        Object kc5Var;
        Enum r0 = yc7.SYSTEM;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("video_vulkan_driver_mode", lowerCase);
        if (string != null) {
            try {
                kc5Var = se.t(string, yc7.values());
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (nc5.a(kc5Var) != null) {
                wh1.y("Invalid enum preference video_vulkan_driver_mode=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(kc5Var instanceof kc5)) {
                r02 = kc5Var;
            }
            r0 = r02;
        }
        return (yc7) r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
        if (defpackage.gh6.f0(r12, ".slangp", true) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ue5 z(defpackage.p46 r11, java.lang.String r12, java.util.Map r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b56.z(p46, java.lang.String, java.util.Map, boolean):ue5");
    }
}
