package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er3  reason: default package */
/* loaded from: classes.dex */
public final class er3 extends uj2 {
    public final ei h = new ei();

    public er3(qn2 qn2Var) {
        qn2Var.g(this);
    }

    public static void g0(er3 er3Var, String str, String str2, fo2 fo2Var, int i) {
        cr3 cr3Var = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        ei eiVar = er3Var.h;
        if (str != null) {
            cr3Var = new cr3(str, 0);
        }
        eiVar.a(1, new br3(cr3Var, new cr3(str2, 1), new zv0(-857469575, true, new dr3(fo2Var, 0))));
    }

    @Override // defpackage.uj2
    public final ei J() {
        return this.h;
    }

    public final void h0(int i, qn2 qn2Var, qn2 qn2Var2, zv0 zv0Var) {
        this.h.a(i, new br3(qn2Var, qn2Var2, zv0Var));
    }
}
