package dg;

import java.util.List;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final int f4093d = 8;
    @va.b("a")

    /* renamed from: a  reason: collision with root package name */
    private final String f4094a;
    @va.b("b")

    /* renamed from: b  reason: collision with root package name */
    private final String f4095b;
    @va.b("c")

    /* renamed from: c  reason: collision with root package name */
    private final List<d> f4096c;

    public f(String str, String str2, List<d> list) {
        str2.getClass();
        list.getClass();
        this.f4094a = str;
        this.f4095b = str2;
        this.f4096c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f e(f fVar, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fVar.f4094a;
        }
        if ((i2 & 2) != 0) {
            str2 = fVar.f4095b;
        }
        if ((i2 & 4) != 0) {
            list = fVar.f4096c;
        }
        return fVar.d(str, str2, list);
    }

    public final String a() {
        return this.f4094a;
    }

    public final String b() {
        return this.f4095b;
    }

    public final List<d> c() {
        return this.f4096c;
    }

    public final f d(String str, String str2, List<d> list) {
        str2.getClass();
        list.getClass();
        return new f(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (k.a(this.f4094a, fVar.f4094a) && k.a(this.f4095b, fVar.f4095b) && k.a(this.f4096c, fVar.f4096c)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f4094a;
    }

    public final String g() {
        return this.f4095b;
    }

    public final List<d> h() {
        return this.f4096c;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f4094a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f4096c.hashCode() + w.d.d(hashCode * 31, 31, this.f4095b);
    }

    public String toString() {
        String str = this.f4094a;
        String str2 = this.f4095b;
        List<d> list = this.f4096c;
        StringBuilder k10 = kc.a.k("UILayout25(backgroundId=", str, ", backgroundMode=", str2, ", components=");
        k10.append(list);
        k10.append(")");
        return k10.toString();
    }
}
