package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dy7  reason: default package */
/* loaded from: classes.dex */
public final class dy7 implements defpackage.di6 {
    public static final boolean[] c = null;
    public static final int[] d = null;
    public int a;
    public int b;

    static {
            r0 = 8
            boolean[] r1 = new boolean[r0]
            r1 = {x0012: FILL_ARRAY_DATA  , data: [1, 1, 1, 0, 1, 0, 0, 0} // fill-array
            defpackage.dy7.c = r1
            int[] r0 = new int[r0]
            r0 = {x001a: FILL_ARRAY_DATA  , data: [0, 1, 2, 2, 3, 3, 3, 3} // fill-array
            defpackage.dy7.d = r0
            return
    }

    @Override // defpackage.di6
    public int a(byte[] r12, int r13, int r14) {
            r11 = this;
            int r0 = r13 + (-1)
            int r14 = r14 + r13
            int r14 = r14 + (-5)
            r1 = r13
        L6:
            r2 = 0
            r3 = 1
            if (r1 > r14) goto Lab
            r4 = r12[r1]
            r4 = r4 & 254(0xfe, float:3.56E-43)
            r5 = 232(0xe8, float:3.25E-43)
            if (r4 == r5) goto L14
            goto La1
        L14:
            int r0 = r1 - r0
            r4 = r0 & (-4)
            r5 = 255(0xff, float:3.57E-43)
            int[] r6 = defpackage.dy7.d
            if (r4 == 0) goto L21
            r11.b = r2
            goto L45
        L21:
            int r2 = r11.b
            int r0 = r0 + (-1)
            int r0 = r2 << r0
            r0 = r0 & 7
            r11.b = r0
            if (r0 == 0) goto L45
            boolean[] r2 = defpackage.dy7.c
            boolean r2 = r2[r0]
            if (r2 == 0) goto L3f
            int r2 = r1 + 4
            r4 = r6[r0]
            int r2 = r2 - r4
            r2 = r12[r2]
            r2 = r2 & r5
            if (r2 == 0) goto L3f
            if (r2 != r5) goto L45
        L3f:
            int r0 = r0 << 1
            r0 = r0 | r3
            r11.b = r0
            goto L56
        L45:
            int r4 = r1 + 4
            r0 = r12[r4]
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L58
            if (r2 != r5) goto L50
            goto L58
        L50:
            int r0 = r11.b
            int r0 = r0 << r3
            r0 = r0 | r3
            r11.b = r0
        L56:
            r0 = r1
            goto La1
        L58:
            int r7 = r1 + 1
            r2 = r12[r7]
            r2 = r2 & r5
            int r8 = r1 + 2
            r9 = r12[r8]
            r9 = r9 & r5
            int r9 = r9 << 8
            r2 = r2 | r9
            int r9 = r1 + 3
            r10 = r12[r9]
            r10 = r10 & r5
            int r10 = r10 << 16
            r2 = r2 | r10
            int r0 = r0 << 24
            r0 = r0 | r2
        L70:
            int r2 = r11.a
            int r2 = r2 + r1
            int r2 = r2 - r13
            int r0 = r0 - r2
            int r2 = r11.b
            if (r2 != 0) goto L7a
            goto L89
        L7a:
            r2 = r6[r2]
            int r2 = r2 * 8
            int r10 = 24 - r2
            int r10 = r0 >>> r10
            byte r10 = (byte) r10
            r10 = r10 & r5
            if (r10 == 0) goto La4
            if (r10 != r5) goto L89
            goto La4
        L89:
            int r0 = r0 << 7
            int r0 = r0 >> 7
            byte r2 = (byte) r0
            r12[r7] = r2
            int r2 = r0 >>> 8
            byte r2 = (byte) r2
            r12[r8] = r2
            int r2 = r0 >>> 16
            byte r2 = (byte) r2
            r12[r9] = r2
            int r0 = r0 >>> 24
            byte r0 = (byte) r0
            r12[r4] = r0
            r0 = r1
            r1 = r4
        La1:
            int r1 = r1 + r3
            goto L6
        La4:
            int r2 = 32 - r2
            int r2 = r3 << r2
            int r2 = r2 - r3
            r0 = r0 ^ r2
            goto L70
        Lab:
            int r12 = r1 - r0
            r14 = r12 & (-4)
            if (r14 == 0) goto Lb2
            goto Lb7
        Lb2:
            int r14 = r11.b
            int r12 = r12 - r3
            int r2 = r14 << r12
        Lb7:
            r11.b = r2
            int r1 = r1 - r13
            int r12 = r11.a
            int r12 = r12 + r1
            r11.a = r12
            return r1
    }

    public void b(defpackage.wg5 r2) {
            r1 = this;
            android.view.View r2 = r2.a
            int r0 = r2.getLeft()
            r1.a = r0
            int r0 = r2.getTop()
            r1.b = r0
            r2.getRight()
            r2.getBottom()
            return
    }
}
