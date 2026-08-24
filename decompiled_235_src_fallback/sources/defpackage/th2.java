package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th2  reason: default package */
/* loaded from: classes.dex */
public final class th2 implements java.util.Comparator {
    public final android.graphics.Rect a;
    public final android.graphics.Rect b;
    public final boolean c;
    public final defpackage.jd1 d;

    public th2(boolean r2, defpackage.jd1 r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.a = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.b = r0
            r1.c = r2
            r1.d = r3
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            jd1 r0 = r2.d
            r0.getClass()
            v2 r3 = (defpackage.v2) r3
            android.graphics.Rect r0 = r2.a
            r3.f(r0)
            v2 r4 = (defpackage.v2) r4
            android.graphics.Rect r3 = r2.b
            r4.f(r3)
            int r4 = r0.top
            int r1 = r3.top
            if (r4 >= r1) goto L1a
            goto L44
        L1a:
            if (r4 <= r1) goto L1d
            goto L46
        L1d:
            int r4 = r0.left
            int r1 = r3.left
            boolean r2 = r2.c
            if (r4 >= r1) goto L28
            if (r2 == 0) goto L44
            goto L46
        L28:
            if (r4 <= r1) goto L2d
            if (r2 == 0) goto L46
            goto L44
        L2d:
            int r4 = r0.bottom
            int r1 = r3.bottom
            if (r4 >= r1) goto L34
            goto L44
        L34:
            if (r4 <= r1) goto L37
            goto L46
        L37:
            int r4 = r0.right
            int r3 = r3.right
            if (r4 >= r3) goto L40
            if (r2 == 0) goto L44
            goto L46
        L40:
            if (r4 <= r3) goto L48
            if (r2 == 0) goto L46
        L44:
            r2 = -1
            return r2
        L46:
            r2 = 1
            return r2
        L48:
            r2 = 0
            return r2
    }
}
