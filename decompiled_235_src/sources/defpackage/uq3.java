package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq3  reason: default package */
/* loaded from: classes.dex */
public final class uq3 implements tq3 {
    public final /* synthetic */ ue1 a;
    public final /* synthetic */ boolean b;

    public uq3(ue1 ue1Var, boolean z) {
        this.a = ue1Var;
        this.b = z;
    }

    @Override // defpackage.tq3
    public final int a() {
        long e;
        ue1 ue1Var = this.a;
        if (ue1Var.m().e == lo4.Vertical) {
            e = ue1Var.m().e() & 4294967295L;
        } else {
            e = ue1Var.m().e() >> 32;
        }
        return (int) e;
    }

    @Override // defpackage.tq3
    public final float b() {
        return (float) ii2.r(this.a);
    }

    @Override // defpackage.tq3
    public final int c() {
        ue1 ue1Var = this.a;
        return (-ue1Var.m().f) + ue1Var.m().d;
    }

    @Override // defpackage.tq3
    public final float d() {
        ue1 ue1Var = this.a;
        return (float) pr4.a(ue1Var.m(), ue1Var.n());
    }

    @Override // defpackage.tq3
    public final bt0 e() {
        boolean z = this.b;
        ue1 ue1Var = this.a;
        if (z) {
            return new bt0(ue1Var.n(), 1);
        }
        return new bt0(1, ue1Var.n());
    }

    @Override // defpackage.tq3
    public final Object f(int i, l7 l7Var) {
        ue1 ue1Var = this.a;
        Object d = ue1Var.d(xa4.Default, new l7(ue1Var, i, null, 3), l7Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        jg7 jg7Var = jg7.a;
        if (d != x61Var) {
            d = jg7Var;
        }
        if (d == x61Var) {
            return d;
        }
        return jg7Var;
    }
}
