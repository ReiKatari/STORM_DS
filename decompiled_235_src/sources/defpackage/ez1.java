package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ez1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Set B;

    public /* synthetic */ ez1(Set set, int i) {
        this.A = i;
        this.B = set;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean contains;
        int i = this.A;
        Set set = this.B;
        switch (i) {
            case 0:
                sj4 sj4Var = (sj4) obj;
                sj4Var.getClass();
                contains = set.contains(Long.valueOf(sj4Var.a));
                break;
            default:
                contains = set.contains(((pq5) obj).d.toString());
                break;
        }
        return Boolean.valueOf(contains);
    }
}
