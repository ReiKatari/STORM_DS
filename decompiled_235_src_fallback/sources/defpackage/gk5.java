package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk5  reason: default package */
/* loaded from: classes.dex */
public abstract class gk5 {
    public static void a(android.app.Activity r1, defpackage.st3 r2) {
            r2.getClass()
            boolean r0 = r1 instanceof defpackage.hu3
            if (r0 == 0) goto L16
            hu3 r1 = (defpackage.hu3) r1
            ut3 r1 = r1.getLifecycle()
            boolean r0 = r1 instanceof defpackage.ku3
            if (r0 == 0) goto L16
            ku3 r1 = (defpackage.ku3) r1
            r1.f(r2)
        L16:
            return
    }

    public static void b(android.app.Activity r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L13
            hk5 r0 = defpackage.ik5.a.Companion
            r0.getClass()
            ik5$a r0 = new ik5$a
            r0.<init>()
            defpackage.r74.q(r3, r0)
        L13:
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            if (r1 != 0) goto L32
            android.app.FragmentTransaction r1 = r3.beginTransaction()
            ik5 r2 = new ik5
            r2.<init>()
            android.app.FragmentTransaction r0 = r1.add(r2, r0)
            r0.commit()
            r3.executePendingTransactions()
        L32:
            return
    }
}
