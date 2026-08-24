package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class TaskApiCall<A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> {
    private final com.google.android.gms.common.Feature[] zaa;
    private final boolean zab;
    private final int zac;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder<A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> {
        private com.google.android.gms.common.api.internal.RemoteCall zaa;
        private boolean zab;
        private com.google.android.gms.common.Feature[] zac;
        private int zad;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.zab = r0
                r0 = 0
                r1.zad = r0
                return
        }

        public /* synthetic */ Builder(com.google.android.gms.common.api.internal.zacw r1) {
                r0 = this;
                r0.<init>()
                r1 = 1
                r0.zab = r1
                r1 = 0
                r0.zad = r1
                return
        }

        public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.RemoteCall zaa(com.google.android.gms.common.api.internal.TaskApiCall.Builder r0) {
                com.google.android.gms.common.api.internal.RemoteCall r0 = r0.zaa
                return r0
        }

        public com.google.android.gms.common.api.internal.TaskApiCall<A, ResultT> build() {
                r4 = this;
                com.google.android.gms.common.api.internal.RemoteCall r0 = r4.zaa
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "execute parameter required"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                com.google.android.gms.common.api.internal.zacv r0 = new com.google.android.gms.common.api.internal.zacv
                com.google.android.gms.common.Feature[] r1 = r4.zac
                boolean r2 = r4.zab
                int r3 = r4.zad
                r0.<init>(r4, r1, r2, r3)
                return r0
        }

        @java.lang.Deprecated
        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> execute(com.google.android.gms.common.util.BiConsumer<A, com.google.android.gms.tasks.TaskCompletionSource<ResultT>> r2) {
                r1 = this;
                com.google.android.gms.common.api.internal.zacu r0 = new com.google.android.gms.common.api.internal.zacu
                r0.<init>(r2)
                r1.zaa = r0
                return r1
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> run(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<ResultT>> r1) {
                r0 = this;
                r0.zaa = r1
                return r0
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setAutoResolveMissingFeatures(boolean r1) {
                r0 = this;
                r0.zab = r1
                return r0
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setFeatures(com.google.android.gms.common.Feature... r1) {
                r0 = this;
                r0.zac = r1
                return r0
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setMethodKey(int r1) {
                r0 = this;
                r0.zad = r1
                return r0
        }
    }

    @java.lang.Deprecated
    public TaskApiCall() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zaa = r0
            r0 = 0
            r1.zab = r0
            r1.zac = r0
            return
    }

    public TaskApiCall(com.google.android.gms.common.Feature[] r2, boolean r3, int r4) {
            r1 = this;
            r1.<init>()
            r1.zaa = r2
            r0 = 0
            if (r2 == 0) goto Lb
            if (r3 == 0) goto Lb
            r0 = 1
        Lb:
            r1.zab = r0
            r1.zac = r4
            return
    }

    public static <A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> builder() {
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = new com.google.android.gms.common.api.internal.TaskApiCall$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public abstract void doExecute(A r1, com.google.android.gms.tasks.TaskCompletionSource<ResultT> r2);

    public boolean shouldAutoResolveMissingFeatures() {
            r0 = this;
            boolean r0 = r0.zab
            return r0
    }

    public final int zaa() {
            r0 = this;
            int r0 = r0.zac
            return r0
    }

    public final com.google.android.gms.common.Feature[] zab() {
            r0 = this;
            com.google.android.gms.common.Feature[] r0 = r0.zaa
            return r0
    }
}
