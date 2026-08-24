package defpackage;

import java.io.FileOutputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: up4  reason: default package */
/* loaded from: classes.dex */
public final class up4 implements ui6 {
    public final FileOutputStream A;
    public final b67 B;

    public up4(FileOutputStream fileOutputStream, b67 b67Var) {
        this.A = fileOutputStream;
        this.B = b67Var;
    }

    @Override // defpackage.ui6
    public final void O(k80 k80Var, long j) {
        hf.D(k80Var.B, 0L, j);
        while (j > 0) {
            this.B.f();
            o96 o96Var = k80Var.A;
            o96Var.getClass();
            int min = (int) Math.min(j, o96Var.c - o96Var.b);
            this.A.write(o96Var.a, o96Var.b, min);
            int i = o96Var.b + min;
            o96Var.b = i;
            long j2 = min;
            j -= j2;
            k80Var.B -= j2;
            if (i == o96Var.c) {
                k80Var.A = o96Var.a();
                r96.a(o96Var);
            }
        }
    }

    @Override // defpackage.ui6
    public final b67 b() {
        return this.B;
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // defpackage.ui6, java.io.Flushable
    public final void flush() {
        this.A.flush();
    }

    public final String toString() {
        return "sink(" + this.A + ')';
    }
}
