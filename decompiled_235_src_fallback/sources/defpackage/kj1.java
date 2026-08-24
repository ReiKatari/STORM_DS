package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kj1  reason: default package */
/* loaded from: classes.dex */
public final class kj1 extends android.view.ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ kj1(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r3, android.graphics.Outline r4) {
            r2 = this;
            int r2 = r2.a
            r0 = 0
            r1 = 0
            switch(r2) {
                case 0: goto L2d;
                case 1: goto L1e;
                case 2: goto L10;
                default: goto L7;
            }
        L7:
            r3.getClass()
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
        L10:
            boolean r2 = r3 instanceof defpackage.oo7
            if (r2 == 0) goto L1d
            oo7 r3 = (defpackage.oo7) r3
            android.graphics.Outline r2 = r3.d0
            if (r2 == 0) goto L1d
            r4.set(r2)
        L1d:
            return
        L1e:
            int r2 = r3.getWidth()
            int r3 = r3.getHeight()
            r4.setRect(r1, r1, r2, r3)
            r4.setAlpha(r0)
            return
        L2d:
            int r2 = r3.getWidth()
            int r3 = r3.getHeight()
            r4.setRect(r1, r1, r2, r3)
            r4.setAlpha(r0)
            return
    }
}
