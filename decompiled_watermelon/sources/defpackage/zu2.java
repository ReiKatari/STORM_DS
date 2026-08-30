package defpackage;

import java.io.File;
import java.util.function.Supplier;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zu2  reason: default package */
/* loaded from: classes.dex */
public abstract class zu2 {
    public static final yu2 a;

    /* JADX WARN: Type inference failed for: r1v1, types: [yu2] */
    static {
        char c = File.separatorChar;
        System.lineSeparator();
        nd6.LF.getString();
        nd6.CRLF.getString();
        final Supplier supplier = new Supplier() { // from class: xu2
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
        a = new ThreadLocal() { // from class: yu2
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                int i = r2;
                ((xu2) supplier).getClass();
                switch (i) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        final Supplier supplier2 = new Supplier() { // from class: xu2
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
        new ThreadLocal() { // from class: yu2
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                int i = r2;
                ((xu2) supplier2).getClass();
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
