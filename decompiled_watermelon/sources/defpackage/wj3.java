package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wj3  reason: default package */
/* loaded from: classes.dex */
public final class wj3 implements uj3 {
    public final ee1 a;
    public final /* synthetic */ pk3 b;
    public final /* synthetic */ boolean c;

    public wj3(pk3 pk3Var, boolean z) {
        this.b = pk3Var;
        this.c = z;
        this.a = me2.q(new d71(pk3Var, 1));
    }

    @Override // defpackage.uj3
    public final int a() {
        long g;
        pk3 pk3Var = this.b;
        if (pk3Var.j().o == jf4.Vertical) {
            g = pk3Var.j().g() & 4294967295L;
        } else {
            g = pk3Var.j().g() >> 32;
        }
        return (int) g;
    }

    @Override // defpackage.uj3
    public final float b() {
        pk3 pk3Var = this.b;
        return (pk3Var.h() * 500) + pk3Var.i();
    }

    @Override // defpackage.uj3
    public final oq0 c() {
        boolean z = this.c;
        ee1 ee1Var = this.a;
        if (z) {
            return new oq0(((Number) ee1Var.getValue()).intValue(), 1);
        }
        return new oq0(1, ((Number) ee1Var.getValue()).intValue());
    }

    @Override // defpackage.uj3
    public final int d() {
        pk3 pk3Var = this.b;
        return (-pk3Var.j().l) + pk3Var.j().p;
    }

    @Override // defpackage.uj3
    public final float e() {
        pk3 pk3Var = this.b;
        int h = pk3Var.h();
        int i = pk3Var.i();
        if (pk3Var.c()) {
            return (h * 500) + i + 100.0f;
        }
        return (h * 500) + i;
    }

    @Override // defpackage.uj3
    public final Object f(int i, k7 k7Var) {
        Object l = pk3.l(this.b, i, k7Var);
        if (l == p31.COROUTINE_SUSPENDED) {
            return l;
        }
        return o27.a;
    }
}
