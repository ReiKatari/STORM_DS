package oi;

import java.net.URL;
import java.util.List;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final long f11033a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11034b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f11035c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11036d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f11037e;

    public f(long j2, String str, URL url, String str2, List list) {
        str.getClass();
        this.f11033a = j2;
        this.f11034b = str;
        this.f11035c = url;
        this.f11036d = str2;
        this.f11037e = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (!g.a(this.f11033a, fVar.f11033a) || !k.a(this.f11034b, fVar.f11034b) || !this.f11035c.equals(fVar.f11035c) || !k.a(this.f11036d, fVar.f11036d) || !this.f11037e.equals(fVar.f11037e)) {
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
        int hashCode2 = (this.f11035c.hashCode() + w.d.d(Long.hashCode(this.f11033a) * 31, 31, this.f11034b)) * 31;
        String str = this.f11036d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f11037e.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder k10 = kc.a.k("RAGame(id=", g.b(this.f11033a), ", title=", this.f11034b, ", icon=");
        k10.append(this.f11035c);
        k10.append(", richPresencePatch=");
        k10.append(this.f11036d);
        k10.append(", sets=");
        k10.append(this.f11037e);
        k10.append(")");
        return k10.toString();
    }
}
