package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e64  reason: default package */
/* loaded from: classes.dex */
public final class e64 implements defpackage.y54 {
    public final android.content.Context a;
    public final defpackage.yc1 b;

    public e64(defpackage.yc1 r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    @Override // defpackage.y54
    public final int a() {
            r0 = this;
            r0 = 31
            return r0
    }

    @Override // defpackage.y54
    public final void b() {
            r7 = this;
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            android.content.Context r1 = r7.a
            java.lang.Object r0 = r1.getSystemService(r0)
            r0.getClass()
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            r4 = 29
            if (r2 < r3) goto L3a
            android.view.WindowMetrics r3 = defpackage.m2.n(r0)
            android.graphics.Rect r3 = defpackage.m2.g(r3)
            r3.getClass()
            android.view.WindowMetrics r0 = defpackage.m2.n(r0)
            android.view.WindowInsets r0 = defpackage.m2.l(r0)
            android.view.DisplayCutout r0 = defpackage.o05.c(r0)
            android.graphics.Point r5 = new android.graphics.Point
            int r6 = r3.width()
            int r3 = r3.height()
            r5.<init>(r6, r3)
            goto L4e
        L3a:
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>()
            r0.getRealSize(r5)
            if (r2 < r4) goto L4d
            android.view.DisplayCutout r0 = defpackage.fq7.b(r0)
            goto L4e
        L4d:
            r0 = 0
        L4e:
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r3 = 1
            if (r1 != r3) goto L78
            int r1 = r5.x
            int r3 = r5.y
            if (r2 < r4) goto L93
            if (r0 == 0) goto L93
            int r2 = defpackage.j2.x(r0)
            int r4 = defpackage.j2.C(r0)
            int r4 = r4 + r2
            int r1 = r1 - r4
            int r2 = defpackage.j2.b(r0)
            int r0 = defpackage.j2.B(r0)
        L75:
            int r0 = r0 + r2
            int r3 = r3 - r0
            goto L93
        L78:
            int r1 = r5.y
            int r3 = r5.x
            if (r2 < r4) goto L93
            if (r0 == 0) goto L93
            int r2 = defpackage.j2.b(r0)
            int r4 = defpackage.j2.B(r0)
            int r4 = r4 + r2
            int r1 = r1 - r4
            int r2 = defpackage.j2.x(r0)
            int r0 = defpackage.j2.C(r0)
            goto L75
        L93:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r1, r3)
            int r1 = r0.x
            int r0 = r0.y
            if (r1 <= r0) goto Lae
            my4 r2 = new my4
            r2.<init>(r0, r1)
            my4 r3 = new my4
            r3.<init>(r1, r0)
            vr4 r0 = new vr4
            r0.<init>(r2, r3)
            goto Lbd
        Lae:
            my4 r2 = new my4
            r2.<init>(r1, r0)
            my4 r3 = new my4
            r3.<init>(r0, r1)
            vr4 r0 = new vr4
            r0.<init>(r2, r3)
        Lbd:
            java.lang.Object r1 = r0.A
            my4 r1 = (defpackage.my4) r1
            java.lang.Object r0 = r0.B
            my4 r0 = (defpackage.my4) r0
            bi2 r2 = new bi2
            r3 = 22
            r2.<init>(r3, r1, r0)
            java.lang.Class<hk3> r0 = defpackage.hk3.class
            yc1 r7 = r7.b
            java.lang.String r1 = "layouts.json"
            r7.H(r1, r0, r2)
            return
    }

    @Override // defpackage.y54
    public final int c() {
            r0 = this;
            r0 = 32
            return r0
    }
}
