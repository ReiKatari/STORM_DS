package ij;

import a6.b1;
import ai.r0;
import ai.s0;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.preference.Preference;
import b4.u2;
import c1.q2;
import f1.m1;
import fj.e0;
import fj.g0;
import fj.z;
import g2.l5;
import g2.v3;
import h1.q0;
import i3.p0;
import j0.o1;
import java.io.InputStream;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import l1.h1;
import l4.n0;
import l4.o0;
import me.magnum.melonds.R;
import n2.p1;
import nd.e1;
import o3.h0;
import p1.a0;
import u1.l0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a implements md.d, md.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7083a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f7084b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static o3.f f7085c;

    /* renamed from: d  reason: collision with root package name */
    public static o3.f f7086d;

    public static final void A(View view) {
        view.getClass();
        uc.g y10 = p7.m.y(new b1(0, null, view));
        while (y10.hasNext()) {
            ArrayList arrayList = Y((View) y10.next()).f6289a;
            for (int l10 = p7.t.l(arrayList); -1 < l10; l10--) {
                ((u2) arrayList.get(l10)).f1950a.c();
            }
        }
    }

    public static l0.a D() {
        if (l0.a.B != null) {
            return l0.a.B;
        }
        synchronized (l0.a.class) {
            try {
                if (l0.a.B == null) {
                    l0.a.B = new l0.a(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l0.a.B;
    }

    public static final Object M(k7.n nVar, String str, ec.c cVar) {
        Object a10 = nVar.a(str, new l5(22), cVar);
        if (a10 == dc.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return yb.y.f14813a;
    }

    public static final long N(float f8, int i2, long j2, boolean z10) {
        int h2;
        if ((z10 || i2 == 2 || i2 == 4 || i2 == 5) && x4.a.d(j2)) {
            h2 = x4.a.h(j2);
        } else {
            h2 = Preference.DEFAULT_ORDER;
        }
        if (x4.a.j(j2) != h2) {
            h2 = p7.j.g(l0.o(f8), x4.a.j(j2), h2);
        }
        return p7.k.n(0, h2, 0, x4.a.g(j2));
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [ij.a, d5.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [d5.h, ij.a, java.lang.Object] */
    public static a O(int i2, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i2 = 2;
        }
        if (i2 != 0) {
            if (i2 != 2) {
                ?? obj = new Object();
                int length = dArr2[0].length;
                obj.f3854g = new double[length];
                obj.f3852e = dArr;
                obj.f3853f = dArr2;
                if (length > 2) {
                    double d4 = 0.0d;
                    int i10 = 0;
                    while (true) {
                        double d10 = d4;
                        if (i10 >= dArr.length) {
                            break;
                        }
                        double d11 = dArr2[i10][0];
                        if (i10 > 0) {
                            Math.hypot(d11 - d4, d11 - d10);
                        }
                        i10++;
                        d4 = d11;
                    }
                }
                return obj;
            }
            double d12 = dArr[0];
            double[] dArr3 = dArr2[0];
            ?? obj2 = new Object();
            obj2.f3829e = d12;
            obj2.f3830f = dArr3;
            return obj2;
        }
        return new d5.i(dArr, dArr2);
    }

    public static final float P(int i2, int i10, float[] fArr) {
        return fArr[((i2 - i10) * 2) + 1];
    }

    public static final o3.f Q() {
        o3.f fVar = f7086d;
        if (fVar != null) {
            return fVar;
        }
        o3.e eVar = new o3.e("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.f10763a;
        p0 p0Var = new p0(i3.s.f6681b);
        o1 o1Var = new o1(2, false);
        o1Var.q(19.0f, 6.41f);
        o1Var.o(17.59f, 5.0f);
        o1Var.o(12.0f, 10.59f);
        o1Var.o(6.41f, 5.0f);
        o1Var.o(5.0f, 6.41f);
        o1Var.o(10.59f, 12.0f);
        o1Var.o(5.0f, 17.59f);
        o1Var.o(6.41f, 19.0f);
        o1Var.o(12.0f, 13.41f);
        o1Var.o(17.59f, 19.0f);
        o1Var.o(19.0f, 17.59f);
        o1Var.o(13.41f, 12.0f);
        o1Var.g();
        o3.e.a(eVar, o1Var.f7269a, p0Var);
        o3.f b10 = eVar.b();
        f7086d = b10;
        return b10;
    }

    public static final String V(k6.a aVar) {
        String f8 = aVar.f();
        if (f8 != null) {
            return vc.h.A0(f8, '.');
        }
        return null;
    }

    public static final h6.a Y(View view) {
        h6.a aVar = (h6.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar == null) {
            h6.a aVar2 = new h6.a();
            view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static int c0(int i2, boolean z10, int i10) {
        int i11;
        if (z10) {
            i11 = ((i10 - i2) + 360) % 360;
        } else {
            i11 = (i10 + i2) % 360;
        }
        if (aj.g.O(2, aj.g.u0("CameraOrientationUtil"))) {
            StringBuilder j2 = kc.a.j("getRelativeImageRotation: destRotationDegrees=", i2, ", sourceRotationDegrees=", i10, ", isOppositeFacing=");
            j2.append(z10);
            j2.append(", result=");
            j2.append(i11);
            aj.g.o("CameraOrientationUtil", j2.toString());
        }
        return i11;
    }

    public static final int f0(m4.k kVar, Layout layout, a7.v vVar, int i2, RectF rectF, n4.d dVar, s0 s0Var, boolean z10) {
        boolean z11;
        m4.e[] eVarArr;
        sc.b bVar;
        float f8;
        float P;
        m4.e[] eVarArr2;
        int i10;
        int e6;
        float f10;
        float P2;
        int i11;
        int i12;
        int c4;
        float f11;
        float P3;
        Bidi createLineBidi;
        boolean z12;
        boolean z13;
        float a10;
        float a11;
        float f12;
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i13 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i13];
        Layout layout2 = kVar.f9221f;
        int lineStart2 = layout2.getLineStart(i2);
        int f13 = kVar.f(i2);
        if (i13 < (f13 - lineStart2) * 2) {
            r4.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        h4.f fVar = new h4.f(kVar);
        boolean z14 = false;
        if (layout2.getParagraphDirection(i2) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i14 = 0;
        while (lineStart2 < f13) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z11 && !isRtlCharAt) {
                a10 = fVar.a(lineStart2, z14, z14, true);
                f12 = fVar.a(lineStart2 + 1, true, true, true);
                z13 = z11;
            } else if (z11 && isRtlCharAt) {
                z13 = z11;
                f12 = fVar.a(lineStart2, false, false, false);
                a10 = fVar.a(lineStart2 + 1, true, true, false);
            } else {
                z13 = z11;
                if (isRtlCharAt) {
                    a11 = fVar.a(lineStart2, false, false, true);
                    a10 = fVar.a(lineStart2 + 1, true, true, true);
                } else {
                    a10 = fVar.a(lineStart2, false, false, false);
                    a11 = fVar.a(lineStart2 + 1, true, true, false);
                }
                f12 = a11;
            }
            fArr[i14] = a10;
            fArr[i14 + 1] = f12;
            i14 += 2;
            lineStart2++;
            z11 = z13;
            z14 = false;
        }
        Layout layout3 = (Layout) vVar.A;
        int lineStart3 = layout3.getLineStart(i2);
        int lineEnd2 = layout3.getLineEnd(i2);
        int q10 = vVar.q(lineStart3, false);
        int r5 = vVar.r(q10);
        int i15 = lineStart3 - r5;
        int i16 = lineEnd2 - r5;
        Bidi g10 = vVar.g(q10);
        if (g10 != null && (createLineBidi = g10.createLineBidi(i15, i16)) != null) {
            int runCount = createLineBidi.getRunCount();
            eVarArr = new m4.e[runCount];
            int i17 = 0;
            while (i17 < runCount) {
                int runStart = createLineBidi.getRunStart(i17) + lineStart3;
                int runLimit = createLineBidi.getRunLimit(i17) + lineStart3;
                int i18 = runCount;
                if (createLineBidi.getRunLevel(i17) % 2 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                eVarArr[i17] = new m4.e(runStart, z12, runLimit);
                i17++;
                runCount = i18;
            }
        } else {
            eVarArr = new m4.e[]{new m4.e(lineStart3, layout3.isRtlCharAt(lineStart3), lineEnd2)};
        }
        if (z10) {
            bVar = new sc.b(0, eVarArr.length - 1, 1);
        } else {
            bVar = new sc.b(eVarArr.length - 1, 0, -1);
        }
        int i19 = bVar.A;
        int i20 = bVar.B;
        int i21 = bVar.L;
        if ((i21 <= 0 || i19 > i20) && (i21 >= 0 || i20 > i19)) {
            return -1;
        }
        while (true) {
            m4.e eVar = eVarArr[i19];
            boolean z15 = eVar.f9204c;
            int i22 = eVar.f9202a;
            int i23 = eVar.f9203b;
            if (z15) {
                f8 = fArr[((i23 - 1) - lineStart) * 2];
            } else {
                f8 = fArr[(i22 - lineStart) * 2];
            }
            if (z15) {
                P = P(i22, lineStart, fArr);
            } else {
                P = P(i23 - 1, lineStart, fArr);
            }
            float f14 = rectF.left;
            int i24 = i21;
            if (z10) {
                if (P >= f14) {
                    float f15 = rectF.right;
                    if (f8 <= f15) {
                        if ((!z15 && f14 <= f8) || (z15 && f15 >= P)) {
                            i12 = i22;
                        } else {
                            int i25 = i23;
                            int i26 = i22;
                            while (true) {
                                i11 = i25;
                                if (i25 - i26 <= 1) {
                                    break;
                                }
                                int i27 = (i11 + i26) / 2;
                                float f16 = fArr[(i27 - lineStart) * 2];
                                if ((!z15 && f16 > rectF.left) || (z15 && f16 < rectF.right)) {
                                    i25 = i27;
                                } else {
                                    i25 = i11;
                                    i26 = i27;
                                }
                            }
                            if (z15) {
                                i12 = i11;
                            } else {
                                i12 = i26;
                            }
                        }
                        int e10 = dVar.e(i12);
                        if (e10 != -1 && (c4 = dVar.c(e10)) < i23) {
                            if (c4 >= i22) {
                                i22 = c4;
                            }
                            if (e10 > i23) {
                                e10 = i23;
                            }
                            eVarArr2 = eVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i28 = e10;
                            while (true) {
                                if (z15) {
                                    f11 = fArr[((i28 - 1) - lineStart) * 2];
                                } else {
                                    f11 = fArr[(i22 - lineStart) * 2];
                                }
                                rectF2.left = f11;
                                if (z15) {
                                    P3 = P(i22, lineStart, fArr);
                                } else {
                                    P3 = P(i28 - 1, lineStart, fArr);
                                }
                                rectF2.right = P3;
                                if (!((Boolean) s0Var.j(rectF2, rectF)).booleanValue()) {
                                    i22 = dVar.g(i22);
                                    if (i22 == -1 || i22 >= i23) {
                                        break;
                                    }
                                    i28 = dVar.e(i22);
                                    if (i28 > i23) {
                                        i28 = i23;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i22 = -1;
                        }
                    }
                }
                eVarArr2 = eVarArr;
                i22 = -1;
            } else {
                eVarArr2 = eVarArr;
                if (P >= f14) {
                    float f17 = rectF.right;
                    if (f8 <= f17) {
                        if ((!z15 && f17 >= P) || (z15 && f14 <= f8)) {
                            i10 = i23 - 1;
                        } else {
                            int i29 = i23;
                            int i30 = i22;
                            while (i29 - i30 > 1) {
                                int i31 = (i29 + i30) / 2;
                                float f18 = fArr[(i31 - lineStart) * 2];
                                int i32 = i29;
                                if ((!z15 && f18 > rectF.right) || (z15 && f18 < rectF.left)) {
                                    i29 = i31;
                                } else {
                                    i29 = i32;
                                    i30 = i31;
                                }
                            }
                            int i33 = i29;
                            if (z15) {
                                i10 = i33;
                            } else {
                                i10 = i30;
                            }
                        }
                        int c10 = dVar.c(i10 + 1);
                        if (c10 != -1 && (e6 = dVar.e(c10)) > i22) {
                            if (c10 < i22) {
                                c10 = i22;
                            }
                            if (e6 <= i23) {
                                i23 = e6;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i34 = c10;
                            while (true) {
                                if (z15) {
                                    f10 = fArr[((i23 - 1) - lineStart) * 2];
                                } else {
                                    f10 = fArr[(i34 - lineStart) * 2];
                                }
                                rectF3.left = f10;
                                if (z15) {
                                    P2 = P(i34, lineStart, fArr);
                                } else {
                                    P2 = P(i23 - 1, lineStart, fArr);
                                }
                                rectF3.right = P2;
                                if (!((Boolean) s0Var.j(rectF3, rectF)).booleanValue()) {
                                    i23 = dVar.h(i23);
                                    if (i23 == -1 || i23 <= i22) {
                                        break;
                                    }
                                    i34 = dVar.c(i23);
                                    if (i34 < i22) {
                                        i34 = i22;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i23 = -1;
                i22 = i23;
            }
            if (i22 >= 0) {
                return i22;
            }
            if (i19 == i20) {
                return -1;
            }
            i19 += i24;
            i21 = i24;
            eVarArr = eVarArr2;
        }
    }

    public static final w4.j g0(o0 o0Var, int i2) {
        n0 n0Var = o0Var.f8865a;
        l4.q qVar = o0Var.f8866b;
        if (n0Var.f8853a.B.length() != 0) {
            int d4 = qVar.d(i2);
            if ((i2 != 0 && d4 == qVar.d(i2 - 1)) || (i2 != n0Var.f8853a.B.length() && d4 == qVar.d(i2 + 1))) {
                return o0Var.a(i2);
            }
        }
        return o0Var.g(i2);
    }

    public static gk.a k0() {
        if (gk.a.L != null) {
            return gk.a.L;
        }
        synchronized (gk.a.class) {
            try {
                if (gk.a.L == null) {
                    gk.a.L = new gk.a(2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gk.a.L;
    }

    public static l0.e l0() {
        if (l0.e.L != null) {
            return l0.e.L;
        }
        synchronized (l0.e.class) {
            try {
                if (l0.e.L == null) {
                    l0.e.L = new l0.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l0.e.L;
    }

    public static l0.d p0() {
        if (l0.f.A != null) {
            return l0.f.A;
        }
        synchronized (l0.f.class) {
            try {
                if (l0.f.A == null) {
                    l0.f.A = new l0.d(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l0.f.A;
    }

    public static bd.h s(int i2, int i10, bd.a aVar) {
        if ((i10 & 1) != 0) {
            i2 = 0;
        }
        if ((i10 & 2) != 0) {
            aVar = bd.a.SUSPEND;
        }
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != Integer.MAX_VALUE) {
                        if (aVar == bd.a.SUSPEND) {
                            return new bd.h(i2);
                        }
                        return new bd.s(i2, aVar);
                    }
                    return new bd.h(Preference.DEFAULT_ORDER);
                } else if (aVar == bd.a.SUSPEND) {
                    return new bd.h(0);
                } else {
                    return new bd.s(1, aVar);
                }
            } else if (aVar == bd.a.SUSPEND) {
                return new bd.s(1, bd.a.DROP_OLDEST);
            } else {
                a0.j.h("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                return null;
            }
        } else if (aVar == bd.a.SUSPEND) {
            bd.l.f2189b.getClass();
            return new bd.h(bd.k.f2188b);
        } else {
            return new bd.s(1, aVar);
        }
    }

    public static final void t(final o1.a aVar, final b3.p pVar, o1.t tVar, final h1 h1Var, final l1.h hVar, final l1.f fVar, q0 q0Var, boolean z10, f1.i iVar, final mc.l lVar, n2.m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        final o1.t tVar2;
        final q0 q0Var2;
        final boolean z12;
        final f1.i iVar2;
        o1.t tVar3;
        f1.i a10;
        int i14;
        int i15;
        h1.l lVar2;
        boolean z13;
        boolean z14;
        l1.f fVar2;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-2072102870);
        if (rVar.f(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i2 | i10;
        if (rVar.f(pVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i16 | i11 | 128;
        if (rVar.f(h1Var)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i18 = i17 | i12 | 373317632;
        if (rVar.h(lVar)) {
            i13 = 4;
        } else {
            i13 = 2;
        }
        if ((306783379 & i18) == 306783378 && (i13 & 3) == 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (rVar.O(i18 & 1, z11)) {
            rVar.T();
            int i19 = i2 & 1;
            Object obj = n2.l.f9953a;
            if (i19 != 0 && !rVar.y()) {
                rVar.R();
                i14 = i18 & (-1908409217);
                tVar3 = tVar;
                z13 = z10;
                a10 = iVar;
                i15 = i13;
                lVar2 = q0Var;
            } else {
                o1.n nVar = o1.u.f10610a;
                Object[] objArr = new Object[0];
                a0 a0Var = o1.t.f10588w;
                boolean d4 = rVar.d(0) | rVar.d(0);
                Object L = rVar.L();
                if (d4 || L == obj) {
                    L = new v3(28);
                    rVar.h0(L);
                }
                tVar3 = (o1.t) y2.k.d(objArr, a0Var, (mc.a) L, rVar, 0);
                d1.t a11 = q2.a(rVar);
                boolean f8 = rVar.f(a11);
                Object L2 = rVar.L();
                if (f8 || L2 == obj) {
                    L2 = new h1.l(a11);
                    rVar.h0(L2);
                }
                a10 = m1.a(rVar);
                i14 = i18 & (-1908409217);
                i15 = i13;
                lVar2 = (h1.l) L2;
                z13 = true;
            }
            rVar.q();
            int i20 = (i14 & 14) | 48;
            if ((((i20 & 14) ^ 6) > 4 && rVar.f(aVar)) || (i20 & 6) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object L3 = rVar.L();
            if (!z14 && L3 != obj) {
                fVar2 = fVar;
            } else {
                fVar2 = fVar;
                L3 = new o1.c(new r0(20, aVar, fVar2));
                rVar.h0(L3);
            }
            tVar2 = tVar3;
            f1.i iVar3 = a10;
            k0.d.d(pVar, tVar2, (o1.c) L3, h1Var, lVar2, z13, iVar3, hVar, fVar2, lVar, rVar, (i14 & 7168) | ((i14 >> 3) & 14) | 196608 | 817913856, 6 | ((i15 << 3) & 112));
            iVar2 = iVar3;
            z12 = z13;
            q0Var2 = lVar2;
        } else {
            rVar.R();
            tVar2 = tVar;
            q0Var2 = q0Var;
            z12 = z10;
            iVar2 = iVar;
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(pVar, tVar2, h1Var, hVar, fVar, q0Var2, z12, iVar2, lVar, i2) { // from class: o1.e
                public final /* synthetic */ b3.p B;
                public final /* synthetic */ t L;
                public final /* synthetic */ h1 R;
                public final /* synthetic */ l1.h X;
                public final /* synthetic */ l1.f Y;
                public final /* synthetic */ q0 Z;

                /* renamed from: b0  reason: collision with root package name */
                public final /* synthetic */ boolean f10503b0;

                /* renamed from: c0  reason: collision with root package name */
                public final /* synthetic */ f1.i f10504c0;

                /* renamed from: d0  reason: collision with root package name */
                public final /* synthetic */ mc.l f10505d0;

                @Override // mc.p
                public final Object j(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int F = n2.s.F(1769473);
                    ij.a.t(a.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.f10503b0, this.f10504c0, this.f10505d0, (n2.m) obj2, F);
                    return y.f14813a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(boolean r40, final v2.c r41, n2.m r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.a.u(boolean, v2.c, n2.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jd.a u0(k0.g r5, tc.d r6, boolean r7) {
        /*
            nc.e r0 = nd.a1.h(r6)
            boolean r1 = r6.b()
            java.util.List r6 = r6.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = zb.m.G(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto Lae
            boolean r6 = r2.isEmpty()
            r3 = 0
            if (r6 == 0) goto L47
            boolean r6 = nd.a1.g(r0)
            if (r6 == 0) goto L31
            r5.getClass()
        L31:
            jb.c r6 = jd.j.f7814a
            if (r1 != 0) goto L40
            jb.c r6 = jd.j.f7814a
            jd.a r6 = r6.o(r0)
            if (r6 == 0) goto L3e
            goto L62
        L3e:
            r6 = r3
            goto L62
        L40:
            jb.c r6 = jd.j.f7815b
            jd.a r6 = r6.o(r0)
            goto L62
        L47:
            r5.getClass()
            jb.c r6 = jd.j.f7814a
            if (r1 != 0) goto L55
            jb.c r6 = jd.j.f7816c
            java.lang.Object r6 = r6.p(r0, r2)
            goto L5b
        L55:
            jb.c r6 = jd.j.f7817d
            java.lang.Object r6 = r6.p(r0, r2)
        L5b:
            boolean r4 = r6 instanceof yb.k
            if (r4 == 0) goto L60
            r6 = r3
        L60:
            jd.a r6 = (jd.a) r6
        L62:
            if (r6 == 0) goto L65
            return r6
        L65:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L83
            jd.a r6 = aj.g.a0(r0)
            if (r6 != 0) goto La3
            r5.getClass()
            boolean r5 = nd.a1.g(r0)
            if (r5 == 0) goto L81
            jd.d r5 = new jd.d
            r5.<init>(r0)
        L7f:
            r6 = r5
            goto La3
        L81:
            r6 = r3
            goto La3
        L83:
            java.util.ArrayList r5 = aj.g.b0(r5, r2, r7)
            if (r5 != 0) goto L8a
            goto Lad
        L8a:
            a2.n r6 = new a2.n
            r7 = 26
            r6.<init>(r7, r2)
            jd.a r6 = aj.g.V(r0, r5, r6)
            if (r6 != 0) goto La3
            boolean r5 = nd.a1.g(r0)
            if (r5 == 0) goto L81
            jd.d r5 = new jd.d
            r5.<init>(r0)
            goto L7f
        La3:
            if (r6 == 0) goto Lad
            if (r1 == 0) goto Lac
            jd.a r5 = a.a.C(r6)
            return r5
        Lac:
            return r6
        Lad:
            return r3
        Lae:
            java.lang.ClassCastException r5 = w.d.k(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.a.u0(k0.g, tc.d, boolean):jd.a");
    }

    public static final void v(boolean z10, mc.p pVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1818896922);
        if (rVar.g(z10)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(pVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) == 18 && rVar.A()) {
            rVar.R();
        } else {
            d0.d.E(z10, pVar, rVar, i13 & 126);
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new c7.a(z10, pVar, i2, 0);
        }
    }

    public static final z w(e0 e0Var) {
        e0Var.getClass();
        return new z(e0Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, fj.i0] */
    public static final fj.r w0(InputStream inputStream) {
        inputStream.getClass();
        return new fj.r(inputStream, new Object());
    }

    public static final fj.a0 x(g0 g0Var) {
        g0Var.getClass();
        return new fj.a0(g0Var);
    }

    public static int x0(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return 270;
                    }
                    a0.j.h(w.d.l(i2, "Unsupported surface rotation: "));
                    return 0;
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    public static final Object y0(a7.i iVar, nc.e eVar) {
        iVar.getClass();
        Bundle c4 = iVar.f576b0.c();
        if (c4 == null) {
            c4 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
        }
        Map c10 = iVar.B.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zb.v.E(c10.size()));
        for (Map.Entry entry : c10.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((a7.h) entry.getValue()).f571a);
        }
        return aj.g.Y(eVar).a(new e7.i(c4, linkedHashMap));
    }

    public abstract void A0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i10);

    public abstract int B(View view, int i2);

    public abstract int C(View view, int i2);

    public void E(ld.e eVar, int i2, boolean z10) {
        eVar.getClass();
        F(eVar, i2);
        l(z10);
    }

    public abstract void F(ld.e eVar, int i2);

    public md.d G(e1 e1Var, int i2) {
        e1Var.getClass();
        F(e1Var, i2);
        return d(e1Var.j(i2));
    }

    public void H(int i2, int i10, ld.e eVar) {
        eVar.getClass();
        F(eVar, i2);
        m(i10);
    }

    public void I(ld.e eVar, int i2, long j2) {
        eVar.getClass();
        F(eVar, i2);
        p(j2);
    }

    public void J(ld.e eVar, int i2, jd.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        F(eVar, i2);
        n(aVar, obj);
    }

    public void K(ld.e eVar, int i2, String str) {
        eVar.getClass();
        str.getClass();
        F(eVar, i2);
        r(str);
    }

    public void L(Object obj) {
        obj.getClass();
        throw new IllegalArgumentException("Non-serializable " + nc.u.a(obj.getClass()) + " is not supported by " + nc.u.a(getClass()) + " encoder");
    }

    public abstract int R();

    public abstract int S();

    public abstract int T();

    public abstract int U();

    public abstract int W(View view);

    public abstract int X(CoordinatorLayout coordinatorLayout);

    public abstract double Z(double d4);

    @Override // md.d
    public md.b a(ld.e eVar) {
        eVar.getClass();
        return this;
    }

    public abstract void a0(double d4, double[] dArr);

    @Override // md.b
    public void b(ld.e eVar) {
        eVar.getClass();
    }

    public abstract void b0(double d4, float[] fArr);

    @Override // md.d
    public abstract md.d d(ld.e eVar);

    public abstract int d0();

    @Override // md.d
    public void e(ld.e eVar, int i2) {
        eVar.getClass();
        L(Integer.valueOf(i2));
    }

    public abstract void e0(double d4, double[] dArr);

    @Override // md.b
    public void g(ld.e eVar, int i2, jd.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        F(eVar, i2);
        if (aVar.e().h()) {
            n(aVar, obj);
        } else if (obj == null) {
            f();
        } else {
            n(aVar, obj);
        }
    }

    public abstract double[] h0();

    @Override // md.d
    public void i(double d4) {
        L(Double.valueOf(d4));
    }

    public int i0(View view) {
        return 0;
    }

    @Override // md.d
    public void j(short s10) {
        L(Short.valueOf(s10));
    }

    public int j0() {
        return 0;
    }

    @Override // md.d
    public void k(byte b10) {
        L(Byte.valueOf(b10));
    }

    @Override // md.d
    public void l(boolean z10) {
        L(Boolean.valueOf(z10));
    }

    @Override // md.d
    public void m(int i2) {
        L(Integer.valueOf(i2));
    }

    public abstract boolean m0(float f8);

    public abstract boolean n0(View view);

    @Override // md.d
    public void o(float f8) {
        L(Float.valueOf(f8));
    }

    public abstract boolean o0(float f8, float f10);

    @Override // md.d
    public void p(long j2) {
        L(Long.valueOf(j2));
    }

    @Override // md.d
    public void q(char c4) {
        L(Character.valueOf(c4));
    }

    @Override // md.d
    public void r(String str) {
        str.getClass();
        L(str);
    }

    public abstract void r0(int i2);

    public abstract void s0(View view, int i2, int i10);

    public abstract void t0(View view, float f8, float f10);

    public abstract boolean v0(View view, float f8);

    public abstract int y(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float z(int i2);

    public abstract boolean z0(View view, int i2);

    public void q0(View view, int i2) {
    }
}
