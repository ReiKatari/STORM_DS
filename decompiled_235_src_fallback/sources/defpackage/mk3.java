package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mk3  reason: default package */
/* loaded from: classes.dex */
public final class mk3 {
    public final int a;
    public final defpackage.lk3 b;
    public final int c;
    public final int d;

    public mk3(int r1, defpackage.lk3 r2, int r3, int r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public static defpackage.mk3 a(defpackage.mk3 r4) {
            lk3 r0 = r4.b
            int r1 = r4.c
            int r2 = r4.d
            r4.getClass()
            r0.getClass()
            mk3 r4 = new mk3
            r3 = -1
            r4.<init>(r3, r0, r1, r2)
            return r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.mk3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mk3 r5 = (defpackage.mk3) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            lk3 r1 = r4.b
            lk3 r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            int r4 = r4.d
            int r5 = r5.d
            if (r4 == r5) goto L28
            return r2
        L28:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            lk3 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.c
            int r0 = defpackage.lb1.a(r0, r2, r1)
            int r3 = r3.d
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutDisplay(id="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            lk3 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
