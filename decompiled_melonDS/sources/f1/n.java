package f1;

import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import g2.k3;
import h1.j2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n {
    public static final void a(b3.p pVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-932836462);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(lVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            l1.c.d(f3.g.d(pVar, lVar), rVar);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r(pVar, lVar, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final n3.b r16, final b3.p r17, b3.d r18, y3.o r19, float r20, n2.m r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.n.b(n3.b, b3.p, b3.d, y3.o, float, n2.m, int, int):void");
    }

    public static final void c(i3.f fVar, b3.p pVar, int i2, n2.m mVar) {
        b3.h hVar = b3.c.X;
        n2.r rVar = (n2.r) mVar;
        boolean f8 = rVar.f(fVar);
        Object L = rVar.L();
        if (f8 || L == n2.l.f9953a) {
            L = pc.a.e(fVar, i2);
            rVar.h0(L);
        }
        b((n3.a) L, pVar, hVar, y3.n.f14709a, 1.0f, rVar, 56, 0);
    }

    public static float d(EdgeEffect edgeEffect, float f8, float f10, x4.c cVar) {
        float f11;
        float f12 = h0.f4563a;
        double b10 = h0.f4563a * cVar.b() * 386.0878f * 160.0f * 0.84f;
        float exp = (float) (Math.exp((h0.f4564b / h0.f4565c) * Math.log((Math.abs(f8) * 0.35f) / b10)) * b10);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f11 = l.b(edgeEffect);
        } else {
            f11 = 0.0f;
        }
        if (exp > f11 * f10) {
            return 0.0f;
        }
        int M = pc.a.M(f8);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(M);
            return f8;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(M);
        }
        return f8;
    }

    public static b3.p e(i3.d0 d0Var) {
        return new m(0L, d0Var, i3.z.f6703b, 1);
    }

    public static final b3.p f(b3.p pVar, long j2, i3.n0 n0Var) {
        return pVar.f(new m(j2, null, n0Var, 2));
    }

    public static final void g(long j2, h1.n1 n1Var) {
        if (n1Var == h1.n1.Vertical) {
            if (x4.a.g(j2) == Integer.MAX_VALUE) {
                k1.b.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (x4.a.h(j2) != Integer.MAX_VALUE) {
        } else {
            k1.b.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static b3.p h(b3.p pVar, j1.i iVar, k3 k3Var, boolean z10, i4.i iVar2, mc.a aVar, int i2) {
        b3.p a10;
        if ((i2 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i2 & 16) != 0) {
            iVar2 = null;
        }
        i4.i iVar3 = iVar2;
        if (k3Var != null) {
            a10 = new w(iVar, k3Var, false, z11, null, iVar3, aVar);
        } else if (k3Var == null) {
            a10 = new w(iVar, null, false, z11, null, iVar3, aVar);
        } else {
            b3.m mVar = b3.m.f1770a;
            if (iVar != null) {
                a10 = x0.a(mVar, iVar, k3Var).f(new w(iVar, null, false, z11, null, iVar3, aVar));
            } else {
                a10 = b3.a.a(mVar, new x(k3Var, z11, iVar3, aVar));
            }
        }
        return pVar.f(a10);
    }

    public static b3.p i(b3.p pVar, boolean z10, String str, mc.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i2 & 2) != 0) {
            str = null;
        }
        return pVar.f(new w(null, null, true, z11, str, null, aVar));
    }

    public static b3.p j(b3.p pVar, j1.i iVar, mc.a aVar) {
        return pVar.f(new b0(iVar, aVar));
    }

    public static final b3.p k(b3.p pVar, boolean z10, j1.i iVar) {
        b3.p pVar2;
        if (z10) {
            pVar2 = new j0(iVar);
        } else {
            pVar2 = b3.m.f1770a;
        }
        return pVar.f(pVar2);
    }

    public static /* synthetic */ b3.p l(b3.p pVar, boolean z10, j1.i iVar, int i2) {
        if ((i2 & 1) != 0) {
            z10 = true;
        }
        if ((i2 & 2) != 0) {
            iVar = null;
        }
        return k(pVar, z10, iVar);
    }

    public static b3.p m(b3.p pVar, j1.i iVar) {
        return pVar.f(new q0(iVar));
    }

    public static final boolean n(KeyEvent keyEvent) {
        long b10 = t3.c.b(keyEvent);
        int i2 = t3.a.N;
        if (!t3.a.a(b10, t3.a.f13089h) && !t3.a.a(b10, t3.a.f13100t) && !t3.a.a(b10, t3.a.M) && !t3.a.a(b10, t3.a.f13099s)) {
            return false;
        }
        return true;
    }

    public static final w1 o(n2.m mVar) {
        Object[] objArr = new Object[0];
        boolean d4 = ((n2.r) mVar).d(0);
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        if (d4 || L == n2.l.f9953a) {
            L = new a3.g(19);
            rVar.h0(L);
        }
        return (w1) y2.k.d(objArr, w1.f4668j, (mc.a) L, rVar, 0);
    }

    public static final b3.p p(b3.p pVar, j2 j2Var, h1.n1 n1Var, i iVar, boolean z10, h1.q0 q0Var, j1.i iVar2, q1.j jVar) {
        b3.p b10;
        float f8 = a0.f4519a;
        h1.n1 n1Var2 = h1.n1.Vertical;
        b3.m mVar = b3.m.f1770a;
        if (n1Var == n1Var2) {
            b10 = f3.g.b(mVar, p0.f4638c);
        } else {
            b10 = f3.g.b(mVar, p0.f4637b);
        }
        return pVar.f(b10).f(new x1(iVar, jVar, q0Var, n1Var, j2Var, iVar2, z10, false));
    }

    public static final long q(long j2, float f8) {
        return (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f8)) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f8)) & 4294967295L);
    }

    public static b3.p r(b3.p pVar, w1 w1Var) {
        h1.n1 n1Var = h1.n1.Vertical;
        j1.i iVar = w1Var.f4672d;
        float f8 = a0.f4519a;
        return pVar.f(f3.g.b(b3.m.f1770a, p0.f4638c)).f(new x1(null, null, null, n1Var, w1Var, iVar, true, true)).f(new z1(w1Var));
    }
}
