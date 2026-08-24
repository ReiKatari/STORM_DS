package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jy2  reason: default package */
/* loaded from: classes.dex */
public final class jy2 implements defpackage.ke6 {
    public static final defpackage.jy2 b = null;
    public static final defpackage.jy2 c = null;
    public final /* synthetic */ int a;

    static {
            jy2 r0 = new jy2
            r1 = 0
            r0.<init>(r1)
            defpackage.jy2.b = r0
            jy2 r0 = new jy2
            r1 = 1
            r0.<init>(r1)
            defpackage.jy2.c = r0
            return
    }

    public /* synthetic */ jy2(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ke6
    public final defpackage.mp2 a(long r8, defpackage.kk3 r10, defpackage.qh1 r11) {
            r7 = this;
            int r7 = r7.a
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            r2 = 0
            r3 = 1106247680(0x41f00000, float:30.0)
            switch(r7) {
                case 0: goto L3b;
                case 1: goto L1b;
                default: goto Lf;
            }
        Lf:
            qo4 r7 = new qo4
            r10 = 0
            of5 r8 = defpackage.kj2.b(r10, r8)
            r7.<init>(r8)
            return r7
        L1b:
            int r7 = r11.r0(r3)
            float r7 = (float) r7
            qo4 r11 = new qo4
            of5 r3 = new of5
            float r4 = -r7
            long r5 = r8 >> r10
            int r10 = (int) r5
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 + r7
            long r7 = r8 & r0
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r3.<init>(r4, r2, r10, r7)
            r11.<init>(r3)
            return r11
        L3b:
            int r7 = r11.r0(r3)
            float r7 = (float) r7
            qo4 r11 = new qo4
            of5 r3 = new of5
            float r4 = -r7
            long r5 = r8 >> r10
            int r10 = (int) r5
            float r10 = java.lang.Float.intBitsToFloat(r10)
            long r8 = r8 & r0
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 + r7
            r3.<init>(r2, r4, r10, r8)
            r11.<init>(r3)
            return r11
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "RectangleShape"
            return r1
    }
}
