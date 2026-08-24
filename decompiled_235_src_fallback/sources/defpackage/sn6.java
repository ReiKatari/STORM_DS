package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sn6  reason: default package */
/* loaded from: classes.dex */
public final class sn6 implements java.lang.Appendable, java.lang.CharSequence {
    public final java.lang.StringBuilder A;
    public final java.util.ArrayDeque B;

    public sn6() {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 8
            r0.<init>(r1)
            r2.B = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            r2.A = r0
            r0 = 0
            r2.b(r0, r1)
            return
    }

    public static void c(defpackage.sn6 r3, java.lang.Object r4, int r5, int r6) {
            if (r4 == 0) goto L26
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L1a
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r4.length
            r1 = 0
        L10:
            if (r1 >= r0) goto L26
            r2 = r4[r1]
            c(r3, r2, r5, r6)
            int r1 = r1 + 1
            goto L10
        L1a:
            java.util.ArrayDeque r3 = r3.B
            pn6 r0 = new pn6
            r1 = 33
            r0.<init>(r4, r5, r6, r1)
            r3.push(r0)
        L26:
            return
    }

    public final void a(char r1) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.A
            r0.append(r1)
            return
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(char r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.A
            r0.append(r2)
            return r1
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.StringBuilder r0 = r2.A
            int r1 = r0.length()
            r2.b(r1, r3)
            r0.append(r3)
            return r2
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.StringBuilder r2 = r0.A
            int r3 = r2.length()
            r0.b(r3, r1)
            r2.append(r1)
            return r0
    }

    public final void b(int r9, java.lang.CharSequence r10) {
            r8 = this;
            boolean r0 = r10 instanceof android.text.Spanned
            if (r0 == 0) goto L5d
            android.text.Spanned r10 = (android.text.Spanned) r10
            boolean r0 = r10 instanceof defpackage.qn6
            int r1 = r10.length()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            java.lang.Object[] r1 = r10.getSpans(r3, r1, r2)
            if (r1 == 0) goto L17
            int r2 = r1.length
            goto L18
        L17:
            r2 = r3
        L18:
            if (r2 <= 0) goto L5d
            java.util.ArrayDeque r8 = r8.B
            if (r0 == 0) goto L40
            int r2 = r2 + (-1)
        L20:
            if (r2 < 0) goto L5d
            r0 = r1[r2]
            r3 = r10
            android.text.SpannableStringBuilder r3 = (android.text.SpannableStringBuilder) r3
            int r4 = r3.getSpanStart(r0)
            int r4 = r4 + r9
            int r5 = r3.getSpanEnd(r0)
            int r5 = r5 + r9
            int r3 = r3.getSpanFlags(r0)
            pn6 r6 = new pn6
            r6.<init>(r0, r4, r5, r3)
            r8.push(r6)
            int r2 = r2 + (-1)
            goto L20
        L40:
            if (r3 >= r2) goto L5d
            r0 = r1[r3]
            int r4 = r10.getSpanStart(r0)
            int r4 = r4 + r9
            int r5 = r10.getSpanEnd(r0)
            int r5 = r5 + r9
            int r6 = r10.getSpanFlags(r0)
            pn6 r7 = new pn6
            r7.<init>(r0, r4, r5, r6)
            r8.push(r7)
            int r3 = r3 + 1
            goto L40
        L5d:
            return
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.A
            char r0 = r0.charAt(r1)
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r0 = this;
            java.lang.StringBuilder r0 = r0.A
            int r0 = r0.length()
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r7, int r8) {
            r6 = this;
            java.lang.StringBuilder r0 = r6.A
            int r1 = r0.length()
            r2 = 0
            if (r8 <= r7) goto L4e
            if (r7 < 0) goto L4e
            if (r8 > r1) goto L4e
            java.util.ArrayDeque r6 = r6.B
            if (r7 != 0) goto L20
            if (r1 != r8) goto L20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            java.util.Collections.reverse(r1)
            java.util.List r6 = java.util.Collections.unmodifiableList(r1)
            goto L50
        L20:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            java.util.Iterator r6 = r6.descendingIterator()
        L29:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r6.next()
            pn6 r3 = (defpackage.pn6) r3
            int r4 = r3.b
            if (r4 < r7) goto L3b
            if (r4 < r8) goto L45
        L3b:
            int r5 = r3.c
            if (r5 > r8) goto L41
            if (r5 > r7) goto L45
        L41:
            if (r4 >= r7) goto L29
            if (r5 <= r8) goto L29
        L45:
            r1.add(r3)
            goto L29
        L49:
            java.util.List r6 = java.util.Collections.unmodifiableList(r1)
            goto L50
        L4e:
            java.util.List r6 = java.util.Collections.EMPTY_LIST
        L50:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L5b
            java.lang.CharSequence r6 = r0.subSequence(r7, r8)
            return r6
        L5b:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r8 = r0.subSequence(r7, r8)
            r1.<init>(r8)
            int r8 = r1.length()
            java.util.Iterator r6 = r6.iterator()
        L6c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r6.next()
            pn6 r0 = (defpackage.pn6) r0
            int r3 = r0.b
            int r3 = r3 - r7
            int r3 = java.lang.Math.max(r2, r3)
            int r4 = r0.c
            int r5 = r0.b
            int r4 = r4 - r5
            int r4 = r4 + r3
            int r4 = java.lang.Math.min(r8, r4)
            java.lang.Object r5 = r0.a
            int r0 = r0.d
            r1.setSpan(r5, r3, r4, r0)
            goto L6c
        L91:
            return r1
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r0 = this;
            java.lang.StringBuilder r0 = r0.A
            java.lang.String r0 = r0.toString()
            return r0
    }
}
