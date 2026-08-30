package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cd5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cd5 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ hd5 B;
    public final /* synthetic */ List L;

    public /* synthetic */ cd5(hd5 hd5Var, List list, int i) {
        this.A = i;
        this.B = hd5Var;
        this.L = list;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        List list = this.L;
        hd5 hd5Var = this.B;
        ls5 ls5Var = (ls5) obj;
        switch (i) {
            case 0:
                ls5Var.getClass();
                hd5Var.b.U(ls5Var, list);
                return o27Var;
            case 1:
                ls5Var.getClass();
                hd5Var.c.U(ls5Var, list);
                return o27Var;
            case 2:
                ls5Var.getClass();
                hd5Var.e.U(ls5Var, list);
                return o27Var;
            case 3:
                ls5Var.getClass();
                hd5Var.d.U(ls5Var, list);
                return o27Var;
            default:
                ls5Var.getClass();
                hd5Var.g.U(ls5Var, list);
                return o27Var;
        }
    }
}
