package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i10 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ i10(on2 on2Var, a74 a74Var, lq4 lq4Var, fo2 fo2Var, int i) {
        this.A = 5;
        this.B = on2Var;
        this.R = a74Var;
        this.X = lq4Var;
        this.Y = fo2Var;
        this.L = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        Object obj3 = this.X;
        Object obj4 = this.Y;
        Object obj5 = this.B;
        jg7 jg7Var = jg7.a;
        int i2 = this.L;
        Object obj6 = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vy7.g((n00) obj6, (sg6) obj3, (sn) obj4, (on2) obj5, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 1:
                ((Integer) obj2).intValue();
                lb4.b((a74) obj6, (xn0) obj3, (lq4) obj4, (on2) obj5, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 2:
                ((Integer) obj2).getClass();
                ((zv0) obj6).i(this.X, this.Y, this.B, (px0) obj, ii2.a0(i2) | 1);
                return jg7Var;
            case 3:
                ((Integer) obj2).getClass();
                g04.q((Drawable) obj6, (String) obj3, (String) obj4, (String) obj5, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 4:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(i2 | 1);
                xk2.b((Boolean) obj6, this.X, (hu3) obj4, (qn2) obj5, (px0) obj, a0);
                return jg7Var;
            case 5:
                ((Integer) obj2).getClass();
                ln2.b((on2) obj5, (a74) obj6, (lq4) obj3, (fo2) obj4, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                nc1.k((c46) obj6, (List) obj3, (on2) obj5, (qn2) obj4, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
        }
    }

    public /* synthetic */ i10(c46 c46Var, List list, on2 on2Var, qn2 qn2Var, int i) {
        this.A = 6;
        this.R = c46Var;
        this.X = list;
        this.B = on2Var;
        this.Y = qn2Var;
        this.L = i;
    }

    public /* synthetic */ i10(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A = i2;
        this.R = obj;
        this.X = obj2;
        this.Y = obj3;
        this.B = obj4;
        this.L = i;
    }
}
