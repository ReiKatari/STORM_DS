package defpackage;

import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ r4(ga7 ga7Var, ca7 ca7Var, Object obj, Object obj2, rc2 rc2Var, int i) {
        this.A = 4;
        this.R = ga7Var;
        this.Y = ca7Var;
        this.X = obj;
        this.Z = obj2;
        this.B = rc2Var;
        this.L = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        Object obj3 = this.X;
        Object obj4 = this.Z;
        Object obj5 = this.B;
        Object obj6 = this.Y;
        jg7 jg7Var = jg7.a;
        int i2 = this.L;
        Object obj7 = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(i2 | 1);
                nc1.d((List) obj7, this.X, (qn2) obj6, (fo2) obj4, (a74) obj5, (px0) obj, a0);
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                ak7.k((a74) obj5, (Cheat) obj7, (on2) obj3, (on2) obj6, (on2) obj4, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 2:
                ((Integer) obj2).getClass();
                ((zv0) obj7).j(this.X, this.Y, this.Z, this.B, (px0) obj, ii2.a0(i2) | 1);
                return jg7Var;
            case 3:
                ((Integer) obj2).getClass();
                wv7.b((a74) obj5, (fu) obj7, (iu) obj3, (jg2) obj6, (zv0) obj4, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(i2 | 1);
                n16.h((ga7) obj7, (ca7) obj6, this.X, this.Z, (rc2) obj5, (px0) obj, a02);
                return jg7Var;
        }
    }

    public /* synthetic */ r4(a74 a74Var, Object obj, Object obj2, Object obj3, ao2 ao2Var, int i, int i2) {
        this.A = i2;
        this.B = a74Var;
        this.R = obj;
        this.X = obj2;
        this.Y = obj3;
        this.Z = ao2Var;
        this.L = i;
    }

    public /* synthetic */ r4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.A = i2;
        this.R = obj;
        this.X = obj2;
        this.Y = obj3;
        this.Z = obj4;
        this.B = obj5;
        this.L = i;
    }
}
