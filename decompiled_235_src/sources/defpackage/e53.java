package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e53  reason: default package */
/* loaded from: classes.dex */
public final class e53 implements pp6 {
    public Number A;
    public Number B;
    public final wc7 L;
    public final vs4 R;
    public jz6 X;
    public boolean Y;
    public boolean Z;
    public long d0;
    public final /* synthetic */ g53 e0;

    public e53(g53 g53Var, Number number, Number number2, wc7 wc7Var, d53 d53Var) {
        this.e0 = g53Var;
        this.A = number;
        this.B = number2;
        this.L = wc7Var;
        this.R = np2.Y(number);
        this.X = new jz6(d53Var, wc7Var, this.A, this.B, null);
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        return this.R.getValue();
    }
}
