package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zacl extends com.google.android.gms.common.api.internal.UnregisterListenerMethod {
    final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zaa;

    public zacl(com.google.android.gms.common.api.internal.RegistrationMethods.Builder r1, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void unregisterListener(com.google.android.gms.common.api.Api.AnyClient r1, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r2) {
            r0 = this;
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = r0.zaa
            com.google.android.gms.common.api.internal.RemoteCall r0 = com.google.android.gms.common.api.internal.RegistrationMethods.Builder.zab(r0)
            r0.accept(r1, r2)
            return
    }
}
