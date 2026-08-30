package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final t4.c f8898a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8899b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8900c;

    public t(t4.c cVar, int i2, int i10) {
        this.f8898a = cVar;
        this.f8899b = i2;
        this.f8900c = i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (!this.f8898a.equals(tVar.f8898a) || this.f8899b != tVar.f8899b || this.f8900c != tVar.f8900c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8900c) + w.d.c(this.f8899b, this.f8898a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f8898a);
        sb2.append(", startIndex=");
        sb2.append(this.f8899b);
        sb2.append(", endIndex=");
        return w.d.p(sb2, this.f8900c, ')');
    }
}
