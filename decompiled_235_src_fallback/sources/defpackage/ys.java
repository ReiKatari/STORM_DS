package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ys  reason: default package */
/* loaded from: classes.dex */
public class ys {
    public static final java.lang.Class[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final java.lang.String[] g = null;
    public static final defpackage.ci6 h = null;
    public final java.lang.Object[] a;

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            defpackage.ys.b = r0
            r0 = 16843375(0x101026f, float:2.3695304E-38)
            int[] r0 = new int[]{r0}
            defpackage.ys.c = r0
            r0 = 16844160(0x1010580, float:2.3697504E-38)
            int[] r0 = new int[]{r0}
            defpackage.ys.d = r0
            r0 = 16844156(0x101057c, float:2.3697493E-38)
            int[] r0 = new int[]{r0}
            defpackage.ys.e = r0
            r0 = 16844148(0x1010574, float:2.369747E-38)
            int[] r0 = new int[]{r0}
            defpackage.ys.f = r0
            java.lang.String r0 = "android.view."
            java.lang.String r1 = "android.webkit."
            java.lang.String r2 = "android.widget."
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            defpackage.ys.g = r0
            ci6 r0 = new ci6
            r1 = 0
            r0.<init>(r1)
            defpackage.ys.h = r0
            return
    }

    public ys() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.a = r0
            return
    }

    public defpackage.kq a(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            kq r0 = new kq
            r0.<init>(r1, r2)
            return r0
    }

    public defpackage.lq b(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            lq r1 = new lq
            r0 = 2130968740(0x7f0400a4, float:1.7546142E38)
            r1.<init>(r2, r3, r0)
            return r1
    }

    public defpackage.nq c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            nq r1 = new nq
            r0 = 2130968770(0x7f0400c2, float:1.7546203E38)
            r1.<init>(r2, r3, r0)
            return r1
    }

    public defpackage.qr d(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            qr r0 = new qr
            r0.<init>(r1, r2)
            return r0
    }

    public defpackage.qs e(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            qs r0 = new qs
            r0.<init>(r1, r2)
            return r0
    }

    public final android.view.View f(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            ci6 r0 = defpackage.ys.h
            java.lang.Object r1 = r0.get(r4)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            if (r1 != 0) goto L2a
            if (r5 == 0) goto L11
            java.lang.String r5 = r5.concat(r4)     // Catch: java.lang.Exception -> L37
            goto L12
        L11:
            r5 = r4
        L12:
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L37
            r1 = 0
            java.lang.Class r3 = java.lang.Class.forName(r5, r1, r3)     // Catch: java.lang.Exception -> L37
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class r3 = r3.asSubclass(r5)     // Catch: java.lang.Exception -> L37
            java.lang.Class[] r5 = defpackage.ys.b     // Catch: java.lang.Exception -> L37
            java.lang.reflect.Constructor r1 = r3.getConstructor(r5)     // Catch: java.lang.Exception -> L37
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L37
        L2a:
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L37
            java.lang.Object[] r2 = r2.a     // Catch: java.lang.Exception -> L37
            java.lang.Object r2 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L37
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Exception -> L37
            return r2
        L37:
            r2 = 0
            return r2
    }
}
