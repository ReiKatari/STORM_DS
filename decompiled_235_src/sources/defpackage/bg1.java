package defpackage;

import java.io.InputStream;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bg1  reason: default package */
/* loaded from: classes.dex */
public final class bg1 implements je0 {
    public long A;
    public final Object B;
    public final Object L;

    public bg1(int i) {
        switch (i) {
            case 1:
                ys3 ys3Var = ys3.d0;
                this.A = 1000000000L;
                this.B = ys3Var;
                this.L = new LinkedHashMap();
                return;
            default:
                pl7 pl7Var = pl7.Lsq2;
                this.B = new rl7(false, pl7Var);
                this.L = new rl7(false, pl7Var);
                return;
        }
    }

    @Override // defpackage.je0
    public sy6 a() {
        return (sy6) this.L;
    }

    @Override // defpackage.je0
    public ie0 b() {
        je0 je0Var = (je0) this.B;
        if (je0Var != null) {
            return je0Var.b();
        }
        return ie0.UNKNOWN;
    }

    @Override // defpackage.je0
    public long c() {
        je0 je0Var = (je0) this.B;
        if (je0Var != null) {
            return je0Var.c();
        }
        long j = this.A;
        if (j != -1) {
            return j;
        }
        i.m("No timestamp is available.");
        return 0L;
    }

    @Override // defpackage.je0
    public he0 d() {
        je0 je0Var = (je0) this.B;
        if (je0Var != null) {
            return je0Var.d();
        }
        return he0.UNKNOWN;
    }

    public void e(long j, long j2) {
        ((rl7) this.B).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((rl7) this.L).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    @Override // defpackage.je0
    public fe0 f() {
        je0 je0Var = (je0) this.B;
        if (je0Var != null) {
            return je0Var.f();
        }
        return fe0.UNKNOWN;
    }

    @Override // defpackage.je0
    public ge0 g() {
        je0 je0Var = (je0) this.B;
        if (je0Var != null) {
            return je0Var.g();
        }
        return ge0.UNKNOWN;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [at3, java.lang.Object] */
    public synchronized bt3 h(long j, long j2) {
        zs3 zs3Var = new zs3(j, j2);
        long longValue = ((Number) ((on2) this.B).c()).longValue();
        at3 at3Var = (at3) ((LinkedHashMap) this.L).get(zs3Var);
        if (at3Var == null) {
            ?? obj = new Object();
            obj.a = longValue;
            obj.b = 1L;
            obj.c = 0L;
            ((LinkedHashMap) this.L).put(zs3Var, obj);
            return new bt3(1L, 0L, true);
        }
        long j3 = at3Var.b + 1;
        at3Var.b = j3;
        long j4 = longValue - at3Var.a;
        if (j4 >= 0 && j4 < this.A) {
            long j5 = at3Var.c + 1;
            at3Var.c = j5;
            return new bt3(j3, j5, false);
        }
        bt3 bt3Var = new bt3(j3, at3Var.c, true);
        at3Var.a = longValue;
        at3Var.c = 0L;
        return bt3Var;
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
        ((LinkedHashMap) this.L).remove(new zs3(j, j2));
    }

    public synchronized void k() {
        ((LinkedHashMap) this.L).clear();
    }

    public bg1(je0 je0Var, sy6 sy6Var, long j) {
        this.B = je0Var;
        this.L = sy6Var;
        this.A = j;
    }

    public bg1(InputStream inputStream) {
        this.B = inputStream;
        this.L = new byte[8192];
    }
}
