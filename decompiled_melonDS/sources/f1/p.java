package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public i3.f f4633a = null;

    /* renamed from: b  reason: collision with root package name */
    public i3.b f4634b = null;

    /* renamed from: c  reason: collision with root package name */
    public k3.b f4635c = null;

    /* renamed from: d  reason: collision with root package name */
    public i3.h f4636d = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (!nc.k.a(this.f4633a, pVar.f4633a) || !nc.k.a(this.f4634b, pVar.f4634b) || !nc.k.a(this.f4635c, pVar.f4635c) || !nc.k.a(this.f4636d, pVar.f4636d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        i3.f fVar = this.f4633a;
        int i2 = 0;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        int i10 = hashCode * 31;
        i3.b bVar = this.f4634b;
        if (bVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        k3.b bVar2 = this.f4635c;
        if (bVar2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bVar2.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        i3.h hVar = this.f4636d;
        if (hVar != null) {
            i2 = hVar.hashCode();
        }
        return i12 + i2;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f4633a + ", canvas=" + this.f4634b + ", canvasDrawScope=" + this.f4635c + ", borderPath=" + this.f4636d + ')';
    }
}
