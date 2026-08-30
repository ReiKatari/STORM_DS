package defpackage;

import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.xi5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d72  reason: default package */
/* loaded from: classes.dex */
public final class d72 implements vp5 {
    public final Context a;
    public final qo2 b;
    public final w16 c;
    public final ap d;
    public final w37 e;
    public final v16 f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final g11 h;
    public final Type i;
    public final Type j;
    public final c46 k;
    public final ee6 l;
    public final ArrayList m;
    public final AtomicBoolean n;
    public final Object o;
    public final LinkedHashMap p;
    public final LinkedHashMap q;
    public final ee6 r;
    public final LinkedHashSet s;
    public volatile Map t;
    public volatile boolean u;
    public final AtomicBoolean v;

    public d72(Context context, qo2 qo2Var, w16 w16Var, ap apVar, w37 w37Var, v16 v16Var) {
        Object kc5Var;
        List<wl5> list;
        this.a = context;
        this.b = qo2Var;
        this.c = w16Var;
        this.d = apVar;
        this.e = w37Var;
        this.f = v16Var;
        bb1 bb1Var = tg1.a;
        this.h = iq2.c(ha1.L);
        Type type = new n07().b;
        type.getClass();
        this.i = type;
        Type type2 = new n07().b;
        type2.getClass();
        this.j = type2;
        Type type3 = new n07().b;
        type3.getClass();
        this.k = d46.b(1, 0, h60.DROP_OLDEST, 2);
        this.l = fe6.a(sp5.NOT_SCANNING);
        this.m = new ArrayList();
        this.n = new AtomicBoolean(false);
        this.o = new Object();
        this.p = new LinkedHashMap();
        this.q = new LinkedHashMap();
        this.r = fe6.a(pp1.A);
        this.s = new LinkedHashSet();
        this.t = qp1.A;
        this.v = new AtomicBoolean(false);
        File file = new File(context.getFilesDir(), "rom_directory_state.json");
        if (file.isFile()) {
            try {
                FileReader fileReader = new FileReader(file);
                kc5Var = (List) qo2Var.c(fileReader, new n07(type3));
                fileReader.close();
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (!(kc5Var instanceof kc5) && (list = (List) kc5Var) != null) {
                synchronized (this.o) {
                    try {
                        this.p.clear();
                        this.q.clear();
                        for (wl5 wl5Var : list) {
                            q62 w = w(wl5Var);
                            this.p.put(w.a.toString(), w);
                            LinkedHashMap linkedHashMap = this.q;
                            String uri = w.a.toString();
                            Uri uri2 = w.a;
                            long j = w.c;
                            Long valueOf = Long.valueOf(j);
                            if (j <= 0) {
                                valueOf = null;
                            }
                            linkedHashMap.put(uri, new vl5(uri2, valueOf, ul5.UNCHANGED));
                        }
                        g();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Throwable a = nc5.a(kc5Var);
            if (a != null) {
                Log.w("FSRomsRepository", "Failed to load ROM directory cache", a);
            }
        }
        tq5.w(this.h, null, null, new o62(this, null, 0), 3);
        tq5.w(this.h, null, null, new o62(this, null, 1), 3);
    }

    public static void B(File file, String str) {
        File parentFile = file.getParentFile();
        String name = file.getName();
        File file2 = new File(parentFile, name + ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(str);
            outputStreamWriter.flush();
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

    public static final void a(d72 d72Var, rg5 rg5Var) {
        Object obj;
        ti5 r = d72Var.r(rg5Var);
        rg5 d = d72Var.d(rg5Var, r);
        ArrayList arrayList = d72Var.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                if (((rg5) obj).b(rg5Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        rg5 rg5Var2 = (rg5) obj;
        if (b53.x(rg5Var2, d)) {
            return;
        }
        if (rg5Var2 != null) {
            String str = d.a;
            String str2 = d.b;
            boolean z = d.h;
            String str3 = d.i;
            if (r == null) {
                r = rg5Var2.f;
            }
            rg5 a = rg5.a(rg5Var2, str, str2, r, null, z, str3, 0L, false, 7772);
            arrayList.remove(rg5Var2);
            arrayList.add(a);
        } else {
            arrayList.add(d);
        }
        d72Var.q(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0167 A[LOOP:1: B:65:0x011e->B:92:0x0167, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v3, types: [j75, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.d72 r18, defpackage.k11 r19) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d72.b(d72, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0237 A[LOOP:6: B:99:0x0235->B:100:0x0237, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0325 A[LOOP:2: B:124:0x031f->B:126:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ee  */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x02bc -> B:114:0x02be). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.d72 r27, android.net.Uri r28, defpackage.c76 r29, defpackage.w92 r30, defpackage.k11 r31) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d72.c(d72, android.net.Uri, c76, w92, k11):java.lang.Object");
    }

    public static String f(List list) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = "rom-directory-cache-v3".getBytes(hk0.a);
        bytes.getClass();
        messageDigest.update(bytes);
        for (r62 r62Var : tq0.g1(list, new hd2(14))) {
            byte[] bytes2 = (r62Var.a + "|" + r62Var.c + "|" + r62Var.d).getBytes(hk0.a);
            bytes2.getClass();
            messageDigest.update(bytes2);
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : digest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static boolean v(rg5 rg5Var) {
        ti5 ti5Var;
        if (rg5Var.h) {
            ti5Var = new ti5(cs5.DSi, is5.DEFAULT, (UUID) null, (me2) fm5.d, (String) null, false, ym5.GLOBAL, (m11) null, (VideoRenderer) null, (Boolean) null, (Integer) null, (VideoFiltering) null, (String) null, (String) null, (Boolean) null);
        } else {
            ti5Var = new ti5((cs5) null, (is5) null, (UUID) null, (me2) null, (String) null, false, (ym5) null, (m11) null, (VideoRenderer) null, (Boolean) null, (Integer) null, (VideoFiltering) null, (String) null, (String) null, 32767);
        }
        return !b53.x(rg5Var.f, ti5Var);
    }

    public static q62 w(wl5 wl5Var) {
        List<tl5> b = wl5Var.b();
        int j0 = zt3.j0(uq0.y0(b, 10));
        if (j0 < 16) {
            j0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0);
        for (tl5 tl5Var : b) {
            linkedHashMap.put(tl5Var.c(), new p62(Uri.parse(tl5Var.c()), tl5Var.a(), tl5Var.b()));
        }
        return new q62(Uri.parse(wl5Var.a()), wl5Var.c(), wl5Var.d(), linkedHashMap);
    }

    public final void A(rg5 rg5Var) {
        Object kc5Var;
        OutputStream openOutputStream;
        uh1 l = l(rg5Var);
        if (l != null) {
            String k = k(rg5Var);
            uh1 f = l.f(k);
            if (f != null || (f = l.c("application/octet-stream", k)) != null || (f = l.f(k)) != null) {
                try {
                    openOutputStream = this.a.getContentResolver().openOutputStream(f.j(), "wt");
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                if (openOutputStream != null) {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openOutputStream);
                    outputStreamWriter.write(this.b.f(new u62(xi5.a.a(rg5Var.f))));
                    outputStreamWriter.close();
                    kc5Var = o27.a;
                    Throwable a = nc5.a(kc5Var);
                    if (a != null) {
                        String str = rg5Var.c;
                        Log.w("FSRomsRepository", "Failed to write ROM options for " + str, a);
                        return;
                    }
                    return;
                }
                Uri j = f.j();
                throw new IllegalStateException("Could not open " + j);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rg5 d(rg5 rg5Var, ti5 ti5Var) {
        Iterable kc5Var;
        t62 t62Var;
        Object obj;
        File file = new File(this.a.getFilesDir(), "rom_metadata_mirror.json");
        boolean isFile = file.isFile();
        Iterable iterable = pp1.A;
        if (isFile) {
            try {
                Object obj2 = (List) this.b.b(new FileReader(file), this.j);
                kc5Var = obj2;
                if (obj2 == null) {
                    kc5Var = iterable;
                }
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            Throwable a = nc5.a(kc5Var);
            if (a != null) {
                Log.w("FSRomsRepository", "Failed to parse restored ROM metadata", a);
            }
            Iterable iterable2 = iterable;
            if (nc5.a(kc5Var) == null) {
                iterable2 = kc5Var;
            }
            iterable = (List) iterable2;
        }
        Iterator it = iterable.iterator();
        while (true) {
            t62Var = null;
            if (it.hasNext()) {
                obj = it.next();
                t62 t62Var2 = (t62) obj;
                if (!zg6.B0(rg5Var.i) && b53.x(t62Var2.g, rg5Var.i)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        t62 t62Var3 = (t62) obj;
        if (t62Var3 == null) {
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                t62 t62Var4 = (t62) next;
                if (b53.x(t62Var4.c, rg5Var.c) && t62Var4.f == rg5Var.h) {
                    t62Var = next;
                    break;
                }
            }
            t62Var3 = t62Var;
        }
        if (t62Var3 != null) {
            if (ti5Var == null) {
                ti5Var = t62Var3.d.b();
            }
            Date date = t62Var3.e;
            hm1 hm1Var = im1.B;
            return rg5.a(rg5Var, null, null, ti5Var, date, false, null, b53.l0(t62Var3.h, om1.MILLISECONDS), t62Var3.i, 6559);
        } else if (ti5Var != null) {
            return rg5.a(rg5Var, null, null, ti5Var, null, false, null, 0L, false, 8159);
        } else {
            return rg5Var;
        }
    }

    public final boolean e(uh1 uh1Var, ArrayList arrayList) {
        if (uh1Var.e() && uh1Var.a()) {
            try {
                uh1[] o = uh1Var.o();
                o.getClass();
                for (uh1 uh1Var2 : o) {
                    if (uh1Var2.k()) {
                        if (!e(uh1Var2, arrayList)) {
                            return false;
                        }
                    } else if (this.d.a(uh1Var2) != null) {
                        Uri j = uh1Var2.j();
                        j.getClass();
                        Uri j2 = uh1Var.j();
                        j2.getClass();
                        long m = uh1Var2.m();
                        long j3 = 0;
                        if (m < 0) {
                            m = 0;
                        }
                        long n = uh1Var2.n();
                        if (n >= 0) {
                            j3 = n;
                        }
                        arrayList.add(new r62(j, j2, m, j3, uh1Var2));
                    }
                }
                return true;
            } catch (Exception e) {
                Log.w("FSRomsRepository", "Failed to list files for directory " + uh1Var.j(), e);
                return false;
            }
        }
        Log.w("FSRomsRepository", "Cannot read ROM directory " + uh1Var.j());
        return false;
    }

    public final void g() {
        List g1 = tq0.g1(this.q.values(), new hd2(15));
        ee6 ee6Var = this.r;
        ee6Var.getClass();
        ee6Var.l(null, g1);
    }

    public final q62 h(Uri uri) {
        q62 q62Var;
        synchronized (this.o) {
            q62Var = (q62) this.p.get(uri.toString());
        }
        return q62Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, defpackage.k11 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.w62
            if (r0 == 0) goto L13
            r0 = r7
            w62 r0 = (defpackage.w62) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            w62 r0 = new w62
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.lang.String r6 = r0.R
            defpackage.me2.a0(r7)
            goto L42
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L30:
            defpackage.me2.a0(r7)
            bz0 r7 = r5.m()
            r0.R = r6
            r0.Z = r4
            java.lang.Object r7 = defpackage.se.u(r7, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L48:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r7.next()
            r1 = r0
            rg5 r1 = (defpackage.rg5) r1
            android.content.Context r2 = r5.a
            android.net.Uri r1 = r1.d
            java.lang.String r1 = defpackage.f34.C(r2, r1)
            boolean r1 = defpackage.b53.x(r1, r6)
            if (r1 == 0) goto L48
            goto L65
        L64:
            r0 = r3
        L65:
            rg5 r0 = (defpackage.rg5) r0
            if (r0 == 0) goto L6e
            rg5 r5 = r5.s(r0)
            return r5
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d72.i(java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.net.Uri r8, defpackage.k11 r9) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d72.j(android.net.Uri, k11):java.lang.Object");
    }

    public final String k(rg5 rg5Var) {
        String str;
        String str2 = rg5Var.c;
        if (zg6.B0(str2)) {
            uh1 a = this.e.a(rg5Var.d);
            if (a == null || (str = a.i()) == null) {
                str = rg5Var.a;
            }
            str2 = str;
        }
        return zg6.L0(str2, "opts", str2 + ".opts");
    }

    public final uh1 l(rg5 rg5Var) {
        uh1 kc5Var;
        try {
            kc5Var = this.e.b(((b56) this.c).u(rg5Var));
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Throwable a = nc5.a(kc5Var);
        if (a != null) {
            String str = rg5Var.c;
            Log.w("FSRomsRepository", "Failed to resolve ROM options directory for " + str, a);
        }
        if (kc5Var instanceof kc5) {
            kc5Var = null;
        }
        return (uh1) kc5Var;
    }

    public final bz0 m() {
        return new bz0(6, new ba1(this, null, 15));
    }

    public final boolean n(Uri uri) {
        if (b53.x(uri.getScheme(), "content")) {
            List<UriPermission> persistedUriPermissions = this.a.getContentResolver().getPersistedUriPermissions();
            persistedUriPermissions.getClass();
            if (!persistedUriPermissions.isEmpty()) {
                for (UriPermission uriPermission : persistedUriPermissions) {
                    if (uriPermission.isReadPermission() && b53.x(uriPermission.getUri(), uri)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void o() {
        if (this.n.compareAndSet(true, false)) {
            this.m.clear();
        }
        File file = new File(this.a.getFilesDir(), "rom_data.json");
        if (file.isFile()) {
            file.delete();
        }
        File file2 = new File(this.a.getFilesDir(), "rom_directory_state.json");
        if (file2.isFile()) {
            file2.delete();
        }
        synchronized (this.o) {
            this.p.clear();
            this.q.clear();
        }
        ee6 ee6Var = this.r;
        pp1 pp1Var = pp1.A;
        ee6Var.getClass();
        ee6Var.l(null, pp1Var);
    }

    public final void p(Uri uri, Long l) {
        synchronized (this.o) {
            this.q.put(uri.toString(), new vl5(uri, l, ul5.NOT_SCANNED));
            g();
        }
    }

    public final void q(boolean z) {
        if (!z || this.u) {
            this.v.set(true);
        }
        this.k.p(tq0.n1(this.m));
    }

    public final ti5 r(rg5 rg5Var) {
        uh1 uh1Var;
        Object kc5Var;
        boolean add;
        InputStream openInputStream;
        uh1 l = l(rg5Var);
        ti5 ti5Var = null;
        if (l != null) {
            uh1Var = l.f(k(rg5Var));
        } else {
            uh1Var = null;
        }
        if (uh1Var == null) {
            return null;
        }
        try {
            openInputStream = this.a.getContentResolver().openInputStream(uh1Var.j());
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (openInputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openInputStream, hk0.a), 8192);
            u62 u62Var = (u62) this.b.c(bufferedReader, new n07(u62.class));
            if (u62Var != null) {
                kc5Var = u62Var.a.b();
                bufferedReader.close();
                Throwable a = nc5.a(kc5Var);
                if (a != null) {
                    Log.w("FSRomsRepository", "Failed to read ROM options for " + rg5Var.c, a);
                    String uri = uh1Var.j().toString();
                    uri.getClass();
                    synchronized (this.s) {
                        add = this.s.add(uri);
                    }
                    if (add) {
                        this.g.post(new m0(25, this));
                    }
                    if (v(rg5Var)) {
                        Log.i("FSRomsRepository", "Rewriting unreadable ROM options from cached config for " + rg5Var.c);
                        A(rg5Var);
                    }
                }
                if (!(kc5Var instanceof kc5)) {
                    ti5Var = kc5Var;
                }
                return ti5Var;
            }
            throw new IllegalStateException("Empty ROM options");
        }
        throw new IllegalStateException("Could not open " + uh1Var.j());
    }

    public final rg5 s(rg5 rg5Var) {
        ti5 r = r(rg5Var);
        if (r != null) {
            rg5 d = d(rg5Var, r);
            if (!b53.x(d, rg5Var)) {
                ArrayList arrayList = this.m;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (((rg5) obj).b(rg5Var)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i >= 0) {
                    arrayList.set(i, d);
                    q(true);
                }
                return d;
            }
        }
        return rg5Var;
    }

    public final void t() {
        ArrayList arrayList;
        synchronized (this.o) {
            Collection<q62> values = this.p.values();
            arrayList = new ArrayList(uq0.y0(values, 10));
            for (q62 q62Var : values) {
                arrayList.add(q62Var.a());
            }
        }
        try {
            B(new File(this.a.getFilesDir(), "rom_directory_state.json"), this.b.f(arrayList));
        } catch (Exception e) {
            Log.e("FSRomsRepository", "Failed to save ROM directory cache", e);
        }
    }

    public final void u(List list) {
        File file = new File(this.a.getFilesDir(), "rom_metadata_mirror.json");
        ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rg5 rg5Var = (rg5) it.next();
            arrayList.add(new t62(rg5Var.a, rg5Var.b, rg5Var.c, xi5.a.a(rg5Var.f), rg5Var.g, rg5Var.h, rg5Var.i, im1.e(rg5Var.j), rg5Var.k));
        }
        B(file, this.b.f(arrayList));
    }

    public final void x(q62 q62Var, ul5 ul5Var) {
        synchronized (this.o) {
            this.p.put(q62Var.a.toString(), q62Var);
            this.q.put(q62Var.a.toString(), new vl5(q62Var.a, Long.valueOf(q62Var.c), ul5Var));
            g();
        }
        t();
    }

    public final void y(rg5 rg5Var, ti5 ti5Var) {
        uh1 uh1Var;
        Object kc5Var;
        rg5Var.getClass();
        ti5Var.getClass();
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((rg5) obj).b(rg5Var)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return;
        }
        rg5 rg5Var2 = (rg5) arrayList.get(i);
        rg5Var2.getClass();
        rg5Var2.f = ti5Var;
        Object obj2 = arrayList.get(i);
        obj2.getClass();
        rg5 rg5Var3 = (rg5) obj2;
        if (v(rg5Var3)) {
            A(rg5Var3);
        } else {
            uh1 l = l(rg5Var3);
            if (l != null) {
                uh1Var = l.f(k(rg5Var3));
            } else {
                uh1Var = null;
            }
            if (uh1Var != null) {
                try {
                    kc5Var = Boolean.valueOf(uh1Var.d());
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                Throwable a = nc5.a(kc5Var);
                if (a != null) {
                    Log.w("FSRomsRepository", "Failed to delete ROM options for " + rg5Var3.c, a);
                }
            }
        }
        q(true);
    }

    public final ArrayList z(Uri[] uriArr) {
        Long l;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Uri uri : uriArr) {
            if (!n(uri)) {
                arrayList.add(uri);
            }
        }
        this.u = !arrayList.isEmpty();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Uri uri2 = (Uri) obj;
            Log.w("FSRomsRepository", "ROM search directory has no persisted read permission; cache will not be trusted for " + uri2);
            q62 h = h(uri2);
            if (h != null) {
                l = Long.valueOf(h.c);
            } else {
                l = null;
            }
            p(uri2, l);
        }
        return arrayList;
    }
}
