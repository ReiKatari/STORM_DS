package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: my6  reason: default package */
/* loaded from: classes.dex */
public final class my6 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ sy6 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my6(sy6 sy6Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = sy6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((my6) t((j11) obj2, (zj4) obj)).v(o27Var);
            default:
                return ((my6) t((j11) obj2, (qw6) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        sy6 sy6Var = this.c0;
        switch (i) {
            case 0:
                my6 my6Var = new my6(sy6Var, j11Var, 0);
                my6Var.Z = obj;
                return my6Var;
            default:
                my6 my6Var2 = new my6(sy6Var, j11Var, 1);
                my6Var2.Z = obj;
                return my6Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return r0;
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
            sy6 r1 = r7.c0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L5d;
                default: goto Lb;
            }
        Lb:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r7.Y
            r6 = 2
            if (r5 == 0) goto L26
            if (r5 == r3) goto L1e
            if (r5 != r6) goto L1a
            defpackage.me2.a0(r8)     // Catch: android.database.SQLException -> L5a
            goto L56
        L1a:
            defpackage.i.n(r2)
            goto L5c
        L1e:
            java.lang.Object r2 = r7.Z
            qw6 r2 = (defpackage.qw6) r2
            defpackage.me2.a0(r8)
            goto L39
        L26:
            defpackage.me2.a0(r8)
            java.lang.Object r8 = r7.Z
            r2 = r8
            qw6 r2 = (defpackage.qw6) r2
            r7.Z = r2
            r7.Y = r3
            java.lang.Boolean r8 = r2.d(r7)
            if (r8 != r0) goto L39
            goto L54
        L39:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L42
            goto L5a
        L42:
            pw6 r8 = defpackage.pw6.IMMEDIATE     // Catch: android.database.SQLException -> L5a
            my6 r3 = new my6     // Catch: android.database.SQLException -> L5a
            r5 = 0
            r3.<init>(r1, r4, r5)     // Catch: android.database.SQLException -> L5a
            r7.Z = r4     // Catch: android.database.SQLException -> L5a
            r7.Y = r6     // Catch: android.database.SQLException -> L5a
            java.lang.Object r8 = r2.a(r8, r3, r7)     // Catch: android.database.SQLException -> L5a
            if (r8 != r0) goto L56
        L54:
            r4 = r0
            goto L5c
        L56:
            r4 = r8
            java.util.Set r4 = (java.util.Set) r4     // Catch: android.database.SQLException -> L5a
            goto L5c
        L5a:
            up1 r4 = defpackage.up1.A
        L5c:
            return r4
        L5d:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r7.Y
            if (r5 == 0) goto L6e
            if (r5 != r3) goto L69
            defpackage.me2.a0(r8)
            goto L7e
        L69:
            defpackage.i.n(r2)
            r8 = r4
            goto L7e
        L6e:
            defpackage.me2.a0(r8)
            java.lang.Object r8 = r7.Z
            zj4 r8 = (defpackage.zj4) r8
            r7.Y = r3
            java.lang.Object r8 = defpackage.sy6.a(r1, r8, r7)
            if (r8 != r0) goto L7e
            r8 = r0
        L7e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my6.v(java.lang.Object):java.lang.Object");
    }
}
