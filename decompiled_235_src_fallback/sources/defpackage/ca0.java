package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca0  reason: default package */
/* loaded from: classes.dex */
public class ca0 extends defpackage.ea0 {
    public final byte[] R;

    public ca0(byte[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.A = r0
            r2.getClass()
            r1.R = r2
            return
    }

    @Override // defpackage.ea0
    public byte a(int r1) {
            r0 = this;
            byte[] r0 = r0.R
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.ea0
    public void d(byte[] r2, int r3) {
            r1 = this;
            r0 = 0
            byte[] r1 = r1.R
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            if (r6 != r5) goto L3
            goto L5e
        L3:
            boolean r0 = r6 instanceof defpackage.ea0
            if (r0 != 0) goto L8
            goto L57
        L8:
            int r0 = r5.size()
            r1 = r6
            ea0 r1 = (defpackage.ea0) r1
            int r1 = r1.size()
            if (r0 == r1) goto L16
            goto L57
        L16:
            int r0 = r5.size()
            if (r0 != 0) goto L1d
            goto L5e
        L1d:
            boolean r0 = r6 instanceof defpackage.ca0
            if (r0 == 0) goto L94
            ca0 r6 = (defpackage.ca0) r6
            int r0 = r5.A
            int r1 = r6.A
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L2e
            if (r0 == r1) goto L2e
            goto L57
        L2e:
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 > r1) goto L79
            int r1 = r6.size()
            if (r0 > r1) goto L60
            byte[] r1 = r6.R
            int r2 = r5.g()
            int r2 = r2 + r0
            int r0 = r5.g()
            int r6 = r6.g()
        L4d:
            if (r0 >= r2) goto L5e
            byte[] r3 = r5.R
            r3 = r3[r0]
            r4 = r1[r6]
            if (r3 == r4) goto L59
        L57:
            r5 = 0
            return r5
        L59:
            int r0 = r0 + 1
            int r6 = r6 + 1
            goto L4d
        L5e:
            r5 = 1
            return r5
        L60:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Ran off end of other: 0, "
            java.lang.String r2 = ", "
            java.lang.StringBuilder r0 = defpackage.xg6.t(r1, r0, r2)
            int r6 = r6.size()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L79:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            int r5 = r5.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Length too large: "
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r6.<init>(r5)
            throw r6
        L94:
            boolean r5 = r6.equals(r5)
            return r5
    }

    @Override // defpackage.ea0
    public byte f(int r1) {
            r0 = this;
            byte[] r0 = r0.R
            r0 = r0[r1]
            return r0
    }

    public int g() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.ea0
    public int size() {
            r0 = this;
            byte[] r0 = r0.R
            int r0 = r0.length
            return r0
    }
}
