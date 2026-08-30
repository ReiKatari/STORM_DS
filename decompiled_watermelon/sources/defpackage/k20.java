package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k20  reason: default package */
/* loaded from: classes.dex */
public final class k20 {
    public static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public k20(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.a;
        char charAt = charSequence.charAt(this.c - 1);
        this.d = charAt;
        boolean isLowSurrogate = Character.isLowSurrogate(charAt);
        int i = this.c;
        if (isLowSurrogate) {
            int codePointBefore = Character.codePointBefore(charSequence, i);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c = i - 1;
        char c = this.d;
        if (c < 1792) {
            return e[c];
        }
        return Character.getDirectionality(c);
    }
}
