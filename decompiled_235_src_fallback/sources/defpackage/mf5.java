package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf5  reason: default package */
/* loaded from: classes.dex */
public final class mf5 implements defpackage.fu3 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ mf5(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r9, defpackage.st3 r10) {
            r8 = this;
            int r0 = r8.A
            r1 = 0
            java.lang.Object r2 = r8.B
            r3 = 0
            switch(r0) {
                case 0: goto L6b;
                case 1: goto L48;
                case 2: goto L34;
                case 3: goto L2b;
                case 4: goto L14;
                default: goto L9;
            }
        L9:
            st3 r8 = defpackage.st3.ON_DESTROY
            if (r10 != r8) goto L13
            bo7 r2 = (defpackage.bo7) r2
            r2.a = r3
            r2.b = r3
        L13:
            return
        L14:
            st3 r0 = defpackage.st3.ON_CREATE
            if (r10 != r0) goto L25
            ut3 r9 = r9.getLifecycle()
            r9.c(r8)
            z46 r2 = (defpackage.z46) r2
            r2.b()
            goto L2a
        L25:
            java.lang.String r8 = "Next event must be ON_CREATE, it was "
            defpackage.u34.i(r10, r8)
        L2a:
            return
        L2b:
            st3 r8 = defpackage.st3.ON_DESTROY
            if (r10 != r8) goto L33
            iu3 r2 = (defpackage.iu3) r2
            r2.a = r3
        L33:
            return
        L34:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            hr2[] r2 = (defpackage.hr2[]) r2
            int r8 = r2.length
            if (r8 > 0) goto L45
            int r8 = r2.length
            if (r8 > 0) goto L42
            return
        L42:
            r8 = r2[r1]
            throw r3
        L45:
            r8 = r2[r1]
            throw r3
        L48:
            mv0 r2 = (defpackage.mv0) r2
            ap7 r9 = r2.X
            if (r9 != 0) goto L65
            java.lang.Object r9 = r2.getLastNonConfigurationInstance()
            iv0 r9 = (defpackage.iv0) r9
            if (r9 == 0) goto L5a
            ap7 r9 = r9.a
            r2.X = r9
        L5a:
            ap7 r9 = r2.X
            if (r9 != 0) goto L65
            ap7 r9 = new ap7
            r9.<init>()
            r2.X = r9
        L65:
            ku3 r9 = r2.A
            r9.c(r8)
            return
        L6b:
            g56 r2 = (defpackage.g56) r2
            st3 r0 = defpackage.st3.ON_CREATE
            if (r10 != r0) goto L15a
            ut3 r9 = r9.getLifecycle()
            r9.c(r8)
            d56 r8 = r2.getSavedStateRegistry()
            java.lang.String r9 = "androidx.savedstate.Restarter"
            android.os.Bundle r8 = r8.a(r9)
            if (r8 != 0) goto L86
            goto L159
        L86:
            java.lang.String r9 = "classes_to_restore"
            java.util.ArrayList r8 = r8.getStringArrayList(r9)
            if (r8 == 0) goto L154
            int r9 = r8.size()
            r10 = r1
        L93:
            if (r10 >= r9) goto L159
            java.lang.Object r0 = r8.get(r10)
            int r10 = r10 + 1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "Class "
            java.lang.Class<mf5> r5 = defpackage.mf5.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L149
            java.lang.Class r5 = java.lang.Class.forName(r0, r1, r5)     // Catch: java.lang.ClassNotFoundException -> L149
            java.lang.Class<b56> r6 = defpackage.b56.class
            java.lang.Class r5 = r5.asSubclass(r6)     // Catch: java.lang.ClassNotFoundException -> L149
            r5.getClass()     // Catch: java.lang.ClassNotFoundException -> L149
            java.lang.reflect.Constructor r4 = r5.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L12d
            r5 = 1
            r4.setAccessible(r5)
            java.lang.Object r4 = r4.newInstance(r3)     // Catch: java.lang.Exception -> L122
            r4.getClass()     // Catch: java.lang.Exception -> L122
            b56 r4 = (defpackage.b56) r4     // Catch: java.lang.Exception -> L122
            boolean r0 = r2 instanceof defpackage.bp7
            if (r0 == 0) goto L11c
            r0 = r2
            bp7 r0 = (defpackage.bp7) r0
            ap7 r0 = r0.getViewModelStore()
            d56 r4 = r2.getSavedStateRegistry()
            r0.getClass()
            java.util.LinkedHashMap r0 = r0.a
            java.util.HashSet r5 = new java.util.HashSet
            java.util.Set r6 = r0.keySet()
            java.util.Collection r6 = (java.util.Collection) r6
            r5.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        Le6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L106
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            java.lang.Object r6 = r0.get(r6)
            qo7 r6 = (defpackage.qo7) r6
            if (r6 != 0) goto Lfe
            goto Le6
        Lfe:
            ut3 r7 = r2.getLifecycle()
            defpackage.uj2.m(r6, r4, r7)
            goto Le6
        L106:
            java.util.HashSet r5 = new java.util.HashSet
            java.util.Set r0 = r0.keySet()
            java.util.Collection r0 = (java.util.Collection) r0
            r5.<init>(r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L93
            r4.d()
            goto L93
        L11c:
            java.lang.String r8 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "
            defpackage.u34.i(r2, r8)
            goto L159
        L122:
            r8 = move-exception
            java.lang.String r9 = "Failed to instantiate "
            java.lang.String r9 = defpackage.i61.m(r9, r0)
            defpackage.u34.p(r9, r8)
            goto L159
        L12d:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r5.getSimpleName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r10)
            java.lang.String r10 = " must have default constructor in order to be automatically recreated"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10, r8)
            throw r9
        L149:
            r8 = move-exception
            java.lang.String r9 = " wasn't found"
            java.lang.String r9 = defpackage.lb1.A(r4, r0, r9)
            defpackage.u34.p(r9, r8)
            goto L159
        L154:
            java.lang.String r8 = "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            defpackage.i.m(r8)
        L159:
            return
        L15a:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "Next event must be ON_CREATE"
            r8.<init>(r9)
            throw r8
    }
}
