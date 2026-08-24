package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jr4 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ nr4 B;

    public /* synthetic */ jr4(nr4 nr4Var, int i) {
        this.A = i;
        this.B = nr4Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int k;
        int k2;
        int j;
        int i = this.A;
        nr4 nr4Var = this.B;
        switch (i) {
            case 0:
                if (nr4Var.k.a()) {
                    k = nr4Var.r.h();
                } else {
                    k = nr4Var.k();
                }
                return Integer.valueOf(k);
            case 1:
                boolean a = nr4Var.k.a();
                ss4 ss4Var = nr4Var.q;
                if (!a) {
                    k2 = nr4Var.k();
                } else if (ss4Var.h() != -1) {
                    k2 = ss4Var.h();
                } else {
                    float abs = Math.abs(nr4Var.l());
                    qh1 qh1Var = nr4Var.n;
                    or4 or4Var = pr4.a;
                    if (abs >= Math.abs(Math.min(qh1Var.e0(56.0f), nr4Var.o() / 2.0f) / nr4Var.o())) {
                        boolean booleanValue = ((Boolean) nr4Var.D.getValue()).booleanValue();
                        int i2 = nr4Var.e;
                        if (booleanValue) {
                            k2 = i2 + 1;
                        } else {
                            k2 = i2;
                        }
                    } else {
                        k2 = nr4Var.k();
                    }
                }
                j = nr4Var.j(k2);
                break;
            default:
                j = nr4Var.n();
                break;
        }
        return Integer.valueOf(j);
    }
}
