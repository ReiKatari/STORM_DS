package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lo  reason: default package */
/* loaded from: classes.dex */
public interface lo {
    boolean a();

    long b();

    wc7 c();

    ap d(long j);

    default boolean e(long j) {
        if (j >= b()) {
            return true;
        }
        return false;
    }

    Object g(long j);

    Object h();
}
