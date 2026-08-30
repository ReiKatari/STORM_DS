package nf;

import oe.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {
    @va.b("x")

    /* renamed from: a  reason: collision with root package name */
    private final int f10426a;
    @va.b("y")

    /* renamed from: b  reason: collision with root package name */
    private final int f10427b;
    @va.b("width")

    /* renamed from: c  reason: collision with root package name */
    private final int f10428c;
    @va.b("height")

    /* renamed from: d  reason: collision with root package name */
    private final int f10429d;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public g(int i2, int i10, int i11, int i12) {
        this.f10426a = i2;
        this.f10427b = i10;
        this.f10428c = i11;
        this.f10429d = i12;
    }

    public final b0 a() {
        return new b0(this.f10426a, this.f10427b, this.f10428c, this.f10429d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f10426a == gVar.f10426a && this.f10427b == gVar.f10427b && this.f10428c == gVar.f10428c && this.f10429d == gVar.f10429d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10429d) + w.d.c(this.f10428c, w.d.c(this.f10427b, Integer.hashCode(this.f10426a) * 31, 31), 31);
    }

    public final String toString() {
        int i2 = this.f10426a;
        int i10 = this.f10427b;
        int i11 = this.f10428c;
        int i12 = this.f10429d;
        StringBuilder j2 = kc.a.j("RectDto(x=", i2, ", y=", i10, ", width=");
        j2.append(i11);
        j2.append(", height=");
        j2.append(i12);
        j2.append(")");
        return j2.toString();
    }
}
