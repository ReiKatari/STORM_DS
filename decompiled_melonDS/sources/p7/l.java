package p7;

import a5.z;
import ai.a0;
import ai.d0;
import ai.m0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.Preference;
import g2.a5;
import g2.n0;
import h1.n1;
import j0.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.b1;
import n2.p1;
import n2.s;
import n2.w0;
import nc.u;
import od.x;
import p1.f0;
import pi.i0;
import pi.j0;
import y3.u0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11420a = 0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r13, mc.a r14, v2.c r15, mc.p r16, boolean r17, n2.m r18, int r19, int r20) {
        /*
            r6 = r19
            r13.getClass()
            r14.getClass()
            r0 = r18
            n2.r r0 = (n2.r) r0
            r1 = 730854861(0x2b8ff5cd, float:1.0228985E-12)
            r0.Z(r1)
            r1 = r6 & 6
            if (r1 != 0) goto L21
            boolean r1 = r0.f(r13)
            if (r1 == 0) goto L1e
            r1 = 4
            goto L1f
        L1e:
            r1 = 2
        L1f:
            r1 = r1 | r6
            goto L22
        L21:
            r1 = r6
        L22:
            r2 = r6 & 48
            if (r2 != 0) goto L32
            boolean r2 = r0.h(r14)
            if (r2 == 0) goto L2f
            r2 = 32
            goto L31
        L2f:
            r2 = 16
        L31:
            r1 = r1 | r2
        L32:
            r2 = r6 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L42
            boolean r2 = r0.h(r15)
            if (r2 == 0) goto L3f
            r2 = 256(0x100, float:3.59E-43)
            goto L41
        L3f:
            r2 = 128(0x80, float:1.8E-43)
        L41:
            r1 = r1 | r2
        L42:
            r2 = r6 & 3072(0xc00, float:4.305E-42)
            r11 = r16
            if (r2 != 0) goto L54
            boolean r2 = r0.h(r11)
            if (r2 == 0) goto L51
            r2 = 2048(0x800, float:2.87E-42)
            goto L53
        L51:
            r2 = 1024(0x400, float:1.435E-42)
        L53:
            r1 = r1 | r2
        L54:
            r2 = r20 & 16
            if (r2 == 0) goto L5d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L5a:
            r3 = r17
            goto L6f
        L5d:
            r3 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L5a
            r3 = r17
            boolean r4 = r0.g(r3)
            if (r4 == 0) goto L6c
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L6e
        L6c:
            r4 = 8192(0x2000, float:1.148E-41)
        L6e:
            r1 = r1 | r4
        L6f:
            r4 = r1 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            r7 = 1
            if (r4 == r5) goto L78
            r4 = r7
            goto L79
        L78:
            r4 = 0
        L79:
            r5 = r1 & 1
            boolean r4 = r0.O(r5, r4)
            if (r4 == 0) goto La1
            if (r2 == 0) goto L85
            r8 = r7
            goto L86
        L85:
            r8 = r3
        L86:
            rg.a r7 = new rg.a
            r12 = 0
            r9 = r13
            r10 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            r2 = 2011387140(0x77e35504, float:9.221685E33)
            v2.c r2 = v2.h.c(r2, r7, r0)
            int r1 = r1 >> 3
            r1 = r1 & 14
            r1 = r1 | 384(0x180, float:5.38E-43)
            r3 = 0
            og.a.a(r14, r3, r2, r0, r1)
            r5 = r8
            goto La5
        La1:
            r0.R()
            r5 = r3
        La5:
            n2.p1 r8 = r0.r()
            if (r8 == 0) goto Lb9
            g2.r r0 = new g2.r
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f9983d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l.a(java.lang.String, mc.a, v2.c, mc.p, boolean, n2.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r22, b3.p r23, long r24, long r26, long r28, long r30, int r32, boolean r33, int r34, int r35, mc.l r36, l4.r0 r37, n2.m r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l.b(java.lang.String, b3.p, long, long, long, long, int, boolean, int, int, mc.l, l4.r0, n2.m, int, int, int):void");
    }

    public static x4.d c() {
        return new x4.d(1.0f, 1.0f);
    }

    public static final void d(String str, boolean z10, mc.a aVar, n2.m mVar, int i2, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        mc.a aVar2;
        boolean z12;
        boolean z13;
        str.getClass();
        aVar.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(883884621);
        if (rVar.f(str)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i15 = i11 | i2;
        int i16 = i10 & 2;
        if (i16 != 0) {
            i13 = i15 | 48;
        } else {
            if (rVar.g(z10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i13 = i15 | i12;
        }
        if (rVar.h(aVar)) {
            i14 = 256;
        } else {
            i14 = 128;
        }
        int i17 = i13 | i14;
        if ((i17 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i17 & 1, z11)) {
            if (i16 != 0) {
                z13 = true;
            } else {
                z13 = z10;
            }
            n0.j(aVar, null, z13, og.a.f(rVar), v2.h.c(-106743248, new a5(str, 1), rVar), rVar, ((i17 >> 6) & 14) | 805306368 | ((i17 << 3) & 896), 378);
            aVar2 = aVar;
            z12 = z13;
        } else {
            aVar2 = aVar;
            rVar.R();
            z12 = z10;
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new f2.g(str, z12, aVar2, i2, i10);
        }
    }

    public static final void e(final ve.f fVar, mc.a aVar, mc.r rVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        aVar.getClass();
        rVar.getClass();
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(559938776);
        if (rVar2.h(fVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i2 | i10;
        if (rVar2.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar2.h(rVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i15 & 1, z10)) {
            String I = l0.f.I(rVar2, R.string.custom_layout_default_name);
            Object[] objArr = {fVar.f13799b};
            boolean h2 = rVar2.h(fVar);
            Object L = rVar2.L();
            Object obj = n2.l.f9953a;
            if (h2 || L == obj) {
                L = new mc.a() { // from class: th.b
                    @Override // mc.a
                    public final Object b() {
                        switch (r2) {
                            case 0:
                                return s.w(fVar.f13799b);
                            case DSiCameraSource.FrontCamera /* 1 */:
                                return s.w(fVar.f13801d);
                            case 2:
                                return s.w(Boolean.valueOf(fVar.f13802e));
                            default:
                                return new b1(fVar.f13803f);
                        }
                    }
                };
                rVar2.h0(L);
            }
            w0 w0Var = (w0) y2.k.c(objArr, (mc.a) L, rVar2, 0);
            Object[] objArr2 = {fVar.f13801d};
            boolean h10 = rVar2.h(fVar);
            Object L2 = rVar2.L();
            if (h10 || L2 == obj) {
                L2 = new mc.a() { // from class: th.b
                    @Override // mc.a
                    public final Object b() {
                        switch (r2) {
                            case 0:
                                return s.w(fVar.f13799b);
                            case DSiCameraSource.FrontCamera /* 1 */:
                                return s.w(fVar.f13801d);
                            case 2:
                                return s.w(Boolean.valueOf(fVar.f13802e));
                            default:
                                return new b1(fVar.f13803f);
                        }
                    }
                };
                rVar2.h0(L2);
            }
            w0 w0Var2 = (w0) y2.k.c(objArr2, (mc.a) L2, rVar2, 0);
            Object[] objArr3 = {Boolean.valueOf(fVar.f13802e)};
            boolean h11 = rVar2.h(fVar);
            Object L3 = rVar2.L();
            if (h11 || L3 == obj) {
                L3 = new mc.a() { // from class: th.b
                    @Override // mc.a
                    public final Object b() {
                        switch (r2) {
                            case 0:
                                return s.w(fVar.f13799b);
                            case DSiCameraSource.FrontCamera /* 1 */:
                                return s.w(fVar.f13801d);
                            case 2:
                                return s.w(Boolean.valueOf(fVar.f13802e));
                            default:
                                return new b1(fVar.f13803f);
                        }
                    }
                };
                rVar2.h0(L3);
            }
            w0 w0Var3 = (w0) y2.k.c(objArr3, (mc.a) L3, rVar2, 0);
            Object[] objArr4 = {Integer.valueOf(fVar.f13803f)};
            boolean h12 = rVar2.h(fVar);
            Object L4 = rVar2.L();
            if (h12 || L4 == obj) {
                L4 = new mc.a() { // from class: th.b
                    @Override // mc.a
                    public final Object b() {
                        switch (r2) {
                            case 0:
                                return s.w(fVar.f13799b);
                            case DSiCameraSource.FrontCamera /* 1 */:
                                return s.w(fVar.f13801d);
                            case 2:
                                return s.w(Boolean.valueOf(fVar.f13802e));
                            default:
                                return new b1(fVar.f13803f);
                        }
                    }
                };
                rVar2.h0(L4);
            }
            b1 b1Var = (b1) y2.k.c(objArr4, (mc.a) L4, rVar2, 0);
            rg.d D = m.D(rVar2);
            Object[] objArr5 = new Object[0];
            Object L5 = rVar2.L();
            if (L5 == obj) {
                L5 = new od.n(10);
                rVar2.h0(L5);
            }
            w0 w0Var4 = (w0) y2.k.c(objArr5, (mc.a) L5, rVar2, 48);
            String[] G = l0.f.G(rVar2, R.array.layout_orientation_options);
            a(l0.f.I(rVar2, R.string.properties), aVar, v2.h.c(1972798883, new ig.l(D, w0Var, I, G, w0Var2, w0Var3, b1Var), rVar2), v2.h.c(-127883039, new d0(aVar, rVar, w0Var, w0Var2, w0Var3, b1Var), rVar2), false, rVar2, (i15 & 112) | 3456, 16);
            String I2 = l0.f.I(rVar2, R.string.layout_name);
            Object L6 = rVar2.L();
            if (L6 == obj) {
                L6 = new x(21);
                rVar2.h0(L6);
            }
            m.c(I2, D, (mc.l) L6, null, rVar2, 384, 8);
            rVar2 = rVar2;
            if (((Boolean) w0Var4.getValue()).booleanValue()) {
                rVar2.X(-513244900);
                String I3 = l0.f.I(rVar2, R.string.layout_orientation);
                boolean f8 = rVar2.f(w0Var4);
                Object L7 = rVar2.L();
                if (f8 || L7 == obj) {
                    L7 = new ai.s(w0Var4, 18);
                    rVar2.h0(L7);
                }
                a(I3, (mc.a) L7, v2.h.c(1554765950, new a0(w0Var2, w0Var4, G, 6), rVar2), v2.h.c(-1094089156, new g2.o(w0Var4, 3), rVar2), false, rVar2, 3456, 16);
                rVar2.p(false);
            } else {
                rVar2.X(-511355574);
                rVar2.p(false);
            }
        } else {
            rVar2.R();
        }
        p1 r5 = rVar2.r();
        if (r5 != null) {
            r5.f9983d = new m0((Object) fVar, aVar, (yb.d) rVar, i2, 16);
        }
    }

    public static final b9.e f(Matcher matcher, int i2, CharSequence charSequence) {
        if (!matcher.find(i2)) {
            return null;
        }
        return new b9.e(matcher, charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (k0.d.p(r9, r1, r3, r2, r8) == 1.0d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap g(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, n9.g r7, n9.f r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l.g(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, n9.g, n9.f, boolean):android.graphics.Bitmap");
    }

    public static String h(x.p pVar, Integer num, ArrayList arrayList) {
        if (num != null && arrayList.contains("0") && arrayList.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) pVar.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
                return null;
            } else if (num.intValue() == 0 && ((Integer) pVar.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            } else {
                return null;
            }
        }
        return null;
    }

    public static final float i(float f8) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f8) & 8589934591L) / 3)) + 709952852);
        float f10 = intBitsToFloat - ((intBitsToFloat - (f8 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f10 - ((f10 - (f8 / (f10 * f10))) * 0.33333334f);
    }

    public static final void j(long j2, byte[] bArr, int i2, int i10, int i11) {
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = vc.b.f13786a[(int) ((j2 >> (i12 << 3)) & 255)];
            int i15 = i2 + 1;
            bArr[i2] = (byte) (i14 >> 8);
            i2 += 2;
            bArr[i15] = (byte) i14;
            if (i12 != i13) {
                i12--;
            } else {
                return;
            }
        }
    }

    public static final x8.i k(x8.p pVar) {
        pVar.getClass();
        return new x8.i(pVar.f14420a, pVar.f14438t);
    }

    public static pi.p l(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") && !cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                pi.k c4 = pi.k.f11731b.c(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        j0.Companion.getClass();
                        j0 a10 = i0.a(protocol);
                        try {
                            list = qi.g.j(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = zb.q.A;
                        }
                        return new pi.p(a10, c4, qi.g.j(sSLSession.getLocalCertificates()), new jd.i(3, list));
                    }
                    fj.j.h("tlsVersion == NONE");
                    return null;
                }
                a0.j.p("tlsVersion == null");
                return null;
            }
            fj.j.h("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        a0.j.p("cipherSuite == null");
        return null;
    }

    public static final q1.g m(f0 f0Var, int i2, long j2, q1.q qVar, long j10, n1 n1Var, b3.g gVar, x4.m mVar, int i10, a1.x xVar) {
        ArrayList arrayList;
        Object b10 = qVar.b(i2);
        List list = (List) xVar.b(i2);
        if (list != null) {
            arrayList = list;
        } else {
            List a10 = f0Var.a(i2);
            int size = a10.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.add(((u0) a10.get(i11)).e(j2));
            }
            xVar.i(i2, arrayList2);
            arrayList = arrayList2;
        }
        return new q1.g(i2, i10, arrayList, j10, b10, n1Var, gVar, mVar);
    }

    public static final int n(Bundle bundle, String str) {
        str.getClass();
        int i2 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i2 == Integer.MIN_VALUE && bundle.getInt(str, Preference.DEFAULT_ORDER) == Integer.MAX_VALUE) {
            m.z(str);
            throw null;
        }
        return i2;
    }

    public static final long o(t7.a aVar) {
        aVar.getClass();
        if (u(aVar) == 0) {
            return -1L;
        }
        t7.c T = aVar.T("SELECT last_insert_rowid()");
        try {
            T.N();
            long j2 = T.getLong(0);
            q8.r.q(T, null);
            return j2;
        } finally {
        }
    }

    public static final Bundle p(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        m.z(str);
        throw null;
    }

    public static final ArrayList q(Bundle bundle, String str) {
        ArrayList parcelableArrayList;
        Class cls = u.a(Bundle.class).f10259a;
        cls.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableArrayList = z.b(bundle, str, cls);
        } else {
            parcelableArrayList = bundle.getParcelableArrayList(str);
        }
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        m.z(str);
        throw null;
    }

    public static ArrayList r(w.j jVar, d0.r rVar, ArrayList arrayList) {
        String str;
        try {
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            if (rVar == null) {
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    arrayList2.add((String) obj);
                }
            } else {
                try {
                    str = h(jVar.f13978e, rVar.b(), arrayList);
                } catch (IllegalStateException unused) {
                    str = null;
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    String str2 = (String) obj2;
                    if (!str2.equals(str)) {
                        arrayList3.add(jVar.d(str2));
                    }
                }
                ArrayList a10 = rVar.a(arrayList3);
                int size3 = a10.size();
                while (i2 < size3) {
                    Object obj3 = a10.get(i2);
                    i2++;
                    arrayList2.add(((b0) obj3).d());
                }
            }
            return arrayList2;
        } catch (d0.t e6) {
            throw new Exception(e6);
        } catch (x.a e10) {
            throw new Exception(new Exception(e10));
        }
    }

    public static final String s(Bundle bundle, String str) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        m.z(str);
        throw null;
    }

    public static final String[] t(Bundle bundle, String str) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        m.z(str);
        throw null;
    }

    public static final int u(t7.a aVar) {
        aVar.getClass();
        t7.c T = aVar.T("SELECT changes()");
        try {
            T.N();
            int i2 = (int) T.getLong(0);
            q8.r.q(T, null);
            return i2;
        } finally {
        }
    }

    public static final boolean v(Bundle bundle, String str) {
        str.getClass();
        if (bundle.containsKey(str) && bundle.get(str) == null) {
            return true;
        }
        return false;
    }

    public static final float w(float f8, float f10, float f11) {
        return (f11 * f10) + ((1 - f11) * f8);
    }

    public static final int x(float f8, int i2, int i10) {
        return i2 + ((int) Math.round((i10 - i2) * f8));
    }

    public static final void y(String str, int i2, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i2 + ", but was '" + str.charAt(i2) + '\'');
    }
}
