package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ml  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ml implements aj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;

    public /* synthetic */ ml(zy3 zy3Var, ki2 ki2Var, boolean z, int i) {
        this.X = zy3Var;
        this.L = ki2Var;
        this.B = z;
        this.R = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        int i2 = this.R;
        boolean z = this.B;
        o27 o27Var = o27.a;
        Object obj3 = this.L;
        Object obj4 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                se.e((zy3) obj4, (ki2) obj3, z, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                int I = ep2.I(1);
                mh7.e((String) obj4, this.B, (ki2) obj3, (tu0) obj, I, this.R);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                ln2.o(z, (rb5) obj4, (bq6) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
        }
    }

    public /* synthetic */ ml(String str, boolean z, ki2 ki2Var, int i, int i2) {
        this.X = str;
        this.B = z;
        this.L = ki2Var;
        this.R = i2;
    }

    public /* synthetic */ ml(boolean z, rb5 rb5Var, bq6 bq6Var, int i) {
        this.B = z;
        this.X = rb5Var;
        this.L = bq6Var;
        this.R = i;
    }
}
