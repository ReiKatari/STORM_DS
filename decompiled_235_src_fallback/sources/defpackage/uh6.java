package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh6  reason: default package */
/* loaded from: classes.dex */
public final class uh6 {
    public static final /* synthetic */ int b = 0;
    public final defpackage.vl7 a;

    public uh6() {
            r1 = this;
            vl7 r0 = defpackage.vl7.QUIET
            r0.getClass()
            r1.<init>()
            r1.a = r0
            return
    }

    public static boolean a(androidx.window.sidecar.SidecarDisplayFeature r2, androidx.window.sidecar.SidecarDisplayFeature r3) {
            boolean r0 = defpackage.nb3.k(r2, r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            if (r2 != 0) goto Lb
            goto L18
        Lb:
            if (r3 != 0) goto Le
            goto L18
        Le:
            int r0 = r2.getType()
            int r1 = r3.getType()
            if (r0 == r1) goto L1a
        L18:
            r2 = 0
            return r2
        L1a:
            android.graphics.Rect r2 = r2.getRect()
            android.graphics.Rect r3 = r3.getRect()
            boolean r2 = defpackage.nb3.k(r2, r3)
            return r2
    }

    public static boolean b(java.util.List r5, java.util.List r6) {
            if (r5 != r6) goto L3
            goto L2c
        L3:
            int r0 = r5.size()
            int r1 = r6.size()
            r2 = 0
            if (r0 == r1) goto Lf
            goto L28
        Lf:
            int r0 = r5.size()
            r1 = r2
        L14:
            if (r1 >= r0) goto L2c
            java.lang.Object r3 = r5.get(r1)
            androidx.window.sidecar.SidecarDisplayFeature r3 = (androidx.window.sidecar.SidecarDisplayFeature) r3
            java.lang.Object r4 = r6.get(r1)
            androidx.window.sidecar.SidecarDisplayFeature r4 = (androidx.window.sidecar.SidecarDisplayFeature) r4
            boolean r3 = a(r3, r4)
            if (r3 != 0) goto L29
        L28:
            return r2
        L29:
            int r1 = r1 + 1
            goto L14
        L2c:
            r5 = 1
            return r5
    }

    public static final boolean e(androidx.window.sidecar.SidecarDisplayFeature r2) {
            r2.getClass()
            int r0 = r2.getType()
            r1 = 1
            if (r0 == r1) goto L14
            int r2 = r2.getType()
            r0 = 2
            if (r2 != r0) goto L12
            goto L14
        L12:
            r2 = 0
            return r2
        L14:
            return r1
    }

    public static final boolean f(androidx.window.sidecar.SidecarDisplayFeature r1) {
            r1.getClass()
            android.graphics.Rect r0 = r1.getRect()
            int r0 = r0.width()
            if (r0 != 0) goto L1a
            android.graphics.Rect r1 = r1.getRect()
            int r1 = r1.height()
            if (r1 == 0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    public static final boolean g(androidx.window.sidecar.SidecarDisplayFeature r2) {
            r2.getClass()
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L21
            android.graphics.Rect r0 = r2.getRect()
            int r0 = r0.width()
            if (r0 == 0) goto L21
            android.graphics.Rect r2 = r2.getRect()
            int r2 = r2.height()
            if (r2 != 0) goto L1f
            goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            return r1
    }

    public static final boolean h(androidx.window.sidecar.SidecarDisplayFeature r1) {
            r1.getClass()
            android.graphics.Rect r0 = r1.getRect()
            int r0 = r0.left
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r1.getRect()
            int r1 = r1.top
            if (r1 != 0) goto L14
            goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final defpackage.kv7 c(androidx.window.sidecar.SidecarWindowLayoutInfo r2, androidx.window.sidecar.SidecarDeviceState r3) {
            r1 = this;
            if (r2 != 0) goto La
            kv7 r1 = new kv7
            yt1 r2 = defpackage.yt1.A
            r1.<init>(r2)
            return r1
        La:
            androidx.window.sidecar.SidecarDeviceState r0 = new androidx.window.sidecar.SidecarDeviceState
            r0.<init>()
            int r3 = defpackage.th6.b(r3)
            defpackage.th6.d(r0, r3)
            java.util.List r2 = defpackage.th6.c(r2)
            java.util.ArrayList r1 = r1.d(r2, r0)
            kv7 r2 = new kv7
            r2.<init>(r1)
            return r2
    }

    public final java.util.ArrayList d(java.util.List r3, androidx.window.sidecar.SidecarDeviceState r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            androidx.window.sidecar.SidecarDisplayFeature r1 = (androidx.window.sidecar.SidecarDisplayFeature) r1
            lw2 r1 = r2.i(r1, r4)
            if (r1 == 0) goto L9
            r0.add(r1)
            goto L9
        L1f:
            return r0
    }

    public final defpackage.lw2 i(androidx.window.sidecar.SidecarDisplayFeature r4, androidx.window.sidecar.SidecarDeviceState r5) {
            r3 = this;
            gr1 r0 = defpackage.gr1.e0
            r4.getClass()
            vs0 r1 = defpackage.vs0.R
            vl7 r3 = r3.a
            r3.getClass()
            hk7 r2 = new hk7
            r2.<init>(r4, r3, r1)
            ph6 r3 = new ph6
            r3.<init>()
            java.lang.String r1 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            oi2 r3 = r2.U(r1, r3)
            qh6 r1 = new qh6
            r1.<init>()
            java.lang.String r2 = "Feature bounds must not be 0"
            oi2 r3 = r3.U(r2, r1)
            rh6 r1 = new rh6
            r1.<init>()
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            oi2 r3 = r3.U(r2, r1)
            sh6 r1 = new sh6
            r1.<init>()
            java.lang.String r2 = "Feature be pinned to either left or top"
            oi2 r3 = r3.U(r2, r1)
            java.lang.Object r3 = r3.o()
            androidx.window.sidecar.SidecarDisplayFeature r3 = (androidx.window.sidecar.SidecarDisplayFeature) r3
            if (r3 != 0) goto L46
            goto L7b
        L46:
            int r3 = r3.getType()
            r1 = 2
            r2 = 1
            if (r3 == r2) goto L54
            if (r3 == r1) goto L51
            goto L7b
        L51:
            gr1 r3 = defpackage.gr1.h0
            goto L56
        L54:
            gr1 r3 = defpackage.gr1.g0
        L56:
            int r5 = defpackage.th6.b(r5)
            if (r5 == 0) goto L7b
            if (r5 == r2) goto L7b
            if (r5 == r1) goto L67
            r1 = 3
            if (r5 == r1) goto L69
            r1 = 4
            if (r5 == r1) goto L7b
            goto L69
        L67:
            gr1 r0 = defpackage.gr1.f0
        L69:
            lw2 r5 = new lw2
            w60 r1 = new w60
            android.graphics.Rect r4 = r4.getRect()
            r4.getClass()
            r1.<init>(r4)
            r5.<init>(r1, r3, r0)
            return r5
        L7b:
            r3 = 0
            return r3
    }
}
