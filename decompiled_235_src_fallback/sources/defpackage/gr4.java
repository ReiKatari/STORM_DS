package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gr4  reason: default package */
/* loaded from: classes.dex */
public final class gr4 extends defpackage.iv3 {
    public final /* synthetic */ defpackage.hr4 q;

    public gr4(defpackage.hr4 r1, android.content.Context r2) {
            r0 = this;
            r0.q = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.iv3
    public final float d(android.util.DisplayMetrics r1) {
            r0 = this;
            int r0 = r1.densityDpi
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            return r1
    }

    @Override // defpackage.iv3
    public final int e(int r2) {
            r1 = this;
            r0 = 100
            int r1 = super.e(r2)
            int r1 = java.lang.Math.min(r0, r1)
            return r1
    }

    @Override // defpackage.iv3
    public final void h(android.view.View r7, defpackage.qg5 r8) {
            r6 = this;
            hr4 r0 = r6.q
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            gg5 r1 = r1.getLayoutManager()
            int[] r7 = r0.a(r1, r7)
            r0 = 0
            r0 = r7[r0]
            r1 = 1
            r7 = r7[r1]
            int r2 = java.lang.Math.abs(r0)
            int r3 = java.lang.Math.abs(r7)
            int r2 = java.lang.Math.max(r2, r3)
            int r2 = r6.e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L3c
            r8.a = r0
            r8.b = r7
            r8.c = r2
            android.view.animation.DecelerateInterpolator r6 = r6.j
            r8.e = r6
            r8.f = r1
        L3c:
            return
    }
}
