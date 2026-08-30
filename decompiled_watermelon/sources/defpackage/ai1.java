package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ai1  reason: default package */
/* loaded from: classes.dex */
public final class ai1 implements gw4 {
    public static final Object c = new Object();
    public volatile gw4 a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [gw4, ai1, java.lang.Object] */
    public static gw4 a(gw4 gw4Var) {
        if (gw4Var instanceof ai1) {
            return gw4Var;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = gw4Var;
        return obj;
    }

    @Override // defpackage.fw4
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
