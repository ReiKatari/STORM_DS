package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l04  reason: default package */
/* loaded from: classes.dex */
public final class l04 implements h54 {
    public h54[] a;

    @Override // defpackage.h54
    public final wd5 a(Class cls) {
        h54[] h54VarArr;
        for (h54 h54Var : this.a) {
            if (h54Var.b(cls)) {
                return h54Var.a(cls);
            }
        }
        fa6.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.h54
    public final boolean b(Class cls) {
        for (h54 h54Var : this.a) {
            if (h54Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
