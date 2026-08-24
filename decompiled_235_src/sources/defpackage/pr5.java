package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pr5 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ Map R;
    public final /* synthetic */ int X;
    public final /* synthetic */ qn2 Y;

    public /* synthetic */ pr5(ArrayList arrayList, qn2 qn2Var, Map map, int i, qn2 qn2Var2, int i2) {
        this.A = i2;
        this.B = arrayList;
        this.L = qn2Var;
        this.R = map;
        this.X = i;
        this.Y = qn2Var2;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = 0;
        boolean z2 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((kg2) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    ArrayList arrayList = this.B;
                    int size = arrayList.size();
                    int i3 = 0;
                    xq2 xq2Var2 = xq2Var;
                    while (i2 < size) {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            lr5 lr5Var = (lr5) obj4;
                            String str = lr5Var.b;
                            String str2 = lr5Var.c;
                            qn2 qn2Var = this.L;
                            boolean f = xq2Var2.f(qn2Var) | xq2Var2.f(lr5Var);
                            Object P = xq2Var2.P();
                            if (f || P == ox0.a) {
                                P = new ci2(22, qn2Var, lr5Var);
                                xq2Var2.l0(P);
                            }
                            xq2 xq2Var3 = xq2Var2;
                            ii2.f(str, str2, (on2) P, nw7.o0(i3, i61.m("folder:", lr5Var.a), this.R, this.X, this.Y, xq2Var2, 0), xq2Var3, 0);
                            i3 = i4;
                            xq2Var2 = xq2Var3;
                        } else {
                            hf.q0();
                            throw null;
                        }
                    }
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ro3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                }
                xq2 xq2Var4 = (xq2) px0Var2;
                if (xq2Var4.S(intValue2 & 1, z2)) {
                    wv7.a(ge7.S(dj6.c(x64.a, 1.0f), RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 2.0f, 7), new gu(10.0f, true, new i(1)), new gu(10.0f, true, new i(1)), null, 0, 0, n16.I(441704622, new pr5(this.B, this.L, this.R, this.X, this.Y, 0), xq2Var4), xq2Var4, 1573302);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
        }
    }
}
