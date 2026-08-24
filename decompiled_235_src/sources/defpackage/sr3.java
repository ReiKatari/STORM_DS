package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr3  reason: default package */
/* loaded from: classes.dex */
public final class sr3 implements tq3 {
    public final /* synthetic */ ip3 a;

    public sr3(ip3 ip3Var) {
        this.a = ip3Var;
    }

    @Override // defpackage.tq3
    public final int a() {
        long e;
        ip3 ip3Var = this.a;
        if (ip3Var.h().q == lo4.Vertical) {
            e = ip3Var.h().e() & 4294967295L;
        } else {
            e = ip3Var.h().e() >> 32;
        }
        return (int) e;
    }

    @Override // defpackage.tq3
    public final float b() {
        ip3 ip3Var = this.a;
        return (ip3Var.g() * 500) + ip3Var.d.c.h();
    }

    @Override // defpackage.tq3
    public final int c() {
        ip3 ip3Var = this.a;
        return (-ip3Var.h().n) + ip3Var.h().r;
    }

    @Override // defpackage.tq3
    public final float d() {
        ip3 ip3Var = this.a;
        int g = ip3Var.g();
        int h = ip3Var.d.c.h();
        if (ip3Var.c()) {
            return (g * 500) + h + 100.0f;
        }
        return (g * 500) + h;
    }

    @Override // defpackage.tq3
    public final bt0 e() {
        return new bt0(-1, -1);
    }

    @Override // defpackage.tq3
    public final Object f(int i, l7 l7Var) {
        Object j = ip3.j(this.a, i, l7Var);
        if (j == x61.COROUTINE_SUSPENDED) {
            return j;
        }
        return jg7.a;
    }
}
