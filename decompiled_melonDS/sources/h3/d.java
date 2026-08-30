package h3;

import k7.w;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final float f6056a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6057b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6058c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6059d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6060e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6061f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6062g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6063h;

    static {
        r.d(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f8, float f10, float f11, float f12, long j2, long j10, long j11, long j12) {
        this.f6056a = f8;
        this.f6057b = f10;
        this.f6058c = f11;
        this.f6059d = f12;
        this.f6060e = j2;
        this.f6061f = j10;
        this.f6062g = j11;
        this.f6063h = j12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Float.compare(this.f6056a, dVar.f6056a) != 0 || Float.compare(this.f6057b, dVar.f6057b) != 0 || Float.compare(this.f6058c, dVar.f6058c) != 0 || Float.compare(this.f6059d, dVar.f6059d) != 0 || !k0.d.u(this.f6060e, dVar.f6060e) || !k0.d.u(this.f6061f, dVar.f6061f) || !k0.d.u(this.f6062g, dVar.f6062g) || !k0.d.u(this.f6063h, dVar.f6063h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6063h) + w.d.f(this.f6062g, w.d.f(this.f6061f, w.d.f(this.f6060e, w.d.b(this.f6059d, w.d.b(this.f6058c, w.d.b(this.f6057b, Float.hashCode(this.f6056a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = w.J(this.f6056a) + ", " + w.J(this.f6057b) + ", " + w.J(this.f6058c) + ", " + w.J(this.f6059d);
        long j2 = this.f6060e;
        long j10 = this.f6061f;
        boolean u4 = k0.d.u(j2, j10);
        long j11 = this.f6062g;
        long j12 = this.f6063h;
        if (u4 && k0.d.u(j10, j11) && k0.d.u(j11, j12)) {
            int i2 = (int) (j2 >> 32);
            int i10 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i10)) {
                StringBuilder u10 = w.d.u("RoundRect(rect=", str, ", radius=");
                u10.append(w.J(Float.intBitsToFloat(i2)));
                u10.append(')');
                return u10.toString();
            }
            StringBuilder u11 = w.d.u("RoundRect(rect=", str, ", x=");
            u11.append(w.J(Float.intBitsToFloat(i2)));
            u11.append(", y=");
            u11.append(w.J(Float.intBitsToFloat(i10)));
            u11.append(')');
            return u11.toString();
        }
        StringBuilder u12 = w.d.u("RoundRect(rect=", str, ", topLeft=");
        u12.append((Object) k0.d.M(j2));
        u12.append(", topRight=");
        u12.append((Object) k0.d.M(j10));
        u12.append(", bottomRight=");
        u12.append((Object) k0.d.M(j11));
        u12.append(", bottomLeft=");
        u12.append((Object) k0.d.M(j12));
        u12.append(')');
        return u12.toString();
    }
}
