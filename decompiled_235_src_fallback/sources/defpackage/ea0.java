package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea0  reason: default package */
/* loaded from: classes.dex */
public abstract class ea0 implements java.lang.Iterable, java.io.Serializable {
    public static final defpackage.ca0 B = null;
    public static final defpackage.ba0 L = null;
    public int A;

    static {
            ca0 r0 = new ca0
            byte[] r1 = defpackage.aa3.b
            r0.<init>(r1)
            defpackage.ea0.B = r0
            boolean r0 = defpackage.hd.a()
            if (r0 == 0) goto L17
            d90 r0 = new d90
            r1 = 26
            r0.<init>(r1)
            goto L1e
        L17:
            cs1 r0 = new cs1
            r1 = 25
            r0.<init>(r1)
        L1e:
            defpackage.ea0.L = r0
            return
    }

    public static int b(int r3, int r4, int r5) {
            int r0 = r4 - r3
            r1 = r3 | r4
            r1 = r1 | r0
            int r2 = r5 - r4
            r1 = r1 | r2
            if (r1 >= 0) goto L33
            if (r3 < 0) goto L27
            if (r4 >= r3) goto L1b
            java.lang.String r5 = "Beginning index larger than ending index: "
            java.lang.String r0 = ", "
            java.lang.String r3 = defpackage.lb1.j(r5, r3, r4, r0)
            defpackage.e41.q(r3)
        L19:
            r3 = 0
            return r3
        L1b:
            java.lang.String r3 = "End index: "
            java.lang.String r0 = " >= "
            java.lang.String r3 = defpackage.lb1.j(r3, r4, r5, r0)
            defpackage.e41.q(r3)
            goto L19
        L27:
            java.lang.String r4 = "Beginning index: "
            java.lang.String r5 = " < 0"
            java.lang.String r3 = defpackage.lb1.k(r4, r3, r5)
            defpackage.e41.q(r3)
            goto L19
        L33:
            return r0
    }

    public static defpackage.ca0 c(byte[] r2, int r3, int r4) {
            int r0 = r3 + r4
            int r1 = r2.length
            b(r3, r0, r1)
            ca0 r0 = new ca0
            ba0 r1 = defpackage.ea0.L
            byte[] r2 = r1.b(r2, r3, r4)
            r0.<init>(r2)
            return r0
    }

    public abstract byte a(int r1);

    public abstract void d(byte[] r1, int r2);

    public abstract byte f(int r1);

    public final int hashCode() {
            r6 = this;
            int r0 = r6.A
            if (r0 != 0) goto L25
            int r0 = r6.size()
            r1 = r6
            ca0 r1 = (defpackage.ca0) r1
            int r2 = r1.g()
            r4 = r0
            r3 = r2
        L11:
            int r5 = r2 + r0
            if (r3 >= r5) goto L1f
            int r4 = r4 * 31
            byte[] r5 = r1.R
            r5 = r5[r3]
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L11
        L1f:
            if (r4 != 0) goto L22
            r4 = 1
        L22:
            r6.A = r4
            return r4
        L25:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            z90 r0 = new z90
            r0.<init>(r1)
            return r0
    }

    public abstract int size();

    public final java.lang.String toString() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            int r0 = java.lang.System.identityHashCode(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            int r1 = r5.size()
            int r2 = r5.size()
            r3 = 50
            if (r2 > r3) goto L1b
            java.lang.String r5 = defpackage.qo2.u(r5)
            goto L43
        L1b:
            ca0 r5 = (defpackage.ca0) r5
            r2 = 0
            int r3 = r5.size()
            r4 = 47
            int r2 = b(r2, r4, r3)
            if (r2 != 0) goto L2d
            ca0 r5 = defpackage.ea0.B
            goto L39
        L2d:
            aa0 r3 = new aa0
            byte[] r4 = r5.R
            int r5 = r5.g()
            r3.<init>(r4, r5, r2)
            r5 = r3
        L39:
            java.lang.String r5 = defpackage.qo2.u(r5)
            java.lang.String r2 = "..."
            java.lang.String r5 = r5.concat(r2)
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "<ByteString@"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " size="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " contents=\""
            r2.append(r0)
            java.lang.String r0 = "\">"
            java.lang.String r5 = defpackage.i61.n(r2, r5, r0)
            return r5
    }
}
