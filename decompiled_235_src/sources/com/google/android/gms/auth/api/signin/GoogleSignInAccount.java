package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b96(6);
    public static final Clock j0 = DefaultClock.getInstance();
    public final int A;
    public final String B;
    public final String L;
    public final String R;
    public final String X;
    public final Uri Y;
    public String Z;
    public final long d0;
    public final String e0;
    public final List f0;
    public final String g0;
    public final String h0;
    public final HashSet i0 = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.A = i;
        this.B = str;
        this.L = str2;
        this.R = str3;
        this.X = str4;
        this.Y = uri;
        this.Z = str5;
        this.d0 = j;
        this.e0 = str6;
        this.f0 = arrayList;
        this.g0 = str7;
        this.h0 = str8;
    }

    public static GoogleSignInAccount h(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has(Scopes.EMAIL)) {
            str3 = jSONObject.optString(Scopes.EMAIL);
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, parseLong, Preconditions.checkNotEmpty(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) Preconditions.checkNotNull(hashSet)), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.Z = str7;
        return googleSignInAccount;
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet(this.f0);
        hashSet.addAll(this.i0);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.e0.equals(this.e0) && googleSignInAccount.e().equals(e())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.e0.hashCode() + 527) * 31) + e().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.A);
        SafeParcelWriter.writeString(parcel, 2, this.B, false);
        SafeParcelWriter.writeString(parcel, 3, this.L, false);
        SafeParcelWriter.writeString(parcel, 4, this.R, false);
        SafeParcelWriter.writeString(parcel, 5, this.X, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.Y, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.Z, false);
        SafeParcelWriter.writeLong(parcel, 8, this.d0);
        SafeParcelWriter.writeString(parcel, 9, this.e0, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f0, false);
        SafeParcelWriter.writeString(parcel, 11, this.g0, false);
        SafeParcelWriter.writeString(parcel, 12, this.h0, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
