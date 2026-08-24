package com.google.android.gms.common.server.response;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse extends com.google.android.gms.common.server.response.FastJsonResponse implements com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public FastSafeParcelableJsonResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r6) goto L8
            return r1
        L8:
            java.lang.Class r2 = r5.getClass()
            boolean r2 = r2.isInstance(r6)
            if (r2 != 0) goto L13
            return r0
        L13:
            com.google.android.gms.common.server.response.FastJsonResponse r6 = (com.google.android.gms.common.server.response.FastJsonResponse) r6
            java.util.Map r2 = r5.getFieldMappings()
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r3
            boolean r4 = r5.isFieldSet(r3)
            if (r4 == 0) goto L48
            boolean r4 = r6.isFieldSet(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r5.getFieldValue(r3)
            java.lang.Object r3 = r6.getFieldValue(r3)
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r4, r3)
            if (r3 != 0) goto L21
        L47:
            return r0
        L48:
            boolean r3 = r6.isFieldSet(r3)
            if (r3 == 0) goto L21
            return r0
        L4f:
            return r1
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.lang.Object getValueObject(java.lang.String r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.util.Map r0 = r4.getFieldMappings()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            boolean r3 = r4.isFieldSet(r2)
            if (r3 == 0) goto Ld
            int r1 = r1 * 31
            java.lang.Object r2 = r4.getFieldValue(r2)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto Ld
        L2f:
            return r1
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isPrimitiveFieldSet(java.lang.String r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public byte[] toByteArray() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r2.writeToParcel(r0, r1)
            byte[] r2 = r0.marshall()
            r0.recycle()
            return r2
    }
}
