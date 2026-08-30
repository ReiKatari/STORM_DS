package nb;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10252c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile c f10253a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f10254b;

    /* JADX WARN: Type inference failed for: r0v1, types: [nb.a, java.lang.Object, nb.c] */
    public static c a(c cVar) {
        if (cVar instanceof a) {
            return cVar;
        }
        ?? obj = new Object();
        obj.f10254b = f10252c;
        obj.f10253a = cVar;
        return obj;
    }

    @Override // nb.c
    public final Object get() {
        Object obj;
        Object obj2 = this.f10254b;
        Object obj3 = f10252c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f10254b;
                if (obj == obj3) {
                    obj = this.f10253a.get();
                    Object obj4 = this.f10254b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f10254b = obj;
                    this.f10253a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
