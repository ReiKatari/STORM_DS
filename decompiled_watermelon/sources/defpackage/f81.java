package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f81  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f81 implements bn1, x56 {
    public static /* synthetic */ void A(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void c() {
        throw new RuntimeException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void f(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is shutting down");
        throw new RejectedExecutionException(sb.toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void o() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
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

    public static /* synthetic */ void t(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void u(String str) {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void w(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void x(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void z(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // defpackage.x56
    public boolean a() {
        return false;
    }

    @Override // defpackage.bn1
    public float b(float f) {
        return f;
    }
}
