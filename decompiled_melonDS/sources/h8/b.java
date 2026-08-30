package h8;

import android.graphics.Rect;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f6320a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6321b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6322c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6323d;

    static {
        new b(0, 0, 0, 0);
    }

    public b(int i2, int i10, int i11, int i12) {
        this.f6320a = i2;
        this.f6321b = i10;
        this.f6322c = i11;
        this.f6323d = i12;
        if (i2 <= i11) {
            if (i10 <= i12) {
                return;
            }
            a0.j.e(kc.a.d(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: "));
            throw null;
        }
        a0.j.e(kc.a.d(i2, i11, "Left must be less than or equal to right, left: ", ", right: "));
        throw null;
    }

    public final int a() {
        return this.f6323d - this.f6321b;
    }

    public final int b() {
        return this.f6322c - this.f6320a;
    }

    public final Rect c() {
        return new Rect(this.f6320a, this.f6321b, this.f6322c, this.f6323d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!b.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        b bVar = (b) obj;
        if (this.f6320a == bVar.f6320a && this.f6321b == bVar.f6321b && this.f6322c == bVar.f6322c && this.f6323d == bVar.f6323d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f6320a * 31) + this.f6321b) * 31) + this.f6322c) * 31) + this.f6323d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f6320a);
        sb2.append(',');
        sb2.append(this.f6321b);
        sb2.append(',');
        sb2.append(this.f6322c);
        sb2.append(',');
        return w.d.q(sb2, this.f6323d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
