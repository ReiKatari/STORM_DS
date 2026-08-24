package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AccountAccessor extends com.google.android.gms.common.internal.IAccountAccessor.Stub {
    public static android.accounts.Account getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor r4) {
            r0 = 0
            if (r4 == 0) goto L20
            long r1 = android.os.Binder.clearCallingIdentity()
            android.accounts.Account r4 = r4.zzb()     // Catch: java.lang.Throwable -> Lf android.os.RemoteException -> L11
            android.os.Binder.restoreCallingIdentity(r1)
            return r4
        Lf:
            r4 = move-exception
            goto L1c
        L11:
            java.lang.String r4 = "AccountAccessor"
            java.lang.String r3 = "Remote account accessor probably died"
            android.util.Log.w(r4, r3)     // Catch: java.lang.Throwable -> Lf
            android.os.Binder.restoreCallingIdentity(r1)
            return r0
        L1c:
            android.os.Binder.restoreCallingIdentity(r1)
            throw r4
        L20:
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() {
            r0 = this;
            r0 = 0
            throw r0
    }
}
