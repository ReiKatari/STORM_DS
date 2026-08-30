package zh;

import java.net.URL;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f15110a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15111b;

    /* renamed from: c  reason: collision with root package name */
    public final oi.c f15112c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f15113d;

    /* renamed from: e  reason: collision with root package name */
    public final d f15114e;

    /* renamed from: f  reason: collision with root package name */
    public final List f15115f;

    public c(long j2, String str, oi.c cVar, URL url, d dVar, List list) {
        cVar.getClass();
        url.getClass();
        dVar.getClass();
        list.getClass();
        this.f15110a = j2;
        this.f15111b = str;
        this.f15112c = cVar;
        this.f15113d = url;
        this.f15114e = dVar;
        this.f15115f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15110a == cVar.f15110a && nc.k.a(this.f15111b, cVar.f15111b) && this.f15112c == cVar.f15112c && nc.k.a(this.f15113d, cVar.f15113d) && nc.k.a(this.f15114e, cVar.f15114e) && nc.k.a(this.f15115f, cVar.f15115f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.f15110a) * 31;
        String str = this.f15111b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.f15112c.hashCode();
        int hashCode4 = this.f15113d.hashCode();
        int hashCode5 = this.f15114e.hashCode();
        return this.f15115f.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AchievementSetUiModel(setId=" + this.f15110a + ", setTitle=" + this.f15111b + ", setType=" + this.f15112c + ", setIcon=" + this.f15113d + ", setSummary=" + this.f15114e + ", buckets=" + this.f15115f + ")";
    }
}
