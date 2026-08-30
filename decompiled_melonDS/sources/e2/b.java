package e2;

import l4.i0;
import l4.r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static b f4152h;

    /* renamed from: a  reason: collision with root package name */
    public final x4.m f4153a;

    /* renamed from: b  reason: collision with root package name */
    public final r0 f4154b;

    /* renamed from: c  reason: collision with root package name */
    public final x4.d f4155c;

    /* renamed from: d  reason: collision with root package name */
    public final p4.d f4156d;

    /* renamed from: e  reason: collision with root package name */
    public final r0 f4157e;

    /* renamed from: f  reason: collision with root package name */
    public float f4158f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f4159g = Float.NaN;

    public b(x4.m mVar, r0 r0Var, x4.d dVar, p4.d dVar2) {
        this.f4153a = mVar;
        this.f4154b = r0Var;
        this.f4155c = dVar;
        this.f4156d = dVar2;
        this.f4157e = i0.h(r0Var, mVar);
    }

    public final long a(int i2, long j2) {
        float f8 = this.f4159g;
        float f10 = this.f4158f;
        int i10 = 0;
        if (Float.isNaN(f8) || Float.isNaN(f10)) {
            String str = c.f4160a;
            long b10 = x4.b.b(0, 0, 15);
            r0 r0Var = this.f4157e;
            x4.d dVar = this.f4155c;
            float b11 = i0.a(str, r0Var, b10, dVar, this.f4156d, 1, 96).b();
            float b12 = i0.a(c.f4161b, this.f4157e, x4.b.b(0, 0, 15), dVar, this.f4156d, 2, 96).b() - b11;
            this.f4159g = b11;
            this.f4158f = b12;
            f10 = b12;
            f8 = b11;
        }
        if (i2 != 1) {
            int round = Math.round((f10 * (i2 - 1)) + f8);
            if (round >= 0) {
                i10 = round;
            }
            int g10 = x4.a.g(j2);
            if (i10 > g10) {
                i10 = g10;
            }
        } else {
            i10 = x4.a.i(j2);
        }
        return x4.b.a(x4.a.j(j2), x4.a.h(j2), i10, x4.a.g(j2));
    }
}
