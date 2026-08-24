package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq1  reason: default package */
/* loaded from: classes.dex */
public final class wq1 extends defpackage.jw2 {
    public final /* synthetic */ int F;

    public /* synthetic */ wq1(int r1) {
            r0 = this;
            r0.F = r1
            r0.<init>()
            return
    }

    @Override // defpackage.jw2
    public final void F(defpackage.xe6 r1, float r2) {
            r0 = this;
            int r0 = r0.F
            switch(r0) {
                case 0: goto L23;
                case 1: goto L1d;
                case 2: goto L17;
                case 3: goto L11;
                case 4: goto Lb;
                default: goto L5;
            }
        L5:
            android.view.View r1 = (android.view.View) r1
            r1.setRotationY(r2)
            return
        Lb:
            android.view.View r1 = (android.view.View) r1
            r1.setRotationX(r2)
            return
        L11:
            android.view.View r1 = (android.view.View) r1
            r1.setRotation(r2)
            return
        L17:
            android.view.View r1 = (android.view.View) r1
            r1.setScaleY(r2)
            return
        L1d:
            android.view.View r1 = (android.view.View) r1
            r1.setScaleX(r2)
            return
        L23:
            android.view.View r1 = (android.view.View) r1
            r1.setAlpha(r2)
            return
    }

    @Override // defpackage.jw2
    public final float t(defpackage.xe6 r1) {
            r0 = this;
            int r0 = r0.F
            switch(r0) {
                case 0: goto L28;
                case 1: goto L21;
                case 2: goto L1a;
                case 3: goto L13;
                case 4: goto Lc;
                default: goto L5;
            }
        L5:
            android.view.View r1 = (android.view.View) r1
            float r0 = r1.getRotationY()
            return r0
        Lc:
            android.view.View r1 = (android.view.View) r1
            float r0 = r1.getRotationX()
            return r0
        L13:
            android.view.View r1 = (android.view.View) r1
            float r0 = r1.getRotation()
            return r0
        L1a:
            android.view.View r1 = (android.view.View) r1
            float r0 = r1.getScaleY()
            return r0
        L21:
            android.view.View r1 = (android.view.View) r1
            float r0 = r1.getScaleX()
            return r0
        L28:
            android.view.View r1 = (android.view.View) r1
            float r0 = r1.getAlpha()
            return r0
    }
}
