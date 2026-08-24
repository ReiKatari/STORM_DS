package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class v extends defpackage.qo7 {
    public static final defpackage.nl2 h = null;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public final java.util.HashMap d;
    public final boolean e;
    public boolean f;
    public boolean g;

    static {
            nl2 r0 = new nl2
            r1 = 0
            r0.<init>(r1)
            androidx.fragment.app.v.h = r0
            return
    }

    public v(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            r0 = 0
            r1.f = r0
            r1.g = r0
            r1.e = r2
            return
    }

    @Override // defpackage.qo7
    public final void d() {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onCleared called for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1a:
            r0 = 1
            r2.f = r0
            return
    }

    public final void e(androidx.fragment.app.o r4) {
            r3 = this;
            boolean r0 = r3.g
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r3 = androidx.fragment.app.u.K(r2)
            if (r3 == 0) goto L3a
            java.lang.String r3 = "Ignoring addRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r3)
            return
        L13:
            java.lang.String r0 = r4.mWho
            java.util.HashMap r3 = r3.b
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L1e
            goto L3a
        L1e:
            java.lang.String r0 = r4.mWho
            r3.put(r0, r4)
            boolean r3 = androidx.fragment.app.u.K(r2)
            if (r3 == 0) goto L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Updating retained Fragments: Added "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r1, r3)
        L3a:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.Class<androidx.fragment.app.v> r2 = androidx.fragment.app.v.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            androidx.fragment.app.v r5 = (androidx.fragment.app.v) r5
            java.util.HashMap r2 = r4.b
            java.util.HashMap r3 = r5.b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap r2 = r4.c
            java.util.HashMap r3 = r5.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap r4 = r4.d
            java.util.HashMap r5 = r5.d
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L31
            return r0
        L31:
            return r1
    }

    public final void f(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clearing non-config state for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1a:
            java.lang.String r3 = r3.mWho
            r2.h(r3, r4)
            return
    }

    public final void g(java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clearing non-config state for saved state of Fragment "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1a:
            r2.h(r3, r4)
            return
    }

    public final void h(java.lang.String r7, boolean r8) {
            r6 = this;
            java.util.HashMap r0 = r6.c
            java.lang.Object r1 = r0.get(r7)
            androidx.fragment.app.v r1 = (androidx.fragment.app.v) r1
            if (r1 == 0) goto L34
            if (r8 == 0) goto L2e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.HashMap r2 = r1.c
            java.util.Set r2 = r2.keySet()
            r8.addAll(r2)
            int r2 = r8.size()
            r3 = 0
        L1f:
            if (r3 >= r2) goto L2e
            java.lang.Object r4 = r8.get(r3)
            int r3 = r3 + 1
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            r1.g(r4, r5)
            goto L1f
        L2e:
            r1.d()
            r0.remove(r7)
        L34:
            java.util.HashMap r6 = r6.d
            java.lang.Object r8 = r6.get(r7)
            ap7 r8 = (defpackage.ap7) r8
            if (r8 == 0) goto L44
            r8.a()
            r6.remove(r7)
        L44:
            return
    }

    public final int hashCode() {
            r2 = this;
            java.util.HashMap r0 = r2.b
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.HashMap r1 = r2.c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.HashMap r2 = r2.d
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final void i(androidx.fragment.app.o r4) {
            r3 = this;
            boolean r0 = r3.g
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r3 = androidx.fragment.app.u.K(r2)
            if (r3 == 0) goto L34
            java.lang.String r3 = "Ignoring removeRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r3)
            return
        L13:
            java.util.HashMap r3 = r3.b
            java.lang.String r0 = r4.mWho
            java.lang.Object r3 = r3.remove(r0)
            if (r3 == 0) goto L34
            boolean r3 = androidx.fragment.app.u.K(r2)
            if (r3 == 0) goto L34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Updating retained Fragments: Removed "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r1, r3)
        L34:
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentManagerViewModel{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} Fragments ("
            r0.append(r1)
            java.util.HashMap r1 = r4.b
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = ", "
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            r0.append(r3)
            goto L21
        L3a:
            java.lang.String r1 = ") Child Non Config ("
            r0.append(r1)
            java.util.HashMap r1 = r4.c
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            r0.append(r3)
            goto L49
        L62:
            java.lang.String r1 = ") ViewModelStores ("
            r0.append(r1)
            java.util.HashMap r4 = r4.d
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L71
            r0.append(r3)
            goto L71
        L8a:
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
