package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pz  reason: default package */
/* loaded from: classes.dex */
public final class pz implements lj0 {
    public final oz[] A;

    public pz(oz[] ozVarArr) {
        this.A = ozVarArr;
    }

    public final void a() {
        for (oz ozVar : this.A) {
            il1 il1Var = ozVar.e0;
            if (il1Var != null) {
                il1Var.dispose();
            } else {
                nb3.a0("handle");
                throw null;
            }
        }
    }

    @Override // defpackage.lj0
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.A + ']';
    }
}
