package com.google.android.gms.auth.api.signin;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = null;
    public static final com.google.android.gms.common.util.Clock j0 = null;
    public final int A;
    public final java.lang.String B;
    public final java.lang.String L;
    public final java.lang.String R;
    public final java.lang.String X;
    public final android.net.Uri Y;
    public java.lang.String Z;
    public final long d0;
    public final java.lang.String e0;
    public final java.util.List f0;
    public final java.lang.String g0;
    public final java.lang.String h0;
    public final java.util.HashSet i0;

    static {
            b96 r0 = new b96
            r1 = 6
            r0.<init>(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR = r0
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.common.util.DefaultClock.getInstance()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount.j0 = r0
            return
    }

    public GoogleSignInAccount(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, android.net.Uri r7, java.lang.String r8, long r9, java.lang.String r11, java.util.ArrayList r12, java.lang.String r13, java.lang.String r14) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.i0 = r0
            r1.A = r2
            r1.B = r3
            r1.L = r4
            r1.R = r5
            r1.X = r6
            r1.Y = r7
            r1.Z = r8
            r1.d0 = r9
            r1.e0 = r11
            r1.f0 = r12
            r1.g0 = r13
            r1.h0 = r14
            return
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount h(java.lang.String r17) {
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject
            r2 = r17
            r0.<init>(r2)
            java.lang.String r2 = "photoUrl"
            java.lang.String r2 = r0.optString(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L21
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r9 = r2
            goto L22
        L21:
            r9 = r1
        L22:
            java.lang.String r2 = "expirationTime"
            java.lang.String r2 = r0.getString(r2)
            long r11 = java.lang.Long.parseLong(r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.String r3 = "grantedScopes"
            org.json.JSONArray r3 = r0.getJSONArray(r3)
            int r4 = r3.length()
            r5 = 0
        L3c:
            if (r5 >= r4) goto L4d
            com.google.android.gms.common.api.Scope r6 = new com.google.android.gms.common.api.Scope
            java.lang.String r7 = r3.getString(r5)
            r6.<init>(r7)
            r2.add(r6)
            int r5 = r5 + 1
            goto L3c
        L4d:
            java.lang.String r3 = "id"
            java.lang.String r5 = r0.optString(r3)
            java.lang.String r3 = "tokenId"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L61
            java.lang.String r3 = r0.optString(r3)
            r6 = r3
            goto L62
        L61:
            r6 = r1
        L62:
            java.lang.String r3 = "email"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L70
            java.lang.String r3 = r0.optString(r3)
            r7 = r3
            goto L71
        L70:
            r7 = r1
        L71:
            java.lang.String r3 = "displayName"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L7f
            java.lang.String r3 = r0.optString(r3)
            r8 = r3
            goto L80
        L7f:
            r8 = r1
        L80:
            java.lang.String r3 = "givenName"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L8e
            java.lang.String r3 = r0.optString(r3)
            r15 = r3
            goto L8f
        L8e:
            r15 = r1
        L8f:
            java.lang.String r3 = "familyName"
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L9e
            java.lang.String r3 = r0.optString(r3)
            r16 = r3
            goto La0
        L9e:
            r16 = r1
        La0:
            java.lang.String r3 = "obfuscatedIdentifier"
            java.lang.String r3 = r0.getString(r3)
            r4 = r3
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            java.lang.String r13 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            java.util.ArrayList r14 = new java.util.ArrayList
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r14.<init>(r2)
            r4 = 3
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            java.lang.String r2 = "serverAuthCode"
            boolean r4 = r0.has(r2)
            if (r4 == 0) goto Lc9
            java.lang.String r1 = r0.optString(r2)
        Lc9:
            r3.Z = r1
            return r3
    }

    public final java.util.HashSet e() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r1 = r2.f0
            r0.<init>(r1)
            java.util.HashSet r2 = r2.i0
            r0.addAll(r2)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L27
        L3:
            if (r3 != r2) goto L6
            goto L25
        L6:
            boolean r0 = r3 instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount
            if (r0 != 0) goto Lb
            goto L27
        Lb:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r3
            java.lang.String r0 = r3.e0
            java.lang.String r1 = r2.e0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            java.util.HashSet r3 = r3.e()
            java.util.HashSet r2 = r2.e()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L25:
            r2 = 1
            return r2
        L27:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.e0
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            java.util.HashSet r1 = r1.e()
            int r1 = r1.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r1 = 1
            int r2 = r4.A
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r2)
            r1 = 2
            java.lang.String r2 = r4.B
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 3
            java.lang.String r2 = r4.L
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 4
            java.lang.String r2 = r4.R
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 5
            java.lang.String r2 = r4.X
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r2, r3)
            r1 = 6
            android.net.Uri r2 = r4.Y
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            r6 = 7
            java.lang.String r1 = r4.Z
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r1, r3)
            r6 = 8
            long r1 = r4.d0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            r6 = 9
            java.lang.String r1 = r4.e0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r1, r3)
            r6 = 10
            java.util.List r1 = r4.f0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r6, r1, r3)
            r6 = 11
            java.lang.String r1 = r4.g0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r1, r3)
            r6 = 12
            java.lang.String r4 = r4.h0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r4, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
