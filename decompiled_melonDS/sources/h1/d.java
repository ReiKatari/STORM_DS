package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5884a = c.f5865a;

    default float a(float f8, float f10, float f11) {
        f5884a.getClass();
        float f12 = f10 + f8;
        if ((f8 >= 0.0f && f12 <= f11) || (f8 < 0.0f && f12 > f11)) {
            return 0.0f;
        }
        float f13 = f12 - f11;
        if (Math.abs(f8) < Math.abs(f13)) {
            return f8;
        }
        return f13;
    }
}
