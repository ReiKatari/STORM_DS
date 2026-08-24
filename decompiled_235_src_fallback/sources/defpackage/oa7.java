package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa7  reason: default package */
/* loaded from: classes.dex */
public abstract class oa7 {
    public static final defpackage.nx a = null;
    public static final java.lang.ThreadLocal b = null;
    public static final java.util.ArrayList c = null;

    static {
            nx r0 = new nx
            r0.<init>()
            r1 = 0
            r0.B0 = r1
            h92 r1 = new h92
            r2 = 2
            r1.<init>(r2)
            r0.Q(r1)
            ql0 r1 = new ql0
            r1.<init>()
            r0.Q(r1)
            h92 r1 = new h92
            r2 = 1
            r1.<init>(r2)
            r0.Q(r1)
            defpackage.oa7.a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.oa7.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            defpackage.oa7.c = r0
            return
    }

    public static void a(android.view.ViewGroup r2, defpackage.ea7 r3) {
            java.util.ArrayList r0 = defpackage.oa7.c
            boolean r1 = r0.contains(r2)
            if (r1 != 0) goto L36
            boolean r1 = r2.isLaidOut()
            if (r1 == 0) goto L36
            r0.add(r2)
            if (r3 != 0) goto L15
            nx r3 = defpackage.oa7.a
        L15:
            ea7 r3 = r3.k()
            c(r2, r3)
            r0 = 0
            r1 = 2131428025(0x7f0b02b9, float:1.8477683E38)
            r2.setTag(r1, r0)
            na7 r0 = new na7
            r0.<init>()
            r0.A = r3
            r0.B = r2
            r2.addOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.addOnPreDrawListener(r0)
        L36:
            return
    }

    public static defpackage.wu b() {
            java.lang.ThreadLocal r0 = defpackage.oa7.b
            java.lang.Object r1 = r0.get()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.get()
            wu r1 = (defpackage.wu) r1
            if (r1 == 0) goto L13
            return r1
        L13:
            wu r1 = new wu
            r2 = 0
            r1.<init>(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.set(r2)
            return r1
    }

    public static void c(android.view.ViewGroup r4, defpackage.ea7 r5) {
            wu r0 = b()
            java.lang.Object r0 = r0.get(r4)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L25
            int r1 = r0.size()
            if (r1 <= 0) goto L25
            int r1 = r0.size()
            r2 = 0
        L17:
            if (r2 >= r1) goto L25
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            ea7 r3 = (defpackage.ea7) r3
            r3.B(r4)
            goto L17
        L25:
            if (r5 == 0) goto L2b
            r0 = 1
            r5.i(r4, r0)
        L2b:
            r5 = 2131428025(0x7f0b02b9, float:1.8477683E38)
            java.lang.Object r4 = r4.getTag(r5)
            if (r4 != 0) goto L35
            return
        L35:
            defpackage.u34.a()
            return
    }
}
