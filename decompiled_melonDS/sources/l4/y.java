package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: c  reason: collision with root package name */
    public static final y f8916c = new y(0, false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8917a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8918b;

    public y() {
        this.f8917a = false;
        this.f8918b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f8917a == yVar.f8917a && this.f8918b == yVar.f8918b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8918b) + (Boolean.hashCode(this.f8917a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f8917a + ", emojiSupportMatch=" + ((Object) m.a(this.f8918b)) + ')';
    }

    public y(int i2, boolean z10) {
        this.f8917a = z10;
        this.f8918b = i2;
    }
}
