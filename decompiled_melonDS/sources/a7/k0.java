package a7;

import android.os.Bundle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: b  reason: collision with root package name */
    public static final e f580b = new e(2, false);

    /* renamed from: c  reason: collision with root package name */
    public static final d f581c = new d(4, true);

    /* renamed from: d  reason: collision with root package name */
    public static final d f582d = new d(5, true);

    /* renamed from: e  reason: collision with root package name */
    public static final e f583e = new e(3, false);

    /* renamed from: f  reason: collision with root package name */
    public static final d f584f = new d(6, true);

    /* renamed from: g  reason: collision with root package name */
    public static final d f585g = new d(7, true);

    /* renamed from: h  reason: collision with root package name */
    public static final e f586h = new e(1, false);

    /* renamed from: i  reason: collision with root package name */
    public static final d f587i = new d(2, true);

    /* renamed from: j  reason: collision with root package name */
    public static final d f588j = new d(3, true);

    /* renamed from: k  reason: collision with root package name */
    public static final e f589k = new e(0, false);

    /* renamed from: l  reason: collision with root package name */
    public static final d f590l = new d(0, true);
    public static final d m = new d(1, true);

    /* renamed from: n  reason: collision with root package name */
    public static final e f591n = new e(4, true);

    /* renamed from: o  reason: collision with root package name */
    public static final d f592o = new d(8, true);

    /* renamed from: p  reason: collision with root package name */
    public static final d f593p = new d(9, true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f594a;

    public k0(boolean z10) {
        this.f594a = z10;
    }

    public abstract Object a(Bundle bundle, String str);

    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
