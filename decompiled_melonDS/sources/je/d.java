package je;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final long f7838a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7839b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7840c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7841d;

    public d(long j2, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f7838a = j2;
        this.f7839b = str;
        this.f7840c = str2;
        this.f7841d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f7838a == dVar.f7838a && k.a(this.f7839b, dVar.f7839b) && k.a(this.f7840c, dVar.f7840c) && k.a(this.f7841d, dVar.f7841d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.f7838a) * 31;
        String str = this.f7839b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f7841d.hashCode() + w.d.d((hashCode2 + hashCode) * 31, 31, this.f7840c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RAGameEntity(gameId=");
        sb2.append(this.f7838a);
        sb2.append(", richPresencePatch=");
        sb2.append(this.f7839b);
        w.d.B(sb2, ", title=", this.f7840c, ", icon=", this.f7841d);
        sb2.append(")");
        return sb2.toString();
    }
}
