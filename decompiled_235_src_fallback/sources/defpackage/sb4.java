package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sb4  reason: default package */
/* loaded from: classes.dex */
public final class sb4 implements defpackage.hu3, defpackage.bp7, defpackage.mw2, defpackage.g56 {
    public final defpackage.rh A;
    public defpackage.ic4 B;
    public final android.os.Bundle L;
    public defpackage.tt3 R;
    public final defpackage.ac4 X;
    public final java.lang.String Y;
    public final android.os.Bundle Z;
    public final defpackage.uk1 d0;

    static {
            return
    }

    public sb4(defpackage.rh r1, defpackage.ic4 r2, android.os.Bundle r3, defpackage.tt3 r4, defpackage.ac4 r5, java.lang.String r6, android.os.Bundle r7) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            uk1 r1 = new uk1
            r1.<init>(r0)
            r0.d0 = r1
            er2 r1 = new er2
            r2 = 9
            r1.<init>(r0, r2)
            ex6 r0 = new ex6
            r0.<init>(r1)
            return
    }

    public final void a(defpackage.tt3 r1) {
            r0 = this;
            r1.getClass()
            uk1 r0 = r0.d0
            r0.getClass()
            r0.l = r1
            r0.f()
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L86
            boolean r1 = r5 instanceof defpackage.sb4
            if (r1 != 0) goto L9
            goto L86
        L9:
            sb4 r5 = (defpackage.sb4) r5
            android.os.Bundle r1 = r5.L
            java.lang.String r2 = r5.Y
            java.lang.String r3 = r4.Y
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L86
            ic4 r2 = r4.B
            ic4 r3 = r5.B
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L86
            uk1 r2 = r4.d0
            java.lang.Object r2 = r2.k
            ku3 r2 = (defpackage.ku3) r2
            uk1 r3 = r5.d0
            java.lang.Object r3 = r3.k
            ku3 r3 = (defpackage.ku3) r3
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L86
            d56 r2 = r4.getSavedStateRegistry()
            d56 r5 = r5.getSavedStateRegistry()
            boolean r5 = defpackage.nb3.k(r2, r5)
            if (r5 == 0) goto L86
            android.os.Bundle r4 = r4.L
            boolean r5 = defpackage.nb3.k(r4, r1)
            if (r5 != 0) goto L84
            if (r4 == 0) goto L86
            java.util.Set r5 = r4.keySet()
            if (r5 == 0) goto L86
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L61
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L61
            goto L84
        L61:
            java.util.Iterator r5 = r5.iterator()
        L65:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r2)
            if (r1 == 0) goto L7c
            java.lang.Object r2 = r1.get(r2)
            goto L7d
        L7c:
            r2 = 0
        L7d:
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 != 0) goto L65
            goto L86
        L84:
            r4 = 1
            return r4
        L86:
            return r0
    }

    @Override // defpackage.mw2
    public final defpackage.j71 getDefaultViewModelCreationExtras() {
            r5 = this;
            uk1 r0 = r5.d0
            r0.getClass()
            m94 r1 = new m94
            r2 = 0
            r1.<init>(r2)
            java.lang.Object r2 = r0.c
            sb4 r2 = (defpackage.sb4) r2
            java.util.LinkedHashMap r3 = r1.a
            q61 r4 = defpackage.y46.a
            r3.put(r4, r2)
            jd1 r4 = defpackage.y46.b
            r3.put(r4, r2)
            android.os.Bundle r0 = r0.c()
            if (r0 == 0) goto L26
            w31 r2 = defpackage.y46.c
            r3.put(r2, r0)
        L26:
            r0 = 0
            rh r5 = r5.A
            if (r5 == 0) goto L3c
            android.content.Context r5 = r5.a
            if (r5 == 0) goto L34
            android.content.Context r5 = r5.getApplicationContext()
            goto L35
        L34:
            r5 = r0
        L35:
            boolean r2 = r5 instanceof android.app.Application
            if (r2 == 0) goto L3c
            android.app.Application r5 = (android.app.Application) r5
            goto L3d
        L3c:
            r5 = r0
        L3d:
            if (r5 == 0) goto L40
            r0 = r5
        L40:
            if (r0 == 0) goto L47
            vo7 r5 = defpackage.wo7.d
            r3.put(r5, r0)
        L47:
            return r1
    }

    @Override // defpackage.mw2
    public final defpackage.yo7 getDefaultViewModelProviderFactory() {
            r0 = this;
            uk1 r0 = r0.d0
            java.lang.Object r0 = r0.m
            h56 r0 = (defpackage.h56) r0
            return r0
    }

    @Override // defpackage.hu3
    public final defpackage.ut3 getLifecycle() {
            r0 = this;
            uk1 r0 = r0.d0
            java.lang.Object r0 = r0.k
            ku3 r0 = (defpackage.ku3) r0
            return r0
    }

    @Override // defpackage.g56
    public final defpackage.d56 getSavedStateRegistry() {
            r0 = this;
            uk1 r0 = r0.d0
            java.lang.Object r0 = r0.j
            e56 r0 = (defpackage.e56) r0
            d56 r0 = r0.b
            return r0
    }

    @Override // defpackage.bp7
    public final defpackage.ap7 getViewModelStore() {
            r3 = this;
            uk1 r3 = r3.d0
            boolean r0 = r3.b
            r1 = 0
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r3.k
            ku3 r0 = (defpackage.ku3) r0
            tt3 r0 = r0.d
            tt3 r2 = defpackage.tt3.DESTROYED
            if (r0 == r2) goto L37
            java.lang.Object r0 = r3.g
            ac4 r0 = (defpackage.ac4) r0
            if (r0 == 0) goto L31
            java.lang.Object r3 = r3.h
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.util.LinkedHashMap r0 = r0.b
            java.lang.Object r1 = r0.get(r3)
            ap7 r1 = (defpackage.ap7) r1
            if (r1 != 0) goto L30
            ap7 r1 = new ap7
            r1.<init>()
            r0.put(r3, r1)
        L30:
            return r1
        L31:
            java.lang.String r3 = "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph."
            defpackage.i.m(r3)
            return r1
        L37:
            java.lang.String r3 = "You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed."
            defpackage.i.m(r3)
            return r1
        L3d:
            java.lang.String r3 = "You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."
            defpackage.i.m(r3)
            return r1
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.Y
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ic4 r1 = r4.B
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            android.os.Bundle r0 = r4.L
            if (r0 == 0) goto L3b
            java.util.Set r2 = r0.keySet()
            if (r2 == 0) goto L3b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            int r1 = r1 * 31
            java.lang.Object r3 = r0.get(r3)
            if (r3 == 0) goto L38
            int r3 = r3.hashCode()
            goto L39
        L38:
            r3 = 0
        L39:
            int r1 = r1 + r3
            goto L1f
        L3b:
            int r1 = r1 * 31
            uk1 r0 = r4.d0
            java.lang.Object r0 = r0.k
            ku3 r0 = (defpackage.ku3) r0
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            d56 r4 = r4.getSavedStateRegistry()
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r0 = this;
            uk1 r0 = r0.d0
            java.lang.String r0 = r0.toString()
            return r0
    }
}
