package j0;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f7255a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public final Object f7256b;

    /* renamed from: c  reason: collision with root package name */
    public int f7257c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.a f7258d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f7259e;

    /* renamed from: f  reason: collision with root package name */
    public int f7260f;

    public l0(b0.a aVar) {
        Object obj = new Object();
        this.f7256b = obj;
        this.f7259e = new HashMap();
        this.f7257c = 1;
        synchronized (obj) {
            this.f7258d = aVar;
            this.f7260f = this.f7257c;
        }
    }

    public static void c(w.x xVar, c0 c0Var) {
        if (aj.g.N()) {
            aj.g.f0(c0Var.ordinal(), "CX:State[" + xVar + "]");
        }
    }

    public final k0 a(String str) {
        HashMap hashMap = this.f7259e;
        for (d0.l lVar : hashMap.keySet()) {
            if (str.equals(lVar.b().d())) {
                return (k0) hashMap.get(lVar);
            }
        }
        return null;
    }

    public final void b() {
        String str;
        boolean L = aj.g.L("CameraStateRegistry");
        StringBuilder sb2 = this.f7255a;
        if (L) {
            sb2.setLength(0);
            sb2.append("Recalculating open cameras:\n");
            sb2.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb2.append("-------------------------------------------------------------------\n");
        }
        int i2 = 0;
        for (Map.Entry entry : this.f7259e.entrySet()) {
            if (aj.g.L("CameraStateRegistry")) {
                if (((k0) entry.getValue()).f7242a != null) {
                    str = ((k0) entry.getValue()).f7242a.toString();
                } else {
                    str = "UNKNOWN";
                }
                sb2.append(String.format(Locale.US, "%-45s%-22s\n", ((d0.l) entry.getKey()).toString(), str));
            }
            c0 c0Var = ((k0) entry.getValue()).f7242a;
            if (c0Var != null && c0Var.holdsCameraSlot()) {
                i2++;
            }
        }
        if (aj.g.L("CameraStateRegistry")) {
            sb2.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb2.append("Open count: " + i2 + " (Max allowed: " + this.f7257c + ")");
            aj.g.o("CameraStateRegistry", sb2.toString());
        }
        this.f7260f = Math.max(this.f7257c - i2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:14:0x0039, B:15:0x0067, B:17:0x006b, B:19:0x006f, B:27:0x0084, B:29:0x008c, B:33:0x0097, B:35:0x00ab, B:36:0x00ae, B:26:0x007d), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:14:0x0039, B:15:0x0067, B:17:0x006b, B:19:0x006f, B:27:0x0084, B:29:0x008c, B:33:0x0097, B:35:0x00ab, B:36:0x00ae, B:26:0x007d), top: B:40:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(w.x r12) {
        /*
            r11 = this;
            java.lang.String r0 = "tryOpenCamera("
            java.lang.String r1 = " --> "
            java.lang.Object r2 = r11.f7256b
            monitor-enter(r2)
            java.util.HashMap r3 = r11.f7259e     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> L35
            j0.k0 r3 = (j0.k0) r3     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Camera must first be registered with registerCamera()"
            p7.m.l(r3, r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "CameraStateRegistry"
            boolean r4 = aj.g.L(r4)     // Catch: java.lang.Throwable -> L35
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L67
            java.lang.StringBuilder r4 = r11.f7255a     // Catch: java.lang.Throwable -> L35
            r4.setLength(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r4 = r11.f7255a     // Catch: java.lang.Throwable -> L35
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> L35
            int r7 = r11.f7260f     // Catch: java.lang.Throwable -> L35
            j0.c0 r8 = r3.f7242a     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L38
            boolean r8 = r8.holdsCameraSlot()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L38
            r8 = r5
            goto L39
        L35:
            r12 = move-exception
            goto Lb0
        L38:
            r8 = r6
        L39:
            j0.c0 r9 = r3.f7242a     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r10.append(r12)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = ") [Available Cameras: "
            r10.append(r0)     // Catch: java.lang.Throwable -> L35
            r10.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = ", Already Open: "
            r10.append(r0)     // Catch: java.lang.Throwable -> L35
            r10.append(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = " (Previous state: "
            r10.append(r0)     // Catch: java.lang.Throwable -> L35
            r10.append(r9)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = ")]"
            r10.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L35
            r4.append(r0)     // Catch: java.lang.Throwable -> L35
        L67:
            int r0 = r11.f7260f     // Catch: java.lang.Throwable -> L35
            if (r0 > 0) goto L7d
            j0.c0 r0 = r3.f7242a     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L77
            boolean r0 = r0.holdsCameraSlot()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L77
            r0 = r5
            goto L78
        L77:
            r0 = r6
        L78:
            if (r0 == 0) goto L7b
            goto L7d
        L7b:
            r5 = r6
            goto L84
        L7d:
            j0.c0 r0 = j0.c0.OPENING     // Catch: java.lang.Throwable -> L35
            r3.f7242a = r0     // Catch: java.lang.Throwable -> L35
            c(r12, r0)     // Catch: java.lang.Throwable -> L35
        L84:
            java.lang.String r12 = "CameraStateRegistry"
            boolean r12 = aj.g.L(r12)     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto La9
            java.lang.StringBuilder r12 = r11.f7255a     // Catch: java.lang.Throwable -> L35
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L95
            java.lang.String r0 = "SUCCESS"
            goto L97
        L95:
            java.lang.String r0 = "FAIL"
        L97:
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L35
            r12.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r12 = "CameraStateRegistry"
            java.lang.StringBuilder r0 = r11.f7255a     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            aj.g.o(r12, r0)     // Catch: java.lang.Throwable -> L35
        La9:
            if (r5 == 0) goto Lae
            r11.b()     // Catch: java.lang.Throwable -> L35
        Lae:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            return r5
        Lb0:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.l0.d(w.x):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7256b
            monitor-enter(r0)
            b0.a r1 = r5.f7258d     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.b()     // Catch: java.lang.Throwable -> Lf
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r6 = move-exception
            goto L57
        L11:
            j0.k0 r6 = r5.a(r6)     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r6 == 0) goto L1b
            j0.c0 r6 = r6.f7242a     // Catch: java.lang.Throwable -> Lf
            goto L1c
        L1b:
            r6 = r1
        L1c:
            if (r7 == 0) goto L23
            j0.k0 r7 = r5.a(r7)     // Catch: java.lang.Throwable -> Lf
            goto L24
        L23:
            r7 = r1
        L24:
            if (r7 == 0) goto L28
            j0.c0 r1 = r7.f7242a     // Catch: java.lang.Throwable -> Lf
        L28:
            j0.c0 r7 = j0.c0.OPEN     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r7.equals(r6)     // Catch: java.lang.Throwable -> Lf
            r4 = 0
            if (r2 != 0) goto L3c
            j0.c0 r2 = j0.c0.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L3a
            goto L3c
        L3a:
            r6 = r4
            goto L3d
        L3c:
            r6 = r3
        L3d:
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lf
            if (r7 != 0) goto L4e
            j0.c0 r7 = j0.c0.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L4c
            goto L4e
        L4c:
            r7 = r4
            goto L4f
        L4e:
            r7 = r3
        L4f:
            if (r6 == 0) goto L54
            if (r7 == 0) goto L54
            goto L55
        L54:
            r3 = r4
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.l0.e(java.lang.String, java.lang.String):boolean");
    }
}
