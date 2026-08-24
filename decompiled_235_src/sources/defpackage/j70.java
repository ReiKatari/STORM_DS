package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j70  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j70 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ j70(List list, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, eo2 eo2Var2, qn2 qn2Var3) {
        this.A = 1;
        this.B = list;
        this.L = qn2Var;
        this.R = qn2Var2;
        this.X = eo2Var;
        this.Y = eo2Var2;
        this.Z = qn2Var3;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        float f;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.R;
        Object obj6 = this.B;
        Object obj7 = this.L;
        switch (i) {
            case 0:
                dx4[] dx4VarArr = (dx4[]) obj7;
                List list = (List) obj6;
                g34 g34Var = (g34) obj5;
                bh5 bh5Var = (bh5) obj4;
                bh5 bh5Var2 = (bh5) obj3;
                k70 k70Var = (k70) obj2;
                cx4 cx4Var = (cx4) obj;
                int length = dx4VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    dx4 dx4Var = dx4VarArr[i3];
                    dx4Var.getClass();
                    h70.b(cx4Var, dx4Var, (x24) list.get(i2), g34Var.getLayoutDirection(), bh5Var.A, bh5Var2.A, k70Var.a);
                    i3++;
                    i2++;
                }
                return jg7Var;
            case 1:
                List list2 = (List) obj6;
                qn2 qn2Var = (qn2) obj2;
                er3 er3Var = (er3) obj;
                er3Var.getClass();
                er3Var.h0(list2.size(), new r5(9, new vn0(18), list2), new j5(5, list2), new zv0(802480018, true, new z91(list2, (qn2) obj7, (qn2) obj5, (eo2) obj4, (eo2) obj3, qn2Var)));
                return jg7Var;
            default:
                rs4 rs4Var = (rs4) obj7;
                rs4 rs4Var2 = (rs4) obj6;
                ah5 ah5Var = (ah5) obj5;
                ah5 ah5Var2 = (ah5) obj4;
                bs0 bs0Var = (bs0) obj2;
                rs4Var.i(rs4Var2.h() + rs4Var.h() + ((Float) obj).floatValue());
                float f2 = RecyclerView.B1;
                rs4Var2.i(RecyclerView.B1);
                float p = gi2.p(rs4Var.h(), ah5Var.A, ah5Var2.A);
                qn2 qn2Var2 = (qn2) ((qa4) obj3).getValue();
                float f3 = ah5Var.A;
                float f4 = ah5Var2.A;
                float f5 = bs0Var.a;
                float f6 = bs0Var.b;
                float f7 = f4 - f3;
                if (f7 == RecyclerView.B1) {
                    f = 0.0f;
                } else {
                    f = (p - f3) / f7;
                }
                if (f >= RecyclerView.B1) {
                    f2 = f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                qn2Var2.g(Float.valueOf(oi2.L(f5, f6, f2)));
                return jg7Var;
        }
    }

    public /* synthetic */ j70(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, int i) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
        this.R = obj3;
        this.X = serializable;
        this.Y = obj4;
        this.Z = obj5;
    }
}
