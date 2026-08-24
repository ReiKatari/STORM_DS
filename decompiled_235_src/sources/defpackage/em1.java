package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em1  reason: default package */
/* loaded from: classes.dex */
public final class em1 implements m55 {
    public static final Object c = new Object();
    public volatile m55 a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [em1, java.lang.Object, m55] */
    public static m55 a(m55 m55Var) {
        if (m55Var instanceof em1) {
            return m55Var;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = m55Var;
        return obj;
    }

    @Override // defpackage.n55
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
