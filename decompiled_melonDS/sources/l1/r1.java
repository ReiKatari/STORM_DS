package l1;

import g2.p5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f8613a = new e0(c0.Horizontal, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f8614b = new e0(c0.Vertical, 1.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f8615c;

    /* renamed from: d  reason: collision with root package name */
    public static final d2 f8616d;

    /* renamed from: e  reason: collision with root package name */
    public static final d2 f8617e;

    static {
        c0 c0Var = c0.Both;
        f8615c = new e0(c0Var, 1.0f);
        b3.h hVar = b3.c.X;
        f8616d = new d2(c0Var, new ai.s0(8, hVar), hVar);
        b3.h hVar2 = b3.c.A;
        f8617e = new d2(c0Var, new ai.s0(8, hVar2), hVar2);
    }

    public static final b3.p a(b3.p pVar, float f8, float f10) {
        return pVar.f(new w1(f8, f10));
    }

    public static final b3.p b(b3.p pVar, float f8) {
        e0 e0Var;
        if (f8 == 1.0f) {
            e0Var = f8613a;
        } else {
            e0Var = new e0(c0.Horizontal, f8);
        }
        return pVar.f(e0Var);
    }

    public static final b3.p c(b3.p pVar, float f8) {
        return pVar.f(new q1(0.0f, f8, 0.0f, f8, 5));
    }

    public static final b3.p d(b3.p pVar, float f8, float f10) {
        return pVar.f(new q1(0.0f, f8, 0.0f, f10, 5));
    }

    public static /* synthetic */ b3.p e(b3.p pVar, float f8, float f10, int i2) {
        if ((i2 & 1) != 0) {
            f8 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f10 = Float.NaN;
        }
        return d(pVar, f8, f10);
    }

    public static final b3.p f(b3.p pVar, float f8) {
        return pVar.f(new q1(f8, f8, f8, f8, false));
    }

    public static final b3.p g(b3.p pVar) {
        float f8 = p5.f5352f;
        float f10 = p5.f5353g;
        return pVar.f(new q1(f8, f10, f8, f10, false));
    }

    public static b3.p h(b3.p pVar, float f8, float f10, float f11, float f12, int i2) {
        float f13;
        float f14;
        float f15;
        if ((i2 & 2) != 0) {
            f13 = Float.NaN;
        } else {
            f13 = f10;
        }
        if ((i2 & 4) != 0) {
            f14 = Float.NaN;
        } else {
            f14 = f11;
        }
        if ((i2 & 8) != 0) {
            f15 = Float.NaN;
        } else {
            f15 = f12;
        }
        return pVar.f(new q1(f8, f13, f14, f15, false));
    }

    public static final b3.p i(b3.p pVar, float f8) {
        return pVar.f(new q1(f8, f8, f8, f8, true));
    }

    public static final b3.p j(b3.p pVar, float f8, float f10) {
        return pVar.f(new q1(f8, f10, f8, f10, true));
    }

    public static final b3.p k(b3.p pVar, float f8, float f10, float f11, float f12) {
        return pVar.f(new q1(f8, f10, f11, f12, true));
    }

    public static final b3.p l(b3.p pVar, float f8) {
        return pVar.f(new q1(f8, 0.0f, f8, 0.0f, 10));
    }

    public static b3.p m(b3.p pVar, float f8, float f10, int i2) {
        float f11;
        float f12;
        if ((i2 & 1) != 0) {
            f11 = Float.NaN;
        } else {
            f11 = f8;
        }
        if ((i2 & 2) != 0) {
            f12 = Float.NaN;
        } else {
            f12 = f10;
        }
        return pVar.f(new q1(f11, 0.0f, f12, 0.0f, 10));
    }

    public static b3.p n(b3.p pVar, b3.h hVar, int i2) {
        d2 d2Var;
        b3.h hVar2 = b3.c.X;
        if ((i2 & 1) != 0) {
            hVar = hVar2;
        }
        if (hVar.equals(hVar2)) {
            d2Var = f8616d;
        } else if (hVar.equals(b3.c.A)) {
            d2Var = f8617e;
        } else {
            d2Var = new d2(c0.Both, new ai.s0(8, hVar), hVar);
        }
        return pVar.f(d2Var);
    }
}
