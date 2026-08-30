package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xa7  reason: default package */
/* loaded from: classes.dex */
public interface xa7 {
    default ra7 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default ra7 b(Class cls, g14 g14Var) {
        return a(cls);
    }

    default ra7 c(qo0 qo0Var, g14 g14Var) {
        Class cls = qo0Var.a;
        cls.getClass();
        return b(cls, g14Var);
    }
}
