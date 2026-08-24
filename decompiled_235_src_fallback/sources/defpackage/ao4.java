package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ao4  reason: default package */
/* loaded from: classes.dex */
public abstract class ao4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public ao4() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            return
    }

    public ao4(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            return
    }

    public /* synthetic */ ao4(int r3, int r4, int r5) {
            r2 = this;
            r0 = 0
            r2.a = r0
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L9
            r3 = r1
        L9:
            r5 = r5 & 2
            if (r5 == 0) goto Le
            r4 = r1
        Le:
            r2.<init>(r3, r4)
            return
    }

    public static final void e(short[] r1) {
            r0 = 1024(0x400, float:1.435E-42)
            java.util.Arrays.fill(r1, r0)
            return
    }

    public int a(short[] r5, int r6) {
            r4 = this;
            r4.f()
            short r0 = r5[r6]
            int r1 = r4.b
            int r1 = r1 >>> 11
            int r1 = r1 * r0
            int r2 = r4.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r3
            r3 = r3 ^ r1
            int r2 = java.lang.Integer.compare(r2, r3)
            if (r2 >= 0) goto L22
            r4.b = r1
            int r4 = 2048 - r0
            int r4 = r4 >>> 5
            int r0 = r0 + r4
            short r4 = (short) r0
            r5[r6] = r4
            r4 = 0
            return r4
        L22:
            int r2 = r4.b
            int r2 = r2 - r1
            r4.b = r2
            int r2 = r4.c
            int r2 = r2 - r1
            r4.c = r2
            int r4 = r0 >>> 5
            int r0 = r0 - r4
            short r4 = (short) r0
            r5[r6] = r4
            r4 = 1
            return r4
    }

    public int b(short[] r3) {
            r2 = this;
            r0 = 1
        L1:
            int r1 = r0 << 1
            int r0 = r2.a(r3, r0)
            r0 = r0 | r1
            int r1 = r3.length
            if (r0 < r1) goto L1
            int r2 = r3.length
            int r0 = r0 - r2
            return r0
    }

    public abstract void c(defpackage.ls0 r1, defpackage.nt r2, defpackage.pk6 r3, defpackage.jb1 r4, defpackage.bo4 r5);

    public defpackage.sq2 d(defpackage.ls0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract void f();

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Class r1 = r1.getClass()
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r1 = r1.c()
            if (r1 != 0) goto L1a
            java.lang.String r1 = ""
        L1a:
            return r1
    }
}
