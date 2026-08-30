package x5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f14353e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f14354a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14355b;

    /* renamed from: c  reason: collision with root package name */
    public int f14356c;

    /* renamed from: d  reason: collision with root package name */
    public char f14357d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f14353e[i2] = Character.getDirectionality(i2);
        }
    }

    public a(CharSequence charSequence) {
        this.f14354a = charSequence;
        this.f14355b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f14354a;
        char charAt = charSequence.charAt(this.f14356c - 1);
        this.f14357d = charAt;
        boolean isLowSurrogate = Character.isLowSurrogate(charAt);
        int i2 = this.f14356c;
        if (isLowSurrogate) {
            int codePointBefore = Character.codePointBefore(charSequence, i2);
            this.f14356c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f14356c = i2 - 1;
        char c4 = this.f14357d;
        if (c4 < 1792) {
            return f14353e[c4];
        }
        return Character.getDirectionality(c4);
    }
}
