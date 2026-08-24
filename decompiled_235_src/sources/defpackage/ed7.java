package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed7  reason: default package */
/* loaded from: classes.dex */
public class ed7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        return Long.valueOf(hf3Var.a0());
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            vf3Var.A();
        } else {
            vf3Var.c0(number.toString());
        }
    }
}
