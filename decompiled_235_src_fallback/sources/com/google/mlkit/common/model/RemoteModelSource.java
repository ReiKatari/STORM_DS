package com.google.mlkit.common.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class RemoteModelSource {
    private final java.lang.String zza;

    public RemoteModelSource(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L20
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L20
        L15:
            com.google.mlkit.common.model.RemoteModelSource r3 = (com.google.mlkit.common.model.RemoteModelSource) r3
            java.lang.String r2 = r2.zza
            java.lang.String r3 = r3.zza
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            return r2
        L20:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.zza
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "RemoteModelSource"
            com.google.android.gms.internal.mlkit_common.zzq r0 = com.google.android.gms.internal.mlkit_common.zzr.zzb(r0)
            java.lang.String r1 = "firebaseModelName"
            java.lang.String r2 = r2.zza
            r0.zza(r1, r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final java.lang.String zza() {
            r0 = this;
            java.lang.String r0 = r0.zza
            return r0
    }
}
