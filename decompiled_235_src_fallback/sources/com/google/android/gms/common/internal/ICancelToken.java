package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface ICancelToken extends android.os.IInterface {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class Stub extends defpackage.u28 implements com.google.android.gms.common.internal.ICancelToken {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
                r1.<init>(r0)
                return
        }

        public static com.google.android.gms.common.internal.ICancelToken asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.common.internal.ICancelToken
                if (r1 == 0) goto L11
                com.google.android.gms.common.internal.ICancelToken r0 = (com.google.android.gms.common.internal.ICancelToken) r0
                return r0
            L11:
                com.google.android.gms.common.internal.zzx r0 = new com.google.android.gms.common.internal.zzx
                r0.<init>(r2)
                return r0
        }

        @Override // defpackage.u28
        public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
                r0 = this;
                r2 = 2
                if (r1 != r2) goto L8
                r0.cancel()
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }
    }

    void cancel();
}
