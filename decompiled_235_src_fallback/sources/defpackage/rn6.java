package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rn6  reason: default package */
/* loaded from: classes.dex */
public final class rn6 implements android.text.TextWatcher, android.text.SpanWatcher {
    public final java.lang.Object A;
    public final java.util.concurrent.atomic.AtomicInteger B;

    public rn6(java.lang.Object r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.B = r0
            r2.A = r3
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            java.lang.Object r0 = r0.A
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            r0.afterTextChanged(r1)
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            java.lang.Object r0 = r0.A
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            r0.beforeTextChanged(r1, r2, r3, r4)
            return
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(android.text.Spannable r2, java.lang.Object r3, int r4, int r5) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.B
            int r0 = r0.get()
            if (r0 <= 0) goto Ld
            boolean r0 = r3 instanceof defpackage.se7
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Object r1 = r1.A
            android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
            r1.onSpanAdded(r2, r3, r4, r5)
            return
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r8.B
            int r0 = r0.get()
            if (r0 <= 0) goto Ld
            boolean r0 = r10 instanceof defpackage.se7
            if (r0 == 0) goto Ld
            return
        Ld:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L1c
            r0 = 0
            if (r11 <= r12) goto L17
            r11 = r0
        L17:
            if (r13 <= r14) goto L1c
            r4 = r11
            r6 = r0
            goto L1e
        L1c:
            r4 = r11
            r6 = r13
        L1e:
            java.lang.Object r8 = r8.A
            r1 = r8
            android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r14
            r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(android.text.Spannable r2, java.lang.Object r3, int r4, int r5) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.B
            int r0 = r0.get()
            if (r0 <= 0) goto Ld
            boolean r0 = r3 instanceof defpackage.se7
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Object r1 = r1.A
            android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
            r1.onSpanRemoved(r2, r3, r4, r5)
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            java.lang.Object r0 = r0.A
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            r0.onTextChanged(r1, r2, r3, r4)
            return
    }
}
