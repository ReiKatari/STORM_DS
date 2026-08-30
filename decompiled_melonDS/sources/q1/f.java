package q1;

import f1.f1;
import h1.n1;
import p1.u0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f12129a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f12130b;

    public f(a0 a0Var, boolean z10) {
        this.f12129a = a0Var;
        this.f12130b = z10;
    }

    @Override // p1.u0
    public final int a() {
        long g10;
        a0 a0Var = this.f12129a;
        if (a0Var.m().f12177e == n1.Vertical) {
            g10 = a0Var.m().g() & 4294967295L;
        } else {
            g10 = a0Var.m().g() >> 32;
        }
        return (int) g10;
    }

    @Override // p1.u0
    public final float b() {
        return (float) p7.m.r(this.f12129a);
    }

    @Override // p1.u0
    public final i4.c c() {
        boolean z10 = this.f12130b;
        a0 a0Var = this.f12129a;
        if (z10) {
            return new i4.c(a0Var.n(), 1);
        }
        return new i4.c(1, a0Var.n());
    }

    @Override // p1.u0
    public final Object d(int i2, ai.f fVar) {
        a0 a0Var = this.f12129a;
        a0Var.getClass();
        Object c4 = a0Var.c(f1.Default, new ai.f(a0Var, i2, null, 3), fVar);
        if (c4 != dc.a.COROUTINE_SUSPENDED) {
            c4 = yb.y.f14813a;
        }
        if (c4 == dc.a.COROUTINE_SUSPENDED) {
            return c4;
        }
        return yb.y.f14813a;
    }

    @Override // p1.u0
    public final int e() {
        a0 a0Var = this.f12129a;
        return (-a0Var.m().f12178f) + a0Var.m().f12176d;
    }

    @Override // p1.u0
    public final float f() {
        a0 a0Var = this.f12129a;
        return (float) d0.a(a0Var.m(), a0Var.n());
    }
}
