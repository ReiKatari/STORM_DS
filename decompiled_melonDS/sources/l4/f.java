package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8790a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8791b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8792c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8793d;

    public f(int i2, int i10, Object obj, String str) {
        boolean z10;
        this.f8790a = obj;
        this.f8791b = i2;
        this.f8792c = i10;
        this.f8793d = str;
        if (i2 <= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            r4.a.a("Reversed range is not supported");
        }
    }

    public static f a(f fVar, c cVar, int i2, int i10) {
        Object obj = cVar;
        if ((i10 & 1) != 0) {
            obj = fVar.f8790a;
        }
        int i11 = fVar.f8791b;
        if ((i10 & 4) != 0) {
            i2 = fVar.f8792c;
        }
        String str = fVar.f8793d;
        fVar.getClass();
        return new f(i11, i2, obj, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (nc.k.a(this.f8790a, fVar.f8790a) && this.f8791b == fVar.f8791b && this.f8792c == fVar.f8792c && nc.k.a(this.f8793d, fVar.f8793d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f8790a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f8793d.hashCode() + w.d.c(this.f8792c, w.d.c(this.f8791b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f8790a);
        sb2.append(", start=");
        sb2.append(this.f8791b);
        sb2.append(", end=");
        sb2.append(this.f8792c);
        sb2.append(", tag=");
        return w.d.r(sb2, this.f8793d, ')');
    }

    public f(int i2, int i10, Object obj) {
        this(i2, i10, obj, "");
    }
}
