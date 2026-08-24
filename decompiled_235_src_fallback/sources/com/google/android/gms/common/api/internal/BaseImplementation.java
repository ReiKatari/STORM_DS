package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BaseImplementation {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class ApiMethodImpl<R extends com.google.android.gms.common.api.Result, A extends com.google.android.gms.common.api.Api.AnyClient> extends com.google.android.gms.common.api.internal.BasePendingResult<R> implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<R> {
        private final com.google.android.gms.common.api.Api<?> api;
        private final com.google.android.gms.common.api.Api.AnyClientKey<A> clientKey;

        @java.lang.Deprecated
        public ApiMethodImpl(com.google.android.gms.common.api.Api.AnyClientKey<A> r2, com.google.android.gms.common.api.GoogleApiClient r3) {
                r1 = this;
                java.lang.String r0 = "GoogleApiClient must not be null"
                java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                com.google.android.gms.common.api.GoogleApiClient r3 = (com.google.android.gms.common.api.GoogleApiClient) r3
                r1.<init>(r3)
                java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
                com.google.android.gms.common.api.Api$AnyClientKey r2 = (com.google.android.gms.common.api.Api.AnyClientKey) r2
                r1.clientKey = r2
                r2 = 0
                r1.api = r2
                return
        }

        public ApiMethodImpl(com.google.android.gms.common.api.Api<?> r2, com.google.android.gms.common.api.GoogleApiClient r3) {
                r1 = this;
                java.lang.String r0 = "GoogleApiClient must not be null"
                java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                com.google.android.gms.common.api.GoogleApiClient r3 = (com.google.android.gms.common.api.GoogleApiClient) r3
                r1.<init>(r3)
                java.lang.String r3 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r3)
                com.google.android.gms.common.api.Api$AnyClientKey r3 = r2.zab()
                r1.clientKey = r3
                r1.api = r2
                return
        }

        public ApiMethodImpl(com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> r1) {
                r0 = this;
                r0.<init>(r1)
                com.google.android.gms.common.api.Api$AnyClientKey r1 = new com.google.android.gms.common.api.Api$AnyClientKey
                r1.<init>()
                r0.clientKey = r1
                r1 = 0
                r0.api = r1
                return
        }

        private void setFailedResult(android.os.RemoteException r4) {
                r3 = this;
                com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
                java.lang.String r4 = r4.getLocalizedMessage()
                r1 = 0
                r2 = 8
                r0.<init>(r2, r4, r1)
                r3.setFailedResult(r0)
                return
        }

        public abstract void doExecute(A r1);

        public final com.google.android.gms.common.api.Api<?> getApi() {
                r0 = this;
                com.google.android.gms.common.api.Api<?> r0 = r0.api
                return r0
        }

        public final com.google.android.gms.common.api.Api.AnyClientKey<A> getClientKey() {
                r0 = this;
                com.google.android.gms.common.api.Api$AnyClientKey<A extends com.google.android.gms.common.api.Api$AnyClient> r0 = r0.clientKey
                return r0
        }

        public void onSetFailedResult(R r1) {
                r0 = this;
                return
        }

        public final void run(A r1) {
                r0 = this;
                r0.doExecute(r1)     // Catch: android.os.RemoteException -> L4 android.os.DeadObjectException -> L9
                return
            L4:
                r1 = move-exception
                r0.setFailedResult(r1)
                return
            L9:
                r1 = move-exception
                r0.setFailedResult(r1)
                throw r1
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        public final void setFailedResult(com.google.android.gms.common.api.Status r3) {
                r2 = this;
                boolean r0 = r3.isSuccess()
                r0 = r0 ^ 1
                java.lang.String r1 = "Failed result must not be success"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                com.google.android.gms.common.api.Result r3 = r2.createFailedResult(r3)
                r2.setResult(r3)
                r2.onSetFailedResult(r3)
                return
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        public /* bridge */ /* synthetic */ void setResult(java.lang.Object r1) {
                r0 = this;
                com.google.android.gms.common.api.Result r1 = (com.google.android.gms.common.api.Result) r1
                r0.setResult(r1)
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface ResultHolder<R> {
        void setFailedResult(com.google.android.gms.common.api.Status r1);

        void setResult(R r1);
    }

    public BaseImplementation() {
            r0 = this;
            r0.<init>()
            return
    }
}
