package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: az2  reason: default package */
/* loaded from: classes.dex */
public final class az2 implements ae6 {
    public Number A;
    public Number B;
    public final bz6 L;
    public final tj4 R;
    public zm6 X;
    public boolean Y;
    public boolean Z;
    public long c0;
    public final /* synthetic */ dz2 d0;

    public az2(dz2 dz2Var, Number number, Number number2, bz6 bz6Var, zy2 zy2Var) {
        this.d0 = dz2Var;
        this.A = number;
        this.B = number2;
        this.L = bz6Var;
        this.R = me2.G(number);
        this.X = new zm6(zy2Var, bz6Var, this.A, this.B, null);
    }

    @Override // defpackage.ae6
    public final Object getValue() {
        return this.R.getValue();
    }
}
