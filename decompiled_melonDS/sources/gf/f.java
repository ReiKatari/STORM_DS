package gf;

import g2.v3;
import java.util.List;
import jd.g;
import nc.k;
import nd.a1;
import yb.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@g
/* loaded from: classes.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final yb.f[] f5664f = {null, null, null, null, p7.a.s(h.PUBLICATION, new v3(4))};

    /* renamed from: a  reason: collision with root package name */
    public final String f5665a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5666b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5667c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5668d;

    /* renamed from: e  reason: collision with root package name */
    public final List f5669e;

    public /* synthetic */ f(int i2, String str, String str2, String str3, String str4, List list) {
        if (31 == (i2 & 31)) {
            this.f5665a = str;
            this.f5666b = str2;
            this.f5667c = str3;
            this.f5668d = str4;
            this.f5669e = list;
            return;
        }
        a1.j(i2, 31, d.f5663a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (k.a(this.f5665a, fVar.f5665a) && k.a(this.f5666b, fVar.f5666b) && k.a(this.f5667c, fVar.f5667c) && k.a(this.f5668d, fVar.f5668d) && k.a(this.f5669e, fVar.f5669e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5669e.hashCode() + w.d.d(w.d.d(w.d.d(this.f5665a.hashCode() * 31, 31, this.f5666b), 31, this.f5667c), 31, this.f5668d);
    }

    public final String toString() {
        StringBuilder k10 = kc.a.k("ReleaseDto(tagName=", this.f5665a, ", name=", this.f5666b, ", body=");
        w.d.B(k10, this.f5667c, ", createdAt=", this.f5668d, ", assets=");
        k10.append(this.f5669e);
        k10.append(")");
        return k10.toString();
    }
}
