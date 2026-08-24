package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lo  reason: default package */
/* loaded from: classes.dex */
public interface lo {
    boolean a();

    long b();

    defpackage.wc7 c();

    defpackage.ap d(long r1);

    default boolean e(long r3) {
            r2 = this;
            long r0 = r2.b()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    java.lang.Object g(long r1);

    java.lang.Object h();
}
