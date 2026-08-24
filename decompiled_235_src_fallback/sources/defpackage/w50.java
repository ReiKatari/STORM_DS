package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w50  reason: default package */
/* loaded from: classes.dex */
public final class w50 {
    public defpackage.zh a;
    public defpackage.wd b;
    public defpackage.zj0 c;
    public defpackage.hj d;

    public w50() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof defpackage.w50
            if (r0 != 0) goto L8
            goto L35
        L8:
            w50 r3 = (defpackage.w50) r3
            zh r0 = r2.a
            zh r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            wd r0 = r2.b
            wd r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            zj0 r0 = r2.c
            zj0 r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            hj r2 = r2.d
            hj r3 = r3.d
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            zh r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            wd r2 = r3.b
            if (r2 != 0) goto L13
            r2 = r1
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            zj0 r2 = r3.c
            if (r2 != 0) goto L20
            r2 = r1
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            hj r3 = r3.d
            if (r3 != 0) goto L2c
            goto L30
        L2c:
            int r1 = r3.hashCode()
        L30:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BorderCache(imageBitmap="
            r0.<init>(r1)
            zh r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", canvas="
            r0.append(r1)
            wd r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", canvasDrawScope="
            r0.append(r1)
            zj0 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", borderPath="
            r0.append(r1)
            hj r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
