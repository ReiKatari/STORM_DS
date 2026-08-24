package defpackage;
/* renamed from: sb6  reason: default package */
/* loaded from: classes.dex */
public abstract class sb6 extends defpackage.qo2 {
    public static defpackage.qb6 Y(java.util.Iterator r2) {
            r2.getClass()
            ev r0 = new ev
            r1 = 3
            r0.<init>(r2, r1)
            f11 r2 = new f11
            r2.<init>(r0)
            return r2
    }

    public static defpackage.qb6 Z(java.lang.Object r3, defpackage.qn2 r4) {
            if (r3 != 0) goto L5
            cu1 r3 = defpackage.cu1.a
            return r3
        L5:
            qd2 r0 = new qd2
            t46 r1 = new t46
            r2 = 5
            r1.<init>(r3, r2)
            r3 = 3
            r0.<init>(r1, r4, r3)
            return r0
    }

    public static java.lang.String a0(defpackage.qb6 r5, java.lang.String r6) {
            r5.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        L12:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r5.next()
            r4 = 1
            int r2 = r2 + r4
            if (r2 <= r4) goto L23
            r0.append(r6)
        L23:
            r4 = 0
            defpackage.hi2.s(r0, r3, r4)
            goto L12
        L28:
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static defpackage.pc2 b0(defpackage.qb6 r2, defpackage.qn2 r3) {
            qd2 r0 = new qd2
            r1 = 2
            r0.<init>(r2, r3, r1)
            r76 r2 = new r76
            r3 = 5
            r2.<init>(r3)
            pc2 r3 = new pc2
            r1 = 0
            r3.<init>(r0, r1, r2)
            return r3
    }

    public static java.util.List c0(defpackage.qb6 r2) {
            r2.getClass()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L10
            yt1 r2 = defpackage.yt1.A
            return r2
        L10:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1f
            java.util.List r2 = defpackage.hf.b0(r0)
            return r2
        L1f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L27
        L35:
            return r1
    }
}
