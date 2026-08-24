package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz  reason: default package */
/* loaded from: classes.dex */
public final class rz extends z64 {
    public u57 k0;
    public final /* synthetic */ sz l0;

    public rz(sz szVar) {
        this.l0 = szVar;
    }

    @Override // defpackage.z64
    public final void J0() {
        sz szVar = this.l0;
        szVar.a = this;
        if (szVar.b != null) {
            R0();
        }
    }

    @Override // defpackage.z64
    public final void K0() {
        sz szVar = this.l0;
        if (szVar.a == this) {
            szVar.a = null;
        }
        u57 u57Var = this.k0;
        if (u57Var != null) {
            u57Var.b();
        }
        this.k0 = null;
    }

    public final void R0() {
        y yVar = new y(2, this, this.l0);
        sm3 f0 = nc1.f0(this);
        int i = f0.B;
        rf5 rectManager = ((te) vm3.a(f0)).getRectManager();
        v57 v57Var = rectManager.c;
        v57Var.getClass();
        p94 p94Var = v57Var.a;
        u57 u57Var = new u57(v57Var, i, this, yVar);
        Object b = p94Var.b(i);
        if (b == null) {
            p94Var.i(i, u57Var);
            b = u57Var;
        }
        u57 u57Var2 = (u57) b;
        if (u57Var2 != u57Var) {
            while (true) {
                u57 u57Var3 = u57Var2.d;
                if (u57Var3 == null) {
                    break;
                }
                u57Var2 = u57Var3;
            }
            u57Var2.d = u57Var;
        }
        if (nc1.f0(this.A).Z) {
            rectManager.b.k(i, true);
        }
        rectManager.e = true;
        rectManager.i();
        this.k0 = u57Var;
    }
}
