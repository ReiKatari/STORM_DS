package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz  reason: default package */
/* loaded from: classes.dex */
public final class sz extends e74 {
    public rz a;
    public tu0 b;

    @Override // defpackage.e74
    public final z64 e() {
        return new rz(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final /* bridge */ /* synthetic */ void g(z64 z64Var) {
        rz rzVar = (rz) z64Var;
    }

    public final Object h(s41 s41Var) {
        tu0 tu0Var = this.b;
        if (tu0Var == null) {
            tu0Var = new tu0();
            this.b = tu0Var;
            rz rzVar = this.a;
            if (rzVar != null && rzVar.j0) {
                rzVar.R0();
            }
        }
        Object q = tu0Var.q(s41Var);
        if (q == x61.COROUTINE_SUSPENDED) {
            return q;
        }
        return jg7.a;
    }

    public final int hashCode() {
        return 234;
    }
}
