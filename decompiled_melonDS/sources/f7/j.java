package f7;

import a5.y;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: c  reason: collision with root package name */
    public final OnBackInvokedDispatcher f4953c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4954d;

    /* renamed from: e  reason: collision with root package name */
    public final OnBackInvokedCallback f4955e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4956f;

    public j(OnBackInvokedDispatcher onBackInvokedDispatcher, int i2) {
        OnBackInvokedCallback kVar;
        this.f4953c = onBackInvokedDispatcher;
        this.f4954d = i2;
        if (Build.VERSION.SDK_INT == 33) {
            kVar = new y(1, this);
        } else {
            kVar = new k(this);
        }
        this.f4955e = kVar;
    }

    @Override // f7.f
    public final void b(boolean z10) {
        if (z10 && !this.f4956f) {
            b6.c.v(this.f4953c, this.f4954d, this.f4955e);
            this.f4956f = true;
        } else if (!z10 && this.f4956f) {
            b6.c.x(this.f4953c, this.f4955e);
            this.f4956f = false;
        }
    }
}
