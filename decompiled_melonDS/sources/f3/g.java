package f3;

import b3.p;
import i3.a0;
import i3.n0;
import i3.z;
import y3.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {
    public static final p a(p pVar, float f8) {
        if (f8 == 1.0f) {
            return pVar;
        }
        return z.o(pVar, f8, 0.0f, null, 520187);
    }

    public static final p b(p pVar, n0 n0Var) {
        return z.o(pVar, 0.0f, 0.0f, n0Var, 518143);
    }

    public static final p c(p pVar) {
        return z.o(pVar, 0.0f, 0.0f, null, 520191);
    }

    public static final p d(p pVar, mc.l lVar) {
        return pVar.f(new e(lVar));
    }

    public static final p e(p pVar, mc.l lVar) {
        return pVar.f(new h(lVar));
    }

    public static final p f(p pVar, mc.l lVar) {
        return pVar.f(new i(lVar));
    }

    public static p g(p pVar, n3.b bVar, b3.d dVar, o oVar, float f8, i3.l lVar, int i2) {
        if ((i2 & 4) != 0) {
            dVar = b3.c.X;
        }
        b3.d dVar2 = dVar;
        if ((i2 & 16) != 0) {
            f8 = 1.0f;
        }
        return pVar.f(new l(bVar, dVar2, oVar, f8, lVar));
    }

    public static p h(p pVar, float f8, n0 n0Var, long j2, int i2) {
        boolean z10;
        long j10;
        boolean z11;
        if ((i2 & 4) != 0) {
            if (x4.f.a(f8, 0) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        long j11 = a0.f6614a;
        if ((i2 & 16) != 0) {
            j10 = j11;
        } else {
            j10 = j2;
        }
        if (x4.f.a(f8, 0) <= 0 && !z10) {
            return pVar;
        }
        return pVar.f(new n(f8, n0Var, z10, j11, j10));
    }
}
