package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku7  reason: default package */
/* loaded from: classes.dex */
public class ku7 extends defpackage.ju7 {
    public defpackage.e83 r;

    public ku7(defpackage.vu7 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.r = r1
            return
    }

    @Override // defpackage.ru7
    public defpackage.vu7 b() {
            r1 = this;
            android.view.WindowInsets r1 = r1.c
            android.view.WindowInsets r1 = r1.consumeStableInsets()
            r0 = 0
            vu7 r1 = defpackage.vu7.g(r0, r1)
            return r1
    }

    @Override // defpackage.ru7
    public defpackage.vu7 c() {
            r1 = this;
            android.view.WindowInsets r1 = r1.c
            android.view.WindowInsets r1 = r1.consumeSystemWindowInsets()
            r0 = 0
            vu7 r1 = defpackage.vu7.g(r0, r1)
            return r1
    }

    @Override // defpackage.ru7
    public final defpackage.e83 k() {
            r4 = this;
            e83 r0 = r4.r
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.c
            int r1 = r0.getStableInsetLeft()
            int r2 = r0.getStableInsetTop()
            int r3 = r0.getStableInsetRight()
            int r0 = r0.getStableInsetBottom()
            e83 r0 = defpackage.e83.c(r1, r2, r3, r0)
            r4.r = r0
        L1c:
            e83 r4 = r4.r
            return r4
    }

    @Override // defpackage.ru7
    public boolean r() {
            r0 = this;
            android.view.WindowInsets r0 = r0.c
            boolean r0 = r0.isConsumed()
            return r0
    }

    @Override // defpackage.ru7
    public void x(defpackage.e83 r1) {
            r0 = this;
            r0.r = r1
            return
    }
}
