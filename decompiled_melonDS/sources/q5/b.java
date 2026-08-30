package q5;

import android.graphics.Insets;
import c8.d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f12282e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f12283a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12284b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12285c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12286d;

    public b(int i2, int i10, int i11, int i12) {
        this.f12283a = i2;
        this.f12284b = i10;
        this.f12285c = i11;
        this.f12286d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return c(Math.max(bVar.f12283a, bVar2.f12283a), Math.max(bVar.f12284b, bVar2.f12284b), Math.max(bVar.f12285c, bVar2.f12285c), Math.max(bVar.f12286d, bVar2.f12286d));
    }

    public static b b(b bVar, b bVar2) {
        return c(Math.min(bVar.f12283a, bVar2.f12283a), Math.min(bVar.f12284b, bVar2.f12284b), Math.min(bVar.f12285c, bVar2.f12285c), Math.min(bVar.f12286d, bVar2.f12286d));
    }

    public static b c(int i2, int i10, int i11, int i12) {
        if (i2 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f12282e;
        }
        return new b(i2, i10, i11, i12);
    }

    public static b d(Insets insets) {
        int i2;
        int i10;
        int i11;
        int i12;
        i2 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return c(i2, i10, i11, i12);
    }

    public final Insets e() {
        return d0.i(this.f12283a, this.f12284b, this.f12285c, this.f12286d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12286d == bVar.f12286d && this.f12283a == bVar.f12283a && this.f12285c == bVar.f12285c && this.f12284b == bVar.f12284b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f12283a * 31) + this.f12284b) * 31) + this.f12285c) * 31) + this.f12286d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f12283a);
        sb2.append(", top=");
        sb2.append(this.f12284b);
        sb2.append(", right=");
        sb2.append(this.f12285c);
        sb2.append(", bottom=");
        return w.d.p(sb2, this.f12286d, '}');
    }
}
