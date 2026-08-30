package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ca6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ca6 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ mi2 X;

    public /* synthetic */ ca6(op0 op0Var, float f, mi2 mi2Var, ki2 ki2Var) {
        this.A = 2;
        this.L = op0Var;
        this.B = f;
        this.X = mi2Var;
        this.R = ki2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        float f;
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj2 = this.R;
        mi2 mi2Var = this.X;
        float f2 = this.B;
        Object obj3 = this.L;
        switch (i) {
            case 0:
                k75 k75Var = (k75) obj3;
                dw5 dw5Var = (dw5) obj2;
                go goVar = (go) obj;
                int i2 = (Math.abs(((Number) goVar.e.getValue()).floatValue()) > Math.abs(f2) ? 1 : (Math.abs(((Number) goVar.e.getValue()).floatValue()) == Math.abs(f2) ? 0 : -1));
                tj4 tj4Var = goVar.e;
                if (i2 >= 0) {
                    float s = sn2.s(((Number) tj4Var.getValue()).floatValue(), f2);
                    sn2.l(goVar, dw5Var, mi2Var, s - k75Var.A);
                    goVar.a();
                    k75Var.A = s;
                } else {
                    sn2.l(goVar, dw5Var, mi2Var, ((Number) tj4Var.getValue()).floatValue() - k75Var.A);
                    k75Var.A = ((Number) tj4Var.getValue()).floatValue();
                }
                return o27Var;
            case 1:
                k75 k75Var2 = (k75) obj3;
                dw5 dw5Var2 = (dw5) obj2;
                go goVar2 = (go) obj;
                float s2 = sn2.s(((Number) goVar2.e.getValue()).floatValue(), f2);
                float f3 = s2 - k75Var2.A;
                try {
                    f = dw5Var2.a(f3);
                } catch (CancellationException unused) {
                    goVar2.a();
                    f = RecyclerView.A1;
                }
                mi2Var.n(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || s2 != ((Number) goVar2.e.getValue()).floatValue()) {
                    goVar2.a();
                }
                k75Var2.A += f;
                return o27Var;
            default:
                op0 op0Var = (op0) obj3;
                ki2 ki2Var = (ki2) obj2;
                float l = io2.l(((Float) obj).floatValue(), op0Var.a, op0Var.b);
                if (l == f2) {
                    z = false;
                } else {
                    mi2Var.n(Float.valueOf(l));
                    z = true;
                    if (ki2Var != null) {
                        ki2Var.c();
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ ca6(float f, k75 k75Var, dw5 dw5Var, mi2 mi2Var, int i) {
        this.A = i;
        this.B = f;
        this.L = k75Var;
        this.R = dw5Var;
        this.X = mi2Var;
    }
}
