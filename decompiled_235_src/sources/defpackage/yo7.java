package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yo7  reason: default package */
/* loaded from: classes.dex */
public interface yo7 {
    default qo7 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default qo7 b(Class cls, m94 m94Var) {
        return a(cls);
    }

    default qo7 c(ar0 ar0Var, m94 m94Var) {
        Class cls = ar0Var.a;
        cls.getClass();
        return b(cls, m94Var);
    }
}
