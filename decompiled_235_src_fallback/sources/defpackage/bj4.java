package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: bj4  reason: default package */
/* loaded from: classes.dex */
public final class bj4 {
    public static final defpackage.aj4 Companion = null;
    public final defpackage.yi4 a;
    public final byte[] b;
    public final byte[] c;

    static {
            aj4 r0 = new aj4
            r0.<init>()
            defpackage.bj4.Companion = r0
            return
    }

    public /* synthetic */ bj4(int r27, defpackage.yi4 r28, byte[] r29, byte[] r30) {
            r26 = this;
            r0 = r26
            r0.<init>()
            r1 = r27 & 1
            if (r1 != 0) goto L2d
            yi4 r2 = new yi4
            r24 = 0
            r25 = 131071(0x1ffff, float:1.8367E-40)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r2.<init>(r3, r4, r5, r6, r8, r10, r11, r12, r14, r16, r18, r20, r22, r23, r24, r25)
            r0.a = r2
            goto L31
        L2d:
            r1 = r28
            r0.a = r1
        L31:
            r1 = r27 & 2
            r2 = 0
            if (r1 != 0) goto L3b
            byte[] r1 = new byte[r2]
            r0.b = r1
            goto L3f
        L3b:
            r1 = r29
            r0.b = r1
        L3f:
            r1 = r27 & 4
            if (r1 != 0) goto L48
            byte[] r1 = new byte[r2]
            r0.c = r1
            return
        L48:
            r1 = r30
            r0.c = r1
            return
    }

    public bj4(defpackage.yi4 r1, byte[] r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.bj4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            bj4 r5 = (defpackage.bj4) r5
            yi4 r1 = r4.a
            yi4 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            byte[] r1 = r4.b
            byte[] r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            byte[] r4 = r4.c
            byte[] r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            yi4 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            byte[] r1 = r2.b
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            byte[] r2 = r2.c
            int r2 = java.util.Arrays.hashCode(r2)
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            byte[] r0 = r4.b
            java.lang.String r0 = java.util.Arrays.toString(r0)
            byte[] r1 = r4.c
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "OfflineLedgerRecord(payload="
            r2.<init>(r3)
            yi4 r4 = r4.a
            r2.append(r4)
            java.lang.String r4 = ", payloadHash="
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = ", signature="
            r2.append(r4)
            java.lang.String r4 = ")"
            java.lang.String r4 = defpackage.i61.n(r2, r1, r4)
            return r4
    }
}
