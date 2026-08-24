package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu6  reason: default package */
/* loaded from: classes.dex */
public abstract class wu6 implements j36 {
    public final vm2 A;
    public final String B;
    public boolean L;

    public wu6(vm2 vm2Var, String str) {
        this.A = vm2Var;
        this.B = str;
    }

    public final void e() {
        if (!this.L) {
            return;
        }
        ii2.T(21, "statement is closed");
        throw null;
    }

    @Override // defpackage.j36
    public void g() {
        e();
    }

    @Override // defpackage.j36
    public void reset() {
        e();
    }
}
