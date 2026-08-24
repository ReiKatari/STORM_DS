package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zacr implements Runnable {
    final /* synthetic */ xz7 zaa;
    final /* synthetic */ zact zab;

    public zacr(zact zactVar, xz7 xz7Var) {
        this.zab = zactVar;
        this.zaa = xz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.zad(this.zab, this.zaa);
    }
}
