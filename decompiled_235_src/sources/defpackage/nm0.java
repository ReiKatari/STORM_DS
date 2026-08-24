package defpackage;

import java.text.CharacterIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm0  reason: default package */
/* loaded from: classes.dex */
public final class nm0 implements CharacterIterator {
    public final CharSequence A;
    public final int B;
    public int L = 0;

    public nm0(int i, CharSequence charSequence) {
        this.A = charSequence;
        this.B = i;
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
        int i = this.L;
        if (i == this.B) {
            return (char) 65535;
        }
        return this.A.charAt(i);
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
        int i = this.B;
        if (i == 0) {
            this.L = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.L = i2;
        return this.A.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.L + 1;
        this.L = i;
        int i2 = this.B;
        if (i >= i2) {
            this.L = i2;
            return (char) 65535;
        }
        return this.A.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.L;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.L = i2;
        return this.A.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i <= this.B && i >= 0) {
            this.L = i;
            return current();
        }
        i.h("invalid position");
        return (char) 0;
    }
}
