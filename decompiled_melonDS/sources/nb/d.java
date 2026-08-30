package nb;

import rd.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10255c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile f f10256a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f10257b;

    @Override // nb.c
    public final Object get() {
        Object obj = this.f10257b;
        if (obj == f10255c) {
            f fVar = this.f10256a;
            if (fVar == null) {
                return this.f10257b;
            }
            Object obj2 = fVar.get();
            this.f10257b = obj2;
            this.f10256a = null;
            return obj2;
        }
        return obj;
    }
}
