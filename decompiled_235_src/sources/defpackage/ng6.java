package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import me.magnum.melonds.domain.model.AudioBitrate;
import me.magnum.melonds.domain.model.AudioInterpolation;
import me.magnum.melonds.domain.model.AudioLatency;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.DldiSdCardConfiguration;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.domain.model.FirmwareConfiguration;
import me.magnum.melonds.domain.model.MicSource;
import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng6  reason: default package */
/* loaded from: classes.dex */
public final class ng6 implements kd6, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final po5 l = new po5(null, hp5.VULKAN_IR, 0, 0, zt1.A, false);
    public final Context a;
    public final SharedPreferences b;
    public final id3 c;
    public final uh7 d;
    public final jd6 e;
    public final cp5 f;
    public final ex6 g = new ex6(new tf6(this, 0));
    public final LinkedHashMap h = new LinkedHashMap();
    public final be5 i;
    public volatile String j;
    public volatile String k;

    public ng6(Context context, SharedPreferences sharedPreferences, jd1 jd1Var, id3 id3Var, uh7 uh7Var, o41 o41Var, jd6 jd6Var, cp5 cp5Var) {
        this.a = context;
        this.b = sharedPreferences;
        this.c = id3Var;
        this.d = uh7Var;
        this.e = jd6Var;
        this.f = cp5Var;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        if (sharedPreferences.getString("theme", null) == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("theme", "dark");
            edit.apply();
        }
        if (sharedPreferences.getString("internal_mac_address", null) == null) {
            List list = zz3.b;
            zz3 W = kn2.W(null);
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putString("internal_mac_address", W.toString());
            edit2.apply();
        }
        this.i = f04.P(f04.o(new xf2(new xf2(new xf2(new xf2(new xf2(new wp0(6, new le2[]{p("video_renderer", new tf6(this, 16)), p("video_filtering", new tf6(this, 2)), p("enable_threaded_rendering", new tf6(this, 10)), p("video_internal_resolution", new tf6(this, 3)), p("video_vulkan_fastpath_enabled", new tf6(this, 18))}, new dg6(null)), C(), new eg6(3, null, 0)), p("video_renderer_debug_bgobj_enabled", new tf6(this, 7)), new eg6(3, null, 1)), p("video_renderer_debug_latch_trace_enabled", new tf6(this, 6)), new eg6(3, null, 2)), new xf2(new wp0(6, new le2[]{p("video_conservative_coverage_enabled", new tf6(this, 13)), p("video_conservative_coverage_px", new vf6(this, 16)), p("video_conservative_coverage_depth_bias", new tf6(this, 15)), p("video_conservative_coverage_apply_repeat", new tf6(this, 5)), p("video_conservative_coverage_apply_clamp", new tf6(this, 1))}, new fg6(null)), p("video_debug_3d_clear_magenta", new tf6(this, 4)), new et(3, null, 3)), new m02(3, null, 4)), new wp0(5, new le2[]{G(), F(), p("video_retroarch_shader_parameters", new tf6(this, 9)), p("video_retroarch_shader_clear_history", new vf6(this, 14))}, new kg6(this, null)), new m02(3, null, 3)), -1), o41Var, dh6.b, 1);
    }

    public static Map H(String str) {
        zt1 zt1Var = zt1.A;
        if (str != null && !qs6.v0(str)) {
            ev evVar = new ev(str, 4);
            r76 r76Var = new r76(8);
            tb6 tb6Var = tb6.d0;
            pc2 b0 = sb6.b0(new qd2(evVar, r76Var), new r76(9));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            oc2 oc2Var = new oc2(b0);
            while (oc2Var.hasNext()) {
                vr4 vr4Var = (vr4) oc2Var.next();
                linkedHashMap.put(vr4Var.A, vr4Var.B);
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
        return zt1Var;
    }

    public static Uri I(Uri uri, zl1 zl1Var, String str, File file) {
        Object em5Var;
        Uri uri2;
        if (uri != null && (nb3.k(uri.getScheme(), "file") || uri.getScheme() == null)) {
            String path = uri.getPath();
            if (path == null) {
                String uri3 = uri.toString();
                uri3.getClass();
                path = qs6.D0(uri3, "file://");
            }
            File file2 = new File(path, str);
            if (file2.exists()) {
                return Uri.fromFile(file2);
            }
        }
        if (zl1Var == null) {
            uri2 = null;
        } else {
            try {
                zl1 f = zl1Var.f(str);
                if (f != null) {
                    em5Var = f.j();
                } else {
                    em5Var = null;
                }
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            Throwable a = hm5.a(em5Var);
            if (a != null) {
                Log.w("SPSettingsRepository", "Could not access restored file ".concat(str), a);
            }
            if (em5Var instanceof em5) {
                em5Var = null;
            }
            uri2 = (Uri) em5Var;
        }
        if (uri2 != null) {
            return uri2;
        }
        File file3 = new File(file, str);
        if (!file3.exists()) {
            return null;
        }
        return Uri.fromFile(file3);
    }

    public static String K(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zq7 zq7Var = (zq7) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", zq7Var.a);
            jSONObject.put("displayName", zq7Var.b);
            jSONObject.put("driverDir", zq7Var.c);
            jSONObject.put("driverName", zq7Var.d);
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
    */
    public static po5 a(File file, String str, Map map, boolean z) {
        int c;
        Throwable th;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        hp5 hp5Var;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        File file2;
        boolean z6;
        long j2;
        File file3 = new File(file, str);
        if (file3.exists() && file3.isFile()) {
            uf6 uf6Var = new uf6(file, 0);
            xh5 xh5Var = fp5.a;
            LinkedHashMap b = fp5.b(jc2.B0(file3));
            ep5 g = fp5.g(str, uf6Var);
            int i = g.a;
            Integer valueOf = Integer.valueOf(i);
            if (i <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                c = valueOf.intValue();
            } else {
                c = fp5.c(b);
            }
            int i2 = c;
            String str6 = (String) uf6Var.g(str);
            if (str6 == null) {
                th = null;
            } else {
                LinkedHashMap b2 = fp5.b(str6);
                pu puVar = new pu();
                ArrayList e = fp5.e(b2);
                int size = e.size();
                int i3 = 0;
                th = null;
                while (i3 < size) {
                    Object obj = e.get(i3);
                    i3++;
                    String d = fp5.d(str, (String) obj);
                    if (d != null) {
                        puVar.addLast(d);
                    }
                }
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (!puVar.isEmpty()) {
                    String str7 = (String) puVar.removeFirst();
                    if (linkedHashSet.add(str7) && (str5 = (String) uf6Var.g(str7)) != null) {
                        arrayList.add(str5);
                        for (String str8 : fp5.a(str5)) {
                            String d2 = fp5.d(str7, str8);
                            if (d2 != null) {
                                puVar.addLast(d2);
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    String lowerCase = gt0.P0(arrayList, "\n", null, null, null, 62).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (qs6.j0(lowerCase, "sourcesize", false) || qs6.j0(lowerCase, "originalsize", false) || qs6.j0(lowerCase, "outputsize", false)) {
                        int c2 = fp5.c(b2);
                        for (int i4 = 0; i4 < c2; i4++) {
                            String str9 = (String) b2.get("scale_type" + i4);
                            if (str9 != null) {
                                str2 = str9.toLowerCase(Locale.ROOT);
                                str2.getClass();
                            } else {
                                str2 = null;
                            }
                            String str10 = (String) b2.get("scale_type_x" + i4);
                            if (str10 != null) {
                                str3 = str10.toLowerCase(Locale.ROOT);
                                str3.getClass();
                            } else {
                                str3 = null;
                            }
                            String str11 = (String) b2.get("scale_type_y" + i4);
                            if (str11 != null) {
                                str4 = str11.toLowerCase(Locale.ROOT);
                                str4.getClass();
                            } else {
                                str4 = null;
                            }
                            if (nb3.k(str2, "viewport") || nb3.k(str3, "viewport") || nb3.k(str4, "viewport")) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        if (!qs6.j0(lowerCase, "texelfetch", false) && !qs6.j0(lowerCase, "texelfetchoffset", false) && !qs6.j0(lowerCase, "subpix", false) && !qs6.j0(lowerCase, "retro_pixel", false) && !qs6.j0(lowerCase, "pixel_size", false) && !qs6.j0(lowerCase, "pixel size", false) && !qs6.j0(lowerCase, "lcd gamma", false) && !qs6.j0(lowerCase, "lcd grid", false) && !qs6.j0(lowerCase, "scanline", false) && !qs6.j0(lowerCase, "scanlines", false) && !qs6.j0(lowerCase, "pixel_borders", false) && !qs6.j0(lowerCase, "tx_to_px", false) && !qs6.j0(lowerCase, "subpx_coverage", false)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!fp5.d.A.matcher(lowerCase).find() && !fp5.e.A.matcher(lowerCase).find() && !fp5.f.A.matcher(lowerCase).find()) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (!fp5.g.A.matcher(lowerCase).find() && !fp5.h.A.matcher(lowerCase).find()) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (!z2 ? !(!z3 || !z4) : !(!z3 && !z4 && !z5)) {
                            hp5Var = hp5.NATIVE;
                            hp5 hp5Var2 = hp5Var;
                            ArrayList e2 = fp5.e(b);
                            List f = fp5.f(b);
                            String lowerCase2 = hp5Var2.name().toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                            long j3 = i * 40;
                            Log.i("SPSettingsRepository", "RetroArchShaderImport: preset=" + str + " passes=" + i2 + " source=" + lowerCase2 + " shaders=" + e2.size() + " textures=" + f.size() + " sourceBytes=" + g.b + " estimatedCompileMs=" + ((j3 + ((15 * j) / 100)) * 2));
                            int i5 = 0;
                            for (Object obj2 : f) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    String str12 = (String) obj2;
                                    String d3 = fp5.d(str, str12);
                                    if (d3 != null) {
                                        file2 = new File(file, d3);
                                    } else {
                                        file2 = th;
                                    }
                                    if (d3 == null) {
                                        d3 = "<unsupported>";
                                    }
                                    if (file2 != 0 && file2.isFile()) {
                                        z6 = true;
                                        if (file2 != 0) {
                                            boolean isFile = file2.isFile();
                                            File file4 = file2;
                                            if (!isFile) {
                                                file4 = th;
                                            }
                                            if (file4 != 0) {
                                                j2 = file4.length();
                                                Log.i("SPSettingsRepository", "RetroArchShaderImport: texture[" + i5 + "] ref=" + str12 + " resolved=" + d3 + " exists=" + z6 + " bytes=" + j2);
                                                i5 = i6;
                                            }
                                        }
                                        j2 = 0;
                                        Log.i("SPSettingsRepository", "RetroArchShaderImport: texture[" + i5 + "] ref=" + str12 + " resolved=" + d3 + " exists=" + z6 + " bytes=" + j2);
                                        i5 = i6;
                                    }
                                    z6 = false;
                                    if (file2 != 0) {
                                    }
                                    j2 = 0;
                                    Log.i("SPSettingsRepository", "RetroArchShaderImport: texture[" + i5 + "] ref=" + str12 + " resolved=" + d3 + " exists=" + z6 + " bytes=" + j2);
                                    i5 = i6;
                                } else {
                                    hf.q0();
                                    throw th;
                                }
                            }
                            return new po5(file3.getAbsolutePath(), hp5Var2, i2, g.b, map, z);
                        }
                    }
                }
            }
            hp5Var = hp5.VULKAN_IR;
            hp5 hp5Var22 = hp5Var;
            ArrayList e22 = fp5.e(b);
            List f2 = fp5.f(b);
            String lowerCase22 = hp5Var22.name().toLowerCase(Locale.ROOT);
            lowerCase22.getClass();
            long j32 = i * 40;
            Log.i("SPSettingsRepository", "RetroArchShaderImport: preset=" + str + " passes=" + i2 + " source=" + lowerCase22 + " shaders=" + e22.size() + " textures=" + f2.size() + " sourceBytes=" + g.b + " estimatedCompileMs=" + ((j32 + ((15 * j) / 100)) * 2));
            int i52 = 0;
            while (r2.hasNext()) {
            }
            return new po5(file3.getAbsolutePath(), hp5Var22, i2, g.b, map, z);
        }
        Log.w("SPSettingsRepository", "RetroArch shader preset not available in import cache: ".concat(str));
        return l;
    }

    public static String d(File file, File file2) {
        Object obj;
        File canonicalFile = file2.getCanonicalFile();
        xh5 xh5Var = fp5.a;
        LinkedHashMap b = fp5.b(jc2.B0(file));
        ArrayList V0 = gt0.V0(fp5.e(b), fp5.f(b));
        int size = V0.size();
        int i = 0;
        loop0: while (true) {
            if (i < size) {
                obj = V0.get(i);
                i++;
                String obj2 = qs6.T0(xs6.d0((String) obj, '\\', '/')).toString();
                if (!qs6.v0(obj2) && !qs6.L0(obj2, '/')) {
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

    public final sr7 A() {
        Object em5Var;
        Enum r0 = sr7.SYSTEM;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("video_vulkan_driver_mode", lowerCase);
        if (string != null) {
            try {
                em5Var = jw2.o(string, sr7.values());
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (hm5.a(em5Var) != null) {
                lb1.w("Invalid enum preference video_vulkan_driver_mode=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(em5Var instanceof em5)) {
                r02 = em5Var;
            }
            r0 = r02;
        }
        return (sr7) r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
        if (defpackage.xs6.Y(r12, ".slangp", true) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final po5 B(bg6 bg6Var, String str, Map map, boolean z) {
        String str2;
        String obj;
        CharSequence charSequence;
        if (str != null && (obj = qs6.T0(str).toString()) != null) {
            String replace = obj.replace('\\', '/');
            replace.getClass();
            char[] cArr = {'/'};
            int length = replace.length();
            int i = 0;
            while (true) {
                if (i < length) {
                    char charAt = replace.charAt(i);
                    int i2 = 0;
                    while (true) {
                        if (i2 < 1) {
                            if (charAt == cArr[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    if (i2 >= 0) {
                        i++;
                    } else {
                        charSequence = replace.subSequence(i, replace.length());
                        break;
                    }
                } else {
                    charSequence = "";
                    break;
                }
            }
            str2 = charSequence.toString();
            if (str2 != null) {
                if (qs6.v0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    List<String> J0 = qs6.J0(str2, new char[]{'/'}, 6);
                    if (!J0.isEmpty()) {
                        for (String str3 : J0) {
                            if (nb3.k(str3, "..")) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        str2 = null;
        if (str2 == null) {
            return l;
        }
        if (bg6Var == null) {
            return l;
        }
        if (bg6Var instanceof zf6) {
            File file = ((zf6) bg6Var).a;
            if (this.j != null || this.k != null) {
                this.j = null;
                this.k = null;
                jc2.x0(new File(this.a.getFilesDir(), "retroarch-shaders/current"));
            }
            File file2 = new File(file, str2);
            if (file2.exists() && file2.isFile()) {
                String d = d(file2, file);
                if (d != null) {
                    lb1.w("RetroArch shader preset references files outside the shader library: ", str2, " -> ", d, "SPSettingsRepository");
                    return l;
                }
                return a(file, str2, map, z);
            }
            Log.w("SPSettingsRepository", "RetroArch shader preset not found in installed library: ".concat(str2));
            return l;
        } else if (bg6Var instanceof ag6) {
            Uri uri = ((ag6) bg6Var).a;
            File file3 = new File(this.a.getFilesDir(), "retroarch-shaders/current");
            qi6 h = zl1.h(this.a, uri);
            if (h.e() && h.k()) {
                String uri2 = uri.toString();
                uri2.getClass();
                String str4 = uri2 + "\n" + str2;
                if (!nb3.k(this.j, uri2) || !nb3.k(this.k, str4) || !file3.isDirectory()) {
                    try {
                        jc2.x0(file3);
                        file3.mkdirs();
                        c(h, str2, file3);
                        this.j = uri2;
                        this.k = str4;
                    } catch (Exception e) {
                        Log.e("SPSettingsRepository", "Failed to import RetroArch shader preset " + str2 + " from " + uri, e);
                        this.j = null;
                        this.k = null;
                        return l;
                    }
                }
                File file4 = new File(file3, str2);
                if (file4.exists() && file4.isFile()) {
                    String d2 = d(file4, file3);
                    if (d2 != null) {
                        Log.w("SPSettingsRepository", lb1.n("RetroArch shader preset references files outside selected root: ", str2, " -> ", d2, ". Select the top-level slang-shaders folder."));
                        return l;
                    }
                    return a(file3, str2, map, z);
                }
                Log.w("SPSettingsRepository", "RetroArch shader preset not found after import: ".concat(str2));
                return l;
            }
            Log.w("SPSettingsRepository", "Invalid RetroArch shader root: " + uri);
            this.j = null;
            this.k = null;
            return a(file3, str2, map, z);
        } else {
            i.d();
            return null;
        }
    }

    public final wp0 C() {
        return p("video_renderer_debug_tools_enabled", new vf6(this, 15));
    }

    public final boolean D() {
        return this.b.getBoolean("ra_offline_softcore_enabled", true);
    }

    public final wp0 E() {
        return p("video_retroarch_shader_parameters", new tf6(this, 27));
    }

    public final wp0 F() {
        return p("video_retroarch_shader_preset", new tf6(this, 8));
    }

    public final wp0 G() {
        wp0 p = p("video_retroarch_shader_source", new tf6(this, 14));
        wp0 p2 = p("video_retroarch_shader_root", new tf6(this, 17));
        wp0 p3 = p("video_retroarch_shader_library_version", new tf6(this, 12));
        return new wp0(4, new le2[]{p, p2, p3}, new lg6(this, null));
    }

    public final VideoRenderer J(VideoRenderer videoRenderer, VideoRenderer videoRenderer2) {
        int i;
        ConfigurationInfo deviceConfigurationInfo;
        ConfigurationInfo deviceConfigurationInfo2;
        if (videoRenderer == null) {
            i = -1;
        } else {
            i = cg6.c[videoRenderer.ordinal()];
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
                if (i2 >= 196610 && xs6.Z(Build.HARDWARE, "qcom", true)) {
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

    public final void L(String str, String str2, String str3, String str4) {
        List n = n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : n) {
            if (!((zq7) obj).a.equals(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList U0 = gt0.U0(new zq7(str, str4, str2, str3), arrayList);
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString("video_vulkan_custom_drivers", K(U0));
        edit.putString("video_vulkan_selected_driver_id", str);
        String lowerCase = "CUSTOM".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        edit.putString("video_vulkan_driver_mode", lowerCase);
        edit.remove("video_vulkan_custom_driver_dir");
        edit.remove("video_vulkan_custom_driver_name");
        edit.remove("video_vulkan_custom_driver_display_name");
        edit.commit();
    }

    public final void M(p66 p66Var) {
        SharedPreferences.Editor edit = this.b.edit();
        if (p66Var == null) {
            edit.remove("dual_screen_external_vertical_alignment");
        } else {
            String lowerCase = p66Var.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            edit.putString("dual_screen_external_vertical_alignment", lowerCase);
        }
        edit.apply();
    }

    public final void N(p66 p66Var) {
        SharedPreferences.Editor edit = this.b.edit();
        if (p66Var == null) {
            edit.remove("dual_screen_internal_vertical_alignment");
        } else {
            String lowerCase = p66Var.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            edit.putString("dual_screen_internal_vertical_alignment", lowerCase);
        }
        edit.apply();
    }

    public final void O(String str) {
        str.getClass();
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString("video_vulkan_selected_driver_id", str);
        String lowerCase = "CUSTOM".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        edit.putString("video_vulkan_driver_mode", lowerCase);
        edit.commit();
    }

    public final void P(sr7 sr7Var) {
        sr7Var.getClass();
        SharedPreferences.Editor edit = this.b.edit();
        String lowerCase = sr7Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        edit.putString("video_vulkan_driver_mode", lowerCase);
        edit.commit();
    }

    public final boolean Q() {
        return this.b.getBoolean("use_custom_bios", false);
    }

    public final RendererConfiguration b(RendererConfiguration rendererConfiguration, jt5 jt5Var, bg6 bg6Var, String str, String str2) {
        po5 po5Var;
        String str3;
        boolean threadedRendering;
        int resolutionScaling;
        po5 po5Var2;
        VideoRenderer videoRenderer = jt5Var.i;
        String str4 = jt5Var.n;
        VideoRenderer J = J(videoRenderer, rendererConfiguration.getRenderer());
        VideoFiltering videoFiltering = jt5Var.l;
        if (videoFiltering == null) {
            videoFiltering = rendererConfiguration.getVideoFiltering();
        }
        VideoFiltering videoFiltering2 = VideoFiltering.RETROARCH;
        po5 po5Var3 = l;
        if (videoFiltering == videoFiltering2) {
            String str5 = jt5Var.m;
            if (str5 == null && str4 == null) {
                po5Var = rendererConfiguration.getRetroArchShader();
            } else {
                if (str5 == null) {
                    str5 = str;
                }
                if (str4 == null) {
                    str4 = str2;
                }
                po5Var = B(bg6Var, str5, H(str4), false);
            }
        } else {
            po5Var = po5Var3;
        }
        VideoRenderer videoRenderer2 = VideoRenderer.VULKAN;
        if (J == videoRenderer2 && !videoFiltering.isSupportedByVulkan()) {
            videoFiltering = VideoFiltering.NONE;
        } else if (J != videoRenderer2 && !videoFiltering.isSupportedByOpenGlSurface()) {
            videoFiltering = VideoFiltering.NONE;
        } else if (videoFiltering == videoFiltering2 && ((str3 = po5Var.a) == null || qs6.v0(str3))) {
            videoFiltering = VideoFiltering.NONE;
        }
        VideoFiltering videoFiltering3 = videoFiltering;
        Boolean bool = jt5Var.j;
        if (bool != null) {
            threadedRendering = bool.booleanValue();
        } else {
            threadedRendering = rendererConfiguration.getThreadedRendering();
        }
        boolean X = mp2.X(J, threadedRendering);
        Integer num = jt5Var.k;
        if (num != null) {
            resolutionScaling = num.intValue();
        } else {
            resolutionScaling = rendererConfiguration.getResolutionScaling();
        }
        int i = resolutionScaling;
        if (videoFiltering3 == videoFiltering2) {
            po5Var2 = po5Var;
        } else {
            po5Var2 = po5Var3;
        }
        return RendererConfiguration.copy$default(rendererConfiguration, J, videoFiltering3, X, null, i, false, false, false, false, RecyclerView.B1, RecyclerView.B1, false, false, false, po5Var2, 16360, null);
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
    */
    public final void c(qi6 qi6Var, String str, File file) {
        pu puVar = new pu();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        puVar.addLast(str);
        while (!puVar.isEmpty()) {
            String str2 = (String) puVar.removeFirst();
            if (linkedHashSet.add(str2)) {
                int i = 0;
                zl1 zl1Var = qi6Var;
                for (String str3 : qs6.J0(str2, new char[]{'/'}, 6)) {
                    if (qs6.v0(str3) || (zl1Var = zl1Var.f(str3)) == null) {
                        zl1Var = null;
                        if (zl1Var == null) {
                            if (zl1Var.l()) {
                                File file2 = new File(file, str2);
                                File parentFile = file2.getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                                InputStream openInputStream = this.a.getContentResolver().openInputStream(zl1Var.j());
                                if (openInputStream != null) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        f04.w(openInputStream, fileOutputStream);
                                        fileOutputStream.close();
                                        openInputStream.close();
                                        String lowerCase = jc2.y0(file2).toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        switch (lowerCase.hashCode()) {
                                            case -899875921:
                                                if (lowerCase.equals("slangp")) {
                                                    xh5 xh5Var = fp5.a;
                                                    LinkedHashMap b = fp5.b(jc2.B0(file2));
                                                    ArrayList V0 = gt0.V0(fp5.e(b), fp5.f(b));
                                                    int size = V0.size();
                                                    while (i < size) {
                                                        Object obj = V0.get(i);
                                                        i++;
                                                        String str4 = (String) obj;
                                                        String d = fp5.d(str2, str4);
                                                        if (d != null) {
                                                            puVar.addLast(d);
                                                        } else {
                                                            i.h("Unsupported RetroArch shader dependency path: ".concat(str4));
                                                            return;
                                                        }
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            case 104:
                                                if (lowerCase.equals("h")) {
                                                    xh5 xh5Var2 = fp5.a;
                                                    for (String str5 : fp5.a(jc2.B0(file2))) {
                                                        String d2 = fp5.d(str2, str5);
                                                        if (d2 != null) {
                                                            puVar.addLast(d2);
                                                        } else {
                                                            i.h("Unsupported RetroArch shader dependency path: ".concat(str5));
                                                            return;
                                                        }
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            case 104414:
                                                if (lowerCase.equals("inc")) {
                                                    xh5 xh5Var22 = fp5.a;
                                                    while (r2.hasNext()) {
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            case 3175934:
                                                if (lowerCase.equals("glsl")) {
                                                    xh5 xh5Var222 = fp5.a;
                                                    while (r2.hasNext()) {
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            case 109519073:
                                                if (lowerCase.equals("slang")) {
                                                    xh5 xh5Var2222 = fp5.a;
                                                    while (r2.hasNext()) {
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            ge7.t(openInputStream, th);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    i.h("Unable to open RetroArch shader dependency: ".concat(str2));
                                    return;
                                }
                            } else {
                                i.h("RetroArch shader dependency is not a file: ".concat(str2));
                                return;
                            }
                        } else {
                            i.h("RetroArch shader dependency not found: ".concat(str2));
                            return;
                        }
                    }
                    while (r2.hasNext()) {
                    }
                }
                if (zl1Var == null) {
                }
            }
        }
    }

    public final VideoRenderer e() {
        Object em5Var;
        String string = this.b.getString("video_renderer", "software");
        string.getClass();
        try {
            String upperCase = string.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            em5Var = VideoRenderer.valueOf(upperCase);
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        VideoRenderer videoRenderer = VideoRenderer.SOFTWARE;
        if (em5Var instanceof em5) {
            em5Var = videoRenderer;
        }
        return J((VideoRenderer) em5Var, videoRenderer);
    }

    public final ConsoleType f() {
        Object em5Var;
        Enum r0 = ConsoleType.DS;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("console_type", lowerCase);
        if (string != null) {
            try {
                em5Var = jw2.o(string, ConsoleType.values());
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (hm5.a(em5Var) != null) {
                lb1.w("Invalid enum preference console_type=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(em5Var instanceof em5)) {
                r02 = em5Var;
            }
            r0 = r02;
        }
        return (ConsoleType) r0;
    }

    public final p66 g() {
        Object em5Var;
        p66 p66Var = null;
        String string = this.b.getString("dual_screen_external_vertical_alignment", null);
        if (string == null) {
            return null;
        }
        try {
            em5Var = (p66) jw2.o(string, p66.values());
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (hm5.a(em5Var) != null) {
            Log.w("SPSettingsRepository", "Invalid enum preference dual_screen_external_vertical_alignment=" + string + "; ignoring");
        }
        if (!(em5Var instanceof em5)) {
            p66Var = em5Var;
        }
        return p66Var;
    }

    public final p66 h() {
        Object em5Var;
        p66 p66Var = null;
        String string = this.b.getString("dual_screen_internal_vertical_alignment", null);
        if (string == null) {
            return null;
        }
        try {
            em5Var = (p66) jw2.o(string, p66.values());
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (hm5.a(em5Var) != null) {
            Log.w("SPSettingsRepository", "Invalid enum preference dual_screen_internal_vertical_alignment=" + string + "; ignoring");
        }
        if (!(em5Var instanceof em5)) {
            p66Var = em5Var;
        }
        return p66Var;
    }

    public final jq1 i() {
        Object em5Var;
        Enum r0 = jq1.OFF;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("dual_screen_preset", lowerCase);
        if (string != null) {
            try {
                em5Var = jw2.o(string, jq1.values());
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (hm5.a(em5Var) != null) {
                lb1.w("Invalid enum preference dual_screen_preset=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(em5Var instanceof em5)) {
                r02 = em5Var;
            }
            r0 = r02;
        }
        return (jq1) r0;
    }

    public final File j() {
        Context context = this.a;
        try {
            File file = new File(Environment.getExternalStorageDirectory(), "com.stormds.emulator");
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.isDirectory()) {
                return file;
            }
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return new File(context.getFilesDir(), "storm_ds");
            }
            return externalFilesDir;
        } catch (Throwable unused) {
            File externalFilesDir2 = context.getExternalFilesDir(null);
            if (externalFilesDir2 == null) {
                return new File(context.getFilesDir(), "storm_ds");
            }
            return externalFilesDir2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(s41 s41Var) {
        gg6 gg6Var;
        int i;
        SharedPreferences sharedPreferences;
        String str;
        Uri uri;
        String str2;
        Uri uri2;
        Context context;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        ConsoleType consoleType;
        Object em5Var;
        String str3;
        Object obj;
        AudioInterpolation audioInterpolation;
        Enum r28;
        Object em5Var2;
        AudioInterpolation audioInterpolation2;
        Object obj2;
        int i2;
        Object em5Var3;
        AudioBitrate audioBitrate;
        Object obj3;
        AudioLatency audioLatency;
        int i3;
        int i4;
        vr4 vr4Var;
        boolean z4;
        String str4;
        String str5;
        boolean z5;
        int i5;
        AudioLatency audioLatency2;
        Object obj4;
        MicSource micSource;
        String str6;
        ConsoleType consoleType2;
        AudioBitrate audioBitrate2;
        Uri uri3;
        AudioInterpolation audioInterpolation3;
        float f2;
        boolean z6;
        boolean z7;
        int i6;
        boolean z8;
        int i7;
        FirmwareConfiguration firmwareConfiguration;
        Uri uri4;
        Uri uri5;
        Uri uri6;
        Uri uri7;
        float f3;
        boolean z9;
        boolean z10;
        int i8;
        Uri uri8;
        Uri uri9;
        String string;
        boolean z11;
        int i9;
        boolean z12;
        String str7;
        Uri uri10;
        Integer h0;
        if (s41Var instanceof gg6) {
            gg6Var = (gg6) s41Var;
            int i10 = gg6Var.z0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gg6Var.z0 = i10 - Integer.MIN_VALUE;
                Object obj5 = gg6Var.x0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = gg6Var.z0;
                Context context2 = this.a;
                sharedPreferences = this.b;
                if (i == 0) {
                    if (i == 1) {
                        int i11 = gg6Var.w0;
                        boolean z13 = gg6Var.r0;
                        boolean z14 = gg6Var.q0;
                        int i12 = gg6Var.v0;
                        int i13 = gg6Var.u0;
                        boolean z15 = gg6Var.p0;
                        float f4 = gg6Var.t0;
                        float f5 = gg6Var.s0;
                        boolean z16 = gg6Var.o0;
                        boolean z17 = gg6Var.n0;
                        FirmwareConfiguration firmwareConfiguration2 = gg6Var.m0;
                        MicSource micSource2 = gg6Var.l0;
                        AudioLatency audioLatency3 = gg6Var.k0;
                        AudioBitrate audioBitrate3 = gg6Var.j0;
                        AudioInterpolation audioInterpolation4 = gg6Var.i0;
                        ConsoleType consoleType3 = gg6Var.h0;
                        String str8 = gg6Var.g0;
                        Uri uri11 = gg6Var.f0;
                        Uri uri12 = gg6Var.e0;
                        Uri uri13 = gg6Var.d0;
                        Uri uri14 = gg6Var.Z;
                        Uri uri15 = gg6Var.Y;
                        Uri uri16 = gg6Var.X;
                        Uri uri17 = gg6Var.R;
                        oi2.Y(obj5);
                        uri4 = uri12;
                        uri7 = uri15;
                        uri3 = uri13;
                        uri8 = uri14;
                        audioLatency2 = audioLatency3;
                        i7 = i11;
                        z8 = z13;
                        z7 = z14;
                        firmwareConfiguration = firmwareConfiguration2;
                        micSource = micSource2;
                        i8 = i12;
                        i6 = i13;
                        z6 = z15;
                        f2 = f4;
                        f3 = f5;
                        audioBitrate2 = audioBitrate3;
                        audioInterpolation3 = audioInterpolation4;
                        consoleType2 = consoleType3;
                        str6 = str8;
                        uri6 = uri11;
                        uri5 = uri16;
                        uri9 = uri17;
                        z9 = z17;
                        z10 = z16;
                        obj4 = obj5;
                        context = context2;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj5);
                    ConsoleType f6 = f();
                    boolean Q = Q();
                    Set<String> stringSet = sharedPreferences.getStringSet("bios_dir", null);
                    if (stringSet != null) {
                        str = (String) gt0.I0(stringSet);
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        uri = Uri.parse(str);
                    } else {
                        uri = null;
                    }
                    Set<String> stringSet2 = sharedPreferences.getStringSet("dsi_bios_dir", null);
                    if (stringSet2 != null) {
                        str2 = (String) gt0.I0(stringSet2);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        uri2 = Uri.parse(str2);
                    } else {
                        uri2 = null;
                    }
                    if ((f6 == ConsoleType.DS && Q && uri == null) || (f6 == ConsoleType.DSi && (uri == null || uri2 == null))) {
                        Log.w("SPSettingsRepository", "BIOS directory preference is incomplete; load will fail gracefully if custom BIOS is required");
                    }
                    zl1 y = y(uri, "bios_dir");
                    zl1 y2 = y(uri2, "dsi_bios_dir");
                    File file = new File(context2.getFilesDir(), "bios/ds");
                    File file2 = new File(context2.getFilesDir(), "bios/dsi");
                    Uri I = I(uri, y, "bios7.bin", file);
                    context = context2;
                    Uri I2 = I(uri, y, "bios9.bin", file);
                    Uri I3 = I(uri, y, "firmware.bin", file);
                    Uri I4 = I(uri2, y2, "bios7.bin", file2);
                    Uri I5 = I(uri2, y2, "bios9.bin", file2);
                    Uri I6 = I(uri2, y2, "firmware.bin", file2);
                    Uri I7 = I(uri2, y2, "nand.bin", file2);
                    boolean Q2 = Q();
                    boolean z18 = sharedPreferences.getBoolean("show_bios", false);
                    String absolutePath = context.getFilesDir().getAbsolutePath();
                    absolutePath.getClass();
                    String string2 = sharedPreferences.getString("fast_forward_speed_multiplier", "-1");
                    string2.getClass();
                    Float U = ws6.U(string2);
                    if (U != null) {
                        f = U.floatValue();
                    } else {
                        f = -1.0f;
                    }
                    float f7 = f;
                    String string3 = sharedPreferences.getString("frame_limit_speed_multiplier", "1");
                    string3.getClass();
                    Float U2 = ws6.U(string3);
                    float f8 = 1.0f;
                    if (U2 != null) {
                        z2 = z18;
                        z = Q2;
                        f8 = gi2.p(U2.floatValue(), 0.25f, 1.0f);
                    } else {
                        z = Q2;
                        z2 = z18;
                    }
                    float f9 = f8;
                    boolean z19 = sharedPreferences.getBoolean("enable_rewind", false);
                    int i14 = sharedPreferences.getInt("rewind_period", 10);
                    int i15 = sharedPreferences.getInt("rewind_window", 6) * 10;
                    String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
                    strArr.getClass();
                    if (strArr.length == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z20 = sharedPreferences.getBoolean("enable_jit", !z3);
                    boolean z21 = sharedPreferences.getBoolean("sound_enabled", true);
                    AudioInterpolation audioInterpolation5 = AudioInterpolation.NONE;
                    String lowerCase = audioInterpolation5.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String string4 = sharedPreferences.getString("audio_interpolation", lowerCase);
                    if (string4 == null) {
                        consoleType = f6;
                        str3 = absolutePath;
                        audioInterpolation = audioInterpolation5;
                    } else {
                        try {
                            em5Var = jw2.o(string4, AudioInterpolation.values());
                            consoleType = f6;
                        } catch (Throwable th) {
                            consoleType = f6;
                            em5Var = new em5(th);
                        }
                        if (hm5.a(em5Var) != null) {
                            str3 = absolutePath;
                            lb1.w("Invalid enum preference audio_interpolation=", string4, "; using ", audioInterpolation5.name(), "SPSettingsRepository");
                        } else {
                            str3 = absolutePath;
                        }
                        if (em5Var instanceof em5) {
                            obj = audioInterpolation5;
                        } else {
                            obj = em5Var;
                        }
                        audioInterpolation = (Enum) obj;
                    }
                    AudioInterpolation audioInterpolation6 = audioInterpolation;
                    Enum r11 = AudioBitrate.AUTO;
                    String lowerCase2 = r11.name().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    String string5 = sharedPreferences.getString("audio_bitrate", lowerCase2);
                    if (string5 == null) {
                        audioInterpolation2 = audioInterpolation6;
                    } else {
                        try {
                            em5Var2 = jw2.o(string5, AudioBitrate.values());
                            r28 = r11;
                        } catch (Throwable th2) {
                            r28 = r11;
                            em5Var2 = new em5(th2);
                        }
                        if (hm5.a(em5Var2) != null) {
                            audioInterpolation2 = audioInterpolation6;
                            lb1.w("Invalid enum preference audio_bitrate=", string5, "; using ", r28.name(), "SPSettingsRepository");
                        } else {
                            audioInterpolation2 = audioInterpolation6;
                        }
                        if (em5Var2 instanceof em5) {
                            obj2 = r28;
                        } else {
                            obj2 = em5Var2;
                        }
                        r11 = (Enum) obj2;
                    }
                    AudioBitrate audioBitrate4 = (AudioBitrate) r11;
                    int q = gi2.q(sharedPreferences.getInt("volume", 256), 0, 256);
                    AudioLatency audioLatency4 = AudioLatency.LOW;
                    String lowerCase3 = audioLatency4.name().toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    String string6 = sharedPreferences.getString("audio_latency", lowerCase3);
                    if (string6 == null) {
                        audioBitrate = audioBitrate4;
                        i2 = q;
                        audioLatency = audioLatency4;
                    } else {
                        try {
                            em5Var3 = jw2.o(string6, AudioLatency.values());
                            i2 = q;
                        } catch (Throwable th3) {
                            i2 = q;
                            em5Var3 = new em5(th3);
                        }
                        if (hm5.a(em5Var3) != null) {
                            audioBitrate = audioBitrate4;
                            lb1.w("Invalid enum preference audio_latency=", string6, "; using ", audioLatency4.name(), "SPSettingsRepository");
                        } else {
                            audioBitrate = audioBitrate4;
                        }
                        if (em5Var3 instanceof em5) {
                            obj3 = audioLatency4;
                        } else {
                            obj3 = em5Var3;
                        }
                        audioLatency = (Enum) obj3;
                    }
                    AudioLatency audioLatency5 = audioLatency;
                    MicSource o = o();
                    String string7 = sharedPreferences.getString("firmware_settings_birthday", "01/01");
                    string7.getClass();
                    List K0 = qs6.K0(string7, new String[]{"/"}, 6);
                    if (K0.size() != 2) {
                        vr4Var = new vr4(1, 1);
                    } else {
                        Integer h02 = xs6.h0((String) K0.get(0));
                        if (h02 != null) {
                            i3 = h02.intValue();
                        } else {
                            i3 = 1;
                        }
                        Integer h03 = xs6.h0((String) K0.get(1));
                        if (h03 != null) {
                            i4 = h03.intValue();
                        } else {
                            i4 = 1;
                        }
                        vr4Var = new vr4(Integer.valueOf(i3), Integer.valueOf(i4));
                    }
                    if (Q()) {
                        z5 = sharedPreferences.getBoolean("custom_randomize_mac_address", false);
                        str5 = null;
                    } else {
                        boolean z22 = sharedPreferences.getBoolean("internal_randomize_mac_address", false);
                        if (!z22) {
                            str4 = sharedPreferences.getString("internal_mac_address", null);
                            if (str4 == null) {
                                z4 = true;
                            } else {
                                z4 = z22;
                            }
                        } else {
                            z4 = z22;
                            str4 = null;
                        }
                        str5 = str4;
                        z5 = z4;
                    }
                    String string8 = sharedPreferences.getString("firmware_settings_nickname", "Player");
                    string8.getClass();
                    String string9 = sharedPreferences.getString("firmware_settings_message", "Hello!");
                    string9.getClass();
                    String string10 = sharedPreferences.getString("firmware_settings_language", "1");
                    string10.getClass();
                    Integer h04 = xs6.h0(string10);
                    if (h04 != null) {
                        i5 = h04.intValue();
                    } else {
                        i5 = 1;
                    }
                    FirmwareConfiguration firmwareConfiguration3 = new FirmwareConfiguration(string8, string9, i5, sharedPreferences.getInt("firmware_settings_colour", 0), ((Number) vr4Var.B).intValue(), ((Number) vr4Var.A).intValue(), z5, str5);
                    gg6Var.R = I;
                    gg6Var.X = I2;
                    gg6Var.Y = I3;
                    gg6Var.Z = I4;
                    gg6Var.d0 = I5;
                    gg6Var.e0 = I6;
                    gg6Var.f0 = I7;
                    String str9 = str3;
                    gg6Var.g0 = str9;
                    ConsoleType consoleType4 = consoleType;
                    gg6Var.h0 = consoleType4;
                    AudioInterpolation audioInterpolation7 = audioInterpolation2;
                    gg6Var.i0 = audioInterpolation7;
                    AudioBitrate audioBitrate5 = audioBitrate;
                    gg6Var.j0 = audioBitrate5;
                    gg6Var.k0 = audioLatency5;
                    gg6Var.l0 = o;
                    gg6Var.m0 = firmwareConfiguration3;
                    gg6Var.n0 = z;
                    gg6Var.o0 = z2;
                    gg6Var.s0 = f7;
                    gg6Var.t0 = f9;
                    gg6Var.p0 = z19;
                    gg6Var.u0 = i14;
                    gg6Var.v0 = i15;
                    gg6Var.q0 = z20;
                    gg6Var.r0 = z21;
                    gg6Var.w0 = i2;
                    gg6Var.z0 = 1;
                    Object B = f04.B(this.i, gg6Var);
                    if (B == x61Var) {
                        return x61Var;
                    }
                    audioLatency2 = audioLatency5;
                    obj4 = B;
                    micSource = o;
                    str6 = str9;
                    consoleType2 = consoleType4;
                    audioBitrate2 = audioBitrate5;
                    uri3 = I5;
                    audioInterpolation3 = audioInterpolation7;
                    f2 = f9;
                    z6 = z19;
                    z7 = z20;
                    i6 = i14;
                    z8 = z21;
                    i7 = i2;
                    firmwareConfiguration = firmwareConfiguration3;
                    uri4 = I6;
                    uri5 = I2;
                    uri6 = I7;
                    uri7 = I3;
                    f3 = f7;
                    z9 = z;
                    z10 = z2;
                    i8 = i15;
                    uri8 = I4;
                    uri9 = I;
                }
                RendererConfiguration rendererConfiguration = (RendererConfiguration) obj4;
                boolean z23 = sharedPreferences.getBoolean("system_dldi_sd_card_enabled", false);
                String absolutePath2 = new File(context.getFilesDir(), "dldi/dldi_sd.img").getAbsolutePath();
                string = sharedPreferences.getString("system_dldi_sd_card_image_size", "0");
                if (string == null && (h0 = xs6.h0(string)) != null) {
                    z11 = false;
                    i9 = gi2.q(h0.intValue(), 0, 5);
                } else {
                    z11 = false;
                    i9 = 0;
                }
                if (sharedPreferences.getBoolean("system_dldi_sd_card_enabled", z11)) {
                    Set<String> stringSet3 = sharedPreferences.getStringSet("system_dldi_sd_card_dir", null);
                    if (stringSet3 != null) {
                        str7 = (String) gt0.I0(stringSet3);
                    } else {
                        str7 = null;
                    }
                    if (str7 != null) {
                        uri10 = Uri.parse(str7);
                    } else {
                        uri10 = null;
                    }
                    if (uri10 != null) {
                        z12 = true;
                        return new EmulatorConfiguration(z9, z10, uri9, uri5, uri7, uri8, uri3, uri4, uri6, str6, f3, f2, z6, i6, i8, z7, false, consoleType2, z8, audioInterpolation3, audioBitrate2, i7, audioLatency2, micSource, firmwareConfiguration, rendererConfiguration, new DldiSdCardConfiguration(z23, absolutePath2, i9, z12, new File(context.getFilesDir(), "dldi/sync").getAbsolutePath()), 0L, 134217728, null);
                    }
                }
                z12 = z11;
                return new EmulatorConfiguration(z9, z10, uri9, uri5, uri7, uri8, uri3, uri4, uri6, str6, f3, f2, z6, i6, i8, z7, false, consoleType2, z8, audioInterpolation3, audioBitrate2, i7, audioLatency2, micSource, firmwareConfiguration, rendererConfiguration, new DldiSdCardConfiguration(z23, absolutePath2, i9, z12, new File(context.getFilesDir(), "dldi/sync").getAbsolutePath()), 0L, 134217728, null);
            }
        }
        gg6Var = new gg6(this, s41Var);
        Object obj52 = gg6Var.x0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = gg6Var.z0;
        Context context22 = this.a;
        sharedPreferences = this.b;
        if (i == 0) {
        }
        RendererConfiguration rendererConfiguration2 = (RendererConfiguration) obj4;
        boolean z232 = sharedPreferences.getBoolean("system_dldi_sd_card_enabled", false);
        String absolutePath22 = new File(context.getFilesDir(), "dldi/dldi_sd.img").getAbsolutePath();
        string = sharedPreferences.getString("system_dldi_sd_card_image_size", "0");
        if (string == null) {
        }
        z11 = false;
        i9 = 0;
        if (sharedPreferences.getBoolean("system_dldi_sd_card_enabled", z11)) {
        }
        z12 = z11;
        return new EmulatorConfiguration(z9, z10, uri9, uri5, uri7, uri8, uri3, uri4, uri6, str6, f3, f2, z6, i6, i8, z7, false, consoleType2, z8, audioInterpolation3, audioBitrate2, i7, audioLatency2, micSource, firmwareConfiguration, rendererConfiguration2, new DldiSdCardConfiguration(z232, absolutePath22, i9, z12, new File(context.getFilesDir(), "dldi/sync").getAbsolutePath()), 0L, 134217728, null);
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
    */
    public final Object l(jt5 jt5Var, s41 s41Var) {
        hg6 hg6Var;
        x61 x61Var;
        int i;
        jt5 jt5Var2;
        Object obj;
        EmulatorConfiguration emulatorConfiguration;
        RendererConfiguration rendererConfiguration;
        Object B;
        x61 x61Var2;
        Object obj2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        ng6 ng6Var;
        jt5 jt5Var3;
        int i9;
        int i10;
        float f2;
        RendererConfiguration rendererConfiguration2;
        Object B2;
        x61 x61Var3;
        Object obj3;
        int i11;
        int i12;
        int i13;
        x61 x61Var4;
        float f3;
        int i14;
        int i15;
        bg6 bg6Var;
        int i16;
        float f4;
        int i17;
        jt5 jt5Var4;
        int i18;
        Object B3;
        x61 x61Var5;
        Object obj4;
        EmulatorConfiguration emulatorConfiguration2;
        ng6 ng6Var2;
        int i19;
        jt5 jt5Var5;
        bg6 bg6Var2;
        float f5;
        int i20;
        float f6;
        int i21;
        int i22;
        int i23;
        String str;
        RendererConfiguration rendererConfiguration3;
        int i24;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (s41Var instanceof hg6) {
            hg6Var = (hg6) s41Var;
            int i25 = hg6Var.t0;
            if ((i25 & Integer.MIN_VALUE) != 0) {
                hg6Var.t0 = i25 - Integer.MIN_VALUE;
                Object obj5 = hg6Var.r0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = hg6Var.t0;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    int i26 = hg6Var.o0;
                                    i24 = hg6Var.n0;
                                    i18 = hg6Var.m0;
                                    i19 = hg6Var.l0;
                                    i16 = hg6Var.k0;
                                    int i27 = hg6Var.j0;
                                    i12 = hg6Var.i0;
                                    float f7 = hg6Var.q0;
                                    float f8 = hg6Var.p0;
                                    i23 = hg6Var.h0;
                                    i21 = hg6Var.g0;
                                    str = hg6Var.f0;
                                    bg6Var2 = hg6Var.e0;
                                    jt5Var5 = hg6Var.d0;
                                    RendererConfiguration rendererConfiguration4 = hg6Var.Z;
                                    ng6Var2 = hg6Var.Y;
                                    EmulatorConfiguration emulatorConfiguration3 = hg6Var.X;
                                    oi2.Y(obj5);
                                    i22 = i26;
                                    emulatorConfiguration2 = emulatorConfiguration3;
                                    i20 = i27;
                                    f5 = f7;
                                    f6 = f8;
                                    obj4 = obj5;
                                    rendererConfiguration3 = rendererConfiguration4;
                                    int i28 = i16;
                                    if (i21 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i23 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (i12 == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (i19 == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (i18 == 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i24 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    return EmulatorConfiguration.copy$default(emulatorConfiguration2, z, z2, null, null, null, null, null, null, null, null, f6, f5, z3, i20, i28, z4, z5, null, z6, null, null, i22, null, null, null, ng6Var2.b(rendererConfiguration3, jt5Var5, bg6Var2, str, (String) obj4), null, 0L, 234881023, null);
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i29 = hg6Var.o0;
                            int i30 = hg6Var.n0;
                            int i31 = hg6Var.m0;
                            i14 = hg6Var.l0;
                            int i32 = hg6Var.k0;
                            int i33 = hg6Var.j0;
                            int i34 = hg6Var.i0;
                            f4 = hg6Var.q0;
                            float f9 = hg6Var.p0;
                            int i35 = hg6Var.h0;
                            int i36 = hg6Var.g0;
                            bg6 bg6Var3 = hg6Var.e0;
                            obj3 = obj5;
                            jt5 jt5Var6 = hg6Var.d0;
                            RendererConfiguration rendererConfiguration5 = hg6Var.Z;
                            ng6 ng6Var3 = hg6Var.Y;
                            EmulatorConfiguration emulatorConfiguration4 = hg6Var.X;
                            oi2.Y(obj3);
                            i8 = i29;
                            i17 = i31;
                            ng6Var = ng6Var3;
                            bg6Var = bg6Var3;
                            i12 = i34;
                            i13 = i36;
                            i11 = i30;
                            i16 = i32;
                            jt5Var4 = jt5Var6;
                            emulatorConfiguration = emulatorConfiguration4;
                            i15 = i35;
                            f3 = f9;
                            i6 = i33;
                            rendererConfiguration2 = rendererConfiguration5;
                            x61Var4 = x61Var;
                            String str2 = (String) obj3;
                            int i37 = i17;
                            wp0 E = E();
                            hg6Var.R = null;
                            hg6Var.X = emulatorConfiguration;
                            hg6Var.Y = ng6Var;
                            hg6Var.Z = rendererConfiguration2;
                            hg6Var.d0 = jt5Var4;
                            hg6Var.e0 = bg6Var;
                            hg6Var.f0 = str2;
                            hg6Var.g0 = i13;
                            hg6Var.h0 = i15;
                            hg6Var.p0 = f3;
                            hg6Var.q0 = f4;
                            hg6Var.i0 = i12;
                            hg6Var.j0 = i6;
                            hg6Var.k0 = i16;
                            hg6Var.l0 = i14;
                            i18 = i37;
                            hg6Var.m0 = i18;
                            int i38 = i13;
                            int i39 = i11;
                            hg6Var.n0 = i39;
                            hg6Var.o0 = i8;
                            hg6Var.t0 = 4;
                            B3 = f04.B(E, hg6Var);
                            x61Var5 = x61Var4;
                            if (B3 != x61Var5) {
                                return x61Var5;
                            }
                            obj4 = B3;
                            emulatorConfiguration2 = emulatorConfiguration;
                            ng6Var2 = ng6Var;
                            i19 = i14;
                            jt5Var5 = jt5Var4;
                            bg6Var2 = bg6Var;
                            f5 = f4;
                            i20 = i6;
                            f6 = f3;
                            i21 = i38;
                            i22 = i8;
                            i23 = i15;
                            str = str2;
                            rendererConfiguration3 = rendererConfiguration2;
                            i24 = i39;
                            int i282 = i16;
                            if (i21 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i24 == 0) {
                            }
                            return EmulatorConfiguration.copy$default(emulatorConfiguration2, z, z2, null, null, null, null, null, null, null, null, f6, f5, z3, i20, i282, z4, z5, null, z6, null, null, i22, null, null, null, ng6Var2.b(rendererConfiguration3, jt5Var5, bg6Var2, str, (String) obj4), null, 0L, 234881023, null);
                        }
                        int i40 = hg6Var.o0;
                        int i41 = hg6Var.n0;
                        int i42 = hg6Var.m0;
                        int i43 = hg6Var.l0;
                        int i44 = hg6Var.k0;
                        int i45 = hg6Var.j0;
                        int i46 = hg6Var.i0;
                        float f10 = hg6Var.q0;
                        float f11 = hg6Var.p0;
                        int i47 = hg6Var.h0;
                        int i48 = hg6Var.g0;
                        jt5 jt5Var7 = hg6Var.d0;
                        rendererConfiguration = hg6Var.Z;
                        i8 = i40;
                        ng6 ng6Var4 = hg6Var.Y;
                        EmulatorConfiguration emulatorConfiguration5 = hg6Var.X;
                        oi2.Y(obj5);
                        ng6Var = ng6Var4;
                        obj2 = obj5;
                        x61Var2 = x61Var;
                        jt5Var3 = jt5Var7;
                        i7 = i46;
                        i3 = i42;
                        emulatorConfiguration = emulatorConfiguration5;
                        i10 = i48;
                        i6 = i45;
                        f2 = f11;
                        i4 = i43;
                        i9 = i47;
                        i5 = i44;
                        i2 = i41;
                        f = f10;
                        rendererConfiguration2 = rendererConfiguration;
                        bg6 bg6Var4 = (bg6) obj2;
                        int i49 = i2;
                        wp0 F = F();
                        hg6Var.R = null;
                        hg6Var.X = emulatorConfiguration;
                        hg6Var.Y = ng6Var;
                        hg6Var.Z = rendererConfiguration2;
                        hg6Var.d0 = jt5Var3;
                        hg6Var.e0 = bg6Var4;
                        hg6Var.g0 = i10;
                        hg6Var.h0 = i9;
                        hg6Var.p0 = f2;
                        hg6Var.q0 = f;
                        hg6Var.i0 = i7;
                        hg6Var.j0 = i6;
                        hg6Var.k0 = i5;
                        hg6Var.l0 = i4;
                        hg6Var.m0 = i3;
                        hg6Var.n0 = i49;
                        int i50 = i9;
                        hg6Var.o0 = i8;
                        hg6Var.t0 = 3;
                        B2 = f04.B(F, hg6Var);
                        int i51 = i10;
                        x61Var3 = x61Var2;
                        if (B2 != x61Var3) {
                            return x61Var3;
                        }
                        obj3 = B2;
                        i11 = i49;
                        i12 = i7;
                        i13 = i51;
                        x61Var4 = x61Var3;
                        f3 = f2;
                        i14 = i4;
                        i15 = i50;
                        bg6Var = bg6Var4;
                        i16 = i5;
                        f4 = f;
                        i17 = i3;
                        jt5Var4 = jt5Var3;
                        String str22 = (String) obj3;
                        int i372 = i17;
                        wp0 E2 = E();
                        hg6Var.R = null;
                        hg6Var.X = emulatorConfiguration;
                        hg6Var.Y = ng6Var;
                        hg6Var.Z = rendererConfiguration2;
                        hg6Var.d0 = jt5Var4;
                        hg6Var.e0 = bg6Var;
                        hg6Var.f0 = str22;
                        hg6Var.g0 = i13;
                        hg6Var.h0 = i15;
                        hg6Var.p0 = f3;
                        hg6Var.q0 = f4;
                        hg6Var.i0 = i12;
                        hg6Var.j0 = i6;
                        hg6Var.k0 = i16;
                        hg6Var.l0 = i14;
                        i18 = i372;
                        hg6Var.m0 = i18;
                        int i382 = i13;
                        int i392 = i11;
                        hg6Var.n0 = i392;
                        hg6Var.o0 = i8;
                        hg6Var.t0 = 4;
                        B3 = f04.B(E2, hg6Var);
                        x61Var5 = x61Var4;
                        if (B3 != x61Var5) {
                        }
                    } else {
                        obj = obj5;
                        jt5Var2 = hg6Var.R;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj5);
                    jt5Var2 = jt5Var;
                    hg6Var.R = jt5Var2;
                    hg6Var.t0 = 1;
                    Object k = k(hg6Var);
                    if (k != x61Var) {
                        obj = k;
                    }
                    return x61Var;
                }
                emulatorConfiguration = (EmulatorConfiguration) obj;
                rendererConfiguration = emulatorConfiguration.getRendererConfiguration();
                wp0 G = G();
                hg6Var.R = null;
                hg6Var.X = emulatorConfiguration;
                hg6Var.Y = this;
                hg6Var.Z = rendererConfiguration;
                hg6Var.d0 = jt5Var2;
                hg6Var.g0 = 0;
                hg6Var.h0 = 0;
                hg6Var.p0 = RecyclerView.B1;
                hg6Var.q0 = RecyclerView.B1;
                hg6Var.i0 = 0;
                hg6Var.j0 = 0;
                hg6Var.k0 = 0;
                hg6Var.l0 = 0;
                hg6Var.m0 = 0;
                hg6Var.n0 = 0;
                hg6Var.o0 = 0;
                hg6Var.t0 = 2;
                B = f04.B(G, hg6Var);
                if (B != x61Var) {
                    x61Var2 = x61Var;
                    obj2 = B;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    f = 0.0f;
                    ng6Var = this;
                    jt5Var3 = jt5Var2;
                    i9 = 0;
                    i10 = 0;
                    f2 = 0.0f;
                    rendererConfiguration2 = rendererConfiguration;
                    bg6 bg6Var42 = (bg6) obj2;
                    int i492 = i2;
                    wp0 F2 = F();
                    hg6Var.R = null;
                    hg6Var.X = emulatorConfiguration;
                    hg6Var.Y = ng6Var;
                    hg6Var.Z = rendererConfiguration2;
                    hg6Var.d0 = jt5Var3;
                    hg6Var.e0 = bg6Var42;
                    hg6Var.g0 = i10;
                    hg6Var.h0 = i9;
                    hg6Var.p0 = f2;
                    hg6Var.q0 = f;
                    hg6Var.i0 = i7;
                    hg6Var.j0 = i6;
                    hg6Var.k0 = i5;
                    hg6Var.l0 = i4;
                    hg6Var.m0 = i3;
                    hg6Var.n0 = i492;
                    int i502 = i9;
                    hg6Var.o0 = i8;
                    hg6Var.t0 = 3;
                    B2 = f04.B(F2, hg6Var);
                    int i512 = i10;
                    x61Var3 = x61Var2;
                    if (B2 != x61Var3) {
                    }
                }
                return x61Var;
            }
        }
        hg6Var = new hg6(this, s41Var);
        Object obj52 = hg6Var.r0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = hg6Var.t0;
        if (i == 0) {
        }
        emulatorConfiguration = (EmulatorConfiguration) obj;
        rendererConfiguration = emulatorConfiguration.getRendererConfiguration();
        wp0 G2 = G();
        hg6Var.R = null;
        hg6Var.X = emulatorConfiguration;
        hg6Var.Y = this;
        hg6Var.Z = rendererConfiguration;
        hg6Var.d0 = jt5Var2;
        hg6Var.g0 = 0;
        hg6Var.h0 = 0;
        hg6Var.p0 = RecyclerView.B1;
        hg6Var.q0 = RecyclerView.B1;
        hg6Var.i0 = 0;
        hg6Var.j0 = 0;
        hg6Var.k0 = 0;
        hg6Var.l0 = 0;
        hg6Var.m0 = 0;
        hg6Var.n0 = 0;
        hg6Var.o0 = 0;
        hg6Var.t0 = 2;
        B = f04.B(G2, hg6Var);
        if (B != x61Var) {
        }
        return x61Var;
    }

    public final u82 m() {
        Object em5Var;
        Enum r0 = u82.MELON_DUAL_DS;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("external_display_mode", lowerCase);
        if (string != null) {
            try {
                em5Var = jw2.o(string, u82.values());
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (hm5.a(em5Var) != null) {
                lb1.w("Invalid enum preference external_display_mode=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(em5Var instanceof em5)) {
                r02 = em5Var;
            }
            r0 = r02;
        }
        return (u82) r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List n() {
        Object em5Var;
        yt1 yt1Var;
        SharedPreferences sharedPreferences = this.b;
        String string = sharedPreferences.getString("video_vulkan_custom_drivers", null);
        yt1 yt1Var2 = yt1.A;
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                kw3 I = hf.I();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("id");
                        optString.getClass();
                        if (qs6.v0(optString)) {
                            optString = null;
                        }
                        if (optString != null) {
                            String optString2 = optJSONObject.optString("displayName");
                            optString2.getClass();
                            if (qs6.v0(optString2)) {
                                optString2 = null;
                            }
                            if (optString2 != null) {
                                String optString3 = optJSONObject.optString("driverDir");
                                optString3.getClass();
                                if (qs6.v0(optString3)) {
                                    optString3 = null;
                                }
                                if (optString3 != null) {
                                    String optString4 = optJSONObject.optString("driverName");
                                    optString4.getClass();
                                    if (qs6.v0(optString4)) {
                                        optString4 = null;
                                    }
                                    if (optString4 != null) {
                                        I.add(new zq7(optString, optString2, optString3, optString4));
                                    }
                                }
                            }
                        }
                    }
                }
                em5Var = hf.A(I);
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (em5Var instanceof em5) {
                em5Var = yt1Var2;
            }
            yt1Var = (List) em5Var;
        } else {
            yt1Var = null;
        }
        if (yt1Var == null) {
            yt1Var = yt1Var2;
        }
        if (!yt1Var.isEmpty()) {
            return yt1Var;
        }
        String string2 = sharedPreferences.getString("video_vulkan_custom_driver_name", null);
        String string3 = sharedPreferences.getString("video_vulkan_custom_driver_dir", null);
        String string4 = sharedPreferences.getString("video_vulkan_custom_driver_display_name", null);
        if (string2 != null && !qs6.v0(string2) && string3 != null && !qs6.v0(string3) && new File(string3).isDirectory()) {
            if (string4 == null) {
                string4 = string2;
            }
            return hf.b0(new zq7("legacy", string4, string3, string2));
        }
        return yt1Var2;
    }

    public final MicSource o() {
        Object em5Var;
        Enum r0 = MicSource.BLOW;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("mic_source", lowerCase);
        if (string != null) {
            try {
                em5Var = jw2.o(string, MicSource.values());
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (hm5.a(em5Var) != null) {
                lb1.w("Invalid enum preference mic_source=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(em5Var instanceof em5)) {
                r02 = em5Var;
            }
            r0 = r02;
        }
        return (MicSource) r0;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        na4 na4Var = (na4) this.h.get(str);
        if (na4Var != null) {
            na4Var.k(jg7.a);
        }
    }

    public final wp0 p(String str, on2 on2Var) {
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(str);
        of6 of6Var = obj;
        if (obj == null) {
            of6 b = pf6.b(1, 0, m80.DROP_OLDEST, 2);
            b.k(jg7.a);
            linkedHashMap.put(str, b);
            of6Var = b;
        }
        return new wp0(8, (na4) of6Var, on2Var);
    }

    public final jx5 q() {
        Object em5Var;
        Enum r0 = jx5.NONE;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = this.b.getString("rom_icon_filtering", lowerCase);
        if (string != null) {
            try {
                em5Var = jw2.o(string, jx5.values());
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (hm5.a(em5Var) != null) {
                lb1.w("Invalid enum preference rom_icon_filtering=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(em5Var instanceof em5)) {
                r02 = em5Var;
            }
            r0 = r02;
        }
        return (jx5) r0;
    }

    public final Uri[] r() {
        Set<String> stringSet = this.b.getStringSet("rom_search_dirs", du1.A);
        if (stringSet != null) {
            Set<String> set = stringSet;
            ArrayList arrayList = new ArrayList(ht0.v0(set, 10));
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

    public final gn6 s() {
        Object em5Var;
        String str = "alphabetically";
        String string = this.b.getString("rom_sorting_mode", "alphabetically");
        if (string != null) {
            str = string;
        }
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            em5Var = gn6.valueOf(upperCase);
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        Object obj = gn6.ALPHABETICALLY;
        if (em5Var instanceof em5) {
            em5Var = obj;
        }
        return (gn6) em5Var;
    }

    public final n06 t() {
        Object em5Var;
        String str = "grid";
        String string = this.b.getString("rom_view_mode", "grid");
        if (string != null) {
            str = string;
        }
        try {
            em5Var = (n06) jw2.o(str, n06.values());
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        Object obj = n06.GRID;
        if (em5Var instanceof em5) {
            em5Var = obj;
        }
        return (n06) em5Var;
    }

    public final Uri u(pq5 pq5Var) {
        Uri fromFile;
        Uri uri;
        String str;
        Uri uri2;
        String str2;
        pq5Var.getClass();
        SharedPreferences sharedPreferences = this.b;
        Uri uri3 = null;
        if (!sharedPreferences.getBoolean("use_rom_dir", true)) {
            Set<String> stringSet = sharedPreferences.getStringSet("sram_dir", null);
            if (stringSet != null) {
                str = (String) gt0.I0(stringSet);
            } else {
                str = null;
            }
            if (str != null) {
                uri2 = Uri.parse(str);
            } else {
                uri2 = null;
            }
            if (uri2 != null) {
                Set<String> stringSet2 = sharedPreferences.getStringSet("sram_dir", null);
                if (stringSet2 != null) {
                    str2 = (String) gt0.I0(stringSet2);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    uri3 = Uri.parse(str2);
                }
                uri3.getClass();
                return uri3;
            }
        }
        if (sharedPreferences.getBoolean("use_rom_dir", true) && (uri = pq5Var.e) != null) {
            if (uri != null) {
                zl1 b = this.d.b(uri);
                if (b != null) {
                    uri3 = b.j();
                }
                if (uri3 != null) {
                    return uri3;
                }
            }
            throw new Exception("Could not determine ROMs parent document");
        }
        File file = new File(j(), "save");
        if (!file.isDirectory() && !file.mkdirs()) {
            File file2 = new File(this.a.getExternalFilesDir(null), "save");
            file2.mkdirs();
            fromFile = Uri.fromFile(file2);
        } else {
            fromFile = Uri.fromFile(file);
        }
        fromFile.getClass();
        return fromFile;
    }

    public final UUID v() {
        UUID fromString;
        String string = this.b.getString("input_layout_id", null);
        if (string != null && (fromString = UUID.fromString(string)) != null) {
            return fromString;
        }
        return fk3.h;
    }

    public final zq7 w() {
        String x = x();
        Object obj = null;
        if (x == null) {
            return null;
        }
        Iterator it = n().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((zq7) next).a.equals(x)) {
                obj = next;
                break;
            }
        }
        return (zq7) obj;
    }

    public final String x() {
        String string = this.b.getString("video_vulkan_selected_driver_id", null);
        if (string == null) {
            zq7 zq7Var = (zq7) gt0.J0(n());
            if (zq7Var == null) {
                return null;
            }
            return zq7Var.a;
        }
        return string;
    }

    public final zl1 y(Uri uri, String str) {
        Object em5Var;
        Object obj = null;
        if (uri != null) {
            try {
                if (nb3.k(uri.getScheme(), "file")) {
                    String path = uri.getPath();
                    if (path != null) {
                        File file = new File(path);
                        if (file.exists() && file.isDirectory()) {
                            em5Var = new vd5(file);
                        } else {
                            em5Var = null;
                        }
                    }
                } else {
                    em5Var = zl1.h(this.a, uri);
                }
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            Throwable a = hm5.a(em5Var);
            if (a != null) {
                Log.w("SPSettingsRepository", "Could not access restored tree preference " + str + "=" + uri, a);
            }
            if (!(em5Var instanceof em5)) {
                obj = em5Var;
            }
            return (zl1) obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yq7 z(String str) {
        boolean z;
        String str2;
        String str3;
        zq7 zq7Var;
        zq7 zq7Var2;
        String str4;
        Object obj;
        String absolutePath;
        zq7 w = w();
        Context context = this.a;
        String str5 = null;
        if (w != null) {
            String str6 = w.c;
            String str7 = w.d;
            if (!new File(str6, str7).isFile()) {
                fc2 fc2Var = new fc2(jc2.E0(new File(context.getFilesDir(), "adreno-drivers"), ic2.TOP_DOWN));
                while (true) {
                    if (fc2Var.hasNext()) {
                        obj = fc2Var.next();
                        File file = (File) obj;
                        if (file.isFile() && nb3.k(file.getName(), str7)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                File file2 = (File) obj;
                if (file2 != null) {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null && (absolutePath = parentFile.getAbsolutePath()) != null) {
                        str6 = absolutePath;
                    }
                    String str8 = w.a;
                    String str9 = w.b;
                    str9.getClass();
                    str6.getClass();
                    str7.getClass();
                    w = new zq7(str8, str9, str6, str7);
                }
            }
        } else {
            w = null;
        }
        sr7 A = A();
        sr7 sr7Var = sr7.CUSTOM;
        if (A == sr7Var && w != null && q60.N(context)) {
            z = true;
        } else {
            z = false;
        }
        File file3 = new File(context.getCacheDir(), "adrenotools/tmp");
        file3.mkdirs();
        if (!z) {
            sr7Var = sr7.SYSTEM;
        }
        sr7 sr7Var2 = sr7Var;
        String absolutePath2 = file3.getAbsolutePath();
        absolutePath2.getClass();
        if (w != null) {
            if (z) {
                zq7Var2 = w;
            } else {
                zq7Var2 = null;
            }
            if (zq7Var2 != null && (str4 = zq7Var2.c) != null) {
                String str10 = File.separator;
                str10.getClass();
                if (!xs6.Y(str4, str10, false)) {
                    str4 = str4.concat(str10);
                }
                str2 = str4;
                if (w != null) {
                    if (z) {
                        zq7Var = w;
                    } else {
                        zq7Var = null;
                    }
                    if (zq7Var != null) {
                        str3 = zq7Var.d;
                        if (w != null) {
                            if (!z) {
                                w = null;
                            }
                            if (w != null) {
                                str5 = w.b;
                            }
                        }
                        return new yq7(sr7Var2, absolutePath2, str, str2, str3, str5);
                    }
                }
                str3 = null;
                if (w != null) {
                }
                return new yq7(sr7Var2, absolutePath2, str, str2, str3, str5);
            }
        }
        str2 = null;
        if (w != null) {
        }
        str3 = null;
        if (w != null) {
        }
        return new yq7(sr7Var2, absolutePath2, str, str2, str3, str5);
    }
}
