package pi;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends Reader {
    public final fj.g A;
    public final Charset B;
    public boolean L;
    public InputStreamReader R;

    public e0(fj.g gVar, Charset charset) {
        gVar.getClass();
        charset.getClass();
        this.A = gVar;
        this.B = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.L = true;
        InputStreamReader inputStreamReader = this.R;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.A.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i2, int i10) {
        cArr.getClass();
        if (!this.L) {
            InputStreamReader inputStreamReader = this.R;
            if (inputStreamReader == null) {
                fj.g gVar = this.A;
                inputStreamReader = new InputStreamReader(gVar.U(), qi.g.e(gVar, this.B));
                this.R = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i2, i10);
        }
        fj.j.h("Stream closed");
        return 0;
    }
}
