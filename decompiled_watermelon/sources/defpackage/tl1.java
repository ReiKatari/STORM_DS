package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tl1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tl1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;

    public /* synthetic */ tl1(int i, float f) {
        this.A = i;
        this.B = f;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        float f = this.B;
        switch (i) {
            case 0:
                rf5 rf5Var = (rf5) obj;
                rf5Var.getClass();
                rf5Var.t(rf5Var.j0.b() * 22.0f * (1.0f - f));
                rf5Var.c((f * 0.8f) + 0.2f);
                return o27Var;
            default:
                hk1 hk1Var = (hk1) obj;
                hk1Var.getClass();
                hk1.q(hk1Var, mh7.d(4278782477L), 0L, RecyclerView.A1, null, 126);
                if (f > RecyclerView.A1) {
                    float f2 = 0.55f * f;
                    hk1.y0(hk1Var, sn1.o(l07.c0(new xq0(xq0.b(f2, mh7.d(4281022546L))), new xq0(xq0.b(f2, mh7.d(4279309599L)))), RecyclerView.A1, RecyclerView.A1, 14), 0L, 0L, RecyclerView.A1, null, 126);
                    float C = hk1Var.C(3.0f);
                    float l = io2.l(hk1Var.C(1.0f) / C, RecyclerView.A1, 1.0f);
                    Float valueOf = Float.valueOf((float) RecyclerView.A1);
                    long j = xq0.b;
                    float f3 = f * 0.12f;
                    ti4 ti4Var = new ti4(valueOf, new xq0(xq0.b(f3, j)));
                    ti4 ti4Var2 = new ti4(Float.valueOf(l), new xq0(xq0.b(f3, j)));
                    Float valueOf2 = Float.valueOf(l);
                    long j2 = xq0.g;
                    hk1.y0(hk1Var, sn1.n(new ti4[]{ti4Var, ti4Var2, new ti4(valueOf2, new xq0(j2)), new ti4(Float.valueOf(1.0f), new xq0(j2))}, C), 0L, 0L, RecyclerView.A1, null, 126);
                }
                return o27Var;
        }
    }
}
