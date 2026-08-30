package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface y extends j {
    @Override // d1.j
    default y1 a(w1 w1Var) {
        return new b9.e(this);
    }

    float b(long j2, float f8, float f10, float f11);

    float c(long j2, float f8, float f10, float f11);

    long d(float f8, float f10, float f11);

    default float e(float f8, float f10, float f11) {
        return c(d(f8, f10, f11), f8, f10, f11);
    }
}
