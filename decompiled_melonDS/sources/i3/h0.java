package i3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 extends z {

    /* renamed from: f  reason: collision with root package name */
    public final h3.d f6639f;

    /* renamed from: g  reason: collision with root package name */
    public final h f6640g;

    public h0(h3.d dVar) {
        h hVar;
        this.f6639f = dVar;
        if (!q8.r.H(dVar)) {
            hVar = k.a();
            h.c(hVar, dVar);
        } else {
            hVar = null;
        }
        this.f6640g = hVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                if (!this.f6639f.equals(((h0) obj).f6639f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6639f.hashCode();
    }

    @Override // i3.z
    public final h3.c l() {
        h3.d dVar = this.f6639f;
        return new h3.c(dVar.f6056a, dVar.f6057b, dVar.f6058c, dVar.f6059d);
    }
}
