package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zg6  reason: default package */
/* loaded from: classes.dex */
public abstract class zg6 {
    public defpackage.zg6 a(defpackage.gf6 r1, defpackage.cf6 r2, long r3, long r5, long r7) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Active match can only be configured in ActiveMatchFoundConfigPending or ActiveMatchConfigured state. Current state: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public boolean b() {
            r0 = this;
            boolean r0 = r0 instanceof defpackage.o8
            return r0
    }

    public defpackage.of5 c() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean d() {
            r0 = this;
            r0 = 0
            return r0
    }

    public defpackage.eb e() {
            r0 = this;
            r0 = 0
            return r0
    }

    public defpackage.of5 f(defpackage.gf6 r1) {
            r0 = this;
            of5 r0 = r0.c()
            return r0
    }

    public abstract defpackage.zg6 g(defpackage.cf6 r1);

    public abstract defpackage.zg6 h();

    public void i(defpackage.of5 r1) {
            r0 = this;
            return
    }
}
