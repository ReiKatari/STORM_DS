package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wy5  reason: default package */
/* loaded from: classes.dex */
public final class wy5 extends jc5 implements aj2 {
    public final /* synthetic */ int L = 0;
    public long R;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy5(long j, m75 m75Var, j11 j11Var) {
        super(2, j11Var);
        this.R = j;
        this.Z = m75Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.L;
        o27 o27Var = o27.a;
        sk6 sk6Var = (sk6) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((wy5) t(j11Var, sk6Var)).v(o27Var);
            default:
                return ((wy5) t(j11Var, sk6Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.L;
        Object obj2 = this.Z;
        switch (i) {
            case 0:
                wy5 wy5Var = new wy5(this.R, (m75) obj2, j11Var);
                wy5Var.Y = obj;
                return wy5Var;
            default:
                wy5 wy5Var2 = new wy5((rp4) obj2, j11Var);
                wy5Var2.Y = obj;
                return wy5Var2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.L
            java.lang.Object r1 = r8.Z
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Lb;
            }
        Lb:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r8.X
            if (r5 == 0) goto L21
            if (r5 != r4) goto L1d
            long r1 = r8.R
            java.lang.Object r3 = r8.Y
            sk6 r3 = (defpackage.sk6) r3
            defpackage.me2.a0(r9)
            goto L47
        L1d:
            defpackage.i.n(r3)
            goto L50
        L21:
            defpackage.me2.a0(r9)
            java.lang.Object r9 = r8.Y
            sk6 r9 = (defpackage.sk6) r9
            rp4 r1 = (defpackage.rp4) r1
            long r1 = r1.b
            fa7 r3 = r9.f()
            r3.getClass()
            r5 = 40
            long r5 = r5 + r1
            r3 = r9
            r1 = r5
        L38:
            r8.Y = r3
            r8.R = r1
            r8.X = r4
            r9 = 3
            java.lang.Object r9 = defpackage.xm6.b(r3, r8, r9)
            if (r9 != r0) goto L47
            r2 = r0
            goto L50
        L47:
            rp4 r9 = (defpackage.rp4) r9
            long r5 = r9.b
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 < 0) goto L38
            r2 = r9
        L50:
            return r2
        L51:
            m75 r1 = (defpackage.m75) r1
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r8.X
            if (r5 == 0) goto L67
            if (r5 != r4) goto L63
            java.lang.Object r8 = r8.Y
            sk6 r8 = (defpackage.sk6) r8
            defpackage.me2.a0(r9)
            goto L85
        L63:
            defpackage.i.n(r3)
            goto Lb7
        L67:
            defpackage.me2.a0(r9)
            java.lang.Object r9 = r8.Y
            sk6 r9 = (defpackage.sk6) r9
            long r2 = r8.R
            bt5 r5 = new bt5
            r6 = 2
            r5.<init>(r6, r1)
            r8.Y = r9
            r8.X = r4
            java.lang.Object r8 = defpackage.mj1.c(r9, r2, r5, r8)
            if (r8 != r0) goto L82
            r2 = r0
            goto Lb7
        L82:
            r7 = r9
            r9 = r8
            r8 = r7
        L85:
            rp4 r9 = (defpackage.rp4) r9
            if (r9 == 0) goto L9d
            long r0 = r1.A
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L9d
            di1 r2 = defpackage.di1.Drag
            goto Lb7
        L9d:
            uk6 r8 = r8.Y
            kp4 r8 = r8.o0
            java.util.List r8 = r8.a
            java.lang.Object r8 = defpackage.tq0.K0(r8)
            rp4 r8 = (defpackage.rp4) r8
            boolean r9 = defpackage.ve2.q(r8)
            if (r9 == 0) goto Lb5
            r8.a()
            di1 r2 = defpackage.di1.Up
            goto Lb7
        Lb5:
            di1 r2 = defpackage.di1.Cancel
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy5.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy5(rp4 rp4Var, j11 j11Var) {
        super(2, j11Var);
        this.Z = rp4Var;
    }
}
