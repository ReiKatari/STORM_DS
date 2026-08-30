package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vl1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vl1 implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ float R;
    public final /* synthetic */ Object X;

    public /* synthetic */ vl1(String str, boolean z, float f, k24 k24Var) {
        this.B = str;
        this.L = z;
        this.R = f;
        this.X = k24Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z2 = true;
        Object obj3 = this.X;
        switch (i) {
            case 0:
                k24 k24Var = (k24) obj3;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    if (!((Boolean) k24Var.getValue()).booleanValue() || this.L) {
                        z2 = false;
                    }
                    mh7.g(this.B, z2, this.R, sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                jk2.j(this.B, this.L, (mi2) obj3, this.R, (tu0) obj, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ vl1(String str, boolean z, mi2 mi2Var, float f, int i) {
        this.B = str;
        this.L = z;
        this.X = mi2Var;
        this.R = f;
    }
}
