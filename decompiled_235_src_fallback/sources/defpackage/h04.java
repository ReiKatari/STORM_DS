package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h04  reason: default package */
/* loaded from: classes.dex */
public final class h04 implements defpackage.f05 {
    public final defpackage.j41 a;
    public defpackage.q93 b;
    public defpackage.kk3 c;
    public defpackage.q93 d;
    public defpackage.i93 e;

    public h04(defpackage.j41 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.f05
    public final long a(defpackage.m93 r8, long r9, defpackage.kk3 r11, long r12) {
            r7 = this;
            i93 r0 = r7.e
            if (r0 == 0) goto L27
            q93 r1 = r7.b
            r2 = 0
            if (r1 != 0) goto Lb
            r1 = r2
            goto L11
        Lb:
            long r3 = r1.a
            boolean r1 = defpackage.q93.b(r3, r9)
        L11:
            if (r1 == 0) goto L27
            kk3 r1 = r7.c
            if (r1 != r11) goto L27
            q93 r1 = r7.d
            if (r1 != 0) goto L1c
            goto L22
        L1c:
            long r1 = r1.a
            boolean r2 = defpackage.q93.b(r1, r12)
        L22:
            if (r2 == 0) goto L27
            long r7 = r0.a
            return r7
        L27:
            j41 r0 = r7.a
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            long r8 = r0.a(r1, r2, r4, r5)
            q93 r10 = new q93
            r10.<init>(r2)
            r7.b = r10
            r7.c = r4
            q93 r10 = new q93
            r10.<init>(r5)
            r7.d = r10
            i93 r10 = new i93
            r10.<init>(r8)
            r7.e = r10
            return r8
    }
}
