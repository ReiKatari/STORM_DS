package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import cd.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends f0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3190a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3191b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public AssetManager f3192c;

    public b(Context context) {
        this.f3190a = context;
    }

    @Override // com.squareup.picasso.f0
    public final boolean a(a4.n nVar) {
        Uri uri = (Uri) nVar.B;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.f0
    public final h1 c(a4.n nVar, int i2) {
        if (this.f3192c == null) {
            synchronized (this.f3191b) {
                try {
                    if (this.f3192c == null) {
                        this.f3192c = this.f3190a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new h1(ij.a.w0(this.f3192c.open(((Uri) nVar.B).toString().substring(22))), y.DISK);
    }
}
