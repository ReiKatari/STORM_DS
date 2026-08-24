package defpackage;

import java.io.File;
import java.util.function.Supplier;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b13  reason: default package */
/* loaded from: classes.dex */
public abstract class b13 {
    public static final a13 a;

    /* JADX WARN: Type inference failed for: r1v1, types: [a13] */
    static {
        char c = File.separatorChar;
        System.lineSeparator();
        dp6.LF.getString();
        dp6.CRLF.getString();
        final Supplier supplier = new Supplier() { // from class: z03
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
        a = new ThreadLocal() { // from class: a13
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                int i = r2;
                ((z03) supplier).getClass();
                switch (i) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        final Supplier supplier2 = new Supplier() { // from class: z03
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
        new ThreadLocal() { // from class: a13
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                int i = r2;
                ((z03) supplier2).getClass();
                switch (i) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
    }
}
