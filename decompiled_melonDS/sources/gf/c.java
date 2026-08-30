package gf;

import jd.g;
import nc.k;
import nd.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@g
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final long f5658a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5659b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5660c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5661d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5662e;

    public /* synthetic */ c(int i2, long j2, String str, String str2, long j10, String str3) {
        if (31 == (i2 & 31)) {
            this.f5658a = j2;
            this.f5659b = str;
            this.f5660c = str2;
            this.f5661d = j10;
            this.f5662e = str3;
            return;
        }
        a1.j(i2, 31, a.f5657a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f5658a == cVar.f5658a && k.a(this.f5659b, cVar.f5659b) && k.a(this.f5660c, cVar.f5660c) && this.f5661d == cVar.f5661d && k.a(this.f5662e, cVar.f5662e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5662e.hashCode() + w.d.f(this.f5661d, w.d.d(w.d.d(Long.hashCode(this.f5658a) * 31, 31, this.f5659b), 31, this.f5660c), 31);
    }

    public final String toString() {
        return "AssetDto(id=" + this.f5658a + ", url=" + this.f5659b + ", name=" + this.f5660c + ", size=" + this.f5661d + ", contentType=" + this.f5662e + ")";
    }
}
