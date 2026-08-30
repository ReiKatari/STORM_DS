package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gf5  reason: default package */
/* loaded from: classes.dex */
public final class gf5 {
    public final Context a;
    public final SharedPreferences b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;

    public gf5(Context context, SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = context;
        this.b = sharedPreferences;
        File file = new File(context.getFilesDir(), "retroarch-shaders");
        this.c = file;
        this.d = new File(file, "installed");
        this.e = new File(file, "installed.json");
        this.f = new File(new File(context.getCacheDir(), "retroarch-shaders"), "shaders_slang.zip.part");
    }

    public static af5 c() {
        HttpURLConnection g = g("HEAD");
        try {
            try {
                try {
                    int responseCode = g.getResponseCode();
                    if (200 <= responseCode && responseCode < 300) {
                        return new af5(g.getContentLengthLong(), g.getHeaderField("Last-Modified"));
                    }
                    throw new cf5(bf5.HttpError);
                } catch (cf5 e) {
                    throw e;
                }
            } catch (Exception unused) {
                throw new cf5(bf5.NoNetwork);
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

    public final void a(af5 af5Var, mi2 mi2Var, ff5 ff5Var) {
        long j;
        e31 e31Var = ff5Var.B;
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
                            j = af5Var.a;
                        }
                        InputStream inputStream = g.getInputStream();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            byte[] bArr = new byte[65536];
                            long j2 = 0;
                            while (true) {
                                e31Var.getClass();
                                ln2.B(e31Var);
                                int read = inputStream.read(bArr);
                                if (read < 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                j2 += read;
                                mi2Var.n(new we5(new gi1(j, j2)));
                            }
                            fileOutputStream.close();
                            inputStream.close();
                            if (j > 0 && file.length() != j) {
                                throw new cf5(bf5.Truncated);
                            }
                        } finally {
                        }
                    } else {
                        throw new cf5(bf5.HttpError);
                    }
                } catch (Exception unused) {
                    throw new cf5(bf5.NoNetwork);
                }
            } finally {
                g.disconnect();
            }
        } catch (cf5 e) {
            throw e;
        } catch (Exception unused2) {
            e31Var.getClass();
            ln2.B(e31Var);
            throw new cf5(bf5.NoNetwork);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.io.File r6, defpackage.mi2 r7, defpackage.k11 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ef5
            if (r0 == 0) goto L13
            r0 = r8
            ef5 r0 = (defpackage.ef5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ef5 r0 = new ef5
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            o27 r3 = defpackage.o27.a
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            defpackage.me2.a0(r8)     // Catch: defpackage.te5 -> L43
            return r3
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L30:
            defpackage.me2.a0(r8)
            java.io.File r5 = r5.f     // Catch: defpackage.te5 -> L43
            nh3 r8 = new nh3     // Catch: defpackage.te5 -> L43
            r8.<init>(r4, r7)     // Catch: defpackage.te5 -> L43
            r0.Y = r4     // Catch: defpackage.te5 -> L43
            defpackage.gk2.G(r5, r6, r8, r0)     // Catch: defpackage.te5 -> L43
            if (r3 != r1) goto L42
            return r1
        L42:
            return r3
        L43:
            cf5 r5 = new cf5
            bf5 r6 = defpackage.bf5.CorruptArchive
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf5.b(java.io.File, mi2, k11):java.lang.Object");
    }

    public final File d() {
        String str;
        File file = this.d;
        if (!file.isDirectory()) {
            return null;
        }
        df5 h = h();
        if (h != null) {
            str = h.g;
        } else {
            str = null;
        }
        if (str != null && !zg6.B0(str)) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.n95 r13, defpackage.k11 r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf5.e(n95, k11):java.lang.Object");
    }

    public final long f() {
        File file = this.d;
        long j = 0;
        if (!file.isDirectory()) {
            return 0L;
        }
        df5 h = h();
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
        p72 p72Var = p72.TOP_DOWN;
        p72Var.getClass();
        v72 v72Var = new v72(new w72(new o72(file, p72Var), true, new vu4(20)));
        while (v72Var.hasNext()) {
            j += ((File) v72Var.next()).length();
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:5:0x000a, B:12:0x0039, B:19:0x006a, B:15:0x005a, B:8:0x0029), top: B:29:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.df5 h() {
        /*
            r13 = this;
            java.io.File r13 = r13.e
            boolean r0 = r13.isFile()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = defpackage.q72.L(r13)     // Catch: java.lang.Throwable -> L6e
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L6e
            df5 r2 = new df5     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "sourceUrl"
            java.lang.String r3 = "https://buildbot.libretro.com/assets/frontend/shaders_slang.zip"
            java.lang.String r3 = r0.optString(r13, r3)     // Catch: java.lang.Throwable -> L6e
            r3.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "remoteLastModified"
            boolean r4 = r0.isNull(r13)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L29
            goto L38
        L29:
            java.lang.String r13 = r0.optString(r13)     // Catch: java.lang.Throwable -> L6e
            r13.getClass()     // Catch: java.lang.Throwable -> L6e
            boolean r4 = defpackage.zg6.B0(r13)     // Catch: java.lang.Throwable -> L6e
            if (r4 != 0) goto L38
            r4 = r13
            goto L39
        L38:
            r4 = r1
        L39:
            java.lang.String r13 = "remoteContentLength"
            long r5 = r0.optLong(r13)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "installedAtMillis"
            long r7 = r0.optLong(r13)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "installedBytes"
            long r9 = r0.optLong(r13)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "fileCount"
            int r11 = r0.optInt(r13)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "rootSubdirectory"
            boolean r12 = r0.isNull(r13)     // Catch: java.lang.Throwable -> L6e
            if (r12 == 0) goto L5a
            goto L69
        L5a:
            java.lang.String r13 = r0.optString(r13)     // Catch: java.lang.Throwable -> L6e
            r13.getClass()     // Catch: java.lang.Throwable -> L6e
            boolean r0 = defpackage.zg6.B0(r13)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L69
            r12 = r13
            goto L6a
        L69:
            r12 = r1
        L6a:
            r2.<init>(r3, r4, r5, r7, r9, r11, r12)     // Catch: java.lang.Throwable -> L6e
            goto L75
        L6e:
            r0 = move-exception
            r13 = r0
            kc5 r2 = new kc5
            r2.<init>(r13)
        L75:
            boolean r13 = r2 instanceof defpackage.kc5
            if (r13 == 0) goto L7a
            goto L7b
        L7a:
            r1 = r2
        L7b:
            df5 r1 = (defpackage.df5) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf5.h():df5");
    }

    public final void i(af5 af5Var, String str) {
        File file = this.d;
        file.getClass();
        p72 p72Var = p72.TOP_DOWN;
        p72Var.getClass();
        m72 m72Var = new m72(new o72(file, p72Var));
        long j = 0;
        int i = 0;
        while (m72Var.hasNext()) {
            File file2 = (File) m72Var.next();
            if (file2.isFile()) {
                i++;
                j = file2.length() + j;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sourceUrl", "https://buildbot.libretro.com/assets/frontend/shaders_slang.zip");
        jSONObject.put("remoteContentLength", af5Var.a);
        jSONObject.put("installedAtMillis", System.currentTimeMillis());
        jSONObject.put("installedBytes", j);
        jSONObject.put("fileCount", i);
        String str2 = af5Var.b;
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
        q72.O(file3, jSONObject2);
    }
}
