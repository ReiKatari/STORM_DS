package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg2  reason: default package */
/* loaded from: classes.dex */
public abstract class wg2 {
    public static final int[] a = null;
    public static final android.graphics.Rect b = null;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            defpackage.wg2.a = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            defpackage.wg2.b = r0
            return
    }

    public static final defpackage.of5 a(android.view.View r5, defpackage.te r6) {
            int[] r0 = defpackage.wg2.a
            r5.getLocationInWindow(r0)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r6.getLocationInWindow(r0)
            r6 = r0[r1]
            r0 = r0[r3]
            int r2 = r2 - r6
            float r6 = (float) r2
            int r4 = r4 - r0
            float r0 = (float) r4
            android.graphics.Rect r1 = defpackage.wg2.b
            r5.getFocusedRect(r1)
            of5 r5 = new of5
            int r2 = r1.left
            float r2 = (float) r2
            float r6 = r6 + r2
            int r2 = r1.top
            float r2 = (float) r2
            float r2 = r2 + r0
            int r3 = r1.width()
            float r3 = (float) r3
            float r3 = r3 + r6
            int r4 = r1.top
            float r4 = (float) r4
            float r0 = r0 + r4
            int r1 = r1.height()
            float r1 = (float) r1
            float r0 = r0 + r1
            r5.<init>(r6, r2, r3, r0)
            return r5
    }

    public static final defpackage.qg2 b(int r2) {
            r0 = 2
            r1 = 1
            if (r2 == r1) goto L3a
            if (r2 == r0) goto L34
            r0 = 17
            if (r2 == r0) goto L2d
            r0 = 33
            if (r2 == r0) goto L26
            r0 = 66
            if (r2 == r0) goto L1f
            r0 = 130(0x82, float:1.82E-43)
            if (r2 == r0) goto L18
            r2 = 0
            return r2
        L18:
            qg2 r2 = new qg2
            r0 = 6
            r2.<init>(r0)
            return r2
        L1f:
            qg2 r2 = new qg2
            r0 = 4
            r2.<init>(r0)
            return r2
        L26:
            qg2 r2 = new qg2
            r0 = 5
            r2.<init>(r0)
            return r2
        L2d:
            qg2 r2 = new qg2
            r0 = 3
            r2.<init>(r0)
            return r2
        L34:
            qg2 r2 = new qg2
            r2.<init>(r1)
            return r2
        L3a:
            qg2 r2 = new qg2
            r2.<init>(r0)
            return r2
    }
}
