package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jl0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jl0 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pl0 B;
    public final /* synthetic */ ki2 L;
    public final /* synthetic */ ki2 R;

    public /* synthetic */ jl0(pl0 pl0Var, ki2 ki2Var, ki2 ki2Var2, int i) {
        this.A = i;
        this.B = pl0Var;
        this.L = ki2Var;
        this.R = ki2Var2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        ki2 ki2Var = this.R;
        ki2 ki2Var2 = this.L;
        pl0 pl0Var = this.B;
        boolean z2 = false;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z2)) {
                    s72 s72Var = o76.c;
                    long j = ((hr0) sk2Var.j(ir0.a)).j();
                    WeakHashMap weakHashMap = dg7.w;
                    ru5.b(hm1.n(sk2Var).l, s72Var, null, ct3.H0(790802855, new jl0(pl0Var, ki2Var2, ki2Var, 1), sk2Var), null, null, null, 0, false, null, RecyclerView.A1, 0L, 0L, 0L, j, 0L, ct3.H0(-913206642, new gl0(pl0Var, ki2Var, 1), sk2Var), sk2Var, 3120, 100663296, 196596);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    long j2 = ((hr0) sk2Var2.j(ir0.a)).j();
                    WeakHashMap weakHashMap2 = dg7.w;
                    up.b(ct3.H0(-2035792789, new fl0(pl0Var, 1), sk2Var2), new on3(hm1.n(sk2Var2).l, 15 | 16), null, ct3.H0(585222318, new sz(ki2Var2, 2, (byte) 0), sk2Var2), ct3.H0(1389562135, new i5(2, ki2Var), sk2Var2), j2, 0L, RecyclerView.A1, sk2Var2, 12610566, 68);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
