package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v82  reason: default package */
/* loaded from: classes.dex */
public final class v82 {
    public final defpackage.mv0 a;
    public defpackage.x82 b;
    public defpackage.zv0 c;
    public final defpackage.zk1 d;

    public v82(defpackage.mv0 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            zk1 r2 = new zk1
            r0 = 2
            r2.<init>(r1, r0)
            r1.d = r2
            return
    }

    public final void a() {
            r2 = this;
            mv0 r0 = r2.a
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            r0.getClass()
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            zk1 r1 = r2.d
            r0.unregisterDisplayListener(r1)
            x82 r0 = r2.b
            if (r0 == 0) goto L19
            r0.dismiss()
        L19:
            r0 = 0
            r2.b = r0
            return
    }

    public final void b() {
            r4 = this;
            java.lang.String r0 = "display"
            mv0 r1 = r4.a
            java.lang.Object r0 = r1.getSystemService(r0)
            r0.getClass()
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            java.lang.String r2 = "android.hardware.display.category.PRESENTATION"
            android.view.Display[] r0 = r0.getDisplays(r2)
            r0.getClass()
            java.lang.Object r0 = defpackage.fv.E0(r0)
            android.view.Display r0 = (android.view.Display) r0
            x82 r2 = r4.b
            if (r0 != 0) goto L29
            if (r2 == 0) goto L25
            r2.dismiss()
        L25:
            r0 = 0
            r4.b = r0
            return
        L29:
            if (r2 == 0) goto L3c
            android.view.Display r2 = r2.getDisplay()
            if (r2 == 0) goto L3c
            int r2 = r2.getDisplayId()
            int r3 = r0.getDisplayId()
            if (r2 != r3) goto L3c
            return
        L3c:
            x82 r2 = r4.b
            if (r2 == 0) goto L43
            r2.dismiss()
        L43:
            x82 r2 = new x82
            r2.<init>(r1, r0)
            zv0 r0 = r4.c
            vs4 r1 = r2.B
            r1.setValue(r0)
            r2.show()     // Catch: java.lang.Throwable -> L52
        L52:
            r4.b = r2
            return
    }
}
