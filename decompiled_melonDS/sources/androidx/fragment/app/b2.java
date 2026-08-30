package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
import java.util.Objects;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b2 extends Writer {
    public final /* synthetic */ int A;
    public final StringBuilder B;
    public final CharSequence L;

    public b2() {
        this.A = 0;
        this.B = new StringBuilder(128);
        this.L = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
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
                m();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.A) {
            case 0:
                m();
                return;
            default:
                return;
        }
    }

    public void m() {
        StringBuilder sb2 = this.B;
        if (sb2.length() > 0) {
            Log.d((String) this.L, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i10) {
        switch (this.A) {
            case 0:
                for (int i11 = 0; i11 < i10; i11++) {
                    char c4 = cArr[i2 + i11];
                    if (c4 == '\n') {
                        m();
                    } else {
                        this.B.append(c4);
                    }
                }
                return;
            default:
                wa.t tVar = (wa.t) this.L;
                tVar.A = cArr;
                tVar.B = null;
                this.B.append((CharSequence) tVar, i2, i10 + i2);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i2, int i10) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.append(charSequence, i2, i10);
                return this;
            default:
                return super.append(charSequence, i2, i10);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i2, int i10) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.append(charSequence, i2, i10);
                return this;
            default:
                return super.append(charSequence, i2, i10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    public b2(StringBuilder sb2) {
        this.A = 1;
        this.L = new Object();
        this.B = sb2;
    }

    private final void d() {
    }

    private final void i() {
    }

    @Override // java.io.Writer
    public void write(int i2) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.append((char) i2);
                return;
            default:
                super.write(i2);
                return;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i2, int i10) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                Objects.requireNonNull(str);
                this.B.append((CharSequence) str, i2, i10 + i2);
                return;
            default:
                super.write(str, i2, i10);
                return;
        }
    }
}
