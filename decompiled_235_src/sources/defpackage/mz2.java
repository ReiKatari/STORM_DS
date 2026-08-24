package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mz2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mz2 implements on2 {
    public final /* synthetic */ int A = 2;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ mz2(int i, ls0 ls0Var) {
        this.L = ls0Var;
        this.B = i;
    }

    @Override // defpackage.on2
    public final Object c() {
        switch (this.A) {
            case 0:
                qz2 qz2Var = (qz2) this.L;
                int i = this.B;
                qz2Var.g0.getClass();
                synchronized (qz2Var) {
                    qz2Var.u0.remove(Integer.valueOf(i));
                }
                return jg7.a;
            case 1:
                return new ue1(this.B, RecyclerView.B1, (on2) this.L);
            default:
                return Integer.valueOf(((a47) ((ls0) this.L).e).b.d(this.B));
        }
    }

    public /* synthetic */ mz2(int i, on2 on2Var) {
        this.B = i;
        this.L = on2Var;
    }

    public /* synthetic */ mz2(qz2 qz2Var, int i, a62 a62Var) {
        this.L = qz2Var;
        this.B = i;
    }
}
