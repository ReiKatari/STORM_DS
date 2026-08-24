package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr3  reason: default package */
/* loaded from: classes.dex */
public final class lr3 implements p76 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p76 b;
    public final /* synthetic */ f86 c;

    public /* synthetic */ lr3(p76 p76Var, f86 f86Var, int i) {
        this.a = i;
        this.c = f86Var;
        this.b = p76Var;
    }

    @Override // defpackage.p76
    public final float a(float f) {
        switch (this.a) {
            case 0:
                return this.b.a(f);
            default:
                return this.b.a(f);
        }
    }

    public final int b(int i) {
        Object obj;
        int i2 = this.a;
        f86 f86Var = this.c;
        switch (i2) {
            case 0:
                pr3 pr3Var = (pr3) f86Var;
                jr3 j = pr3Var.j();
                if (j.k.isEmpty()) {
                    return 0;
                }
                int h = pr3Var.h();
                if (i <= e() && h <= i) {
                    List list = j.k;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            obj = list.get(i3);
                            if (((kr3) obj).a != i) {
                                i3++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    kr3 kr3Var = (kr3) obj;
                    if (kr3Var == null) {
                        return 0;
                    }
                    return kr3Var.l;
                }
                return ((i - pr3Var.h()) * yh2.P(j)) - pr3Var.i();
            default:
                nr4 nr4Var = (nr4) f86Var;
                return (int) (gi2.s(ii2.r(nr4Var) + u24.E(((nr4Var.p() * (i - nr4Var.k())) - (nr4Var.l() * nr4Var.p())) + RecyclerView.B1), nr4Var.h, nr4Var.g) - ii2.r(nr4Var));
        }
    }

    public final int c() {
        int i = this.a;
        f86 f86Var = this.c;
        switch (i) {
            case 0:
                return ((pr3) f86Var).h();
            default:
                return ((nr4) f86Var).e;
        }
    }

    public final int d() {
        int i = this.a;
        f86 f86Var = this.c;
        switch (i) {
            case 0:
                return ((pr3) f86Var).i();
            default:
                return ((nr4) f86Var).f;
        }
    }

    public final int e() {
        int i = this.a;
        f86 f86Var = this.c;
        switch (i) {
            case 0:
                kr3 kr3Var = (kr3) gt0.R0(((pr3) f86Var).j().k);
                if (kr3Var != null) {
                    return kr3Var.a;
                }
                return 0;
            default:
                return ((i34) gt0.Q0(((nr4) f86Var).m().a)).a;
        }
    }

    public final void f(int i) {
        int i2 = this.a;
        f86 f86Var = this.c;
        switch (i2) {
            case 0:
                ((pr3) f86Var).m(i);
                return;
            default:
                nr4 nr4Var = (nr4) f86Var;
                float p = nr4Var.p();
                float f = RecyclerView.B1;
                if (p != RecyclerView.B1) {
                    f = RecyclerView.B1 / p;
                }
                nr4Var.t(f, i, true);
                return;
        }
    }
}
