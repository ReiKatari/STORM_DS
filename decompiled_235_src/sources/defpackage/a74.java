package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a74  reason: default package */
/* loaded from: classes.dex */
public interface a74 {
    boolean a(qn2 qn2Var);

    Object b(eo2 eo2Var, Object obj);

    default a74 d(a74 a74Var) {
        if (a74Var == x64.a) {
            return this;
        }
        return new iu0(this, a74Var);
    }
}
