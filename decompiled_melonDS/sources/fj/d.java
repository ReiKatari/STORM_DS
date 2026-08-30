package fj;

import androidx.preference.Preference;
import java.io.InputStream;
import java.io.OutputStream;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends InputStream {
    public final /* synthetic */ int A;
    public final /* synthetic */ g B;

    public /* synthetic */ d(g gVar, int i2) {
        this.A = i2;
        this.B = gVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.A) {
            case 0:
                return (int) Math.min(((e) this.B).B, (long) Preference.DEFAULT_ORDER);
            default:
                a0 a0Var = (a0) this.B;
                if (!a0Var.L) {
                    return (int) Math.min(a0Var.B.B, (long) Preference.DEFAULT_ORDER);
                }
                j.h("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.A) {
            case 0:
                return;
            default:
                ((a0) this.B).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                if (eVar.B > 0) {
                    return eVar.readByte() & 255;
                }
                return -1;
            default:
                a0 a0Var = (a0) this.B;
                e eVar2 = a0Var.B;
                if (!a0Var.L) {
                    if (eVar2.B == 0 && a0Var.A.k(eVar2, 8192L) == -1) {
                        return -1;
                    }
                    return eVar2.readByte() & 255;
                }
                j.h("closed");
                return 0;
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return ((e) this.B) + ".inputStream()";
            default:
                return ((a0) this.B) + ".inputStream()";
        }
    }

    public long transferTo(OutputStream outputStream) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                outputStream.getClass();
                a0 a0Var = (a0) this.B;
                e eVar = a0Var.B;
                if (!a0Var.L) {
                    long j2 = 0;
                    long j10 = 0;
                    while (true) {
                        if (eVar.B != j2 || a0Var.A.k(eVar, 8192L) != -1) {
                            long j11 = eVar.B;
                            j10 += j11;
                            d0.d.K(j11, 0L, j11);
                            b0 b0Var = eVar.A;
                            while (j11 > j2) {
                                b0Var.getClass();
                                int min = (int) Math.min(j11, b0Var.f4978c - b0Var.f4977b);
                                outputStream.write(b0Var.f4976a, b0Var.f4977b, min);
                                int i2 = b0Var.f4977b + min;
                                b0Var.f4977b = i2;
                                long j12 = min;
                                eVar.B -= j12;
                                j11 -= j12;
                                if (i2 == b0Var.f4978c) {
                                    b0 a10 = b0Var.a();
                                    eVar.A = a10;
                                    c0.a(b0Var);
                                    b0Var = a10;
                                }
                                j2 = 0;
                            }
                        } else {
                            return j10;
                        }
                    }
                } else {
                    j.h("closed");
                    return 0L;
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    private final void d() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        int i11 = this.A;
        bArr.getClass();
        switch (i11) {
            case 0:
                return ((e) this.B).read(bArr, i2, i10);
            default:
                a0 a0Var = (a0) this.B;
                e eVar = a0Var.B;
                if (!a0Var.L) {
                    d0.d.K(bArr.length, i2, i10);
                    if (eVar.B == 0 && a0Var.A.k(eVar, 8192L) == -1) {
                        return -1;
                    }
                    return eVar.read(bArr, i2, i10);
                }
                j.h("closed");
                return 0;
        }
    }
}
