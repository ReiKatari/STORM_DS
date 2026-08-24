package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc7  reason: default package */
/* loaded from: classes.dex */
public final class xc7 extends yc7 {
    public final /* synthetic */ yc7 a;

    public xc7(yc7 yc7Var) {
        this.a = yc7Var;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        return this.a.b(hf3Var);
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        if (obj == null) {
            vf3Var.A();
        } else {
            this.a.c(vf3Var, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }
}
