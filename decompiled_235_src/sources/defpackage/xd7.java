package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd7  reason: default package */
/* loaded from: classes.dex */
public class xd7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        jf3 n0 = hf3Var.n0();
        if (n0 == jf3.NULL) {
            hf3Var.j0();
            return null;
        } else if (n0 == jf3.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(hf3Var.l0()));
        } else {
            return Boolean.valueOf(hf3Var.U());
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        vf3Var.Z((Boolean) obj);
    }
}
