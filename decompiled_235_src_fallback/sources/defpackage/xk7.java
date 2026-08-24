package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xk7  reason: default package */
/* loaded from: classes.dex */
public abstract class xk7 extends defpackage.wk7 {
    public defpackage.iu4[] a;
    public java.lang.String b;
    public int c;

    public xk7() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.c = r0
            return
    }

    public xk7(defpackage.xk7 r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r0 = 0
            r4.c = r0
            java.lang.String r1 = r5.b
            r4.b = r1
            iu4[] r5 = r5.a
            int r1 = r5.length
            iu4[] r1 = new defpackage.iu4[r1]
        L12:
            int r2 = r5.length
            if (r0 >= r2) goto L21
            iu4 r2 = new iu4
            r3 = r5[r0]
            r2.<init>(r3)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L12
        L21:
            r4.a = r1
            return
    }

    public defpackage.iu4[] getPathData() {
            r0 = this;
            iu4[] r0 = r0.a
            return r0
    }

    public java.lang.String getPathName() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public void setPathData(defpackage.iu4[] r8) {
            r7 = this;
            iu4[] r0 = r7.a
            r1 = 0
            if (r0 == 0) goto L4c
            if (r8 != 0) goto L8
            goto L4c
        L8:
            int r2 = r0.length
            int r3 = r8.length
            if (r2 == r3) goto Ld
            goto L4c
        Ld:
            r2 = r1
        Le:
            int r3 = r0.length
            if (r2 >= r3) goto L27
            r3 = r0[r2]
            char r4 = r3.a
            r5 = r8[r2]
            char r6 = r5.a
            if (r4 != r6) goto L4c
            float[] r3 = r3.b
            int r3 = r3.length
            float[] r4 = r5.b
            int r4 = r4.length
            if (r3 == r4) goto L24
            goto L4c
        L24:
            int r2 = r2 + 1
            goto Le
        L27:
            iu4[] r7 = r7.a
            r0 = r1
        L2a:
            int r2 = r8.length
            if (r0 >= r2) goto L4b
            r2 = r7[r0]
            r3 = r8[r0]
            char r3 = r3.a
            r2.a = r3
            r2 = r1
        L36:
            r3 = r8[r0]
            float[] r3 = r3.b
            int r4 = r3.length
            if (r2 >= r4) goto L48
            r4 = r7[r0]
            float[] r4 = r4.b
            r3 = r3[r2]
            r4[r2] = r3
            int r2 = r2 + 1
            goto L36
        L48:
            int r0 = r0 + 1
            goto L2a
        L4b:
            return
        L4c:
            int r0 = r8.length
            iu4[] r0 = new defpackage.iu4[r0]
        L4f:
            int r2 = r8.length
            if (r1 >= r2) goto L5e
            iu4 r2 = new iu4
            r3 = r8[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4f
        L5e:
            r7.a = r0
            return
    }
}
