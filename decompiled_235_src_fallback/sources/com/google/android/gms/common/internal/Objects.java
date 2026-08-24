package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Objects {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class ToStringHelper {
        private final java.util.List zza;
        private final java.lang.Object zzb;

        public /* synthetic */ ToStringHelper(java.lang.Object r1, com.google.android.gms.common.internal.zzai r2) {
                r0 = this;
                r0.<init>()
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                r0.zzb = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.zza = r1
                return
        }

        public com.google.android.gms.common.internal.Objects.ToStringHelper add(java.lang.String r2, java.lang.Object r3) {
                r1 = this;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r0 = "="
                java.lang.String r2 = defpackage.lb1.m(r2, r0, r3)
                java.util.List r3 = r1.zza
                r3.add(r2)
                return r1
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 100
                r0.<init>(r1)
                java.lang.Object r1 = r4.zzb
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                r1 = 123(0x7b, float:1.72E-43)
                r0.append(r1)
                java.util.List r1 = r4.zza
                int r1 = r1.size()
                r2 = 0
            L20:
                if (r2 >= r1) goto L39
                java.util.List r3 = r4.zza
                java.lang.Object r3 = r3.get(r2)
                java.lang.String r3 = (java.lang.String) r3
                r0.append(r3)
                int r3 = r1 + (-1)
                if (r2 >= r3) goto L36
                java.lang.String r3 = ", "
                r0.append(r3)
            L36:
                int r2 = r2 + 1
                goto L20
            L39:
                r4 = 125(0x7d, float:1.75E-43)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                return r4
        }
    }

    private Objects() {
            r1 = this;
            r1.<init>()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r0 = "Uninstantiable"
            r1.<init>(r0)
            throw r1
    }

    public static boolean checkBundlesEquality(android.os.Bundle r5, android.os.Bundle r6) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L41
            if (r6 != 0) goto L7
            goto L41
        L7:
            int r2 = r5.size()
            int r3 = r6.size()
            if (r2 == r3) goto L12
            return r1
        L12:
            java.util.Set r2 = r5.keySet()
            java.util.Set r3 = r6.keySet()
            boolean r3 = r2.containsAll(r3)
            if (r3 != 0) goto L21
            return r1
        L21:
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r3)
            java.lang.Object r3 = r6.get(r3)
            boolean r3 = equal(r4, r3)
            if (r3 != 0) goto L25
            return r1
        L40:
            return r0
        L41:
            if (r5 != r6) goto L44
            return r0
        L44:
            return r1
    }

    public static boolean equal(java.lang.Object r2, java.lang.Object r3) {
            r0 = 1
            if (r2 == r3) goto Le
            r1 = 0
            if (r2 == 0) goto Ld
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld
            return r0
        Ld:
            return r1
        Le:
            return r0
    }

    public static int hashCode(java.lang.Object... r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public static com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelper(java.lang.Object r2) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = new com.google.android.gms.common.internal.Objects$ToStringHelper
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
