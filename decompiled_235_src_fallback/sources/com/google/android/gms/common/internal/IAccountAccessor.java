package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface IAccountAccessor extends android.os.IInterface {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class Stub extends defpackage.u28 implements com.google.android.gms.common.internal.IAccountAccessor {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
                r1.<init>(r0)
                return
        }

        public static com.google.android.gms.common.internal.IAccountAccessor asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.common.internal.IAccountAccessor
                if (r1 == 0) goto L11
                com.google.android.gms.common.internal.IAccountAccessor r0 = (com.google.android.gms.common.internal.IAccountAccessor) r0
                return r0
            L11:
                com.google.android.gms.common.internal.zzw r0 = new com.google.android.gms.common.internal.zzw
                r0.<init>(r2)
                return r0
        }

        @Override // defpackage.u28
        public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
                r0 = this;
                r2 = 2
                r4 = 0
                if (r1 != r2) goto L1b
                android.accounts.Account r0 = r0.zzb()
                r3.writeNoException()
                int r1 = defpackage.w28.a
                r1 = 1
                if (r0 != 0) goto L14
                r3.writeInt(r4)
                goto L1a
            L14:
                r3.writeInt(r1)
                r0.writeToParcel(r3, r1)
            L1a:
                return r1
            L1b:
                return r4
        }
    }

    android.accounts.Account zzb();
}
