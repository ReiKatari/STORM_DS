package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo3  reason: default package */
/* loaded from: classes.dex */
public final class oo3 extends uj2 {
    public static final lw0 k = new lw0(29, (byte) 0);
    public final dp3 h = new dp3(this);
    public final ei i = new ei();
    public boolean j;

    public oo3(qn2 qn2Var) {
        qn2Var.g(this);
    }

    public static void g0(oo3 oo3Var, String str, gn5 gn5Var, zv0 zv0Var, int i) {
        eo2 eo2Var;
        if ((i & 2) != 0) {
            gn5Var = null;
        }
        ei eiVar = oo3Var.i;
        cr3 cr3Var = new cr3(str, 0);
        if (gn5Var != null) {
            eo2Var = new no3(0, gn5Var);
        } else {
            eo2Var = k;
        }
        eiVar.a(1, new mo3(cr3Var, eo2Var, new v83(11), new zv0(-291643851, true, new fj(zv0Var, 4))));
        if (gn5Var != null) {
            oo3Var.j = true;
        }
    }

    @Override // defpackage.uj2
    public final ei J() {
        return this.i;
    }

    public final void h0(int i, qn2 qn2Var, qn2 qn2Var2, zv0 zv0Var) {
        this.i.a(i, new mo3(qn2Var, k, qn2Var2, zv0Var));
    }
}
