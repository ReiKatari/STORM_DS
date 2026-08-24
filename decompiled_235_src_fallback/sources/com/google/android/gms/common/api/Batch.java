package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Batch extends com.google.android.gms.common.api.internal.BasePendingResult<com.google.android.gms.common.api.BatchResult> {
    private int zae;
    private boolean zaf;
    private boolean zag;
    private final com.google.android.gms.common.api.PendingResult[] zah;
    private final java.lang.Object zai;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final java.util.List zaa;
        private final com.google.android.gms.common.api.GoogleApiClient zab;

        public Builder(com.google.android.gms.common.api.GoogleApiClient r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zaa = r0
                r1.zab = r2
                return
        }

        @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
        public <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.BatchResultToken<R> add(com.google.android.gms.common.api.PendingResult<R> r3) {
                r2 = this;
                com.google.android.gms.common.api.BatchResultToken r0 = new com.google.android.gms.common.api.BatchResultToken
                java.util.List r1 = r2.zaa
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.List r2 = r2.zaa
                r2.add(r3)
                return r0
        }

        public com.google.android.gms.common.api.Batch build() {
                r3 = this;
                com.google.android.gms.common.api.Batch r0 = new com.google.android.gms.common.api.Batch
                java.util.List r1 = r3.zaa
                com.google.android.gms.common.api.GoogleApiClient r3 = r3.zab
                r2 = 0
                r0.<init>(r1, r3, r2)
                return r0
        }
    }

    public /* synthetic */ Batch(java.util.List r2, com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.common.api.zac r4) {
            r1 = this;
            r1.<init>(r3)
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r1.zai = r3
            int r3 = r2.size()
            r1.zae = r3
            com.google.android.gms.common.api.PendingResult[] r3 = new com.google.android.gms.common.api.PendingResult[r3]
            r1.zah = r3
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L37
            r3 = 0
        L1b:
            int r4 = r2.size()
            if (r3 >= r4) goto L36
            java.lang.Object r4 = r2.get(r3)
            com.google.android.gms.common.api.PendingResult r4 = (com.google.android.gms.common.api.PendingResult) r4
            com.google.android.gms.common.api.PendingResult[] r0 = r1.zah
            r0[r3] = r4
            com.google.android.gms.common.api.zab r0 = new com.google.android.gms.common.api.zab
            r0.<init>(r1)
            r4.addStatusListener(r0)
            int r3 = r3 + 1
            goto L1b
        L36:
            return
        L37:
            com.google.android.gms.common.api.BatchResult r2 = new com.google.android.gms.common.api.BatchResult
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r2.<init>(r4, r3)
            r1.setResult(r2)
            return
    }

    public static /* bridge */ /* synthetic */ int zaa(com.google.android.gms.common.api.Batch r0) {
            int r0 = r0.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zab(com.google.android.gms.common.api.Batch r0) {
            java.lang.Object r0 = r0.zai
            return r0
    }

    public static /* bridge */ /* synthetic */ void zac(com.google.android.gms.common.api.Batch r0, boolean r1) {
            r1 = 1
            r0.zaf = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zad(com.google.android.gms.common.api.Batch r0, boolean r1) {
            r1 = 1
            r0.zag = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zae(com.google.android.gms.common.api.Batch r0, int r1) {
            r0.zae = r1
            return
    }

    public static /* synthetic */ void zaf(com.google.android.gms.common.api.Batch r0) {
            super.cancel()
            return
    }

    public static /* bridge */ /* synthetic */ boolean zag(com.google.android.gms.common.api.Batch r0) {
            boolean r0 = r0.zaf
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zah(com.google.android.gms.common.api.Batch r0) {
            boolean r0 = r0.zag
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.PendingResult[] zai(com.google.android.gms.common.api.Batch r0) {
            com.google.android.gms.common.api.PendingResult[] r0 = r0.zah
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
            r3 = this;
            super.cancel()
            r0 = 0
        L4:
            com.google.android.gms.common.api.PendingResult[] r1 = r3.zah
            int r2 = r1.length
            if (r0 >= r2) goto L11
            r1 = r1[r0]
            r1.cancel()
            int r0 = r0 + 1
            goto L4
        L11:
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public com.google.android.gms.common.api.BatchResult createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.PendingResult[] r1 = r1.zah
            com.google.android.gms.common.api.BatchResult r0 = new com.google.android.gms.common.api.BatchResult
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.BatchResult createFailedResult(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            com.google.android.gms.common.api.BatchResult r0 = r0.createFailedResult(r1)
            return r0
    }
}
