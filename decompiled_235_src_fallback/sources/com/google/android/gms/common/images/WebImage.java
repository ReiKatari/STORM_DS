package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class WebImage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.images.WebImage> CREATOR = null;
    final int zaa;
    private final android.net.Uri zab;
    private final int zac;
    private final int zad;

    static {
            com.google.android.gms.common.images.zah r0 = new com.google.android.gms.common.images.zah
            r0.<init>()
            com.google.android.gms.common.images.WebImage.CREATOR = r0
            return
    }

    public WebImage(int r1, android.net.Uri r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            return
    }

    public WebImage(android.net.Uri r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public WebImage(android.net.Uri r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2, r3, r4)
            if (r2 == 0) goto L12
            if (r3 < 0) goto Lb
            if (r4 < 0) goto Lb
            return
        Lb:
            java.lang.String r1 = "width and height must not be negative"
            defpackage.i.h(r1)
            r1 = 0
            throw r1
        L12:
            java.lang.String r1 = "url cannot be null"
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    public WebImage(org.json.JSONObject r5) {
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L12
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L12
        L12:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            boolean r2 = r5 instanceof com.google.android.gms.common.images.WebImage
            if (r2 != 0) goto Lc
            goto L25
        Lc:
            com.google.android.gms.common.images.WebImage r5 = (com.google.android.gms.common.images.WebImage) r5
            android.net.Uri r2 = r4.zab
            android.net.Uri r3 = r5.zab
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L25
            int r2 = r4.zac
            int r3 = r5.zac
            if (r2 != r3) goto L25
            int r4 = r4.zad
            int r5 = r5.zad
            if (r4 != r5) goto L25
            return r0
        L25:
            return r1
    }

    public int getHeight() {
            r0 = this;
            int r0 = r0.zad
            return r0
    }

    public android.net.Uri getUrl() {
            r0 = this;
            android.net.Uri r0 = r0.zab
            return r0
    }

    public int getWidth() {
            r0 = this;
            int r0 = r0.zac
            return r0
    }

    public int hashCode() {
            r2 = this;
            android.net.Uri r0 = r2.zab
            int r1 = r2.zac
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r2.zad
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            int r2 = com.google.android.gms.common.internal.Objects.hashCode(r2)
            return r2
    }

    public org.json.JSONObject toJson() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "url"
            android.net.Uri r2 = r3.zab     // Catch: org.json.JSONException -> L1e
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L1e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1e
            java.lang.String r1 = "width"
            int r2 = r3.zac     // Catch: org.json.JSONException -> L1e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1e
            java.lang.String r1 = "height"
            int r3 = r3.zad     // Catch: org.json.JSONException -> L1e
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L1e
        L1e:
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.US
            int r0 = r5.zac
            int r1 = r5.zad
            android.net.Uri r5 = r5.zab
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = "x"
            java.lang.String r3 = " "
            java.lang.String r4 = "Image "
            java.lang.StringBuilder r0 = defpackage.i61.q(r0, r1, r4, r2, r3)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zaa
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            android.net.Uri r0 = r4.getUrl()
            r2 = 0
            r3 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r3, r0, r6, r2)
            r6 = 3
            int r0 = r4.getWidth()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r0)
            r6 = 4
            int r4 = r4.getHeight()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
