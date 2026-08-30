package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j3 {

    /* renamed from: a  reason: collision with root package name */
    public static final n2.b0 f5198a = new n2.b0(new a3.g(28));

    /* renamed from: b  reason: collision with root package name */
    public static final k3 f5199b;

    /* renamed from: c  reason: collision with root package name */
    public static final k3 f5200c;

    /* renamed from: d  reason: collision with root package name */
    public static final l2.b f5201d;

    /* renamed from: e  reason: collision with root package name */
    public static final l2.b f5202e;

    /* renamed from: f  reason: collision with root package name */
    public static final l2.b f5203f;

    static {
        long j2 = i3.s.f6687h;
        f5199b = new k3(true, Float.NaN, j2);
        f5200c = new k3(false, Float.NaN, j2);
        f5201d = new l2.b(0.16f, 0.24f, 0.08f, 0.24f);
        f5202e = new l2.b(0.08f, 0.12f, 0.04f, 0.12f);
        f5203f = new l2.b(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static k3 a(float f8, int i2, long j2, boolean z10) {
        if ((i2 & 1) != 0) {
            z10 = true;
        }
        if ((i2 & 2) != 0) {
            f8 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            j2 = i3.s.f6687h;
        }
        if (x4.f.b(f8, Float.NaN) && i3.s.c(j2, i3.s.f6687h)) {
            if (z10) {
                return f5199b;
            }
            return f5200c;
        }
        return new k3(z10, f8, j2);
    }
}
