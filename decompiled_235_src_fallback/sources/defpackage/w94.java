package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w94  reason: default package */
/* loaded from: classes.dex */
public final class w94 extends defpackage.t04 implements defpackage.bg3 {
    public final defpackage.dw4 R;
    public java.lang.Object X;

    public w94(defpackage.dw4 r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r3, r4)
            r1.R = r2
            r1.X = r4
            return
    }

    @Override // defpackage.t04, java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.X
            return r0
    }

    @Override // defpackage.t04, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = r5.X
            r5.X = r6
            dw4 r1 = r5.R
            java.util.Iterator r1 = r1.B
            bw4 r1 = (defpackage.bw4) r1
            aw4 r2 = r1.R
            java.lang.Object r5 = r5.B
            boolean r3 = r2.containsKey(r5)
            if (r3 != 0) goto L15
            return r0
        L15:
            boolean r3 = r1.L
            if (r3 == 0) goto L3e
            if (r3 == 0) goto L39
            bc7[] r3 = r1.A
            int r4 = r1.B
            r3 = r3[r4]
            java.lang.Object[] r4 = r3.A
            int r3 = r3.L
            r3 = r4[r3]
            r2.put(r5, r6)
            r5 = 0
            if (r3 == 0) goto L32
            int r6 = r3.hashCode()
            goto L33
        L32:
            r6 = r5
        L33:
            ac7 r4 = r2.L
            r1.c(r6, r4, r3, r5)
            goto L41
        L39:
            defpackage.fa6.c()
            r5 = 0
            return r5
        L3e:
            r2.put(r5, r6)
        L41:
            int r5 = r2.X
            r1.Z = r5
            return r0
    }
}
