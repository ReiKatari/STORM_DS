package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt7  reason: default package */
/* loaded from: classes.dex */
public abstract class kt7 {
    public static void a(android.view.Window r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto La
            defpackage.q2.i(r2, r3)
            return
        La:
            r1 = 30
            if (r0 < r1) goto L12
            defpackage.q2.h(r2, r3)
            return
        L12:
            android.view.View r2 = r2.getDecorView()
            int r0 = r2.getSystemUiVisibility()
            if (r3 == 0) goto L1f
            r3 = r0 & (-1793(0xfffffffffffff8ff, float:NaN))
            goto L21
        L1f:
            r3 = r0 | 1792(0x700, float:2.511E-42)
        L21:
            r2.setSystemUiVisibility(r3)
            return
    }

    public static void b(int r2, java.lang.Object[] r3) {
            r0 = 0
        L1:
            if (r0 >= r2) goto L13
            r1 = r3[r0]
            if (r1 == 0) goto La
            int r0 = r0 + 1
            goto L1
        La:
            java.lang.String r2 = "at index "
            java.lang.String r2 = defpackage.lb1.g(r0, r2)
            defpackage.u34.x(r2)
        L13:
            return
    }
}
