package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp5  reason: default package */
/* loaded from: classes.dex */
public final class cp5 {
    public final Context a;
    public final SharedPreferences b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;

    public cp5(Context context, SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = context;
        this.b = sharedPreferences;
        File file = new File(context.getFilesDir(), "retroarch-shaders");
        this.c = file;
        this.d = new File(file, "installed");
        this.e = new File(file, "installed.json");
        this.f = new File(new File(context.getCacheDir(), "retroarch-shaders"), "shaders_slang.zip.part");
    }

    public static wo5 c() {
        HttpURLConnection g = g("HEAD");
        try {
            try {
                int responseCode = g.getResponseCode();
                if (200 <= responseCode && responseCode < 300) {
                    return new wo5(g.getContentLengthLong(), g.getHeaderField("Last-Modified"));
                }
                throw new yo5(xo5.HttpError);
            } catch (yo5 e) {
                throw e;
            } catch (Exception unused) {
                throw new yo5(xo5.NoNetwork);
            }
        } finally {
            g.disconnect();
        }
    }

    public static HttpURLConnection g(String str) {
        URLConnection openConnection = new URL("https://buildbot.libretro.com/assets/frontend/shaders_slang.zip").openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestProperty("User-Agent", "melonDS-android-shaders");
        return httpURLConnection;
    }

