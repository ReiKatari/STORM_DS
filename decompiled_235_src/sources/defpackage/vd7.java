package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd7  reason: default package */
/* loaded from: classes.dex */
public final class vd7 implements zc7 {
    public final /* synthetic */ Class A;
    public final /* synthetic */ Class B;
    public final /* synthetic */ yc7 L;

    public vd7(Class cls, Class cls2, yc7 yc7Var) {
        this.A = cls;
        this.B = cls2;
        this.L = yc7Var;
    }

    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        Class cls = ie7Var.a;
        if (cls != this.A && cls != this.B) {
            return null;
        }
        return this.L;
    }

    public final String toString() {
        return "Factory[type=" + this.B.getName() + "+" + this.A.getName() + ",adapter=" + this.L + "]";
    }
}
