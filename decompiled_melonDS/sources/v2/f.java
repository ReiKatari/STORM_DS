package v2;

import n2.n1;
import n2.v2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends s2.d {
    public g Z;

    @Override // s2.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        return super.containsKey((n1) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof v2)) {
            return false;
        }
        return super.containsValue((v2) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [u2.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [s2.b] */
    @Override // s2.d
    /* renamed from: d */
    public final g b() {
        s2.k kVar = this.L;
        g gVar = this.Z;
        s2.k kVar2 = gVar.A;
        g gVar2 = gVar;
        if (kVar != kVar2) {
            this.B = new Object();
            gVar2 = new s2.b(this.L, this.Y);
        }
        this.Z = gVar2;
        return gVar2;
    }

    @Override // s2.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof n1)) {
            return null;
        }
        return (v2) super.get((n1) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof n1)) {
            return obj2;
        }
        return (v2) super.getOrDefault((n1) obj, (v2) obj2);
    }

    @Override // s2.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof n1)) {
            return null;
        }
        return (v2) super.remove((n1) obj);
    }
}
