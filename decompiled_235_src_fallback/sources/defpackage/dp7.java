package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp7  reason: default package */
/* loaded from: classes.dex */
public final class dp7 extends defpackage.hp7 {
    public final /* synthetic */ int g;

    public /* synthetic */ dp7(int r1) {
            r0 = this;
            r0.g = r1
            r0.<init>()
            return
    }

    @Override // defpackage.hp7
    public final void d(android.view.View r2, float r3) {
            r1 = this;
            int r0 = r1.g
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L45;
                case 2: goto L3d;
                case 3: goto L35;
                case 4: goto L2d;
                case 5: goto L25;
                case 6: goto L1d;
                case 7: goto L15;
                case 8: goto Ld;
                default: goto L5;
            }
        L5:
            float r1 = r1.a(r3)
            r2.setTranslationZ(r1)
            return
        Ld:
            float r1 = r1.a(r3)
            r2.setTranslationY(r1)
            return
        L15:
            float r1 = r1.a(r3)
            r2.setTranslationX(r1)
            return
        L1d:
            float r1 = r1.a(r3)
            r2.setScaleY(r1)
            return
        L25:
            float r1 = r1.a(r3)
            r2.setScaleX(r1)
            return
        L2d:
            float r1 = r1.a(r3)
            r2.setRotationY(r1)
            return
        L35:
            float r1 = r1.a(r3)
            r2.setRotationX(r1)
            return
        L3d:
            float r1 = r1.a(r3)
            r2.setRotation(r1)
            return
        L45:
            float r1 = r1.a(r3)
            r2.setElevation(r1)
            return
        L4d:
            float r1 = r1.a(r3)
            r2.setAlpha(r1)
            return
    }
}
