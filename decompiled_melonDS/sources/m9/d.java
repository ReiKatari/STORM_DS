package m9;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final n9.h f9377a;

    /* renamed from: b  reason: collision with root package name */
    public final n9.f f9378b;

    /* renamed from: c  reason: collision with root package name */
    public final p9.e f9379c;

    /* renamed from: d  reason: collision with root package name */
    public final n9.d f9380d;

    public d(n9.h hVar, n9.f fVar, p9.e eVar, n9.d dVar) {
        this.f9377a = hVar;
        this.f9378b = fVar;
        this.f9379c = eVar;
        this.f9380d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (nc.k.a(this.f9377a, dVar.f9377a) && this.f9378b == dVar.f9378b && nc.k.a(this.f9379c, dVar.f9379c) && this.f9380d == dVar.f9380d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i10;
        int i11;
        int i12 = 0;
        n9.h hVar = this.f9377a;
        if (hVar != null) {
            i2 = hVar.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = i2 * 31;
        n9.f fVar = this.f9378b;
        if (fVar != null) {
            i10 = fVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 28629151;
        p9.e eVar = this.f9379c;
        if (eVar != null) {
            i11 = eVar.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        n9.d dVar = this.f9380d;
        if (dVar != null) {
            i12 = dVar.hashCode();
        }
        return (i15 + i12) * 887503681;
    }
}
