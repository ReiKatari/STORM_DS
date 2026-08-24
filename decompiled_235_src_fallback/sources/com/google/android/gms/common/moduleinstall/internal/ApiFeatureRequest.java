package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ApiFeatureRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest> CREATOR = null;
    private static final java.util.Comparator zaa = null;
    private final java.util.List zab;
    private final boolean zac;
    private final java.lang.String zad;
    private final java.lang.String zae;

    static {
            com.google.android.gms.common.moduleinstall.internal.zac r0 = new com.google.android.gms.common.moduleinstall.internal.zac
            r0.<init>()
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.CREATOR = r0
            com.google.android.gms.common.moduleinstall.internal.zab r0 = com.google.android.gms.common.moduleinstall.internal.zab.zaa
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa = r0
            return
    }

    public ApiFeatureRequest(java.util.List r1, boolean r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zab = r1
            r0.zac = r2
            r0.zad = r3
            r0.zae = r4
            return
    }

    public static com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest fromModuleInstallRequest(com.google.android.gms.common.moduleinstall.ModuleInstallRequest r1) {
            java.util.List r1 = r1.getApis()
            r0 = 1
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r1 = zaa(r1, r0)
            return r1
    }

    public static com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zaa(java.util.List r2, boolean r3) {
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Comparator r1 = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r2.next()
            com.google.android.gms.common.api.OptionalModuleApi r1 = (com.google.android.gms.common.api.OptionalModuleApi) r1
            com.google.android.gms.common.Feature[] r1 = r1.getOptionalFeatures()
            java.util.Collections.addAll(r0, r1)
            goto Lb
        L1f:
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r2 = new com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r0 = 0
            r2.<init>(r1, r3, r0, r0)
            return r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest
            if (r1 != 0) goto L9
            return r0
        L9:
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r4 = (com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest) r4
            boolean r1 = r3.zac
            boolean r2 = r4.zac
            if (r1 != r2) goto L31
            java.util.List r1 = r3.zab
            java.util.List r2 = r4.zab
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r2)
            if (r1 == 0) goto L31
            java.lang.String r1 = r3.zad
            java.lang.String r2 = r4.zad
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r2)
            if (r1 == 0) goto L31
            java.lang.String r3 = r3.zae
            java.lang.String r4 = r4.zae
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
            if (r3 == 0) goto L31
            r3 = 1
            return r3
        L31:
            return r0
    }

    public java.util.List<com.google.android.gms.common.Feature> getApiFeatures() {
            r0 = this;
            java.util.List r0 = r0.zab
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.zac
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.util.List r1 = r3.zab
            java.lang.String r2 = r3.zad
            java.lang.String r3 = r3.zae
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r1, r2, r3}
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r3)
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List r0 = r3.getApiFeatures()
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            r0 = 2
            boolean r1 = r3.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r0, r1)
            r0 = 3
            java.lang.String r1 = r3.zad
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r0, r1, r2)
            r0 = 4
            java.lang.String r3 = r3.zae
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r0, r3, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
