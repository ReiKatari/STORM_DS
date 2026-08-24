package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv5  reason: default package */
/* loaded from: classes.dex */
public final class uv5 implements qn2 {
    public final /* synthetic */ ue1 A;
    public final /* synthetic */ qn2 B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ pq5 R;

    public uv5(ue1 ue1Var, qn2 qn2Var, qn2 qn2Var2, pq5 pq5Var) {
        this.A = ue1Var;
        this.B = qn2Var;
        this.L = qn2Var2;
        this.R = pq5Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        KeyEvent keyEvent = ((wg3) obj).a;
        keyEvent.getClass();
        if (keyEvent.getAction() == 0) {
            long e = qo2.e(keyEvent.getKeyCode());
            boolean a = kg3.a(e, kg3.I);
            qn2 qn2Var = this.B;
            ue1 ue1Var = this.A;
            if (a) {
                if (ue1Var.k() > 0) {
                    qn2Var.g(((u52) vv5.getEntries()).get(ue1Var.k() - 1));
                    return Boolean.TRUE;
                }
            } else if (kg3.a(e, kg3.J)) {
                if (ue1Var.k() < hf.U(vv5.getEntries())) {
                    qn2Var.g(((u52) vv5.getEntries()).get(ue1Var.k() + 1));
                    return Boolean.TRUE;
                }
            } else if (kg3.a(e, kg3.M)) {
                this.L.g(this.R);
            }
        }
        return Boolean.FALSE;
    }
}
