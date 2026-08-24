package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot1  reason: default package */
/* loaded from: classes.dex */
public final class ot1 implements android.text.method.TransformationMethod {
    public final android.text.method.TransformationMethod A;

    public ot1(android.text.method.TransformationMethod r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L7
            return r2
        L7:
            android.text.method.TransformationMethod r1 = r1.A
            if (r1 == 0) goto Lf
            java.lang.CharSequence r2 = r1.getTransformation(r2, r3)
        Lf:
            if (r2 == 0) goto L2e
            ws1 r1 = defpackage.ws1.a()
            int r1 = r1.c()
            r3 = 1
            if (r1 == r3) goto L1d
            goto L2e
        L1d:
            ws1 r1 = defpackage.ws1.a()
            r1.getClass()
            int r3 = r2.length()
            r0 = 0
            java.lang.CharSequence r1 = r1.g(r0, r3, r0, r2)
            return r1
        L2e:
            return r2
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View r1, java.lang.CharSequence r2, boolean r3, int r4, android.graphics.Rect r5) {
            r0 = this;
            android.text.method.TransformationMethod r0 = r0.A
            if (r0 == 0) goto L7
            r0.onFocusChanged(r1, r2, r3, r4, r5)
        L7:
            return
    }
}
