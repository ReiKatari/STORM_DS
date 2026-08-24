package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class zbb extends android.os.Binder implements android.os.IInterface {
    public zbb(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.attachInterface(r0, r1)
            return
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r0 = this;
            return r0
    }

    @Override // android.os.Binder
    public boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
            r1 = this;
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r2 <= r0) goto Ld
            boolean r0 = super.onTransact(r2, r3, r4, r5)
            if (r0 == 0) goto L14
            r1 = 1
            return r1
        Ld:
            java.lang.String r0 = r1.getInterfaceDescriptor()
            r3.enforceInterface(r0)
        L14:
            boolean r1 = r1.zba(r2, r3, r4, r5)
            return r1
    }

    public boolean zba(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
