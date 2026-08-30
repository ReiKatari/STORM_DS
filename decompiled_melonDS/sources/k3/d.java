package k3;

import a4.n;
import a4.r0;
import i3.l;
import i3.o;
import java.util.ArrayList;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface d extends x4.c {
    static long A0(long j2, long j10) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L);
    }

    static /* synthetic */ void P(d dVar, long j2, long j10, float f8, int i2) {
        float f10;
        int i10;
        if ((i2 & 4) != 0) {
            j10 = A0(dVar.c(), 0L);
        }
        long j11 = j10;
        if ((i2 & 8) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f8;
        }
        if ((i2 & 64) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        dVar.f(j2, 0L, j11, f10, g.f7961a, i10);
    }

    static /* synthetic */ void T(d dVar, long j2, long j10, long j11, long j12, e eVar, float f8, int i2) {
        long j13;
        g gVar;
        float f10;
        if ((i2 & 2) != 0) {
            j13 = 0;
        } else {
            j13 = j10;
        }
        if ((i2 & 16) != 0) {
            gVar = g.f7961a;
        } else {
            gVar = eVar;
        }
        if ((i2 & 32) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f8;
        }
        dVar.H(j2, j13, j11, j12, gVar, f10);
    }

    static /* synthetic */ void X(d dVar, o oVar, long j2, long j10, float f8, e eVar, int i2) {
        long j11;
        float f10;
        g gVar;
        int i10;
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        long j12 = j2;
        if ((i2 & 4) != 0) {
            j11 = A0(dVar.c(), j12);
        } else {
            j11 = j10;
        }
        if ((i2 & 8) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f8;
        }
        if ((i2 & 16) != 0) {
            gVar = g.f7961a;
        } else {
            gVar = eVar;
        }
        if ((i2 & 64) != 0) {
            i10 = 3;
        } else {
            i10 = 6;
        }
        dVar.N(oVar, j12, j11, f10, gVar, i10);
    }

    static void e0(r0 r0Var, o oVar, long j2, long j10, long j11, e eVar, int i2) {
        long j12;
        g gVar;
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        long j13 = j2;
        if ((i2 & 4) != 0) {
            j12 = A0(r0Var.A.c(), j13);
        } else {
            j12 = j10;
        }
        if ((i2 & 32) != 0) {
            gVar = g.f7961a;
        } else {
            gVar = eVar;
        }
        r0Var.e(oVar, j13, j12, j11, 1.0f, gVar);
    }

    static void l0(d dVar, i3.f fVar, long j2, long j10, float f8, l lVar, int i2, int i10) {
        long j11;
        float f10;
        int i11;
        if ((i10 & 16) != 0) {
            j11 = j2;
        } else {
            j11 = j10;
        }
        if ((i10 & 32) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f8;
        }
        if ((i10 & 512) != 0) {
            i11 = 1;
        } else {
            i11 = i2;
        }
        dVar.i(fVar, 0L, j2, j11, f10, lVar, i11);
    }

    static /* synthetic */ void o0(d dVar, i3.h hVar, o oVar, float f8, h hVar2, int i2) {
        int i10;
        if ((i2 & 4) != 0) {
            f8 = 1.0f;
        }
        float f10 = f8;
        g gVar = hVar2;
        if ((i2 & 8) != 0) {
            gVar = g.f7961a;
        }
        e eVar = gVar;
        if ((i2 & 32) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        dVar.x(hVar, oVar, f10, eVar, i10);
    }

    static /* synthetic */ void p(d dVar, long j2, long j10, long j11, float f8, int i2, int i10) {
        int i11;
        if ((i10 & 16) != 0) {
            i11 = 0;
        } else {
            i11 = i2;
        }
        dVar.R(j2, j10, j11, f8, i11);
    }

    static /* synthetic */ void y(d dVar, long j2, float f8, long j10, e eVar, int i2) {
        if ((i2 & 4) != 0) {
            j10 = dVar.S();
        }
        long j11 = j10;
        if ((i2 & 16) != 0) {
            eVar = g.f7961a;
        }
        dVar.m(j2, f8, j11, eVar);
    }

    void A(long j2, float f8, float f10, long j10, long j11, e eVar);

    n E();

    void H(long j2, long j10, long j11, long j12, e eVar, float f8);

    void L(ArrayList arrayList, long j2, float f8);

    void N(o oVar, long j2, long j10, float f8, e eVar, int i2);

    void R(long j2, long j10, long j11, float f8, int i2);

    default long S() {
        return a.a.v(E().t());
    }

    void Y(i3.h hVar, long j2, e eVar);

    default long c() {
        return E().t();
    }

    void f(long j2, long j10, long j11, float f8, e eVar, int i2);

    m getLayoutDirection();

    void i(i3.f fVar, long j2, long j10, long j11, float f8, l lVar, int i2);

    void m(long j2, float f8, long j10, e eVar);

    void x(i3.h hVar, o oVar, float f8, e eVar, int i2);
}
