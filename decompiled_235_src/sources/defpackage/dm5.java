package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm5  reason: default package */
/* loaded from: classes.dex */
public abstract class dm5 extends cm5 implements oo2 {
    public final int B;

    public dm5(int i, r41 r41Var) {
        super(r41Var);
        this.B = i;
    }

    @Override // defpackage.oo2
    public final int d() {
        return this.B;
    }

    @Override // defpackage.d20
    public final String toString() {
        if (this.A == null) {
            gh5.a.getClass();
            return lh5.a(this);
        }
        return super.toString();
    }
}
