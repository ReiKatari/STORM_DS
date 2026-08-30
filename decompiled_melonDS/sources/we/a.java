package we;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14212a;

    /* renamed from: b  reason: collision with root package name */
    public int f14213b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f14212a == aVar.f14212a && this.f14213b == aVar.f14213b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14213b) + (Boolean.hashCode(this.f14212a) * 31);
    }

    public final String toString() {
        boolean z10 = this.f14212a;
        int i2 = this.f14213b;
        return "PresentFrameWrapper(isValidFrame=" + z10 + ", textureId=" + i2 + ")";
    }
}
