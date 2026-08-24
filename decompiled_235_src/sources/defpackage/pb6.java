package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb6  reason: default package */
/* loaded from: classes.dex */
public final class pb6 implements ne2 {
    public final ob6 A;

    public pb6(r35 r35Var) {
        this.A = r35Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        Object a = this.A.a(r41Var, obj);
        if (a == x61.COROUTINE_SUSPENDED) {
            return a;
        }
        return jg7.a;
    }
}
