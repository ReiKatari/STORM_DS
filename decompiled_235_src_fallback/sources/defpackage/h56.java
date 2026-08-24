package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h56  reason: default package */
/* loaded from: classes.dex */
public final class h56 implements defpackage.yo7 {
    public final android.app.Application a;
    public final defpackage.wo7 b;
    public final android.os.Bundle c;
    public final defpackage.ut3 d;
    public final defpackage.d56 e;

    public h56() {
            r2 = this;
            r2.<init>()
            wo7 r0 = new wo7
            r1 = 0
            r0.<init>(r1)
            r2.b = r0
            return
    }

    public h56(android.app.Application r2, defpackage.g56 r3, android.os.Bundle r4) {
            r1 = this;
            r1.<init>()
            d56 r0 = r3.getSavedStateRegistry()
            r1.e = r0
            ut3 r3 = r3.getLifecycle()
            r1.d = r3
            r1.c = r4
            r1.a = r2
            if (r2 == 0) goto L26
            wo7 r3 = defpackage.wo7.c
            if (r3 != 0) goto L20
            wo7 r3 = new wo7
            r3.<init>(r2)
            defpackage.wo7.c = r3
        L20:
            wo7 r2 = defpackage.wo7.c
            r2.getClass()
            goto L2c
        L26:
            wo7 r2 = new wo7
            r3 = 0
            r2.<init>(r3)
        L2c:
            r1.b = r2
            return
    }

    @Override // defpackage.yo7
    public final defpackage.qo7 a(java.lang.Class r2) {
            r1 = this;
            java.lang.String r0 = r2.getCanonicalName()
            if (r0 == 0) goto Lb
            qo7 r1 = r1.d(r2, r0)
            return r1
        Lb:
            java.lang.String r1 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.yo7
    public final defpackage.qo7 b(java.lang.Class r5, defpackage.m94 r6) {
            r4 = this;
            th7 r0 = defpackage.os0.X
            java.util.LinkedHashMap r1 = r6.a
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            if (r0 == 0) goto L72
            q61 r3 = defpackage.y46.a
            java.lang.Object r3 = r1.get(r3)
            if (r3 == 0) goto L63
            jd1 r3 = defpackage.y46.b
            java.lang.Object r3 = r1.get(r3)
            if (r3 == 0) goto L63
            vo7 r0 = defpackage.wo7.d
            java.lang.Object r0 = r1.get(r0)
            android.app.Application r0 = (android.app.Application) r0
            java.lang.Class<ym> r1 = defpackage.ym.class
            boolean r1 = r1.isAssignableFrom(r5)
            if (r1 == 0) goto L36
            if (r0 == 0) goto L36
            java.util.List r2 = defpackage.i56.a
            java.lang.reflect.Constructor r2 = defpackage.i56.a(r5, r2)
            goto L3c
        L36:
            java.util.List r2 = defpackage.i56.b
            java.lang.reflect.Constructor r2 = defpackage.i56.a(r5, r2)
        L3c:
            if (r2 != 0) goto L45
            wo7 r4 = r4.b
            qo7 r4 = r4.b(r5, r6)
            return r4
        L45:
            if (r1 == 0) goto L56
            if (r0 == 0) goto L56
            v46 r4 = defpackage.y46.a(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            qo7 r4 = defpackage.i56.b(r5, r2, r4)
            return r4
        L56:
            v46 r4 = defpackage.y46.a(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            qo7 r4 = defpackage.i56.b(r5, r2, r4)
            return r4
        L63:
            ut3 r6 = r4.d
            if (r6 == 0) goto L6c
            qo7 r4 = r4.d(r5, r0)
            return r4
        L6c:
            java.lang.String r4 = "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."
            defpackage.i.m(r4)
            return r2
        L72:
            java.lang.String r4 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            defpackage.i.m(r4)
            return r2
    }

    @Override // defpackage.yo7
    public final defpackage.qo7 c(defpackage.ar0 r1, defpackage.m94 r2) {
            r0 = this;
            java.lang.Class r1 = r1.a
            r1.getClass()
            qo7 r0 = r0.b(r1, r2)
            return r0
    }

    public final defpackage.qo7 d(java.lang.Class r10, java.lang.String r11) {
            r9 = this;
            ut3 r0 = r9.d
            if (r0 == 0) goto Ld0
            java.lang.Class<ym> r1 = defpackage.ym.class
            boolean r1 = r1.isAssignableFrom(r10)
            android.app.Application r2 = r9.a
            if (r1 == 0) goto L17
            if (r2 == 0) goto L17
            java.util.List r3 = defpackage.i56.a
            java.lang.reflect.Constructor r3 = defpackage.i56.a(r10, r3)
            goto L1d
        L17:
            java.util.List r3 = defpackage.i56.b
            java.lang.reflect.Constructor r3 = defpackage.i56.a(r10, r3)
        L1d:
            if (r3 != 0) goto L3d
            if (r2 == 0) goto L28
            wo7 r9 = r9.b
            qo7 r9 = r9.a(r10)
            return r9
        L28:
            zo7 r9 = defpackage.zo7.a
            if (r9 != 0) goto L33
            zo7 r9 = new zo7
            r9.<init>()
            defpackage.zo7.a = r9
        L33:
            zo7 r9 = defpackage.zo7.a
            r9.getClass()
            qo7 r9 = defpackage.nj2.k(r10)
            return r9
        L3d:
            d56 r4 = r9.e
            r4.getClass()
            android.os.Bundle r5 = r4.a(r11)
            if (r5 != 0) goto L4a
            android.os.Bundle r5 = r9.c
        L4a:
            if (r5 != 0) goto L52
            v46 r9 = new v46
            r9.<init>()
            goto L90
        L52:
            java.lang.Class<v46> r9 = defpackage.v46.class
            java.lang.ClassLoader r9 = r9.getClassLoader()
            r9.getClass()
            r5.setClassLoader(r9)
            int r9 = r5.size()
            p04 r6 = new p04
            r6.<init>(r9)
            java.util.Set r9 = r5.keySet()
            java.util.Iterator r9 = r9.iterator()
        L6f:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L86
            java.lang.Object r7 = r9.next()
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.lang.Object r8 = r5.get(r7)
            r6.put(r7, r8)
            goto L6f
        L86:
            p04 r9 = r6.b()
            v46 r5 = new v46
            r5.<init>(r9)
            r9 = r5
        L90:
            w46 r5 = new w46
            r5.<init>(r11, r9)
            r5.e(r0, r4)
            tt3 r11 = r0.b()
            tt3 r6 = defpackage.tt3.INITIALIZED
            if (r11 == r6) goto Lb2
            tt3 r6 = defpackage.tt3.STARTED
            boolean r11 = r11.isAtLeast(r6)
            if (r11 == 0) goto La9
            goto Lb2
        La9:
            se1 r11 = new se1
            r11.<init>(r0, r4)
            r0.a(r11)
            goto Lb5
        Lb2:
            r4.d()
        Lb5:
            if (r1 == 0) goto Lc2
            if (r2 == 0) goto Lc2
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9}
            qo7 r9 = defpackage.i56.b(r10, r3, r9)
            goto Lca
        Lc2:
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            qo7 r9 = defpackage.i56.b(r10, r3, r9)
        Lca:
            java.lang.String r10 = "androidx.lifecycle.savedstate.vm.tag"
            r9.a(r10, r5)
            return r9
        Ld0:
            java.lang.String r9 = "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            defpackage.fa6.h(r9)
            r9 = 0
            return r9
    }
}
