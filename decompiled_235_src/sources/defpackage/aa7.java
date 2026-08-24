package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa7  reason: default package */
/* loaded from: classes.dex */
public interface aa7 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        if (nb3.k(obj, a()) && nb3.k(obj2, c())) {
            return true;
        }
        return false;
    }

    Object c();
}
