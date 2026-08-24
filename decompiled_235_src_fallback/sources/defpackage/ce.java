package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce  reason: default package */
/* loaded from: classes.dex */
public final class ce implements defpackage.tr0 {
    public final defpackage.de a;

    public ce(defpackage.de r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final void a(defpackage.sr0 r2) {
            r1 = this;
            de r1 = r1.a
            if (r2 != 0) goto L20
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r2 < r0) goto L12
            android.content.ClipboardManager r1 = r1.a()
            defpackage.j2.l(r1)
            goto L29
        L12:
            android.content.ClipboardManager r1 = r1.a()
            java.lang.String r2 = ""
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r2, r2)
            r1.setPrimaryClip(r2)
            goto L29
        L20:
            android.content.ClipboardManager r1 = r1.a()
            android.content.ClipData r2 = r2.a
            r1.setPrimaryClip(r2)
        L29:
            return
    }
}
