package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t27  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t27 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qh1 B;
    public final /* synthetic */ qa4 L;

    public /* synthetic */ t27(qh1 qh1Var, qa4 qa4Var, int i) {
        this.A = i;
        this.B = qh1Var;
        this.L = qa4Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        rx4 rx4Var;
        int i = this.A;
        qa4 qa4Var = this.L;
        qh1 qh1Var = this.B;
        switch (i) {
            case 0:
                mn0 mn0Var = new mn0(8, (on2) obj);
                t27 t27Var = new t27(qh1Var, qa4Var, 1);
                if (d04.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        rx4Var = rx4.b;
                    } else {
                        rx4Var = rx4.c;
                    }
                    if (d04.a()) {
                        return new a04(mn0Var, t27Var, rx4Var);
                    }
                    return x64.a;
                }
                fa6.h("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                sm1 sm1Var = (sm1) obj;
                int r0 = qh1Var.r0(sm1.b(sm1Var.a));
                qa4Var.setValue(new q93((qh1Var.r0(sm1.a(sm1Var.a)) & 4294967295L) | (r0 << 32)));
                return jg7.a;
        }
    }
}
