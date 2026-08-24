package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ks3  reason: default package */
/* loaded from: classes.dex */
public final class ks3 {
    public final java.util.LinkedHashMap a;
    public final java.util.LinkedHashMap b;
    public long c;
    public long d;
    public boolean e;

    public ks3() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.b = r0
            return
    }

    public static boolean b(defpackage.as3 r1) {
            as3 r0 = defpackage.as3.SCOREBOARD
            if (r1 == r0) goto Lf
            as3 r0 = defpackage.as3.FAILED
            if (r1 == r0) goto Lf
            as3 r0 = defpackage.as3.CANCELED
            if (r1 != r0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final boolean a(defpackage.ls3 r11, boolean r12) {
            r10 = this;
            r0 = 1
            java.util.LinkedHashMap r1 = r10.a
            r2 = 0
            if (r12 == 0) goto L18
            java.lang.Object r12 = r1.get(r11)
            bs3 r12 = (defpackage.bs3) r12
            if (r12 == 0) goto L11
            as3 r12 = r12.b
            goto L12
        L11:
            r12 = 0
        L12:
            as3 r3 = defpackage.as3.PENDING
            if (r12 != r3) goto L18
            r12 = r0
            goto L19
        L18:
            r12 = r2
        L19:
            long r3 = r11.b
            long r5 = r11.a
            long r7 = r10.d
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 > 0) goto L26
            if (r12 != 0) goto L26
            goto L42
        L26:
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            java.util.LinkedHashMap r7 = r10.b
            java.lang.Object r12 = r7.get(r12)
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r11 = r1.get(r11)
            if (r11 != 0) goto L43
            if (r12 == 0) goto L43
            long r8 = r12.longValue()
            int r11 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r11 >= 0) goto L43
        L42:
            return r2
        L43:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            if (r12 == 0) goto L4e
            long r1 = r12.longValue()
            goto L50
        L4e:
            r1 = 0
        L50:
            long r1 = java.lang.Math.max(r1, r3)
            java.lang.Long r12 = java.lang.Long.valueOf(r1)
            r7.put(r11, r12)
            long r11 = r10.c
            long r11 = java.lang.Math.max(r11, r3)
            r10.c = r11
            return r0
    }

    public final void c() {
            r2 = this;
            java.util.LinkedHashMap r0 = r2.a
            r0.clear()
            java.util.LinkedHashMap r0 = r2.b
            r0.clear()
            long r0 = r2.c
            r2.d = r0
            r0 = 0
            r2.e = r0
            return
    }
}
