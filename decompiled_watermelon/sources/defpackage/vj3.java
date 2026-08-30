package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vj3  reason: default package */
/* loaded from: classes.dex */
public final class vj3 implements uj3 {
    public final /* synthetic */ ya1 a;
    public final /* synthetic */ boolean b;

    public vj3(ya1 ya1Var, boolean z) {
        this.a = ya1Var;
        this.b = z;
    }

    @Override // defpackage.uj3
    public final int a() {
        long g;
        ya1 ya1Var = this.a;
        if (ya1Var.m().e == jf4.Vertical) {
            g = ya1Var.m().g() & 4294967295L;
        } else {
            g = ya1Var.m().g() >> 32;
        }
        return (int) g;
    }

    @Override // defpackage.uj3
    public final float b() {
        return (float) oo2.A(this.a);
    }

    @Override // defpackage.uj3
    public final oq0 c() {
        boolean z = this.b;
        ya1 ya1Var = this.a;
        if (z) {
            return new oq0(ya1Var.n(), 1);
        }
        return new oq0(1, ya1Var.n());
    }

    @Override // defpackage.uj3
    public final int d() {
        ya1 ya1Var = this.a;
        return (-ya1Var.m().f) + ya1Var.m().d;
    }

    @Override // defpackage.uj3
    public final float e() {
        ya1 ya1Var = this.a;
        return (float) ni4.a(ya1Var.m(), ya1Var.n());
    }

    @Override // defpackage.uj3
    public final Object f(int i, k7 k7Var) {
        ya1 ya1Var = this.a;
        Object e = ya1Var.e(r24.Default, new k7(ya1Var, i, null, 3), k7Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        o27 o27Var = o27.a;
        if (e != p31Var) {
            e = o27Var;
        }
        if (e == p31Var) {
            return e;
        }
        return o27Var;
    }
}
