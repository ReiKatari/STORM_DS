package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y46  reason: default package */
/* loaded from: classes.dex */
public abstract class y46 {
    public static final defpackage.q61 a = null;
    public static final defpackage.jd1 b = null;
    public static final defpackage.w31 c = null;

    static {
            q61 r0 = new q61
            r0.<init>()
            defpackage.y46.a = r0
            jd1 r0 = new jd1
            r1 = 23
            r0.<init>(r1)
            defpackage.y46.b = r0
            w31 r0 = new w31
            r1 = 24
            r0.<init>(r1)
            defpackage.y46.c = r0
            return
    }

    public static final defpackage.v46 a(defpackage.j71 r7) {
            r7.getClass()
            q61 r0 = defpackage.y46.a
            java.lang.Object r0 = r7.a(r0)
            g56 r0 = (defpackage.g56) r0
            r1 = 0
            if (r0 == 0) goto Ldb
            jd1 r2 = defpackage.y46.b
            java.lang.Object r2 = r7.a(r2)
            bp7 r2 = (defpackage.bp7) r2
            if (r2 == 0) goto Ld5
            w31 r3 = defpackage.y46.c
            java.lang.Object r3 = r7.a(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            th7 r4 = defpackage.os0.X
            java.lang.Object r7 = r7.a(r4)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto Lcf
            d56 r0 = r0.getSavedStateRegistry()
            java.lang.String r4 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            c56 r0 = r0.b(r4)
            boolean r4 = r0 instanceof defpackage.z46
            if (r4 == 0) goto L3b
            z46 r0 = (defpackage.z46) r0
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto Lc9
            a56 r2 = c(r2)
            java.util.LinkedHashMap r2 = r2.b
            java.lang.Object r4 = r2.get(r7)
            v46 r4 = (defpackage.v46) r4
            if (r4 != 0) goto Lc8
            r0.b()
            android.os.Bundle r4 = r0.c
            if (r4 != 0) goto L54
            goto L7a
        L54:
            boolean r5 = r4.containsKey(r7)
            if (r5 != 0) goto L5b
            goto L7a
        L5b:
            android.os.Bundle r5 = r4.getBundle(r7)
            if (r5 != 0) goto L6e
            r5 = 0
            vr4[] r6 = new defpackage.vr4[r5]
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r5)
            vr4[] r5 = (defpackage.vr4[]) r5
            android.os.Bundle r5 = defpackage.jw2.l(r5)
        L6e:
            r4.remove(r7)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L79
            r0.c = r1
        L79:
            r1 = r5
        L7a:
            if (r1 != 0) goto L7d
            goto L7e
        L7d:
            r3 = r1
        L7e:
            if (r3 != 0) goto L86
            v46 r0 = new v46
            r0.<init>()
            goto Lc4
        L86:
            java.lang.Class<v46> r0 = defpackage.v46.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r0.getClass()
            r3.setClassLoader(r0)
            int r0 = r3.size()
            p04 r1 = new p04
            r1.<init>(r0)
            java.util.Set r0 = r3.keySet()
            java.util.Iterator r0 = r0.iterator()
        La3:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lba
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            java.lang.Object r5 = r3.get(r4)
            r1.put(r4, r5)
            goto La3
        Lba:
            p04 r0 = r1.b()
            v46 r1 = new v46
            r1.<init>(r0)
            r0 = r1
        Lc4:
            r2.put(r7, r0)
            return r0
        Lc8:
            return r4
        Lc9:
            java.lang.String r7 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            defpackage.i.m(r7)
            return r1
        Lcf:
            java.lang.String r7 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            defpackage.i.h(r7)
            return r1
        Ld5:
            java.lang.String r7 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            defpackage.i.h(r7)
            return r1
        Ldb:
            java.lang.String r7 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            defpackage.i.h(r7)
            return r1
    }

    public static final void b(defpackage.g56 r4) {
            ut3 r0 = r4.getLifecycle()
            tt3 r0 = r0.b()
            tt3 r1 = defpackage.tt3.INITIALIZED
            if (r0 == r1) goto L17
            tt3 r1 = defpackage.tt3.CREATED
            if (r0 != r1) goto L11
            goto L17
        L11:
            java.lang.String r4 = "Failed requirement."
            defpackage.i.h(r4)
            return
        L17:
            d56 r0 = r4.getSavedStateRegistry()
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            c56 r0 = r0.b(r1)
            if (r0 != 0) goto L43
            z46 r0 = new z46
            d56 r2 = r4.getSavedStateRegistry()
            r3 = r4
            bp7 r3 = (defpackage.bp7) r3
            r0.<init>(r2, r3)
            d56 r2 = r4.getSavedStateRegistry()
            r2.c(r1, r0)
            ut3 r4 = r4.getLifecycle()
            mf5 r1 = new mf5
            r2 = 4
            r1.<init>(r0, r2)
            r4.a(r1)
        L43:
            return
    }

    public static final defpackage.a56 c(defpackage.bp7 r2) {
            eg1 r0 = new eg1
            r1 = 1
            r0.<init>(r1)
            r1 = 4
            os0 r2 = defpackage.xo7.a(r2, r0, r1)
            java.lang.Class<a56> r0 = defpackage.a56.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r2 = r2.B
            eb r2 = (defpackage.eb) r2
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesVM"
            qo7 r2 = r2.G(r0, r1)
            a56 r2 = (defpackage.a56) r2
            return r2
    }
}
