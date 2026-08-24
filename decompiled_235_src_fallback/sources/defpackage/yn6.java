package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yn6  reason: default package */
/* loaded from: classes.dex */
public final class yn6 {
    public static defpackage.ao6 a(android.view.View r2) {
            r2.getClass()
            float r0 = r2.getAlpha()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L15
            ao6 r2 = defpackage.ao6.INVISIBLE
            return r2
        L15:
            int r2 = r2.getVisibility()
            ao6 r2 = b(r2)
            return r2
    }

    public static defpackage.ao6 b(int r1) {
            if (r1 == 0) goto L1a
            r0 = 4
            if (r1 == r0) goto L17
            r0 = 8
            if (r1 != r0) goto Lc
            ao6 r1 = defpackage.ao6.GONE
            return r1
        Lc:
            java.lang.String r0 = "Unknown visibility "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L17:
            ao6 r1 = defpackage.ao6.INVISIBLE
            return r1
        L1a:
            ao6 r1 = defpackage.ao6.VISIBLE
            return r1
    }
}
