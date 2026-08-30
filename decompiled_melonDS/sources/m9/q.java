package m9;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f9443a;

    /* renamed from: b  reason: collision with root package name */
    public final j f9444b;

    /* renamed from: c  reason: collision with root package name */
    public final d9.f f9445c;

    /* renamed from: d  reason: collision with root package name */
    public final k9.a f9446d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9447e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9448f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9449g;

    public q(Drawable drawable, j jVar, d9.f fVar, k9.a aVar, String str, boolean z10, boolean z11) {
        this.f9443a = drawable;
        this.f9444b = jVar;
        this.f9445c = fVar;
        this.f9446d = aVar;
        this.f9447e = str;
        this.f9448f = z10;
        this.f9449g = z11;
    }

    @Override // m9.k
    public final Drawable a() {
        return this.f9443a;
    }

    @Override // m9.k
    public final j b() {
        return this.f9444b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (nc.k.a(this.f9443a, qVar.f9443a) && nc.k.a(this.f9444b, qVar.f9444b) && this.f9445c == qVar.f9445c && nc.k.a(this.f9446d, qVar.f9446d) && nc.k.a(this.f9447e, qVar.f9447e) && this.f9448f == qVar.f9448f && this.f9449g == qVar.f9449g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.f9445c.hashCode() + ((this.f9444b.hashCode() + (this.f9443a.hashCode() * 31)) * 31)) * 31;
        int i10 = 0;
        k9.a aVar = this.f9446d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 31;
        String str = this.f9447e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return Boolean.hashCode(this.f9449g) + w.d.e((i11 + i10) * 31, this.f9448f, 31);
    }
}
