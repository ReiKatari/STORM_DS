package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc6  reason: default package */
/* loaded from: classes.dex */
public final class jc6 implements Runnable {
    public final ku3 A;
    public final st3 B;
    public boolean L;

    public jc6(ku3 ku3Var, st3 st3Var) {
        ku3Var.getClass();
        st3Var.getClass();
        this.A = ku3Var;
        this.B = st3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.L) {
            this.A.f(this.B);
            this.L = true;
        }
    }
}
