package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h53  reason: default package */
/* loaded from: classes.dex */
public final class h53 implements in6 {
    public final fe5 A;
    public final Inflater B;
    public int L;
    public boolean R;

    public h53(fe5 fe5Var, Inflater inflater) {
        this.A = fe5Var;
        this.B = inflater;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.A.A.b();
    }

    @Override // defpackage.in6
    public final long b0(k80 k80Var, long j) {
        k80Var.getClass();
        do {
            long e = e(k80Var, j);
            if (e > 0) {
                return e;
            }
            Inflater inflater = this.B;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.A.e());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.R) {
            return;
        }
        this.B.end();
        this.R = true;
        this.A.close();
    }

    public final long e(k80 k80Var, long j) {
        Inflater inflater = this.B;
        k80Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.R) {
                if (i != 0) {
                    try {
                        o96 j0 = k80Var.j0(1);
                        int min = (int) Math.min(j, 8192 - j0.c);
                        boolean needsInput = inflater.needsInput();
                        fe5 fe5Var = this.A;
                        if (needsInput && !fe5Var.e()) {
                            o96 o96Var = fe5Var.B.A;
                            o96Var.getClass();
                            int i2 = o96Var.c;
                            int i3 = o96Var.b;
                            int i4 = i2 - i3;
                            this.L = i4;
                            inflater.setInput(o96Var.a, i3, i4);
                        }
                        int inflate = inflater.inflate(j0.a, j0.c, min);
                        int i5 = this.L;
                        if (i5 != 0) {
                            int remaining = i5 - inflater.getRemaining();
                            this.L -= remaining;
                            fe5Var.skip(remaining);
                        }
                        if (inflate > 0) {
                            j0.c += inflate;
                            long j2 = inflate;
                            k80Var.B += j2;
                            return j2;
                        } else if (j0.b == j0.c) {
                            k80Var.A = j0.a();
                            r96.a(j0);
                        }
                    } catch (DataFormatException e) {
                        throw new IOException(e);
                    }
                }
                return 0L;
            }
            i.m("closed");
            return 0L;
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }
}
