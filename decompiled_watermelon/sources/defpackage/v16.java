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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v16  reason: default package */
/* loaded from: classes.dex */
public final class v16 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final Set f = nu.H0(new String[]{"ra_token", "rom_search_dirs", "bios_dir", "dsi_bios_dir", "settings_mirror_fallback_uri"});
    public static final List g = l07.c0(new ti4("cheat_database", l07.c0("id", "name")), new ti4("game", l07.c0("id", "name", "game_code", "game_checksum")), new ti4("cheat_folder", l07.c0("id", "game_id", "name")), new ti4("cheat", l07.c0("id", "cheat_folder_id", "cheat_database_id", "name", "description", "code", "enabled")));
    public static final List h = l07.c0("cheat", "cheat_folder", "game", "cheat_database");
    public static final Set i = nu.H0(new String[]{"ra_hash_library_last_updated", "github_updates_nightly_next_check_date", "github_updates_nightly_last_release_date", "github_updates_last_check", "last_version"});
    public final Context a;
    public final SharedPreferences b;
    public final MelonDatabase c;
    public final g11 d;
    public final AtomicBoolean e;

    public v16(Context context, SharedPreferences sharedPreferences, MelonDatabase melonDatabase) {
        this.a = context;
        this.b = sharedPreferences;
        this.c = melonDatabase;
        mi6 c = hi2.c();
        bb1 bb1Var = tg1.a;
        this.d = iq2.c(se.O(c, ha1.L));
        this.e = new AtomicBoolean(false);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public static final void a(v16 v16Var) {
        Object kc5Var;
        String jSONObject = v16Var.d().toString();
        jSONObject.getClass();
        Context context = v16Var.a;
        q(new File(context.getFilesDir(), "melonDualDS.opts"), jSONObject);
        Uri e = v16Var.e();
        if (e != null) {
            v16Var.p(e, jSONObject);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        SharedPreferences sharedPreferences = v16Var.b;
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
            if (!b53.x((Uri) obj, e)) {
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
                uh1 f2 = uh1.h(context, uri).f("melonDualDS.opts");
                if (f2 != null) {
                    kc5Var = Boolean.valueOf(f2.d());
                } else {
                    kc5Var = null;
                }
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            Throwable a = nc5.a(kc5Var);
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
                    i.n(b31.p("Could not replace ", file.getAbsolutePath()));
                } else if (!file2.renameTo(file)) {
                    f81.r("Could not move ", file2.getAbsolutePath(), " to ", file.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dt3.W(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static void q(File file, String str) {
        byte[] bytes = str.getBytes(hk0.a);
        bytes.getClass();
        o(file, bytes);
    }

    public final void b(Uri uri) {
        OutputStream openOutputStream;
        uri.getClass();
        Context context = this.a;
        c76 h2 = uh1.h(context, uri);
        uh1 f2 = h2.f("melonDualDS.opts");
        if ((f2 != null || (f2 = h2.c("application/octet-stream", "melonDualDS.opts")) != null) && (openOutputStream = context.getContentResolver().openOutputStream(f2.j())) != null) {
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openOutputStream, hk0.a);
                outputStreamWriter.write(d().toString());
                outputStreamWriter.close();
                openOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dt3.W(openOutputStream, th);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.net.Uri r4, java.lang.String r5) {
        /*
            r3 = this;
            android.content.Context r3 = r3.a
            c76 r4 = defpackage.uh1.h(r3, r4)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.getFilesDir()
            java.lang.String r2 = "layouts.json"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L19
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L33
            java.lang.String r0 = defpackage.q72.L(r0)     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r0 = move-exception
            kc5 r1 = new kc5
            r1.<init>(r0)
            r0 = r1
        L28:
            boolean r1 = r0 instanceof defpackage.kc5
            if (r1 == 0) goto L2e
            r0 = r2
        L2e:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L33
            goto L35
        L33:
            java.lang.String r0 = "[]"
        L35:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            goto L41
        L3b:
            r0 = move-exception
            kc5 r1 = new kc5
            r1.<init>(r0)
        L41:
            boolean r0 = r1 instanceof defpackage.kc5
            if (r0 == 0) goto L46
            goto L47
        L46:
            r2 = r1
        L47:
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            if (r2 != 0) goto L4c
            goto L8d
        L4c:
            uh1 r0 = r4.f(r5)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "application/json"
            uh1 r0 = r4.c(r0, r5)
            if (r0 != 0) goto L5b
            goto L8d
        L5b:
            android.content.ContentResolver r3 = r3.getContentResolver()
            android.net.Uri r4 = r0.j()
            java.io.OutputStream r3 = r3.openOutputStream(r4)
            if (r3 == 0) goto L8d
            java.nio.charset.Charset r4 = defpackage.hk0.a     // Catch: java.lang.Throwable -> L7e
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L7e
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L80
            r5.write(r4)     // Catch: java.lang.Throwable -> L80
            r5.close()     // Catch: java.lang.Throwable -> L7e
            r3.close()
            goto L8d
        L7e:
            r4 = move-exception
            goto L87
        L80:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            defpackage.dt3.W(r5, r4)     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L7e
        L87:
            throw r4     // Catch: java.lang.Throwable -> L88
        L88:
            r5 = move-exception
            defpackage.dt3.W(r3, r4)
            throw r5
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v16.c(android.net.Uri, java.lang.String):void");
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
        vh2 W = this.c.h().W();
        JSONObject jSONObject4 = new JSONObject();
        for (ti4 ti4Var : g) {
            String str = (String) ti4Var.A;
            List<String> list = (List) ti4Var.B;
            JSONArray jSONArray4 = new JSONArray();
            Cursor F = W.F("SELECT " + tq0.S0(list, ", ", null, null, null, 62) + " FROM " + str + " ORDER BY id");
            while (F.moveToNext()) {
                try {
                    JSONObject jSONObject5 = new JSONObject();
                    for (String str2 : list) {
                        int columnIndexOrThrow = F.getColumnIndexOrThrow(str2);
                        int type = F.getType(columnIndexOrThrow);
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 2) {
                                    if (type != 3) {
                                        if (type == 4) {
                                            jSONObject5.put(str2, JSONObject.NULL);
                                        }
                                    } else {
                                        jSONObject5.put(str2, F.getString(columnIndexOrThrow));
                                    }
                                } else {
                                    jSONObject5.put(str2, F.getDouble(columnIndexOrThrow));
                                }
                            } else {
                                jSONObject5.put(str2, F.getLong(columnIndexOrThrow));
                            }
                        } else {
                            jSONObject5.put(str2, JSONObject.NULL);
                        }
                    }
                    jSONArray4.put(jSONObject5);
                } finally {
                }
            }
            F.close();
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
        if (!sharedPreferences.getBoolean("use_rom_dir", true) && (stringSet = sharedPreferences.getStringSet("sram_dir", null)) != null && (str2 = (String) tq0.L0(stringSet)) != null) {
            return Uri.parse(str2);
        }
        String string = sharedPreferences.getString("settings_mirror_fallback_uri", null);
        if (string != null) {
            return Uri.parse(string);
        }
        Set<String> stringSet2 = sharedPreferences.getStringSet("rom_search_dirs", null);
        if (stringSet2 == null || (str = (String) tq0.L0(stringSet2)) == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public final boolean f(Uri uri) {
        Boolean kc5Var;
        uri.getClass();
        Context context = this.a;
        uh1 f2 = uh1.h(context, uri).f("melonDualDS.opts");
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
                        jSONObject = new JSONObject(yf2.R(new InputStreamReader(openInputStream, hk0.a)));
                        openInputStream.close();
                    }
                    if (jSONObject != null) {
                        z = true;
                    }
                    kc5Var = Boolean.valueOf(z);
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                Throwable a = nc5.a(kc5Var);
                if (a != null) {
                    Log.w("SettingsBackupManager", "Ignoring invalid settings mirror at " + uri, a);
                }
                Boolean bool = Boolean.FALSE;
                if (kc5Var instanceof kc5) {
                    kc5Var = bool;
                }
                return ((Boolean) kc5Var).booleanValue();
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
        String L = q72.L(file);
        String obj = zg6.Z0(L).toString();
        obj.getClass();
        if (obj.length() == 0) {
            valueOf = null;
        } else {
            valueOf = Character.valueOf(obj.charAt(0));
        }
        if (valueOf != null && valueOf.charValue() == '[') {
            return new JSONArray(L);
        }
        if (valueOf == null || valueOf.charValue() != '{') {
            return null;
        }
        return new JSONObject(L);
    }

    public final void h(Uri uri) {
        uri.getClass();
        this.b.edit().putString("settings_mirror_fallback_uri", uri.toString()).apply();
    }

    public final void i() {
        if (!this.b.getBoolean("save_internal_config_as_file", false) || !this.e.compareAndSet(false, true)) {
            return;
        }
        tq5.w(this.d, null, null, new x3(this, (j11) null, 15), 3);
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
        c76 h2 = uh1.h(context, uri);
        uh1 f2 = h2.f("melonDualDS.opts");
        if (f2 != null) {
            openInputStream = context.getContentResolver().openInputStream(f2.j());
            if (openInputStream != null) {
                try {
                    k(new JSONObject(yf2.R(new InputStreamReader(openInputStream, hk0.a))));
                    openInputStream.close();
                } finally {
                }
            }
        } else {
            uh1 f3 = h2.f("settings.json");
            if (f3 != null && (j4 = f3.j()) != null && (openInputStream = context.getContentResolver().openInputStream(j4)) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(yf2.R(new InputStreamReader(openInputStream, hk0.a)));
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
            uh1 f4 = h2.f("controller_config.json");
            if (f4 != null && (j3 = f4.j()) != null) {
                File file = new File(context.getFilesDir(), "controller_config.json");
                openInputStream = context.getContentResolver().openInputStream(j3);
                if (openInputStream != null) {
                    try {
                        o(file, pu.z(openInputStream));
                        openInputStream.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            uh1 f5 = h2.f("layouts.json");
            if (f5 != null && (j2 = f5.j()) != null) {
                File file2 = new File(context.getFilesDir(), "layouts.json");
                openInputStream = context.getContentResolver().openInputStream(j2);
                if (openInputStream != null) {
                    try {
                        o(file2, pu.z(openInputStream));
                        openInputStream.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            uh1 f6 = h2.f("rom_data.json");
            if (f6 != null && (j = f6.j()) != null && (openInputStream = context.getContentResolver().openInputStream(j)) != null) {
                try {
                    String R = yf2.R(new InputStreamReader(openInputStream, hk0.a));
                    new JSONArray(R);
                    q(new File(context.getFilesDir(), "rom_data.json"), R);
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
            vh2 e0 = this.c.h().e0();
            e0.d();
            try {
                for (String str : h) {
                    str.getClass();
                    di2 p = e0.p("DELETE FROM " + str);
                    me2.h(p, new Object[0]);
                    p.B.executeUpdateDelete();
                }
                for (ti4 ti4Var : g) {
                    String str2 = (String) ti4Var.A;
                    List<String> list = (List) ti4Var.B;
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
                                e0.C(str2, 5, contentValues);
                            }
                        }
                    }
                }
                e0.I();
                e0.w();
                i();
            } catch (Throwable th) {
                e0.w();
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
        Object kc5Var;
        uh1 f2;
        Context context = this.a;
        uri.getClass();
        try {
            f2 = uh1.h(context, uri).f("melonDualDS.opts");
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (f2 != null) {
            InputStream openInputStream = context.getContentResolver().openInputStream(f2.j());
            if (openInputStream != null) {
                k(new JSONObject(yf2.R(new InputStreamReader(openInputStream, hk0.a))));
                openInputStream.close();
                kc5Var = o27.a;
            } else {
                kc5Var = null;
            }
            Throwable a = nc5.a(kc5Var);
            if (a != null) {
                Log.w("SettingsBackupManager", "Failed to restore settings mirror from " + uri, a);
            }
        }
    }

    public final void n(Uri uri, String str) {
        InputStream openInputStream;
        Context context = this.a;
        uh1 f2 = uh1.h(context, uri).f(str);
        if (f2 != null && (openInputStream = context.getContentResolver().openInputStream(f2.j())) != null) {
            try {
                JSONArray jSONArray = new JSONArray(yf2.R(new InputStreamReader(openInputStream, hk0.a)));
                if (jSONArray instanceof kc5) {
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
        if (b53.x(str, "save_internal_config_as_file") && this.b.getBoolean("save_internal_config_as_file", false)) {
            return;
        }
        i();
    }

    public final void p(Uri uri, String str) {
        OutputStream openOutputStream;
        Context context = this.a;
        c76 h2 = uh1.h(context, uri);
        uh1 f2 = h2.f("melonDualDS.opts");
        if ((f2 != null || (f2 = h2.c("application/octet-stream", "melonDualDS.opts")) != null) && (openOutputStream = context.getContentResolver().openOutputStream(f2.j(), "wt")) != null) {
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openOutputStream, hk0.a);
                outputStreamWriter.write(str);
                outputStreamWriter.close();
                openOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dt3.W(openOutputStream, th);
                    throw th2;
                }
            }
        }
    }
}
