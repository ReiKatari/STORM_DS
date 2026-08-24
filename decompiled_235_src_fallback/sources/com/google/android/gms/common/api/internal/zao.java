package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zao implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zap zaa;
    private final com.google.android.gms.common.api.internal.zam zab;

    public zao(com.google.android.gms.common.api.internal.zap r1, com.google.android.gms.common.api.internal.zam r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            com.google.android.gms.common.api.internal.zap r0 = r8.zaa
            boolean r0 = r0.zaa
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.gms.common.api.internal.zam r0 = r8.zab
            com.google.android.gms.common.ConnectionResult r0 = r0.zab()
            boolean r1 = r0.hasResolution()
            com.google.android.gms.common.api.internal.zap r2 = r8.zaa
            if (r1 == 0) goto L35
            com.google.android.gms.common.api.internal.LifecycleFragment r1 = r2.mLifecycleFragment
            android.app.Activity r2 = r2.getActivity()
            android.app.PendingIntent r0 = r0.getResolution()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            com.google.android.gms.common.api.internal.zam r8 = r8.zab
            int r8 = r8.zaa()
            r3 = 0
            android.content.Intent r8 = com.google.android.gms.common.api.GoogleApiActivity.zaa(r2, r0, r8, r3)
            r0 = 1
            r1.startActivityForResult(r8, r0)
            return
        L35:
            android.app.Activity r1 = r2.getActivity()
            int r3 = r0.getErrorCode()
            com.google.android.gms.common.GoogleApiAvailability r2 = r2.zac
            r4 = 0
            android.content.Intent r1 = r2.getErrorResolutionIntent(r1, r3, r4)
            if (r1 == 0) goto L5b
            com.google.android.gms.common.api.internal.zap r1 = r8.zaa
            android.app.Activity r3 = r1.getActivity()
            com.google.android.gms.common.api.internal.LifecycleFragment r4 = r1.mLifecycleFragment
            int r5 = r0.getErrorCode()
            com.google.android.gms.common.api.internal.zap r7 = r8.zaa
            com.google.android.gms.common.GoogleApiAvailability r2 = r1.zac
            r6 = 2
            r2.zag(r3, r4, r5, r6, r7)
            return
        L5b:
            int r1 = r0.getErrorCode()
            com.google.android.gms.common.api.internal.zap r2 = r8.zaa
            r3 = 18
            if (r1 != r3) goto L84
            com.google.android.gms.common.GoogleApiAvailability r0 = r2.zac
            android.app.Activity r1 = r2.getActivity()
            android.app.Dialog r0 = r0.zab(r1, r2)
            com.google.android.gms.common.api.internal.zap r1 = r8.zaa
            android.app.Activity r2 = r1.getActivity()
            android.content.Context r2 = r2.getApplicationContext()
            com.google.android.gms.common.api.internal.zan r3 = new com.google.android.gms.common.api.internal.zan
            r3.<init>(r8, r0)
            com.google.android.gms.common.GoogleApiAvailability r8 = r1.zac
            r8.zac(r2, r3)
            return
        L84:
            com.google.android.gms.common.api.internal.zam r8 = r8.zab
            int r8 = r8.zaa()
            com.google.android.gms.common.api.internal.zap.zaf(r2, r0, r8)
            return
    }
}
