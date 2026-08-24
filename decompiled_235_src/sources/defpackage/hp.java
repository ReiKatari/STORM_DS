package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hp implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ hp(int i, cq3 cq3Var, Object obj) {
        this.A = 7;
        this.L = cq3Var;
        this.B = i;
        this.R = obj;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = this.B;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                jp.a((fp) obj4, (List) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 1:
                ((Integer) obj2).intValue();
                ak7.j((a74) obj4, (qn2) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 2:
                ((Integer) obj2).getClass();
                ((zv0) obj4).b(obj3, (px0) obj, ii2.a0(i2) | 1);
                return jg7Var;
            case 3:
                ((Integer) obj2).intValue();
                hv.d((pq) obj4, (eo2) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 4:
                ((Integer) obj2).getClass();
                hv.e((pq[]) obj4, (eo2) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 5:
                ((Integer) obj2).getClass();
                ln2.c((on2) obj4, (zv0) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 6:
                ((Integer) obj2).getClass();
                ((po3) obj4).b(i2, obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 7:
                cq3 cq3Var = (cq3) obj4;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    cq3Var.b(i2, obj3, xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 8:
                ((Integer) obj2).getClass();
                ((fr3) obj4).b(i2, obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 9:
                ((Integer) obj2).getClass();
                ((ar4) obj4).b(i2, obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 10:
                ((Integer) obj2).getClass();
                hf.h((pq5) obj4, (a74) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 11:
                ((Integer) obj2).intValue();
                q60.f((a74) obj4, (eo2) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 12:
                ((Integer) obj2).getClass();
                xk2.a((el6) obj4, (a74) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 13:
                ((Integer) obj2).intValue();
                x37.a((s47) obj4, (eo2) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 14:
                ((Integer) obj2).intValue();
                ((ga7) obj4).a(obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                is7.e((String) obj4, (a74) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
        }
    }

    public /* synthetic */ hp(cq3 cq3Var, int i, Object obj, int i2, int i3) {
        this.A = i3;
        this.L = cq3Var;
        this.B = i;
        this.R = obj;
    }

    public /* synthetic */ hp(Object obj, int i, int i2, Object obj2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.B = i;
    }
}
