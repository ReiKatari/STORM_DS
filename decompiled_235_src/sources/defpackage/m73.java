package defpackage;

import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m73  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m73 implements eo2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ qn2 B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ qn2 R;
    public final /* synthetic */ qn2 X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    public /* synthetic */ m73(kk6 kk6Var, b.a aVar, on2 on2Var, on2 on2Var2, qn2 qn2Var, qn2 qn2Var2, qn2 qn2Var3, qn2 qn2Var4, int i) {
        this.Y = kk6Var;
        this.Z = aVar;
        this.d0 = on2Var;
        this.e0 = on2Var2;
        this.B = qn2Var;
        this.L = qn2Var2;
        this.R = qn2Var3;
        this.X = qn2Var4;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.e0;
        Object obj4 = this.d0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(1);
                x73.e((kk6) obj6, (b.a) obj5, (on2) obj4, (on2) obj3, this.B, this.L, this.R, this.X, (px0) obj, a0);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(1);
                ak7.o((List) obj6, (Map) obj5, (Map) obj4, this.B, this.L, (a74) obj3, this.R, this.X, (px0) obj, a02);
                return jg7Var;
        }
    }

    public /* synthetic */ m73(List list, Map map, Map map2, qn2 qn2Var, qn2 qn2Var2, a74 a74Var, qn2 qn2Var3, qn2 qn2Var4, int i) {
        this.Y = list;
        this.Z = map;
        this.d0 = map2;
        this.B = qn2Var;
        this.L = qn2Var2;
        this.e0 = a74Var;
        this.R = qn2Var3;
        this.X = qn2Var4;
    }
}
