package ie;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Long f7050a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7051b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7052c;

    public c(Long l10, long j2, String str) {
        str.getClass();
        this.f7050a = l10;
        this.f7051b = j2;
        this.f7052c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (k.a(this.f7050a, cVar.f7050a) && this.f7051b == cVar.f7051b && k.a(this.f7052c, cVar.f7052c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l10 = this.f7050a;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return this.f7052c.hashCode() + w.d.f(this.f7051b, hashCode * 31, 31);
    }

    public final String toString() {
        return "CheatFolderEntity(id=" + this.f7050a + ", gameId=" + this.f7051b + ", name=" + this.f7052c + ")";
    }
}
