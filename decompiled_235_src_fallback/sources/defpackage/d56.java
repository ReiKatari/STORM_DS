package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d56  reason: default package */
/* loaded from: classes.dex */
public final class d56 {
    public final defpackage.f56 a;
    public defpackage.hq b;

    public d56(defpackage.f56 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final android.os.Bundle a(java.lang.String r4) {
            r3 = this;
            f56 r3 = r3.a
            boolean r0 = r3.g
            r1 = 0
            if (r0 == 0) goto L2a
            android.os.Bundle r0 = r3.f
            if (r0 != 0) goto Lc
            return r1
        Lc:
            boolean r2 = r0.containsKey(r4)
            if (r2 == 0) goto L1d
            android.os.Bundle r2 = r0.getBundle(r4)
            if (r2 == 0) goto L19
            goto L1e
        L19:
            defpackage.xk2.B(r4)
            throw r1
        L1d:
            r2 = r1
        L1e:
            r0.remove(r4)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L29
            r3.f = r1
        L29:
            return r2
        L2a:
            java.lang.String r3 = "You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state"
            defpackage.i.m(r3)
            return r1
    }

    public final defpackage.c56 b(java.lang.String r5) {
            r4 = this;
            f56 r4 = r4.a
            jd1 r0 = r4.c
            monitor-enter(r0)
            java.util.LinkedHashMap r4 = r4.d     // Catch: java.lang.Throwable -> L32
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L32
        Lf:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L32
            r2 = 0
            if (r1 == 0) goto L34
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L32
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L32
            c56 r1 = (defpackage.c56) r1     // Catch: java.lang.Throwable -> L32
            boolean r3 = defpackage.nb3.k(r3, r5)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L2f
            r2 = r1
        L2f:
            if (r2 == 0) goto Lf
            goto L34
        L32:
            r4 = move-exception
            goto L36
        L34:
            monitor-exit(r0)
            return r2
        L36:
            monitor-exit(r0)
            throw r4
    }

    public final void c(java.lang.String r3, defpackage.c56 r4) {
            r2 = this;
            r4.getClass()
            f56 r2 = r2.a
            jd1 r0 = r2.c
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r2.d     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            java.util.LinkedHashMap r2 = r2.d     // Catch: java.lang.Throwable -> L17
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return
        L17:
            r2 = move-exception
            goto L21
        L19:
            java.lang.String r2 = "SavedStateProvider with the given key is already registered"
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L17
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L21:
            monitor-exit(r0)
            throw r2
    }

    public final void d() {
            r4 = this;
            java.lang.Class<it3> r0 = defpackage.it3.class
            f56 r1 = r4.a
            boolean r1 = r1.h
            if (r1 == 0) goto L45
            hq r1 = r4.b
            if (r1 != 0) goto L11
            hq r1 = new hq
            r1.<init>(r4)
        L11:
            r4.b = r1
            r1 = 0
            r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L27
            hq r4 = r4.b
            if (r4 == 0) goto L26
            java.lang.String r0 = r0.getName()
            java.lang.Object r4 = r4.b
            java.util.LinkedHashSet r4 = (java.util.LinkedHashSet) r4
            r4.add(r0)
        L26:
            return
        L27:
            r4 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Class "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " must have default constructor in order to be automatically recreated"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r4)
            throw r1
        L45:
            java.lang.String r4 = "Can not perform this action after onSaveInstanceState"
            defpackage.i.m(r4)
            return
    }
}
