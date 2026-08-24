package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo7  reason: default package */
/* loaded from: classes.dex */
public final class uo7 implements go3 {
    public final ar0 A;
    public final on2 B;
    public final on2 L;
    public final on2 R;
    public qo7 X;

    public uo7(ar0 ar0Var, on2 on2Var, on2 on2Var2, on2 on2Var3) {
        this.A = ar0Var;
        this.B = on2Var;
        this.L = on2Var2;
        this.R = on2Var3;
    }

    @Override // defpackage.go3
    public final Object getValue() {
        qo7 qo7Var = this.X;
        if (qo7Var == null) {
            ap7 ap7Var = (ap7) this.B.c();
            yo7 yo7Var = (yo7) this.L.c();
            j71 j71Var = (j71) this.R.c();
            ap7Var.getClass();
            yo7Var.getClass();
            j71Var.getClass();
            eb ebVar = new eb(ap7Var, yo7Var, j71Var);
            ar0 ar0Var = this.A;
            String b = ar0Var.b();
            if (b != null) {
                qo7 G = ebVar.G(ar0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                this.X = G;
                return G;
            }
            i.h("Local and anonymous classes can not be ViewModels");
            return null;
        }
        return qo7Var;
    }
}
