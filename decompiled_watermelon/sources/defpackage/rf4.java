package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rf4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rf4 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ uc7 R;
    public final /* synthetic */ l14 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ aj2 Z;
    public final /* synthetic */ y26 c0;
    public final /* synthetic */ yb1 d0;
    public final /* synthetic */ Object e0;

    public /* synthetic */ rf4(Object obj, boolean z, boolean z2, uc7 uc7Var, l14 l14Var, boolean z3, aj2 aj2Var, y26 y26Var, yb1 yb1Var, int i) {
        this.A = i;
        this.e0 = obj;
        this.B = z;
        this.L = z2;
        this.R = uc7Var;
        this.X = l14Var;
        this.Y = z3;
        this.Z = aj2Var;
        this.c0 = y26Var;
        this.d0 = yb1Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        int i2 = 2;
        Object obj4 = this.e0;
        switch (i) {
            case 0:
                String str = (String) obj4;
                aj2 aj2Var = (aj2) obj;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((sk2) tu0Var).h(aj2Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    k45 k45Var = k45.o0;
                    final boolean z2 = this.B;
                    final boolean z3 = this.Y;
                    final l14 l14Var = this.X;
                    final yb1 yb1Var = this.d0;
                    final y26 y26Var = this.c0;
                    k45Var.e(str, aj2Var, z2, this.L, this.R, l14Var, z3, this.Z, y26Var, yb1Var, null, ct3.H0(-1118701585, new aj2() { // from class: tf4
                        @Override // defpackage.aj2
                        public final Object j(Object obj5, Object obj6) {
                            int i3 = r6;
                            o27 o27Var2 = o27.a;
                            boolean z4 = false;
                            tu0 tu0Var2 = (tu0) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            switch (i3) {
                                case 0:
                                    if ((intValue2 & 3) != 2) {
                                        z4 = true;
                                    }
                                    sk2 sk2Var2 = (sk2) tu0Var2;
                                    if (sk2Var2.O(intValue2 & 1, z4)) {
                                        k45.o0.c(z2, z3, l14Var, yb1Var, y26Var, RecyclerView.A1, RecyclerView.A1, sk2Var2, 12582912);
                                    } else {
                                        sk2Var2.R();
                                    }
                                    return o27Var2;
                                default:
                                    if ((intValue2 & 3) != 2) {
                                        z4 = true;
                                    }
                                    sk2 sk2Var3 = (sk2) tu0Var2;
                                    if (sk2Var3.O(intValue2 & 1, z4)) {
                                        k45.o0.c(z2, z3, l14Var, yb1Var, y26Var, RecyclerView.A1, RecyclerView.A1, sk2Var3, 12582912);
                                    } else {
                                        sk2Var3.R();
                                    }
                                    return o27Var2;
                            }
                        }
                    }, sk2Var), sk2Var, (intValue << 3) & 112);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                oq6 oq6Var = (oq6) obj4;
                aj2 aj2Var2 = (aj2) obj;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var2).h(aj2Var2)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    int i3 = intValue2;
                    k45 k45Var2 = k45.o0;
                    String str2 = oq6Var.a.B;
                    final boolean z4 = this.B;
                    final boolean z5 = this.Y;
                    final l14 l14Var2 = this.X;
                    final yb1 yb1Var2 = this.d0;
                    final y26 y26Var2 = this.c0;
                    k45Var2.e(str2, aj2Var2, z4, this.L, this.R, l14Var2, z5, this.Z, y26Var2, yb1Var2, null, ct3.H0(-185364670, new aj2() { // from class: tf4
                        @Override // defpackage.aj2
                        public final Object j(Object obj5, Object obj6) {
                            int i32 = r6;
                            o27 o27Var2 = o27.a;
                            boolean z42 = false;
                            tu0 tu0Var22 = (tu0) obj5;
                            int intValue22 = ((Integer) obj6).intValue();
                            switch (i32) {
                                case 0:
                                    if ((intValue22 & 3) != 2) {
                                        z42 = true;
                                    }
                                    sk2 sk2Var22 = (sk2) tu0Var22;
                                    if (sk2Var22.O(intValue22 & 1, z42)) {
                                        k45.o0.c(z4, z5, l14Var2, yb1Var2, y26Var2, RecyclerView.A1, RecyclerView.A1, sk2Var22, 12582912);
                                    } else {
                                        sk2Var22.R();
                                    }
                                    return o27Var2;
                                default:
                                    if ((intValue22 & 3) != 2) {
                                        z42 = true;
                                    }
                                    sk2 sk2Var3 = (sk2) tu0Var22;
                                    if (sk2Var3.O(intValue22 & 1, z42)) {
                                        k45.o0.c(z4, z5, l14Var2, yb1Var2, y26Var2, RecyclerView.A1, RecyclerView.A1, sk2Var3, 12582912);
                                    } else {
                                        sk2Var3.R();
                                    }
                                    return o27Var2;
                            }
                        }
                    }, sk2Var2), sk2Var2, (i3 << 3) & 112);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
