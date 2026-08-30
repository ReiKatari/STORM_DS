package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ph5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ph5 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ Map R;
    public final /* synthetic */ int X;
    public final /* synthetic */ mi2 Y;

    public /* synthetic */ ph5(ArrayList arrayList, mi2 mi2Var, Map map, int i, mi2 mi2Var2, int i2) {
        this.A = i2;
        this.B = arrayList;
        this.L = mi2Var;
        this.R = map;
        this.X = i;
        this.Y = mi2Var2;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z2 = false;
        int i2 = 0;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((th3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z2)) {
                    wg7.a(b53.b0(o76.c(wy3.a, 1.0f), RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 2.0f, 7), new ot(10.0f, true, new i(1)), new ot(10.0f, true, new i(1)), null, 0, 0, ct3.H0(1922488082, new ph5(this.B, this.L, this.R, this.X, this.Y, 1), sk2Var), sk2Var, 1573302);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((tb2) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    ArrayList arrayList = this.B;
                    int size = arrayList.size();
                    int i3 = 0;
                    sk2 sk2Var3 = sk2Var2;
                    while (i2 < size) {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            jh5 jh5Var = (jh5) obj4;
                            String str = jh5Var.b;
                            String str2 = jh5Var.c;
                            mi2 mi2Var = this.L;
                            boolean f = sk2Var3.f(mi2Var) | sk2Var3.f(jh5Var);
                            Object L = sk2Var3.L();
                            if (f || L == su0.a) {
                                L = new jd2(20, mi2Var, jh5Var);
                                sk2Var3.h0(L);
                            }
                            sk2 sk2Var4 = sk2Var3;
                            ve2.a(str, str2, (ki2) L, dt3.l0(i3, b31.p("folder:", jh5Var.a), this.R, this.X, this.Y, sk2Var3, 0), sk2Var4, 0);
                            i3 = i4;
                            sk2Var3 = sk2Var4;
                        } else {
                            l07.v0();
                            throw null;
                        }
                    }
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
