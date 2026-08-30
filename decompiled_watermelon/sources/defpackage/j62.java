package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j62  reason: default package */
/* loaded from: classes.dex */
public abstract class j62 implements Closeable {
    public static final d93 A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [d93] */
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
        String str = jk4.B;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        hm1.o(property);
        ClassLoader classLoader = sb5.class.getClassLoader();
        classLoader.getClass();
        new sb5(classLoader);
    }

    public final void B(jk4 jk4Var) {
        jk4Var.getClass();
        x(jk4Var);
    }

    public final boolean C(jk4 jk4Var) {
        jk4Var.getClass();
        if (I(jk4Var) != null) {
            return true;
        }
        return false;
    }

    public abstract List D(jk4 jk4Var);

    public final wd1 F(jk4 jk4Var) {
        jk4Var.getClass();
        wd1 I = I(jk4Var);
        if (I != null) {
            return I;
        }
        f81.v(jk4Var, "no such file: ");
        return null;
    }

    public abstract wd1 I(jk4 jk4Var);

    public abstract c93 J(jk4 jk4Var);

    public abstract g76 K(jk4 jk4Var);

    public abstract sb6 N(jk4 jk4Var);

    public abstract g76 d(jk4 jk4Var);

    public abstract void i(jk4 jk4Var, jk4 jk4Var2);

    public final void p(jk4 jk4Var) {
        xt xtVar = new xt();
        while (jk4Var != null && !C(jk4Var)) {
            xtVar.addFirst(jk4Var);
            jk4Var = jk4Var.b();
        }
        Iterator<E> it = xtVar.iterator();
        while (it.hasNext()) {
            w((jk4) it.next());
        }
    }

    public abstract void w(jk4 jk4Var);

    public abstract void x(jk4 jk4Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
