package yd;

import android.content.SharedPreferences;
import oi.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f14814a;

    public b(SharedPreferences sharedPreferences) {
        this.f14814a = sharedPreferences;
    }

    public final j a() {
        String string;
        SharedPreferences sharedPreferences = this.f14814a;
        String string2 = sharedPreferences.getString("ra_username", null);
        if (string2 == null || (string = sharedPreferences.getString("ra_token", null)) == null) {
            return null;
        }
        return new j(string2, string);
    }
}
