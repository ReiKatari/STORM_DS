package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru2  reason: default package */
/* loaded from: classes.dex */
public class ru2 extends ec6 {
    public yc7 a = null;

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        yc7 yc7Var = this.a;
        if (yc7Var != null) {
            return yc7Var.b(hf3Var);
        }
        i.m("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        yc7 yc7Var = this.a;
        if (yc7Var != null) {
            yc7Var.c(vf3Var, obj);
        } else {
            i.m("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // defpackage.ec6
    public final yc7 d() {
        yc7 yc7Var = this.a;
        if (yc7Var != null) {
            return yc7Var;
        }
        i.m("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
