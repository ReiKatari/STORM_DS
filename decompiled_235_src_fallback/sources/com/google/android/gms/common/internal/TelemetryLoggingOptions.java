package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TelemetryLoggingOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.common.internal.TelemetryLoggingOptions zaa = null;
    private final java.lang.String zab;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private java.lang.String zaa;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Builder(com.google.android.gms.common.internal.zaac r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.common.internal.TelemetryLoggingOptions build() {
                r2 = this;
                com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = new com.google.android.gms.common.internal.TelemetryLoggingOptions
                java.lang.String r2 = r2.zaa
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder setApi(java.lang.String r1) {
                r0 = this;
                r0.zaa = r1
                return r0
        }
    }

    static {
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r0 = builder()
            com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = r0.build()
            com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa = r0
            return
    }

    public /* synthetic */ TelemetryLoggingOptions(java.lang.String r1, com.google.android.gms.common.internal.zaad r2) {
            r0 = this;
            r0.<init>()
            r0.zab = r1
            return
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder builder() {
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r0 = new com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.internal.TelemetryLoggingOptions
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            com.google.android.gms.common.internal.TelemetryLoggingOptions r2 = (com.google.android.gms.common.internal.TelemetryLoggingOptions) r2
            java.lang.String r1 = r1.zab
            java.lang.String r2 = r2.zab
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.zab
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final android.os.Bundle zaa() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = r2.zab
            if (r2 == 0) goto Le
            java.lang.String r1 = "api"
            r0.putString(r1, r2)
        Le:
            return r0
    }
}
