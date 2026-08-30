package xe;

import java.net.URL;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final long f14595a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14596b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f14597c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14598d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f14599e;

    public q(long j2, String str, URL url, String str2, ArrayList arrayList) {
        str.getClass();
        this.f14595a = j2;
        this.f14596b = str;
        this.f14597c = url;
        this.f14598d = str2;
        this.f14599e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (!oi.g.a(this.f14595a, qVar.f14595a) || !nc.k.a(this.f14596b, qVar.f14596b) || !this.f14597c.equals(qVar.f14597c) || !nc.k.a(this.f14598d, qVar.f14598d) || !this.f14599e.equals(qVar.f14599e)) {
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
        int hashCode2 = (this.f14597c.hashCode() + w.d.d(Long.hashCode(this.f14595a) * 31, 31, this.f14596b)) * 31;
        String str = this.f14598d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f14599e.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder k10 = kc.a.k("RAUserGameData(id=", oi.g.b(this.f14595a), ", title=", this.f14596b, ", icon=");
        k10.append(this.f14597c);
        k10.append(", richPresencePatch=");
        k10.append(this.f14598d);
        k10.append(", sets=");
        k10.append(this.f14599e);
        k10.append(")");
        return k10.toString();
    }
}
