package defpackage;

import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fu2  reason: default package */
/* loaded from: classes.dex */
public final class fu2 implements s52 {
    public static final e80 f = new e80(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public static final e80 g = new e80(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
    public final String a;
    public final df4 b;
    public final il6 c;
    public final il6 d;
    public final boolean e;

    public fu2(String str, df4 df4Var, il6 il6Var, il6 il6Var2, boolean z) {
        this.a = str;
        this.b = df4Var;
        this.c = il6Var;
        this.d = il6Var2;
        this.e = z;
    }

    public static String d(String str, cw3 cw3Var) {
        String str2;
        String b;
        if (cw3Var != null) {
            str2 = cw3Var.a;
        } else {
            str2 = null;
        }
        if ((str2 == null || gh6.n0(str2, "text/plain", false)) && (b = k.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b;
        }
        if (str2 == null) {
            return null;
        }
        return zg6.V0(str2, ';');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0207 A[Catch: Exception -> 0x0202, TryCatch #5 {Exception -> 0x0202, blocks: (B:90:0x01d3, B:92:0x01d9, B:94:0x01f9, B:96:0x01fe, B:95:0x01fc, B:100:0x0207, B:101:0x020c), top: B:121:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0218 A[Catch: Exception -> 0x0052, TRY_ENTER, TryCatch #4 {Exception -> 0x0052, blocks: (B:20:0x0049, B:63:0x014c, B:108:0x0218, B:109:0x021d, B:36:0x0094, B:38:0x009e, B:45:0x00ce, B:47:0x00d2, B:50:0x00eb, B:60:0x0137, B:52:0x0103, B:54:0x010f, B:55:0x0118, B:41:0x00b4, B:43:0x00be, B:57:0x0122, B:58:0x0129, B:59:0x012a), top: B:120:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: Exception -> 0x0052, TRY_ENTER, TryCatch #4 {Exception -> 0x0052, blocks: (B:20:0x0049, B:63:0x014c, B:108:0x0218, B:109:0x021d, B:36:0x0094, B:38:0x009e, B:45:0x00ce, B:47:0x00d2, B:50:0x00eb, B:60:0x0137, B:52:0x0103, B:54:0x010f, B:55:0x0118, B:41:0x00b4, B:43:0x00be, B:57:0x0122, B:58:0x0129, B:59:0x012a), top: B:120:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[Catch: Exception -> 0x0052, TryCatch #4 {Exception -> 0x0052, blocks: (B:20:0x0049, B:63:0x014c, B:108:0x0218, B:109:0x021d, B:36:0x0094, B:38:0x009e, B:45:0x00ce, B:47:0x00d2, B:50:0x00eb, B:60:0x0137, B:52:0x0103, B:54:0x010f, B:55:0x0118, B:41:0x00b4, B:43:0x00be, B:57:0x0122, B:58:0x0129, B:59:0x012a), top: B:120:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d9 A[Catch: Exception -> 0x0202, TryCatch #5 {Exception -> 0x0202, blocks: (B:90:0x01d3, B:92:0x01d9, B:94:0x01f9, B:96:0x01fe, B:95:0x01fc, B:100:0x0207, B:101:0x020c), top: B:121:0x01d3 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    @Override // defpackage.s52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.j11 r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu2.a(j11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ka r5, defpackage.k11 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.du2
            if (r0 == 0) goto L13
            r0 = r6
            du2 r0 = (defpackage.du2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            du2 r0 = new du2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r6)
            goto L9b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.me2.a0(r6)
            android.graphics.Bitmap$Config[] r6 = defpackage.k.a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r6 = defpackage.b53.x(r6, r2)
            il6 r2 = r4.c
            if (r6 == 0) goto L69
            df4 r4 = r4.b
            j80 r4 = r4.o
            boolean r4 = r4.getReadEnabled()
            if (r4 != 0) goto L63
            java.lang.Object r4 = r2.getValue()
            zb4 r4 = (defpackage.zb4) r4
            r4.getClass()
            r5.getClass()
            w45 r6 = new w45
            r6.<init>(r4, r5)
            ec5 r4 = r6.f()
            goto L9e
        L63:
            android.os.NetworkOnMainThreadException r4 = new android.os.NetworkOnMainThreadException
            r4.<init>()
            throw r4
        L69:
            java.lang.Object r4 = r2.getValue()
            zb4 r4 = (defpackage.zb4) r4
            r4.getClass()
            r5.getClass()
            w45 r6 = new w45
            r6.<init>(r4, r5)
            r0.Y = r3
            ih0 r4 = new ih0
            j11 r5 = defpackage.nk2.J(r0)
            r4.<init>(r3, r5)
            r4.x()
            s5 r5 = new s5
            r0 = 7
            r5.<init>(r0, r6, r4)
            r6.e(r5)
            r4.z(r5)
            java.lang.Object r6 = r4.v()
            if (r6 != r1) goto L9b
            return r1
        L9b:
            r4 = r6
            ec5 r4 = (defpackage.ec5) r4
        L9e:
            boolean r5 = r4.l0
            int r6 = r4.R
            if (r5 != 0) goto Lc6
            r5 = 304(0x130, float:4.26E-43)
            if (r6 == r5) goto Lc6
            gc5 r5 = r4.Z
            if (r5 == 0) goto Laf
            defpackage.k.a(r5)
        Laf:
            hg r5 = new hg
            java.lang.String r0 = "HTTP "
            java.lang.String r1 = ": "
            java.lang.StringBuilder r6 = defpackage.wh1.s(r0, r6, r1)
            java.lang.String r4 = r4.L
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu2.b(ka, k11):java.lang.Object");
    }

    public final j62 c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((z45) value).a;
    }

    public final ka e() {
        r9 r9Var = new r9(13);
        r9Var.I(this.a);
        df4 df4Var = this.b;
        xq2 xq2Var = df4Var.j;
        j80 j80Var = df4Var.n;
        xq2Var.getClass();
        r9Var.c = xq2Var.d();
        for (Map.Entry entry : df4Var.k.a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            r9Var.e = ((io2) r9Var.e).g0(q75.a((Class) key), value);
        }
        boolean readEnabled = j80Var.getReadEnabled();
        boolean readEnabled2 = df4Var.o.getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            r9Var.l(e80.o);
        } else if (readEnabled2 && !readEnabled) {
            if (j80Var.getWriteEnabled()) {
                r9Var.l(e80.n);
            } else {
                r9Var.l(f);
            }
        } else if (!readEnabled2 && !readEnabled) {
            r9Var.l(g);
        }
        return new ka(r9Var);
    }

    public final l80 f(y45 y45Var) {
        try {
            j62 c = c();
            cg1 cg1Var = y45Var.A;
            if (!cg1Var.B) {
                s45 o = sn2.o(c.N((jk4) cg1Var.A.c.get(0)));
                l80 l80Var = new l80(o);
                try {
                    o.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                if (th == null) {
                    return l80Var;
                }
                throw th;
            }
            throw new IllegalStateException("snapshot is closed");
        } catch (IOException unused) {
            return null;
        }
    }

    public final d62 g(y45 y45Var) {
        cg1 cg1Var = y45Var.A;
        if (!cg1Var.B) {
            jk4 jk4Var = (jk4) cg1Var.A.c.get(1);
            j62 c = c();
            String str = this.b.i;
            if (str == null) {
                str = this.a;
            }
            return new d62(jk4Var, c, str, y45Var);
        }
        i.n("snapshot is closed");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.y45 h(defpackage.y45 r4, defpackage.ka r5, defpackage.ec5 r6, defpackage.l80 r7) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu2.h(y45, ka, ec5, l80):y45");
    }
}
