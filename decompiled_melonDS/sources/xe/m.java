package xe;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f14579a;

    /* renamed from: b  reason: collision with root package name */
    public final URL f14580b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14581c;

    public m(String str, URL url, String str2) {
        str.getClass();
        this.f14579a = str;
        this.f14580b = url;
        this.f14581c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (!nc.k.a(this.f14579a, mVar.f14579a) || !this.f14580b.equals(mVar.f14580b) || !nc.k.a(this.f14581c, mVar.f14581c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f14580b.hashCode() + (this.f14579a.hashCode() * 31)) * 31;
        String str = this.f14581c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RAGameSummary(title=");
        sb2.append(this.f14579a);
        sb2.append(", icon=");
        sb2.append(this.f14580b);
        sb2.append(", richPresencePatch=");
        return w.d.s(sb2, this.f14581c, ")");
    }
}
