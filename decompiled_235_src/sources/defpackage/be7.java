package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: be7  reason: default package */
/* loaded from: classes.dex */
public class be7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        try {
            return Integer.valueOf(hf3Var.Z());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            vf3Var.A();
        } else {
            vf3Var.X(number.intValue());
        }
    }
}
