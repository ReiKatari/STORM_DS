package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b0  reason: default package */
/* loaded from: classes.dex */
public final class b0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public long Y;
    public int Z;
    public Object c0;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(eo6 eo6Var, long j, jo6 jo6Var, do6 do6Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 4;
        this.c0 = eo6Var;
        this.Y = j;
        this.d0 = jo6Var;
        this.e0 = do6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((b0) t((j11) obj2, (o31) obj)).v(o27Var);
            case 1:
                return ((b0) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                return ((b0) t((j11) obj2, go4.j(obj))).v(o27Var);
            case 3:
                return ((b0) t((j11) obj2, (xw5) obj)).v(o27Var);
            case 4:
                return ((b0) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((b0) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        Object obj3 = this.d0;
        switch (i) {
            case 0:
                return new b0(0, this.Y, j11Var, (c63) obj3, (l14) obj2);
            case 1:
                b0 b0Var = new b0((hv1) obj3, (rg5) obj2, j11Var);
                b0Var.c0 = obj;
                return b0Var;
            case 2:
                b0 b0Var2 = new b0(this.Y, j11Var, (vo4) obj3, (CharSequence) obj2);
                b0Var2.c0 = obj;
                return b0Var2;
            case 3:
                b0 b0Var3 = new b0(3, this.Y, j11Var, (ax5) obj3, (k75) obj2);
                b0Var3.c0 = obj;
                return b0Var3;
            case 4:
                return new b0((eo6) this.c0, this.Y, (jo6) obj3, (do6) obj2, j11Var);
            default:
                return new b0(5, this.Y, j11Var, (k24) obj3, (l14) obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0226, code lost:
        if (r8.a(r1, r30) != r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r8.a(r3, r30) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if (new defpackage.vp6(r3.Z, r30, 0).v(r6) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0203, code lost:
        if (((defpackage.c63) r5).Z(r30) == r0) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x014b -> B:74:0x0150). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j, j11 j11Var, vo4 vo4Var, CharSequence charSequence) {
        super(2, j11Var);
        this.X = 2;
        this.d0 = vo4Var;
        this.e0 = charSequence;
        this.Y = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(hv1 hv1Var, rg5 rg5Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 1;
        this.d0 = hv1Var;
        this.e0 = rg5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, long j, j11 j11Var, Object obj, Object obj2) {
        super(2, j11Var);
        this.X = i;
        this.d0 = obj;
        this.Y = j;
        this.e0 = obj2;
    }
}
