package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e63  reason: default package */
/* loaded from: classes.dex */
public class e63 extends p63 {
    public final boolean X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e63(c63 c63Var) {
        super(true);
        yn0 yn0Var;
        yn0 yn0Var2;
        boolean z = true;
        X(c63Var);
        xn0 Q = Q();
        if (Q instanceof yn0) {
            yn0Var = (yn0) Q;
        } else {
            yn0Var = null;
        }
        if (yn0Var != null) {
            p63 p = yn0Var.p();
            while (!p.M()) {
                xn0 Q2 = p.Q();
                if (Q2 instanceof yn0) {
                    yn0Var2 = (yn0) Q2;
                } else {
                    yn0Var2 = null;
                }
                if (yn0Var2 != null) {
                    p = yn0Var2.p();
                }
            }
            this.X = z;
        }
        z = false;
        this.X = z;
    }

    @Override // defpackage.p63
    public final boolean M() {
        return this.X;
    }

    @Override // defpackage.p63
    public final boolean O() {
        return true;
    }
}
