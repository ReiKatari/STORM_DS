package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dj6  reason: default package */
/* loaded from: classes.dex */
public abstract class dj6 {
    public static final defpackage.lc2 a = null;
    public static final defpackage.lc2 b = null;
    public static final defpackage.lc2 c = null;
    public static final defpackage.tx7 d = null;
    public static final defpackage.tx7 e = null;

    static {
            lc2 r0 = new lc2
            wj1 r1 = defpackage.wj1.Horizontal
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2)
            defpackage.dj6.a = r0
            lc2 r0 = new lc2
            wj1 r1 = defpackage.wj1.Vertical
            r0.<init>(r1, r2)
            defpackage.dj6.b = r0
            lc2 r0 = new lc2
            wj1 r1 = defpackage.wj1.Both
            r0.<init>(r1, r2)
            defpackage.dj6.c = r0
            e40 r0 = defpackage.d90.Z
            tx7 r2 = new tx7
            y36 r3 = new y36
            r4 = 14
            r3.<init>(r0, r4)
            r2.<init>(r1, r3, r0)
            defpackage.dj6.d = r2
            e40 r0 = defpackage.d90.L
            tx7 r2 = new tx7
            y36 r3 = new y36
            r3.<init>(r0, r4)
            r2.<init>(r1, r3, r0)
            defpackage.dj6.e = r2
            return
    }

    public static final defpackage.a74 a(defpackage.a74 r1, float r2, float r3) {
            ih7 r0 = new ih7
            r0.<init>(r2, r3)
            a74 r1 = r1.d(r0)
            return r1
    }

    public static final defpackage.a74 b(defpackage.a74 r2, float r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            lc2 r3 = defpackage.dj6.b
            goto L11
        L9:
            lc2 r0 = new lc2
            wj1 r1 = defpackage.wj1.Vertical
            r0.<init>(r1, r3)
            r3 = r0
        L11:
            a74 r2 = r2.d(r3)
            return r2
    }

    public static final defpackage.a74 c(defpackage.a74 r2, float r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            lc2 r3 = defpackage.dj6.a
            goto L11
        L9:
            lc2 r0 = new lc2
            wj1 r1 = defpackage.wj1.Horizontal
            r0.<init>(r1, r3)
            r3 = r0
        L11:
            a74 r2 = r2.d(r3)
            return r2
    }

    public static /* synthetic */ defpackage.a74 d(defpackage.a74 r1) {
            r0 = 1065353216(0x3f800000, float:1.0)
            a74 r1 = c(r1, r0)
            return r1
    }

    public static final defpackage.a74 e(defpackage.a74 r6, float r7) {
            cj6 r0 = new cj6
            r3 = 0
            r5 = 5
            r1 = 0
            r4 = r7
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            a74 r6 = r6.d(r0)
            return r6
    }

    public static defpackage.a74 f(defpackage.a74 r8, float r9, float r10, int r11) {
            r0 = r11 & 1
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L8
            r4 = r1
            goto L9
        L8:
            r4 = r9
        L9:
            r9 = r11 & 2
            if (r9 == 0) goto Lf
            r6 = r1
            goto L10
        Lf:
            r6 = r10
        L10:
            cj6 r2 = new cj6
            r5 = 0
            r7 = 5
            r3 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            a74 r8 = r8.d(r2)
            return r8
    }

    public static final defpackage.a74 g(defpackage.a74 r6) {
            cj6 r0 = new cj6
            r5 = 0
            r1 = 1101004800(0x41a00000, float:20.0)
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            a74 r6 = r6.d(r0)
            return r6
    }

    public static defpackage.a74 h(defpackage.a74 r8, float r9, float r10, float r11, float r12, int r13) {
            r0 = r13 & 2
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L8
            r4 = r1
            goto L9
        L8:
            r4 = r10
        L9:
            r10 = r13 & 4
            if (r10 == 0) goto Lf
            r5 = r1
            goto L10
        Lf:
            r5 = r11
        L10:
            r10 = r13 & 8
            if (r10 == 0) goto L16
            r6 = r1
            goto L17
        L16:
            r6 = r12
        L17:
            cj6 r2 = new cj6
            r7 = 0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            a74 r8 = r8.d(r2)
            return r8
    }

    public static final defpackage.a74 i(defpackage.a74 r6, float r7) {
            cj6 r0 = new cj6
            r5 = 1
            r2 = r7
            r3 = r7
            r4 = r7
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            a74 r6 = r6.d(r0)
            return r6
    }

    public static final defpackage.a74 j(defpackage.a74 r6, float r7, float r8) {
            cj6 r0 = new cj6
            r5 = 1
            r3 = r7
            r4 = r8
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            a74 r6 = r6.d(r0)
            return r6
    }

    public static final defpackage.a74 k(defpackage.a74 r6, float r7, float r8, float r9, float r10) {
            cj6 r0 = new cj6
            r5 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            a74 r6 = r6.d(r0)
            return r6
    }

    public static final defpackage.a74 l(defpackage.a74 r6, float r7) {
            cj6 r0 = new cj6
            r4 = 0
            r5 = 10
            r2 = 0
            r3 = r7
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            a74 r6 = r6.d(r0)
            return r6
    }

    public static defpackage.a74 m(float r8, int r9, defpackage.a74 r10) {
            r0 = r9 & 1
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L8
            r3 = r1
            goto Lb
        L8:
            r0 = 1125122048(0x43100000, float:144.0)
            r3 = r0
        Lb:
            r9 = r9 & 2
            if (r9 == 0) goto L11
            r5 = r1
            goto L12
        L11:
            r5 = r8
        L12:
            cj6 r2 = new cj6
            r6 = 0
            r7 = 10
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            a74 r8 = r10.d(r2)
            return r8
    }

    public static defpackage.a74 n(defpackage.a74 r3, defpackage.e40 r4, int r5) {
            e40 r0 = defpackage.d90.Z
            r5 = r5 & 1
            if (r5 == 0) goto L7
            r4 = r0
        L7:
            boolean r5 = r4.equals(r0)
            if (r5 == 0) goto L10
            tx7 r4 = defpackage.dj6.d
            goto L2a
        L10:
            e40 r5 = defpackage.d90.L
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L1b
            tx7 r4 = defpackage.dj6.e
            goto L2a
        L1b:
            tx7 r5 = new tx7
            wj1 r0 = defpackage.wj1.Both
            y36 r1 = new y36
            r2 = 14
            r1.<init>(r4, r2)
            r5.<init>(r0, r1, r4)
            r4 = r5
        L2a:
            a74 r3 = r3.d(r4)
            return r3
    }
}
