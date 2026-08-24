package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.database.MelonDatabase;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd6  reason: default package */
/* loaded from: classes.dex */
public final class jd6 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final Set f = fv.V0(new String[]{"ra_token", "rom_search_dirs", "bios_dir", "dsi_bios_dir", "settings_mirror_fallback_uri"});
    public static final List g = hf.c0(new vr4("cheat_database", hf.c0("id", "name")), new vr4("game", hf.c0("id", "name", "game_code", "game_checksum")), new vr4("cheat_folder", hf.c0("id", "game_id", "name")), new vr4("cheat", hf.c0("id", "cheat_folder_id", "cheat_database_id", "name", "description", "code", "enabled")));
    public static final List h = hf.c0("cheat", "cheat_folder", "game", "cheat_database");
    public static final Set i = fv.V0(new String[]{"ra_hash_library_last_updated", "github_updates_nightly_next_check_date", "github_updates_nightly_last_release_date", "github_updates_last_check", "last_version"});
    public final Context a;
    public final SharedPreferences b;
    public final MelonDatabase c;
    public final o41 d;
    public final AtomicBoolean e;

    public jd6(Context context, SharedPreferences sharedPreferences, MelonDatabase melonDatabase) {
        this.a = context;
        this.b = sharedPreferences;
        this.c = melonDatabase;
        gu6 c = oi2.c();
        xe1 xe1Var = xk1.a;
        this.d = g04.i(jw2.y(c, de1.L));
        this.e = new AtomicBoolean(false);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public static final void a(jd6 jd6Var) {
        Object em5Var;
        String jSONObject = jd6Var.d().toString();
        jSONObject.getClass();
        Context context = jd6Var.a;
        q(new File(context.getFilesDir(), "melonDualDS.opts"), jSONObject);
        Uri e = jd6Var.e();
        if (e != null) {
            jd6Var.p(e, jSONObject);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        SharedPreferences sharedPreferences = jd6Var.b;
        Set<String> stringSet = sharedPreferences.getStringSet("sram_dir", null);
        if (stringSet != null) {
            for (String str : stringSet) {
                str.getClass();
                linkedHashSet.add(Uri.parse(str));
            }
        }
        Set<String> stringSet2 = sharedPreferences.getStringSet("rom_search_dirs", null);
        if (stringSet2 != null) {
            for (String str2 : stringSet2) {
                str2.getClass();
                linkedHashSet.add(Uri.parse(str2));
            }
        }
        String string = sharedPreferences.getString("settings_mirror_fallback_uri", null);
        if (string != null) {
            linkedHashSet.add(Uri.parse(string));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (!nb3.k((Uri) obj, e)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            Uri uri = (Uri) obj2;
            try {
                zl1 f2 = zl1.h(context, uri).f("melonDualDS.opts");
                if (f2 != null) {
                    em5Var = Boolean.valueOf(f2.d());
                } else {
                    em5Var = null;
                }
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            Throwable a = hm5.a(em5Var);
            if (a != null) {
                Log.w("SettingsBackupManager", "Failed to delete stale settings mirror from " + uri, a);
            }
        }
    }

    public static void o(File file, byte[] bArr) {
        File parentFile = file.getParentFile();
        String name = file.getName();
        File file2 = new File(parentFile, name + ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            try {
                fileOutputStream.getFD().sync();
            } catch (Throwable unused) {
            }
            fileOutputStream.close();
            if (!file2.renameTo(file)) {
                if (file.exists() && !file.delete()) {
                    i.m(i61.m("Could not replace ", file.getAbsolutePath()));
                } else if (!file2.renameTo(file)) {
                    e41.r("Could not move ", file2.getAbsolutePath(), " to ", file.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ge7.t(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static void q(File file, String str) {
        byte[] bytes = str.getBytes(qm0.a);
        bytes.getClass();
        o(file, bytes);
    }

    public final void b(Uri uri) {
        OutputStream openOutputStream;
        uri.getClass();
        Context context = this.a;
        qi6 h2 = zl1.h(context, uri);
        zl1 f2 = h2.f("melonDualDS.opts");
        if ((f2 != null || (f2 = h2.c("application/octet-stream", "melonDualDS.opts")) != null) && (openOutputStream = context.getContentResolver().openOutputStream(f2.j())) != null) {
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openOutputStream, qm0.a);
                outputStreamWriter.write(d().toString());
                outputStreamWriter.close();
                openOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ge7.t(openOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r0 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Uri uri, String str) {
        Object em5Var;
        String str2;
        Object em5Var2;
        OutputStream openOutputStream;
        Context context = this.a;
        qi6 h2 = zl1.h(context, uri);
        File file = new File(context.getFilesDir(), "layouts.json");
        Object obj = null;
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            try {
                em5Var = jc2.B0(file);
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (em5Var instanceof em5) {
                em5Var = null;
            }
            str2 = (String) em5Var;
        }
        str2 = "[]";
        try {
            em5Var2 = new JSONArray(str2);
        } catch (Throwable th2) {
            em5Var2 = new em5(th2);
        }
        if (!(em5Var2 instanceof em5)) {
            obj = em5Var2;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray != null) {
            zl1 f2 = h2.f(str);
            if ((f2 != null || (f2 = h2.c("application/json", str)) != null) && (openOutputStream = context.getContentResolver().openOutputStream(f2.j())) != null) {
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openOutputStream, qm0.a);
                    outputStreamWriter.write(jSONArray.toString());
                    outputStreamWriter.close();
                    openOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ge7.t(openOutputStream, th3);
                        throw th4;
                    }
                }
            }
        }
    }

    public final JSONObject d() {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        JSONObject jSONObject2 = new JSONObject();
        Map<String, ?> all = this.b.getAll();
        all.getClass();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!f.contains(key)) {
                if (!(value instanceof Boolean) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Float) && !(value instanceof String)) {
                    if (value instanceof Set) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (Object obj : (Iterable) value) {
                            jSONArray2.put(obj);
                        }
                        jSONObject2.put(key, jSONArray2);
                    }
                } else {
                    jSONObject2.put(key, value);
                }
            }
        }
        jSONObject.put("settings", jSONObject2);
        Object g2 = g("controller_config.json");
        if (g2 != null) {
            jSONObject.put("controllerConfig", g2);
        }
        Object g3 = g("layouts.json");
        if (g3 != null) {
            jSONObject.put("layouts", g3);
        }
        Object g4 = g("backgrounds.json");
        if (g4 != null) {
            jSONObject.put("backgrounds", g4);
        }
        Object g5 = g("rom_data.json");
        JSONArray jSONArray3 = null;
        if (g5 instanceof JSONArray) {
            jSONArray = (JSONArray) g5;
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            jSONArray3 = new JSONArray();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    JSONObject jSONObject3 = new JSONObject(optJSONObject.toString());
                    jSONObject3.remove("uri");
                    jSONObject3.remove("parentTreeUri");
                    jSONArray3.put(jSONObject3);
                }
            }
        }
        if (jSONArray3 != null) {
            jSONObject.put("roms", jSONArray3);
        }
        vm2 G = this.c.h().G();
        JSONObject jSONObject4 = new JSONObject();
        for (vr4 vr4Var : g) {
            String str = (String) vr4Var.A;
            List<String> list = (List) vr4Var.B;
            JSONArray jSONArray4 = new JSONArray();
            Cursor A = G.A(lb1.n("SELECT ", gt0.P0(list, ", ", null, null, null, 62), " FROM ", str, " ORDER BY id"));
            while (A.moveToNext()) {
                try {
                    JSONObject jSONObject5 = new JSONObject();
                    for (String str2 : list) {
                        int columnIndexOrThrow = A.getColumnIndexOrThrow(str2);
                        int type = A.getType(columnIndexOrThrow);
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 2) {
                                    if (type != 3) {
                                        if (type == 4) {
                                            jSONObject5.put(str2, JSONObject.NULL);
                                        }
                                    } else {
                                        jSONObject5.put(str2, A.getString(columnIndexOrThrow));
                                    }
                                } else {
                                    jSONObject5.put(str2, A.getDouble(columnIndexOrThrow));
                                }
                            } else {
                                jSONObject5.put(str2, A.getLong(columnIndexOrThrow));
                            }
                        } else {
                            jSONObject5.put(str2, JSONObject.NULL);
                        }
                    }
                    jSONArray4.put(jSONObject5);
                } finally {
                }
            }
            A.close();
            jSONObject4.put(str, jSONArray4);
        }
        jSONObject.put("cheats", jSONObject4);
        return jSONObject;
    }

    public final Uri e() {
        String str;
        Set<String> stringSet;
        String str2;
        SharedPreferences sharedPreferences = this.b;
        if (!sharedPreferences.getBoolean("use_rom_dir", true) && (stringSet = sharedPreferences.getStringSet("sram_dir", null)) != null && (str2 = (String) gt0.I0(stringSet)) != null) {
            return Uri.parse(str2);
        }
        String string = sharedPreferences.getString("settings_mirror_fallback_uri", null);
        if (string != null) {
            return Uri.parse(string);
        }
        Set<String> stringSet2 = sharedPreferences.getStringSet("rom_search_dirs", null);
        if (stringSet2 == null || (str = (String) gt0.I0(stringSet2)) == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public final boolean f(Uri uri) {
        Boolean em5Var;
        uri.getClass();
        Context context = this.a;
        zl1 f2 = zl1.h(context, uri).f("melonDualDS.opts");
        boolean z = false;
        if (f2 != null) {
            JSONObject jSONObject = null;
            if (!f2.l()) {
                f2 = null;
            }
            if (f2 != null) {
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(f2.j());
                    if (openInputStream != null) {
                        jSONObject = new JSONObject(yh2.E(new InputStreamReader(openInputStream, qm0.a)));
                        openInputStream.close();
                    }
                    if (jSONObject != null) {
                        z = true;
                    }
                    em5Var = Boolean.valueOf(z);
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                Throwable a = hm5.a(em5Var);
                if (a != null) {
                    Log.w("SettingsBackupManager", "Ignoring invalid settings mirror at " + uri, a);
                }
                Boolean bool = Boolean.FALSE;
                if (em5Var instanceof em5) {
                    em5Var = bool;
                }
                return ((Boolean) em5Var).booleanValue();
            }
        }
        return false;
    }

    public final Object g(String str) {
        Character valueOf;
        File file = new File(this.a.getFilesDir(), str);
        if (!file.exists()) {
            return null;
        }
        String B0 = jc2.B0(file);
        String obj = qs6.T0(B0).toString();
        obj.getClass();
        if (obj.length() == 0) {
            valueOf = null;
        } else {
            valueOf = Character.valueOf(obj.charAt(0));
        }
        if (valueOf != null && valueOf.charValue() == '[') {
            return new JSONArray(B0);
        }
        if (valueOf == null || valueOf.charValue() != '{') {
            return null;
        }
        return new JSONObject(B0);
    }

    public final void h(Uri uri) {
        uri.getClass();
        this.b.edit().putString("settings_mirror_fallback_uri", uri.toString()).apply();
    }

    public final void i() {
        if (!this.b.getBoolean("save_internal_config_as_file", false) || !this.e.compareAndSet(false, true)) {
            return;
        }
        hv.L(this.d, null, null, new y3(this, (r41) null, 16), 3);
    }

    public final void j(Uri uri) {
        Uri j;
        InputStream openInputStream;
        Uri j2;
        Uri j3;
        Uri j4;
        SharedPreferences sharedPreferences = this.b;
        uri.getClass();
        Context context = this.a;
        qi6 h2 = zl1.h(context, uri);
        zl1 f2 = h2.f("melonDualDS.opts");
        if (f2 != null) {
            openInputStream = context.getContentResolver().openInputStream(f2.j());
            if (openInputStream != null) {
                try {
                    k(new JSONObject(yh2.E(new InputStreamReader(openInputStream, qm0.a))));
                    openInputStream.close();
                } finally {
                }
            }
        } else {
            zl1 f3 = h2.f("settings.json");
            if (f3 != null && (j4 = f3.j()) != null && (openInputStream = context.getContentResolver().openInputStream(j4)) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(yh2.E(new InputStreamReader(openInputStream, qm0.a)));
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    Iterator<String> keys = jSONObject.keys();
                    keys.getClass();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!f.contains(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Boolean) {
                                edit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else {
                                boolean z = obj instanceof Integer;
                                Set set = i;
                                if (z) {
                                    if (set.contains(next)) {
                                        edit.putLong(next, ((Number) obj).intValue());
                                    } else {
                                        edit.putInt(next, ((Number) obj).intValue());
                                    }
                                } else if (obj instanceof Long) {
                                    edit.putLong(next, ((Number) obj).longValue());
                                } else if (obj instanceof Double) {
                                    edit.putFloat(next, (float) ((Number) obj).doubleValue());
                                } else if (obj instanceof String) {
                                    edit.putString(next, (String) obj);
                                } else if (obj instanceof JSONArray) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    int length = ((JSONArray) obj).length();
                                    for (int i2 = 0; i2 < length; i2++) {
                                        String string = ((JSONArray) obj).getString(i2);
                                        string.getClass();
                                        linkedHashSet.add(string);
                                    }
                                    edit.putStringSet(next, linkedHashSet);
                                } else if (obj instanceof Number) {
                                    Object obj2 = sharedPreferences.getAll().get(next);
                                    if (!(obj2 instanceof Long) && !set.contains(next)) {
                                        if (obj2 instanceof Integer) {
                                            edit.putInt(next, ((Number) obj).intValue());
                                        } else if (obj2 instanceof Float) {
                                            edit.putFloat(next, ((Number) obj).floatValue());
                                        } else if (obj instanceof Double) {
                                            edit.putFloat(next, (float) ((Number) obj).doubleValue());
                                        } else {
                                            edit.putLong(next, ((Number) obj).longValue());
                                        }
                                    }
                                    edit.putLong(next, ((Number) obj).longValue());
                                }
                            }
                        }
                    }
                    edit.apply();
                    openInputStream.close();
                } catch (Throwable th) {
                }
            }
            zl1 f4 = h2.f("controller_config.json");
            if (f4 != null && (j3 = f4.j()) != null) {
                File file = new File(context.getFilesDir(), "controller_config.json");
                openInputStream = context.getContentResolver().openInputStream(j3);
                if (openInputStream != null) {
                    try {
                        o(file, f04.M(openInputStream));
                        openInputStream.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            zl1 f5 = h2.f("layouts.json");
            if (f5 != null && (j2 = f5.j()) != null) {
                File file2 = new File(context.getFilesDir(), "layouts.json");
                openInputStream = context.getContentResolver().openInputStream(j2);
                if (openInputStream != null) {
                    try {
                        o(file2, f04.M(openInputStream));
                        openInputStream.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            zl1 f6 = h2.f("rom_data.json");
            if (f6 != null && (j = f6.j()) != null && (openInputStream = context.getContentResolver().openInputStream(j)) != null) {
                try {
                    String E = yh2.E(new InputStreamReader(openInputStream, qm0.a));
                    new JSONArray(E);
                    q(new File(context.getFilesDir(), "rom_data.json"), E);
                    openInputStream.close();
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }
    }

    public final void k(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            SharedPreferences sharedPreferences = this.b;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            Iterator<String> keys = optJSONObject.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!f.contains(next)) {
                    Object obj = optJSONObject.get(next);
                    if (obj instanceof Boolean) {
                        edit.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else {
                        boolean z = obj instanceof Integer;
                        Set set = i;
                        if (z) {
                            if (set.contains(next)) {
                                edit.putLong(next, ((Number) obj).intValue());
                            } else {
                                edit.putInt(next, ((Number) obj).intValue());
                            }
                        } else if (obj instanceof Long) {
                            edit.putLong(next, ((Number) obj).longValue());
                        } else if (obj instanceof Double) {
                            edit.putFloat(next, (float) ((Number) obj).doubleValue());
                        } else if (obj instanceof String) {
                            edit.putString(next, (String) obj);
                        } else if (obj instanceof JSONArray) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            JSONArray jSONArray = (JSONArray) obj;
                            int length = jSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                String string = jSONArray.getString(i2);
                                string.getClass();
                                linkedHashSet.add(string);
                            }
                            edit.putStringSet(next, linkedHashSet);
                        } else if (obj instanceof Number) {
                            Object obj2 = sharedPreferences.getAll().get(next);
                            if (!(obj2 instanceof Long) && !set.contains(next)) {
                                if (obj2 instanceof Integer) {
                                    edit.putInt(next, ((Number) obj).intValue());
                                } else if (obj2 instanceof Float) {
                                    edit.putFloat(next, ((Number) obj).floatValue());
                                } else if (obj instanceof Double) {
                                    edit.putFloat(next, (float) ((Number) obj).doubleValue());
                                } else {
                                    edit.putLong(next, ((Number) obj).longValue());
                                }
                            } else {
                                edit.putLong(next, ((Number) obj).longValue());
                            }
                        }
                    }
                }
            }
            edit.apply();
        }
        l(jSONObject, "controllerConfig", "controller_config.json");
        l(jSONObject, "layouts", "layouts.json");
        l(jSONObject, "backgrounds", "backgrounds.json");
        JSONArray optJSONArray = jSONObject.optJSONArray("roms");
        if (optJSONArray != null) {
            int length2 = optJSONArray.length();
            int i3 = 0;
            while (true) {
                Context context = this.a;
                if (i3 < length2) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                    if (optJSONObject2 == null) {
                        break;
                    } else if (!optJSONObject2.has("uri")) {
                        File file = new File(context.getFilesDir(), "rom_metadata_mirror.json");
                        String jSONArray2 = optJSONArray.toString();
                        jSONArray2.getClass();
                        q(file, jSONArray2);
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    File file2 = new File(context.getFilesDir(), "rom_data.json");
                    String jSONArray3 = optJSONArray.toString();
                    jSONArray3.getClass();
                    q(file2, jSONArray3);
                    break;
                }
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("cheats");
        if (optJSONObject3 != null) {
            vm2 I = this.c.h().I();
            I.e();
            try {
                for (String str : h) {
                    str.getClass();
                    dn2 k = I.k("DELETE FROM " + str);
                    np2.p(k, new Object[0]);
                    k.B.executeUpdateDelete();
                }
                for (vr4 vr4Var : g) {
                    String str2 = (String) vr4Var.A;
                    List<String> list = (List) vr4Var.B;
                    JSONArray optJSONArray2 = optJSONObject3.optJSONArray(str2);
                    if (optJSONArray2 != null) {
                        int length3 = optJSONArray2.length();
                        for (int i4 = 0; i4 < length3; i4++) {
                            JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i4);
                            if (optJSONObject4 != null) {
                                ContentValues contentValues = new ContentValues();
                                for (String str3 : list) {
                                    if (optJSONObject4.has(str3) && !optJSONObject4.isNull(str3)) {
                                        Object obj3 = optJSONObject4.get(str3);
                                        if (obj3 instanceof Boolean) {
                                            contentValues.put(str3, Integer.valueOf(((Boolean) obj3).booleanValue() ? 1 : 0));
                                        } else if (obj3 instanceof Integer) {
                                            contentValues.put(str3, (Integer) obj3);
                                        } else if (obj3 instanceof Long) {
                                            contentValues.put(str3, (Long) obj3);
                                        } else if (obj3 instanceof Double) {
                                            contentValues.put(str3, (Double) obj3);
                                        } else if (obj3 instanceof String) {
                                            contentValues.put(str3, (String) obj3);
                                        } else if (obj3 instanceof Number) {
                                            contentValues.put(str3, Long.valueOf(((Number) obj3).longValue()));
                                        } else {
                                            contentValues.put(str3, obj3.toString());
                                        }
                                    }
                                    contentValues.putNull(str3);
                                }
                                I.v(str2, 5, contentValues);
                            }
                        }
                    }
                }
                I.D();
                I.n();
                i();
            } catch (Throwable th) {
                I.n();
                throw th;
            }
        }
        i();
    }

    public final void l(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt == null) {
            return;
        }
        if (!(opt instanceof JSONObject) && !(opt instanceof JSONArray)) {
            Log.w("SettingsBackupManager", "Skipping invalid backup value for ".concat(str));
        } else {
            q(new File(this.a.getFilesDir(), str2), opt.toString());
        }
    }

    public final void m(Uri uri) {
        Object em5Var;
        zl1 f2;
        Context context = this.a;
        uri.getClass();
        try {
            f2 = zl1.h(context, uri).f("melonDualDS.opts");
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (f2 != null) {
            InputStream openInputStream = context.getContentResolver().openInputStream(f2.j());
            if (openInputStream != null) {
                k(new JSONObject(yh2.E(new InputStreamReader(openInputStream, qm0.a))));
                openInputStream.close();
                em5Var = jg7.a;
            } else {
                em5Var = null;
            }
            Throwable a = hm5.a(em5Var);
            if (a != null) {
                Log.w("SettingsBackupManager", "Failed to restore settings mirror from " + uri, a);
            }
        }
    }

    public final void n(Uri uri, String str) {
        InputStream openInputStream;
        Context context = this.a;
        zl1 f2 = zl1.h(context, uri).f(str);
        if (f2 != null && (openInputStream = context.getContentResolver().openInputStream(f2.j())) != null) {
            try {
                JSONArray jSONArray = new JSONArray(yh2.E(new InputStreamReader(openInputStream, qm0.a)));
                if (jSONArray instanceof em5) {
                    jSONArray = null;
                }
                JSONArray jSONArray2 = jSONArray;
                openInputStream.close();
                if (jSONArray2 != null) {
                    File file = new File(context.getFilesDir(), "layouts.json");
                    String jSONArray3 = jSONArray2.toString();
                    jSONArray3.getClass();
                    q(file, jSONArray3);
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        if (nb3.k(str, "save_internal_config_as_file") && this.b.getBoolean("save_internal_config_as_file", false)) {
            return;
        }
        i();
    }

    public final void p(Uri uri, String str) {
        OutputStream openOutputStream;
        Context context = this.a;
        qi6 h2 = zl1.h(context, uri);
        zl1 f2 = h2.f("melonDualDS.opts");
        if ((f2 != null || (f2 = h2.c("application/octet-stream", "melonDualDS.opts")) != null) && (openOutputStream = context.getContentResolver().openOutputStream(f2.j(), "wt")) != null) {
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openOutputStream, qm0.a);
                outputStreamWriter.write(str);
                outputStreamWriter.close();
                openOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ge7.t(openOutputStream, th);
                    throw th2;
                }
            }
        }
    }
}
