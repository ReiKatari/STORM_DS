package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp7  reason: default package */
/* loaded from: classes.dex */
public final class sp7 extends defpackage.wp7 {
    public final /* synthetic */ int k;

    public /* synthetic */ sp7(int r1) {
            r0 = this;
            r0.k = r1
            r0.<init>()
            return
    }

    @Override // defpackage.wp7
    public final boolean d(float r2, long r3, defpackage.ng3 r5, android.view.View r6) {
            r1 = this;
            int r0 = r1.k
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L55;
                case 2: goto L4b;
                case 3: goto L41;
                case 4: goto L37;
                case 5: goto L2d;
                case 6: goto L23;
                case 7: goto L19;
                case 8: goto Lf;
                default: goto L5;
            }
        L5:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setTranslationZ(r2)
            boolean r1 = r1.h
            return r1
        Lf:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setTranslationY(r2)
            boolean r1 = r1.h
            return r1
        L19:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setTranslationX(r2)
            boolean r1 = r1.h
            return r1
        L23:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setScaleY(r2)
            boolean r1 = r1.h
            return r1
        L2d:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setScaleX(r2)
            boolean r1 = r1.h
            return r1
        L37:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setRotationY(r2)
            boolean r1 = r1.h
            return r1
        L41:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setRotationX(r2)
            boolean r1 = r1.h
            return r1
        L4b:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setRotation(r2)
            boolean r1 = r1.h
            return r1
        L55:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setElevation(r2)
            boolean r1 = r1.h
            return r1
        L5f:
            float r2 = r1.b(r2, r3, r5, r6)
            r6.setAlpha(r2)
            boolean r1 = r1.h
            return r1
    }
}
