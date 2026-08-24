package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {
    protected int zaa;

    public GoogleApiActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zaa = r0
            return
    }

    public static android.content.Intent zaa(android.content.Context r2, android.app.PendingIntent r3, int r4, boolean r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r1 = com.google.android.gms.common.api.GoogleApiActivity.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "pending_intent"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "failing_client_id"
            r0.putExtra(r2, r4)
            java.lang.String r2 = "notify_manager"
            r0.putExtra(r2, r5)
            return r0
    }

    private final void zab() {
            r12 = this;
            android.content.Intent r0 = r12.getIntent()
            android.os.Bundle r1 = r0.getExtras()
            java.lang.String r2 = "GoogleApiActivity"
            if (r1 != 0) goto L15
            java.lang.String r0 = "Activity started without extras"
            android.util.Log.e(r2, r0)
            r12.finish()
            return
        L15:
            java.lang.String r0 = "pending_intent"
            java.lang.Object r0 = r1.get(r0)
            r3 = r0
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            java.lang.String r0 = "error_code"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r3 != 0) goto L34
            if (r0 == 0) goto L2b
            goto L34
        L2b:
            java.lang.String r0 = "Activity started without resolution"
            android.util.Log.e(r2, r0)
            r12.finish()
            return
        L34:
            r4 = 1
            if (r3 == 0) goto La4
            android.content.IntentSender r6 = r3.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> L4d android.content.ActivityNotFoundException -> L59
            r10 = 0
            r11 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r5 = r12
            r5.startIntentSenderForResult(r6, r7, r8, r9, r10, r11)     // Catch: android.content.IntentSender.SendIntentException -> L47 android.content.ActivityNotFoundException -> L4a
            r5.zaa = r4     // Catch: android.content.IntentSender.SendIntentException -> L47 android.content.ActivityNotFoundException -> L4a
            return
        L47:
            r0 = move-exception
        L48:
            r12 = r0
            goto L50
        L4a:
            r0 = move-exception
        L4b:
            r12 = r0
            goto L5c
        L4d:
            r0 = move-exception
            r5 = r12
            goto L48
        L50:
            java.lang.String r0 = "Failed to launch pendingIntent"
            android.util.Log.e(r2, r0, r12)
            r5.finish()
            return
        L59:
            r0 = move-exception
            r5 = r12
            goto L4b
        L5c:
            java.lang.String r0 = "notify_manager"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L7f
            com.google.android.gms.common.api.internal.GoogleApiManager r12 = com.google.android.gms.common.api.internal.GoogleApiManager.zak(r5)
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 22
            r2 = 0
            r0.<init>(r1, r2)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r2 = "failing_client_id"
            r3 = -1
            int r1 = r1.getIntExtra(r2, r3)
            r12.zax(r0, r1)
            goto L9e
        L7f:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "Activity not found while launching "
            java.lang.String r3 = "."
            java.lang.String r0 = defpackage.lb1.A(r1, r0, r3)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r3 = "generic"
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L9b
            java.lang.String r1 = " This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."
            java.lang.String r0 = r0.concat(r1)
        L9b:
            android.util.Log.e(r2, r0, r12)
        L9e:
            r5.zaa = r4
            r5.finish()
            return
        La4:
            r5 = r12
            java.lang.Object r12 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r1 = 2
            r0.showErrorDialogFragment(r5, r12, r1, r5)
            r5.zaa = r4
            return
    }

    @Override // android.app.Activity
    public final void onActivityResult(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L3c
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r2 = "notify_manager"
            boolean r4 = r4.getBooleanExtra(r2, r1)
            r3.zaa = r0
            r3.setResult(r5, r6)
            if (r4 == 0) goto L44
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zak(r3)
            r6 = -1
            if (r5 == r6) goto L38
            if (r5 == 0) goto L22
            goto L44
        L22:
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
            r0 = 13
            r1 = 0
            r5.<init>(r0, r1)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "failing_client_id"
            int r6 = r0.getIntExtra(r1, r6)
            r4.zax(r5, r6)
            goto L44
        L38:
            r4.zay()
            goto L44
        L3c:
            r1 = 2
            if (r4 != r1) goto L44
            r3.zaa = r0
            r3.setResult(r5, r6)
        L44:
            r3.finish()
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            r1 = 0
            r0.zaa = r1
            r0.setResult(r1)
            r0.finish()
            return
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 == 0) goto Ld
            java.lang.String r0 = "resolution"
            int r2 = r2.getInt(r0)
            r1.zaa = r2
        Ld:
            int r2 = r1.zaa
            r0 = 1
            if (r2 == r0) goto L15
            r1.zab()
        L15:
            return
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "resolution"
            int r1 = r2.zaa
            r3.putInt(r0, r1)
            super.onSaveInstanceState(r3)
            return
    }
}
