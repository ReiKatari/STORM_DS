package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu7  reason: default package */
/* loaded from: classes.dex */
public final class vu7 {
    public static final defpackage.vu7 b = null;
    public final defpackage.ru7 a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            vu7 r0 = defpackage.pu7.w
            defpackage.vu7.b = r0
            return
        Lb:
            r1 = 30
            if (r0 < r1) goto L14
            vu7 r0 = defpackage.nu7.v
            defpackage.vu7.b = r0
            return
        L14:
            vu7 r0 = defpackage.ru7.b
            defpackage.vu7.b = r0
            return
    }

    public vu7() {
            r1 = this;
            r1.<init>()
            ru7 r0 = new ru7
            r0.<init>(r1)
            r1.a = r0
            return
    }

    public vu7(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L11
            qu7 r0 = new qu7
            r0.<init>(r2, r3)
            r2.a = r0
            return
        L11:
            r1 = 34
            if (r0 < r1) goto L1d
            pu7 r0 = new pu7
            r0.<init>(r2, r3)
            r2.a = r0
            return
        L1d:
            r1 = 31
            if (r0 < r1) goto L29
            ou7 r0 = new ou7
            r0.<init>(r2, r3)
            r2.a = r0
            return
        L29:
            r1 = 30
            if (r0 < r1) goto L35
            nu7 r0 = new nu7
            r0.<init>(r2, r3)
            r2.a = r0
            return
        L35:
            r1 = 29
            if (r0 < r1) goto L41
            mu7 r0 = new mu7
            r0.<init>(r2, r3)
            r2.a = r0
            return
        L41:
            r1 = 28
            if (r0 < r1) goto L4d
            lu7 r0 = new lu7
            r0.<init>(r2, r3)
            r2.a = r0
            return
        L4d:
            ku7 r0 = new ku7
            r0.<init>(r2, r3)
            r2.a = r0
            return
    }

    public static defpackage.e83 e(defpackage.e83 r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.a
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.b
            int r2 = r2 - r7
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r5.c
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r5.d
            int r4 = r4 - r9
            int r1 = java.lang.Math.max(r1, r4)
            if (r0 != r6) goto L26
            if (r2 != r7) goto L26
            if (r3 != r8) goto L26
            if (r1 != r9) goto L26
            return r5
        L26:
            e83 r5 = defpackage.e83.c(r0, r2, r3, r1)
            return r5
    }

    public static defpackage.vu7 g(android.view.View r2, android.view.WindowInsets r3) {
            vu7 r0 = new vu7
            r3.getClass()
            r0.<init>(r3)
            if (r2 == 0) goto L2f
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L2f
            java.util.WeakHashMap r3 = defpackage.ao7.a
            vu7 r3 = defpackage.tn7.a(r2)
            ru7 r1 = r0.a
            r1.w(r3)
            android.view.View r3 = r2.getRootView()
            r1.d(r3)
            r1.o(r3)
            r1.p()
            int r2 = r2.getWindowSystemUiVisibility()
            r1.y(r2)
        L2f:
            return r0
    }

    public final int a() {
            r0 = this;
            ru7 r0 = r0.a
            e83 r0 = r0.m()
            int r0 = r0.d
            return r0
    }

    public final int b() {
            r0 = this;
            ru7 r0 = r0.a
            e83 r0 = r0.m()
            int r0 = r0.a
            return r0
    }

    public final int c() {
            r0 = this;
            ru7 r0 = r0.a
            e83 r0 = r0.m()
            int r0 = r0.c
            return r0
    }

    public final int d() {
            r0 = this;
            ru7 r0 = r0.a
            e83 r0 = r0.m()
            int r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.vu7
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            vu7 r2 = (defpackage.vu7) r2
            ru7 r1 = r1.a
            ru7 r2 = r2.a
            boolean r1 = java.util.Objects.equals(r1, r2)
            return r1
    }

    public final android.view.WindowInsets f() {
            r1 = this;
            ru7 r1 = r1.a
            boolean r0 = r1 instanceof defpackage.ju7
            if (r0 == 0) goto Lb
            ju7 r1 = (defpackage.ju7) r1
            android.view.WindowInsets r1 = r1.c
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ru7 r0 = r0.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }
}
