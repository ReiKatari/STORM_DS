package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qy implements aj2 {
    public final /* synthetic */ int A = 2;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;

    public /* synthetic */ qy(int i, int i2, String str, boolean z) {
        this.R = str;
        this.B = z;
        this.L = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.L;
        boolean z = this.B;
        Object obj3 = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b53.d(z, (ki2) obj3, (tu0) obj, ep2.I(1), i2);
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                ln2.j(z, (aj2) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                l07.l((String) obj3, z, (tu0) obj, ep2.I(1), i2);
                return o27Var;
        }
    }

    public /* synthetic */ qy(boolean z, ki2 ki2Var, int i, int i2) {
        this.B = z;
        this.R = ki2Var;
        this.L = i2;
    }

    public /* synthetic */ qy(boolean z, aj2 aj2Var, int i) {
        this.B = z;
        this.R = aj2Var;
        this.L = i;
    }
}
