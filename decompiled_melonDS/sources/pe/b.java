package pe;

import android.net.Uri;
import nc.k;
import oe.t0;
import w.d;
import wc.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f11615a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11616b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f11617c;

    /* renamed from: d  reason: collision with root package name */
    public final t0 f11618d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11619e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11620f;

    /* renamed from: g  reason: collision with root package name */
    public final g f11621g;

    public b(a aVar, long j2, Uri uri, t0 t0Var, String str, long j10, g gVar) {
        aVar.getClass();
        uri.getClass();
        t0Var.getClass();
        str.getClass();
        gVar.getClass();
        this.f11615a = aVar;
        this.f11616b = j2;
        this.f11617c = uri;
        this.f11618d = t0Var;
        this.f11619e = str;
        this.f11620f = j10;
        this.f11621g = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11615a == bVar.f11615a && this.f11616b == bVar.f11616b && k.a(this.f11617c, bVar.f11617c) && k.a(this.f11618d, bVar.f11618d) && k.a(this.f11619e, bVar.f11619e) && this.f11620f == bVar.f11620f && k.a(this.f11621g, bVar.f11621g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int f8 = d.f(this.f11616b, this.f11615a.hashCode() * 31, 31);
        return this.f11621g.hashCode() + d.f(this.f11620f, d.d((this.f11618d.hashCode() + ((this.f11617c.hashCode() + f8) * 31)) * 31, 31, this.f11619e), 31);
    }

    public final String toString() {
        return "AppUpdate(type=" + this.f11615a + ", id=" + this.f11616b + ", downloadUri=" + this.f11617c + ", newVersion=" + this.f11618d + ", description=" + this.f11619e + ", binarySize=" + this.f11620f + ", updateDate=" + this.f11621g + ")";
    }
}
