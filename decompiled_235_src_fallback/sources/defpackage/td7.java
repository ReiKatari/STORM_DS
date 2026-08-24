package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td7  reason: default package */
/* loaded from: classes.dex */
public class td7 extends defpackage.yc7 {
    public td7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r7) {
            r6 = this;
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            r7.e()
            jf3 r0 = r7.n0()
            r1 = 0
            r2 = r1
        Le:
            jf3 r3 = defpackage.jf3.END_ARRAY
            if (r0 == r3) goto L77
            int[] r3 = defpackage.wd7.a
            int r4 = r0.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L48
            r5 = 2
            if (r3 == r5) goto L48
            r4 = 3
            if (r3 != r4) goto L28
            boolean r4 = r7.U()
            goto L52
        L28:
            ne3 r6 = new ne3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid bitset value type: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r7 = r7.x()
            java.lang.String r0 = "; at path "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r6.<init>(r7)
            throw r6
        L48:
            int r0 = r7.Z()
            if (r0 != 0) goto L50
            r4 = r1
            goto L52
        L50:
            if (r0 != r4) goto L5e
        L52:
            if (r4 == 0) goto L57
            r6.set(r2)
        L57:
            int r2 = r2 + 1
            jf3 r0 = r7.n0()
            goto Le
        L5e:
            ne3 r6 = new ne3
            java.lang.String r1 = "Invalid bitset value "
            java.lang.String r2 = ", expected 0 or 1; at path "
            java.lang.StringBuilder r0 = defpackage.xg6.t(r1, r0, r2)
            java.lang.String r7 = r7.D()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L77:
            r7.r()
            return r6
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r4, java.lang.Object r5) {
            r3 = this;
            java.util.BitSet r5 = (java.util.BitSet) r5
            r4.h()
            int r3 = r5.length()
            r0 = 0
        La:
            if (r0 >= r3) goto L17
            boolean r1 = r5.get(r0)
            long r1 = (long) r1
            r4.X(r1)
            int r0 = r0 + 1
            goto La
        L17:
            r4.r()
            return
    }
}
