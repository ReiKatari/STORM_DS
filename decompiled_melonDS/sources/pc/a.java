package pc;

import a5.u;
import a6.g1;
import a6.m0;
import a7.d0;
import a7.l0;
import a7.n0;
import ai.l;
import ai.q0;
import ai.s0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.DragEvent;
import androidx.preference.Preference;
import b4.q1;
import b4.r0;
import b4.z2;
import b7.s;
import cc.c;
import cc.d;
import cc.e;
import cc.g;
import cc.h;
import d2.t;
import f2.b1;
import f2.i0;
import fj.j;
import i4.n;
import j0.b2;
import j0.d2;
import j0.f2;
import j0.z1;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import l1.m1;
import l1.r1;
import mc.p;
import n2.f1;
import n2.m;
import n2.n1;
import n2.o1;
import n2.p1;
import n2.r;
import n2.w0;
import n6.b;
import nc.k;
import nc.w;
import o3.f;
import o3.h0;
import oe.t0;
import p1.a0;
import p7.o;
import u1.p0;
import y3.z;
import zc.q;
/* loaded from: classes.dex */
public abstract class a implements g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11548a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11549b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static f f11550c;

    public static c A(c cVar) {
        ec.c cVar2;
        c cVar3;
        cVar.getClass();
        if (cVar instanceof ec.c) {
            cVar2 = (ec.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (cVar = cVar2.L) == null) {
            q qVar = (q) cVar2.g().t(d.A);
            if (qVar != null) {
                cVar3 = new ed.f(qVar, cVar2);
            } else {
                cVar3 = cVar2;
            }
            cVar2.L = cVar3;
            return cVar3;
        }
        return cVar;
    }

    public static boolean B(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static final boolean C(b1 b1Var, boolean z10) {
        z c4;
        p0 p0Var = b1Var.f4709d;
        if (p0Var != null && (c4 = p0Var.c()) != null) {
            h3.c N = k0.d.N(c4);
            long l10 = b1Var.l(z10);
            float f8 = N.f6052a;
            float f10 = N.f6054c;
            float intBitsToFloat = Float.intBitsToFloat((int) (l10 >> 32));
            if (f8 <= intBitsToFloat && intBitsToFloat <= f10) {
                float f11 = N.f6053b;
                float f12 = N.f6055d;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (l10 & 4294967295L));
                if (f11 <= intBitsToFloat2 && intBitsToFloat2 <= f12) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final g4.a D(android.content.res.Resources.Theme r55, android.content.res.Resources r56, android.content.res.XmlResourceParser r57, int r58) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.a.D(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):g4.a");
    }

    public static Typeface E(Configuration configuration, Typeface typeface) {
        int i2;
        int i10;
        int weight;
        int i11;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = configuration.fontWeightAdjustment;
            if (i2 != Integer.MAX_VALUE) {
                i10 = configuration.fontWeightAdjustment;
                if (i10 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i11 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, o.e(i11 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static g F(e eVar, cc.f fVar) {
        fVar.getClass();
        if (k.a(eVar.getKey(), fVar)) {
            return h.A;
        }
        return eVar;
    }

    public static g G(e eVar, g gVar) {
        gVar.getClass();
        if (gVar == h.A) {
            return eVar;
        }
        return (g) gVar.L(eVar, new l(8));
    }

    public static long H(Context context, Uri uri, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    long j2 = cursor.getLong(0);
                    l(cursor);
                    return j2;
                }
                l(cursor);
                return 0L;
            } catch (Exception e6) {
                Log.w("DocumentFile", "Failed query: " + e6);
                l(cursor);
                return 0L;
            }
        } catch (Throwable th2) {
            l(cursor);
            throw th2;
        }
    }

    public static String I(Context context, Uri uri, String str) {
        Cursor cursor;
        Throwable th2;
        Exception exc;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst() && !cursor.isNull(0)) {
                        String string = cursor.getString(0);
                        l(cursor);
                        return string;
                    }
                    l(cursor);
                    return null;
                } catch (Exception e6) {
                    exc = e6;
                    Log.w("DocumentFile", "Failed query: " + exc);
                    l(cursor);
                    return null;
                }
            } catch (Throwable th3) {
                th2 = th3;
                l(cursor);
                throw th2;
            }
        } catch (Exception e10) {
            exc = e10;
            cursor = null;
        } catch (Throwable th4) {
            cursor = null;
            th2 = th4;
            l(cursor);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [a6.m0, n6.b] */
    public static b J(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i10 = 0;
            while (true) {
                if (i10 < i2) {
                    int i11 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j2 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i11) {
                        break;
                    }
                    i10++;
                } else {
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j10 = duplicate.getInt() & 4294967295L;
                for (int i12 = 0; i12 < j10; i12++) {
                    int i13 = duplicate.getInt();
                    long j11 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (j11 + j2));
                        ?? m0Var = new m0();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        m0Var.R = duplicate;
                        m0Var.A = position;
                        int i14 = position - duplicate.getInt(position);
                        m0Var.B = i14;
                        m0Var.L = ((ByteBuffer) m0Var.R).getShort(i14);
                        return m0Var;
                    }
                }
            }
            j.h("Cannot read metadata.");
            return null;
        }
        j.h("Cannot read metadata.");
        return null;
    }

    public static final d0 K(a7.m0[] m0VarArr, m mVar) {
        r rVar = (r) mVar;
        Context context = (Context) rVar.j(r0.f1937b);
        Object[] copyOf = Arrays.copyOf(m0VarArr, m0VarArr.length);
        a0 a0Var = new a0(28, new l(6), new a2.c(6, context));
        boolean h2 = rVar.h(context);
        Object L = rVar.L();
        if (h2 || L == n2.l.f9953a) {
            L = new s(context, 0);
            rVar.h0(L);
        }
        d0 d0Var = (d0) y2.k.e(copyOf, a0Var, (mc.a) L, rVar, 0, 4);
        for (a7.m0 m0Var : m0VarArr) {
            d0Var.f552b.f3938s.a(m0Var);
        }
        return d0Var;
    }

    public static int L(double d4) {
        if (!Double.isNaN(d4)) {
            if (d4 > 2.147483647E9d) {
                return Preference.DEFAULT_ORDER;
            }
            if (d4 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d4);
        }
        a0.j.h("Cannot round NaN value.");
        return 0;
    }

    public static int M(float f8) {
        if (!Float.isNaN(f8)) {
            return Math.round(f8);
        }
        a0.j.h("Cannot round NaN value.");
        return 0;
    }

    public static long N(double d4) {
        if (!Double.isNaN(d4)) {
            return Math.round(d4);
        }
        a0.j.h("Cannot round NaN value.");
        return 0L;
    }

    public static boolean O(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
        if (r4 <= (r6.getHeight() * r6.getWidth())) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j0.f2 P(int r5, android.util.Size r6, j0.l r7, int r8, j0.c2 r9, j0.z1 r10) {
        /*
            r6.getClass()
            r7.getClass()
            java.util.HashMap r0 = r7.f7251f
            r9.getClass()
            r10.getClass()
            java.util.LinkedHashMap r1 = j0.f2.f7195h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.get(r2)
            j0.d2 r1 = (j0.d2) r1
            if (r1 != 0) goto L1e
            j0.d2 r1 = j0.d2.PRIV
        L1e:
            j0.b2 r2 = j0.b2.NOT_SUPPORT
            android.util.Size r3 = q0.a.f12087a
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            int r4 = r4 * r3
            r3 = 1
            if (r8 != r3) goto L5a
            java.util.HashMap r6 = r7.f7247b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r8)
            android.util.Size r6 = (android.util.Size) r6
            int r6 = q0.a.a(r6)
            if (r4 > r6) goto L44
            j0.b2 r2 = j0.b2.S720P_16_9
            goto Le5
        L44:
            java.util.HashMap r6 = r7.f7249d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r6.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            int r5 = q0.a.a(r5)
            if (r4 > r5) goto Le5
            j0.b2 r2 = j0.b2.S1440P_4_3
            goto Le5
        L5a:
            j0.c2 r3 = j0.c2.FEATURE_COMBINATION_TABLE
            if (r9 != r3) goto L8c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            j0.b2[] r7 = j0.f2.f7193f
            int r8 = r7.length
            r9 = 0
        L6c:
            if (r9 >= r8) goto L7f
            r0 = r7[r9]
            android.util.Size r3 = r0.getRelatedFixedSize()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L7c
            r2 = r0
            goto L7f
        L7c:
            int r9 = r9 + 1
            goto L6c
        L7f:
            j0.b2 r7 = j0.b2.NOT_SUPPORT
            if (r2 != r7) goto Le5
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto Le5
            j0.b2 r2 = j0.b2.MAXIMUM
            goto Le5
        L8c:
            android.util.Size r6 = r7.f7246a
            int r6 = q0.a.a(r6)
            if (r4 > r6) goto L97
            j0.b2 r2 = j0.b2.VGA
            goto Le5
        L97:
            android.util.Size r6 = r7.f7248c
            int r6 = q0.a.a(r6)
            if (r4 > r6) goto La2
            j0.b2 r2 = j0.b2.PREVIEW
            goto Le5
        La2:
            android.util.Size r6 = r7.f7250e
            int r6 = q0.a.a(r6)
            if (r4 > r6) goto Lad
            j0.b2 r2 = j0.b2.RECORD
            goto Le5
        Lad:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r0.get(r6)
            android.util.Size r6 = (android.util.Size) r6
            java.util.HashMap r7 = r7.f7254i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r7.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            if (r6 == 0) goto Ld0
            int r7 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r7
            if (r4 > r6) goto Ld6
        Ld0:
            r6 = 2
            if (r8 == r6) goto Ld6
            j0.b2 r2 = j0.b2.MAXIMUM
            goto Le5
        Ld6:
            if (r5 == 0) goto Le5
            int r6 = r5.getWidth()
            int r5 = r5.getHeight()
            int r5 = r5 * r6
            if (r4 > r5) goto Le5
            j0.b2 r2 = j0.b2.ULTRA_MAXIMUM
        Le5:
            j0.f2 r5 = p(r1, r2, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.a.P(int, android.util.Size, j0.l, int, j0.c2, j0.z1):j0.f2");
    }

    public static Object Q(p pVar, Object obj, c cVar) {
        Object cVar2;
        pVar.getClass();
        g g10 = cVar.g();
        if (g10 == h.A) {
            cVar2 = new ec.h(cVar);
        } else {
            cVar2 = new ec.c(cVar, g10);
        }
        w.b(2, pVar);
        return pVar.j(obj, cVar2);
    }

    public static final void d(mh.b bVar, m mVar, int i2) {
        int i10;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(-1852700408);
        if (rVar.h(bVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            boolean h2 = rVar.h(bVar);
            Object L = rVar.L();
            if (h2 || L == n2.l.f9953a) {
                L = new a9.b(25, null, bVar);
                rVar.h0(L);
            }
            n2.s.g(bVar, (p) L, rVar);
            l0.f.a(l1.c.t(b3.m.f1770a, 8), bVar.f9668a.f11021j, bVar.f9672e, v2.h.c(-1281485715, new q0(11, bVar), rVar), rVar, 3078);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new s0(i2, 17, bVar);
        }
    }

    public static n3.a e(i3.f fVar, int i2) {
        Bitmap bitmap = fVar.f6630a;
        n3.a aVar = new n3.a(fVar, (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L));
        aVar.Z = i2;
        return aVar;
    }

    public static final void f(f2.m mVar, b3.d dVar, v2.c cVar, m mVar2, int i2) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        boolean h2;
        int i13;
        r rVar = (r) mVar2;
        rVar.Z(-1090171650);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = rVar.f(mVar);
            } else {
                h2 = rVar.h(mVar);
            }
            if (h2) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(dVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(cVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        boolean z12 = true;
        if ((i10 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            if ((i10 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i10 & 14) != 4 && ((i10 & 8) == 0 || !rVar.f(mVar))) {
                z12 = false;
            }
            boolean z13 = z11 | z12;
            Object L = rVar.L();
            if (z13 || L == n2.l.f9953a) {
                L = new f2.l(dVar, mVar);
                rVar.h0(L);
            }
            u.a((f2.l) L, null, new a5.r0(false, a5.s0.Inherit, false), cVar, rVar, ((i10 << 3) & 7168) | 384, 2);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(mVar, dVar, cVar, i2, 1);
        }
    }

    public static final void g(b3.p pVar, n1 n1Var, v2.c cVar, m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        r rVar = (r) mVar;
        rVar.Z(-714464401);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(n1Var)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        int i15 = i2 & 384;
        v2.c cVar2 = z1.h.f14877a;
        if (i15 == 0) {
            if (rVar.h(cVar2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(cVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                f1 f1Var = new f1(null, n2.e.R);
                rVar.h0(f1Var);
                L = f1Var;
            }
            b2.d k10 = k(cVar2, rVar, (i10 >> 6) & 14);
            n2.s.a(n1Var.a(k10), v2.h.c(274270255, new b2.e(pVar, (w0) L, cVar, k10, 0), rVar), rVar, 56);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(pVar, n1Var, cVar, i2, 0);
        }
    }

    public static final h3.c h(long j2, long j10) {
        int i2 = (int) (j2 >> 32);
        int i10 = (int) (j2 & 4294967295L);
        return new h3.c(Float.intBitsToFloat(i2), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i10));
    }

    public static final void i(final f2.m mVar, final boolean z10, final w4.j jVar, final boolean z11, long j2, final float f8, final b3.p pVar, m mVar2, final int i2) {
        int i10;
        boolean z12;
        final long j10;
        int i11;
        long j11;
        boolean z13;
        final boolean z14;
        b3.e eVar;
        boolean z15;
        boolean z16;
        boolean z17;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean h2;
        int i16;
        r rVar = (r) mVar2;
        rVar.Z(-466280168);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = rVar.f(mVar);
            } else {
                h2 = rVar.h(mVar);
            }
            if (h2) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.g(z10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i2 & 384) == 0) {
            if (rVar.d(jVar.ordinal())) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.g(z11)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i2 & 24576) == 0) {
            i10 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            if (rVar.f(pVar)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i10 |= i12;
        }
        if ((533651 & i10) != 533650) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.O(i10 & 1, z12)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                i11 = i10 & (-57345);
                j11 = j2;
            } else {
                i11 = i10 & (-57345);
                j11 = 9205357640488583168L;
            }
            rVar.q();
            if (z10) {
                float f10 = i0.f4743a;
                if ((jVar == w4.j.Ltr && !z11) || (jVar == w4.j.Rtl && z11)) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z14 = z17;
            } else {
                float f11 = i0.f4743a;
                if ((jVar == w4.j.Ltr && !z11) || (jVar == w4.j.Rtl && z11)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (z14) {
                eVar = b3.a.f1751b;
            } else {
                eVar = b3.a.f1750a;
            }
            int i17 = i11 & 14;
            if (i17 != 4 && ((i11 & 8) == 0 || !rVar.h(mVar))) {
                z15 = false;
            } else {
                z15 = true;
            }
            if ((i11 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean g10 = z16 | z15 | rVar.g(z14);
            Object L = rVar.L();
            if (g10 || L == n2.l.f9953a) {
                L = new mc.l() { // from class: f2.b
                    @Override // mc.l
                    public final Object k(Object obj) {
                        u1.c0 c0Var;
                        g0 g0Var;
                        boolean z18;
                        i4.x xVar = (i4.x) obj;
                        long a10 = m.this.a();
                        i4.w wVar = i0.f4745c;
                        if (z10) {
                            c0Var = u1.c0.SelectionStart;
                        } else {
                            c0Var = u1.c0.SelectionEnd;
                        }
                        if (z14) {
                            g0Var = g0.Left;
                        } else {
                            g0Var = g0.Right;
                        }
                        if ((9223372034707292159L & a10) != 9205357640488583168L) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        xVar.a(wVar, new h0(c0Var, a10, g0Var, z18));
                        return yb.y.f14813a;
                    }
                };
                rVar.h0(L);
            }
            final b3.p a10 = n.a(pVar, false, (mc.l) L);
            final z2 z2Var = (z2) rVar.j(q1.f1929s);
            long j12 = j11;
            b3.e eVar2 = eVar;
            j10 = j12;
            f(mVar, eVar2, v2.h.c(1365123137, new p() { // from class: f2.c
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    boolean z18;
                    n2.m mVar3 = (n2.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    n2.r rVar2 = (n2.r) mVar3;
                    if (rVar2.O(intValue & 1, z18)) {
                        o1 a11 = q1.f1929s.a(z2.this);
                        final long j13 = j10;
                        final boolean z19 = z14;
                        final b3.p pVar2 = a10;
                        final m mVar4 = mVar;
                        n2.s.a(a11, v2.h.c(1260045569, new mc.p() { // from class: f2.e
                            @Override // mc.p
                            public final Object j(Object obj3, Object obj4) {
                                boolean z20;
                                l1.s sVar;
                                n2.m mVar5 = (n2.m) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                n2.r rVar3 = (n2.r) mVar5;
                                if (rVar3.O(intValue2 & 1, z20)) {
                                    long j14 = j13;
                                    int i18 = (j14 > 9205357640488583168L ? 1 : (j14 == 9205357640488583168L ? 0 : -1));
                                    boolean z21 = z19;
                                    b3.p pVar3 = pVar2;
                                    final m mVar6 = mVar4;
                                    n2.e eVar3 = n2.l.f9953a;
                                    if (i18 != 0) {
                                        rVar3.X(3458246);
                                        if (z21) {
                                            sVar = l1.c.f8506b;
                                        } else {
                                            sVar = l1.c.f8505a;
                                        }
                                        b3.p h10 = r1.h(pVar3, x4.h.b(j14), x4.h.a(j14), 0.0f, 0.0f, 12);
                                        l1.o1 a12 = m1.a(sVar, b3.c.f1755d0, rVar3, 0);
                                        int hashCode = Long.hashCode(rVar3.T);
                                        v2.g l10 = rVar3.l();
                                        b3.p c4 = b3.a.c(h10, rVar3);
                                        a4.h.f220a.getClass();
                                        a4.f0 f0Var = a4.g.f212b;
                                        rVar3.b0();
                                        if (rVar3.S) {
                                            rVar3.k(f0Var);
                                        } else {
                                            rVar3.k0();
                                        }
                                        n2.s.C(a12, a4.g.f215e, rVar3);
                                        n2.s.C(l10, a4.g.f214d, rVar3);
                                        n2.s.u(rVar3, Integer.valueOf(hashCode), a4.g.f216f);
                                        n2.s.y(rVar3, a4.g.f217g);
                                        n2.s.C(c4, a4.g.f213c, rVar3);
                                        boolean h11 = rVar3.h(mVar6);
                                        Object L2 = rVar3.L();
                                        if (h11 || L2 == eVar3) {
                                            L2 = new mc.a() { // from class: f2.f
                                                @Override // mc.a
                                                public final Object b() {
                                                    boolean z22;
                                                    boolean z23;
                                                    switch (r2) {
                                                        case 0:
                                                            if ((mVar6.a() & 9223372034707292159L) != 9205357640488583168L) {
                                                                z22 = true;
                                                            } else {
                                                                z22 = false;
                                                            }
                                                            return Boolean.valueOf(z22);
                                                        default:
                                                            if ((mVar6.a() & 9223372034707292159L) != 9205357640488583168L) {
                                                                z23 = true;
                                                            } else {
                                                                z23 = false;
                                                            }
                                                            return Boolean.valueOf(z23);
                                                    }
                                                }
                                            };
                                            rVar3.h0(L2);
                                        }
                                        pc.a.j(b3.m.f1770a, (mc.a) L2, z21, rVar3, 6);
                                        rVar3.p(true);
                                        rVar3.p(false);
                                    } else {
                                        rVar3.X(4389176);
                                        boolean h12 = rVar3.h(mVar6);
                                        Object L3 = rVar3.L();
                                        if (h12 || L3 == eVar3) {
                                            L3 = new mc.a() { // from class: f2.f
                                                @Override // mc.a
                                                public final Object b() {
                                                    boolean z22;
                                                    boolean z23;
                                                    switch (r2) {
                                                        case 0:
                                                            if ((mVar6.a() & 9223372034707292159L) != 9205357640488583168L) {
                                                                z22 = true;
                                                            } else {
                                                                z22 = false;
                                                            }
                                                            return Boolean.valueOf(z22);
                                                        default:
                                                            if ((mVar6.a() & 9223372034707292159L) != 9205357640488583168L) {
                                                                z23 = true;
                                                            } else {
                                                                z23 = false;
                                                            }
                                                            return Boolean.valueOf(z23);
                                                    }
                                                }
                                            };
                                            rVar3.h0(L3);
                                        }
                                        pc.a.j(pVar3, (mc.a) L3, z21, rVar3, 0);
                                        rVar3.p(false);
                                    }
                                } else {
                                    rVar3.R();
                                }
                                return yb.y.f14813a;
                            }
                        }, rVar2), rVar2, 56);
                    } else {
                        rVar2.R();
                    }
                    return yb.y.f14813a;
                }
            }, rVar), rVar, i17 | 384);
        } else {
            rVar.R();
            j10 = j2;
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            final long j13 = j10;
            r5.f9983d = new p() { // from class: f2.d
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pc.a.i(m.this, z10, jVar, z11, j13, f8, pVar, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void j(b3.p pVar, final mc.a aVar, final boolean z10, m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        r rVar = (r) mVar;
        rVar.Z(2111672474);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if (rVar.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i10 | i11;
        if (rVar.g(z10)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i15 & 1, z11)) {
            l1.c.d(b3.a.a(r1.j(pVar, i0.f4743a, i0.f4744b), new mc.q() { // from class: f2.h
                @Override // mc.q
                public final Object i(Object obj, Object obj2, Object obj3) {
                    b3.p pVar2 = (b3.p) obj;
                    ((Integer) obj3).getClass();
                    n2.r rVar2 = (n2.r) ((n2.m) obj2);
                    rVar2.X(-196777734);
                    final long j2 = ((i1) rVar2.j(j1.f4748a)).f4746a;
                    boolean e6 = rVar2.e(j2);
                    final mc.a aVar2 = mc.a.this;
                    boolean f8 = e6 | rVar2.f(aVar2);
                    final boolean z12 = z10;
                    boolean g10 = f8 | rVar2.g(z12);
                    Object L = rVar2.L();
                    if (g10 || L == n2.l.f9953a) {
                        L = new mc.l() { // from class: f2.i
                            @Override // mc.l
                            public final Object k(Object obj4) {
                                f3.c cVar = (f3.c) obj4;
                                return cVar.a(new a(aVar2, z12, pc.a.r(cVar, Float.intBitsToFloat((int) (cVar.A.c() >> 32)) / 2.0f), new i3.l(5, j2), 0));
                            }
                        };
                        rVar2.h0(L);
                    }
                    b3.p e10 = f3.g.e(pVar2, (mc.l) L);
                    rVar2.p(false);
                    return e10;
                }
            }), rVar);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new f2.g(pVar, aVar, z10, i2);
        }
    }

    public static final b2.d k(v2.c cVar, m mVar, int i2) {
        boolean z10;
        if ((((i2 & 14) ^ 6) > 4 && ((r) mVar).f(cVar)) || (i2 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        r rVar = (r) mVar;
        Object L = rVar.L();
        n2.e eVar = n2.l.f9953a;
        if (z10 || L == eVar) {
            L = new b2.d(cVar);
            rVar.h0(L);
        }
        b2.d dVar = (b2.d) L;
        boolean f8 = rVar.f(dVar);
        Object L2 = rVar.L();
        if (f8 || L2 == eVar) {
            L2 = new a2.c(5, dVar);
            rVar.h0(L2);
        }
        n2.s.d(dVar, (mc.l) L2, rVar);
        return dVar;
    }

    public static void l(Cursor cursor) {
        if (cursor != null) {
            try {
                w.d.z(cursor);
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static pi.q m(pi.q qVar, pi.q qVar2) {
        j0.o1 o1Var = new j0.o1(3, false);
        int size = qVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b10 = qVar.b(i2);
            String d4 = qVar.d(i2);
            if ((!"Warning".equalsIgnoreCase(b10) || !vc.o.V(d4, "1", false)) && ("Content-Length".equalsIgnoreCase(b10) || "Content-Encoding".equalsIgnoreCase(b10) || "Content-Type".equalsIgnoreCase(b10) || !B(b10) || qVar2.a(b10) == null)) {
                o1Var.e(b10, d4);
            }
        }
        int size2 = qVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            String b11 = qVar2.b(i10);
            if (!"Content-Length".equalsIgnoreCase(b11) && !"Content-Encoding".equalsIgnoreCase(b11) && !"Content-Type".equalsIgnoreCase(b11) && B(b11)) {
                o1Var.e(b11, qVar2.d(i10));
            }
        }
        return o1Var.f();
    }

    public static final i8.a n(long j2, Set set, Set set2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (x4.f.a(x4.h.b(j2), ((x4.f) obj).A) >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            float f8 = ((x4.f) it.next()).A;
            while (it.hasNext()) {
                f8 = Math.max(f8, ((x4.f) it.next()).A);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (x4.f.a(x4.h.a(j2), ((x4.f) obj2).A) >= 0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                float f10 = ((x4.f) it2.next()).A;
                while (it2.hasNext()) {
                    f10 = Math.max(f10, ((x4.f) it2.next()).A);
                }
                return new i8.a((int) f8, (int) f10);
            }
            j.l();
            return null;
        }
        j.l();
        return null;
    }

    public static long[] o(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static f2 p(d2 d2Var, b2 b2Var, z1 z1Var) {
        d2Var.getClass();
        b2Var.getClass();
        z1Var.getClass();
        return new f2(d2Var, b2Var, z1Var);
    }

    public static c q(p pVar, Object obj, c cVar) {
        pVar.getClass();
        cVar.getClass();
        if (pVar instanceof ec.a) {
            return ((ec.a) pVar).t(cVar, obj);
        }
        g g10 = cVar.g();
        if (g10 == h.A) {
            return new dc.b(pVar, obj, cVar);
        }
        return new dc.c(cVar, g10, pVar, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1 <= r6.getHeight()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final i3.f r(f3.c r26, float r27) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.a.r(f3.c, float):i3.f");
    }

    public static List s(ArrayList arrayList) {
        if (arrayList.size() == 3) {
            return arrayList;
        }
        int size = 3 - arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                arrayList2.add(0);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return arrayList2;
    }

    public static final Enum t(String str, Enum[] enumArr) {
        enumArr.getClass();
        str.getClass();
        for (Enum r22 : enumArr) {
            if (vc.o.P(r22.name(), str, true)) {
                return r22;
            }
        }
        a0.j.h(kc.a.g("Value ", str, " does not represent an enum entry"));
        return null;
    }

    public static final Object u(Context context, Class cls) {
        context.getClass();
        return aj.g.w(aj.g.y(context.getApplicationContext()), cls);
    }

    public static t0 v(String str) {
        str.getClass();
        List u02 = vc.h.u0(str, new char[]{'-'});
        if (u02.size() == 1) {
            List<String> u03 = vc.h.u0((CharSequence) u02.get(0), new char[]{'.'});
            ArrayList arrayList = new ArrayList(zb.m.G(u03, 10));
            for (String str2 : u03) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            ArrayList arrayList2 = (ArrayList) s(arrayList);
            return new t0(oe.r0.FINAL, ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue(), ((Number) arrayList2.get(2)).intValue());
        } else if (u02.size() == 2) {
            String upperCase = ((String) u02.get(0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            oe.r0 valueOf = oe.r0.valueOf(upperCase);
            if (valueOf == oe.r0.NIGHTLY) {
                return t0.X;
            }
            List<String> u04 = vc.h.u0((CharSequence) u02.get(1), new char[]{'.'});
            ArrayList arrayList3 = new ArrayList(zb.m.G(u04, 10));
            for (String str3 : u04) {
                arrayList3.add(Integer.valueOf(Integer.parseInt(str3)));
            }
            ArrayList arrayList4 = (ArrayList) s(arrayList3);
            return new t0(valueOf, ((Number) arrayList4.get(0)).intValue(), ((Number) arrayList4.get(1)).intValue(), ((Number) arrayList4.get(2)).intValue());
        } else {
            throw new Exception("Invalid version string format");
        }
    }

    public static e w(e eVar, cc.f fVar) {
        fVar.getClass();
        if (k.a(eVar.getKey(), fVar)) {
            return eVar;
        }
        return null;
    }

    public static final f x() {
        f fVar = f11550c;
        if (fVar != null) {
            return fVar;
        }
        o3.e eVar = new o3.e("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.f10763a;
        i3.p0 p0Var = new i3.p0(i3.s.f6681b);
        j0.o1 o1Var = new j0.o1(2, false);
        o1Var.q(12.0f, 8.0f);
        o1Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        o1Var.r(-0.9f, -2.0f, -2.0f, -2.0f);
        o1Var.r(-2.0f, 0.9f, -2.0f, 2.0f);
        o1Var.r(0.9f, 2.0f, 2.0f, 2.0f);
        o1Var.g();
        o1Var.q(12.0f, 10.0f);
        o1Var.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        o1Var.r(0.9f, 2.0f, 2.0f, 2.0f);
        o1Var.r(2.0f, -0.9f, 2.0f, -2.0f);
        o1Var.r(-0.9f, -2.0f, -2.0f, -2.0f);
        o1Var.g();
        o1Var.q(12.0f, 16.0f);
        o1Var.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        o1Var.r(0.9f, 2.0f, 2.0f, 2.0f);
        o1Var.r(2.0f, -0.9f, 2.0f, -2.0f);
        o1Var.r(-0.9f, -2.0f, -2.0f, -2.0f);
        o1Var.g();
        o3.e.a(eVar, o1Var.f7269a, p0Var);
        f b10 = eVar.b();
        f11550c = b10;
        return b10;
    }

    public static String y(Class cls) {
        LinkedHashMap linkedHashMap = n0.f607b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            l0 l0Var = (l0) cls.getAnnotation(l0.class);
            if (l0Var != null) {
                str = l0Var.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                a0.j.e("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
        }
        str.getClass();
        return str;
    }

    public static final long z(t tVar) {
        DragEvent dragEvent = (DragEvent) tVar.B;
        return (Float.floatToRawIntBits(dragEvent.getX()) << 32) | (Float.floatToRawIntBits(dragEvent.getY()) & 4294967295L);
    }

    @Override // a6.g1
    public void b() {
    }

    @Override // a6.g1
    public void c() {
    }
}
