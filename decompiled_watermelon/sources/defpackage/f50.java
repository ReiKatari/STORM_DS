package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f50  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f50 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ f50(List list, UUID uuid, mi2 mi2Var, mi2 mi2Var2, h24 h24Var, mi2 mi2Var3) {
        this.A = 1;
        this.B = list;
        this.L = uuid;
        this.R = mi2Var;
        this.X = mi2Var2;
        this.Y = h24Var;
        this.Z = mi2Var3;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        float f;
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.R;
        Object obj6 = this.B;
        Object obj7 = this.L;
        switch (i) {
            case 0:
                yn4[] yn4VarArr = (yn4[]) obj7;
                List list = (List) obj6;
                vv3 vv3Var = (vv3) obj5;
                l75 l75Var = (l75) obj4;
                l75 l75Var2 = (l75) obj3;
                g50 g50Var = (g50) obj2;
                xn4 xn4Var = (xn4) obj;
                int length = yn4VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    yn4 yn4Var = yn4VarArr[i3];
                    yn4Var.getClass();
                    d50.b(xn4Var, yn4Var, (mv3) list.get(i2), vv3Var.getLayoutDirection(), l75Var.A, l75Var2.A, g50Var.a);
                    i3++;
                    i2++;
                }
                return o27Var;
            case 1:
                List list2 = (List) obj6;
                mi2 mi2Var = (mi2) obj2;
                ek3 ek3Var = (ek3) obj;
                ek3Var.getClass();
                ek3Var.b0(list2.size(), new s5(14, new qu1(28), list2), new k5(11, list2), new et0(802480018, true, new dh3(list2, (UUID) obj7, (mi2) obj5, (mi2) obj4, (h24) obj3, mi2Var)));
                return o27Var;
            default:
                pj4 pj4Var = (pj4) obj7;
                pj4 pj4Var2 = (pj4) obj6;
                k75 k75Var = (k75) obj5;
                k75 k75Var2 = (k75) obj4;
                op0 op0Var = (op0) obj2;
                pj4Var.i(pj4Var2.h() + pj4Var.h() + ((Float) obj).floatValue());
                float f2 = RecyclerView.A1;
                pj4Var2.i(RecyclerView.A1);
                float l = io2.l(pj4Var.h(), k75Var.A, k75Var2.A);
                mi2 mi2Var2 = (mi2) ((k24) obj3).getValue();
                float f3 = k75Var.A;
                float f4 = k75Var2.A;
                float f5 = op0Var.a;
                float f6 = op0Var.b;
                float f7 = f4 - f3;
                if (f7 == RecyclerView.A1) {
                    f = 0.0f;
                } else {
                    f = (l - f3) / f7;
                }
                if (f >= RecyclerView.A1) {
                    f2 = f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                mi2Var2.n(Float.valueOf(ep2.y(f5, f6, f2)));
                return o27Var;
        }
    }

    public /* synthetic */ f50(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, int i) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
        this.R = obj3;
        this.X = serializable;
        this.Y = obj4;
        this.Z = obj5;
    }
}
