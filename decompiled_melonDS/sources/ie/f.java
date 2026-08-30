package ie;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Long f7057a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7058b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7059c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7060d;

    public f(Long l10, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f7057a = l10;
        this.f7058b = str;
        this.f7059c = str2;
        this.f7060d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (k.a(this.f7057a, fVar.f7057a) && k.a(this.f7058b, fVar.f7058b) && k.a(this.f7059c, fVar.f7059c) && k.a(this.f7060d, fVar.f7060d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l10 = this.f7057a;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return this.f7060d.hashCode() + w.d.d(w.d.d(hashCode * 31, 31, this.f7058b), 31, this.f7059c);
    }

    public final String toString() {
        return "GameEntity(id=" + this.f7057a + ", name=" + this.f7058b + ", gameCode=" + this.f7059c + ", gameChecksum=" + this.f7060d + ")";
    }
}
