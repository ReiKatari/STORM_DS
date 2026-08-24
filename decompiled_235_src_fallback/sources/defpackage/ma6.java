package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ma6  reason: default package */
/* loaded from: classes.dex */
public abstract class ma6 {
    public static final defpackage.fa6 a = null;

    static {
            fa6 r0 = defpackage.xd5.p0
            defpackage.ma6.a = r0
            return
    }

    public static final boolean a(defpackage.oy4 r7) {
            java.util.List r0 = r7.a
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            r4 = 1
            if (r3 >= r1) goto L39
            java.lang.Object r5 = r0.get(r3)
            vy4 r5 = (defpackage.vy4) r5
            int r5 = r5.i
            r6 = 2
            if (r5 != r6) goto L19
            int r3 = r3 + 1
            goto L8
        L19:
            android.view.MotionEvent r0 = r7.a()
            if (r0 == 0) goto L28
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r0 = r0.isFromSource(r1)
            if (r0 != r4) goto L28
            goto L39
        L28:
            android.view.MotionEvent r7 = r7.a()
            if (r7 == 0) goto L38
            r0 = 1048584(0x100008, float:1.469379E-39)
            boolean r7 = r7.isFromSource(r0)
            if (r7 != r4) goto L38
            goto L39
        L38:
            return r2
        L39:
            return r4
    }
}
