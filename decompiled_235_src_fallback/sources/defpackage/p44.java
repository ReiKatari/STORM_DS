package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p44  reason: default package */
/* loaded from: classes.dex */
public final class p44 implements android.view.ActionProvider.VisibilityListener {
    public defpackage.s63 a;
    public final android.view.ActionProvider b;

    public p44(defpackage.s44 r1, android.view.ActionProvider r2) {
            r0 = this;
            r0.<init>()
            r0.b = r2
            return
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean r1) {
            r0 = this;
            s63 r0 = r0.a
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.B
            o44 r0 = (defpackage.o44) r0
            i44 r0 = r0.n
            r1 = 1
            r0.h = r1
            r0.p(r1)
        L10:
            return
    }
}
