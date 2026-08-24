package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tz4  reason: default package */
/* loaded from: classes.dex */
public class tz4 {
    public final java.lang.Object[] a;
    public int b;

    public tz4() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.a = r0
            return
    }

    public tz4(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto La
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.a = r1
            return
        La:
            java.lang.String r0 = "The max pool size must be > 0"
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    public java.lang.Object a() {
            r4 = this;
            int r0 = r4.b
            r1 = 0
            if (r0 <= 0) goto L17
            int r0 = r0 + (-1)
            java.lang.Object[] r2 = r4.a
            r3 = r2[r0]
            r3.getClass()
            r2[r0] = r1
            int r0 = r4.b
            int r0 = r0 + (-1)
            r4.b = r0
            return r3
        L17:
            return r1
    }

    public void b(defpackage.yu r4) {
            r3 = this;
            int r0 = r3.b
            java.lang.Object[] r1 = r3.a
            int r2 = r1.length
            if (r0 >= r2) goto Ld
            r1[r0] = r4
            int r0 = r0 + 1
            r3.b = r0
        Ld:
            return
    }

    public boolean c(java.lang.Object r5) {
            r4 = this;
            r5.getClass()
            int r0 = r4.b
            r1 = 0
            r2 = r1
        L7:
            java.lang.Object[] r3 = r4.a
            if (r2 >= r0) goto L18
            r3 = r3[r2]
            if (r3 == r5) goto L12
            int r2 = r2 + 1
            goto L7
        L12:
            java.lang.String r4 = "Already in the pool!"
            defpackage.i.m(r4)
            return r1
        L18:
            int r0 = r4.b
            int r2 = r3.length
            if (r0 >= r2) goto L24
            r3[r0] = r5
            r5 = 1
            int r0 = r0 + r5
            r4.b = r0
            return r5
        L24:
            return r1
    }
}
