package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaar extends jz7 {
    private final WeakReference zaa;

    public zaar(zaaw zaawVar) {
        this.zaa = new WeakReference(zaawVar);
    }

    @Override // defpackage.mz7
    public final void zab(xz7 xz7Var) {
        zabi zabiVar;
        zaaw zaawVar = (zaaw) this.zaa.get();
        if (zaawVar != null) {
            zabiVar = zaawVar.zaa;
            zabiVar.zal(new zaaq(this, zaawVar, zaawVar, xz7Var));
        }
    }
}
