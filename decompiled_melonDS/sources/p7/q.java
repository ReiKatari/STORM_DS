package p7;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f11435a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11436b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11437c;

    /* renamed from: d  reason: collision with root package name */
    public final List f11438d;

    /* renamed from: e  reason: collision with root package name */
    public final List f11439e;

    public q(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f11435a = str;
        this.f11436b = str2;
        this.f11437c = str3;
        this.f11438d = list;
        this.f11439e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (!nc.k.a(this.f11435a, qVar.f11435a) || !nc.k.a(this.f11436b, qVar.f11436b) || !nc.k.a(this.f11437c, qVar.f11437c) || !this.f11438d.equals(qVar.f11438d)) {
                return false;
            }
            return this.f11439e.equals(qVar.f11439e);
        }
        return false;
    }

    public final int hashCode() {
        int d4 = w.d.d(w.d.d(this.f11435a.hashCode() * 31, 31, this.f11436b), 31, this.f11437c);
        return this.f11439e.hashCode() + ((this.f11438d.hashCode() + d4) * 31);
    }

    public final String toString() {
        return vc.i.I(vc.i.K("\n            |ForeignKey {\n            |   referenceTable = '" + this.f11435a + "',\n            |   onDelete = '" + this.f11436b + "',\n            |   onUpdate = '" + this.f11437c + "',\n            |   columnNames = {" + t.w(zb.l.k0(this.f11438d)) + "\n            |   referenceColumnNames = {" + t.v(zb.l.k0(this.f11439e)) + "\n            |}\n        "));
    }
}
