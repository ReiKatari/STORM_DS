package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u61  reason: default package */
/* loaded from: classes.dex */
public final class u61 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ w61 Z;
    public final /* synthetic */ Uri c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u61(w61 w61Var, Uri uri, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = w61Var;
        this.c0 = uri;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((u61) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((u61) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Uri uri = this.c0;
        w61 w61Var = this.Z;
        switch (i) {
            case 0:
                return new u61(w61Var, uri, j11Var, 0);
            default:
                return new u61(w61Var, uri, j11Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r11 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r11 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        return r7;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.X
            o27 r1 = defpackage.o27.a
            android.net.Uri r2 = r10.c0
            w61 r3 = r10.Z
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L35;
                default: goto Lf;
            }
        Lf:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r7 = r10.Y
            if (r7 == 0) goto L20
            if (r7 != r5) goto L1b
            defpackage.me2.a0(r11)
            goto L34
        L1b:
            defpackage.i.n(r4)
            r1 = r6
            goto L34
        L20:
            defpackage.me2.a0(r11)
            bb1 r11 = defpackage.tg1.a
            u61 r4 = new u61
            r7 = 0
            r4.<init>(r3, r2, r6, r7)
            r10.Y = r5
            java.lang.Object r10 = defpackage.tq5.G(r11, r4, r10)
            if (r10 != r0) goto L34
            r1 = r0
        L34:
            return r1
        L35:
            qf r0 = r3.b
            p31 r7 = defpackage.p31.COROUTINE_SUSPENDED
            int r8 = r10.Y
            r9 = 2
            if (r8 == 0) goto L4f
            if (r8 == r5) goto L4b
            if (r8 != r9) goto L46
            defpackage.me2.a0(r11)
            goto L6b
        L46:
            defpackage.i.n(r4)
            r1 = r6
            goto L8a
        L4b:
            defpackage.me2.a0(r11)
            goto L5b
        L4f:
            defpackage.me2.a0(r11)
            r10.Y = r5
            java.lang.Enum r11 = r0.i(r2, r10)
            if (r11 != r7) goto L5b
            goto L69
        L5b:
            px2 r11 = (defpackage.px2) r11
            px2 r2 = defpackage.px2.SUCCESS
            if (r11 != r2) goto L7b
            r10.Y = r9
            java.io.Serializable r11 = r0.l(r10)
            if (r11 != r7) goto L6b
        L69:
            r1 = r7
            goto L8a
        L6b:
            java.util.List r11 = (java.util.List) r11
            ee6 r10 = r3.e
            q61 r0 = new q61
            r0.<init>(r11)
            r10.getClass()
            r10.l(r6, r0)
            goto L80
        L7b:
            c46 r10 = r3.i
            r10.p(r11)
        L80:
            ee6 r10 = r3.g
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.getClass()
            r10.l(r6, r11)
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u61.v(java.lang.Object):java.lang.Object");
    }
}
