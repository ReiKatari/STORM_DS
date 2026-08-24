package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd6  reason: default package */
/* loaded from: classes.dex */
public final class fd6 {
    public int a;
    public final int[] b;

    public fd6() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.b = r0
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.a
            r0 = r0 & 16
            if (r0 == 0) goto Lc
            int[] r1 = r1.b
            r0 = 4
            r1 = r1[r0]
            return r1
        Lc:
            r1 = 65535(0xffff, float:9.1834E-41)
            return r1
    }

    public final void b(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L11
            int[] r0 = r3.b
            int r1 = r0.length
            if (r4 < r1) goto L8
            goto L11
        L8:
            r1 = 1
            int r1 = r1 << r4
            int r2 = r3.a
            r1 = r1 | r2
            r3.a = r1
            r0[r4] = r5
        L11:
            return
    }
}
