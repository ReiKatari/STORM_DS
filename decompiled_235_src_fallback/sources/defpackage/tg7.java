package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tg7  reason: default package */
/* loaded from: classes.dex */
public final class tg7 implements android.text.Spannable {
    public boolean A;
    public android.text.Spannable B;

    public tg7(android.text.Spannable r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.A = r0
            r1.B = r2
            return
    }

    public final void a() {
            r3 = this;
            android.text.Spannable r0 = r3.B
            boolean r1 = r3.A
            if (r1 != 0) goto L28
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 >= r2) goto L14
            jd1 r1 = new jd1
            r2 = 29
            r1.<init>(r2)
            goto L1b
        L14:
            sg7 r1 = new sg7
            r2 = 29
            r1.<init>(r2)
        L1b:
            boolean r1 = r1.j(r0)
            if (r1 == 0) goto L28
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r3.B = r1
        L28:
            r0 = 1
            r3.A = r0
            return
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
            r0 = this;
            android.text.Spannable r0 = r0.B
            char r0 = r0.charAt(r1)
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream chars() {
            r0 = this;
            android.text.Spannable r0 = r0.B
            java.util.stream.IntStream r0 = r0.chars()
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
            r0 = this;
            android.text.Spannable r0 = r0.B
            java.util.stream.IntStream r0 = r0.codePoints()
            return r0
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(java.lang.Object r1) {
            r0 = this;
            android.text.Spannable r0 = r0.B
            int r0 = r0.getSpanEnd(r1)
            return r0
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(java.lang.Object r1) {
            r0 = this;
            android.text.Spannable r0 = r0.B
            int r0 = r0.getSpanFlags(r1)
            return r0
    }

    @Override // android.text.Spanned
    public final int getSpanStart(java.lang.Object r1) {
            r0 = this;
            android.text.Spannable r0 = r0.B
            int r0 = r0.getSpanStart(r1)
            return r0
    }

    @Override // android.text.Spanned
    public final java.lang.Object[] getSpans(int r1, int r2, java.lang.Class r3) {
            r0 = this;
            android.text.Spannable r0 = r0.B
            java.lang.Object[] r0 = r0.getSpans(r1, r2, r3)
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r0 = this;
            android.text.Spannable r0 = r0.B
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r1, int r2, java.lang.Class r3) {
            r0 = this;
            android.text.Spannable r0 = r0.B
            int r0 = r0.nextSpanTransition(r1, r2, r3)
            return r0
    }

    @Override // android.text.Spannable
    public final void removeSpan(java.lang.Object r1) {
            r0 = this;
            r0.a()
            android.text.Spannable r0 = r0.B
            r0.removeSpan(r1)
            return
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object r1, int r2, int r3, int r4) {
            r0 = this;
            r0.a()
            android.text.Spannable r0 = r0.B
            r0.setSpan(r1, r2, r3, r4)
            return
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            android.text.Spannable r0 = r0.B
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r0 = this;
            android.text.Spannable r0 = r0.B
            java.lang.String r0 = r0.toString()
            return r0
    }
}
