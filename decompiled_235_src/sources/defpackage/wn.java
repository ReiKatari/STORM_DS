package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wn  reason: default package */
/* loaded from: classes.dex */
public final class wn extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ xn L;
    public final /* synthetic */ long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn(xn xnVar, long j, int i) {
        super(1);
        this.B = i;
        this.L = xnVar;
        this.R = j;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        rc2 rc2Var;
        int i = this.B;
        long j = 0;
        long j2 = this.R;
        xn xnVar = this.L;
        switch (i) {
            case 0:
                aa7 aa7Var = (aa7) obj;
                if (nb3.k(aa7Var.a(), xnVar.n0.a())) {
                    if (!q93.b(xnVar.o0, -9223372034707292160L)) {
                        j2 = xnVar.o0;
                    }
                } else {
                    pp6 pp6Var = (pp6) xnVar.n0.d.g(aa7Var.a());
                    if (pp6Var != null) {
                        j2 = ((q93) pp6Var.getValue()).a;
                    } else {
                        j2 = 0;
                    }
                }
                pp6 pp6Var2 = (pp6) xnVar.n0.d.g(aa7Var.c());
                if (pp6Var2 != null) {
                    j = ((q93) pp6Var2.getValue()).a;
                }
                gj6 gj6Var = (gj6) xnVar.m0.getValue();
                if (gj6Var == null || (rc2Var = (rc2) gj6Var.a.o(new q93(j2), new q93(j))) == null) {
                    return ge7.U(RecyclerView.B1, 400.0f, null, 5);
                }
                return rc2Var;
            default:
                if (nb3.k(obj, xnVar.n0.a())) {
                    if (q93.b(xnVar.o0, -9223372034707292160L)) {
                        j = j2;
                    } else {
                        j = xnVar.o0;
                    }
                } else {
                    pp6 pp6Var3 = (pp6) xnVar.n0.d.g(obj);
                    if (pp6Var3 != null) {
                        j = ((q93) pp6Var3.getValue()).a;
                    }
                }
                return new q93(j);
        }
    }
}
