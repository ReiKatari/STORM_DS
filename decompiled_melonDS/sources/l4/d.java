package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8786a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8787b;

    /* renamed from: c  reason: collision with root package name */
    public int f8788c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8789d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ d(l4.c r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = r5 & 4
            if (r0 == 0) goto L6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            java.lang.String r5 = ""
            goto Lf
        Ld:
            java.lang.String r5 = "androidx.compose.foundation.text.inlineContent"
        Lf:
            r1.<init>(r3, r4, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.d.<init>(l4.c, int, int, int):void");
    }

    public final f a(int i2) {
        boolean z10;
        int i10 = this.f8788c;
        if (i10 != Integer.MIN_VALUE) {
            i2 = i10;
        }
        if (i2 != Integer.MIN_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            r4.a.c("Item.end should be set first");
        }
        return new f(this.f8787b, i2, this.f8786a, this.f8789d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (nc.k.a(this.f8786a, dVar.f8786a) && this.f8787b == dVar.f8787b && this.f8788c == dVar.f8788c && nc.k.a(this.f8789d, dVar.f8789d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f8786a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f8789d.hashCode() + w.d.c(this.f8788c, w.d.c(this.f8787b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f8786a);
        sb2.append(", start=");
        sb2.append(this.f8787b);
        sb2.append(", end=");
        sb2.append(this.f8788c);
        sb2.append(", tag=");
        return w.d.r(sb2, this.f8789d, ')');
    }

    public d(int i2, int i10, Object obj, String str) {
        this.f8786a = obj;
        this.f8787b = i2;
        this.f8788c = i10;
        this.f8789d = str;
    }
}