    public final void a(wo5 wo5Var, qn2 qn2Var, bp5 bp5Var) {
        long j;
        l61 l61Var = bp5Var.B;
        File file = this.f;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.delete();
        HttpURLConnection g = g("GET");
        try {
            try {
                try {
                    int responseCode = g.getResponseCode();
                    if (200 <= responseCode && responseCode < 300) {
                        Long l = new Long(g.getContentLengthLong());
                        if (l.longValue() <= 0) {
                            l = null;
                        }
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = wo5Var.a;
                        }
                        InputStream inputStream = g.getInputStream();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            byte[] bArr = new byte[65536];
                            long j2 = 0;
                            while (true) {
                                l61Var.getClass();
                                yh2.o(l61Var);
                                int read = inputStream.read(bArr);
                                if (read < 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                j2 += read;
                                qn2Var.g(new so5(new lm1(j, j2)));
                            }
                            fileOutputStream.close();
                            inputStream.close();
                            if (j > 0 && file.length() != j) {
                                throw new yo5(xo5.Truncated);
                            }
                        } finally {
                        }
                    } else {
                        throw new yo5(xo5.HttpError);
                    }
                } catch (Exception unused) {
                    throw new yo5(xo5.NoNetwork);
                }
            } finally {
                g.disconnect();
            }
        } catch (yo5 e) {
            throw e;
        } catch (Exception unused2) {
            l61Var.getClass();
            yh2.o(l61Var);
            throw new yo5(xo5.NoNetwork);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(File file, qn2 qn2Var, s41 s41Var) {
        ap5 ap5Var;
        int i;
        try {
            if (s41Var instanceof ap5) {
                ap5Var = (ap5) s41Var;
                int i2 = ap5Var.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ap5Var.Y = i2 - Integer.MIN_VALUE;
                    Object obj = ap5Var.R;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = ap5Var.Y;
                    jg7 jg7Var = jg7.a;
                    if (i == 0) {
                        if (i == 1) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    File file2 = this.f;
                    no3 no3Var = new no3(1, qn2Var);
                    ap5Var.Y = 1;
                    bl2.v(file2, file, no3Var, ap5Var);
                    if (jg7Var == x61Var) {
                        return x61Var;
                    }
                    return jg7Var;
                }
            }
            if (i == 0) {
            }
        } catch (oo5 unused) {
            throw new yo5(xo5.CorruptArchive);
        }
        ap5Var = new ap5(this, s41Var);
        Object obj2 = ap5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ap5Var.Y;
        jg7 jg7Var2 = jg7.a;
    }

    public final File d() {
        String str;
        File file = this.d;
        if (!file.isDirectory()) {
            return null;
        }
        zo5 h = h();
        if (h != null) {
            str = h.g;
        } else {
            str = null;
        }
        if (str != null && !qs6.v0(str)) {
            file = new File(file, str);
        }
        if (!file.isDirectory()) {
            return null;
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:36:0x00ac, B:38:0x00be, B:39:0x00c1, B:41:0x00c7, B:44:0x00e1, B:45:0x00e8, B:20:0x0047, B:32:0x009b), top: B:55:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:36:0x00ac, B:38:0x00be, B:39:0x00c1, B:41:0x00c7, B:44:0x00e1, B:45:0x00e8, B:20:0x0047, B:32:0x009b), top: B:55:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:36:0x00ac, B:38:0x00be, B:39:0x00c1, B:41:0x00c7, B:44:0x00e1, B:45:0x00e8, B:20:0x0047, B:32:0x009b), top: B:55:0x0026 }] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ro5 ro5Var, s41 s41Var) {
        bp5 bp5Var;
        Object obj;
        int i;
        wo5 c;
        qn2 qn2Var;
        File file;
        wo5 wo5Var;
        qn2 qn2Var2;
        File parentFile;
        File file2 = this.d;
        try {
            if (s41Var instanceof bp5) {
                bp5Var = (bp5) s41Var;
                int i2 = bp5Var.e0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bp5Var.e0 = i2 - Integer.MIN_VALUE;
                    Object obj2 = bp5Var.Z;
                    obj = x61.COROUTINE_SUSPENDED;
                    i = bp5Var.e0;
                    File file3 = this.f;
                    Object obj3 = jg7.a;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                file = bp5Var.Y;
                                wo5Var = bp5Var.X;
                                qn2Var2 = bp5Var.R;
                                oi2.Y(obj2);
                                qn2Var2.g(uo5.a);
                                String s = bl2.s(file);
                                jc2.x0(file2);
                                parentFile = file2.getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                                if (!file.renameTo(file2)) {
                                    i(wo5Var, s);
                                    this.b.edit().putLong("video_retroarch_shader_library_version", System.currentTimeMillis()).apply();
                                    return obj3;
                                }
                                throw new yo5(xo5.CorruptArchive);
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        file = bp5Var.Y;
                        wo5 wo5Var2 = bp5Var.X;
                        qn2Var = bp5Var.R;
                        oi2.Y(obj2);
                        c = wo5Var2;
                    } else {
                        oi2.Y(obj2);
                        c = c();
                        long j = c.a;
                        if (j > 0) {
                            long j2 = (4 * j) + j + 33554432;
                            long usableSpace = this.a.getFilesDir().getUsableSpace();
                            if (usableSpace < j2) {
                                StringBuilder s2 = xg6.s(j2, "Not enough space for shader install: need ", ", have ");
                                s2.append(usableSpace);
                                Log.w("RetroArchShaderLibrary", s2.toString());
                                throw new yo5(xo5.NotEnoughSpace, j2);
                            }
                        }
                        UUID randomUUID = UUID.randomUUID();
                        File file4 = new File(this.c, "pending-" + randomUUID);
                        try {
                            bp5Var.R = ro5Var;
                            bp5Var.X = c;
                            bp5Var.Y = file4;
                            bp5Var.e0 = 1;
                            a(c, ro5Var, bp5Var);
                            if (obj3 != obj) {
                                qn2Var = ro5Var;
                                file = file4;
                            }
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            ro5Var = file4;
                            try {
                                jc2.x0(ro5Var);
                                throw th;
                            } finally {
                                file3.delete();
                            }
                        }
                    }
                    bp5Var.R = qn2Var;
                    bp5Var.X = c;
                    bp5Var.Y = file;
                    bp5Var.e0 = 2;
                    if (b(file, qn2Var, bp5Var) != obj) {
                        wo5Var = c;
                        qn2Var2 = qn2Var;
                        qn2Var2.g(uo5.a);
                        String s3 = bl2.s(file);
                        jc2.x0(file2);
                        parentFile = file2.getParentFile();
                        if (parentFile != null) {
                        }
                        if (!file.renameTo(file2)) {
                        }
                    }
                    return obj;
                }
            }
            if (i == 0) {
            }
            bp5Var.R = qn2Var;
            bp5Var.X = c;
            bp5Var.Y = file;
            bp5Var.e0 = 2;
            if (b(file, qn2Var, bp5Var) != obj) {
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
        }
        bp5Var = new bp5(this, s41Var);
        Object obj22 = bp5Var.Z;
        obj = x61.COROUTINE_SUSPENDED;
        i = bp5Var.e0;
        File file32 = this.f;
        Object obj32 = jg7.a;
    }

    public final long f() {
        File file = this.d;
        long j = 0;
        if (!file.isDirectory()) {
            return 0L;
        }
        zo5 h = h();
        if (h != null) {
            long j2 = h.e;
            Long valueOf = Long.valueOf(j2);
            if (j2 <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.longValue();
            }
        }
        oc2 oc2Var = new oc2(new pc2(jc2.E0(file, ic2.TOP_DOWN), true, new gn5(2)));
        while (oc2Var.hasNext()) {
            j += ((File) oc2Var.next()).length();
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:5:0x000a, B:12:0x0039, B:19:0x006a, B:15:0x005a, B:8:0x0029), top: B:29:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zo5 h() {
        Object em5Var;
        JSONObject jSONObject;
        String optString;
        String str;
        String str2;
        File file = this.e;
        Object obj = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            jSONObject = new JSONObject(jc2.B0(file));
            optString = jSONObject.optString("sourceUrl", "https://buildbot.libretro.com/assets/frontend/shaders_slang.zip");
            optString.getClass();
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (!jSONObject.isNull("remoteLastModified")) {
            String optString2 = jSONObject.optString("remoteLastModified");
            optString2.getClass();
            if (!qs6.v0(optString2)) {
                str = optString2;
                long optLong = jSONObject.optLong("remoteContentLength");
                long optLong2 = jSONObject.optLong("installedAtMillis");
                long optLong3 = jSONObject.optLong("installedBytes");
                int optInt = jSONObject.optInt("fileCount");
                if (jSONObject.isNull("rootSubdirectory")) {
                    String optString3 = jSONObject.optString("rootSubdirectory");
                    optString3.getClass();
                    if (!qs6.v0(optString3)) {
                        str2 = optString3;
                        em5Var = new zo5(optString, str, optLong, optLong2, optLong3, optInt, str2);
                        if (!(em5Var instanceof em5)) {
                            obj = em5Var;
                        }
                        return (zo5) obj;
                    }
                }
                str2 = null;
                em5Var = new zo5(optString, str, optLong, optLong2, optLong3, optInt, str2);
                if (!(em5Var instanceof em5)) {
                }
                return (zo5) obj;
            }
        }
        str = null;
        long optLong4 = jSONObject.optLong("remoteContentLength");
        long optLong22 = jSONObject.optLong("installedAtMillis");
        long optLong32 = jSONObject.optLong("installedBytes");
        int optInt2 = jSONObject.optInt("fileCount");
        if (jSONObject.isNull("rootSubdirectory")) {
        }
        str2 = null;
        em5Var = new zo5(optString, str, optLong4, optLong22, optLong32, optInt2, str2);
        if (!(em5Var instanceof em5)) {
        }
        return (zo5) obj;
    }

    public final void i(wo5 wo5Var, String str) {
        File file = this.d;
        file.getClass();
        fc2 fc2Var = new fc2(jc2.E0(file, ic2.TOP_DOWN));
        long j = 0;
        int i = 0;
        while (fc2Var.hasNext()) {
            File file2 = (File) fc2Var.next();
            if (file2.isFile()) {
                i++;
                j = file2.length() + j;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sourceUrl", "https://buildbot.libretro.com/assets/frontend/shaders_slang.zip");
        jSONObject.put("remoteContentLength", wo5Var.a);
        jSONObject.put("installedAtMillis", System.currentTimeMillis());
        jSONObject.put("installedBytes", j);
        jSONObject.put("fileCount", i);
        String str2 = wo5Var.b;
        if (str2 != null) {
            jSONObject.put("remoteLastModified", str2);
        }
        if (str != null) {
            jSONObject.put("rootSubdirectory", str);
        }
        File file3 = this.e;
        File parentFile = file3.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        jc2.F0(file3, jSONObject2);
    }
}
