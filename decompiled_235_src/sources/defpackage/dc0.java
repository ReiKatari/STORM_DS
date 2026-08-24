package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc0  reason: default package */
/* loaded from: classes.dex */
public final class dc0 implements gi7 {
    public final ec0 a;
    public final kj7 b;
    public final ou0 c;
    public li7 d;

    public dc0(ec0 ec0Var, kj7 kj7Var, ou0 ou0Var) {
        this.a = ec0Var;
        this.b = kj7Var;
        this.c = ou0Var;
    }

    @Override // defpackage.gi7
    public final void b(li7 li7Var) {
        this.d = li7Var;
        if (li7Var != null) {
            ou0 ou0Var = this.c;
            ec0 ec0Var = this.a;
            ou0Var.b(ec0Var);
            ou0Var.a(ec0Var, this.b.e);
            ec0Var.a(li7Var, false);
        }
    }

    @Override // defpackage.gi7
    public final void reset() {
        ec0 ec0Var = this.a;
        synchronized (ec0Var.B) {
            try {
                tu0 tu0Var = ec0Var.R;
                if (tu0Var != null) {
                    ec0Var.R = null;
                    tu0Var.v0(new Exception("The camera control has became inactive."));
                }
                tu0 tu0Var2 = ec0Var.X;
                if (tu0Var2 != null) {
                    ec0Var.X = null;
                    tu0Var2.v0(new Exception("The camera control has became inactive."));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.b(this.a);
    }
}
