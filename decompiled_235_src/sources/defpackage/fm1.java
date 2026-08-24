package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm1  reason: default package */
/* loaded from: classes.dex */
public final class fm1 implements n55 {
    public static final Object c = new Object();
    public volatile f92 a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, fm1, n55] */
    public static n55 a(f92 f92Var) {
        if (f92Var instanceof fm1) {
            return f92Var;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = f92Var;
        return obj;
    }

    @Override // defpackage.n55
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
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
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
