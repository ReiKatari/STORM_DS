package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zack extends com.google.android.gms.common.api.internal.RegisterListenerMethod {
    final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zaa;

    public zack(com.google.android.gms.common.api.internal.RegistrationMethods.Builder r1, com.google.android.gms.common.api.internal.ListenerHolder r2, com.google.android.gms.common.Feature[] r3, boolean r4, int r5) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void registerListener(com.google.android.gms.common.api.Api.AnyClient r1, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2) {
            r0 = this;
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = r0.zaa
            com.google.android.gms.common.api.internal.RemoteCall r0 = com.google.android.gms.common.api.internal.RegistrationMethods.Builder.zaa(r0)
            r0.accept(r1, r2)
            return
    }
}
