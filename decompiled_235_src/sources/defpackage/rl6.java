package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rl6 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ ah5 L;
    public final /* synthetic */ p76 R;
    public final /* synthetic */ qn2 X;

    public /* synthetic */ rl6(float f, ah5 ah5Var, p76 p76Var, qn2 qn2Var, int i) {
        this.A = i;
        this.B = f;
        this.L = ah5Var;
        this.R = p76Var;
        this.X = qn2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        float f;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qn2 qn2Var = this.X;
        p76 p76Var = this.R;
        ah5 ah5Var = this.L;
        float f2 = this.B;
        so soVar = (so) obj;
        switch (i) {
            case 0:
                int i2 = (Math.abs(((Number) soVar.e.getValue()).floatValue()) > Math.abs(f2) ? 1 : (Math.abs(((Number) soVar.e.getValue()).floatValue()) == Math.abs(f2) ? 0 : -1));
                vs4 vs4Var = soVar.e;
                if (i2 >= 0) {
                    float v = kn2.v(((Number) vs4Var.getValue()).floatValue(), f2);
                    kn2.r(soVar, p76Var, qn2Var, v - ah5Var.A);
                    soVar.a();
                    ah5Var.A = v;
                } else {
                    kn2.r(soVar, p76Var, qn2Var, ((Number) vs4Var.getValue()).floatValue() - ah5Var.A);
                    ah5Var.A = ((Number) vs4Var.getValue()).floatValue();
                }
                return jg7Var;
            default:
                float v2 = kn2.v(((Number) soVar.e.getValue()).floatValue(), f2);
                float f3 = v2 - ah5Var.A;
                try {
                    f = p76Var.a(f3);
                } catch (CancellationException unused) {
                    soVar.a();
                    f = RecyclerView.B1;
                }
                qn2Var.g(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || v2 != ((Number) soVar.e.getValue()).floatValue()) {
                    soVar.a();
                }
                ah5Var.A += f;
                return jg7Var;
        }
    }
}
