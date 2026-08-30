package fj;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k implements Closeable {
    public static final t A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fj.t] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        A = r02;
        String str = x.B;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        x8.e.l(property);
        ClassLoader classLoader = gj.h.class.getClassLoader();
        classLoader.getClass();
        new gj.h(classLoader);
    }

    public abstract List B(x xVar);

    public final f5.e F(x xVar) {
        xVar.getClass();
        f5.e G = G(xVar);
        if (G != null) {
            return G;
        }
        j.g(xVar, "no such file: ");
        return null;
    }

    public abstract f5.e G(x xVar);

    public abstract s H(x xVar);

    public abstract e0 I(x xVar);

    public abstract g0 J(x xVar);

    public abstract e0 d(x xVar);

    public abstract void i(x xVar, x xVar2);

    public final void m(x xVar) {
        zb.j jVar = new zb.j();
        while (xVar != null && !z(xVar)) {
            jVar.addFirst(xVar);
            xVar = xVar.b();
        }
        Iterator<E> it = jVar.iterator();
        while (it.hasNext()) {
            t((x) it.next());
        }
    }

    public abstract void t(x xVar);

    public abstract void v(x xVar);

    public final void w(x xVar) {
        xVar.getClass();
        v(xVar);
    }

    public final boolean z(x xVar) {
        xVar.getClass();
        if (G(xVar) != null) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
