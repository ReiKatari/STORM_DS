package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jf0  reason: default package */
/* loaded from: classes.dex */
public final class jf0 {
    public final defpackage.u63 a;

    public jf0() {
            r2 = this;
            r2.<init>()
            u63 r0 = new u63
            r1 = 18
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public final defpackage.if0 a(android.content.Context r9, defpackage.ux r10, defpackage.mh0 r11, long r12, defpackage.ij0 r14, defpackage.rr6 r15) {
            r8 = this;
            r9.getClass()
            r0 = -1
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb
            r12 = 0
            goto L11
        Lb:
            sq1 r0 = new sq1
            r0.<init>(r12)
            r12 = r0
        L11:
            hf0 r13 = new hf0
            r13.<init>(r8, r9, r10, r12)
            ex6 r1 = new ex6
            r1.<init>(r13)
            if0 r0 = new if0
            if (r14 != 0) goto L30
            jd0 r12 = new jd0
            r13 = 1
            r12.<init>(r13)
            ij0 r14 = new ij0
            da4 r12 = r12.B
            go4 r12 = defpackage.go4.a(r12)
            r14.<init>(r12)
        L30:
            r7 = r14
            u63 r4 = r8.a
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
