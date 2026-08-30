package defpackage;

import androidx.compose.ui.platform.ComposeView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n0  reason: default package */
/* loaded from: classes.dex */
public final class n0 extends ic3 implements aj2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i, Object obj) {
        super(2);
        this.B = i;
        this.L = obj;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.B;
        wy3 wy3Var = wy3.a;
        boolean z4 = false;
        o27 o27Var = o27.a;
        Object obj3 = this.L;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    ((o0) obj3).a(sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    Object L = sk2Var2.L();
                    if (L == su0.a) {
                        L = yd.Z;
                        sk2Var2.h0(L);
                    }
                    dt3.M(fz5.a(wy3Var, false, (mi2) L), (aj2) ((k24) obj3).getValue(), sk2Var2, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                k02 k02Var = (k02) obj;
                k02 k02Var2 = (k02) obj2;
                k02 k02Var3 = k02.PostExit;
                if (k02Var == k02Var3 && k02Var2 == k02Var3 && !((h32) obj3).a.d) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 3:
                ((Number) obj2).intValue();
                ((ComposeView) obj3).a((tu0) obj, ep2.I(1));
                return o27Var;
            case 4:
                zy3 zy3Var = (zy3) obj;
                zy3 zy3Var2 = (xy3) obj2;
                tu0 tu0Var3 = (tu0) obj3;
                if (zy3Var2 instanceof ru0) {
                    bj2 bj2Var = ((ru0) zy3Var2).a;
                    l07.q(3, bj2Var);
                    zy3Var2 = l07.d0(tu0Var3, (zy3) bj2Var.i(wy3Var, tu0Var3, 0));
                }
                return zy3Var.f(zy3Var2);
            case 5:
                ((Number) obj2).intValue();
                ((cf1) obj3).a((tu0) obj, ep2.I(1));
                return o27Var;
            case ig7.b /* 6 */:
                tu0 tu0Var4 = (tu0) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var4;
                if (sk2Var3.O(intValue3 & 1, z3)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        aj2 aj2Var = (aj2) list.get(i2);
                        int hashCode = Long.hashCode(sk2Var3.T);
                        nu0.i.getClass();
                        te teVar = mu0.c;
                        sk2Var3.b0();
                        if (sk2Var3.S) {
                            sk2Var3.k(teVar);
                        } else {
                            sk2Var3.k0();
                        }
                        oo2.S(sk2Var3, mu0.g, Integer.valueOf(hashCode));
                        aj2Var.j(sk2Var3, 0);
                        sk2Var3.p(true);
                    }
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            default:
                ((Number) obj2).intValue();
                ((yq4) obj3).a((tu0) obj, ep2.I(1));
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(o0 o0Var, int i, int i2) {
        super(2);
        this.B = i2;
        this.L = o0Var;
    }
}
