package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzaa implements com.google.android.gms.tasks.Continuation {
    final /* synthetic */ java.util.Collection zza;

    public zzaa(java.util.Collection r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task r2) {
            r1 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0
            java.lang.Object r0 = r0.getResult()
            r2.add(r0)
            goto Lb
        L1f:
            return r2
    }
}
