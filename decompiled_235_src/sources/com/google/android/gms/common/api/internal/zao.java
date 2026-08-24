package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zao implements Runnable {
    final /* synthetic */ zap zaa;
    private final zam zab;

    public zao(zap zapVar, zam zamVar) {
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zaa.zaa) {
            return;
        }
        ConnectionResult zab = this.zab.zab();
        boolean hasResolution = zab.hasResolution();
        zap zapVar = this.zaa;
        if (hasResolution) {
            zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(zab.getResolution()), this.zab.zaa(), false), 1);
            return;
        }
        if (zapVar.zac.getErrorResolutionIntent(zapVar.getActivity(), zab.getErrorCode(), null) != null) {
            zap zapVar2 = this.zaa;
            zapVar2.zac.zag(zapVar2.getActivity(), zapVar2.mLifecycleFragment, zab.getErrorCode(), 2, this.zaa);
            return;
        }
        int errorCode = zab.getErrorCode();
        zap zapVar3 = this.zaa;
        if (errorCode != 18) {
            zapVar3.zaa(zab, this.zab.zaa());
            return;
        }
        Dialog zab2 = zapVar3.zac.zab(zapVar3.getActivity(), zapVar3);
        zap zapVar4 = this.zaa;
        zapVar4.zac.zac(zapVar4.getActivity().getApplicationContext(), new zan(this, zab2));
    }
}
