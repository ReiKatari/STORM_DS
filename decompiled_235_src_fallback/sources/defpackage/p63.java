package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p63  reason: default package */
/* loaded from: classes.dex */
public final class p63 extends android.view.inputmethod.InputConnectionWrapper {
    public final /* synthetic */ defpackage.h61 a;

    public p63(android.view.inputmethod.InputConnection r1, defpackage.h61 r2) {
            r0 = this;
            r0.a = r2
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String r12, android.os.Bundle r13) {
            r11 = this;
            h61 r0 = r11.a
            r1 = 1
            r2 = 0
            if (r13 != 0) goto L8
            goto L86
        L8:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r12)
            if (r3 == 0) goto L12
            r3 = r2
            goto L1b
        L12:
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r12)
            if (r3 == 0) goto L86
            r3 = r1
        L1b:
            r4 = 0
            if (r3 == 0) goto L24
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L26
        L21:
            r11 = move-exception
            r5 = r4
            goto L80
        L24:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L26:
            android.os.Parcelable r5 = r13.getParcelable(r5)     // Catch: java.lang.Throwable -> L21
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L33
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L35
        L31:
            r11 = move-exception
            goto L80
        L33:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L35:
            android.os.Parcelable r6 = r13.getParcelable(r6)     // Catch: java.lang.Throwable -> L31
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L40
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L42
        L40:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L42:
            android.os.Parcelable r7 = r13.getParcelable(r7)     // Catch: java.lang.Throwable -> L31
            android.content.ClipDescription r7 = (android.content.ClipDescription) r7     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L4d
            java.lang.String r8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L4f
        L4d:
            java.lang.String r8 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L4f:
            android.os.Parcelable r8 = r13.getParcelable(r8)     // Catch: java.lang.Throwable -> L31
            android.net.Uri r8 = (android.net.Uri) r8     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L5a
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L5c
        L5a:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L5c:
            int r9 = r13.getInt(r9)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L65
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L67
        L65:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L67:
            android.os.Parcelable r3 = r13.getParcelable(r3)     // Catch: java.lang.Throwable -> L31
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L7a
            if (r7 == 0) goto L7a
            s63 r10 = new s63     // Catch: java.lang.Throwable -> L31
            r10.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L31
            boolean r2 = r0.g(r10, r9, r3)     // Catch: java.lang.Throwable -> L31
        L7a:
            if (r5 == 0) goto L86
            r5.send(r2, r4)
            goto L86
        L80:
            if (r5 == 0) goto L85
            r5.send(r2, r4)
        L85:
            throw r11
        L86:
            if (r2 == 0) goto L89
            return r1
        L89:
            boolean r11 = super.performPrivateCommand(r12, r13)
            return r11
    }
}
