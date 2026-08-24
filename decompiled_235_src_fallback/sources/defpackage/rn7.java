package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rn7  reason: default package */
/* loaded from: classes.dex */
public final class rn7 implements android.view.View.OnApplyWindowInsetsListener {
    public defpackage.vu7 a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ defpackage.zk4 c;

    public rn7(android.view.View r1, defpackage.zk4 r2) {
            r0 = this;
            r0.b = r1
            r0.c = r2
            r0.<init>()
            r1 = 0
            r0.a = r1
            return
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View r6, android.view.WindowInsets r7) {
            r5 = this;
            vu7 r0 = defpackage.vu7.g(r6, r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            zk4 r2 = r5.c
            r3 = 30
            if (r1 >= r3) goto L22
            android.view.View r4 = r5.b
            defpackage.sn7.a(r7, r4)
            vu7 r7 = r5.a
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L22
            vu7 r5 = r2.U(r6, r0)
            android.view.WindowInsets r5 = r5.f()
            return r5
        L22:
            r5.a = r0
            vu7 r5 = r2.U(r6, r0)
            if (r1 < r3) goto L2f
            android.view.WindowInsets r5 = r5.f()
            return r5
        L2f:
            java.util.WeakHashMap r7 = defpackage.ao7.a
            r6.requestApplyInsets()
            android.view.WindowInsets r5 = r5.f()
            return r5
    }
}
