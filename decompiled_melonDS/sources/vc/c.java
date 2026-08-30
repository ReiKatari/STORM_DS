package vc;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Iterator, oc.a {
    public final String A;
    public int B;
    public int L;
    public int R;
    public int X;

    public c(String str) {
        this.A = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i10 = this.B;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        int i11 = 2;
        if (this.X < 0) {
            this.B = 2;
            return false;
        }
        String str = this.A;
        int length = str.length();
        int length2 = str.length();
        for (int i12 = this.L; i12 < length2; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i11 = (charAt == '\r' && (i2 = i12 + 1) < str.length() && str.charAt(i2) == '\n') ? 1 : 1;
                length = i12;
                this.B = 1;
                this.X = i11;
                this.R = length;
                return true;
            }
        }
        i11 = -1;
        this.B = 1;
        this.X = i11;
        this.R = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.B = 0;
            int i2 = this.R;
            int i10 = this.L;
            this.L = this.X + i2;
            return this.A.subSequence(i10, i2).toString();
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
