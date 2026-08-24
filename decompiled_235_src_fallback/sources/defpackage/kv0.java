package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv0  reason: default package */
/* loaded from: classes.dex */
public final class kv0 extends defpackage.j9 {
    public final /* synthetic */ defpackage.mv0 h;

    public kv0(defpackage.mv0 r1) {
            r0 = this;
            r0.h = r1
            r0.<init>()
            return
    }

    @Override // defpackage.j9
    public final void b(int r9, defpackage.b9 r10, java.lang.Object r11) {
            r8 = this;
            r10.getClass()
            mv0 r0 = r8.h
            os0 r1 = r10.b(r0, r11)
            if (r1 == 0) goto L1e
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            r10.<init>(r11)
            xd0 r11 = new xd0
            r0 = 1
            r11.<init>(r8, r9, r0, r1)
            r10.post(r11)
            return
        L1e:
            android.content.Intent r10 = r10.a(r0, r11)
            android.os.Bundle r11 = r10.getExtras()
            if (r11 == 0) goto L3c
            android.os.Bundle r11 = r10.getExtras()
            r11.getClass()
            java.lang.ClassLoader r11 = r11.getClassLoader()
            if (r11 != 0) goto L3c
            java.lang.ClassLoader r11 = r0.getClassLoader()
            r10.setExtrasClassLoader(r11)
        L3c:
            java.lang.String r11 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            boolean r1 = r10.hasExtra(r11)
            if (r1 == 0) goto L4d
            android.os.Bundle r1 = r10.getBundleExtra(r11)
            r10.removeExtra(r11)
        L4b:
            r7 = r1
            goto L4f
        L4d:
            r1 = 0
            goto L4b
        L4f:
            java.lang.String r11 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
            java.lang.String r1 = r10.getAction()
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto Ld4
            java.lang.String r8 = "androidx.activity.result.contract.extra.PERMISSIONS"
            java.lang.String[] r8 = r10.getStringArrayExtra(r8)
            r10 = 0
            if (r8 != 0) goto L66
            java.lang.String[] r8 = new java.lang.String[r10]
        L66:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r1 = r10
        L6c:
            int r2 = r8.length
            if (r1 >= r2) goto La6
            r2 = r8[r1]
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L91
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 >= r3) goto L8e
            r2 = r8[r1]
            java.lang.String r3 = "android.permission.POST_NOTIFICATIONS"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L8e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r11.add(r2)
        L8e:
            int r1 = r1 + 1
            goto L6c
        L91:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Permission request for permissions "
            r9.<init>(r10)
            java.lang.String r8 = java.util.Arrays.toString(r8)
            java.lang.String r10 = " must not contain null or empty values"
            java.lang.String r8 = defpackage.i61.n(r9, r8, r10)
            defpackage.i.h(r8)
            return
        La6:
            int r1 = r11.size()
            if (r1 <= 0) goto Lb1
            int r2 = r8.length
            int r2 = r2 - r1
            java.lang.String[] r2 = new java.lang.String[r2]
            goto Lb2
        Lb1:
            r2 = r8
        Lb2:
            if (r1 <= 0) goto Ld0
            int r3 = r8.length
            if (r1 != r3) goto Lb8
            return
        Lb8:
            r1 = r10
        Lb9:
            int r3 = r8.length
            if (r10 >= r3) goto Ld0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            boolean r3 = r11.contains(r3)
            if (r3 != 0) goto Lcd
            int r3 = r1 + 1
            r4 = r8[r10]
            r2[r1] = r4
            r1 = r3
        Lcd:
            int r10 = r10 + 1
            goto Lb9
        Ld0:
            r0.requestPermissions(r8, r9)
            return
        Ld4:
            java.lang.String r11 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
            java.lang.String r1 = r10.getAction()
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L112
            java.lang.String r11 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
            android.os.Parcelable r10 = r10.getParcelableExtra(r11)
            s93 r10 = (defpackage.s93) r10
            r10.getClass()     // Catch: android.content.IntentSender.SendIntentException -> Lfc
            android.content.IntentSender r1 = r10.A     // Catch: android.content.IntentSender.SendIntentException -> Lfc
            android.content.Intent r3 = r10.B     // Catch: android.content.IntentSender.SendIntentException -> Lfc
            int r4 = r10.L     // Catch: android.content.IntentSender.SendIntentException -> Lfc
            int r5 = r10.R     // Catch: android.content.IntentSender.SendIntentException -> Lfc
            r6 = 0
            r2 = r9
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.content.IntentSender.SendIntentException -> Lf9
            return
        Lf9:
            r0 = move-exception
        Lfa:
            r9 = r0
            goto Lff
        Lfc:
            r0 = move-exception
            r2 = r9
            goto Lfa
        Lff:
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            r10.<init>(r11)
            xd0 r11 = new xd0
            r0 = 2
            r11.<init>(r8, r2, r0, r9)
            r10.post(r11)
            return
        L112:
            r2 = r9
            r0.startActivityForResult(r10, r2, r7)
            return
    }
}
