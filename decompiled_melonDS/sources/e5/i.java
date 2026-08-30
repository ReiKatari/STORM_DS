package e5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f4338a;

    /* renamed from: d  reason: collision with root package name */
    public d f4341d;

    /* renamed from: e  reason: collision with root package name */
    public d f4342e;

    /* renamed from: f  reason: collision with root package name */
    public d f4343f;

    /* renamed from: g  reason: collision with root package name */
    public d f4344g;

    /* renamed from: h  reason: collision with root package name */
    public int f4345h;

    /* renamed from: i  reason: collision with root package name */
    public int f4346i;

    /* renamed from: j  reason: collision with root package name */
    public int f4347j;

    /* renamed from: k  reason: collision with root package name */
    public int f4348k;

    /* renamed from: q  reason: collision with root package name */
    public int f4353q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ j f4354r;

    /* renamed from: b  reason: collision with root package name */
    public g f4339b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f4340c = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f4349l = 0;
    public int m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f4350n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f4351o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f4352p = 0;

    public i(j jVar, int i2, d dVar, d dVar2, d dVar3, d dVar4, int i10) {
        this.f4354r = jVar;
        this.f4338a = i2;
        this.f4341d = dVar;
        this.f4342e = dVar2;
        this.f4343f = dVar3;
        this.f4344g = dVar4;
        this.f4345h = jVar.f4374z0;
        this.f4346i = jVar.f4370v0;
        this.f4347j = jVar.A0;
        this.f4348k = jVar.f4371w0;
        this.f4353q = i10;
    }

    public final void a(g gVar) {
        int i2 = this.f4338a;
        int i10 = this.f4353q;
        int i11 = 0;
        j jVar = this.f4354r;
        if (i2 == 0) {
            int Y = jVar.Y(gVar, i10);
            if (gVar.T[0] == f.MATCH_CONSTRAINT) {
                this.f4352p++;
                Y = 0;
            }
            int i12 = jVar.S0;
            if (gVar.f4303h0 != 8) {
                i11 = i12;
            }
            this.f4349l = Y + i11 + this.f4349l;
            int X = jVar.X(gVar, this.f4353q);
            if (this.f4339b == null || this.f4340c < X) {
                this.f4339b = gVar;
                this.f4340c = X;
                this.m = X;
            }
        } else {
            int Y2 = jVar.Y(gVar, i10);
            int X2 = jVar.X(gVar, this.f4353q);
            if (gVar.T[1] == f.MATCH_CONSTRAINT) {
                this.f4352p++;
                X2 = 0;
            }
            int i13 = jVar.T0;
            if (gVar.f4303h0 != 8) {
                i11 = i13;
            }
            this.m = X2 + i11 + this.m;
            if (this.f4339b == null || this.f4340c < Y2) {
                this.f4339b = gVar;
                this.f4340c = Y2;
                this.f4349l = Y2;
            }
        }
        this.f4351o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0103, code lost:
        if (r24 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0105, code lost:
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
        if (r24 != false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.i.b(int, boolean, boolean):void");
    }

    public final int c() {
        int i2 = this.f4338a;
        int i10 = this.m;
        if (i2 == 1) {
            return i10 - this.f4354r.T0;
        }
        return i10;
    }

    public final int d() {
        int i2 = this.f4338a;
        int i10 = this.f4349l;
        if (i2 == 0) {
            return i10 - this.f4354r.S0;
        }
        return i10;
    }

    public final void e(int i2) {
        j jVar;
        int i10;
        int i11 = this.f4352p;
        if (i11 != 0) {
            int i12 = this.f4351o;
            int i13 = i2 / i11;
            int i14 = 0;
            while (true) {
                jVar = this.f4354r;
                if (i14 >= i12 || (i10 = this.f4350n + i14) >= jVar.f4359e1) {
                    break;
                }
                g gVar = jVar.f4358d1[i10];
                if (this.f4338a == 0) {
                    if (gVar != null) {
                        f[] fVarArr = gVar.T;
                        if (fVarArr[0] == f.MATCH_CONSTRAINT && gVar.f4320r == 0) {
                            jVar.W(gVar, f.FIXED, i13, fVarArr[1], gVar.l());
                        }
                    }
                } else if (gVar != null) {
                    f[] fVarArr2 = gVar.T;
                    if (fVarArr2[1] == f.MATCH_CONSTRAINT && gVar.f4322s == 0) {
                        int i15 = i13;
                        jVar.W(gVar, fVarArr2[0], gVar.r(), f.FIXED, i15);
                        i13 = i15;
                    }
                }
                i14++;
            }
            this.f4349l = 0;
            this.m = 0;
            this.f4339b = null;
            this.f4340c = 0;
            int i16 = this.f4351o;
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = this.f4350n + i17;
                if (i18 < jVar.f4359e1) {
                    g gVar2 = jVar.f4358d1[i18];
                    if (this.f4338a == 0) {
                        int r5 = gVar2.r();
                        int i19 = jVar.S0;
                        if (gVar2.f4303h0 == 8) {
                            i19 = 0;
                        }
                        this.f4349l = r5 + i19 + this.f4349l;
                        int X = jVar.X(gVar2, this.f4353q);
                        if (this.f4339b == null || this.f4340c < X) {
                            this.f4339b = gVar2;
                            this.f4340c = X;
                            this.m = X;
                        }
                    } else {
                        int Y = jVar.Y(gVar2, this.f4353q);
                        int X2 = jVar.X(gVar2, this.f4353q);
                        int i20 = jVar.T0;
                        if (gVar2.f4303h0 == 8) {
                            i20 = 0;
                        }
                        this.m = X2 + i20 + this.m;
                        if (this.f4339b == null || this.f4340c < Y) {
                            this.f4339b = gVar2;
                            this.f4340c = Y;
                            this.f4349l = Y;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i2, d dVar, d dVar2, d dVar3, d dVar4, int i10, int i11, int i12, int i13, int i14) {
        this.f4338a = i2;
        this.f4341d = dVar;
        this.f4342e = dVar2;
        this.f4343f = dVar3;
        this.f4344g = dVar4;
        this.f4345h = i10;
        this.f4346i = i11;
        this.f4347j = i12;
        this.f4348k = i13;
        this.f4353q = i14;
    }
}
