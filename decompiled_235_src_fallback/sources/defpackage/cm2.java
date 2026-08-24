package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm2  reason: default package */
/* loaded from: classes.dex */
public final class cm2 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.ArrayList B;
    public final /* synthetic */ java.util.ArrayList L;
    public final /* synthetic */ java.util.ArrayList R;
    public final /* synthetic */ java.util.ArrayList X;

    public cm2(int r1, java.util.ArrayList r2, java.util.ArrayList r3, java.util.ArrayList r4, java.util.ArrayList r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.A
            if (r0 >= r1) goto L30
            java.util.ArrayList r1 = r4.B
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            java.util.ArrayList r2 = r4.L
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.util.WeakHashMap r3 = defpackage.ao7.a
            r1.setTransitionName(r2)
            java.util.ArrayList r1 = r4.R
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            java.util.ArrayList r2 = r4.X
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.setTransitionName(r2)
            int r0 = r0 + 1
            goto L1
        L30:
            return
    }
}
