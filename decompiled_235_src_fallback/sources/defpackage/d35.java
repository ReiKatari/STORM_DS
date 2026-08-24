package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d35  reason: default package */
/* loaded from: classes.dex */
public abstract class d35 {
    public static final android.util.SparseArray a = null;
    public static final java.util.HashMap b = null;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            defpackage.d35.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.d35.b = r0
            b35 r1 = defpackage.b35.DEFAULT
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            b35 r1 = defpackage.b35.VERY_LOW
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            b35 r1 = defpackage.b35.HIGHEST
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            b35 r1 = (defpackage.b35) r1
            android.util.SparseArray r2 = defpackage.d35.a
            java.util.HashMap r3 = defpackage.d35.b
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.append(r3, r1)
            goto L34
        L52:
            return
    }

    public static int a(defpackage.b35 r1) {
            java.util.HashMap r0 = defpackage.d35.b
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r1 = r0.intValue()
            return r1
        Lf:
            java.lang.String r0 = "PriorityMapping is missing known Priority value "
            defpackage.e41.y(r1, r0)
            r1 = 0
            return r1
    }

    public static defpackage.b35 b(int r1) {
            android.util.SparseArray r0 = defpackage.d35.a
            java.lang.Object r0 = r0.get(r1)
            b35 r0 = (defpackage.b35) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "Unknown Priority for value "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }
}
