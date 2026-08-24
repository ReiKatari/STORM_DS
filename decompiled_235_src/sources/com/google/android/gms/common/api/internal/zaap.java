package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaap extends zaav {
    final /* synthetic */ zaaw zaa;
    private final ArrayList zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaap(zaaw zaawVar, ArrayList arrayList) {
        super(zaawVar, null);
        this.zaa = zaawVar;
        this.zac = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    public final void zaa() {
        zabi zabiVar;
        IAccountAccessor iAccountAccessor;
        zabi zabiVar2;
        zaaw zaawVar = this.zaa;
        zabiVar = zaawVar.zaa;
        zabiVar.zag.zad = zaaw.zao(zaawVar);
        ArrayList arrayList = this.zac;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zaaw zaawVar2 = this.zaa;
            iAccountAccessor = zaawVar2.zao;
            zabiVar2 = zaawVar2.zaa;
            ((Api.Client) arrayList.get(i)).getRemoteService(iAccountAccessor, zabiVar2.zag.zad);
        }
    }
}
