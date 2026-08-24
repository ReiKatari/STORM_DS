package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.o;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zae extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ o zab;
    final /* synthetic */ int zac;

    public zae(Intent intent, o oVar, int i) {
        this.zaa = intent;
        this.zab = oVar;
        this.zac = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
