package je;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final long f7844a;

    /* renamed from: b  reason: collision with root package name */
    public final wc.g f7845b;

    /* renamed from: c  reason: collision with root package name */
    public final wc.g f7846c;

    /* renamed from: d  reason: collision with root package name */
    public final wc.g f7847d;

    public f(long j2, wc.g gVar, wc.g gVar2, wc.g gVar3) {
        this.f7844a = j2;
        this.f7845b = gVar;
        this.f7846c = gVar2;
        this.f7847d = gVar3;
    }

    public static f a(f fVar, wc.g gVar, wc.g gVar2, wc.g gVar3, int i2) {
        long j2 = fVar.f7844a;
        if ((i2 & 2) != 0) {
            gVar = fVar.f7845b;
        }
        wc.g gVar4 = gVar;
        if ((i2 & 4) != 0) {
            gVar2 = fVar.f7846c;
        }
        wc.g gVar5 = gVar2;
        if ((i2 & 8) != 0) {
            gVar3 = fVar.f7847d;
        }
        fVar.getClass();
        return new f(j2, gVar4, gVar5, gVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f7844a == fVar.f7844a && k.a(this.f7845b, fVar.f7845b) && k.a(this.f7846c, fVar.f7846c) && k.a(this.f7847d, fVar.f7847d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Long.hashCode(this.f7844a) * 31;
        int i2 = 0;
        wc.g gVar = this.f7845b;
        if (gVar == null) {
            hashCode = 0;
        } else {
            hashCode = gVar.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        wc.g gVar2 = this.f7846c;
        if (gVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gVar2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        wc.g gVar3 = this.f7847d;
        if (gVar3 != null) {
            i2 = gVar3.hashCode();
        }
        return i11 + i2;
    }

    public final String toString() {
        return "RAGameSetMetadata(gameId=" + this.f7844a + ", lastAchievementSetUpdated=" + this.f7845b + ", lastSoftcoreUserDataUpdated=" + this.f7846c + ", lastHardcoreUserDataUpdated=" + this.f7847d + ")";
    }
}
