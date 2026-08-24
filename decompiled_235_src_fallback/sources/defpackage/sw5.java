package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw5  reason: default package */
/* loaded from: classes.dex */
public final class sw5 extends defpackage.hi2 {
    public final android.net.Uri o;
    public final android.net.Uri p;

    public sw5(android.net.Uri r1, android.net.Uri r2) {
            r0 = this;
            r0.<init>()
            r0.o = r1
            r0.p = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.sw5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sw5 r5 = (defpackage.sw5) r5
            android.net.Uri r1 = r4.o
            android.net.Uri r3 = r5.o
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            android.net.Uri r4 = r4.p
            android.net.Uri r5 = r5.p
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            android.net.Uri r1 = r2.o
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            android.net.Uri r2 = r2.p
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GbaRom(romPath="
            r0.<init>(r1)
            android.net.Uri r1 = r2.o
            r0.append(r1)
            java.lang.String r1 = ", savePath="
            r0.append(r1)
            android.net.Uri r2 = r2.p
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
