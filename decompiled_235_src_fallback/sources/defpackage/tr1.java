package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr1  reason: default package */
/* loaded from: classes.dex */
public abstract class tr1 {
    public static final int a = 0;
    public static final int b = 0;
    public static defpackage.bs1 c;

    static {
            r0 = 230(0xe6, float:3.22E-43)
            r1 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            defpackage.tr1.a = r0
            r0 = 128(0x80, float:1.8E-43)
            r1 = 27
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            defpackage.tr1.b = r0
            return
    }

    public static void a(defpackage.mv0 r10, defpackage.ix6 r11) {
            r76 r0 = new r76
            r1 = 19
            r0.<init>(r1)
            ix6 r5 = new ix6
            int r1 = defpackage.tr1.a
            int r2 = defpackage.tr1.b
            r9 = 0
            r5.<init>(r1, r2, r9, r0)
            r10.getClass()
            android.view.Window r0 = r10.getWindow()
            android.view.View r7 = r0.getDecorView()
            r7.getClass()
            bs1 r0 = defpackage.tr1.c
            if (r0 != 0) goto L5e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L2f
            as1 r0 = new as1
            r0.<init>()
            goto L5c
        L2f:
            r1 = 30
            if (r0 < r1) goto L39
            zr1 r0 = new zr1
            r0.<init>()
            goto L5c
        L39:
            r1 = 29
            if (r0 < r1) goto L43
            xr1 r0 = new xr1
            r0.<init>()
            goto L5c
        L43:
            r1 = 28
            if (r0 < r1) goto L4d
            wr1 r0 = new wr1
            r0.<init>()
            goto L5c
        L4d:
            r1 = 26
            if (r0 < r1) goto L57
            vr1 r0 = new vr1
            r0.<init>()
            goto L5c
        L57:
            ur1 r0 = new ur1
            r0.<init>()
        L5c:
            defpackage.tr1.c = r0
        L5e:
            r3 = r0
            q30 r2 = new q30
            r8 = 1
            r6 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        L69:
            int r10 = r7.getChildCount()
            if (r9 >= r10) goto L88
            int r10 = r9 + 1
            android.view.View r11 = r7.getChildAt(r9)
            if (r11 == 0) goto L82
            java.lang.Object r11 = r11.getTag()
            boolean r11 = r11 instanceof defpackage.bs1
            if (r11 == 0) goto L80
            goto La0
        L80:
            r9 = r10
            goto L69
        L82:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
        L88:
            android.content.Context r10 = r7.getContext()
            sr1 r11 = new sr1
            r11.<init>(r2, r10)
            r11.setTag(r3)
            r10 = 8
            r11.setVisibility(r10)
            r10 = 1
            r11.setWillNotDraw(r10)
            r7.addView(r11)
        La0:
            r2.run()
            android.view.Window r10 = r6.getWindow()
            r10.getClass()
            r3.a(r10)
            return
    }
}
