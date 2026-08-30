package wi;

import androidx.preference.Preference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Logger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements Closeable {
    public static final Logger R;
    public final fj.g A;
    public final s B;
    public final f L;

    static {
        Logger logger = Logger.getLogger(i.class.getName());
        logger.getClass();
        R = logger;
    }

    public t(fj.a0 a0Var) {
        a0Var.getClass();
        this.A = a0Var;
        s sVar = new s(a0Var);
        this.B = sVar;
        this.L = new f(sVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0237, code lost:
        fj.j.h(w.d.l(r7, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0240, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r14, ai.i r15) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.t.d(boolean, ai.i):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [fj.e, java.lang.Object] */
    public final void i(ai.i iVar, int i2, int i10, final int i11) {
        final boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (i11 != 0) {
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 32) == 0) {
                if ((i10 & 8) != 0) {
                    byte readByte = this.A.readByte();
                    byte[] bArr = qi.e.f12548a;
                    i12 = readByte & 255;
                } else {
                    i12 = 0;
                }
                final int a10 = r.a(i2, i10, i12);
                fj.g gVar = this.A;
                gVar.getClass();
                final p pVar = (p) iVar.L;
                if (i11 != 0 && (i11 & 1) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    final ?? obj = new Object();
                    long j2 = a10;
                    gVar.O(j2);
                    gVar.k(obj, j2);
                    si.b.b(pVar.f14260c0, pVar.L + '[' + i11 + "] onData", new mc.a(i11, obj, a10, z10) { // from class: wi.k
                        public final /* synthetic */ int B;
                        public final /* synthetic */ fj.e L;
                        public final /* synthetic */ int R;

                        @Override // mc.a
                        public final Object b() {
                            p pVar2 = p.this;
                            int i13 = this.B;
                            fj.e eVar = this.L;
                            int i14 = this.R;
                            try {
                                pVar2.f14262e0.getClass();
                                eVar.skip(i14);
                                pVar2.f14273q0.z(i13, c.CANCEL);
                                synchronized (pVar2) {
                                    pVar2.f14275s0.remove(Integer.valueOf(i13));
                                }
                            } catch (IOException unused) {
                            }
                            return yb.y.f14813a;
                        }
                    });
                } else {
                    x i13 = pVar.i(i11);
                    if (i13 == null) {
                        ((p) iVar.L).z(i11, c.PROTOCOL_ERROR);
                        long j10 = a10;
                        ((p) iVar.L).v(j10);
                        gVar.skip(j10);
                    } else {
                        TimeZone timeZone = qi.g.f12552a;
                        v vVar = i13.f14285b0;
                        long j11 = a10;
                        vVar.getClass();
                        long j12 = j11;
                        while (true) {
                            int i14 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                            x xVar = vVar.Y;
                            if (i14 > 0) {
                                synchronized (xVar) {
                                    z13 = vVar.B;
                                    z12 = z10;
                                    if (vVar.R.B + j12 > vVar.A) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                }
                                if (z14) {
                                    gVar.skip(j12);
                                    vVar.Y.e(c.FLOW_CONTROL_ERROR);
                                    break;
                                } else if (z13) {
                                    gVar.skip(j12);
                                    break;
                                } else {
                                    long k10 = gVar.k(vVar.L, j12);
                                    if (k10 != -1) {
                                        j12 -= k10;
                                        x xVar2 = vVar.Y;
                                        synchronized (xVar2) {
                                            try {
                                                if (vVar.X) {
                                                    vVar.L.t();
                                                } else {
                                                    fj.e eVar = vVar.R;
                                                    if (eVar.B == 0) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    eVar.d0(vVar.L);
                                                    if (z15) {
                                                        xVar2.notifyAll();
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        z10 = z12;
                                    } else {
                                        a0.j.c();
                                        return;
                                    }
                                }
                            } else {
                                z12 = z10;
                                TimeZone timeZone2 = qi.g.f12552a;
                                xVar.B.v(j11);
                                vVar.Y.B.f14267j0.getClass();
                                break;
                            }
                        }
                        if (z12) {
                            i13.i(pi.q.B, true);
                        }
                    }
                }
                this.A.skip(i12);
                return;
            }
            fj.j.h("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        fj.j.h("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final List m(int i2, int i10, int i11, int i12) {
        s sVar = this.B;
        sVar.X = i2;
        sVar.B = i2;
        sVar.Y = i10;
        sVar.L = i11;
        sVar.R = i12;
        f fVar = this.L;
        fj.a0 a0Var = fVar.f14238c;
        ArrayList arrayList = fVar.f14237b;
        while (!a0Var.d()) {
            byte readByte = a0Var.readByte();
            byte[] bArr = qi.e.f12548a;
            int i13 = readByte & 255;
            if (i13 != 128) {
                if ((readByte & 128) == 128) {
                    int e6 = fVar.e(i13, 127);
                    int i14 = e6 - 1;
                    if (i14 >= 0) {
                        e[] eVarArr = h.f14251a;
                        if (i14 <= eVarArr.length - 1) {
                            arrayList.add(eVarArr[i14]);
                        }
                    }
                    int length = fVar.f14240e + 1 + (i14 - h.f14251a.length);
                    if (length >= 0) {
                        e[] eVarArr2 = fVar.f14239d;
                        if (length < eVarArr2.length) {
                            e eVar = eVarArr2[length];
                            eVar.getClass();
                            arrayList.add(eVar);
                        }
                    }
                    fj.j.h(w.d.l(e6, "Header index too large "));
                    return null;
                } else if (i13 == 64) {
                    e[] eVarArr3 = h.f14251a;
                    fj.h d4 = fVar.d();
                    h.a(d4);
                    fVar.c(new e(d4, fVar.d()));
                } else if ((readByte & 64) == 64) {
                    fVar.c(new e(fVar.b(fVar.e(i13, 63) - 1), fVar.d()));
                } else if ((readByte & 32) == 32) {
                    int e10 = fVar.e(i13, 31);
                    fVar.f14236a = e10;
                    if (e10 >= 0 && e10 <= 4096) {
                        int i15 = fVar.f14242g;
                        if (e10 < i15) {
                            if (e10 == 0) {
                                zb.k.u(fVar.f14239d, null);
                                fVar.f14240e = fVar.f14239d.length - 1;
                                fVar.f14241f = 0;
                                fVar.f14242g = 0;
                            } else {
                                fVar.a(i15 - e10);
                            }
                        }
                    } else {
                        throw new IOException("Invalid dynamic table size update " + fVar.f14236a);
                    }
                } else if (i13 != 16 && i13 != 0) {
                    arrayList.add(new e(fVar.b(fVar.e(i13, 15) - 1), fVar.d()));
                } else {
                    e[] eVarArr4 = h.f14251a;
                    fj.h d10 = fVar.d();
                    h.a(d10);
                    arrayList.add(new e(d10, fVar.d()));
                }
            } else {
                fj.j.h("index == 0");
                return null;
            }
        }
        List p0 = zb.l.p0(arrayList);
        arrayList.clear();
        return p0;
    }

    public final void t(ai.i iVar, int i2, int i10, int i11) {
        boolean z10;
        int i12;
        if (i11 != 0) {
            boolean z11 = false;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 8) != 0) {
                byte readByte = this.A.readByte();
                byte[] bArr = qi.e.f12548a;
                i12 = readByte & 255;
            } else {
                i12 = 0;
            }
            if ((i10 & 32) != 0) {
                fj.g gVar = this.A;
                gVar.readInt();
                gVar.readByte();
                byte[] bArr2 = qi.e.f12548a;
                i2 -= 5;
            }
            List m = m(r.a(i2, i10, i12), i12, i10, i11);
            p pVar = (p) iVar.L;
            if (i11 != 0 && (i11 & 1) == 0) {
                z11 = true;
            }
            if (z11) {
                si.b.b(pVar.f14260c0, pVar.L + '[' + i11 + "] onHeaders", new l(pVar, i11, m, z10));
                return;
            }
            synchronized (pVar) {
                x i13 = pVar.i(i11);
                if (i13 == null) {
                    if (pVar.Y) {
                        return;
                    }
                    if (i11 <= pVar.R) {
                        return;
                    }
                    if (i11 % 2 == pVar.X % 2) {
                        return;
                    }
                    x xVar = new x(i11, pVar, false, z10, qi.g.g(m));
                    pVar.R = i11;
                    pVar.B.put(Integer.valueOf(i11), xVar);
                    si.b.b(pVar.Z.d(), pVar.L + '[' + i11 + "] onStream", new q1.e(11, pVar, xVar));
                    return;
                }
                i13.i(qi.g.g(m), z10);
                return;
            }
        }
        fj.j.h("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void v(ai.i iVar, int i2, int i10, int i11) {
        int i12;
        if (i11 != 0) {
            if ((i10 & 8) != 0) {
                byte readByte = this.A.readByte();
                byte[] bArr = qi.e.f12548a;
                i12 = readByte & 255;
            } else {
                i12 = 0;
            }
            int readInt = this.A.readInt() & Preference.DEFAULT_ORDER;
            List m = m(r.a(i2 - 4, i10, i12), i12, i10, i11);
            p pVar = (p) iVar.L;
            synchronized (pVar) {
                if (pVar.f14275s0.contains(Integer.valueOf(readInt))) {
                    pVar.z(readInt, c.PROTOCOL_ERROR);
                    return;
                }
                pVar.f14275s0.add(Integer.valueOf(readInt));
                si.b.b(pVar.f14260c0, pVar.L + '[' + readInt + "] onRequest", new l(pVar, readInt, m, 0));
                return;
            }
        }
        fj.j.h("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
