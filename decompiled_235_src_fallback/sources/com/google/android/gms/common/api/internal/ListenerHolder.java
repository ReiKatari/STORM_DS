package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ListenerHolder<L> {
    private final java.util.concurrent.Executor zaa;
    private volatile java.lang.Object zab;
    private volatile com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zac;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class ListenerKey<L> {
        private final java.lang.Object zaa;
        private final java.lang.String zab;

        public ListenerKey(L r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.zaa = r1
                r0.zab = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r5 = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) r5
                java.lang.Object r1 = r4.zaa
                java.lang.Object r3 = r5.zaa
                if (r1 != r3) goto L1d
                java.lang.String r4 = r4.zab
                java.lang.String r5 = r5.zab
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L1d
                return r0
            L1d:
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.zaa
                int r0 = java.lang.System.identityHashCode(r0)
                int r0 = r0 * 31
                java.lang.String r1 = r1.zab
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toIdString() {
                r2 = this;
                java.lang.Object r0 = r2.zaa
                int r0 = java.lang.System.identityHashCode(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r2.zab
                r1.append(r2)
                java.lang.String r2 = "@"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r2 = r1.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface Notifier<L> {
        void notifyListener(L r1);

        void onNotifyListenerFailed();
    }

    public ListenerHolder(android.os.Looper r2, L r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.util.concurrent.HandlerExecutor r0 = new com.google.android.gms.common.util.concurrent.HandlerExecutor
            r0.<init>(r2)
            r1.zaa = r0
            java.lang.String r2 = "Listener must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r2)
            r1.zab = r2
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey
            java.lang.String r4 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            r2.<init>(r3, r4)
            r1.zac = r2
            return
    }

    public ListenerHolder(java.util.concurrent.Executor r2, L r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Executor must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            r1.zaa = r2
            java.lang.String r2 = "Listener must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r2)
            r1.zab = r2
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey
            java.lang.String r4 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            r2.<init>(r3, r4)
            r1.zac = r2
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.zab = r0
            r1.zac = r0
            return
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
            r0 = this;
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.zac
            return r0
    }

    public boolean hasListener() {
            r0 = this;
            java.lang.Object r0 = r0.zab
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void notifyListener(com.google.android.gms.common.api.internal.ListenerHolder.Notifier<? super L> r2) {
            r1 = this;
            java.lang.String r0 = "Notifier must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.internal.zacb r0 = new com.google.android.gms.common.api.internal.zacb
            r0.<init>(r1, r2)
            java.util.concurrent.Executor r1 = r1.zaa
            r1.execute(r0)
            return
    }

    public final void zaa(com.google.android.gms.common.api.internal.ListenerHolder.Notifier r1) {
            r0 = this;
            java.lang.Object r0 = r0.zab
            if (r0 != 0) goto L8
            r1.onNotifyListenerFailed()
            return
        L8:
            r1.notifyListener(r0)     // Catch: java.lang.RuntimeException -> Lc
            return
        Lc:
            r0 = move-exception
            r1.onNotifyListenerFailed()
            throw r0
    }
}
