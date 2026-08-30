package g9;

import a7.v;
import android.webkit.MimeTypeMap;
import fj.a0;
import fj.x;
import java.io.IOException;
import java.util.Map;
import m9.n;
import nc.u;
import pi.q;
import pi.t;
import vc.o;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: f  reason: collision with root package name */
    public static final pi.g f5620f = new pi.g(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g  reason: collision with root package name */
    public static final pi.g f5621g = new pi.g(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* renamed from: a  reason: collision with root package name */
    public final String f5622a;

    /* renamed from: b  reason: collision with root package name */
    public final n f5623b;

    /* renamed from: c  reason: collision with root package name */
    public final yb.n f5624c;

    /* renamed from: d  reason: collision with root package name */
    public final yb.n f5625d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5626e;

    public l(String str, n nVar, yb.n nVar2, yb.n nVar3, boolean z10) {
        this.f5622a = str;
        this.f5623b = nVar;
        this.f5624c = nVar2;
        this.f5625d = nVar3;
        this.f5626e = z10;
    }

    public static String d(String str, t tVar) {
        String str2;
        String b10;
        if (tVar != null) {
            str2 = tVar.f11792a;
        } else {
            str2 = null;
        }
        if ((str2 == null || o.V(str2, "text/plain", false)) && (b10 = q9.g.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b10;
        }
        if (str2 == null) {
            return null;
        }
        return vc.h.z0(str2, ';');
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0207 A[Catch: Exception -> 0x018b, TryCatch #1 {Exception -> 0x018b, blocks: (B:92:0x01d8, B:94:0x01de, B:96:0x01fe, B:98:0x0203, B:97:0x0201, B:100:0x0207, B:101:0x020c, B:68:0x015b, B:71:0x0167, B:73:0x0173, B:75:0x0181, B:79:0x018d, B:81:0x0199, B:83:0x01b4, B:85:0x01b9, B:84:0x01b7, B:87:0x01bd), top: B:110:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211 A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:102:0x020d, B:103:0x0210, B:66:0x0153, B:104:0x0211, B:105:0x0216, B:36:0x0093, B:38:0x009d, B:47:0x00d1, B:49:0x00d5, B:52:0x00ee, B:62:0x013a, B:54:0x0106, B:56:0x0112, B:57:0x011b, B:41:0x00b3, B:43:0x00bd, B:59:0x0125, B:60:0x012c, B:61:0x012d), top: B:109:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: Exception -> 0x00cd, TRY_ENTER, TryCatch #0 {Exception -> 0x00cd, blocks: (B:102:0x020d, B:103:0x0210, B:66:0x0153, B:104:0x0211, B:105:0x0216, B:36:0x0093, B:38:0x009d, B:47:0x00d1, B:49:0x00d5, B:52:0x00ee, B:62:0x013a, B:54:0x0106, B:56:0x0112, B:57:0x011b, B:41:0x00b3, B:43:0x00bd, B:59:0x0125, B:60:0x012c, B:61:0x012d), top: B:109:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:102:0x020d, B:103:0x0210, B:66:0x0153, B:104:0x0211, B:105:0x0216, B:36:0x0093, B:38:0x009d, B:47:0x00d1, B:49:0x00d5, B:52:0x00ee, B:62:0x013a, B:54:0x0106, B:56:0x0112, B:57:0x011b, B:41:0x00b3, B:43:0x00bd, B:59:0x0125, B:60:0x012c, B:61:0x012d), top: B:109:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01de A[Catch: Exception -> 0x018b, TryCatch #1 {Exception -> 0x018b, blocks: (B:92:0x01d8, B:94:0x01de, B:96:0x01fe, B:98:0x0203, B:97:0x0201, B:100:0x0207, B:101:0x020c, B:68:0x015b, B:71:0x0167, B:73:0x0173, B:75:0x0181, B:79:0x018d, B:81:0x0199, B:83:0x01b4, B:85:0x01b9, B:84:0x01b7, B:87:0x01bd), top: B:110:0x015b }] */
    /* JADX WARN: Type inference failed for: r1v4, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [yb.f, java.lang.Object] */
    @Override // g9.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(cc.c r14) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.l.a(cc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(w.x0 r5, ec.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g9.j
            if (r0 == 0) goto L13
            r0 = r6
            g9.j r0 = (g9.j) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            g9.j r0 = new g9.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r6)
            goto L9b
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r6)
            android.graphics.Bitmap$Config[] r6 = q9.g.f12393a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r6 = nc.k.a(r6, r2)
            yb.n r2 = r4.f5624c
            if (r6 == 0) goto L69
            m9.n r6 = r4.f5623b
            m9.b r6 = r6.f9442o
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L63
            java.lang.Object r6 = r2.getValue()
            pi.x r6 = (pi.x) r6
            r6.getClass()
            r5.getClass()
            ti.n r0 = new ti.n
            r0.<init>(r6, r5)
            pi.d0 r5 = r0.f()
            goto L9e
        L63:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L69:
            java.lang.Object r6 = r2.getValue()
            pi.x r6 = (pi.x) r6
            r6.getClass()
            r5.getClass()
            ti.n r2 = new ti.n
            r2.<init>(r6, r5)
            r0.Y = r3
            zc.h r5 = new zc.h
            cc.c r6 = pc.a.A(r0)
            r5.<init>(r3, r6)
            r5.v()
            ai.b1 r6 = new ai.b1
            r0 = 7
            r6.<init>(r0, r2, r5)
            r2.e(r6)
            r5.x(r6)
            java.lang.Object r6 = r5.u()
            if (r6 != r1) goto L9b
            return r1
        L9b:
            r5 = r6
            pi.d0 r5 = (pi.d0) r5
        L9e:
            boolean r6 = r5.f11710k0
            int r0 = r5.R
            if (r6 != 0) goto Lc6
            r6 = 304(0x130, float:4.26E-43)
            if (r0 == r6) goto Lc6
            pi.g0 r6 = r5.Z
            if (r6 == 0) goto Laf
            q9.g.a(r6)
        Laf:
            androidx.fragment.app.g0 r6 = new androidx.fragment.app.g0
            java.lang.String r1 = "HTTP "
            java.lang.String r2 = ": "
            java.lang.StringBuilder r0 = kc.a.i(r1, r0, r2)
            java.lang.String r5 = r5.L
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lc6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.l.b(w.x0, ec.c):java.lang.Object");
    }

    public final fj.k c() {
        Object value = this.f5625d.getValue();
        value.getClass();
        return ((e9.h) value).f4437a;
    }

    public final x0 e() {
        v vVar = new v(7);
        vVar.x(this.f5622a);
        n nVar = this.f5623b;
        q qVar = nVar.f9438j;
        m9.b bVar = nVar.f9441n;
        qVar.getClass();
        vVar.L = qVar.c();
        for (Map.Entry entry : nVar.f9439k.f9451a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            vVar.X = ((p7.o) vVar.X).n(u.a((Class) key), value);
        }
        boolean readEnabled = bVar.getReadEnabled();
        boolean readEnabled2 = nVar.f9442o.getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            vVar.i(pi.g.f11712o);
        } else if (readEnabled2 && !readEnabled) {
            if (bVar.getWriteEnabled()) {
                vVar.i(pi.g.f11711n);
            } else {
                vVar.i(f5620f);
            }
        } else if (!readEnabled2 && !readEnabled) {
            vVar.i(f5621g);
        }
        return new x0(vVar);
    }

    public final l9.b f(e9.g gVar) {
        try {
            fj.k c4 = c();
            e9.c cVar = gVar.A;
            if (!cVar.B) {
                a0 x9 = ij.a.x(c4.J((x) cVar.A.f4420c.get(0)));
                l9.b bVar = new l9.b(x9);
                try {
                    x9.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (th == null) {
                    return bVar;
                }
                throw th;
            }
            throw new IllegalStateException("snapshot is closed");
        } catch (IOException unused) {
            return null;
        }
    }

    public final d9.o g(e9.g gVar) {
        e9.c cVar = gVar.A;
        if (!cVar.B) {
            x xVar = (x) cVar.A.f4420c.get(1);
            fj.k c4 = c();
            String str = this.f5623b.f9437i;
            if (str == null) {
                str = this.f5622a;
            }
            return new d9.o(xVar, c4, str, gVar);
        }
        a0.j.p("snapshot is closed");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e9.g h(e9.g r4, w.x0 r5, pi.d0 r6, l9.b r7) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.l.h(e9.g, w.x0, pi.d0, l9.b):e9.g");
    }
}
