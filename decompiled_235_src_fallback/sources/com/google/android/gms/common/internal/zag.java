package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zag implements android.content.DialogInterface.OnClickListener {
    public zag() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.internal.zag zab(android.app.Activity r1, android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zad r0 = new com.google.android.gms.common.internal.zad
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static com.google.android.gms.common.internal.zag zac(androidx.fragment.app.o r1, android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zae r0 = new com.google.android.gms.common.internal.zae
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static com.google.android.gms.common.internal.zag zad(com.google.android.gms.common.api.internal.LifecycleFragment r1, android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zaf r3 = new com.google.android.gms.common.internal.zaf
            r0 = 2
            r3.<init>(r2, r1, r0)
            return r3
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            r3.zaa()     // Catch: java.lang.Throwable -> L4 android.content.ActivityNotFoundException -> L6
            goto L1c
        L4:
            r3 = move-exception
            goto L20
        L6:
            r3 = move-exception
            java.lang.String r5 = "Failed to start resolution intent."
            java.lang.String r0 = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."
            java.lang.String r1 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L4
            java.lang.String r2 = "generic"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L4
            r2 = 1
            if (r2 != r1) goto L17
            r5 = r0
        L17:
            java.lang.String r0 = "DialogRedirect"
            android.util.Log.e(r0, r5, r3)     // Catch: java.lang.Throwable -> L4
        L1c:
            r4.dismiss()
            return
        L20:
            r4.dismiss()
            throw r3
    }

    public abstract void zaa();
}
