package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vh4  reason: default package */
/* loaded from: classes.dex */
public final class vh4 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ ya1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh4(ya1 ya1Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = ya1Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((vh4) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((vh4) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((vh4) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        ya1 ya1Var = this.Z;
        switch (i) {
            case 0:
                return new vh4(ya1Var, j11Var, 0);
            case 1:
                return new vh4(ya1Var, j11Var, 1);
            default:
                return new vh4(ya1Var, j11Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        r7 = r1.f(r1.k() + 1, defpackage.ct3.P0(androidx.recyclerview.widget.RecyclerView.A1, androidx.recyclerview.widget.RecyclerView.A1, null, 7), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
        r7 = r1.f(r1.k() - 1, defpackage.ct3.P0(androidx.recyclerview.widget.RecyclerView.A1, androidx.recyclerview.widget.RecyclerView.A1, null, 7), r7);
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.X
            ya1 r1 = r7.Z
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            o27 r4 = defpackage.o27.a
            r5 = 0
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L39;
                default: goto Ld;
            }
        Ld:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L1e
            if (r6 != r3) goto L19
            defpackage.me2.a0(r8)
            goto L38
        L19:
            defpackage.i.n(r2)
            r4 = r5
            goto L38
        L1e:
            defpackage.me2.a0(r8)
            r7.Y = r3
            r24 r8 = defpackage.r24.Default
            jg r2 = new jg
            r3 = 2
            r6 = 8
            r2.<init>(r3, r6, r5)
            java.lang.Object r7 = defpackage.ki4.s(r1, r8, r2, r7)
            if (r7 != r0) goto L34
            goto L35
        L34:
            r7 = r4
        L35:
            if (r7 != r0) goto L38
            r4 = r0
        L38:
            return r4
        L39:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L4a
            if (r6 != r3) goto L45
            defpackage.me2.a0(r8)
            goto L6c
        L45:
            defpackage.i.n(r2)
            r4 = r5
            goto L6c
        L4a:
            defpackage.me2.a0(r8)
            r7.Y = r3
            mi4 r8 = defpackage.ni4.a
            int r8 = r1.k()
            int r8 = r8 + r3
            int r2 = r1.n()
            if (r8 >= r2) goto L68
            int r8 = r1.k()
            int r8 = r8 + r3
            java.lang.Object r7 = defpackage.ki4.g(r1, r8, r7)
            if (r7 != r0) goto L68
            goto L69
        L68:
            r7 = r4
        L69:
            if (r7 != r0) goto L6c
            r4 = r0
        L6c:
            return r4
        L6d:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L7e
            if (r6 != r3) goto L79
            defpackage.me2.a0(r8)
            goto L9c
        L79:
            defpackage.i.n(r2)
            r4 = r5
            goto L9c
        L7e:
            defpackage.me2.a0(r8)
            r7.Y = r3
            mi4 r8 = defpackage.ni4.a
            int r8 = r1.k()
            int r8 = r8 - r3
            if (r8 < 0) goto L98
            int r8 = r1.k()
            int r8 = r8 - r3
            java.lang.Object r7 = defpackage.ki4.g(r1, r8, r7)
            if (r7 != r0) goto L98
            goto L99
        L98:
            r7 = r4
        L99:
            if (r7 != r0) goto L9c
            r4 = r0
        L9c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh4.v(java.lang.Object):java.lang.Object");
    }
}
