package o1;

import f1.f1;
import h1.n1;
import p1.a0;
import p1.u0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f10611a;

    public v(t tVar) {
        this.f10611a = tVar;
    }

    @Override // p1.u0
    public final int a() {
        long g10;
        t tVar = this.f10611a;
        if (tVar.g().f10557q == n1.Vertical) {
            g10 = tVar.g().g() & 4294967295L;
        } else {
            g10 = tVar.g().g() >> 32;
        }
        return (int) g10;
    }

    @Override // p1.u0
    public final float b() {
        t tVar = this.f10611a;
        return (tVar.f10592d.f9834b.g() * 500) + tVar.f10592d.f9835c.g();
    }

    @Override // p1.u0
    public final i4.c c() {
        return new i4.c(-1, -1);
    }

    @Override // p1.u0
    public final Object d(int i2, ai.f fVar) {
        a0 a0Var = t.f10588w;
        t tVar = this.f10611a;
        tVar.getClass();
        Object c4 = tVar.c(f1.Default, new a9.b(tVar, i2, null, 26), fVar);
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        y yVar = y.f14813a;
        if (c4 != aVar) {
            c4 = yVar;
        }
        if (c4 == aVar) {
            return c4;
        }
        return yVar;
    }

    @Override // p1.u0
    public final int e() {
        t tVar = this.f10611a;
        return (-tVar.g().f10554n) + tVar.g().f10558r;
    }

    @Override // p1.u0
    public final float f() {
        t tVar = this.f10611a;
        int g10 = tVar.f10592d.f9834b.g();
        int g11 = tVar.f10592d.f9835c.g();
        if (tVar.d()) {
            return (g10 * 500) + g11 + 100;
        }
        return (g10 * 500) + g11;
    }
}
