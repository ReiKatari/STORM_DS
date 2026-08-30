package defpackage;

import androidx.preference.Preference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: st2  reason: default package */
/* loaded from: classes.dex */
public final class st2 implements Closeable {
    public static final Logger R;
    public final u60 A;
    public final rt2 B;
    public final us2 L;

    static {
        Logger logger = Logger.getLogger(it2.class.getName());
        logger.getClass();
        R = logger;
    }

    public st2(s45 s45Var) {
        s45Var.getClass();
        this.A = s45Var;
        rt2 rt2Var = new rt2(s45Var);
        this.B = rt2Var;
        this.L = new us2(rt2Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x023c, code lost:
        defpackage.f81.j(defpackage.wh1.g(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0245, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r17, defpackage.j5 r18) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st2.d(boolean, j5):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [f60, java.lang.Object] */
    public final void i(j5 j5Var, int i, int i2, final int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i3 != 0) {
            final boolean z6 = true;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = true;
                z6 = false;
            }
            if ((i2 & 32) == 0) {
                if ((i2 & 8) != 0) {
                    byte readByte = this.A.readByte();
                    byte[] bArr = gk7.a;
                    i4 = readByte & 255;
                } else {
                    i4 = 0;
                }
                final int I = ln2.I(i, i2, i4);
                u60 u60Var = this.A;
                u60Var.getClass();
                final pt2 pt2Var = (pt2) j5Var.L;
                if (i3 != 0 && (i3 & 1) == 0) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                if (z2) {
                    final ?? obj = new Object();
                    long j = I;
                    u60Var.b0(j);
                    u60Var.L(obj, j);
                    en6.b(pt2Var.d0, pt2Var.L + '[' + i3 + "] onData", new ki2(i3, obj, I, z6) { // from class: kt2
                        public final /* synthetic */ int B;
                        public final /* synthetic */ f60 L;
                        public final /* synthetic */ int R;

                        @Override // defpackage.ki2
                        public final Object c() {
                            pt2 pt2Var2 = pt2.this;
                            int i5 = this.B;
                            f60 f60Var = this.L;
                            int i6 = this.R;
                            try {
                                pt2Var2.f0.getClass();
                                f60Var.skip(i6);
                                pt2Var2.r0.C(i5, l12.CANCEL);
                                synchronized (pt2Var2) {
                                    pt2Var2.t0.remove(Integer.valueOf(i5));
                                }
                            } catch (IOException unused) {
                            }
                            return o27.a;
                        }
                    });
                } else {
                    wt2 i5 = pt2Var.i(i3);
                    if (i5 == null) {
                        ((pt2) j5Var.L).C(i3, l12.PROTOCOL_ERROR);
                        long j2 = I;
                        ((pt2) j5Var.L).x(j2);
                        u60Var.skip(j2);
                    } else {
                        TimeZone timeZone = ik7.a;
                        ut2 ut2Var = i5.c0;
                        long j3 = I;
                        ut2Var.getClass();
                        long j4 = j3;
                        while (true) {
                            int i6 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                            wt2 wt2Var = ut2Var.Y;
                            if (i6 > 0) {
                                synchronized (wt2Var) {
                                    z3 = ut2Var.B;
                                    if (ut2Var.R.B + j4 > ut2Var.A) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                if (z4) {
                                    u60Var.skip(j4);
                                    ut2Var.Y.e(l12.FLOW_CONTROL_ERROR);
                                    break;
                                } else if (z3) {
                                    u60Var.skip(j4);
                                    break;
                                } else {
                                    long L = u60Var.L(ut2Var.L, j4);
                                    if (L != -1) {
                                        j4 -= L;
                                        wt2 wt2Var2 = ut2Var.Y;
                                        synchronized (wt2Var2) {
                                            try {
                                                if (ut2Var.X) {
                                                    ut2Var.L.w();
                                                } else {
                                                    f60 f60Var = ut2Var.R;
                                                    if (f60Var.B == 0) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    f60Var.l0(ut2Var.L);
                                                    if (z5) {
                                                        wt2Var2.notifyAll();
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        i.l();
                                        return;
                                    }
                                }
                            } else {
                                TimeZone timeZone2 = ik7.a;
                                wt2Var.B.x(j3);
                                ut2Var.Y.B.k0.getClass();
                                break;
                            }
                        }
                        if (z6) {
                            i5.i(xq2.B, true);
                        }
                    }
                }
                this.A.skip(i4);
                return;
            }
            f81.j("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        f81.j("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final List p(int i, int i2, int i3, int i4) {
        rt2 rt2Var = this.B;
        rt2Var.X = i;
        rt2Var.B = i;
        rt2Var.Y = i2;
        rt2Var.L = i3;
        rt2Var.R = i4;
        us2 us2Var = this.L;
        s45 s45Var = us2Var.c;
        ArrayList arrayList = us2Var.b;
        while (!s45Var.d()) {
            byte readByte = s45Var.readByte();
            byte[] bArr = gk7.a;
            int i5 = readByte & 255;
            if (i5 != 128) {
                if ((readByte & 128) == 128) {
                    int e = us2Var.e(i5, 127);
                    int i6 = e - 1;
                    if (i6 >= 0) {
                        tq2[] tq2VarArr = ws2.a;
                        if (i6 <= tq2VarArr.length - 1) {
                            arrayList.add(tq2VarArr[i6]);
                        }
                    }
                    int length = us2Var.e + 1 + (i6 - ws2.a.length);
                    if (length >= 0) {
                        tq2[] tq2VarArr2 = us2Var.d;
                        if (length < tq2VarArr2.length) {
                            tq2 tq2Var = tq2VarArr2[length];
                            tq2Var.getClass();
                            arrayList.add(tq2Var);
                        }
                    }
                    f81.j(wh1.g(e, "Header index too large "));
                    return null;
                } else if (i5 == 64) {
                    tq2[] tq2VarArr3 = ws2.a;
                    w70 d = us2Var.d();
                    ws2.a(d);
                    us2Var.c(new tq2(d, us2Var.d()));
                } else if ((readByte & 64) == 64) {
                    us2Var.c(new tq2(us2Var.b(us2Var.e(i5, 63) - 1), us2Var.d()));
                } else if ((readByte & 32) == 32) {
                    int e2 = us2Var.e(i5, 31);
                    us2Var.a = e2;
                    if (e2 >= 0 && e2 <= 4096) {
                        int i7 = us2Var.g;
                        if (e2 < i7) {
                            if (e2 == 0) {
                                nu.l0(0, r6.length, null, us2Var.d);
                                us2Var.e = us2Var.d.length - 1;
                                us2Var.f = 0;
                                us2Var.g = 0;
                            } else {
                                us2Var.a(i7 - e2);
                            }
                        }
                    } else {
                        throw new IOException("Invalid dynamic table size update " + us2Var.a);
                    }
                } else if (i5 != 16 && i5 != 0) {
                    arrayList.add(new tq2(us2Var.b(us2Var.e(i5, 15) - 1), us2Var.d()));
                } else {
                    tq2[] tq2VarArr4 = ws2.a;
                    w70 d2 = us2Var.d();
                    ws2.a(d2);
                    arrayList.add(new tq2(d2, us2Var.d()));
                }
            } else {
                f81.j("index == 0");
                return null;
            }
        }
        List n1 = tq0.n1(arrayList);
        arrayList.clear();
        return n1;
    }

    public final void w(j5 j5Var, int i, int i2, int i3) {
        boolean z;
        int i4;
        if (i3 != 0) {
            boolean z2 = false;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 8) != 0) {
                byte readByte = this.A.readByte();
                byte[] bArr = gk7.a;
                i4 = readByte & 255;
            } else {
                i4 = 0;
            }
            if ((i2 & 32) != 0) {
                u60 u60Var = this.A;
                u60Var.readInt();
                u60Var.readByte();
                byte[] bArr2 = gk7.a;
                i -= 5;
            }
            List p = p(ln2.I(i, i2, i4), i4, i2, i3);
            pt2 pt2Var = (pt2) j5Var.L;
            if (i3 != 0 && (i3 & 1) == 0) {
                z2 = true;
            }
            if (z2) {
                en6.b(pt2Var.d0, pt2Var.L + '[' + i3 + "] onHeaders", new lt2(pt2Var, i3, p, z));
                return;
            }
            synchronized (pt2Var) {
                wt2 i5 = pt2Var.i(i3);
                if (i5 == null) {
                    if (pt2Var.Y) {
                        return;
                    }
                    if (i3 <= pt2Var.R) {
                        return;
                    }
                    if (i3 % 2 == pt2Var.X % 2) {
                        return;
                    }
                    wt2 wt2Var = new wt2(i3, pt2Var, false, z, ik7.g(p));
                    pt2Var.R = i3;
                    pt2Var.B.put(Integer.valueOf(i3), wt2Var);
                    en6.b(pt2Var.Z.d(), pt2Var.L + '[' + i3 + "] onStream", new jd2(2, pt2Var, wt2Var));
                    return;
                }
                i5.i(ik7.g(p), z);
                return;
            }
        }
        f81.j("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void x(j5 j5Var, int i, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                byte readByte = this.A.readByte();
                byte[] bArr = gk7.a;
                i4 = readByte & 255;
            } else {
                i4 = 0;
            }
            int readInt = this.A.readInt() & Preference.DEFAULT_ORDER;
            List p = p(ln2.I(i - 4, i2, i4), i4, i2, i3);
            pt2 pt2Var = (pt2) j5Var.L;
            synchronized (pt2Var) {
                if (pt2Var.t0.contains(Integer.valueOf(readInt))) {
                    pt2Var.C(readInt, l12.PROTOCOL_ERROR);
                    return;
                }
                pt2Var.t0.add(Integer.valueOf(readInt));
                en6.b(pt2Var.d0, pt2Var.L + '[' + readInt + "] onRequest", new lt2(pt2Var, readInt, p, 0));
                return;
            }
        }
        f81.j("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
