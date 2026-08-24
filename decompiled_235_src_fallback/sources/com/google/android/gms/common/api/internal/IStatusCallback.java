package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface IStatusCallback extends android.os.IInterface {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class Stub extends defpackage.hz7 implements com.google.android.gms.common.api.internal.IStatusCallback {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
                r1.<init>(r0)
                return
        }

        public static com.google.android.gms.common.api.internal.IStatusCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.common.api.internal.IStatusCallback
                if (r1 == 0) goto L11
                com.google.android.gms.common.api.internal.IStatusCallback r0 = (com.google.android.gms.common.api.internal.IStatusCallback) r0
                return r0
            L11:
                com.google.android.gms.common.api.internal.zaby r0 = new com.google.android.gms.common.api.internal.zaby
                r0.<init>(r2)
                return r0
        }

        @Override // defpackage.hz7
        public final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
                r0 = this;
                r3 = 1
                if (r1 != r3) goto L12
                android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
                android.os.Parcelable r1 = defpackage.kz7.a(r2, r1)
                com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
                defpackage.kz7.b(r2)
                r0.onResult(r1)
                return r3
            L12:
                r0 = 0
                return r0
        }
    }

    void onResult(com.google.android.gms.common.api.Status r1);
}
