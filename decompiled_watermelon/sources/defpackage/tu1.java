package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tu1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Set B;

    public /* synthetic */ tu1(Set set, int i) {
        this.A = i;
        this.B = set;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean contains;
        int i = this.A;
        Set set = this.B;
        switch (i) {
            case 0:
                va4 va4Var = (va4) obj;
                va4Var.getClass();
                contains = set.contains(Long.valueOf(va4Var.a));
                break;
            default:
                rg5 rg5Var = (rg5) obj;
                rg5Var.getClass();
                contains = set.contains(rg5Var.d.toString());
                break;
        }
        return Boolean.valueOf(contains);
    }
}
