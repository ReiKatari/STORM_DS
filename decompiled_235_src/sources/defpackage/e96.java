package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e96  reason: default package */
/* loaded from: classes.dex */
public final class e96 implements qn2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ bs0 B;
    public final /* synthetic */ rs4 L;

    public e96(float f, bs0 bs0Var, rs4 rs4Var) {
        this.A = f;
        this.B = bs0Var;
        this.L = rs4Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        KeyEvent keyEvent = ((wg3) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (xk2.u(keyEvent) == 2) {
            long e = qo2.e(keyEvent.getKeyCode());
            boolean a = kg3.a(e, kg3.j);
            bs0 bs0Var = this.B;
            float f = this.A;
            rs4 rs4Var = this.L;
            if (!a && !kg3.a(e, kg3.f)) {
                if (kg3.a(e, kg3.i) || kg3.a(e, kg3.g)) {
                    float h = rs4Var.h() + f;
                    float f2 = bs0Var.b;
                    if (h > f2) {
                        h = f2;
                    }
                    rs4Var.i(h);
                }
            } else {
                float h2 = rs4Var.h() - f;
                float f3 = bs0Var.a;
                if (h2 < f3) {
                    h2 = f3;
                }
                rs4Var.i(h2);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
