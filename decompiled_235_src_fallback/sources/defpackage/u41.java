package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u41  reason: default package */
/* loaded from: classes.dex */
public final class u41 {
    public static final java.util.List c = null;
    public final defpackage.kk6 a;
    public final java.util.ArrayList b;

    static {
            b63 r1 = defpackage.b63.A
            b63 r2 = defpackage.b63.B
            b63 r3 = defpackage.b63.X
            b63 r4 = defpackage.b63.Y
            b63 r5 = defpackage.b63.LEFT
            b63 r6 = defpackage.b63.RIGHT
            b63 r7 = defpackage.b63.UP
            b63 r8 = defpackage.b63.DOWN
            b63 r9 = defpackage.b63.L
            b63 r10 = defpackage.b63.R
            b63 r11 = defpackage.b63.START
            b63 r12 = defpackage.b63.SELECT
            b63 r13 = defpackage.b63.HINGE
            b63 r14 = defpackage.b63.PAUSE
            b63 r15 = defpackage.b63.FAST_FORWARD
            b63 r16 = defpackage.b63.HOLD_FAST_FORWARD
            b63 r17 = defpackage.b63.MICROPHONE
            b63 r18 = defpackage.b63.RESET
            b63 r19 = defpackage.b63.SWAP_SCREENS
            b63 r20 = defpackage.b63.QUICK_SAVE
            b63 r21 = defpackage.b63.QUICK_LOAD
            b63 r22 = defpackage.b63.REWIND
            b63 r23 = defpackage.b63.TRANSLATE
            b63[] r0 = new defpackage.b63[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.u41.c = r0
            return
    }

    public /* synthetic */ u41(java.util.List r2) {
            r1 = this;
            kk6 r0 = new kk6
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public u41(java.util.List r7, defpackage.kk6 r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r6.<init>()
            r6.a = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            java.util.List r1 = defpackage.u41.c
            int r0 = defpackage.ht0.v0(r1, r0)
            r8.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()
            b63 r1 = (defpackage.b63) r1
            java.util.Iterator r2 = r7.iterator()
        L2c:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()
            r5 = r3
            i63 r5 = (defpackage.i63) r5
            b63 r5 = r5.a
            if (r5 != r1) goto L2c
            goto L40
        L3f:
            r3 = r4
        L40:
            i63 r3 = (defpackage.i63) r3
            if (r3 != 0) goto L4a
            i63 r3 = new i63
            r2 = 6
            r3.<init>(r1, r4, r2)
        L4a:
            r8.add(r3)
            goto L1c
        L4e:
            r6.b = r8
            return
    }

    public final defpackage.u41 a() {
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            java.util.ArrayList r2 = r14.b
            int r1 = defpackage.ht0.v0(r2, r1)
            r0.<init>(r1)
            int r1 = r2.size()
            r3 = 0
        L12:
            if (r3 >= r1) goto L26
            java.lang.Object r4 = r2.get(r3)
            int r3 = r3 + 1
            i63 r4 = (defpackage.i63) r4
            r5 = 7
            r6 = 0
            i63 r4 = defpackage.i63.a(r4, r6, r6, r5)
            r0.add(r4)
            goto L12
        L26:
            r12 = 0
            r13 = 127(0x7f, float:1.78E-43)
            kk6 r5 = r14.a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            kk6 r14 = defpackage.kk6.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            u41 r1 = new u41
            r1.<init>(r0, r14)
            return r1
    }
}
