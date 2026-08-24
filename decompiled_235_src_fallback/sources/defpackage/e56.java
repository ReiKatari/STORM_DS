package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e56  reason: default package */
/* loaded from: classes.dex */
public final class e56 {
    public final defpackage.f56 a;
    public final defpackage.d56 b;

    public e56(defpackage.f56 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            d56 r0 = new d56
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public final void a() {
            r0 = this;
            f56 r0 = r0.a
            r0.a()
            return
    }

    public final void b(android.os.Bundle r4) {
            r3 = this;
            f56 r3 = r3.a
            g56 r0 = r3.a
            boolean r1 = r3.e
            if (r1 != 0) goto Lb
            r3.a()
        Lb:
            ut3 r1 = r0.getLifecycle()
            tt3 r1 = r1.b()
            tt3 r2 = defpackage.tt3.STARTED
            boolean r1 = r1.isAtLeast(r2)
            if (r1 != 0) goto L42
            boolean r0 = r3.g
            if (r0 != 0) goto L3c
            r0 = 0
            if (r4 == 0) goto L36
            java.lang.String r1 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L36
            android.os.Bundle r4 = r4.getBundle(r1)
            if (r4 == 0) goto L32
            r0 = r4
            goto L36
        L32:
            defpackage.xk2.B(r1)
            throw r0
        L36:
            r3.f = r0
            r4 = 1
            r3.g = r4
            return
        L3c:
            java.lang.String r3 = "SavedStateRegistry was already restored."
            defpackage.i.m(r3)
            return
        L42:
            ut3 r3 = r0.getLifecycle()
            tt3 r3 = r3.b()
            java.lang.String r4 = "performRestore cannot be called when owner is "
            defpackage.u34.i(r3, r4)
            return
    }

    public final void c(android.os.Bundle r5) {
            r4 = this;
            f56 r4 = r4.a
            r0 = 0
            vr4[] r1 = new defpackage.vr4[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            vr4[] r0 = (defpackage.vr4[]) r0
            android.os.Bundle r0 = defpackage.jw2.l(r0)
            android.os.Bundle r1 = r4.f
            if (r1 == 0) goto L16
            r0.putAll(r1)
        L16:
            jd1 r1 = r4.c
            monitor-enter(r1)
            java.util.LinkedHashMap r4 = r4.d     // Catch: java.lang.Throwable -> L46
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L46
        L23:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L48
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L46
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L46
            c56 r2 = (defpackage.c56) r2     // Catch: java.lang.Throwable -> L46
            android.os.Bundle r2 = r2.a()     // Catch: java.lang.Throwable -> L46
            r3.getClass()     // Catch: java.lang.Throwable -> L46
            r0.putBundle(r3, r2)     // Catch: java.lang.Throwable -> L46
            goto L23
        L46:
            r4 = move-exception
            goto L55
        L48:
            monitor-exit(r1)
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L54
            java.lang.String r4 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r4, r0)
        L54:
            return
        L55:
            monitor-exit(r1)
            throw r4
    }
}
