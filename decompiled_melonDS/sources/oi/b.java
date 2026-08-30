package oi;

import java.net.URL;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f11012a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11013b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11014c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f11015d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f11016e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11017f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11018g;

    /* renamed from: h  reason: collision with root package name */
    public final int f11019h;

    /* renamed from: i  reason: collision with root package name */
    public final int f11020i;

    /* renamed from: j  reason: collision with root package name */
    public final URL f11021j;

    /* renamed from: k  reason: collision with root package name */
    public final URL f11022k;

    /* renamed from: l  reason: collision with root package name */
    public final String f11023l;
    public final a m;

    public b(long j2, long j10, long j11, Integer num, Integer num2, String str, String str2, int i2, int i10, URL url, URL url2, String str3, a aVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        aVar.getClass();
        this.f11012a = j2;
        this.f11013b = j10;
        this.f11014c = j11;
        this.f11015d = num;
        this.f11016e = num2;
        this.f11017f = str;
        this.f11018g = str2;
        this.f11019h = i2;
        this.f11020i = i10;
        this.f11021j = url;
        this.f11022k = url2;
        this.f11023l = str3;
        this.m = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f11012a == bVar.f11012a && g.a(this.f11013b, bVar.f11013b) && this.f11014c == bVar.f11014c && k.a(this.f11015d, bVar.f11015d) && k.a(this.f11016e, bVar.f11016e) && k.a(this.f11017f, bVar.f11017f) && k.a(this.f11018g, bVar.f11018g) && this.f11019h == bVar.f11019h && this.f11020i == bVar.f11020i && this.f11021j.equals(bVar.f11021j) && this.f11022k.equals(bVar.f11022k) && k.a(this.f11023l, bVar.f11023l) && this.m == bVar.m) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int f8 = w.d.f(this.f11014c, w.d.f(this.f11013b, Long.hashCode(this.f11012a) * 31, 31), 31);
        int i2 = 0;
        Integer num = this.f11015d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (f8 + hashCode) * 31;
        Integer num2 = this.f11016e;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return this.m.hashCode() + w.d.d((this.f11022k.hashCode() + ((this.f11021j.hashCode() + w.d.c(this.f11020i, w.d.c(this.f11019h, w.d.d(w.d.d((i10 + i2) * 31, 31, this.f11017f), 31, this.f11018g), 31), 31)) * 31)) * 31, 31, this.f11023l);
    }

    public final String toString() {
        String b10 = g.b(this.f11013b);
        String j02 = d0.d.j0(this.f11014c);
        return "RAAchievement(id=" + this.f11012a + ", gameId=" + b10 + ", setId=" + j02 + ", totalAwardsCasual=" + this.f11015d + ", totalAwardsHardcore=" + this.f11016e + ", title=" + this.f11017f + ", description=" + this.f11018g + ", points=" + this.f11019h + ", displayOrder=" + this.f11020i + ", badgeUrlUnlocked=" + this.f11021j + ", badgeUrlLocked=" + this.f11022k + ", memoryAddress=" + this.f11023l + ", type=" + this.m + ")";
    }
}
