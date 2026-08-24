package defpackage;

import android.view.WindowInsets;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku7  reason: default package */
/* loaded from: classes.dex */
public class ku7 extends ju7 {
    public e83 r;

    public ku7(vu7 vu7Var, WindowInsets windowInsets) {
        super(vu7Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.ru7
    public vu7 b() {
        return vu7.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.ru7
    public vu7 c() {
        return vu7.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.ru7
    public final e83 k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = e83.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.ru7
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.ru7
    public void x(e83 e83Var) {
        this.r = e83Var;
    }
}
