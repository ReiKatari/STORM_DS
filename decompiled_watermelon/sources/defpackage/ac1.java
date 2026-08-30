package defpackage;

import java.io.InputStream;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ac1  reason: default package */
/* loaded from: classes.dex */
public final class ac1 implements ac0 {
    public long A;
    public final Object B;
    public final Object L;

    public ac1(int i) {
        switch (i) {
            case 1:
                wl3 wl3Var = wl3.c0;
                this.A = 1000000000L;
                this.B = wl3Var;
                this.L = new LinkedHashMap();
                return;
            default:
                q77 q77Var = q77.Lsq2;
                this.B = new s77(false, q77Var);
                this.L = new s77(false, q77Var);
                return;
        }
    }

    @Override // defpackage.ac0
    public im6 a() {
        return (im6) this.L;
    }

    @Override // defpackage.ac0
    public zb0 b() {
        ac0 ac0Var = (ac0) this.B;
        if (ac0Var != null) {
            return ac0Var.b();
        }
        return zb0.UNKNOWN;
    }

    @Override // defpackage.ac0
    public long c() {
        ac0 ac0Var = (ac0) this.B;
        if (ac0Var != null) {
            return ac0Var.c();
        }
        long j = this.A;
        if (j != -1) {
            return j;
        }
        i.n("No timestamp is available.");
        return 0L;
    }

    public void d(long j, long j2) {
        ((s77) this.B).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((s77) this.L).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    @Override // defpackage.ac0
    public wb0 e() {
        ac0 ac0Var = (ac0) this.B;
        if (ac0Var != null) {
            return ac0Var.e();
        }
        return wb0.UNKNOWN;
    }

    @Override // defpackage.ac0
    public yb0 f() {
        ac0 ac0Var = (ac0) this.B;
        if (ac0Var != null) {
            return ac0Var.f();
        }
        return yb0.UNKNOWN;
    }

    @Override // defpackage.ac0
    public xb0 g() {
        ac0 ac0Var = (ac0) this.B;
        if (ac0Var != null) {
            return ac0Var.g();
        }
        return xb0.UNKNOWN;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [yl3, java.lang.Object] */
    public synchronized zl3 h(long j, long j2) {
        xl3 xl3Var = new xl3(j, j2);
        long longValue = ((Number) ((ki2) this.B).c()).longValue();
        yl3 yl3Var = (yl3) ((LinkedHashMap) this.L).get(xl3Var);
        if (yl3Var == null) {
            ?? obj = new Object();
            obj.a = longValue;
            obj.b = 1L;
            obj.c = 0L;
            ((LinkedHashMap) this.L).put(xl3Var, obj);
            return new zl3(1L, 0L, true);
        }
        long j3 = yl3Var.b + 1;
        yl3Var.b = j3;
        long j4 = longValue - yl3Var.a;
        if (j4 >= 0 && j4 < this.A) {
            long j5 = yl3Var.c + 1;
            yl3Var.c = j5;
            return new zl3(j3, j5, false);
        }
        zl3 zl3Var = new zl3(j3, yl3Var.c, true);
        yl3Var.a = longValue;
        yl3Var.c = 0L;
        return zl3Var;
    }

    public byte[] i(int i, int i2) {
        InputStream inputStream = (InputStream) this.B;
        if (i >= 0 && i2 >= 0) {
            long j = i;
            long j2 = this.A;
            if (j >= j2 && i2 + j >= j) {
                byte[] bArr = (byte[]) this.L;
                long j3 = j - j2;
                while (true) {
                    int i3 = 0;
                    if (j3 > 0) {
                        int read = inputStream.read(bArr, 0, (int) Math.min(bArr.length, j3));
                        if (read > 0) {
                            long j4 = read;
                            this.A += j4;
                            j3 -= j4;
                        } else {
                            return null;
                        }
                    } else {
                        byte[] bArr2 = new byte[i2];
                        while (i3 < i2) {
                            int read2 = inputStream.read(bArr2, i3, i2 - i3);
                            if (read2 > 0) {
                                i3 += read2;
                                this.A += read2;
                            } else {
                                return null;
                            }
                        }
                        return bArr2;
                    }
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public synchronized void j(long j, long j2) {
        ((LinkedHashMap) this.L).remove(new xl3(j, j2));
    }

    public synchronized void k() {
        ((LinkedHashMap) this.L).clear();
    }

    public ac1(ac0 ac0Var, im6 im6Var, long j) {
        this.B = ac0Var;
        this.L = im6Var;
        this.A = j;
    }

    public ac1(InputStream inputStream) {
        this.B = inputStream;
        this.L = new byte[8192];
    }
}
