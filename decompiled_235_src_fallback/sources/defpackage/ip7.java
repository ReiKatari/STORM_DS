package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ip7  reason: default package */
/* loaded from: classes.dex */
public final class ip7 {
    public final java.lang.ref.WeakReference a;

    public ip7(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public final void a(float r1) {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r1)
        L11:
            return
    }

    public final void b() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }

    public final void c(long r1) {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r1)
        L11:
            return
    }

    public final void d(defpackage.kp7 r3) {
            r2 = this;
            java.lang.ref.WeakReference r2 = r2.a
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L21
            if (r3 == 0) goto L19
            android.view.ViewPropertyAnimator r0 = r2.animate()
            s7 r1 = new s7
            r1.<init>(r3, r2)
            r0.setListener(r1)
            return
        L19:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r3 = 0
            r2.setListener(r3)
        L21:
            return
    }

    public final void e(float r1) {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r1)
        L11:
            return
    }
}
