package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g4 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ g4(Object obj, int i, nj3 nj3Var, et0 et0Var, int i2) {
        this.A = 1;
        this.R = obj;
        this.B = i;
        this.X = nj3Var;
        this.Y = et0Var;
        this.L = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        int i2 = this.B;
        Object obj3 = this.R;
        o27 o27Var = o27.a;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                n40.B((String) obj3, (String) obj5, (aj2) obj4, (tu0) obj, ep2.I(i2 | 1), this.L);
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                int I = ep2.I(this.L | 1);
                nk2.g(this.R, this.B, (nj3) obj5, (et0) obj4, (tu0) obj, I);
                return o27Var;
            case 2:
                ((Integer) obj2).getClass();
                nk2.f((bm5) obj3, (mi2) obj5, (zy3) obj4, (tu0) obj, ep2.I(i2 | 1), this.L);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                wi5.b((String) obj3, (zy3) obj5, (et0) obj4, (tu0) obj, ep2.I(i2 | 1), this.L);
                return o27Var;
        }
    }

    public /* synthetic */ g4(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.A = i3;
        this.R = obj;
        this.X = obj2;
        this.Y = obj3;
        this.B = i;
        this.L = i2;
    }
}
