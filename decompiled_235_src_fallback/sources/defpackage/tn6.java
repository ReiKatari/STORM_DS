package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tn6  reason: default package */
/* loaded from: classes.dex */
public final class tn6 extends android.text.SpannableStringBuilder {
    public final java.lang.Class A;
    public final java.util.ArrayList B;

    public tn6(java.lang.Class r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.B = r2
            java.lang.String r2 = "watcherClass cannot be null"
            defpackage.np2.x(r1, r2)
            r0.A = r1
            return
    }

    public tn6(java.lang.Class r1, defpackage.tn6 r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.B = r2
            java.lang.String r2 = "watcherClass cannot be null"
            defpackage.np2.x(r1, r2)
            r0.A = r1
            return
    }

    public final void a() {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.B
            int r2 = r1.size()
            if (r0 >= r2) goto L17
            java.lang.Object r1 = r1.get(r0)
            rn6 r1 = (defpackage.rn6) r1
            java.util.concurrent.atomic.AtomicInteger r1 = r1.B
            r1.incrementAndGet()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(char r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(char r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence r1, java.lang.Object r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(char r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    public final void b() {
            r5 = this;
            r5.e()
            r0 = 0
            r1 = r0
        L5:
            java.util.ArrayList r2 = r5.B
            int r3 = r2.size()
            if (r1 >= r3) goto L21
            java.lang.Object r2 = r2.get(r1)
            rn6 r2 = (defpackage.rn6) r2
            int r3 = r5.length()
            int r4 = r5.length()
            r2.onTextChanged(r5, r0, r3, r4)
            int r1 = r1 + 1
            goto L5
        L21:
            return
    }

    public final defpackage.rn6 c(java.lang.Object r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.B
            int r2 = r1.size()
            if (r0 >= r2) goto L17
            java.lang.Object r1 = r1.get(r0)
            rn6 r1 = (defpackage.rn6) r1
            java.lang.Object r2 = r1.A
            if (r2 != r4) goto L14
            return r1
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            r3 = 0
            return r3
    }

    public final boolean d(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto Lc
            java.lang.Class r1 = r1.getClass()
            java.lang.Class r0 = r0.A
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable delete(int r1, int r2) {
            r0 = this;
            super.delete(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder delete(int r1, int r2) {
            r0 = this;
            super.delete(r1, r2)
            return r0
    }

    public final void e() {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.B
            int r2 = r1.size()
            if (r0 >= r2) goto L17
            java.lang.Object r1 = r1.get(r0)
            rn6 r1 = (defpackage.rn6) r1
            java.util.concurrent.atomic.AtomicInteger r1 = r1.B
            r1.decrementAndGet()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Ld
            rn6 r0 = r1.c(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r1 = super.getSpanEnd(r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Ld
            rn6 r0 = r1.c(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r1 = super.getSpanFlags(r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Ld
            rn6 r0 = r1.c(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r1 = super.getSpanStart(r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final java.lang.Object[] getSpans(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            java.lang.Class r0 = r1.A
            if (r0 != r4) goto L21
            java.lang.Class<rn6> r0 = defpackage.rn6.class
            java.lang.Object[] r1 = super.getSpans(r2, r3, r0)
            rn6[] r1 = (defpackage.rn6[]) r1
            int r2 = r1.length
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r4, r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 0
        L14:
            int r4 = r1.length
            if (r3 >= r4) goto L20
            r4 = r1[r3]
            java.lang.Object r4 = r4.A
            r2[r3] = r4
            int r3 = r3 + 1
            goto L14
        L20:
            return r2
        L21:
            java.lang.Object[] r1 = super.getSpans(r2, r3, r4)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int r1, java.lang.CharSequence r2) {
            r0 = this;
            super.insert(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int r1, java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            super.insert(r1, r2, r3, r4)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int r1, java.lang.CharSequence r2) {
            r0 = this;
            super.insert(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int r1, java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            super.insert(r1, r2, r3, r4)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            if (r4 == 0) goto L6
            java.lang.Class r0 = r1.A
            if (r0 != r4) goto L8
        L6:
            java.lang.Class<rn6> r4 = defpackage.rn6.class
        L8:
            int r1 = super.nextSpanTransition(r2, r3, r4)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Le
            rn6 r0 = r1.c(r2)
            if (r0 == 0) goto Lf
            r2 = r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            super.removeSpan(r2)
            if (r0 == 0) goto L19
            java.util.ArrayList r1 = r1.B
            r1.remove(r0)
        L19:
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int r1, int r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.replace(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int r1, int r2, java.lang.CharSequence r3, int r4, int r5) {
            r0 = this;
            r0.replace(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.a()
            super.replace(r1, r2, r3)
            r0.e()
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3, int r4, int r5) {
            r0 = this;
            r0.a()
            super.replace(r1, r2, r3, r4, r5)
            r0.e()
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto L11
            rn6 r0 = new rn6
            r0.<init>(r2)
            java.util.ArrayList r2 = r1.B
            r2.add(r0)
            r2 = r0
        L11:
            super.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r3, int r4) {
            r2 = this;
            tn6 r0 = new tn6
            java.lang.Class r1 = r2.A
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
