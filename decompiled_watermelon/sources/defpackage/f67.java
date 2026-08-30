package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f67  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f67 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ f67(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        Object obj2 = this.R;
        Object obj3 = this.L;
        Object obj4 = this.B;
        switch (i) {
            case 0:
                qi4 qi4Var = (qi4) obj4;
                qi4 qi4Var2 = (qi4) obj3;
                qi4 qi4Var3 = (qi4) obj2;
                pv pvVar = (pv) obj;
                if (pvVar instanceof nv) {
                    if (qi4Var != null) {
                        return new nv(qi4Var);
                    }
                    return (nv) pvVar;
                } else if (pvVar instanceof mv) {
                    mv mvVar = (mv) pvVar;
                    m12 m12Var = mvVar.b;
                    if (m12Var.c instanceof m84) {
                        if (qi4Var2 != null) {
                            return new mv(qi4Var2, m12Var);
                        }
                        return mvVar;
                    } else if (qi4Var3 != null) {
                        return new mv(qi4Var3, m12Var);
                    } else {
                        return mvVar;
                    }
                } else {
                    return pvVar;
                }
            default:
                uq6 uq6Var = (uq6) obj4;
                oq6 oq6Var = (oq6) obj;
                oq6Var.getClass();
                uq6Var.getClass();
                uq6Var.b.setValue(oq6Var);
                ((k24) obj2).setValue(Boolean.valueOf(!((Boolean) ((mi2) obj3).n(oq6Var.a.B)).booleanValue()));
                return o27.a;
        }
    }
}
