package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BooleanResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zaa;
    private final boolean zab;

    public BooleanResult(com.google.android.gms.common.api.Status r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Status must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            r1.zaa = r2
            r1.zab = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.common.api.BooleanResult
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.google.android.gms.common.api.BooleanResult r5 = (com.google.android.gms.common.api.BooleanResult) r5
            com.google.android.gms.common.api.Status r2 = r4.zaa
            com.google.android.gms.common.api.Status r3 = r5.zaa
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
            boolean r4 = r4.zab
            boolean r5 = r5.zab
            if (r4 != r5) goto L20
            return r1
        L20:
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
            r0 = this;
            com.google.android.gms.common.api.Status r0 = r0.zaa
            return r0
    }

    public boolean getValue() {
            r0 = this;
            boolean r0 = r0.zab
            return r0
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zaa
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            boolean r1 = r1.zab
            int r0 = r0 + r1
            return r0
    }
}
