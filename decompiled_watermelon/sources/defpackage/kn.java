package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kn  reason: default package */
/* loaded from: classes.dex */
public final class kn extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ ln L;
    public final /* synthetic */ long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn(ln lnVar, long j, int i) {
        super(1);
        this.B = i;
        this.L = lnVar;
        this.R = j;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        y72 y72Var;
        int i = this.B;
        long j = 0;
        long j2 = this.R;
        ln lnVar = this.L;
        switch (i) {
            case 0:
                ex6 ex6Var = (ex6) obj;
                if (b53.x(ex6Var.a(), lnVar.m0.a())) {
                    if (!i33.b(lnVar.n0, -9223372034707292160L)) {
                        j2 = lnVar.n0;
                    }
                } else {
                    ae6 ae6Var = (ae6) lnVar.m0.d.g(ex6Var.a());
                    if (ae6Var != null) {
                        j2 = ((i33) ae6Var.getValue()).a;
                    } else {
                        j2 = 0;
                    }
                }
                ae6 ae6Var2 = (ae6) lnVar.m0.d.g(ex6Var.c());
                if (ae6Var2 != null) {
                    j = ((i33) ae6Var2.getValue()).a;
                }
                r76 r76Var = (r76) lnVar.l0.getValue();
                if (r76Var == null || (y72Var = (y72) r76Var.a.j(new i33(j2), new i33(j))) == null) {
                    return ct3.P0(RecyclerView.A1, 400.0f, null, 5);
                }
                return y72Var;
            default:
                if (b53.x(obj, lnVar.m0.a())) {
                    if (i33.b(lnVar.n0, -9223372034707292160L)) {
                        j = j2;
                    } else {
                        j = lnVar.n0;
                    }
                } else {
                    ae6 ae6Var3 = (ae6) lnVar.m0.d.g(obj);
                    if (ae6Var3 != null) {
                        j = ((i33) ae6Var3.getValue()).a;
                    }
                }
                return new i33(j);
        }
    }
}
