package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jg3  reason: default package */
/* loaded from: classes.dex */
public abstract class jg3 {
    public int a;
    public int b;
    public java.lang.String c;
    public java.util.HashMap d;

    public jg3() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.a = r0
            r1.b = r0
            r0 = 0
            r1.c = r0
            return
    }

    public abstract void a(java.util.HashMap r1);

    public abstract defpackage.jg3 b();

    public defpackage.jg3 c(defpackage.jg3 r2) {
            r1 = this;
            int r0 = r2.a
            r1.a = r0
            int r0 = r2.b
            r1.b = r0
            java.lang.String r0 = r2.c
            r1.c = r0
            java.util.HashMap r2 = r2.d
            r1.d = r2
            return r1
    }

    public abstract void d(java.util.HashSet r1);

    public abstract void e(android.content.Context r1, android.util.AttributeSet r2);

    public void f(java.util.HashMap r1) {
            r0 = this;
            return
    }
}
