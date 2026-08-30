package je;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f7830a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7831b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7832c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7833d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7834e;

    public b(long j2, long j10, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f7830a = j2;
        this.f7831b = j10;
        this.f7832c = str;
        this.f7833d = str2;
        this.f7834e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f7830a == bVar.f7830a && this.f7831b == bVar.f7831b && k.a(this.f7832c, bVar.f7832c) && k.a(this.f7833d, bVar.f7833d) && k.a(this.f7834e, bVar.f7834e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int f8 = w.d.f(this.f7831b, Long.hashCode(this.f7830a) * 31, 31);
        String str = this.f7832c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f7834e.hashCode() + w.d.d((f8 + hashCode) * 31, 31, this.f7833d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RAAchievementSetEntity(id=");
        sb2.append(this.f7830a);
        sb2.append(", gameId=");
        sb2.append(this.f7831b);
        sb2.append(", title=");
        sb2.append(this.f7832c);
        w.d.B(sb2, ", type=", this.f7833d, ", iconUrl=", this.f7834e);
        sb2.append(")");
        return sb2.toString();
    }
}
