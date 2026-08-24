package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez2  reason: default package */
/* loaded from: classes.dex */
public final class ez2 extends cz2 {
    public long X;
    public boolean Y;
    public final /* synthetic */ hz2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez2(hz2 hz2Var, i03 i03Var) {
        super(hz2Var, i03Var);
        i03Var.getClass();
        this.Z = hz2Var;
        this.X = -1L;
        this.Y = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        if (r14 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        defpackage.g04.y(16);
        r1 = java.lang.Integer.toString(r5, 16);
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f0, code lost:
        if (r18.Y == false) goto L70;
     */
    @Override // defpackage.cz2, defpackage.in6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b0(k80 k80Var, long j) {
        long j2;
        hz2 hz2Var = this.Z;
        bt btVar = hz2Var.c;
        k80Var.getClass();
        long j3 = 0;
        if (j >= 0) {
            if (!this.L) {
                if (this.Y) {
                    long j4 = this.X;
                    if (j4 == 0 || j4 == -1) {
                        if (j4 != -1) {
                            ((fe5) btVar.L).y(Long.MAX_VALUE);
                        }
                        try {
                            fe5 fe5Var = (fe5) btVar.L;
                            k80 k80Var2 = fe5Var.B;
                            fe5Var.g0(1L);
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                j2 = j3;
                                if (!fe5Var.T(i2)) {
                                    break;
                                }
                                byte v = k80Var2.v(i);
                                if ((v < 48 || v > 57) && ((v < 97 || v > 102) && (v < 65 || v > 70))) {
                                    break;
                                }
                                i = i2;
                                j3 = j2;
                            }
                            this.X = k80Var2.X();
                            String obj = qs6.T0(((fe5) btVar.L).y(Long.MAX_VALUE)).toString();
                            if (this.X >= j2 && (obj.length() <= 0 || xs6.g0(obj, ";", false))) {
                                if (this.X == j2) {
                                    this.Y = false;
                                    kk kkVar = hz2Var.e;
                                    kkVar.getClass();
                                    ww2 ww2Var = new ww2(0, (byte) 0);
                                    while (true) {
                                        String y = ((z80) kkVar.L).y(kkVar.B);
                                        kkVar.B -= y.length();
                                        if (y.length() == 0) {
                                            break;
                                        }
                                        ww2Var.c(y);
                                    }
                                    e(ww2Var.f());
                                }
                            } else {
                                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.X + obj + '\"');
                            }
                        } catch (NumberFormatException e) {
                            throw new ProtocolException(e.getMessage());
                        }
                    }
                    long b0 = super.b0(k80Var, Math.min(j, this.X));
                    if (b0 != -1) {
                        this.X -= b0;
                        return b0;
                    }
                    hz2Var.b.e();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    e(hz2.f);
                    throw protocolException;
                }
                return -1L;
            }
            i.m("closed");
            return 0L;
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.L) {
            return;
        }
        if (this.Y) {
            TimeZone timeZone = az7.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = az7.g(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.Z.b.e();
                e(hz2.f);
            }
        }
        this.L = true;
    }
}
