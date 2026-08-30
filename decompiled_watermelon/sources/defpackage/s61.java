package defpackage;

import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s61  reason: default package */
/* loaded from: classes.dex */
public final class s61 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ w61 Z;
    public final /* synthetic */ DSiWareTitle c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s61(w61 w61Var, DSiWareTitle dSiWareTitle, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = w61Var;
        this.c0 = dSiWareTitle;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((s61) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((s61) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new s61(this.Z, this.c0, j11Var, 0);
            default:
                return new s61(this.Z, this.c0, j11Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r10.e(r2, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r10 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return r0;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.X
            o27 r1 = defpackage.o27.a
            me.magnum.melonds.domain.model.DSiWareTitle r2 = r9.c0
            w61 r3 = r9.Z
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L35;
                default: goto Lf;
            }
        Lf:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto L20
            if (r7 != r5) goto L1b
            defpackage.me2.a0(r10)
            goto L34
        L1b:
            defpackage.i.n(r4)
            r1 = r6
            goto L34
        L20:
            defpackage.me2.a0(r10)
            bb1 r10 = defpackage.tg1.a
            s61 r4 = new s61
            r7 = 0
            r4.<init>(r3, r2, r6, r7)
            r9.Y = r5
            java.lang.Object r9 = defpackage.tq5.G(r10, r4, r9)
            if (r9 != r0) goto L34
            r1 = r0
        L34:
            return r1
        L35:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r7 = r9.Y
            r8 = 2
            if (r7 == 0) goto L4d
            if (r7 == r5) goto L49
            if (r7 != r8) goto L44
            defpackage.me2.a0(r10)
            goto L67
        L44:
            defpackage.i.n(r4)
            r1 = r6
            goto L76
        L49:
            defpackage.me2.a0(r10)
            goto L5b
        L4d:
            defpackage.me2.a0(r10)
            qf r10 = r3.b
            r9.Y = r5
            java.lang.Object r10 = r10.e(r2, r9)
            if (r10 != r0) goto L5b
            goto L65
        L5b:
            qf r10 = r3.b
            r9.Y = r8
            java.io.Serializable r10 = r10.l(r9)
            if (r10 != r0) goto L67
        L65:
            r1 = r0
            goto L76
        L67:
            java.util.List r10 = (java.util.List) r10
            ee6 r9 = r3.e
            q61 r0 = new q61
            r0.<init>(r10)
            r9.getClass()
            r9.l(r6, r0)
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s61.v(java.lang.Object):java.lang.Object");
    }
}
