package k3;

import i3.q;
import nc.k;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public x4.c f7955a;

    /* renamed from: b  reason: collision with root package name */
    public m f7956b;

    /* renamed from: c  reason: collision with root package name */
    public q f7957c;

    /* renamed from: d  reason: collision with root package name */
    public long f7958d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!k.a(this.f7955a, aVar.f7955a) || this.f7956b != aVar.f7956b || !k.a(this.f7957c, aVar.f7957c) || !h3.e.b(this.f7958d, aVar.f7958d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f7956b.hashCode();
        int hashCode2 = this.f7957c.hashCode();
        return Long.hashCode(this.f7958d) + ((hashCode2 + ((hashCode + (this.f7955a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f7955a + ", layoutDirection=" + this.f7956b + ", canvas=" + this.f7957c + ", size=" + ((Object) h3.e.g(this.f7958d)) + ')';
    }
}
