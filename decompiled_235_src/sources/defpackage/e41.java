package defpackage;

import com.google.android.gms.common.server.response.FastParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e41  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e41 implements hr1, kh6 {
    public static /* synthetic */ void A(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void c() {
        throw new RuntimeException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, String str) {
        throw new FastParser.ParseException(str + ((char) i));
    }

    public static /* synthetic */ void e(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is shutting down");
        throw new RejectedExecutionException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new IOException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void m() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void n(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void o(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void q(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void t() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void v(String str) {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void x(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void z(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // defpackage.kh6
    public boolean a() {
        return false;
    }

    @Override // defpackage.hr1
    public float b(float f) {
        return f;
    }
}
