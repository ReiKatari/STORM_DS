package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl0  reason: default package */
/* loaded from: classes.dex */
public final class bl0 extends defpackage.iv3 {
    public final /* synthetic */ int q;

    public /* synthetic */ bl0(android.content.Context r2) {
            r1 = this;
            r0 = 1
            r1.q = r0
            r1.<init>(r2)
            return
    }

    public bl0(com.google.android.material.carousel.CarouselLayoutManager r1, android.content.Context r2) {
            r0 = this;
            r1 = 0
            r0.q = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.iv3
    public int b(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.b(r2, r3)
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // defpackage.iv3
    public int c(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.c(r2, r3)
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // defpackage.iv3
    public float d(android.util.DisplayMetrics r2) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            float r1 = super.d(r2)
            return r1
        La:
            int r1 = r2.densityDpi
            float r1 = (float) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r1
            return r2
    }

    @Override // defpackage.iv3
    public android.graphics.PointF f(int r2) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            android.graphics.PointF r1 = super.f(r2)
            return r1
        La:
            r1 = 0
            return r1
    }
}
