package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv3  reason: default package */
/* loaded from: classes.dex */
public final class uv3 extends android.text.style.URLSpan {
    public final defpackage.f14 A;
    public final java.lang.String B;
    public final defpackage.w31 L;

    public uv3(defpackage.f14 r1, java.lang.String r2, defpackage.w31 r3) {
            r0 = this;
            r0.<init>(r2)
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(android.view.View r4) {
            r3 = this;
            w31 r0 = r3.L
            r0.getClass()
            java.lang.String r3 = r3.B
            android.net.Uri r0 = android.net.Uri.parse(r3)
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L23
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "https"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            android.net.Uri r0 = r0.build()
        L23:
            android.content.Context r4 = r4.getContext()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2, r0)
            java.lang.String r0 = "com.android.browser.application_id"
            java.lang.String r2 = r4.getPackageName()
            r1.putExtra(r0, r2)
            r4.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L3b
            return
        L3b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Actvity was not found for the link: '"
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r3 = "'"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "LinkResolverDef"
            android.util.Log.w(r4, r3)
            return
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r1) {
            r0 = this;
            f14 r0 = r0.A
            r0.getClass()
            r0 = 1
            r1.setUnderlineText(r0)
            int r0 = r1.linkColor
            r1.setColor(r0)
            return
    }
}
