package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de7  reason: default package */
/* loaded from: classes.dex */
public final class de7 extends yc7 {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ de7(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        switch (this.a) {
            case 0:
                if (hf3Var.n0() == jf3.NULL) {
                    hf3Var.j0();
                    return null;
                }
                return Double.valueOf(hf3Var.X());
            default:
                if (hf3Var.n0() == jf3.NULL) {
                    hf3Var.j0();
                    return null;
                }
                return Float.valueOf((float) hf3Var.X());
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    vf3Var.A();
                    return;
                }
                double doubleValue = number.doubleValue();
                if (z) {
                    fe7.a(doubleValue);
                }
                vf3Var.U(doubleValue);
                return;
            default:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    vf3Var.A();
                    return;
                }
                float floatValue = number2.floatValue();
                if (z) {
                    fe7.a(floatValue);
                }
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                vf3Var.a0(number2);
                return;
        }
    }
}
