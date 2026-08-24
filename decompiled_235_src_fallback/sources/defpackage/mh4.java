package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mh4  reason: default package */
/* loaded from: classes.dex */
public final class mh4 extends defpackage.yc7 {
    public static final defpackage.kh4 b = null;
    public final defpackage.o67 a;

    static {
            n67 r0 = defpackage.n67.LAZILY_PARSED_NUMBER
            mh4 r1 = new mh4
            r1.<init>(r0)
            kh4 r0 = new kh4
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.mh4.b = r0
            return
    }

    public mh4(defpackage.o67 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r4) {
            r3 = this;
            jf3 r0 = r4.n0()
            int[] r1 = defpackage.lh4.a
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L3d
            r2 = 2
            if (r1 == r2) goto L36
            r2 = 3
            if (r1 != r2) goto L16
            goto L36
        L16:
            ne3 r3 = new ne3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expecting number, got: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r4 = r4.x()
            java.lang.String r0 = "; at path "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
        L36:
            o67 r3 = r3.a
            java.lang.Number r3 = r3.readNumber(r4)
            return r3
        L3d:
            r4.j0()
            r3 = 0
            return r3
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            r1.a0(r2)
            return
    }
}
