package c9;

import a4.f0;
import a4.m0;
import ai.y0;
import android.content.Context;
import android.os.Trace;
import b4.d2;
import b4.r0;
import n2.n1;
import n2.p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final l f2745a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final u f2746b = new Object();

    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final c9.n r21, final b3.p r22, final mc.l r23, final b3.d r24, final y3.o r25, final int r26, n2.m r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.m.a(c9.n, b3.p, mc.l, b3.d, y3.o, int, n2.m, int, int):void");
    }

    public static final void b(Object obj, b3.p pVar, n2.m mVar, int i2, int i10) {
        int i11;
        n2.r rVar = (n2.r) mVar;
        rVar.Y(1451072229);
        b3.h hVar = b3.c.X;
        if ((i10 & 512) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        b9.h d4 = d(v.f2765a, rVar);
        rVar.Y(2032051394);
        a(new n(obj, f2746b, d4), pVar, k.f2733m0, hVar, y3.n.f14709a, i11, rVar, 48 | (((((i2 << 3) & 7168) | 568) >> 3) & 896), 0);
        rVar.p(false);
        rVar.p(false);
    }

    public static final void c(b3.p pVar, k kVar, b3.d dVar, y3.o oVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(777774312);
        if ((i2 & 14) == 0) {
            if (rVar.f(pVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 112) == 0) {
            if (rVar.f(kVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        }
        if ((i2 & 896) == 0) {
            if (rVar.f(null)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i10 |= i16;
        }
        if ((i2 & 7168) == 0) {
            if (rVar.f(dVar)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i10 |= i15;
        }
        if ((57344 & i2) == 0) {
            if (rVar.f(oVar)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i10 |= i14;
        }
        if ((458752 & i2) == 0) {
            if (rVar.c(1.0f)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i10 |= i13;
        }
        if ((3670016 & i2) == 0) {
            if (rVar.f(null)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i10 |= i12;
        }
        if ((29360128 & i2) == 0) {
            if (rVar.g(true)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i10 |= i11;
        }
        if ((i10 & 23967451) == 4793490 && rVar.A()) {
            rVar.R();
        } else {
            n9.e eVar = w.f2767b;
            b3.p f8 = f3.g.c(pVar).f(new r(kVar, dVar, oVar));
            rVar.Y(544976794);
            int hashCode = Long.hashCode(rVar.T);
            b3.p c4 = b3.a.c(f8, rVar);
            v2.g l10 = rVar.l();
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.Y(1405779621);
            rVar.b0();
            if (rVar.S) {
                rVar.k(new m0(6, f0Var));
            } else {
                rVar.k0();
            }
            n2.s.C(b.f2725a, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.C(c4, a4.g.f213c, rVar);
            a4.f fVar = a4.g.f216f;
            if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode))) {
                w.d.w(hashCode, rVar, hashCode, fVar);
            }
            rVar.p(true);
            rVar.p(false);
            rVar.p(false);
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new y0(pVar, kVar, dVar, oVar, i2, 1);
        }
    }

    public static final b9.h d(n1 n1Var, n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        b9.h hVar = (b9.h) rVar.j(n1Var);
        if (hVar == null) {
            Context context = (Context) rVar.j(r0.f1937b);
            b9.h hVar2 = b9.a.f2112b;
            if (hVar2 == null) {
                synchronized (b9.a.f2111a) {
                    b9.h hVar3 = b9.a.f2112b;
                    if (hVar3 != null) {
                        return hVar3;
                    }
                    context.getApplicationContext();
                    b9.h h2 = new b9.e(context).h();
                    b9.a.f2112b = h2;
                    return h2;
                }
            }
            return hVar2;
        }
        return hVar;
    }

    public static final k e(Object obj, b9.h hVar, mc.l lVar, y3.o oVar, int i2, n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        rVar.Y(1645646697);
        rVar.Y(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            m9.j a10 = w.a(obj, rVar);
            h(a10);
            rVar.Y(1094691773);
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = new k(a10, hVar);
                rVar.h0(L);
            }
            k kVar = (k) L;
            rVar.p(false);
            kVar.f2738f0 = lVar;
            kVar.f2739g0 = oVar;
            kVar.f2740h0 = i2;
            kVar.f2741i0 = ((Boolean) rVar.j(d2.f1832a)).booleanValue();
            kVar.f2744l0.setValue(hVar);
            kVar.f2743k0.setValue(a10);
            kVar.a();
            rVar.p(false);
            Trace.endSection();
            rVar.p(false);
            return kVar;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static final k f(Object obj, n2.m mVar, int i2) {
        n2.r rVar = (n2.r) mVar;
        rVar.Y(236159766);
        k e6 = e(obj, d(v.f2765a, rVar), k.f2733m0, y3.n.f14709a, 1, rVar);
        rVar.p(false);
        return e6;
    }

    public static void g(String str) {
        String g10 = kc.a.g("If you wish to display this ", str, ", use androidx.compose.foundation.Image.");
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + g10);
    }

    public static final void h(m9.j jVar) {
        Object obj = jVar.f9404b;
        if (!(obj instanceof m9.h)) {
            if (!(obj instanceof i3.f)) {
                if (!(obj instanceof o3.f)) {
                    if (!(obj instanceof n3.b)) {
                        if (jVar.f9405c == null) {
                            return;
                        }
                        a0.j.h("request.target must be null.");
                        return;
                    }
                    g("Painter");
                    throw null;
                }
                g("ImageVector");
                throw null;
            }
            g("ImageBitmap");
            throw null;
        }
        a0.j.h("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
    }
}
