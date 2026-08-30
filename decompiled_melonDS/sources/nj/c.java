package nj;

import java.io.File;
import java.util.function.Supplier;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f10450a;

    /* JADX WARN: Type inference failed for: r1v1, types: [nj.b] */
    static {
        char c4 = File.separatorChar;
        System.lineSeparator();
        d.LF.getString();
        d.CRLF.getString();
        final Supplier supplier = new Supplier() { // from class: nj.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (r1) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        f10450a = new ThreadLocal() { // from class: nj.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (r2) {
                    case 0:
                        ((a) supplier).getClass();
                        return new byte[8192];
                    default:
                        ((a) supplier).getClass();
                        return new char[8192];
                }
            }
        };
        final Supplier supplier2 = new Supplier() { // from class: nj.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (r1) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        new ThreadLocal() { // from class: nj.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (r2) {
                    case 0:
                        ((a) supplier2).getClass();
                        return new byte[8192];
                    default:
                        ((a) supplier2).getClass();
                        return new char[8192];
                }
            }
        };
    }
}
