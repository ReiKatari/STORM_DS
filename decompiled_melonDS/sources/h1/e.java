package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements d {
    @Override // h1.d
    public final float a(float f8, float f10, float f11) {
        boolean z10;
        float abs = Math.abs((f10 + f8) - f8);
        if (abs <= f11) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = (0.3f * f11) - (0.0f * abs);
        float f13 = f11 - f12;
        if (z10 && f13 < abs) {
            f12 = f11 - abs;
        }
        return f8 - f12;
    }
}
