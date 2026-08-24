package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AvailabilityException extends java.lang.Exception {
    private final defpackage.wu zaa;

    public AvailabilityException(defpackage.wu r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions> r5) {
            r4 = this;
            wu r0 = r4.zaa
            com.google.android.gms.common.api.internal.ApiKey r5 = r5.getApiKey()
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r1 = r5.zaa()
            java.lang.String r2 = "The given API ("
            java.lang.String r3 = ") was not part of the availability request."
            java.lang.String r1 = defpackage.lb1.A(r2, r1, r3)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            wu r4 = r4.zaa
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.common.ConnectionResult r4 = (com.google.android.gms.common.ConnectionResult) r4
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.ConnectionResult r4 = (com.google.android.gms.common.ConnectionResult) r4
            return r4
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.HasApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> r5) {
            r4 = this;
            wu r0 = r4.zaa
            com.google.android.gms.common.api.internal.ApiKey r5 = r5.getApiKey()
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r1 = r5.zaa()
            java.lang.String r2 = "The given API ("
            java.lang.String r3 = ") was not part of the availability request."
            java.lang.String r1 = defpackage.lb1.A(r2, r1, r3)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            wu r4 = r4.zaa
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.common.ConnectionResult r4 = (com.google.android.gms.common.ConnectionResult) r4
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.ConnectionResult r4 = (com.google.android.gms.common.ConnectionResult) r4
            return r4
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            wu r1 = r7.zaa
            java.util.Set r1 = r1.keySet()
            tu r1 = (defpackage.tu) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = r2
        L13:
            r4 = r1
            su r4 = (defpackage.su) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r4 = r4.next()
            com.google.android.gms.common.api.internal.ApiKey r4 = (com.google.android.gms.common.api.internal.ApiKey) r4
            wu r5 = r7.zaa
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            boolean r6 = r5.isSuccess()
            r6 = r6 ^ r2
            r3 = r3 & r6
            java.lang.String r4 = r4.zaa()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = ": "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r0.add(r4)
            goto L13
        L56:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            if (r3 == 0) goto L63
            java.lang.String r1 = "None of the queried APIs are available. "
            r7.append(r1)
            goto L68
        L63:
            java.lang.String r1 = "Some of the queried APIs are unavailable. "
            r7.append(r1)
        L68:
            java.lang.String r1 = "; "
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            return r7
    }
}
