package aa;

import c1.f1;
import c1.g1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public float f685a;

    /* renamed from: b  reason: collision with root package name */
    public float f686b;

    public f1 a(float f8) {
        double b10 = b(f8);
        double d4 = g1.f2425a;
        double d10 = d4 - 1.0d;
        return new f1(f8, (float) (Math.exp((d4 / d10) * b10) * this.f685a * this.f686b), (long) (Math.exp(b10 / d10) * 1000.0d));
    }

    public double b(float f8) {
        float[] fArr = c1.d.f2400a;
        return Math.log((Math.abs(f8) * 0.35f) / (this.f685a * this.f686b));
    }
}
