package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaz extends gj5 {
    private static final zaz zaa = new zaz();

    private zaz() {
    }

    public static View zaa(Context context, int i, int i2) {
        zaz zazVar = zaa;
        try {
            zax zaxVar = new zax(1, i, i2, null);
            return (View) zh4.d(((zam) zazVar.getRemoteCreatorInstance(context)).zae(new zh4(context), zaxVar));
        } catch (Exception e) {
            throw new Exception(lb1.j("Could not get button with size ", i, i2, " and color "), e);
        }
    }

    @Override // defpackage.gj5
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof zam) {
            return (zam) queryLocalInterface;
        }
        return new zam(iBinder);
    }
}
