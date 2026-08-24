package defpackage;

import android.util.Log;
import com.github.junrar.unpack.vm.VMCmdFlags;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ws7  reason: default package */
/* loaded from: classes.dex */
public final class ws7 implements Closeable {
    public final z80 A;
    public final af5 B;
    public final boolean L;
    public final boolean R;
    public boolean X;
    public int Y;
    public long Z;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public final k80 g0;
    public final k80 h0;
    public f54 i0;
    public final byte[] j0;

    /* JADX WARN: Type inference failed for: r1v1, types: [k80, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [k80, java.lang.Object] */
    public ws7(z80 z80Var, af5 af5Var, boolean z, boolean z2) {
        z80Var.getClass();
        this.A = z80Var;
        this.B = af5Var;
        this.L = z;
        this.R = z2;
        this.g0 = new Object();
        this.h0 = new Object();
        this.j0 = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f54 f54Var = this.i0;
        if (f54Var != null) {
            yy7.b(f54Var);
        }
        yy7.b(this.A);
    }

    public final void e() {
        int i;
        k();
        if (this.e0) {
            h();
            return;
        }
        int i2 = this.Y;
        if (i2 != 1 && i2 != 2) {
            TimeZone timeZone = az7.a;
            String hexString = Integer.toHexString(i2);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.X) {
            long j = this.Z;
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            k80 k80Var = this.h0;
            if (i3 > 0) {
                this.A.K(k80Var, j);
            }
            if (!this.d0) {
                while (!this.X) {
                    k();
                    if (!this.e0) {
                        break;
                    }
                    h();
                }
                if (this.Y != 0) {
                    int i4 = this.Y;
                    TimeZone timeZone2 = az7.a;
                    String hexString2 = Integer.toHexString(i4);
                    hexString2.getClass();
                    throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                }
            } else {
                byte[] bArr = null;
                if (this.f0) {
                    f54 f54Var = this.i0;
                    if (f54Var == null) {
                        f54Var = new f54(this.R, 1);
                        this.i0 = f54Var;
                    }
                    k80 k80Var2 = f54Var.L;
                    if (k80Var2.B == 0) {
                        Inflater inflater = (Inflater) f54Var.R;
                        if (inflater == null) {
                            inflater = new Inflater(true);
                            f54Var.R = inflater;
                        }
                        h53 h53Var = (h53) f54Var.X;
                        if (h53Var == null) {
                            h53Var = new h53(new fe5(k80Var2), inflater);
                            f54Var.X = h53Var;
                        }
                        if (f54Var.B) {
                            inflater.reset();
                        }
                        k80Var2.m0(k80Var);
                        k80Var2.q0(65535);
                        long bytesRead = inflater.getBytesRead() + k80Var2.B;
                        do {
                            h53Var.e(k80Var, Long.MAX_VALUE);
                            if (inflater.getBytesRead() >= bytesRead) {
                                break;
                            }
                        } while (!inflater.finished());
                        if (inflater.getBytesRead() < bytesRead) {
                            k80Var2.e();
                            h53Var.close();
                            f54Var.X = null;
                            f54Var.R = null;
                        }
                    } else {
                        i.h("Failed requirement.");
                        return;
                    }
                }
                af5 af5Var = this.B;
                zp3 zp3Var = af5Var.a;
                if (i2 == 1) {
                    if (qs6.j0(k80Var.c0(), "Path:turn.end", false)) {
                        af5Var.b(1000, "Done");
                        byte[] byteArray = ((ByteArrayOutputStream) zp3Var.h).toByteArray();
                        tu0 tu0Var = (tu0) zp3Var.i;
                        byteArray.getClass();
                        if (byteArray.length != 0) {
                            bArr = byteArray;
                        }
                        tu0Var.b0(bArr);
                        return;
                    }
                    return;
                }
                da0 l = k80Var.l(k80Var.B);
                l.getClass();
                try {
                    byte[] r = l.r();
                    if (r.length > 2 && 2 <= (i = (((r[0] & 255) << 8) | (r[1] & 255)) + 2) && i <= r.length) {
                        ((ByteArrayOutputStream) zp3Var.h).write(r, i, r.length - i);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    String message = th.getMessage();
                    Log.w("EdgeNeuralTtsClient", "Error parsing binary audio frame: " + message);
                    return;
                }
            }
        }
        e41.i("closed");
    }

    public final void h() {
        String str;
        short s;
        String g;
        long j = this.Z;
        if (j > 0) {
            this.A.K(this.g0, j);
        }
        switch (this.Y) {
            case 8:
                k80 k80Var = this.g0;
                long j2 = k80Var.B;
                if (j2 != 1) {
                    if (j2 == 0) {
                        str = "";
                        s = 1005;
                    } else {
                        s = k80Var.readShort();
                        str = this.g0.c0();
                        if (s >= 1000 && s < 5000) {
                            if ((1004 <= s && s < 1007) || (1015 <= s && s < 3000)) {
                                g = lb1.k("Code ", s, " is reserved and may not be used.");
                            } else {
                                g = null;
                            }
                        } else {
                            g = lb1.g(s, "Code must be in range [1000,5000): ");
                        }
                        if (g != null) {
                            throw new ProtocolException(g);
                        }
                    }
                    af5 af5Var = this.B;
                    if (s != -1) {
                        synchronized (af5Var) {
                            if (af5Var.s == -1) {
                                af5Var.s = s;
                                af5Var.t = str;
                            } else {
                                throw new IllegalStateException("already closed");
                            }
                        }
                        this.X = true;
                        return;
                    }
                    i.h("Failed requirement.");
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                af5 af5Var2 = this.B;
                k80 k80Var2 = this.g0;
                da0 l = k80Var2.l(k80Var2.B);
                synchronized (af5Var2) {
                    try {
                        l.getClass();
                        if (!af5Var2.u && (!af5Var2.r || !af5Var2.p.isEmpty())) {
                            af5Var2.o.add(l);
                            af5Var2.e();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                af5 af5Var3 = this.B;
                k80 k80Var3 = this.g0;
                da0 l2 = k80Var3.l(k80Var3.B);
                synchronized (af5Var3) {
                    l2.getClass();
                    af5Var3.w = false;
                }
                return;
            default:
                int i = this.Y;
                TimeZone timeZone = az7.a;
                String hexString = Integer.toHexString(i);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void k() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (!this.X) {
            z80 z80Var = this.A;
            long h = z80Var.b().h();
            z80Var.b().b();
            try {
                byte readByte = z80Var.readByte();
                byte[] bArr = yy7.a;
                z80Var.b().g(h, timeUnit);
                int i = readByte & 15;
                this.Y = i;
                boolean z5 = false;
                if ((readByte & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.d0 = z;
                if ((readByte & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.e0 = z2;
                if (z2 && !z) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((readByte & VMCmdFlags.VMCF_CHFLAGS) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i != 1 && i != 2) {
                    if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z3) {
                        if (this.L) {
                            z4 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z4 = false;
                    }
                    this.f0 = z4;
                }
                if ((readByte & VMCmdFlags.VMCF_USEFLAGS) == 0) {
                    if ((readByte & VMCmdFlags.VMCF_PROC) == 0) {
                        byte readByte2 = z80Var.readByte();
                        if ((readByte2 & 128) != 0) {
                            z5 = true;
                        }
                        if (!z5) {
                            long j = readByte2 & Byte.MAX_VALUE;
                            this.Z = j;
                            if (j == 126) {
                                this.Z = z80Var.readShort() & 65535;
                            } else if (j == 127) {
                                long readLong = z80Var.readLong();
                                this.Z = readLong;
                                if (readLong < 0) {
                                    long j2 = this.Z;
                                    TimeZone timeZone = az7.a;
                                    String hexString = Long.toHexString(j2);
                                    hexString.getClass();
                                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.e0 && this.Z > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            }
                            if (z5) {
                                byte[] bArr2 = this.j0;
                                bArr2.getClass();
                                z80Var.readFully(bArr2);
                                return;
                            }
                            return;
                        }
                        throw new ProtocolException("Server-sent frames must not be masked.");
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                z80Var.b().g(h, timeUnit);
                throw th;
            }
        }
        e41.i("closed");
    }
}
