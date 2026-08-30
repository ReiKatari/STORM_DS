package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements c {
    public final float A;
    public final float B;

    public d(float f8, float f10) {
        this.A = f8;
        this.B = f10;
    }

    @Override // x4.c
    public final float b() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Float.compare(this.A, dVar.A) == 0 && Float.compare(this.B, dVar.B) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.B) + (Float.hashCode(this.A) * 31);
    }

    @Override // x4.c
    public final float j() {
        return this.B;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.A);
        sb2.append(", fontScale=");
        return w.d.o(sb2, this.B, ')');
    }
}
