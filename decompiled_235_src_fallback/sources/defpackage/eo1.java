package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo1  reason: default package */
/* loaded from: classes.dex */
public abstract class eo1 {
    public static final defpackage.do1 a = null;
    public static final defpackage.do1 b = null;

    static {
            do1 r0 = new do1
            r1 = 0
            r2 = 3
            r3 = 0
            r0.<init>(r2, r3, r1)
            defpackage.eo1.a = r0
            do1 r0 = new do1
            r1 = 1
            r0.<init>(r2, r3, r1)
            defpackage.eo1.b = r0
            return
    }

    public static defpackage.a74 a(defpackage.a74 r9, defpackage.go1 r10, defpackage.lo4 r11, boolean r12, defpackage.r94 r13, boolean r14, defpackage.fo2 r15, boolean r16) {
            co1 r0 = new co1
            do1 r6 = defpackage.eo1.a
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r15
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            a74 r9 = r9.d(r0)
            return r9
    }

    public static final long b(long r3) {
            float r0 = defpackage.ol7.b(r3)
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            r0 = r1
            goto L11
        Ld:
            float r0 = defpackage.ol7.b(r3)
        L11:
            float r2 = defpackage.ol7.c(r3)
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L1c
            goto L20
        L1c:
            float r1 = defpackage.ol7.c(r3)
        L20:
            long r3 = defpackage.qo2.k(r0, r1)
            return r3
    }
}
