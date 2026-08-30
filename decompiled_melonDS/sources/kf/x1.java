package kf;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: c  reason: collision with root package name */
    public static final Set f8279c = zb.k.S(new String[]{"ra_username", "ra_token", "sram_dir", "rom_search_dirs", "bios_dir", "dsi_bios_dir"});

    /* renamed from: d  reason: collision with root package name */
    public static final Set f8280d = zb.k.S(new String[]{"ra_hash_library_last_updated", "github_updates_nightly_next_check_date", "github_updates_nightly_last_release_date", "github_updates_last_check", "last_version"});

    /* renamed from: a  reason: collision with root package name */
    public final Context f8281a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f8282b;

    public x1(Context context, SharedPreferences sharedPreferences) {
        this.f8281a = context;
        this.f8282b = sharedPreferences;
    }

    public final void a(Uri uri) {
        uri.getClass();
        Context context = this.f8281a;
        k6.c e6 = k6.a.e(context, uri);
        k6.a c4 = e6.c("settings.json");
        if (c4 != null || (c4 = e6.a("application/json", "settings.json")) != null) {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(c4.g());
            if (openOutputStream != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    Map<String, ?> all = this.f8282b.getAll();
                    all.getClass();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!f8279c.contains(key)) {
                            if (!(value instanceof Boolean) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Float) && !(value instanceof String)) {
                                if (value instanceof Set) {
                                    JSONArray jSONArray = new JSONArray();
                                    for (Object obj : (Iterable) value) {
                                        jSONArray.put(obj);
                                    }
                                    jSONObject.put(key, jSONArray);
                                }
                            }
                            jSONObject.put(key, value);
                        }
                    }
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openOutputStream, vc.a.f13781a);
                    outputStreamWriter.write(jSONObject.toString());
                    outputStreamWriter.close();
                    openOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                    }
                }
            }
            File file = new File(context.getFilesDir(), "controller_config.json");
            if (file.exists()) {
                k6.a c10 = e6.c("controller_config.json");
                if (c10 != null || (c10 = e6.a("application/json", "controller_config.json")) != null) {
                    openOutputStream = context.getContentResolver().openOutputStream(c10.g());
                    if (openOutputStream != null) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            k7.w.g(fileInputStream, openOutputStream);
                            fileInputStream.close();
                            openOutputStream.close();
                        } catch (Throwable th22) {
                            try {
                                throw th22;
                            } finally {
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            File file2 = new File(context.getFilesDir(), "layouts.json");
            if (file2.exists()) {
                k6.a c11 = e6.c("layouts.json");
                if (c11 != null || (c11 = e6.a("application/json", "layouts.json")) != null) {
                    openOutputStream = context.getContentResolver().openOutputStream(c11.g());
                    if (openOutputStream != null) {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(file2);
                            k7.w.g(fileInputStream2, openOutputStream);
                            fileInputStream2.close();
                            openOutputStream.close();
                        } catch (Throwable th222) {
                            try {
                                throw th222;
                            } finally {
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            File file3 = new File(context.getFilesDir(), "rom_data.json");
            if (file3.exists()) {
                k6.a c12 = e6.c("rom_data.json");
                if ((c12 != null || (c12 = e6.a("application/json", "rom_data.json")) != null) && (openOutputStream = context.getContentResolver().openOutputStream(c12.g())) != null) {
                    try {
                        FileInputStream fileInputStream3 = new FileInputStream(file3);
                        k7.w.g(fileInputStream3, openOutputStream);
                        fileInputStream3.close();
                        openOutputStream.close();
                    } catch (Throwable th2222) {
                        try {
                            throw th2222;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    public final void b(Uri uri, String str, String str2) {
        Object kVar;
        Object kVar2;
        OutputStream openOutputStream;
        Context context = this.f8281a;
        k6.c e6 = k6.a.e(context, uri);
        File file = new File(context.getFilesDir(), "layouts.json");
        if (file.exists()) {
            try {
                kVar = jc.j.S(file);
            } catch (Throwable th2) {
                kVar = new yb.k(th2);
            }
            Object obj = null;
            if (kVar instanceof yb.k) {
                kVar = null;
            }
            String str3 = (String) kVar;
            if (str3 != null) {
                try {
                    kVar2 = new JSONArray(str3);
                } catch (Throwable th3) {
                    kVar2 = new yb.k(th3);
                }
                if (!(kVar2 instanceof yb.k)) {
                    obj = kVar2;
                }
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        if (optJSONObject != null && nc.k.a(optJSONObject.optString("target"), str2)) {
                            jSONArray2.put(optJSONObject);
                        }
                    }
                    k6.a c4 = e6.c(str);
                    if ((c4 != null || (c4 = e6.a("application/json", str)) != null) && (openOutputStream = context.getContentResolver().openOutputStream(c4.g())) != null) {
                        try {
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openOutputStream, vc.a.f13781a);
                            outputStreamWriter.write(jSONArray2.toString());
                            outputStreamWriter.close();
                            openOutputStream.close();
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                l0.f.f(openOutputStream, th4);
                                throw th5;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void c(Uri uri) {
        Uri g10;
        InputStream openInputStream;
        Uri g11;
        Uri g12;
        Uri g13;
        SharedPreferences sharedPreferences = this.f8282b;
        uri.getClass();
        Context context = this.f8281a;
        k6.c e6 = k6.a.e(context, uri);
        k6.a c4 = e6.c("settings.json");
        if (c4 != null && (g13 = c4.g()) != null && (openInputStream = context.getContentResolver().openInputStream(g13)) != null) {
            try {
                JSONObject jSONObject = new JSONObject(q8.r.Q(new InputStreamReader(openInputStream, vc.a.f13781a)));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!f8279c.contains(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof Boolean) {
                            edit.putBoolean(next, ((Boolean) obj).booleanValue());
                        } else {
                            boolean z10 = obj instanceof Integer;
                            Set set = f8280d;
                            if (z10) {
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
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        }
        k6.a c10 = e6.c("controller_config.json");
        if (c10 != null && (g12 = c10.g()) != null) {
            File file = new File(context.getFilesDir(), "controller_config.json");
            openInputStream = context.getContentResolver().openInputStream(g12);
            if (openInputStream != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    k7.w.g(openInputStream, fileOutputStream);
                    fileOutputStream.close();
                    openInputStream.close();
                } catch (Throwable th22) {
                    try {
                        throw th22;
                    } finally {
                    }
                }
            }
        }
        k6.a c11 = e6.c("layouts.json");
        if (c11 != null && (g11 = c11.g()) != null) {
            File file2 = new File(context.getFilesDir(), "layouts.json");
            openInputStream = context.getContentResolver().openInputStream(g11);
            if (openInputStream != null) {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    k7.w.g(openInputStream, fileOutputStream2);
                    fileOutputStream2.close();
                    openInputStream.close();
                } catch (Throwable th222) {
                    try {
                        throw th222;
                    } finally {
                    }
                }
            }
        }
        k6.a c12 = e6.c("rom_data.json");
        if (c12 != null && (g10 = c12.g()) != null) {
            File file3 = new File(context.getFilesDir(), "rom_data.json");
            openInputStream = context.getContentResolver().openInputStream(g10);
            if (openInputStream != null) {
                try {
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                    k7.w.g(openInputStream, fileOutputStream3);
                    fileOutputStream3.close();
                    openInputStream.close();
                } catch (Throwable th2222) {
                    try {
                        throw th2222;
                    } finally {
                    }
                }
            }
        }
    }

    public final void d(Uri uri, String str, String str2) {
        InputStream openInputStream;
        Object kVar;
        JSONArray jSONArray;
        Context context = this.f8281a;
        k6.a c4 = k6.a.e(context, uri).c(str);
        if (c4 != null && (openInputStream = context.getContentResolver().openInputStream(c4.g())) != null) {
            try {
                JSONArray jSONArray2 = new JSONArray(q8.r.Q(new InputStreamReader(openInputStream, vc.a.f13781a)));
                if (jSONArray2 instanceof yb.k) {
                    jSONArray2 = null;
                }
                JSONArray jSONArray3 = jSONArray2;
                openInputStream.close();
                if (jSONArray3 != null) {
                    File file = new File(context.getFilesDir(), "layouts.json");
                    if (file.exists()) {
                        try {
                            kVar = new JSONArray(jc.j.S(file));
                        } catch (Throwable th2) {
                            kVar = new yb.k(th2);
                        }
                        if (yb.l.a(kVar) != null) {
                            kVar = new JSONArray();
                        }
                        jSONArray = (JSONArray) kVar;
                    } else {
                        jSONArray = new JSONArray();
                    }
                    JSONArray jSONArray4 = new JSONArray();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        if (optJSONObject != null && !nc.k.a(optJSONObject.optString("target"), str2)) {
                            jSONArray4.put(optJSONObject);
                        }
                    }
                    int length2 = jSONArray3.length();
                    for (int i10 = 0; i10 < length2; i10++) {
                        jSONArray4.put(jSONArray3.getJSONObject(i10));
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, vc.a.f13781a);
                        outputStreamWriter.write(jSONArray4.toString());
                        outputStreamWriter.close();
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            l0.f.f(fileOutputStream, th3);
                            throw th4;
                        }
                    }
                }
            }
        }
    }
}
