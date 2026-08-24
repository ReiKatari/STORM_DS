package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zae extends com.google.android.gms.common.internal.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ androidx.fragment.app.o zab;
    final /* synthetic */ int zac;

    public zae(android.content.Intent r1, androidx.fragment.app.o r2, int r3) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
            r2 = this;
            android.content.Intent r0 = r2.zaa
            if (r0 == 0) goto Lb
            androidx.fragment.app.o r1 = r2.zab
            int r2 = r2.zac
            r1.startActivityForResult(r0, r2)
        Lb:
            return
    }
}
