package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: la6  reason: default package */
/* loaded from: classes.dex */
public final class la6 extends dm5 implements eo2 {
    public final /* synthetic */ int L = 0;
    public long R;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la6(long j, ch5 ch5Var, r41 r41Var) {
        super(2, r41Var);
        this.R = j;
        this.Z = ch5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.L;
        jg7 jg7Var = jg7.a;
        mw6 mw6Var = (mw6) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((la6) q(r41Var, mw6Var)).s(jg7Var);
            default:
                return ((la6) q(r41Var, mw6Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.L;
        Object obj2 = this.Z;
        switch (i) {
            case 0:
                la6 la6Var = new la6(this.R, (ch5) obj2, r41Var);
                la6Var.Y = obj;
                return la6Var;
            default:
                la6 la6Var2 = new la6((vy4) obj2, r41Var);
                la6Var2.Y = obj;
                return la6Var2;
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
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s(java.lang.Object r9) {
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
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r8.X
            if (r5 == 0) goto L21
            if (r5 != r4) goto L1d
            long r1 = r8.R
            java.lang.Object r3 = r8.Y
            mw6 r3 = (defpackage.mw6) r3
            defpackage.oi2.Y(r9)
            goto L47
        L1d:
            defpackage.i.m(r3)
            goto L50
        L21:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Y
            mw6 r9 = (defpackage.mw6) r9
            vy4 r1 = (defpackage.vy4) r1
            long r1 = r1.b
            fo7 r3 = r9.f()
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
            java.lang.Object r9 = defpackage.hz6.b(r3, r8, r9)
            if (r9 != r0) goto L47
            r2 = r0
            goto L50
        L47:
            vy4 r9 = (defpackage.vy4) r9
            long r5 = r9.b
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 < 0) goto L38
            r2 = r9
        L50:
            return r2
        L51:
            ch5 r1 = (defpackage.ch5) r1
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r8.X
            if (r5 == 0) goto L67
            if (r5 != r4) goto L63
            java.lang.Object r8 = r8.Y
            mw6 r8 = (defpackage.mw6) r8
            defpackage.oi2.Y(r9)
            goto L85
        L63:
            defpackage.i.m(r3)
            goto Lb7
        L67:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Y
            mw6 r9 = (defpackage.mw6) r9
            long r2 = r8.R
            y36 r5 = new y36
            r6 = 2
            r5.<init>(r1, r6)
            r8.Y = r9
            r8.X = r4
            java.lang.Object r8 = defpackage.sn1.c(r9, r2, r5, r8)
            if (r8 != r0) goto L82
            r2 = r0
            goto Lb7
        L82:
            r7 = r9
            r9 = r8
            r8 = r7
        L85:
            vy4 r9 = (defpackage.vy4) r9
            if (r9 == 0) goto L9d
            long r0 = r1.A
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L9d
            im1 r2 = defpackage.im1.Drag
            goto Lb7
        L9d:
            ow6 r8 = r8.Y
            oy4 r8 = r8.p0
            java.util.List r8 = r8.a
            java.lang.Object r8 = defpackage.gt0.H0(r8)
            vy4 r8 = (defpackage.vy4) r8
            boolean r9 = defpackage.ej2.p(r8)
            if (r9 == 0) goto Lb5
            r8.a()
            im1 r2 = defpackage.im1.Up
            goto Lb7
        Lb5:
            im1 r2 = defpackage.im1.Cancel
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la6.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la6(vy4 vy4Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = vy4Var;
    }
}
