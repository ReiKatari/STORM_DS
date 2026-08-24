package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tf5  reason: default package */
/* loaded from: classes.dex */
public final class tf5 implements android.view.animation.Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ tf5(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r2) {
            r1 = this;
            int r1 = r1.a
            switch(r1) {
                case 0: goto L5;
                default: goto L5;
            }
        L5:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r1
            float r0 = r2 * r2
            float r0 = r0 * r2
            float r0 = r0 * r2
            float r0 = r0 * r2
            float r0 = r0 + r1
            return r0
    }
}
