package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y62  reason: default package */
/* loaded from: classes.dex */
public final class y62 extends yc7 {
    public volatile yc7 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ su2 d;
    public final /* synthetic */ ie7 e;
    public final /* synthetic */ z62 f;

    public y62(z62 z62Var, boolean z, boolean z2, su2 su2Var, ie7 ie7Var) {
        this.f = z62Var;
        this.b = z;
        this.c = z2;
        this.d = su2Var;
        this.e = ie7Var;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (this.b) {
            hf3Var.u0();
            return null;
        }
        yc7 yc7Var = this.a;
        if (yc7Var == null) {
            yc7Var = this.d.e(this.f, this.e);
            this.a = yc7Var;
        }
        return yc7Var.b(hf3Var);
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        if (this.c) {
            vf3Var.A();
            return;
        }
        yc7 yc7Var = this.a;
        if (yc7Var == null) {
            yc7Var = this.d.e(this.f, this.e);
            this.a = yc7Var;
        }
        yc7Var.c(vf3Var, obj);
    }
}
