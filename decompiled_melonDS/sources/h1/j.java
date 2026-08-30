package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends b3.o implements a4.i, a4.z {

    /* renamed from: i0  reason: collision with root package name */
    public n1 f5914i0;

    /* renamed from: j0  reason: collision with root package name */
    public final p2 f5915j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5916k0;

    /* renamed from: l0  reason: collision with root package name */
    public d f5917l0;

    /* renamed from: m0  reason: collision with root package name */
    public final d2 f5918m0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f5920o0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f5921q0;

    /* renamed from: n0  reason: collision with root package name */
    public final a f5919n0 = new a(0);
    public long p0 = 0;

    public j(n1 n1Var, p2 p2Var, boolean z10, d dVar, d2 d2Var) {
        this.f5914i0 = n1Var;
        this.f5915j0 = p2Var;
        this.f5916k0 = z10;
        this.f5917l0 = dVar;
        this.f5918m0 = d2Var;
    }

    public static final float O0(j jVar, d dVar, long j2) {
        h3.c cVar;
        h3.c cVar2;
        int compare;
        if (!x4.l.b(jVar.p0, 0L)) {
            p2.b bVar = jVar.f5919n0.f5838a;
            int i2 = bVar.L - 1;
            Object[] objArr = bVar.A;
            if (i2 < objArr.length) {
                cVar = null;
                while (true) {
                    if (i2 < 0) {
                        break;
                    }
                    h3.c cVar3 = (h3.c) ((g) objArr[i2]).f5900a.b();
                    if (cVar3 != null) {
                        long c4 = cVar3.c();
                        long T = zb.k.T(jVar.p0);
                        int i10 = h.f5905a[jVar.f5914i0.ordinal()];
                        if (i10 != 1) {
                            if (i10 == 2) {
                                compare = Float.compare(Float.intBitsToFloat((int) (c4 >> 32)), Float.intBitsToFloat((int) (T >> 32)));
                            } else {
                                m9.o.o();
                                return 0.0f;
                            }
                        } else {
                            compare = Float.compare(Float.intBitsToFloat((int) (c4 & 4294967295L)), Float.intBitsToFloat((int) (T & 4294967295L)));
                        }
                        if (compare <= 0) {
                            cVar = cVar3;
                        } else if (cVar == null) {
                            cVar = cVar3;
                        }
                    }
                    i2--;
                }
            } else {
                cVar = null;
            }
            if (cVar == null) {
                if (jVar.f5920o0) {
                    cVar2 = (h3.c) jVar.f5918m0.b();
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    return 0.0f;
                }
                cVar = cVar2;
            }
            long T2 = zb.k.T(jVar.p0);
            int i11 = h.f5905a[jVar.f5914i0.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    float f8 = cVar.f6052a;
                    return dVar.a(f8 - ((int) (j2 >> 32)), cVar.f6054c - f8, Float.intBitsToFloat((int) (T2 >> 32)));
                }
                m9.o.o();
                return 0.0f;
            }
            float f10 = cVar.f6053b;
            return dVar.a(f10 - ((int) (j2 & 4294967295L)), cVar.f6055d - f10, Float.intBitsToFloat((int) (T2 & 4294967295L)));
        }
        return 0.0f;
    }

    public static boolean P0(j jVar, h3.c cVar, long j2, long j10, int i2) {
        if ((i2 & 1) != 0) {
            j2 = jVar.p0;
        }
        long j11 = j2;
        if ((i2 & 2) != 0) {
            j10 = 0;
        }
        long R0 = jVar.R0(cVar, j11, j10);
        if (Math.abs(Float.intBitsToFloat((int) (R0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (R0 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    public final void Q0(long j2) {
        d dVar = this.f5917l0;
        if (dVar == null) {
            dVar = (d) a4.l.h(this, f.f5891a);
        }
        d dVar2 = dVar;
        if (this.f5921q0) {
            k1.b.c("launchAnimation called when previous animation was running");
        }
        d dVar3 = this.f5917l0;
        if (dVar3 == null) {
            dVar3 = (d) a4.l.h(this, f.f5891a);
        }
        dVar3.getClass();
        d.f5884a.getClass();
        zc.x.v(C0(), null, zc.w.UNDISPATCHED, new i(this, new f3(c.f5866b), dVar2, j2, null), 1);
    }

    public final long R0(h3.c cVar, long j2, long j10) {
        long T = zb.k.T(j2);
        int i2 = h.f5905a[this.f5914i0.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                d dVar = this.f5917l0;
                if (dVar == null) {
                    dVar = (d) a4.l.h(this, f.f5891a);
                }
                float f8 = cVar.f6052a;
                return (Float.floatToRawIntBits(dVar.a(f8 - ((int) (j10 >> 32)), cVar.f6054c - f8, Float.intBitsToFloat((int) (T >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            }
            m9.o.o();
            return 0L;
        }
        d dVar2 = this.f5917l0;
        if (dVar2 == null) {
            dVar2 = (d) a4.l.h(this, f.f5891a);
        }
        float f10 = cVar.f6053b;
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(dVar2.a(f10 - ((int) (j10 & 4294967295L)), cVar.f6055d - f10, Float.intBitsToFloat((int) (T & 4294967295L)))) & 4294967295L);
    }

    @Override // a4.z
    public final void o(long j2) {
        int b10;
        long j10;
        long j11;
        long j12;
        long j13 = this.p0;
        this.p0 = j2;
        int i2 = h.f5905a[this.f5914i0.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                b10 = nc.k.b((int) (j2 >> 32), (int) (j13 >> 32));
            } else {
                m9.o.o();
                return;
            }
        } else {
            b10 = nc.k.b((int) (j2 & 4294967295L), (int) (j13 & 4294967295L));
        }
        if (b10 < 0) {
            if (!this.f5916k0) {
                if (this.f5914i0 == n1.Vertical) {
                    j11 = 0 << 32;
                    j12 = ((int) (j13 & 4294967295L)) - ((int) (j2 & 4294967295L));
                } else {
                    j11 = (((int) (j13 >> 32)) - ((int) (j2 >> 32))) << 32;
                    j12 = 0;
                }
                j10 = j11 | (j12 & 4294967295L);
            } else {
                j10 = 0;
            }
            long j14 = j10;
            h3.c cVar = (h3.c) this.f5918m0.b();
            if (cVar != null && !this.f5921q0 && !this.f5920o0 && P0(this, cVar, j13, 0L, 2) && !P0(this, cVar, 0L, j14, 1)) {
                this.f5920o0 = true;
                Q0(j14);
            }
        }
    }
}
