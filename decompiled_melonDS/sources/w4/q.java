package w4;

import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c  reason: collision with root package name */
    public static final q f14152c = new q(3, 0L);

    /* renamed from: a  reason: collision with root package name */
    public final long f14153a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14154b;

    public /* synthetic */ q(int i2, long j2) {
        this((i2 & 1) != 0 ? t.o(0) : j2, t.o(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (x4.o.a(this.f14153a, qVar.f14153a) && x4.o.a(this.f14154b, qVar.f14154b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        x4.p[] pVarArr = x4.o.f14348b;
        return Long.hashCode(this.f14154b) + (Long.hashCode(this.f14153a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) x4.o.d(this.f14153a)) + ", restLine=" + ((Object) x4.o.d(this.f14154b)) + ')';
    }

    public q(long j2, long j10) {
        this.f14153a = j2;
        this.f14154b = j10;
    }
}
