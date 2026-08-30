package l4;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final h f8853a;

    /* renamed from: b  reason: collision with root package name */
    public final r0 f8854b;

    /* renamed from: c  reason: collision with root package name */
    public final List f8855c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8856d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8857e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8858f;

    /* renamed from: g  reason: collision with root package name */
    public final x4.c f8859g;

    /* renamed from: h  reason: collision with root package name */
    public final x4.m f8860h;

    /* renamed from: i  reason: collision with root package name */
    public final p4.d f8861i;

    /* renamed from: j  reason: collision with root package name */
    public final long f8862j;

    public n0(h hVar, r0 r0Var, List list, int i2, boolean z10, int i10, x4.c cVar, x4.m mVar, p4.d dVar, long j2) {
        this.f8853a = hVar;
        this.f8854b = r0Var;
        this.f8855c = list;
        this.f8856d = i2;
        this.f8857e = z10;
        this.f8858f = i10;
        this.f8859g = cVar;
        this.f8860h = mVar;
        this.f8861i = dVar;
        this.f8862j = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (nc.k.a(this.f8853a, n0Var.f8853a) && nc.k.a(this.f8854b, n0Var.f8854b) && nc.k.a(this.f8855c, n0Var.f8855c) && this.f8856d == n0Var.f8856d && this.f8857e == n0Var.f8857e && this.f8858f == n0Var.f8858f && nc.k.a(this.f8859g, n0Var.f8859g) && this.f8860h == n0Var.f8860h && nc.k.a(this.f8861i, n0Var.f8861i) && x4.a.b(this.f8862j, n0Var.f8862j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f8854b.hashCode();
        int c4 = w.d.c(this.f8858f, w.d.e((((this.f8855c.hashCode() + ((hashCode + (this.f8853a.hashCode() * 31)) * 31)) * 31) + this.f8856d) * 31, this.f8857e, 31), 31);
        int hashCode2 = this.f8860h.hashCode();
        int hashCode3 = this.f8861i.hashCode();
        return Long.hashCode(this.f8862j) + ((hashCode3 + ((hashCode2 + ((this.f8859g.hashCode() + c4) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f8853a);
        sb2.append(", style=");
        sb2.append(this.f8854b);
        sb2.append(", placeholders=");
        sb2.append(this.f8855c);
        sb2.append(", maxLines=");
        sb2.append(this.f8856d);
        sb2.append(", softWrap=");
        sb2.append(this.f8857e);
        sb2.append(", overflow=");
        int i2 = this.f8858f;
        if (i2 == 1) {
            str = "Clip";
        } else if (i2 == 2) {
            str = "Ellipsis";
        } else if (i2 == 5) {
            str = "MiddleEllipsis";
        } else if (i2 == 3) {
            str = "Visible";
        } else if (i2 == 4) {
            str = "StartEllipsis";
        } else {
            str = "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", density=");
        sb2.append(this.f8859g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f8860h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f8861i);
        sb2.append(", constraints=");
        sb2.append((Object) x4.a.k(this.f8862j));
        sb2.append(')');
        return sb2.toString();
    }
}
