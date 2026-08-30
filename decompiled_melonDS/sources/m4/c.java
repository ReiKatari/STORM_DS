package m4;

import java.text.CharacterIterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements CharacterIterator {
    public final CharSequence A;
    public final int B;
    public int L = 0;

    public c(int i2, CharSequence charSequence) {
        this.A = charSequence;
        this.B = i2;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i2 = this.L;
        if (i2 == this.B) {
            return (char) 65535;
        }
        return this.A.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.L = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.B;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.L;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i2 = this.B;
        if (i2 == 0) {
            this.L = i2;
            return (char) 65535;
        }
        int i10 = i2 - 1;
        this.L = i10;
        return this.A.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i2 = this.L + 1;
        this.L = i2;
        int i10 = this.B;
        if (i2 >= i10) {
            this.L = i10;
            return (char) 65535;
        }
        return this.A.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i2 = this.L;
        if (i2 <= 0) {
            return (char) 65535;
        }
        int i10 = i2 - 1;
        this.L = i10;
        return this.A.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i2) {
        if (i2 <= this.B && i2 >= 0) {
            this.L = i2;
            return current();
        }
        a0.j.h("invalid position");
        return (char) 0;
    }
}
