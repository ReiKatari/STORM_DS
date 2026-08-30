package e9;

import java.io.Closeable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Closeable {
    public final b A;
    public boolean B;
    public final /* synthetic */ e L;

    public c(e eVar, b bVar) {
        this.L = eVar;
        this.A = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.B) {
            this.B = true;
            e eVar = this.L;
            synchronized (eVar) {
                b bVar = this.A;
                int i2 = bVar.f4425h - 1;
                bVar.f4425h = i2;
                if (i2 == 0 && bVar.f4423f) {
                    vc.f fVar = e.f4427k0;
                    eVar.F(bVar);
                }
            }
        }
    }
}
