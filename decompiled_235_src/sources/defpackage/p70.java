package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p70  reason: default package */
/* loaded from: classes.dex */
public final class p70 {
    public final ua4 a;

    public p70(int i) {
        switch (i) {
            case 1:
                this.a = new ua4(new np3[16]);
                return;
            default:
                this.a = new ua4(new l31[16]);
                return;
        }
    }

    public void a(CancellationException cancellationException) {
        ua4 ua4Var = this.a;
        int i = ua4Var.L;
        qj0[] qj0VarArr = new qj0[i];
        for (int i2 = 0; i2 < i; i2++) {
            qj0VarArr[i2] = ((l31) ua4Var.A[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            qj0VarArr[i3].w(cancellationException);
        }
        if (ua4Var.L == 0) {
            return;
        }
        s53.c("uncancelled requests present");
    }

    public void b() {
        ua4 ua4Var = this.a;
        l93 R = gi2.R(0, ua4Var.L);
        int i = R.A;
        int i2 = R.B;
        if (i <= i2) {
            while (true) {
                ((l31) ua4Var.A[i]).b.i(jg7.a);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        ua4Var.g();
    }
}
