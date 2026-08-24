package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl2  reason: default package */
/* loaded from: classes.dex */
public abstract class wl2 {
    public static final defpackage.bm2 a = null;
    public static final defpackage.dm2 b = null;

    static {
            bm2 r0 = new bm2
            r0.<init>()
            defpackage.wl2.a = r0
            r0 = 0
            java.lang.Class<jm2> r1 = defpackage.jm2.class
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Exception -> L15
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L15
            dm2 r1 = (defpackage.dm2) r1     // Catch: java.lang.Exception -> L15
            r0 = r1
        L15:
            defpackage.wl2.b = r0
            return
    }

    public static final void a(int r3, java.util.ArrayList r4) {
            r4.getClass()
            int r0 = r4.size()
            r1 = 0
        L8:
            if (r1 >= r0) goto L16
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r3)
            goto L8
        L16:
            return
    }
}
