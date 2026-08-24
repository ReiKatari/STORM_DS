package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc  reason: default package */
/* loaded from: classes.dex */
public final class oc implements android.text.method.TransformationMethod {
    public java.util.Locale A;

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.toString()
            java.util.Locale r0 = r0.A
            java.lang.String r0 = r1.toUpperCase(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View r1, java.lang.CharSequence r2, boolean r3, int r4, android.graphics.Rect r5) {
            r0 = this;
            return
    }
}
