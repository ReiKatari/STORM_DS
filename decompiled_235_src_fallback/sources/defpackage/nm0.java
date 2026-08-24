package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm0  reason: default package */
/* loaded from: classes.dex */
public final class nm0 implements java.text.CharacterIterator {
    public final java.lang.CharSequence A;
    public final int B;
    public int L;

    public nm0(int r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.<init>()
            r0.A = r2
            r0.B = r1
            r1 = 0
            r0.L = r1
            return
    }

    @Override // java.text.CharacterIterator
    public final java.lang.Object clone() {
            r0 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L5
            return r0
        L5:
            java.lang.InternalError r0 = new java.lang.InternalError
            r0.<init>()
            throw r0
    }

    @Override // java.text.CharacterIterator
    public final char current() {
            r2 = this;
            int r0 = r2.L
            int r1 = r2.B
            if (r0 != r1) goto La
            r2 = 65535(0xffff, float:9.1834E-41)
            return r2
        La:
            java.lang.CharSequence r2 = r2.A
            char r2 = r2.charAt(r0)
            return r2
    }

    @Override // java.text.CharacterIterator
    public final char first() {
            r1 = this;
            r0 = 0
            r1.L = r0
            char r1 = r1.current()
            return r1
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
            r0 = this;
            int r0 = r0.L
            return r0
    }

    @Override // java.text.CharacterIterator
    public final char last() {
            r1 = this;
            int r0 = r1.B
            if (r0 != 0) goto La
            r1.L = r0
            r1 = 65535(0xffff, float:9.1834E-41)
            return r1
        La:
            int r0 = r0 + (-1)
            r1.L = r0
            java.lang.CharSequence r1 = r1.A
            char r1 = r1.charAt(r0)
            return r1
    }

    @Override // java.text.CharacterIterator
    public final char next() {
            r2 = this;
            int r0 = r2.L
            int r0 = r0 + 1
            r2.L = r0
            int r1 = r2.B
            if (r0 < r1) goto L10
            r2.L = r1
            r2 = 65535(0xffff, float:9.1834E-41)
            return r2
        L10:
            java.lang.CharSequence r2 = r2.A
            char r2 = r2.charAt(r0)
            return r2
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
            r1 = this;
            int r0 = r1.L
            if (r0 > 0) goto L8
            r1 = 65535(0xffff, float:9.1834E-41)
            return r1
        L8:
            int r0 = r0 + (-1)
            r1.L = r0
            java.lang.CharSequence r1 = r1.A
            char r1 = r1.charAt(r0)
            return r1
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int r2) {
            r1 = this;
            int r0 = r1.B
            if (r2 > r0) goto Ld
            if (r2 < 0) goto Ld
            r1.L = r2
            char r1 = r1.current()
            return r1
        Ld:
            java.lang.String r1 = "invalid position"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }
}
