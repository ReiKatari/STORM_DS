package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv3  reason: default package */
/* loaded from: classes.dex */
public final class kv3 implements Iterator, zf3 {
    public final CharSequence A;
    public int B;
    public int L;
    public int R;
    public int X;

    public kv3(CharSequence charSequence) {
        charSequence.getClass();
        this.A = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.B;
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        int i3 = 2;
        if (this.X < 0) {
            this.B = 2;
            return false;
        }
        CharSequence charSequence = this.A;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.L; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i3 = (charAt == '\r' && (i = i4 + 1) < charSequence.length() && charSequence.charAt(i) == '\n') ? 1 : 1;
                length = i4;
                this.B = 1;
                this.X = i3;
                this.R = length;
                return true;
            }
        }
        i3 = -1;
        this.B = 1;
        this.X = i3;
        this.R = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.B = 0;
            int i = this.R;
            int i2 = this.L;
            this.L = this.X + i;
            return this.A.subSequence(i2, i).toString();
        }
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
