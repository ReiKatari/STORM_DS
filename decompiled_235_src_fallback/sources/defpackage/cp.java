package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp  reason: default package */
/* loaded from: classes.dex */
public final class cp {
    public final java.lang.Object a;
    public final int b;
    public int c;
    public final java.lang.String d;

    public /* synthetic */ cp(defpackage.bp r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = r5 & 4
            if (r0 == 0) goto L6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            java.lang.String r5 = ""
            goto Lf
        Ld:
            java.lang.String r5 = "androidx.compose.foundation.text.inlineContent"
        Lf:
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public cp(java.lang.Object r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final defpackage.ep a(int r4) {
            r3 = this;
            int r0 = r3.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L7
            goto L8
        L7:
            r4 = r0
        L8:
            if (r4 == r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L14
            java.lang.String r0 = "Item.end should be set first"
            defpackage.q53.c(r0)
        L14:
            ep r0 = new ep
            int r1 = r3.b
            java.lang.String r2 = r3.d
            java.lang.Object r3 = r3.a
            r0.<init>(r3, r1, r4, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.cp
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cp r5 = (defpackage.cp) r5
            java.lang.Object r1 = r4.a
            java.lang.Object r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r4 = r4.d
            java.lang.String r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.lang.String r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MutableRange(item="
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", start="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", tag="
            r0.append(r1)
            java.lang.String r2 = r2.d
            r1 = 41
            java.lang.String r2 = defpackage.lb1.q(r0, r2, r1)
            return r2
    }
}
