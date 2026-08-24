package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su7  reason: default package */
/* loaded from: classes.dex */
public abstract class su7 {
    public static int a(int r3) {
            r0 = 1
            if (r3 == r0) goto L3f
            r1 = 2
            if (r3 == r1) goto L3e
            r0 = 4
            if (r3 == r0) goto L3d
            r1 = 8
            if (r3 == r1) goto L3b
            r2 = 16
            if (r3 == r2) goto L3a
            r0 = 32
            if (r3 == r0) goto L38
            r0 = 64
            if (r3 == r0) goto L36
            r0 = 128(0x80, float:1.8E-43)
            if (r3 == r0) goto L34
            r0 = 256(0x100, float:3.59E-43)
            if (r3 == r0) goto L33
            r0 = 512(0x200, float:7.17E-43)
            if (r3 != r0) goto L28
            r3 = 9
            return r3
        L28:
            java.lang.String r0 = "type needs to be >= FIRST and <= LAST, type="
            java.lang.String r3 = defpackage.lb1.g(r3, r0)
            defpackage.i.h(r3)
            r3 = 0
            return r3
        L33:
            return r1
        L34:
            r3 = 7
            return r3
        L36:
            r3 = 6
            return r3
        L38:
            r3 = 5
            return r3
        L3a:
            return r0
        L3b:
            r3 = 3
            return r3
        L3d:
            return r1
        L3e:
            return r0
        L3f:
            r3 = 0
            return r3
    }

    public static void b(int r2, int r3) {
            if (r2 < 0) goto L6
            if (r2 < r3) goto L5
            goto L6
        L5:
            return
        L6:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index"
            if (r2 < 0) goto L2b
            if (r3 >= 0) goto L18
            java.lang.String r2 = "negative size: "
            java.lang.String r2 = defpackage.lb1.g(r3, r2)
            defpackage.i.h(r2)
            return
        L18:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "%s (%s) must be less than size (%s)"
            java.lang.String r2 = defpackage.bv7.g(r3, r2)
            goto L39
        L2b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r3 = "%s (%s) must not be negative"
            java.lang.String r2 = defpackage.bv7.g(r3, r2)
        L39:
            r0.<init>(r2)
            throw r0
    }

    public static void c(int r1, int r2) {
            if (r1 < 0) goto L5
            if (r1 > r2) goto L5
            return
        L5:
            java.lang.String r0 = "index"
            java.lang.String r1 = e(r1, r2, r0)
            defpackage.e41.q(r1)
            return
    }

    public static void d(int r1, int r2, int r3) {
            if (r1 < 0) goto L8
            if (r2 < r1) goto L8
            if (r2 <= r3) goto L7
            goto L8
        L7:
            return
        L8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            if (r1 < 0) goto L2d
            if (r1 > r3) goto L2d
            if (r2 < 0) goto L26
            if (r2 <= r3) goto L13
            goto L26
        L13:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r1 = defpackage.bv7.g(r2, r1)
            goto L33
        L26:
            java.lang.String r1 = "end index"
            java.lang.String r1 = e(r2, r3, r1)
            goto L33
        L2d:
            java.lang.String r2 = "start index"
            java.lang.String r1 = e(r1, r3, r2)
        L33:
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String e(int r0, int r1, java.lang.String r2) {
            if (r0 >= 0) goto L11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r1 = "%s (%s) must not be negative"
            java.lang.String r0 = defpackage.bv7.g(r1, r0)
            return r0
        L11:
            if (r1 < 0) goto L26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r1}
            java.lang.String r1 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r0 = defpackage.bv7.g(r1, r0)
            return r0
        L26:
            java.lang.String r0 = "negative size: "
            java.lang.String r0 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }
}
