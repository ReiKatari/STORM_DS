package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct1  reason: default package */
/* loaded from: classes.dex */
public final class ct1 extends android.view.inputmethod.InputConnectionWrapper {
    public final android.widget.TextView a;
    public final defpackage.q61 b;

    public ct1(android.view.inputmethod.EditorInfo r3, android.view.inputmethod.InputConnection r4, android.widget.TextView r5) {
            r2 = this;
            q61 r0 = new q61
            r0.<init>()
            r1 = 0
            r2.<init>(r4, r1)
            r2.a = r5
            r2.b = r0
            boolean r2 = defpackage.ws1.d()
            if (r2 == 0) goto L1a
            ws1 r2 = defpackage.ws1.a()
            r2.i(r3)
        L1a:
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
            r2 = this;
            android.widget.TextView r0 = r2.a
            android.text.Editable r0 = r0.getEditableText()
            q61 r1 = r2.b
            r1.getClass()
            r1 = 0
            boolean r0 = defpackage.q61.n(r2, r0, r3, r4, r1)
            if (r0 != 0) goto L1a
            boolean r2 = super.deleteSurroundingText(r3, r4)
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r2 = 1
            return r2
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r3, int r4) {
            r2 = this;
            android.widget.TextView r0 = r2.a
            android.text.Editable r0 = r0.getEditableText()
            q61 r1 = r2.b
            r1.getClass()
            r1 = 1
            boolean r0 = defpackage.q61.n(r2, r0, r3, r4, r1)
            if (r0 != 0) goto L1b
            boolean r2 = super.deleteSurroundingTextInCodePoints(r3, r4)
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            return r1
    }
}
