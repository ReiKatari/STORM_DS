package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lk3  reason: default package */
/* loaded from: classes.dex */
public final class lk3 implements dw5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw5 b;
    public final /* synthetic */ sw5 c;

    public /* synthetic */ lk3(dw5 dw5Var, sw5 sw5Var, int i) {
        this.a = i;
        this.c = sw5Var;
        this.b = dw5Var;
    }

    @Override // defpackage.dw5
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
        sw5 sw5Var = this.c;
        switch (i2) {
            case 0:
                pk3 pk3Var = (pk3) sw5Var;
                jk3 j = pk3Var.j();
                if (j.k.isEmpty()) {
                    return 0;
                }
                int h = pk3Var.h();
                if (i <= e() && h <= i) {
                    List list = j.k;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            obj = list.get(i3);
                            if (((kk3) obj).a != i) {
                                i3++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    kk3 kk3Var = (kk3) obj;
                    if (kk3Var == null) {
                        return 0;
                    }
                    return kk3Var.l;
                }
                return ((i - pk3Var.h()) * io2.v0(j)) - pk3Var.i();
            default:
                ki4 ki4Var = (ki4) sw5Var;
                return (int) (io2.o(oo2.A(ki4Var) + jv3.X(((ki4Var.p() * (i - ki4Var.k())) - (ki4Var.l() * ki4Var.p())) + RecyclerView.A1), ki4Var.h, ki4Var.g) - oo2.A(ki4Var));
        }
    }

    public final int c() {
        int i = this.a;
        sw5 sw5Var = this.c;
        switch (i) {
            case 0:
                return ((pk3) sw5Var).h();
            default:
                return ((ki4) sw5Var).e;
        }
    }

    public final int d() {
        int i = this.a;
        sw5 sw5Var = this.c;
        switch (i) {
            case 0:
                return ((pk3) sw5Var).i();
            default:
                return ((ki4) sw5Var).f;
        }
    }

    public final int e() {
        int i = this.a;
        sw5 sw5Var = this.c;
        switch (i) {
            case 0:
                kk3 kk3Var = (kk3) tq0.U0(((pk3) sw5Var).j().k);
                if (kk3Var != null) {
                    return kk3Var.a;
                }
                return 0;
            default:
                return ((xv3) tq0.T0(((ki4) sw5Var).m().a)).a;
        }
    }

    public final void f(int i) {
        int i2 = this.a;
        sw5 sw5Var = this.c;
        switch (i2) {
            case 0:
                ((pk3) sw5Var).m(i);
                return;
            default:
                ki4 ki4Var = (ki4) sw5Var;
                float p = ki4Var.p();
                float f = RecyclerView.A1;
                if (p != RecyclerView.A1) {
                    f = RecyclerView.A1 / p;
                }
                ki4Var.t(i, f, true);
                return;
        }
    }
}
