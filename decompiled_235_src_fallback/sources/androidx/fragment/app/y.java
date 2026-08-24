package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class y {
    public final java.util.ArrayList a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public androidx.fragment.app.v d;

    public y() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            return
    }

    public final void a(androidx.fragment.app.o r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.a
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L18
            java.util.ArrayList r0 = r1.a
            monitor-enter(r0)
            java.util.ArrayList r1 = r1.a     // Catch: java.lang.Throwable -> L15
            r1.add(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r1 = 1
            r2.mAdded = r1
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
        L18:
            java.lang.String r1 = "Fragment already added: "
            defpackage.e41.y(r2, r1)
            return
    }

    public final androidx.fragment.app.o b(java.lang.String r1) {
            r0 = this;
            java.util.HashMap r0 = r0.b
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.x r0 = (androidx.fragment.app.x) r0
            if (r0 == 0) goto Ld
            androidx.fragment.app.o r0 = r0.c
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final androidx.fragment.app.o c(java.lang.String r2) {
            r1 = this;
            java.util.HashMap r1 = r1.b
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            androidx.fragment.app.x r0 = (androidx.fragment.app.x) r0
            if (r0 == 0) goto La
            androidx.fragment.app.o r0 = r0.c
            androidx.fragment.app.o r0 = r0.findFragmentByWho(r2)
            if (r0 == 0) goto La
            return r0
        L21:
            r1 = 0
            return r1
    }

    public final java.util.ArrayList d() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r2 = r2.b
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            androidx.fragment.app.x r1 = (androidx.fragment.app.x) r1
            if (r1 == 0) goto Lf
            r0.add(r1)
            goto Lf
        L21:
            return r0
    }

    public final java.util.ArrayList e() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r2 = r2.b
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r2.next()
            androidx.fragment.app.x r1 = (androidx.fragment.app.x) r1
            if (r1 == 0) goto L23
            androidx.fragment.app.o r1 = r1.c
            r0.add(r1)
            goto Lf
        L23:
            r1 = 0
            r0.add(r1)
            goto Lf
        L28:
            return r0
    }

    public final java.util.List f() {
            r2 = this;
            java.util.ArrayList r0 = r2.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        Lb:
            java.util.ArrayList r0 = r2.a
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            java.util.ArrayList r2 = r2.a     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public final void g(androidx.fragment.app.x r4) {
            r3 = this;
            androidx.fragment.app.o r0 = r4.c
            java.lang.String r1 = r0.mWho
            java.util.HashMap r2 = r3.b
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto Ld
            return
        Ld:
            java.lang.String r1 = r0.mWho
            r2.put(r1, r4)
            boolean r4 = r0.mRetainInstanceChangedWhileDetached
            if (r4 == 0) goto L26
            boolean r4 = r0.mRetainInstance
            androidx.fragment.app.v r3 = r3.d
            if (r4 == 0) goto L20
            r3.e(r0)
            goto L23
        L20:
            r3.i(r0)
        L23:
            r3 = 0
            r0.mRetainInstanceChangedWhileDetached = r3
        L26:
            r3 = 2
            boolean r3 = androidx.fragment.app.u.K(r3)
            if (r3 == 0) goto L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Added fragment to active set "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L40:
            return
    }

    public final void h(androidx.fragment.app.x r3) {
            r2 = this;
            androidx.fragment.app.o r0 = r3.c
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto Lb
            androidx.fragment.app.v r1 = r2.d
            r1.i(r0)
        Lb:
            java.lang.String r1 = r0.mWho
            java.util.HashMap r2 = r2.b
            java.lang.Object r1 = r2.get(r1)
            if (r1 == r3) goto L16
            goto L3c
        L16:
            java.lang.String r3 = r0.mWho
            r1 = 0
            java.lang.Object r2 = r2.put(r3, r1)
            androidx.fragment.app.x r2 = (androidx.fragment.app.x) r2
            if (r2 != 0) goto L22
            goto L3c
        L22:
            r2 = 2
            boolean r2 = androidx.fragment.app.u.K(r2)
            if (r2 == 0) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Removed fragment from active set "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L3c:
            return
    }

    public final android.os.Bundle i(android.os.Bundle r1, java.lang.String r2) {
            r0 = this;
            java.util.HashMap r0 = r0.c
            if (r1 == 0) goto Lb
            java.lang.Object r0 = r0.put(r2, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
        Lb:
            java.lang.Object r0 = r0.remove(r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
    }
}
