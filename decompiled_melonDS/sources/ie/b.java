package ie;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Long f7043a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7044b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7045c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7046d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7047e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7048f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7049g;

    public b(Long l10, long j2, long j10, String str, String str2, String str3, boolean z10) {
        str.getClass();
        str3.getClass();
        this.f7043a = l10;
        this.f7044b = j2;
        this.f7045c = j10;
        this.f7046d = str;
        this.f7047e = str2;
        this.f7048f = str3;
        this.f7049g = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (k.a(this.f7043a, bVar.f7043a) && this.f7044b == bVar.f7044b && this.f7045c == bVar.f7045c && k.a(this.f7046d, bVar.f7046d) && k.a(this.f7047e, bVar.f7047e) && k.a(this.f7048f, bVar.f7048f) && this.f7049g == bVar.f7049g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = 0;
        Long l10 = this.f7043a;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int d4 = w.d.d(w.d.f(this.f7045c, w.d.f(this.f7044b, hashCode * 31, 31), 31), 31, this.f7046d);
        String str = this.f7047e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Boolean.hashCode(this.f7049g) + w.d.d((d4 + i2) * 31, 31, this.f7048f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheatEntity(id=");
        sb2.append(this.f7043a);
        sb2.append(", cheatFolderId=");
        sb2.append(this.f7044b);
        sb2.append(", cheatDatabaseId=");
        sb2.append(this.f7045c);
        sb2.append(", name=");
        w.d.B(sb2, this.f7046d, ", description=", this.f7047e, ", code=");
        sb2.append(this.f7048f);
        sb2.append(", enabled=");
        sb2.append(this.f7049g);
        sb2.append(")");
        return sb2.toString();
    }
}
