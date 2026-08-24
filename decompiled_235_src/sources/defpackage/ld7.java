package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ld7  reason: default package */
/* loaded from: classes.dex */
public class ld7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        return new StringBuilder(hf3Var.l0());
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        String sb;
        StringBuilder sb2 = (StringBuilder) obj;
        if (sb2 == null) {
            sb = null;
        } else {
            sb = sb2.toString();
        }
        vf3Var.c0(sb);
    }
}
