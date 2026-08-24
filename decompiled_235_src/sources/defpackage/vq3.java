package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vq3  reason: default package */
/* loaded from: classes.dex */
public final class vq3 implements tq3 {
    public final ii1 a;
    public final /* synthetic */ pr3 b;
    public final /* synthetic */ boolean c;

    public vq3(pr3 pr3Var, boolean z) {
        this.b = pr3Var;
        this.c = z;
        this.a = np2.I(new sa1(pr3Var, 1));
    }

    @Override // defpackage.tq3
    public final int a() {
        long e;
        pr3 pr3Var = this.b;
        if (pr3Var.j().o == lo4.Vertical) {
            e = pr3Var.j().e() & 4294967295L;
        } else {
            e = pr3Var.j().e() >> 32;
        }
        return (int) e;
    }

    @Override // defpackage.tq3
    public final float b() {
        pr3 pr3Var = this.b;
        return (pr3Var.h() * 500) + pr3Var.i();
    }

    @Override // defpackage.tq3
    public final int c() {
        pr3 pr3Var = this.b;
        return (-pr3Var.j().l) + pr3Var.j().p;
    }

    @Override // defpackage.tq3
    public final float d() {
        pr3 pr3Var = this.b;
        int h = pr3Var.h();
        int i = pr3Var.i();
        if (pr3Var.c()) {
            return (h * 500) + i + 100.0f;
        }
        return (h * 500) + i;
    }

    @Override // defpackage.tq3
    public final bt0 e() {
        boolean z = this.c;
        ii1 ii1Var = this.a;
        if (z) {
            return new bt0(((Number) ii1Var.getValue()).intValue(), 1);
        }
        return new bt0(1, ((Number) ii1Var.getValue()).intValue());
    }

    @Override // defpackage.tq3
    public final Object f(int i, l7 l7Var) {
        Object l = pr3.l(this.b, i, l7Var);
        if (l == x61.COROUTINE_SUSPENDED) {
            return l;
        }
        return jg7.a;
    }
}
