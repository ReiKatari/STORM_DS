package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u84  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u84 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ u84(int r2, int r3, int[] r4) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    public /* synthetic */ u84(java.lang.Object r1, int r2, int r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.R = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.A
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            int r5 = r11.L
            int r6 = r11.B
            java.lang.Object r11 = r11.R
            switch(r0) {
                case 0: goto L96;
                case 1: goto L33;
                default: goto L13;
            }
        L13:
            qn2 r11 = (defpackage.qn2) r11
            sh2 r12 = (defpackage.sh2) r12
            r12.getClass()
            boolean r12 = r12.isFocused()
            if (r12 == 0) goto L28
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11.g(r12)
            goto L32
        L28:
            if (r5 != r6) goto L32
            r12 = -1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.g(r12)
        L32:
            return r4
        L33:
            int[] r11 = (int[]) r11
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            r12.getClass()
            java.lang.Object r0 = r12.getKey()
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r12 = r12.getValue()
            r12.getClass()
            vr4 r12 = (defpackage.vr4) r12
            java.lang.Object r4 = r12.A
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r7 = r6 + (-1)
            int r4 = defpackage.gi2.q(r4, r3, r7)
            java.lang.Object r12 = r12.B
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            int r5 = r5 + (-1)
            int r12 = defpackage.gi2.q(r12, r3, r5)
            int r12 = r12 * r6
            int r12 = r12 + r4
            if (r12 < 0) goto L8d
            int r3 = r11.length
            if (r12 >= r3) goto L8d
            r11 = r11[r12]
            long r11 = (long) r11
            long r11 = r11 & r1
            java.lang.String r11 = java.lang.Long.toHexString(r11)
            r11.getClass()
            r12 = 8
            java.lang.String r11 = defpackage.qs6.B0(r12, r11)
            java.util.Locale r12 = java.util.Locale.US
            r12.getClass()
            java.lang.String r11 = r11.toUpperCase(r12)
            r11.getClass()
            goto L8f
        L8d:
            java.lang.String r11 = "out"
        L8f:
            java.lang.String r12 = ":"
            java.lang.String r11 = defpackage.lb1.m(r0, r12, r11)
            return r11
        L96:
            hj r11 = (defpackage.hj) r11
            yr4 r12 = (defpackage.yr4) r12
            cj r0 = r12.a
            int r6 = r12.d(r6)
            int r5 = r12.d(r5)
            java.lang.CharSequence r7 = r0.e
            if (r6 < 0) goto Lb1
            if (r6 > r5) goto Lb1
            int r8 = r7.length()
            if (r5 > r8) goto Lb1
            goto Lce
        Lb1:
            java.lang.String r8 = ") or end("
            java.lang.String r9 = ") is out of range [0.."
            java.lang.String r10 = "start("
            java.lang.StringBuilder r8 = defpackage.i61.q(r6, r5, r10, r8, r9)
            int r7 = r7.length()
            r8.append(r7)
            java.lang.String r7 = "], or start > end!"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            defpackage.q53.a(r7)
        Lce:
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            y37 r0 = r0.d
            android.text.Layout r8 = r0.f
            r8.getSelectionPath(r6, r5, r7)
            int r0 = r0.h
            r5 = 0
            if (r0 == 0) goto Le9
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto Le9
            float r0 = (float) r0
            r7.offset(r5, r0)
        Le9:
            float r12 = r12.f
            int r0 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r0
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r8 = (long) r12
            r12 = 32
            long r5 = r5 << r12
            long r8 = r8 & r1
            long r5 = r5 | r8
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            long r8 = r5 >> r12
            int r12 = (int) r8
            float r12 = java.lang.Float.intBitsToFloat(r12)
            long r1 = r1 & r5
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.setTranslate(r12, r1)
            r7.transform(r0)
            android.graphics.Path r11 = r11.a
            float r12 = java.lang.Float.intBitsToFloat(r3)
            float r0 = java.lang.Float.intBitsToFloat(r3)
            r11.addPath(r7, r12, r0)
            return r4
    }
}
