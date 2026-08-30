package t1;

import i3.g0;
import i3.h0;
import i3.n0;
import i3.z;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements n0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f13075a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13076b;

    /* renamed from: c  reason: collision with root package name */
    public final a f13077c;

    /* renamed from: d  reason: collision with root package name */
    public final a f13078d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f13075a = aVar;
        this.f13076b = aVar2;
        this.f13077c = aVar3;
        this.f13078d = aVar4;
    }

    @Override // i3.n0
    public final z a(long j2, m mVar, x4.c cVar) {
        float f8;
        float f10;
        float a10 = this.f13075a.a(j2, cVar);
        float a11 = this.f13076b.a(j2, cVar);
        float a12 = this.f13077c.a(j2, cVar);
        float a13 = this.f13078d.a(j2, cVar);
        float d4 = h3.e.d(j2);
        float f11 = a10 + a13;
        if (f11 > d4) {
            float f12 = d4 / f11;
            a10 *= f12;
            a13 *= f12;
        }
        float f13 = a11 + a12;
        if (f13 > d4) {
            float f14 = d4 / f13;
            a11 *= f14;
            a12 *= f14;
        }
        if (a10 < 0.0f || a11 < 0.0f || a12 < 0.0f || a13 < 0.0f) {
            k1.b.a("Corner size in Px can't be negative(topStart = " + a10 + ", topEnd = " + a11 + ", bottomEnd = " + a12 + ", bottomStart = " + a13 + ")!");
        }
        if (a10 + a11 + a12 + a13 == 0.0f) {
            return new g0(pc.a.h(0L, j2));
        }
        h3.c h2 = pc.a.h(0L, j2);
        m mVar2 = m.Ltr;
        if (mVar == mVar2) {
            f8 = a10;
        } else {
            f8 = a11;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L);
        if (mVar == mVar2) {
            a10 = a11;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a10) << 32) | (Float.floatToRawIntBits(a10) & 4294967295L);
        if (mVar == mVar2) {
            f10 = a12;
        } else {
            f10 = a13;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
        if (mVar != mVar2) {
            a13 = a12;
        }
        return new h0(new h3.d(h2.f6052a, h2.f6053b, h2.f6054c, h2.f6055d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a13) << 32) | (Float.floatToRawIntBits(a13) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!this.f13075a.equals(dVar.f13075a) || !this.f13076b.equals(dVar.f13076b) || !this.f13077c.equals(dVar.f13077c) || !this.f13078d.equals(dVar.f13078d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13076b.hashCode();
        int hashCode2 = this.f13077c.hashCode();
        return this.f13078d.hashCode() + ((hashCode2 + ((hashCode + (this.f13075a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f13075a + ", topEnd = " + this.f13076b + ", bottomEnd = " + this.f13077c + ", bottomStart = " + this.f13078d + ')';
    }
}
