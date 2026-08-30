package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sk3  reason: default package */
/* loaded from: classes.dex */
public final class sk3 implements uj3 {
    public final /* synthetic */ ki3 a;

    public sk3(ki3 ki3Var) {
        this.a = ki3Var;
    }

    @Override // defpackage.uj3
    public final int a() {
        long g;
        ki3 ki3Var = this.a;
        if (ki3Var.h().q == jf4.Vertical) {
            g = ki3Var.h().g() & 4294967295L;
        } else {
            g = ki3Var.h().g() >> 32;
        }
        return (int) g;
    }

    @Override // defpackage.uj3
    public final float b() {
        ki3 ki3Var = this.a;
        return (ki3Var.g() * 500) + ki3Var.d.c.h();
    }

    @Override // defpackage.uj3
    public final oq0 c() {
        return new oq0(-1, -1);
    }

    @Override // defpackage.uj3
    public final int d() {
        ki3 ki3Var = this.a;
        return (-ki3Var.h().n) + ki3Var.h().r;
    }

    @Override // defpackage.uj3
    public final float e() {
        ki3 ki3Var = this.a;
        int g = ki3Var.g();
        int h = ki3Var.d.c.h();
        if (ki3Var.c()) {
            return (g * 500) + h + 100.0f;
        }
        return (g * 500) + h;
    }

    @Override // defpackage.uj3
    public final Object f(int i, k7 k7Var) {
        Object j = ki3.j(this.a, i, k7Var);
        if (j == p31.COROUTINE_SUSPENDED) {
            return j;
        }
        return o27.a;
    }
}
