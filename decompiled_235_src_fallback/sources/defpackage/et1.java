package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et1  reason: default package */
/* loaded from: classes.dex */
public final class et1 implements android.text.InputFilter {
    public final android.widget.TextView a;
    public defpackage.dt1 b;

    public et1(android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
            r3 = this;
            android.widget.TextView r0 = r3.a
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            ws1 r1 = defpackage.ws1.a()
            int r1 = r1.c()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            ws1 r3 = defpackage.ws1.a()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.g(r6, r5, r6, r4)
            return r3
        L48:
            return r4
        L49:
            ws1 r5 = defpackage.ws1.a()
            dt1 r6 = r3.b
            if (r6 != 0) goto L58
            dt1 r6 = new dt1
            r6.<init>(r0, r3)
            r3.b = r6
        L58:
            dt1 r3 = r3.b
            r5.h(r3)
            return r4
    }
}
