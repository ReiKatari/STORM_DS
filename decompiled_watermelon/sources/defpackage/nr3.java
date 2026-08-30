package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nr3  reason: default package */
/* loaded from: classes.dex */
public final class nr3 extends Writer {
    public final /* synthetic */ int A;
    public final StringBuilder B;
    public final CharSequence L;

    public nr3() {
        this.A = 0;
        this.B = new StringBuilder(128);
        this.L = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.A) {
            case 1:
                this.B.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.A) {
            case 0:
                d();
                return;
            default:
                StringBuilder sb = this.B;
                if (sb instanceof Closeable) {
                    ((Closeable) sb).close();
                    return;
                }
                return;
        }
    }

    public void d() {
        StringBuilder sb = this.B;
        if (sb.length() > 0) {
            Log.d((String) this.L, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.A) {
            case 0:
                d();
                return;
            default:
                StringBuilder sb = this.B;
                if (sb instanceof Flushable) {
                    ((Flushable) sb).flush();
                    return;
                }
                return;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = this.A;
        StringBuilder sb = this.B;
        switch (i3) {
            case 0:
                for (int i4 = 0; i4 < i2; i4++) {
                    char c = cArr[i + i4];
                    if (c == '\n') {
                        d();
                    } else {
                        sb.append(c);
                    }
                }
                return;
            default:
                sg6 sg6Var = (sg6) this.L;
                sg6Var.A = cArr;
                sg6Var.B = null;
                sb.append((CharSequence) sg6Var, i, i2 + i);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        switch (this.A) {
            case 1:
                this.B.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        switch (this.A) {
            case 1:
                this.B.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.A) {
            case 1:
                this.B.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    public nr3(StringBuilder sb) {
        this.A = 1;
        this.L = new Object();
        this.B = sb;
    }

    @Override // java.io.Writer
    public void write(int i) {
        switch (this.A) {
            case 1:
                this.B.append((char) i);
                return;
            default:
                super.write(i);
                return;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        switch (this.A) {
            case 1:
                Objects.requireNonNull(str);
                this.B.append((CharSequence) str, i, i2 + i);
                return;
            default:
                super.write(str, i, i2);
                return;
        }
    }
}
