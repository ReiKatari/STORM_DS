package v5;

import android.net.Uri;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f13745a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13746b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13747c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13748d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13749e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13750f;

    public g(String str, String str2) {
        this.f13745a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f13746b = 0;
        this.f13747c = 400;
        this.f13748d = false;
        this.f13749e = str2;
        this.f13750f = 0;
    }

    public g(Uri uri, int i2, int i10, boolean z10, int i11) {
        uri.getClass();
        this.f13745a = uri;
        this.f13746b = i2;
        this.f13747c = i10;
        this.f13748d = z10;
        this.f13749e = null;
        this.f13750f = i11;
    }
}
