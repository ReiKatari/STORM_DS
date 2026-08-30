package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: en  reason: default package */
/* loaded from: classes.dex */
public final class en extends ic3 implements mi2 {
    public final /* synthetic */ yn4[] B;
    public final /* synthetic */ fn L;
    public final /* synthetic */ int R;
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(yn4[] yn4VarArr, fn fnVar, int i, int i2) {
        super(1);
        this.B = yn4VarArr;
        this.L = fnVar;
        this.R = i;
        this.X = i2;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        yn4[] yn4VarArr;
        xn4 xn4Var = (xn4) obj;
        for (yn4 yn4Var : this.B) {
            if (yn4Var != null) {
                long a = this.L.a.b.a((yn4Var.A << 32) | (yn4Var.B & 4294967295L), (this.R << 32) | (this.X & 4294967295L), sd3.Ltr);
                xn4.k(xn4Var, yn4Var, (int) (a >> 32), (int) (a & 4294967295L));
            }
        }
        return o27.a;
    }
}
