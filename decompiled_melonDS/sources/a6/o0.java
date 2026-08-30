package a6;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public i2 f495a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f496b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f497c;

    public o0(View view, v vVar) {
        this.f496b = view;
        this.f497c = vVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        i2 g10 = i2.g(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        v vVar = this.f497c;
        if (i2 < 30) {
            p0.a(windowInsets, this.f496b);
            if (g10.equals(this.f495a)) {
                return vVar.s(view, g10).f();
            }
        }
        this.f495a = g10;
        i2 s10 = vVar.s(view, g10);
        if (i2 >= 30) {
            return s10.f();
        }
        WeakHashMap weakHashMap = x0.f533a;
        n0.c(view);
        return s10.f();
    }
}
