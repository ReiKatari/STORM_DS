package n9;

import android.content.Context;
import android.util.DisplayMetrics;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10112a;

    public c(Context context) {
        this.f10112a = context;
    }

    @Override // n9.h
    public final Object e(b9.f fVar) {
        DisplayMetrics displayMetrics = this.f10112a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new g(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (k.a(this.f10112a, ((c) obj).f10112a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10112a.hashCode();
    }
}
