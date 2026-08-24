package com.google.android.gms.common.internal.service;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zaj extends defpackage.hz7 implements com.google.android.gms.common.internal.service.zak {
    public zaj() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.ICommonCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // defpackage.hz7
    public final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto Le
            int r1 = r2.readInt()
            defpackage.kz7.b(r2)
            r0.zab(r1)
            return r3
        Le:
            r0 = 0
            return r0
    }
}
