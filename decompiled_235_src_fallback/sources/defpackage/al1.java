package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al1  reason: default package */
/* loaded from: classes.dex */
public final class al1 {
    public static final defpackage.q61 g = null;
    public static final android.util.Size h = null;
    public static final android.util.Size i = null;
    public static final android.util.Size j = null;
    public static volatile defpackage.al1 k;
    public final defpackage.w24 a;
    public final defpackage.d51 b;
    public final java.lang.Object c;
    public volatile android.view.Display[] d;
    public final android.hardware.display.DisplayManager e;
    public volatile android.util.Size f;

    static {
            q61 r0 = new q61
            r0.<init>()
            defpackage.al1.g = r0
            android.util.Size r0 = new android.util.Size
            r1 = 1920(0x780, float:2.69E-42)
            r2 = 1080(0x438, float:1.513E-42)
            r0.<init>(r1, r2)
            defpackage.al1.h = r0
            android.util.Size r0 = new android.util.Size
            r1 = 320(0x140, float:4.48E-43)
            r2 = 240(0xf0, float:3.36E-43)
            r0.<init>(r1, r2)
            defpackage.al1.i = r0
            android.util.Size r0 = new android.util.Size
            r1 = 640(0x280, float:8.97E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r1, r2)
            defpackage.al1.j = r0
            return
    }

    public al1(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            w24 r0 = new w24
            r1 = 0
            r0.<init>(r1)
            r3.a = r0
            d51 r0 = new d51
            r2 = 10
            r0.<init>(r2)
            r3.b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.c = r0
            zk1 r0 = new zk1
            r0.<init>(r3, r1)
            java.lang.String r1 = "display"
            java.lang.Object r4 = r4.getSystemService(r1)
            r4.getClass()
            android.hardware.display.DisplayManager r4 = (android.hardware.display.DisplayManager) r4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r4.registerDisplayListener(r0, r1)
            r3.e = r4
            return
    }

    public final android.util.Size a() {
            r4 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1 = 0
            android.view.Display r1 = r4.b(r1)
            r1.getRealSize(r0)
            android.util.Size r1 = new android.util.Size
            int r2 = r0.x
            int r0 = r0.y
            r1.<init>(r2, r0)
            int r0 = defpackage.mj6.a(r1)
            android.util.Size r2 = defpackage.al1.i
            int r2 = defpackage.mj6.a(r2)
            if (r0 >= r2) goto L4a
            d51 r0 = r4.b
            java.lang.Object r0 = r0.B
            androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk r0 = (androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk) r0
            if (r0 == 0) goto L44
            java.util.Map r0 = androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.a
            java.lang.String r1 = android.os.Build.MODEL
            r1.getClass()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r2)
            r1.getClass()
            java.lang.Object r0 = r0.get(r1)
            r0.getClass()
            android.util.Size r0 = (android.util.Size) r0
            goto L45
        L44:
            r0 = 0
        L45:
            if (r0 != 0) goto L49
            android.util.Size r0 = defpackage.al1.j
        L49:
            r1 = r0
        L4a:
            int r0 = r1.getHeight()
            int r2 = r1.getWidth()
            if (r0 <= r2) goto L62
            android.util.Size r0 = new android.util.Size
            int r2 = r1.getHeight()
            int r1 = r1.getWidth()
            r0.<init>(r2, r1)
            r1 = r0
        L62:
            android.util.Size r0 = defpackage.al1.h
            int r2 = defpackage.mj6.a(r0)
            int r3 = defpackage.mj6.a(r1)
            if (r2 >= r3) goto L6f
            r1 = r0
        L6f:
            w24 r4 = r4.a
            r4.getClass()
            androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk r4 = r4.a
            if (r4 != 0) goto L79
            goto L97
        L79:
            hv6 r4 = defpackage.hv6.PRIV
            android.util.Size r4 = androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.b(r4)
            if (r4 != 0) goto L82
            goto L97
        L82:
            int r0 = r4.getWidth()
            int r2 = r4.getHeight()
            int r2 = r2 * r0
            int r0 = r1.getWidth()
            int r3 = r1.getHeight()
            int r3 = r3 * r0
            if (r2 <= r3) goto L97
            return r4
        L97:
            return r1
    }

    public final android.view.Display b(boolean r12) {
            r11 = this;
            java.lang.Object r0 = r11.c
            monitor-enter(r0)
            android.view.Display[] r1 = r11.d     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L9
        L7:
            monitor-exit(r0)
            goto L15
        L9:
            android.hardware.display.DisplayManager r1 = r11.e     // Catch: java.lang.Throwable -> L77
            android.view.Display[] r1 = r1.getDisplays()     // Catch: java.lang.Throwable -> L77
            r11.d = r1     // Catch: java.lang.Throwable -> L77
            r1.getClass()     // Catch: java.lang.Throwable -> L77
            goto L7
        L15:
            int r11 = r1.length
            r0 = 0
            r2 = 1
            if (r11 != r2) goto L1d
            r11 = r1[r0]
            return r11
        L1d:
            int r11 = r1.length
            r3 = -1
            r4 = 0
            r5 = r4
            r6 = r5
            r4 = r3
        L23:
            if (r0 >= r11) goto L4a
            r7 = r1[r0]
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>()
            r7.getRealSize(r8)
            int r9 = r8.x
            int r10 = r8.y
            int r9 = r9 * r10
            if (r9 <= r3) goto L38
            r5 = r7
            r3 = r9
        L38:
            int r9 = r7.getState()
            if (r9 == r2) goto L47
            int r9 = r8.x
            int r8 = r8.y
            int r9 = r9 * r8
            if (r9 <= r4) goto L47
            r6 = r7
            r4 = r9
        L47:
            int r0 = r0 + 1
            goto L23
        L4a:
            if (r12 == 0) goto L50
            if (r6 != 0) goto L4f
            goto L50
        L4f:
            r5 = r6
        L50:
            if (r5 == 0) goto L53
            return r5
        L53:
            java.lang.String r11 = "No displays found from "
            java.lang.String r12 = java.util.Arrays.toString(r1)
            r12.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r11)
            r0.append(r12)
            r11 = 33
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L77:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
    }

    public final android.util.Size c() {
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            android.util.Size r1 = r2.f     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            android.util.Size r2 = r2.f     // Catch: java.lang.Throwable -> Le
            r2.getClass()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r2
        Le:
            r2 = move-exception
            goto L1d
        L10:
            android.util.Size r1 = r2.a()     // Catch: java.lang.Throwable -> Le
            r2.f = r1     // Catch: java.lang.Throwable -> Le
            android.util.Size r2 = r2.f     // Catch: java.lang.Throwable -> Le
            r2.getClass()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r2
        L1d:
            monitor-exit(r0)
            throw r2
    }
}
