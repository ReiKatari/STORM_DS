package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l74  reason: default package */
/* loaded from: classes.dex */
public final class l74 implements android.view.animation.Interpolator {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.gr1 b;

    public /* synthetic */ l74(defpackage.gr1 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L16;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            gr1 r2 = r2.b
            double r0 = (double) r3
            double r2 = r2.a(r0)
        Lc:
            float r2 = (float) r2
            return r2
        Le:
            gr1 r2 = r2.b
            double r0 = (double) r3
            double r2 = r2.a(r0)
            goto Lc
        L16:
            gr1 r2 = r2.b
            double r0 = (double) r3
            double r2 = r2.a(r0)
            goto Lc
    }
}
