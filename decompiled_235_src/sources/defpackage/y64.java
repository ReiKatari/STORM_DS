package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y64  reason: default package */
/* loaded from: classes.dex */
public interface y64 extends a74 {
    @Override // defpackage.a74
    default boolean a(qn2 qn2Var) {
        return ((Boolean) qn2Var.g(this)).booleanValue();
    }

    @Override // defpackage.a74
    default Object b(eo2 eo2Var, Object obj) {
        return eo2Var.o(obj, this);
    }
}
