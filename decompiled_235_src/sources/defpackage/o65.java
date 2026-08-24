package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o65  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o65 implements on2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ o65(n65 n65Var, boolean z, ah5 ah5Var, ah5 ah5Var2) {
        this.L = n65Var;
        this.B = z;
        this.R = ah5Var;
        this.X = ah5Var2;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj = this.X;
        Object obj2 = this.R;
        Object obj3 = this.L;
        boolean z = this.B;
        switch (i) {
            case 0:
                n65 n65Var = (n65) obj3;
                ah5 ah5Var = (ah5) obj2;
                ah5 ah5Var2 = (ah5) obj;
                boolean b = n65Var.b();
                w61 w61Var = n65Var.a;
                rs4 rs4Var = n65Var.h;
                if (b != z) {
                    n65Var.d.setValue(Boolean.valueOf(z));
                    rs4 rs4Var2 = n65Var.f;
                    float f = RecyclerView.B1;
                    rs4Var2.i(RecyclerView.B1);
                    if (z) {
                        f = rs4Var.h();
                    }
                    hv.L(w61Var, null, null, new qc(n65Var, f, null, 2), 3);
                }
                n65Var.g.i(ah5Var.A);
                float f2 = ah5Var2.A;
                if (rs4Var.h() != f2) {
                    rs4Var.i(f2);
                    if (n65Var.b()) {
                        hv.L(w61Var, null, null, new qc(n65Var, f2, null, 2), 3);
                    }
                }
                return jg7Var;
            default:
                zq7 zq7Var = (zq7) obj3;
                qr7 qr7Var = (qr7) obj2;
                hm4 hm4Var = (hm4) obj;
                if (z && zq7Var != null) {
                    qr7Var.g(zq7Var.a);
                } else {
                    qr7Var.e(hm4Var);
                }
                return jg7Var;
        }
    }

    public /* synthetic */ o65(boolean z, zq7 zq7Var, qr7 qr7Var, hm4 hm4Var) {
        this.B = z;
        this.L = zq7Var;
        this.R = qr7Var;
        this.X = hm4Var;
    }
}
