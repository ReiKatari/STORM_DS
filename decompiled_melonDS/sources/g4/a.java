package g4;

import o3.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final f f5555a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5556b;

    public a(f fVar, int i2) {
        this.f5555a = fVar;
        this.f5556b = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f5555a.equals(aVar.f5555a) || this.f5556b != aVar.f5556b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5556b) + (this.f5555a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f5555a);
        sb2.append(", configFlags=");
        return w.d.p(sb2, this.f5556b, ')');
    }
}
