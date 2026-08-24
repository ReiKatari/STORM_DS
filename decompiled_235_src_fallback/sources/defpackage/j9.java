package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j9  reason: default package */
/* loaded from: classes.dex */
public abstract class j9 {
    public final java.util.LinkedHashMap a;
    public final java.util.LinkedHashMap b;
    public final java.util.LinkedHashMap c;
    public final java.util.ArrayList d;
    public final transient java.util.LinkedHashMap e;
    public final java.util.LinkedHashMap f;
    public final android.os.Bundle g;

    public j9() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.b = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.e = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.g = r0
            return
    }

    public final boolean a(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            java.util.LinkedHashMap r0 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.LinkedHashMap r0 = r3.e
            java.lang.Object r0 = r0.get(r4)
            g9 r0 = (defpackage.g9) r0
            if (r0 == 0) goto L1d
            a9 r1 = r0.a
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L37
            java.util.ArrayList r1 = r3.d
            boolean r2 = r1.contains(r4)
            if (r2 == 0) goto L37
            a9 r3 = r0.a
            b9 r0 = r0.b
            java.lang.Object r5 = r0.c(r6, r5)
            r3.a(r5)
            r1.remove(r4)
            goto L46
        L37:
            java.util.LinkedHashMap r0 = r3.f
            r0.remove(r4)
            z8 r0 = new z8
            r0.<init>(r6, r5)
            android.os.Bundle r3 = r3.g
            r3.putParcelable(r4, r0)
        L46:
            r3 = 1
            return r3
    }

    public abstract void b(int r1, defpackage.b9 r2, java.lang.Object r3);

    public final defpackage.i9 c(java.lang.String r3, defpackage.b9 r4, defpackage.a9 r5) {
            r2 = this;
            r3.getClass()
            r2.e(r3)
            g9 r0 = new g9
            r0.<init>(r4, r5)
            java.util.LinkedHashMap r1 = r2.e
            r1.put(r3, r0)
            java.util.LinkedHashMap r0 = r2.f
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.get(r3)
            r0.remove(r3)
            r5.a(r1)
        L22:
            java.lang.Class<z8> r0 = defpackage.z8.class
            android.os.Bundle r1 = r2.g
            java.lang.Object r0 = defpackage.nc1.R(r1, r3, r0)
            z8 r0 = (defpackage.z8) r0
            if (r0 == 0) goto L3c
            r1.remove(r3)
            int r1 = r0.A
            android.content.Intent r0 = r0.B
            java.lang.Object r0 = r4.c(r0, r1)
            r5.a(r0)
        L3c:
            i9 r5 = new i9
            r0 = 1
            r5.<init>(r2, r3, r4, r0)
            return r5
    }

    public final defpackage.i9 d(java.lang.String r4, defpackage.hu3 r5, defpackage.b9 r6, defpackage.a9 r7) {
            r3 = this;
            r4.getClass()
            r6.getClass()
            r7.getClass()
            ut3 r0 = r5.getLifecycle()
            tt3 r1 = r0.b()
            tt3 r2 = defpackage.tt3.STARTED
            boolean r1 = r1.isAtLeast(r2)
            if (r1 != 0) goto L44
            r3.e(r4)
            java.util.LinkedHashMap r5 = r3.c
            java.lang.Object r1 = r5.get(r4)
            h9 r1 = (defpackage.h9) r1
            if (r1 != 0) goto L2b
            h9 r1 = new h9
            r1.<init>(r0)
        L2b:
            f9 r0 = new f9
            r0.<init>(r3, r4, r7, r6)
            ut3 r7 = r1.a
            r7.a(r0)
            java.util.ArrayList r7 = r1.b
            r7.add(r0)
            r5.put(r4, r1)
            i9 r5 = new i9
            r7 = 0
            r5.<init>(r3, r4, r6, r7)
            return r5
        L44:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "LifecycleOwner "
            r3.<init>(r4)
            r3.append(r5)
            tt3 r4 = r0.b()
            java.lang.String r5 = " is attempting to register while current state is "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = ". LifecycleOwners must call register before they are STARTED."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public final void e(java.lang.String r6) {
            r5 = this;
            java.util.LinkedHashMap r0 = r5.b
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lb
            return
        Lb:
            c5 r1 = new c5
            r2 = 5
            r1.<init>(r2)
            qd2 r2 = new qd2
            ro5 r3 = new ro5
            r4 = 10
            r3.<init>(r1, r4)
            r4 = 3
            r2.<init>(r1, r3, r4)
            f11 r1 = new f11
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r3 = r2.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.LinkedHashMap r4 = r5.a
            boolean r3 = r4.containsKey(r3)
            if (r3 != 0) goto L27
            int r5 = r2.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r4.put(r1, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r6, r5)
            return
        L56:
            java.lang.String r5 = "Sequence contains no element matching the predicate."
            defpackage.fa6.e(r5)
            return
    }

    public final void f(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            java.util.ArrayList r0 = r6.d
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L1a
            java.util.LinkedHashMap r0 = r6.b
            java.lang.Object r0 = r0.remove(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L1a
            java.util.LinkedHashMap r1 = r6.a
            r1.remove(r0)
        L1a:
            java.util.LinkedHashMap r0 = r6.e
            r0.remove(r7)
            java.util.LinkedHashMap r0 = r6.f
            boolean r1 = r0.containsKey(r7)
            java.lang.String r2 = ": "
            java.lang.String r3 = "Dropping pending result for request "
            java.lang.String r4 = "ActivityResultRegistry"
            if (r1 == 0) goto L42
            java.lang.StringBuilder r1 = defpackage.i61.t(r3, r7, r2)
            java.lang.Object r5 = r0.get(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r4, r1)
            r0.remove(r7)
        L42:
            android.os.Bundle r0 = r6.g
            boolean r1 = r0.containsKey(r7)
            if (r1 == 0) goto L6a
            java.lang.Class<z8> r1 = defpackage.z8.class
            java.lang.Object r1 = defpackage.nc1.R(r0, r7, r1)
            z8 r1 = (defpackage.z8) r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r7)
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.util.Log.w(r4, r1)
            r0.remove(r7)
        L6a:
            java.util.LinkedHashMap r6 = r6.c
            java.lang.Object r0 = r6.get(r7)
            h9 r0 = (defpackage.h9) r0
            if (r0 == 0) goto L91
            java.util.ArrayList r1 = r0.b
            int r2 = r1.size()
            r3 = 0
        L7b:
            if (r3 >= r2) goto L8b
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            fu3 r4 = (defpackage.fu3) r4
            ut3 r5 = r0.a
            r5.c(r4)
            goto L7b
        L8b:
            r1.clear()
            r6.remove(r7)
        L91:
            return
    }
}
