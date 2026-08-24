package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db2  reason: default package */
/* loaded from: classes.dex */
public abstract class db2 implements Closeable {
    public static final xf3 A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xf3] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r0;
        try {
            Class.forName("java.nio.file.Files");
            r0 = new Object();
        } catch (ClassNotFoundException unused) {
            r0 = new Object();
        }
        A = r0;
        String str = lt4.B;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        w31.p(property);
        ClassLoader classLoader = kl5.class.getClassLoader();
        classLoader.getClass();
        new kl5(classLoader);
    }

    public final ai1 A(lt4 lt4Var) {
        lt4Var.getClass();
        ai1 D = D(lt4Var);
        if (D != null) {
            return D;
        }
        e41.u(lt4Var, "no such file: ");
        return null;
    }

    public abstract ai1 D(lt4 lt4Var);

    public abstract wf3 F(lt4 lt4Var);

    public abstract ui6 J(lt4 lt4Var);

    public abstract in6 N(lt4 lt4Var);

    public abstract ui6 e(lt4 lt4Var);

    public abstract void h(lt4 lt4Var, lt4 lt4Var2);

    public final void k(lt4 lt4Var) {
        pu puVar = new pu();
        while (lt4Var != null && !v(lt4Var)) {
            puVar.addFirst(lt4Var);
            lt4Var = lt4Var.b();
        }
        Iterator<E> it = puVar.iterator();
        while (it.hasNext()) {
            n((lt4) it.next());
        }
    }

    public abstract void n(lt4 lt4Var);

    public abstract void r(lt4 lt4Var);

    public final void u(lt4 lt4Var) {
        lt4Var.getClass();
        r(lt4Var);
    }

    public final boolean v(lt4 lt4Var) {
        lt4Var.getClass();
        if (D(lt4Var) != null) {
            return true;
        }
        return false;
    }

    public abstract List x(lt4 lt4Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
