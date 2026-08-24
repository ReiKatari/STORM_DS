package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p30 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ f47 B;

    public /* synthetic */ p30(f47 f47Var, int i) {
        this.A = i;
        this.B = f47Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        fp fpVar;
        z37 z37Var;
        int i = this.A;
        boolean z = false;
        f47 f47Var = this.B;
        switch (i) {
            case 0:
                if (f47Var != null) {
                    z = ((Boolean) new p30(f47Var, 2).c()).booleanValue();
                }
                return Boolean.valueOf(z);
            case 1:
                if (f47Var != null) {
                    z = ((Boolean) new p30(f47Var, 2).c()).booleanValue();
                }
                return Boolean.valueOf(z);
            default:
                fp fpVar2 = f47Var.b;
                a47 a47Var = (a47) f47Var.a.getValue();
                if (a47Var != null && (z37Var = a47Var.a) != null) {
                    fpVar = z37Var.a;
                } else {
                    fpVar = null;
                }
                return Boolean.valueOf(nb3.k(fpVar2, fpVar));
        }
    }
}
