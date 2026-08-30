package h0;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final String f5836a;

    /* renamed from: b  reason: collision with root package name */
    public final e0.b f5837b;

    public e(String str, e0.b bVar) {
        bVar.getClass();
        this.f5836a = str;
        this.f5837b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!this.f5836a.equals(eVar.f5836a) || !k.a(this.f5837b, eVar.f5837b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5837b.hashCode() + (this.f5836a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.f5836a + ", featureRequiring=" + this.f5837b + ')';
    }
}
