package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tg1  reason: default package */
/* loaded from: classes.dex */
public final class tg1 implements ui6 {
    public final /* synthetic */ int A = 1;
    public boolean B;
    public final Object L;
    public final Object R;

    public tg1(hz2 hz2Var) {
        this.R = hz2Var;
        this.L = new lk2(((ee5) hz2Var.c.R).A.b());
    }

    @Override // defpackage.ui6
    public final void O(k80 k80Var, long j) {
        int i = this.A;
        Object obj = this.R;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj;
                hf.D(k80Var.B, 0L, j);
                long j2 = j;
                while (j2 > 0) {
                    o96 o96Var = k80Var.A;
                    o96Var.getClass();
                    int min = (int) Math.min(j2, o96Var.c - o96Var.b);
                    deflater.setInput(o96Var.a, o96Var.b, min);
                    e(false);
                    long j3 = min;
                    k80Var.B -= j3;
                    int i2 = o96Var.b + min;
                    o96Var.b = i2;
                    if (i2 == o96Var.c) {
                        k80Var.A = o96Var.a();
                        r96.a(o96Var);
                    }
                    j2 -= j3;
                }
                deflater.setInput(mb3.C, 0, 0);
                return;
            default:
                if (!this.B) {
                    yy7.a(k80Var.B, 0L, j);
                    ((ee5) ((hz2) obj).c.R).O(k80Var, j);
                    return;
                }
                i.m("closed");
                return;
        }
    }

    @Override // defpackage.ui6
    public final b67 b() {
        switch (this.A) {
            case 0:
                return ((ee5) this.L).A.b();
            default:
                return (lk2) this.L;
        }
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj2;
                if (!this.B) {
                    try {
                        deflater.finish();
                        e(false);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        ((ee5) obj).close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.B = true;
                    if (th == null) {
                        return;
                    }
                    throw th;
                }
                return;
            default:
                hz2 hz2Var = (hz2) obj2;
                if (!this.B) {
                    this.B = true;
                    lk2 lk2Var = (lk2) obj;
                    b67 b67Var = lk2Var.e;
                    lk2Var.e = b67.d;
                    b67Var.a();
                    b67Var.b();
                    hz2Var.d = 3;
                    return;
                }
                return;
        }
    }

    public void e(boolean z) {
        o96 j0;
        int deflate;
        Deflater deflater = (Deflater) this.R;
        ee5 ee5Var = (ee5) this.L;
        k80 k80Var = ee5Var.B;
        while (true) {
            j0 = k80Var.j0(1);
            byte[] bArr = j0.a;
            int i = j0.c;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                j0.c += deflate;
                k80Var.B += deflate;
                ee5Var.e();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (j0.b == j0.c) {
            k80Var.A = j0.a();
            r96.a(j0);
        }
    }

    @Override // defpackage.ui6, java.io.Flushable
    public final void flush() {
        switch (this.A) {
            case 0:
                e(true);
                ((ee5) this.L).flush();
                return;
            default:
                if (!this.B) {
                    ((ee5) ((hz2) this.R).c.R).flush();
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return "DeflaterSink(" + ((ee5) this.L) + ')';
            default:
                return super.toString();
        }
    }

    public tg1(k80 k80Var, Deflater deflater) {
        this.L = new ee5(k80Var);
        this.R = deflater;
    }
}
