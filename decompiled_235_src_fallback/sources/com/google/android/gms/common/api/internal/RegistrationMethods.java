package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RegistrationMethods<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    public final com.google.android.gms.common.api.internal.RegisterListenerMethod<A, L> register;
    public final com.google.android.gms.common.api.internal.UnregisterListenerMethod zaa;
    public final java.lang.Runnable zab;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
        private com.google.android.gms.common.api.internal.RemoteCall zaa;
        private com.google.android.gms.common.api.internal.RemoteCall zab;
        private java.lang.Runnable zac;
        private com.google.android.gms.common.api.internal.ListenerHolder zad;
        private com.google.android.gms.common.Feature[] zae;
        private boolean zaf;
        private int zag;

        private Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.gms.common.api.internal.zacj r0 = com.google.android.gms.common.api.internal.zacj.zaa
                r1.zac = r0
                r0 = 1
                r1.zaf = r0
                return
        }

        public /* synthetic */ Builder(com.google.android.gms.common.api.internal.zacm r1) {
                r0 = this;
                r0.<init>()
                com.google.android.gms.common.api.internal.zacj r1 = com.google.android.gms.common.api.internal.zacj.zaa
                r0.zac = r1
                r1 = 1
                r0.zaf = r1
                return
        }

        public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.RemoteCall zaa(com.google.android.gms.common.api.internal.RegistrationMethods.Builder r0) {
                com.google.android.gms.common.api.internal.RemoteCall r0 = r0.zaa
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.RemoteCall zab(com.google.android.gms.common.api.internal.RegistrationMethods.Builder r0) {
                com.google.android.gms.common.api.internal.RemoteCall r0 = r0.zab
                return r0
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods<A, L> build() {
                r8 = this;
                com.google.android.gms.common.api.internal.RemoteCall r0 = r8.zaa
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L8
                r0 = r2
                goto L9
            L8:
                r0 = r1
            L9:
                java.lang.String r3 = "Must set register function"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
                com.google.android.gms.common.api.internal.RemoteCall r0 = r8.zab
                if (r0 == 0) goto L14
                r0 = r2
                goto L15
            L14:
                r0 = r1
            L15:
                java.lang.String r3 = "Must set unregister function"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
                com.google.android.gms.common.api.internal.ListenerHolder r0 = r8.zad
                if (r0 == 0) goto L1f
                r1 = r2
            L1f:
                java.lang.String r0 = "Must set holder"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                com.google.android.gms.common.api.internal.ListenerHolder r0 = r8.zad
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
                java.lang.String r1 = "Key must not be null"
                java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) r0
                com.google.android.gms.common.api.internal.RegistrationMethods r1 = new com.google.android.gms.common.api.internal.RegistrationMethods
                com.google.android.gms.common.api.internal.zack r2 = new com.google.android.gms.common.api.internal.zack
                com.google.android.gms.common.api.internal.ListenerHolder r4 = r8.zad
                com.google.android.gms.common.Feature[] r5 = r8.zae
                boolean r6 = r8.zaf
                int r7 = r8.zag
                r3 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                com.google.android.gms.common.api.internal.zacl r8 = new com.google.android.gms.common.api.internal.zacl
                r8.<init>(r3, r0)
                java.lang.Runnable r0 = r3.zac
                r3 = 0
                r1.<init>(r2, r8, r0, r3)
                return r1
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> onConnectionSuspended(java.lang.Runnable r1) {
                r0 = this;
                r0.zac = r1
                return r0
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> register(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> r1) {
                r0 = this;
                r0.zaa = r1
                return r0
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setAutoResolveMissingFeatures(boolean r1) {
                r0 = this;
                r0.zaf = r1
                return r0
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setFeatures(com.google.android.gms.common.Feature... r1) {
                r0 = this;
                r0.zae = r1
                return r0
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setMethodKey(int r1) {
                r0 = this;
                r0.zag = r1
                return r0
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> unregister(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> r1) {
                r0 = this;
                r0.zab = r1
                return r0
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> withHolder(com.google.android.gms.common.api.internal.ListenerHolder<L> r1) {
                r0 = this;
                r0.zad = r1
                return r0
        }
    }

    public /* synthetic */ RegistrationMethods(com.google.android.gms.common.api.internal.RegisterListenerMethod r1, com.google.android.gms.common.api.internal.UnregisterListenerMethod r2, java.lang.Runnable r3, com.google.android.gms.common.api.internal.zacn r4) {
            r0 = this;
            r0.<init>()
            r0.register = r1
            r0.zaa = r2
            r0.zab = r3
            return
    }

    public static <A extends com.google.android.gms.common.api.Api.AnyClient, L> com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> builder() {
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = new com.google.android.gms.common.api.internal.RegistrationMethods$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }
}
