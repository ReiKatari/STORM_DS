package p7;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f11440a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11441b;

    /* renamed from: c  reason: collision with root package name */
    public final List f11442c;

    /* renamed from: d  reason: collision with root package name */
    public final List f11443d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public r(String str, boolean z10, List list, List list2) {
        str.getClass();
        this.f11440a = str;
        this.f11441b = z10;
        this.f11442c = list;
        this.f11443d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                list2.add("ASC");
            }
        }
        this.f11443d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            String str = rVar.f11440a;
            if (this.f11441b == rVar.f11441b && this.f11442c.equals(rVar.f11442c) && nc.k.a(this.f11443d, rVar.f11443d)) {
                String str2 = this.f11440a;
                if (vc.o.V(str2, "index_", false)) {
                    return vc.o.V(str, "index_", false);
                }
                return str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f11440a;
        if (vc.o.V(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.f11442c.hashCode();
        return this.f11443d.hashCode() + ((hashCode2 + (((hashCode * 31) + (this.f11441b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return vc.i.I(vc.i.K("\n            |Index {\n            |   name = '" + this.f11440a + "',\n            |   unique = '" + this.f11441b + "',\n            |   columns = {" + t.w(this.f11442c) + "\n            |   orders = {" + t.v(this.f11443d) + "\n            |}\n        "));
    }
}
