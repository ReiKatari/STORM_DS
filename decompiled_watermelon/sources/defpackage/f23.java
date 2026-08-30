package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f23  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f23 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ yn4 L;
    public final /* synthetic */ int R;

    public /* synthetic */ f23(int i, yn4 yn4Var, int i2) {
        this.A = 1;
        this.B = i;
        this.L = yn4Var;
        this.R = i2;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.R;
        int i3 = this.B;
        yn4 yn4Var = this.L;
        xn4 xn4Var = (xn4) obj;
        switch (i) {
            case 0:
                xn4.k(xn4Var, yn4Var, i3, i2);
                return o27Var;
            case 1:
                xn4.k(xn4Var, yn4Var, jv3.X((i3 - yn4Var.A) / 2.0f), jv3.X((i2 - yn4Var.B) / 2.0f));
                return o27Var;
            default:
                xn4.k(xn4Var, yn4Var, i3, i2);
                return o27Var;
        }
    }

    public /* synthetic */ f23(yn4 yn4Var, int i, int i2, int i3) {
        this.A = i3;
        this.L = yn4Var;
        this.B = i;
        this.R = i2;
    }
}
